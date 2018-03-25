package com.java.enumcode;

public enum ErrorCode {

	USER_DOES_NOT_EXIST("ER-123","user does not exist"),
	USER_DOES_NOT_EXIST2("ER-124","user does not exist"),
	USER_DOES_NOT_EXIST3("ER-125","user does not exist"),
	USER_DOES_NOT_EXIST4("ER-126","user does not exist"),
	USER_DOES_NOT_EXIST5("ER-127","user does not exist");
	
	
	private String errCode;
	private String errMsg;

	private ErrorCode(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}

	public String errCode() {
		return this.errCode;
	}

	public String errMsg() {
		return this.errMsg;
	}

   public static ErrorCode forName(String errorCode) {
	   ErrorCode errCode = null;
      for (ErrorCode code : values()) {
         if (code.name().equals(errorCode)) {
            return code;
         }
      }
      return errCode;
   }
   
   public void setErrorMessage(String errorMsg) {
	   this.errMsg = errorMsg;
   }

}
