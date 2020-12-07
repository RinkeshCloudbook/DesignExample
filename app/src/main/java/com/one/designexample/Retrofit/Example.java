package com.one.designexample.Retrofit;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Example {
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("response")
    @Expose
    private List<rResponse> response = null;
    @SerializedName("success")
    @Expose
    private Integer success;

    public Integer getSuccess() {
        return this.success;
    }

    public void setSuccess(Integer success2) {
        this.success = success2;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message2) {
        this.message = message2;
    }

    public List<rResponse> getResponse() {
        return this.response;
    }

    public void setResponse(List<rResponse> response2) {
        this.response = response2;
    }
}
