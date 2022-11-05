package com.advait.projects.eventManager.apis.entity.request;

import com.advait.projects.eventManager.apis.constant.Language;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SessionRequest extends BaseRequest implements Serializable, Cloneable {

    private String sessionTitle;
    private String desc;
    private Language lang;
    private LocalDateTime startDate;
    private String videoUrl;

}
