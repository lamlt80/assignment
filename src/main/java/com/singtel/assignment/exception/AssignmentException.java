package com.singtel.assignment.exception;

public class AssignmentException extends RuntimeException {
	private static final long serialVersionUID = 4527980792505457838L;

	private String errorCode;
	private String errorMsg;
	private Throwable cause;

	public AssignmentException(String erroCode, String errorMsg) {
		this.errorCode = erroCode;
		this.errorMsg = errorMsg;
	}

	public AssignmentException(String errorMsg, Throwable cause) {
		super(errorMsg, cause);
		this.errorMsg = errorMsg;
		this.cause = cause;

	}

	public AssignmentException(String erroCode, String errorMsg, Throwable cause) {
		super(errorMsg, cause);
		this.errorCode = erroCode;
		this.errorMsg = errorMsg;
		this.cause = cause;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public Throwable getCause() {
		return cause;
	}

}
