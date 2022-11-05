package com.advait.projects.eventManager.apis.services;

import com.advait.projects.eventManager.apis.entity.request.BaseRequest;
import com.advait.projects.eventManager.apis.entity.request.SessionRequest;
import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.entity.response.SessionResponse;
import com.advait.projects.eventManager.apis.exception.ApplicationException;
import com.advait.projects.eventManager.apis.services.response.mapper.CommonManagerService;
import org.springframework.stereotype.Service;

@Service
public class SessionServiceImpl extends CommonManagerService {
    @Override
    public BaseResponse serveRequest(BaseRequest request) throws ApplicationException {
        SessionRequest session = (SessionRequest) request;
        return mappSessionsToEvent(session);
    }

    private SessionResponse mappSessionsToEvent(SessionRequest sessionReq){
        return new SessionResponse();
    }

}
