package com.example.signuptest.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class NotificationListModel {

   /* {
        "status": "200",
            "message": "notification list",
            "data": [
        {
            "id": "4",
                "title": "New order!",
                "order_g_id": "0",
                "order_id": "2",
                "message": "Hurry! you got a new order  <b>CYTU1UKULY</b> to deliver.",
                "status": "1",
                "noti_all_status": "1"
        }
    ],
        "noti_count": 1
    }*/

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("order_g_id")
        @Expose
        private String orderGId;
        @SerializedName("order_id")
        @Expose
        private String orderId;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("noti_all_status")
        @Expose
        private String notiAllStatus;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getOrderGId() {
            return orderGId;
        }

        public void setOrderGId(String orderGId) {
            this.orderGId = orderGId;
        }

        public String getOrderId() {
            return orderId;
        }

        public void setOrderId(String orderId) {
            this.orderId = orderId;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getNotiAllStatus() {
            return notiAllStatus;
        }

        public void setNotiAllStatus(String notiAllStatus) {
            this.notiAllStatus = notiAllStatus;
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
        @SerializedName("noti_count")
        @Expose
        private Integer notiCount;

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

        public Integer getNotiCount() {
            return notiCount;
        }

        public void setNotiCount(Integer notiCount) {
            this.notiCount = notiCount;
        }


}
