package com.advait.projects.eventManager.apis.entity.response;

import com.advait.projects.eventManager.model.Events;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDetailResponse extends BaseResponse implements Serializable, Cloneable {
    private List<Events> eventDetails;
}
