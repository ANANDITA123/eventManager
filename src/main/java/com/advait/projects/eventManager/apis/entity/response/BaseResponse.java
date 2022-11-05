package com.advait.projects.eventManager.apis.entity.response;

import com.advait.projects.eventManager.apis.exception.ApplicationException;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class BaseResponse implements BaseBackEndResponse, Serializable {
    @JsonIgnore
    private String sessionId;
    private ErrorDto error;

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public void setError(ErrorDto error) {
        this.error = error;
    }

    public String getSessionId() {
        return sessionId;
    }

    public ErrorDto getError() {
        return error;
    }

    @Override
    public String toString(){
        return "BaseResponse=[sessionId="+sessionId+", error="+error+" ]";
    }
}
