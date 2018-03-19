package com.firehook.retrofit.modelCategories;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Tag {
    @SerializedName("uid")
    @Expose
    private Long uid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
