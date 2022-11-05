package com.advait.projects.eventManager.apis.services.response.mapper;

import com.advait.projects.eventManager.apis.entity.response.BaseResponse;
import com.advait.projects.eventManager.apis.entity.response.EventResponse;
import com.advait.projects.eventManager.apis.entity.response.SessionResponse;

public class ResponseTypeMapper {

    public Object mapResponse(BaseResponse baseResponse){
        Object mappedRes = null;
        try{
            if(baseResponse instanceof EventResponse) {
                mappedRes = EventResponse.class;
            }
            if(baseResponse instanceof SessionResponse){
                mappedRes = SessionResponse.class;
            }else{
                mappedRes = baseResponse;
            }
        }catch(Exception e){
                e.printStackTrace();
            }
        return mappedRes;
    }
}
