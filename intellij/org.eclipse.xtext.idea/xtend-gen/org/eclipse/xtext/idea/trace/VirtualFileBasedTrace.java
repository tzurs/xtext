/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.idea.trace;

import com.google.common.base.Objects;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.roots.ModuleRootManager;
import com.intellij.openapi.vfs.VfsUtil;
import com.intellij.openapi.vfs.VirtualFile;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.StringReader;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtend.lib.annotations.Accessors;
import org.eclipse.xtext.generator.OutputConfiguration;
import org.eclipse.xtext.generator.trace.AbsoluteURI;
import org.eclipse.xtext.generator.trace.ILocationInResource;
import org.eclipse.xtext.generator.trace.SourceRelativeURI;
import org.eclipse.xtext.generator.trace.internal.AbstractTrace;
import org.eclipse.xtext.idea.build.IdeaOutputConfigurationProvider;
import org.eclipse.xtext.idea.filesystem.IdeaModuleConfig;
import org.eclipse.xtext.idea.resource.VirtualFileURIUtil;
import org.eclipse.xtext.idea.trace.IIdeaTrace;
import org.eclipse.xtext.idea.trace.ILocationInVirtualFile;
import org.eclipse.xtext.idea.trace.LocationInVirtualFile;
import org.eclipse.xtext.idea.trace.VirtualFileInProject;
import org.eclipse.xtext.util.ITextRegion;
import org.eclipse.xtext.util.ITextRegionWithLineInformation;
import org.eclipse.xtext.workspace.IProjectConfig;
import org.eclipse.xtext.workspace.ISourceFolder;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Pure;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class VirtualFileBasedTrace extends AbstractTrace implements IIdeaTrace {
  private VirtualFileInProject localVirtualFile;
  
  private IdeaOutputConfigurationProvider outputConfigurationProvider;
  
  private Module module;
  
  @Accessors
  private VirtualFile jarRoot;
  
  @Override
  public AbsoluteURI getLocalURI() {
    return this.getURIForVirtualFile(this.localVirtualFile);
  }
  
  public Module getLocalProject() {
    return this.module;
  }
  
  @Override
  public VirtualFileInProject getLocalStorage() {
    return this.localVirtualFile;
  }
  
  protected void setLocalStorage(final VirtualFileInProject localVirtualFile) {
    this.localVirtualFile = localVirtualFile;
  }
  
  protected void setModule(final Module module) {
    this.module = module;
  }
  
  protected void setOutputConfigurationProvider(final IdeaOutputConfigurationProvider outputConfigurationProvider) {
    this.outputConfigurationProvider = outputConfigurationProvider;
  }
  
  protected AbsoluteURI getURIForVirtualFile(final VirtualFile virtualFile) {
    URI _uRI = VirtualFileURIUtil.getURI(virtualFile);
    return new AbsoluteURI(_uRI);
  }
  
  protected AbsoluteURI getURIForVirtualFile(final VirtualFileInProject virtualFile) {
    VirtualFile _file = virtualFile.getFile();
    return this.getURIForVirtualFile(_file);
  }
  
  public VirtualFileInProject findVirtualFileInProject(final SourceRelativeURI srcRelativeLocation, final Module module) {
    final ModuleRootManager mngr = ModuleRootManager.getInstance(module);
    final VirtualFile[] sourceRoots = mngr.getSourceRoots(true);
    URI _uRI = srcRelativeLocation.getURI();
    final String path = _uRI.path();
    for (final VirtualFile sourceRoot : sourceRoots) {
      {
        final VirtualFile result = sourceRoot.findFileByRelativePath(path);
        boolean _notEquals = (!Objects.equal(result, null));
        if (_notEquals) {
          Project _project = module.getProject();
          return new VirtualFileInProject(result, _project);
        }
      }
    }
    final String path2 = ("xtend-gen/" + path);
    for (final VirtualFile sourceRoot_1 : sourceRoots) {
      {
        final VirtualFile result = sourceRoot_1.findFileByRelativePath(path2);
        boolean _notEquals = (!Objects.equal(result, null));
        if (_notEquals) {
          Project _project = module.getProject();
          return new VirtualFileInProject(result, _project);
        }
      }
    }
    return null;
  }
  
  @Override
  public AbsoluteURI resolvePath(final SourceRelativeURI path) {
    boolean _notEquals = (!Objects.equal(this.jarRoot, null));
    if (_notEquals) {
      String _string = path.toString();
      final VirtualFile child = this.jarRoot.findFileByRelativePath(_string);
      final URI uri = VirtualFileURIUtil.getURI(child);
      return new AbsoluteURI(uri);
    } else {
      boolean _and = false;
      boolean _isTraceToTarget = this.isTraceToTarget();
      if (!_isTraceToTarget) {
        _and = false;
      } else {
        boolean _notEquals_1 = (!Objects.equal(this.module, null));
        _and = _notEquals_1;
      }
      if (_and) {
        final Set<OutputConfiguration> outputConfigurations = this.outputConfigurationProvider.getOutputConfigurations(this.module);
        IdeaModuleConfig _localProjectConfig = this.getLocalProjectConfig();
        final Set<? extends ISourceFolder> sourceFolders = _localProjectConfig.getSourceFolders();
        ModuleRootManager _instance = ModuleRootManager.getInstance(this.module);
        VirtualFile[] _contentRoots = _instance.getContentRoots();
        for (final VirtualFile contentRoot : _contentRoots) {
          for (final ISourceFolder sourceFolder : sourceFolders) {
            {
              OutputConfiguration _head = IterableExtensions.<OutputConfiguration>head(outputConfigurations);
              String _name = sourceFolder.getName();
              String _outputDirectory = _head.getOutputDirectory(_name);
              final VirtualFile outputFolder = contentRoot.findFileByRelativePath(_outputDirectory);
              if ((outputFolder != null)) {
                URI _uRI = path.getURI();
                String _string_1 = _uRI.toString();
                final VirtualFile file = outputFolder.findFileByRelativePath(_string_1);
                if ((file != null)) {
                  URI _uRI_1 = VirtualFileURIUtil.getURI(file);
                  return new AbsoluteURI(_uRI_1);
                }
              }
            }
          }
        }
      }
    }
    return super.resolvePath(path);
  }
  
  @Override
  public InputStream getContents(final SourceRelativeURI uri, final IProjectConfig projectConfig) throws IOException {
    Module _module = ((IdeaModuleConfig) projectConfig).getModule();
    return this.getContents(uri, _module);
  }
  
  public InputStream getContents(final SourceRelativeURI uri, final Module project) throws IOException {
    final VirtualFileInProject file = this.findVirtualFileInProject(uri, project);
    VirtualFile _file = file.getFile();
    byte[] _contentsToByteArray = _file.contentsToByteArray();
    return new ByteArrayInputStream(_contentsToByteArray);
  }
  
  @Override
  public Reader getContentsAsText(final SourceRelativeURI uri, final IProjectConfig projectConfig) throws IOException {
    Module _module = ((IdeaModuleConfig) projectConfig).getModule();
    return this.getContentsAsText(uri, _module);
  }
  
  public Reader getContentsAsText(final SourceRelativeURI uri, final Module project) throws IOException {
    VirtualFileInProject fileInProject = this.findVirtualFileInProject(uri, project);
    boolean _equals = Objects.equal(fileInProject, null);
    if (_equals) {
      URI _uRI = uri.getURI();
      String _string = _uRI.toString();
      String _plus = ("xtend-gen/" + _string);
      SourceRelativeURI _sourceRelativeURI = new SourceRelativeURI(_plus);
      VirtualFileInProject _findVirtualFileInProject = this.findVirtualFileInProject(_sourceRelativeURI, project);
      fileInProject = _findVirtualFileInProject;
    }
    if ((fileInProject == null)) {
      String _name = project.getName();
      String _plus_1 = ("\'" + _name);
      String _plus_2 = (_plus_1 + "\' (");
      String _moduleFilePath = project.getModuleFilePath();
      String _plus_3 = (_plus_2 + _moduleFilePath);
      final String module = (_plus_3 + ")");
      throw new FileNotFoundException(((("File \'" + uri) + "\' not found in module ") + module));
    }
    final VirtualFile file = fileInProject.getFile();
    String _loadText = VfsUtil.loadText(file);
    return new StringReader(_loadText);
  }
  
  @Override
  protected Reader getLocalContentsAsText(final IProjectConfig projectConfig) throws IOException {
    final VirtualFile file = this.localVirtualFile.getFile();
    String _loadText = VfsUtil.loadText(file);
    return new StringReader(_loadText);
  }
  
  @Override
  public ILocationInVirtualFile getBestAssociatedLocation(final ITextRegion region, final VirtualFileInProject associatedVirtualFile) {
    final AbsoluteURI uri = this.getURIForVirtualFile(associatedVirtualFile);
    return this.getBestAssociatedLocation(region, uri);
  }
  
  @Override
  public Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(final ITextRegion localRegion, final VirtualFileInProject associatedVirtualFile) {
    final AbsoluteURI uri = this.getURIForVirtualFile(associatedVirtualFile);
    return this.getAllAssociatedLocations(localRegion, uri);
  }
  
  @Override
  public Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(final VirtualFileInProject associatedVirtualFile) {
    final AbsoluteURI uri = this.getURIForVirtualFile(associatedVirtualFile);
    return this.getAllAssociatedLocations(uri);
  }
  
  @Override
  public ILocationInVirtualFile getBestAssociatedLocation(final ITextRegion region) {
    ILocationInResource _bestAssociatedLocation = super.getBestAssociatedLocation(region);
    return ((ILocationInVirtualFile) _bestAssociatedLocation);
  }
  
  @Override
  public ILocationInVirtualFile createLocationInResource(final ITextRegionWithLineInformation region, final SourceRelativeURI srcRelativePath) {
    int _offset = region.getOffset();
    int _length = region.getLength();
    int _lineNumber = region.getLineNumber();
    int _endLineNumber = region.getEndLineNumber();
    return new LocationInVirtualFile(_offset, _length, _lineNumber, _endLineNumber, srcRelativePath, this);
  }
  
  @Override
  public Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(final ITextRegion localRegion) {
    Iterable<? extends ILocationInResource> _allAssociatedLocations = super.getAllAssociatedLocations(localRegion);
    return ((Iterable<? extends ILocationInVirtualFile>) _allAssociatedLocations);
  }
  
  @Override
  public ILocationInVirtualFile getBestAssociatedLocation(final ITextRegion localRegion, final AbsoluteURI uri) {
    ILocationInResource _bestAssociatedLocation = super.getBestAssociatedLocation(localRegion, uri);
    return ((ILocationInVirtualFile) _bestAssociatedLocation);
  }
  
  @Override
  public Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(final ITextRegion localRegion, final AbsoluteURI uri) {
    Iterable<? extends ILocationInResource> _allAssociatedLocations = super.getAllAssociatedLocations(localRegion, uri);
    return ((Iterable<? extends ILocationInVirtualFile>) _allAssociatedLocations);
  }
  
  @Override
  public Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations(final AbsoluteURI uri) {
    Iterable<? extends ILocationInResource> _allAssociatedLocations = super.getAllAssociatedLocations(uri);
    return ((Iterable<? extends ILocationInVirtualFile>) _allAssociatedLocations);
  }
  
  @Override
  public IdeaModuleConfig getLocalProjectConfig() {
    Module _localProject = this.getLocalProject();
    return new IdeaModuleConfig(_localProject);
  }
  
  @Override
  public Iterable<? extends ILocationInVirtualFile> getAllAssociatedLocations() {
    Iterable<? extends ILocationInResource> _allAssociatedLocations = super.getAllAssociatedLocations();
    return ((Iterable<? extends ILocationInVirtualFile>) _allAssociatedLocations);
  }
  
  @Pure
  public VirtualFile getJarRoot() {
    return this.jarRoot;
  }
  
  public void setJarRoot(final VirtualFile jarRoot) {
    this.jarRoot = jarRoot;
  }
}
