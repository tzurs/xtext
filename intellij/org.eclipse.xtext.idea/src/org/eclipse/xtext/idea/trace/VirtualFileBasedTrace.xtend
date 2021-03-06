/*******************************************************************************
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.idea.trace

import com.intellij.openapi.module.Module
import com.intellij.openapi.roots.ModuleRootManager
import com.intellij.openapi.vfs.VfsUtil
import com.intellij.openapi.vfs.VirtualFile
import java.io.ByteArrayInputStream
import java.io.IOException
import java.io.InputStream
import java.io.Reader
import java.io.StringReader
import org.eclipse.xtend.lib.annotations.Accessors
import org.eclipse.xtext.generator.trace.AbsoluteURI
import org.eclipse.xtext.generator.trace.SourceRelativeURI
import org.eclipse.xtext.generator.trace.internal.AbstractTrace
import org.eclipse.xtext.idea.build.IdeaOutputConfigurationProvider
import org.eclipse.xtext.idea.filesystem.IdeaModuleConfig
import org.eclipse.xtext.idea.resource.VirtualFileURIUtil
import org.eclipse.xtext.util.ITextRegion
import org.eclipse.xtext.util.ITextRegionWithLineInformation
import org.eclipse.xtext.workspace.IProjectConfig

import static extension org.eclipse.xtext.idea.resource.VirtualFileURIUtil.*

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
class VirtualFileBasedTrace extends AbstractTrace implements IIdeaTrace {
	
	VirtualFileInProject localVirtualFile
	IdeaOutputConfigurationProvider outputConfigurationProvider
	Module module
	@Accessors VirtualFile jarRoot
	
	override getLocalURI() {
		return getURIForVirtualFile(localVirtualFile)
	}
	
	def Module getLocalProject() {
		return module
	}
	
	override getLocalStorage() {
		return localVirtualFile
	}
	
	def protected void setLocalStorage(VirtualFileInProject localVirtualFile) {
		this.localVirtualFile = localVirtualFile;
	}
	
	def protected void setModule(Module module) {
		this.module = module
	}

	def protected void setOutputConfigurationProvider(IdeaOutputConfigurationProvider outputConfigurationProvider) {
		this.outputConfigurationProvider = outputConfigurationProvider
	}	
	
	def protected AbsoluteURI getURIForVirtualFile(VirtualFile virtualFile) {
		return new AbsoluteURI(virtualFile.URI)
	}
	
	def protected AbsoluteURI getURIForVirtualFile(VirtualFileInProject virtualFile) {
		return virtualFile.file.URIForVirtualFile
	}
	
	def VirtualFileInProject findVirtualFileInProject(SourceRelativeURI srcRelativeLocation, Module module) {
		val mngr = ModuleRootManager.getInstance(module)
		val sourceRoots = mngr.getSourceRoots(true)
		val path = srcRelativeLocation.URI.path
		for(sourceRoot: sourceRoots) {
			val result = sourceRoot.findFileByRelativePath(path)
			if (result != null) {
				return new VirtualFileInProject(result, module.project)
			}
		}
		return null
	}
	
	override AbsoluteURI resolvePath(SourceRelativeURI path) {
		if (jarRoot != null) {
			val child = jarRoot.findFileByRelativePath(path.toString)
			val uri = VirtualFileURIUtil.getURI(child)
			return new AbsoluteURI(uri)
		} else if (isTraceToTarget && module != null) {
			val outputConfigurations = outputConfigurationProvider.getOutputConfigurations(module)
			val sourceFolders = localProjectConfig.sourceFolders
			for (contentRoot : ModuleRootManager.getInstance(module).contentRoots) {
				for(sourceFolder : sourceFolders) {
					val outputFolder = contentRoot.findFileByRelativePath(outputConfigurations.head.getOutputDirectory(sourceFolder.name))
					if (outputFolder !== null) {
						val file = outputFolder.findFileByRelativePath(path.URI.toString)
						if (file !== null) {
							return new AbsoluteURI(VirtualFileURIUtil.getURI(file))
						}
					}
				}
			}
		}
		return super.resolvePath(path)
	}
	
	override InputStream getContents(SourceRelativeURI uri, IProjectConfig projectConfig) throws IOException {
		return getContents(uri, (projectConfig as IdeaModuleConfig).module);
	}
	
	
	def InputStream getContents(SourceRelativeURI uri, Module project) throws IOException {
		val file = findVirtualFileInProject(uri, project)
		return new ByteArrayInputStream(file.file.contentsToByteArray)
	}
	
	override getContentsAsText(SourceRelativeURI uri, IProjectConfig projectConfig) throws IOException {
		return getContentsAsText(uri, (projectConfig as IdeaModuleConfig).module);
	}
	
	def Reader getContentsAsText(SourceRelativeURI uri, Module project) throws IOException {
		val file = findVirtualFileInProject(uri, project).file
		return new StringReader(VfsUtil.loadText(file))
	}
	
	override protected getLocalContentsAsText(IProjectConfig projectConfig) throws IOException {
		val file = localVirtualFile.file
		return new StringReader(VfsUtil.loadText(file))
	}
	
	override ILocationInVirtualFile getBestAssociatedLocation(ITextRegion region, VirtualFileInProject associatedVirtualFile) {
		val uri = getURIForVirtualFile(associatedVirtualFile);
		return getBestAssociatedLocation(region, uri);
	}

	override Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(ITextRegion localRegion,
			VirtualFileInProject associatedVirtualFile) {
		val uri = getURIForVirtualFile(associatedVirtualFile);
		return getAllAssociatedLocations(localRegion, uri);
	}

	override Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(VirtualFileInProject associatedVirtualFile) {
		val uri = getURIForVirtualFile(associatedVirtualFile);
		return getAllAssociatedLocations(uri);
	}

	override ILocationInVirtualFile getBestAssociatedLocation(ITextRegion region) {
		return super.getBestAssociatedLocation(region) as ILocationInVirtualFile
	}

	override ILocationInVirtualFile createLocationInResource(ITextRegionWithLineInformation region, SourceRelativeURI srcRelativePath) {
		return new LocationInVirtualFile(region.getOffset(), region.getLength(), region.getLineNumber(), region.getEndLineNumber(), srcRelativePath, this);
	}

	override Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(ITextRegion localRegion) {
		return super.getAllAssociatedLocations(localRegion) as Iterable<? extends ILocationInVirtualFile>
	}

	override ILocationInVirtualFile getBestAssociatedLocation(ITextRegion localRegion, AbsoluteURI uri) {
		return super.getBestAssociatedLocation(localRegion, uri) as ILocationInVirtualFile
	}

	override Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(ITextRegion localRegion, AbsoluteURI uri) {
		return super.getAllAssociatedLocations(localRegion, uri) as Iterable<? extends ILocationInVirtualFile>
	}

	override Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(AbsoluteURI uri) {
		return super.getAllAssociatedLocations(uri) as Iterable<? extends ILocationInVirtualFile>
	}

	override IdeaModuleConfig getLocalProjectConfig() {
		return new IdeaModuleConfig(getLocalProject());
	}

	override Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations() {
		return super.getAllAssociatedLocations() as Iterable<? extends ILocationInVirtualFile>
	}

}