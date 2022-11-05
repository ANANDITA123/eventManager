package com.advait.projects.eventManager.apis.controller;

import com.advait.projects.eventManager.apis.entity.request.BaseRequest;
import com.advait.projects.eventManager.apis.entity.request.EventRequest;
import com.advait.projects.eventManager.apis.entity.request.SessionRequest;
import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.entity.response.ErrorDto;
import com.advait.projects.eventManager.apis.exception.ApplicationException;
import com.advait.projects.eventManager.apis.exception.Errors;
import com.advait.projects.eventManager.apis.helper.CheckedFuntion;
import com.advait.projects.eventManager.apis.helper.ResponseWrappper;
import com.advait.projects.eventManager.commons.JsonConvertor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;

import java.io.IOException;


public abstract class BaseApiController {

   private static final Logger LOGGER = LoggerFactory.getLogger(BaseApiController.class);

    protected <T>ResponseWrappper serveRequest(BaseRequest request, CheckedFuntion<? extends BaseRequest, T> function) {
        ResponseWrappper wrapper = new ResponseWrappper(HttpStatus.OK);
        BaseResponse response = new BaseResponse();
        String requestType = getRequestType(request);
        boolean isFailed = false;
        String errorCode = "0";
        String errorMessage = null;
        try {
            response = (BaseResponse) function.apply(request);
        } catch (ApplicationException e) {
            errorCode = e.getErrorCode();
            errorMessage = e.getErrorMessage();
            isFailed = true;
        } catch (Exception e) {
            errorCode = Errors.COMMON_ERROR_CODE.getErrorCode();
            errorMessage = e.getMessage();
            isFailed = true;
        } finally {
            if (isFailed) {
                try {
                    LOGGER.info("Failed to process the request {}", JsonConvertor.convertObjectToJson(request));
                } catch (IOException e) {
                    LOGGER.info("Failed to convert JSON to Object {}", request);
                }
                response = prepareFailureResponse(errorCode, errorMessage, request.getClass().getName());
            }
        }
        wrapper.setResponse(response);
        return wrapper;
    }

    private BaseResponse prepareFailureResponse(final String errorCode, final String errorMsg, final String requestType){
        BaseResponse response = new BaseResponse();
        ErrorDto errorDto = new ErrorDto();
        errorDto.setCode(errorCode);
        errorDto.setErrorMessage(errorMsg);
        errorDto.setType(requestType);
        response.setError(errorDto);
        return response;
    }


    private String getRequestType(final BaseRequest request){
        String ApiName = null;
        if(request instanceof EventRequest) ApiName = EventRequest.class.getName();
        if(request instanceof SessionRequest) ApiName = SessionRequest.class.getName();
        return ApiName;
    }

}
