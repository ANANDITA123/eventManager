package com.advait.projects.eventManager.apis.services;

import com.advait.projects.eventManager.apis.entity.request.BaseRequest;
import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.exception.ApplicationException;

@FunctionalInterface
public interface Services {

    BaseResponse serveRequest(BaseRequest request) throws ApplicationException;
}
