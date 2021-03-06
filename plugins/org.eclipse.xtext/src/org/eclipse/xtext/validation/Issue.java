/*******************************************************************************
 * Copyright (c) 2009 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.eclipse.xtext.validation;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.diagnostics.Severity;

/**
 * @author Sven Efftinge - Initial contribution and API
 */
public interface Issue {

	String CODE_KEY = "CODE_KEY";
	String URI_KEY = "URI_KEY";
	String DATA_KEY = "DATA_KEY";
	
	Severity getSeverity();

	String getMessage();

	String getCode();

	CheckType getType();

	URI getUriToProblem();

	Integer getLineNumber();

	Integer getOffset();

	Integer getLength();

	boolean isSyntaxError();

	/**
	 * @return the associated user data. May be <code>null</code> or empty but may not contain <code>null</code> entries.
	 */
	String[] getData();
	
	static class IssueImpl implements Issue {
		
		private static Logger LOG = Logger.getLogger(IssueImpl.class);

		private Integer length, lineNumber, offset;
		private String code, message;
		private boolean isSyntaxError = false;
		private URI uriToProblem;
		private Severity severity;
		private CheckType type;
		private String[] data;

		@Override
		public Integer getLength() {
			return length;
		}

		public void setLength(Integer length) {
			if(length == null || length < 0) {
				LOG.error("Issue length was "+length);
				this.length = 0;
			} else {
				this.length = length;
			}
		}

		@Override
		public Integer getLineNumber() {
			return lineNumber;
		}

		public void setLineNumber(Integer lineNumber) {
			this.lineNumber = lineNumber;
		}

		@Override
		public Integer getOffset() {
			return offset;
		}

		public void setOffset(Integer offset) {
			this.offset = offset;
		}

		@Override
		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		@Override
		public URI getUriToProblem() {
			return uriToProblem;
		}

		public void setUriToProblem(URI uriToProblem) {
			this.uriToProblem = uriToProblem;
		}

		@Override
		public Severity getSeverity() {
			return severity == null ? Severity.ERROR : severity;
		}

		public void setSeverity(Severity severity) {
			this.severity = severity;
		}

		@Override
		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		@Override
		public String[] getData() {
			return data;
		}

		public void setData(String[] data) {
			this.data = data;
		}

		@Override
		public CheckType getType() {
			return type;
		}

		public void setType(CheckType type) {
			this.type = type;
		}

		public void setSyntaxError(boolean isSyntaxError) {
			this.isSyntaxError = isSyntaxError;
		}

		@Override
		public boolean isSyntaxError() {
			return isSyntaxError;
		}

		@Override
		public String toString() {
			StringBuffer buffer = new StringBuffer(getSeverity().name());
			buffer.append(":").append(getMessage());
			buffer.append(" (");
			if (getUriToProblem() != null)
				buffer.append(getUriToProblem().trimFragment());
			buffer.append(" line : ").append(getLineNumber()).append(")");
			return buffer.toString();
		}
	}
}
