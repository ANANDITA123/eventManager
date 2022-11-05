package com.advait.projects.eventManager.apis.entity.response;

import com.advait.projects.eventManager.apis.constant.Status;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventResponse extends BaseResponse implements Serializable, Cloneable {
    private Status status;
    private String eventId;
    private ArrayList<String> sessionIds;
}
