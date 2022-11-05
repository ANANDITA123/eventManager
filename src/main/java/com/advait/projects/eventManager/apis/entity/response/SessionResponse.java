package com.advait.projects.eventManager.apis.entity.response;

import com.advait.projects.eventManager.apis.constant.Language;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionResponse extends BaseResponse implements Serializable, Cloneable {
    private String sessionName;
    private String desc;
    private Language lang;
    private LocalDateTime startDate;
    private String videoUrl;
}
