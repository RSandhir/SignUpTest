package com.example.signuptest.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class DashboardModel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")
    @Expose
    private String message;
    @SerializedName("today_order_count")
    @Expose
    private Integer todayOrderCount;
    @SerializedName("help_number")
    @Expose
    private String help_number;
    @SerializedName("week_order_count")
    @Expose
    private Integer weekOrderCount;
    @SerializedName("today_km_sum")
    @Expose
    private Integer todayKmSum;
    @SerializedName("week_km_sum")
    @Expose
    private Integer weekKmSum;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getHelp_number() {
        return help_number;
    }

    public void setHelp_number(String help_number) {
        this.help_number = help_number;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getTodayOrderCount() {
        return todayOrderCount;
    }

    public void setTodayOrderCount(Integer todayOrderCount) {
        this.todayOrderCount = todayOrderCount;
    }

    public Integer getWeekOrderCount() {
        return weekOrderCount;
    }

    public void setWeekOrderCount(Integer weekOrderCount) {
        this.weekOrderCount = weekOrderCount;
    }

    public Integer getTodayKmSum() {
        return todayKmSum;
    }

    public void setTodayKmSum(Integer todayKmSum) {
        this.todayKmSum = todayKmSum;
    }

    public Integer getWeekKmSum() {
        return weekKmSum;
    }

    public void setWeekKmSum(Integer weekKmSum) {
        this.weekKmSum = weekKmSum;
    }

}
