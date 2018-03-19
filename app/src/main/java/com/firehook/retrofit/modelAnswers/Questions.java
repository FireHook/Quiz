package com.firehook.retrofit.modelAnswers;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Questions {
    @SerializedName("celebrity")
    @Expose
    private Celebrity celebrity;
    @SerializedName("rates")
    @Expose
    private List<Rate> rates = null;
    @SerializedName("questions")
    @Expose
    private List<Question> questions = null;
    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("sponsored")
    @Expose
    private Boolean sponsored;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("content")
    @Expose
    private String content;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("buttonStart")
    @Expose
    private String buttonStart;
    @SerializedName("shareTitle")
    @Expose
    private String shareTitle;
    @SerializedName("categories")
    @Expose
    private List<Category> categories = null;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("scripts")
    @Expose
    private String scripts;
    @SerializedName("mainPhoto")
    @Expose
    private MainPhoto mainPhoto;
    @SerializedName("category")
    @Expose
    private Category category;
    @SerializedName("isBattle")
    @Expose
    private Boolean isBattle;
    @SerializedName("created")
    @Expose
    private Integer created;
    @SerializedName("latestResults")
    @Expose
    private List<LatestResult> latestResults = null;
    @SerializedName("avgResult")
    @Expose
    private Double avgResult;
    @SerializedName("resultCount")
    @Expose
    private Integer resultCount;
    @SerializedName("cityAvg")
    @Expose
    private Object cityAvg;
    @SerializedName("cityTime")
    @Expose
    private Object cityTime;
    @SerializedName("cityCount")
    @Expose
    private Object cityCount;
    @SerializedName("userBattleDone")
    @Expose
    private Boolean userBattleDone;
    @SerializedName("sponsoredResults")
    @Expose
    private SponsoredResults sponsoredResults;

    public Celebrity getCelebrity() {
        return celebrity;
    }

    public void setCelebrity(Celebrity celebrity) {
        this.celebrity = celebrity;
    }

    public List<Rate> getRates() {
        return rates;
    }

    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(List<Question> questions) {
        this.questions = questions;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getSponsored() {
        return sponsored;
    }

    public void setSponsored(Boolean sponsored) {
        this.sponsored = sponsored;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public String getButtonStart() {
        return buttonStart;
    }

    public void setButtonStart(String buttonStart) {
        this.buttonStart = buttonStart;
    }

    public String getShareTitle() {
        return shareTitle;
    }

    public void setShareTitle(String shareTitle) {
        this.shareTitle = shareTitle;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getScripts() {
        return scripts;
    }

    public void setScripts(String scripts) {
        this.scripts = scripts;
    }

    public MainPhoto getMainPhoto() {
        return mainPhoto;
    }

    public void setMainPhoto(MainPhoto mainPhoto) {
        this.mainPhoto = mainPhoto;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Boolean getIsBattle() {
        return isBattle;
    }

    public void setIsBattle(Boolean isBattle) {
        this.isBattle = isBattle;
    }

    public Integer getCreated() {
        return created;
    }

    public void setCreated(Integer created) {
        this.created = created;
    }

    public List<LatestResult> getLatestResults() {
        return latestResults;
    }

    public void setLatestResults(List<LatestResult> latestResults) {
        this.latestResults = latestResults;
    }

    public Double getAvgResult() {
        return avgResult;
    }

    public void setAvgResult(Double avgResult) {
        this.avgResult = avgResult;
    }

    public Integer getResultCount() {
        return resultCount;
    }

    public void setResultCount(Integer resultCount) {
        this.resultCount = resultCount;
    }

    public Object getCityAvg() {
        return cityAvg;
    }

    public void setCityAvg(Object cityAvg) {
        this.cityAvg = cityAvg;
    }

    public Object getCityTime() {
        return cityTime;
    }

    public void setCityTime(Object cityTime) {
        this.cityTime = cityTime;
    }

    public Object getCityCount() {
        return cityCount;
    }

    public void setCityCount(Object cityCount) {
        this.cityCount = cityCount;
    }

    public Boolean getUserBattleDone() {
        return userBattleDone;
    }

    public void setUserBattleDone(Boolean userBattleDone) {
        this.userBattleDone = userBattleDone;
    }

    public SponsoredResults getSponsoredResults() {
        return sponsoredResults;
    }

    public void setSponsoredResults(SponsoredResults sponsoredResults) {
        this.sponsoredResults = sponsoredResults;
    }
}
