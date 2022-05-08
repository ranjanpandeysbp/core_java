package com.mycompany.exceptiondemo.exceptionassignment1;

public class BusinessException1 extends Exception {
    private String errorCode;
    private String errorMessage;

    public BusinessException1(String errorCode, String errorMessage)
    {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }
}
