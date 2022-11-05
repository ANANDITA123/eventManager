package com.advait.projects.eventManager.apis.helper;

import com.advait.projects.eventManager.apis.entity.request.BaseRequest;
import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.exception.ApplicationException;
import com.advait.projects.eventManager.apis.exception.ApplicationExceptionHandler;

@FunctionalInterface
public interface CheckedFuntion<T, K> {
    K apply(BaseRequest request) throws ApplicationException;
}
