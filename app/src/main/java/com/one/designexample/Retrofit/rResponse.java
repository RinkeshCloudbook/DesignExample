package com.one.designexample.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class rResponse {
    @SerializedName("event_data")
    @Expose
    private List<EventDatum> eventData = null;
    @SerializedName("event_date")
    @Expose
    private String eventDate;

    public String getEventDate() {
        return this.eventDate;
    }

    public void setEventDate(String eventDate2) {
        this.eventDate = eventDate2;
    }

    public List<EventDatum> getEventData() {
        return this.eventData;
    }

    public void setEventData(List<EventDatum> eventData2) {
        this.eventData = eventData2;
    }
}
