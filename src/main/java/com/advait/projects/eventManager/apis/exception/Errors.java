package com.advait.projects.eventManager.apis.exception;

public enum Errors {
    VALIDATION_ERROR("EV-001", "Validation error"),
    INCORRECT_INPUT("EV-002", "Please check the input you have provided"),
    COMMON_ERROR_CODE("EV-000", "Unhandled Exception"),
    INVALID_REQUEST("EV-400", "No Implementation Available For The Given Inputset");

    private final String errorCode;
    private final String errorMessage;
    Errors(final String errorCode, final String errorMessage) {
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
