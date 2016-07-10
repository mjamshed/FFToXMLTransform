package com.e2open.handler;

import com.e2open.common.FlatFileToXmlConfig;

public class ExceptionHandler {

	public ExceptionHandler() {
		//exceptionMsg = getExceptionMsg();
		//errorCode = getErrorCode();
	}

	public void exceptionHandling(Exception e) throws Exception {
		throw e;
	}

	/*	public void setExceptionMsg(String exceptionMsg) {
			this.exceptionMsg = exceptionMsg;
		}
	
		public String getExceptionMsg() {
			return exceptionMsg;
		}
	
		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}
	
		public String getErrorCode() {
			return errorCode;
		}
	*/
}
