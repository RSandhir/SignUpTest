package com.example.signuptest.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NewOrderModel {

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("order_id")
        @Expose
        private String orderId;

        public String getOrder_distance() {
            return order_distance;
        }

        public String getOd_total_sum() {
            return od_total_sum;
        }

        public void setOd_total_sum(String od_total_sum) {
            this.od_total_sum = od_total_sum;
        }

        public void setOrder_distance(String order_distance) {
            this.order_distance = order_distance;
        }
        @SerializedName("od_total_sum")
        @Expose
        private String od_total_sum;


        @SerializedName("order_total")
        @Expose
        private String orderTotal;

        @SerializedName("order_status")
        @Expose
        private String orderStatus;
        @SerializedName("order_distance")
        @Expose
        private String order_distance;
        @SerializedName("vendor_name")
        @Expose
        private String vendorName;
        @SerializedName("user_name")
        @Expose
        private String userName;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getOrderTotal() {
            return orderTotal;
        }

        public void setOrderTotal(String orderTotal) {
            this.orderTotal = orderTotal;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getVendorName() {
            return vendorName;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
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
