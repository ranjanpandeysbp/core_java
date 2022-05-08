package com.mycompany.exceptiondemo.exceptionassignment;

public class BusinessException extends Exception {
    private String errorCode;
    private String errorMessage;

    public BusinessException (String errorCode,String errorMessage)
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
