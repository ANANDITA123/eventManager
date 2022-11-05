package com.advait.projects.eventManager.apis.services;

import com.advait.projects.eventManager.apis.constant.CallType;
import com.advait.projects.eventManager.apis.constant.Status;
import com.advait.projects.eventManager.apis.entity.request.BaseRequest;
import com.advait.projects.eventManager.apis.entity.request.EventRequest;
import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.entity.response.EventDetailResponse;
import com.advait.projects.eventManager.apis.entity.response.EventResponse;
import com.advait.projects.eventManager.apis.exception.ApplicationException;
import com.advait.projects.eventManager.apis.exception.Errors;
import com.advait.projects.eventManager.apis.repository.Repository;
import com.advait.projects.eventManager.apis.services.response.mapper.CommonManagerService;
import com.advait.projects.eventManager.model.Events;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventServiceImpl extends CommonManagerService {
    @Autowired
    Repository repo;
    @Override
    public BaseResponse serveRequest(BaseRequest request) throws ApplicationException {
        EventRequest eventRequest = (EventRequest) request;
        if(eventRequest.getCallType().equals(CallType.GENERATE_EVENT)){
           return generate(eventRequest);
        }
        if(eventRequest.getCallType().equals(CallType.GET_EVENT)){
            return get(eventRequest);
        }
        throw new ApplicationException(Errors.INVALID_REQUEST);
    }

    private EventResponse generate(EventRequest eventRequest){
        Events resp =  new Events();
        resp.setTitle(eventRequest.getTitle().toString());
        if(null != eventRequest.getSessionDetails()) {
            resp.setSessionDetails(eventRequest.getSessionDetails());
        }
        resp.setEventId(eventRequest.getId());
        resp.setStartDate(eventRequest.getStartDate().toString());
        resp.setEndDate(eventRequest.getEndDate().toString());
        repo.save(resp);
        EventResponse response = new EventResponse();
        response.setEventId(eventRequest.getId());
        response.setStatus(Status.SUCCESS);
        return response;
    }

    private EventDetailResponse get(EventRequest eventRequest){
        EventDetailResponse resp = (EventDetailResponse) repo.findAll();
        return resp;
    }

    private EventResponse remove(EventRequest eventRequest){
        Events events = new Events();
        events.setEventId(eventRequest.getId());
        repo.deleteById(events.getEventId());

        EventResponse response = new EventResponse();
        response.setEventId(eventRequest.getId());
        response.setStatus(Status.DELETED);
        return response;
    }
}
