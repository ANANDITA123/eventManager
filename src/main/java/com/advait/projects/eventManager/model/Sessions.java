package com.advait.projects.eventManager.model;

import com.advait.projects.eventManager.apis.constant.Language;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collation = "events")
public class Sessions {
    private String sessionName;
    private String desc;
    private Language lang;
    private String startDate;

    @Override
    public String toString() {
        return "Sessions{" +
                "sessionName='" + sessionName + '\'' +
                ", desc='" + desc + '\'' +
                ", lang=" + lang +
                ", startDate='" + startDate + '\'' +
                ", videoUrl='" + videoUrl + '\'' +
                '}';
    }

    private String videoUrl;

    public Sessions(String sessionName, String desc, Language lang, String startDate, String videoUrl) {
        this.sessionName = sessionName;
        this.desc = desc;
        this.lang = lang;
        this.startDate = startDate;
        this.videoUrl = videoUrl;
    }

    public Sessions() {

    }




}
