package com.firehook.retrofit.modelAnswers;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Vladyslav on 14.03.2018.
 */

public class Question {
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("answers")
    @Expose
    private List<Answer> answers = null;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("answer")
    @Expose
    private String answer;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("order")
    @Expose
    private Integer order;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
