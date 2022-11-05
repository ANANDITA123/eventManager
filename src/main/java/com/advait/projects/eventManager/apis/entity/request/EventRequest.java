package com.advait.projects.eventManager.apis.entity.request;

import com.advait.projects.eventManager.apis.constant.CallType;
import com.advait.projects.eventManager.apis.constant.Type;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventRequest extends  BaseRequest implements Serializable, Cloneable {

    private String title;
    private Type type;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ArrayList<SessionRequest> sessionDetails;
    private CallType callType;
    private String id;
}
