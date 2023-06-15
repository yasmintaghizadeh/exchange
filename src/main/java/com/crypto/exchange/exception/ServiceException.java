package com.crypto.exchange.exception;

public class ServiceException extends Exception{
    private final String errorcode;

    public ServiceException(String errorcode) {
        super();
        this.errorcode = errorcode;
    }

    public ServiceException(String message, String errorcode) {
        super(message);
        this.errorcode = errorcode;
    }

    public ServiceException(String message, Throwable cause, String errorcode) {
        super(message, cause);
        this.errorcode = errorcode;
    }

    public ServiceException(Throwable cause, String errorcode) {
        super(cause);
        this.errorcode = errorcode;
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, String errorcode) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.errorcode = errorcode;
    }




}
