package com.advait.projects.eventManager.model;

import com.advait.projects.eventManager.apis.entity.request.SessionRequest;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.ArrayList;
@Data
@Document(collation="events")
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Events {
    public Events(String eventId, String title, String type, String startDate, String endDate) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private String eventId;
    private String title;
    private String startDate;
    private String endDate;
    private ArrayList<SessionRequest> sessionDetails;

    public Events(String eventId, String title, String type, String startDate, String endDate, ArrayList<SessionRequest> sessionDetails) {
        this.title = title;
        this.startDate = startDate;
        this.endDate = endDate;
        this.sessionDetails = sessionDetails;
    }

    public Events(){

    }

    @Override
    public String toString() {
        return "Events{" +
                ", title='" + title + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", sessionDetails=" + sessionDetails +
                '}';
    }
}
