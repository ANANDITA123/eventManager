package com.advait.projects.eventManager.apis.helper;

import org.springframework.http.HttpStatus;

public class ResponseWrappper <T> {
    private T response;
    private HttpStatus httpStatus;

    public ResponseWrappper(HttpStatus status){ httpStatus = status;}

    public T getResponse(){ return response;}

    public HttpStatus getHttpStatus(){ return httpStatus;}

    public  void setResponse(T response){
        this.response = response;
    }

    public  void setHttpStatus(HttpStatus httpStatus){
        this.httpStatus = httpStatus;
    }


    @Override
    public String toString(){ return "ResponseWrapper [response="+response+", htttpStatus="+httpStatus+"]";}
}
