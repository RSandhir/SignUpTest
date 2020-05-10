package com.example.signuptest.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AllTransactionsModel {

    public class Datum {

        @SerializedName("order_id")
        @Expose
        private String orderId;
        @SerializedName("order_show_id")
        @Expose
        private String orderShowId;
        @SerializedName("order_amount")
        @Expose
        private String orderAmount;
        @SerializedName("order_km")
        @Expose
        private String orderKm;
        @SerializedName("order_status")
        @Expose
        private String order_status;
        @SerializedName("date")
        @Expose
        private String date;

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrder_status() {
            return order_status;
        }

        public void setOrder_status(String order_status) {
            this.order_status = order_status;
        }

        public String getOrderShowId() {
            return orderShowId;
        }

        public void setOrderShowId(String orderShowId) {
            this.orderShowId = orderShowId;
        }

        public String getOrderAmount() {
            return orderAmount;
        }

        public void setOrderAmount(String orderAmount) {
            this.orderAmount = orderAmount;
        }

        public String getOrderKm() {
            return orderKm;
        }

        public void setOrderKm(String orderKm) {
            this.orderKm = orderKm;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
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
}
