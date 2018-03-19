package com.firehook.retrofit.modelAnswers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Vladyslav on 14.03.2018.
 */

public class LatestResult {
    @SerializedName("city")
    @Expose
    private Integer city;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("result")
    @Expose
    private Double result;
    @SerializedName("resolveTime")
    @Expose
    private Integer resolveTime;

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Double getResult() {
        return result;
    }

    public void setResult(Double result) {
        this.result = result;
    }

    public Integer getResolveTime() {
        return resolveTime;
    }

    public void setResolveTime(Integer resolveTime) {
        this.resolveTime = resolveTime;
    }
}
