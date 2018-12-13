package com.singtel.assignment.restful.model;

import java.io.Serializable;

public class AnimalResponse<T> implements Serializable {

	private static final long serialVersionUID = 4303549137212487504L;

	private String errorCode;
	private String errorMsg;
	private T data;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
