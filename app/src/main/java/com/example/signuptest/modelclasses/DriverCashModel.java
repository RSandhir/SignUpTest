package com.example.signuptest.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DriverCashModel {

    public class Datum {

        @SerializedName("start_week")
        @Expose
        private String startWeek;
        @SerializedName("week_ending")
        @Expose
        private String weekEnding;
        @SerializedName("totalamount")
        @Expose
        private String totalamount;
        @SerializedName("count")
        @Expose
        private String count;
        @SerializedName("status")
        @Expose
        private String status;

        public String getStartWeek() {
            return startWeek;
        }

        public void setStartWeek(String startWeek) {
            this.startWeek = startWeek;
        }

        public String getWeekEnding() {
            return weekEnding;
        }

        public void setWeekEnding(String weekEnding) {
            this.weekEnding = weekEnding;
        }

        public String getTotalamount() {
            return totalamount;
        }

        public void setTotalamount(String totalamount) {
            this.totalamount = totalamount;
        }

        public String getCount() {
            return count;
        }

        public void setCount(String count) {
            this.count = count;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

    }

        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("data")
        @Expose
        private List<Datum> data = null;
        @SerializedName("total_cash_collected")
        @Expose
        private String totalCashCollected;
        @SerializedName("cash_limit")
        @Expose
        private String cashLimit;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<Datum> getData() {
            return data;
        }

        public void setData(List<Datum> data) {
            this.data = data;
        }

        public String getTotalCashCollected() {
            return totalCashCollected;
        }

        public void setTotalCashCollected(String totalCashCollected) {
            this.totalCashCollected = totalCashCollected;
        }

        public String getCashLimit() {
            return cashLimit;
        }

        public void setCashLimit(String cashLimit) {
            this.cashLimit = cashLimit;
        }

}
