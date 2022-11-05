package com.advait.projects.eventManager.apis.controller;

import com.advait.projects.eventManager.apis.constant.CallType;
import com.advait.projects.eventManager.apis.constant.Type;
import com.advait.projects.eventManager.apis.entity.request.EventRequest;
import com.advait.projects.eventManager.apis.entity.request.SearchType;
import com.advait.projects.eventManager.apis.helper.ResponseWrappper;
import com.advait.projects.eventManager.apis.services.Services;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventManagerImpl<T> extends BaseApiController implements EventManagerController{

   private static final Logger logger = LoggerFactory.getLogger(EventManagerImpl.class);

   @Autowired
   Services eventServiceImpl;
   @Autowired
   Services sessionServiceImpl;



    @Override
    public ResponseEntity generate(EventRequest request) {
        request.setCallType(CallType.GENERATE_EVENT);
        ResponseWrappper<T> wrapper = null;
        wrapper = serveRequest(request, sessionServiceImpl::serveRequest);

        if(request.getType().equals(Type.EVENT)) {
                wrapper = serveRequest(request, eventServiceImpl::serveRequest);
            }
            else if(request.getType().equals(Type.SESSION)){
                wrapper = serveRequest(request, sessionServiceImpl::serveRequest);
            }
            if(null == wrapper)
                wrapper = new ResponseWrappper<>(HttpStatus.OK);
            return (ResponseEntity<T>) new ResponseEntity<>(wrapper.getResponse(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity get(SearchType searchType) {
        EventRequest request = new EventRequest();
        request.setType(searchType.getSearchType());
        request.setCallType(CallType.GET_EVENT);
       ResponseWrappper wrappper = serveRequest(request, eventServiceImpl::serveRequest);
       return (ResponseEntity<T>) new ResponseEntity<>(null, HttpStatus.OK);
    }
}
