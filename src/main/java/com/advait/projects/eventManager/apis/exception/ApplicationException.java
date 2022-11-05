package com.advait.projects.eventManager.apis.exception;

public class ApplicationException  extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String errorCode;
    private String errorMessage;

    public ApplicationException(Errors error) {
        super();
        this.errorCode = error.getErrorCode();
        this.errorMessage = error.getErrorMessage();
    }

    public ApplicationException() {

    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

}
