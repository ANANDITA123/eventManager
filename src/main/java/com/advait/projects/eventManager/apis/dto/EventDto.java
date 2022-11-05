package com.advait.projects.eventManager.apis.dto;

import com.advait.projects.eventManager.apis.constant.CallType;
import com.advait.projects.eventManager.apis.constant.Type;
import com.advait.projects.eventManager.apis.entity.request.SessionRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.ArrayList;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class EventDto {
    private String eventId;
    private String title;
    private Type type;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private ArrayList<SessionRequest> sessionDetails;
    private CallType callType;
}
