package com.advait.projects.eventManager.apis.entity.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
@Data
public class ErrorDto implements Serializable {

    private static final long serialVersionUID = -134567898765432L;
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    private String errorMessage;
    @Getter
    @Setter
    private String type;

    public ErrorDto(){

    }

    public ErrorDto(String code, String errorMessage, String type){
        this.code = code;
        this.errorMessage = errorMessage;
        this.type = type;
    }

    public ErrorDto(String code, String errorMessage){
        this.code = code;
        this.errorMessage = errorMessage;
    }

    @Override
    public String toString(){
        return "Error Response [code="+code+", errorMessage="+errorMessage+", type="+type+"]";
    }
}
