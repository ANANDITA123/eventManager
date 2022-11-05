package com.advait.projects.eventManager.apis.entity.request;

import com.advait.projects.eventManager.apis.constant.Type;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)
public class SearchType  extends  BaseRequest implements Serializable, Cloneable{


    private Type searchType;

    @Override
    public String toString(){
        return "SearchType = "+searchType;
    }
}
