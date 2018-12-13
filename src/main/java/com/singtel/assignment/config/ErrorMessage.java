package com.singtel.assignment.config;

import java.text.MessageFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ErrorMessage {
	
	public static final String ASGMT_ERR_001 = "ASGMT_ERR_001";
	public static final String ASGMT_ERR_002 = "ASGMT_ERR_002";
	
	public static final Map<String, String> errorCodeMsgs = new ConcurrentHashMap<>();
	
	static {
		errorCodeMsgs.put("ASGMT_ERR_001", "Encounter unexpected error on server");
		errorCodeMsgs.put("ASGMT_ERR_002", "Could not find animal with type: {0}");
	}
	
	public static String getErrorMsg(String errorCode, Object ...arguments) {
		return MessageFormat.format(errorCodeMsgs.get(errorCode), arguments);
	}

}
