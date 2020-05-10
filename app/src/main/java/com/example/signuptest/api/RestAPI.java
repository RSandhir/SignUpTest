package com.example.signuptest.api;

import com.example.signuptest.modelclasses.AllTransactionsModel;
import com.example.signuptest.modelclasses.DashboardModel;
import com.example.signuptest.modelclasses.DriverCashModel;
import com.example.signuptest.modelclasses.LoginModel;
import com.example.signuptest.modelclasses.NewOrderModel;
import com.example.signuptest.modelclasses.NotificationListModel;
import com.example.signuptest.modelclasses.NotificationOrderDetailModel;
import com.example.signuptest.modelclasses.OrderDetailModel;
import com.example.signuptest.modelclasses.SignUpModel;
import com.example.signuptest.modelclasses.StatusModel;
import com.example.signuptest.modelclasses.StatusModelNew;
import com.example.signuptest.modelclasses.TransactionOrdersModel;
import com.example.signuptest.modelclasses.UpdateLocationModel;

import org.json.JSONArray;

import retrofit.http.Field;
import retrofit.http.FormUrlEncoded;
import retrofit.http.POST;

public interface RestAPI {
    @FormUrlEncoded
    @POST("/driver-login")
    void login(
            @Field("email") String email,
            @Field("password") String password,
            @Field("user_type") String user_type,
            @Field("device_token") String firebase_token,
            @Field("device_type") String device_type,
            CustomCallBacks<LoginModel> callBacks);

    @FormUrlEncoded
    @POST("/grocery-driver-signup")
    void signup(
            @Field("name") String name,
            @Field("phone")String phone,
            @Field("email")String email,
            @Field("password")String password,
            @Field("image")String image,
            @Field("refer_code")String referCode,
            @Field("user_type")String userType,
            @Field("device_id")String deviceId,
            @Field("device_token")String deviceToken,
            @Field("device_type")String deviceType,
            @Field("login_token")String loginToken,
            @Field("login_type")String loginType,
            @Field("accessToken")String accessToken,
            CustomCallBacks<SignUpModel> callBacks);

    @FormUrlEncoded
    @POST("/update-drive-location")
    void updateLocation(
            @Field("driver_id") String driver_id,
            @Field("lat") String lat,
            @Field("lng") String lng,
            CustomCallBacks<UpdateLocationModel> callBacks);

    @FormUrlEncoded
    @POST("/notifications-list")
    void getNotificationList(
            @Field("user_id") String user_id,
            CustomCallBacks<NotificationListModel> callBacks);

    @FormUrlEncoded
    @POST("/driver-order-listing")
    void getNewOrderList(
            @Field("driver_id") String driver_id,
            CustomCallBacks<NewOrderModel> callBacks);

    @FormUrlEncoded
    @POST("/driver-past-order-listing")
    void getPastOrderList(
            @Field("driver_id") String driver_id,
            CustomCallBacks<NewOrderModel> callBacks);

    @FormUrlEncoded
    @POST("/order-detail")
    void getNewOrderDetail(
            @Field("order_id") String order_id,
            CustomCallBacks<OrderDetailModel> callBacks);

    @FormUrlEncoded
    @POST("/notification-order-detail")
    void getNotificationOrderDetail(
            @Field("order_id") String order_id,
            @Field("notification_id") String notification_id,
            CustomCallBacks<NotificationOrderDetailModel> callBacks);

    @FormUrlEncoded
    @POST("/driver-pickup-order")
    void pickupOrder(
            @Field("order_id") String order_id,
            @Field("order_otp") String order_otp,
            CustomCallBacks<StatusModelNew> callBacks);

    @FormUrlEncoded
    @POST("/driver-deliver-order")
    void deliverOrder(
            @Field("order_id") String order_id,
            @Field("order_otp") String order_otp,
            CustomCallBacks<StatusModelNew> callBacks);

    @FormUrlEncoded
    @POST("/driver-cash-in-hand-weekly")
    void driverCashInHand(
            @Field("driver_id") String driver_id,
            CustomCallBacks<DriverCashModel> callBacks);

    @FormUrlEncoded
    @POST("/driver-cash-in-hand-weekly-all")
    void driverCashInHandWeelyAll(
            @Field("driver_id") String driver_id,
            @Field("start_week") String start_week,
            @Field("end_week") String end_week,
            CustomCallBacks<TransactionOrdersModel> callBacks);

    @FormUrlEncoded
    @POST("/driver-dashboard")
    void driverDashboard(
            @Field("driver_id") String driver_id,
            CustomCallBacks<DashboardModel> callBacks);

    @FormUrlEncoded
    @POST("/driver-pay-cash")
    void driverPayCash(
            @Field("driver_id") String driver_id,
            CustomCallBacks<StatusModelNew> callBacks);

    @FormUrlEncoded
    @POST("/driver-all-transactions")
    void driverAllTransactions(
            @Field("driver_id") String driver_id,
            CustomCallBacks<AllTransactionsModel> callBacks);

    @FormUrlEncoded
    @POST("/vendor-status")
    void changeOnlineStatus(
            @Field("vendor_id") String vendor_id,
            @Field("avail_status") String avail_status,
            CustomCallBacks<StatusModel> callBacks);
    
}





