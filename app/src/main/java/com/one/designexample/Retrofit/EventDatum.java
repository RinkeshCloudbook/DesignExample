package com.one.designexample.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class EventDatum {
    @SerializedName("branch_id")
    @Expose
    private String branchId;
    @SerializedName("event_date")
    @Expose
    private String eventDate;
    @SerializedName("event_description")
    @Expose
    private String eventDescription;
    @SerializedName("event_name")
    @Expose
    private String eventName;
    @SerializedName("ID")
    @Expose

    /* renamed from: iD */
    private String f73iD;
    @SerializedName("student_event_id")
    @Expose
    private String studentEventId;

    public String getID() {
        return this.f73iD;
    }

    public void setID(String iD) {
        this.f73iD = iD;
    }

    public String getStudentEventId() {
        return this.studentEventId;
    }

    public void setStudentEventId(String studentEventId2) {
        this.studentEventId = studentEventId2;
    }

    public String getBranchId() {
        return this.branchId;
    }

    public void setBranchId(String branchId2) {
        this.branchId = branchId2;
    }

    public String getEventName() {
        return this.eventName;
    }

    public void setEventName(String eventName2) {
        this.eventName = eventName2;
    }

    public String getEventDescription() {
        return this.eventDescription;
    }

    public void setEventDescription(String eventDescription2) {
        this.eventDescription = eventDescription2;
    }

    public String getEventDate() {
        return this.eventDate;
    }

    public void setEventDate(String eventDate2) {
        this.eventDate = eventDate2;
    }
}
