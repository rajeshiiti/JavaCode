package com.java.enumcode;

public class ReadAllEnum {
	public static void main(String[] args) {
		for(ErrorCode errorCode : ErrorCode.values()) {
			System.out.println(errorCode.errCode()+" "+errorCode.errMsg());
			errorCode.setErrorMessage("testing set errorMessage");
		}
		
		/*for(ErrorCode errorCode : ErrorCode.values()) {
			System.out.println(errorCode.errCode()+" "+errorCode.errMsg());
			errorCode.setErrorMessage("testing set errorMessage");
		}*/
	}

}
