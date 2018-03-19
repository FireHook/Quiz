package com.firehook.retrofit.modelAnswers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;



public class Answer {

    @SerializedName("image")
    @Expose
    private Image_ image;
    @SerializedName("order")
    @Expose
    private Integer order;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("isCorrect")
    @Expose
    private Integer isCorrect;

    public Image_ getImage() {
        return image;
    }

    public void setImage(Image_ image) {
        this.image = image;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getIsCorrect() {
        return isCorrect;
    }

    public void setIsCorrect(Integer isCorrect) {
        this.isCorrect = isCorrect;
    }

}
