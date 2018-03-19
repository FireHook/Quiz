package com.firehook.retrofit.modelAnswers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Vladyslav on 13.03.2018.
 */

public class Categories {

    @SerializedName("uid")
    @Expose
    private Integer uid;
    @SerializedName("secondaryCid")
    @Expose
    private String secondaryCid;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("type")
    @Expose
    private String type;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getSecondaryCid() {
        return secondaryCid;
    }

    public void setSecondaryCid(String secondaryCid) {
        this.secondaryCid = secondaryCid;
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
