package com.advait.projects.eventManager.apis.services;

import com.advait.projects.eventManager.apis.entity.request.BaseRequest;
import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.services.response.mapper.CommonManagerService;
import org.springframework.stereotype.Service;
@Service
public class HealthCheckServiceImpl extends CommonManagerService {
    @Override
    public BaseResponse serveRequest(BaseRequest request) {
        return null;
    }
}
