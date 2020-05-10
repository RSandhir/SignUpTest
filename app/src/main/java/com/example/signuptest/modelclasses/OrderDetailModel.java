package com.example.signuptest.modelclasses;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class OrderDetailModel {

    public class Datum {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("order_id")
        @Expose
        private String orderId;

        public String getOrder_comment() {
            return order_comment;
        }

        public void setOrder_comment(String order_comment) {
            this.order_comment = order_comment;
        }

        @SerializedName("order_otp")
        @Expose
        private String orderOtp;
        @SerializedName("order_payment_method")
        @Expose
        private String orderPaymentMethod;
        @SerializedName("order_status")
        @Expose
        private String orderStatus;
        @SerializedName("order_total")
        @Expose
        private String orderTotal;
        @SerializedName("order_comment")
        @Expose
        private String order_comment;
        @SerializedName("order_shop_total")
        @Expose
        private String order_shop_total;
        public String getOrder_shop_total() {
            return order_shop_total;
        }

        public void setOrder_shop_total(String order_shop_total) {
            this.order_shop_total = order_shop_total;
        }
        @SerializedName("od_delivery_charges")
        @Expose
        private String odDeliveryCharges;
        @SerializedName("od_total_sum")
        @Expose
        private String odTotalSum;
        @SerializedName("od_shop_total_sum")
        @Expose
        private String od_shop_total_sum;
        public String getOd_shop_total_sum() {
            return od_shop_total_sum;
        }

        public void setOd_shop_total_sum(String od_shop_total_sum) {
            this.od_shop_total_sum = od_shop_total_sum;
        }

        @SerializedName("od_driver_total_distance")
        @Expose
        private String odDriverTotalDistance;

        @SerializedName("driver_name")
        @Expose
        private String driverName;
        @SerializedName("driver_phone")
        @Expose
        private String driverPhone;
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

        public String getOrderOtp() {
            return orderOtp;
        }

        public void setOrderOtp(String orderOtp) {
            this.orderOtp = orderOtp;
        }

        public String getOrderPaymentMethod() {
            return orderPaymentMethod;
        }

        public void setOrderPaymentMethod(String orderPaymentMethod) {
            this.orderPaymentMethod = orderPaymentMethod;
        }

        public String getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(String orderStatus) {
            this.orderStatus = orderStatus;
        }

        public String getOrderTotal() {
            return orderTotal;
        }

        public void setOrderTotal(String orderTotal) {
            this.orderTotal = orderTotal;
        }

        public String getOdDeliveryCharges() {
            return odDeliveryCharges;
        }

        public void setOdDeliveryCharges(String odDeliveryCharges) {
            this.odDeliveryCharges = odDeliveryCharges;
        }

        public String getOdTotalSum() {
            return odTotalSum;
        }

        public void setOdTotalSum(String odTotalSum) {
            this.odTotalSum = odTotalSum;
        }

        public String getOdDriverTotalDistance() {
            return odDriverTotalDistance;
        }

        public void setOdDriverTotalDistance(String odDriverTotalDistance) {
            this.odDriverTotalDistance = odDriverTotalDistance;
        }

        public String getDriverName() {
            return driverName;
        }

        public void setDriverName(String driverName) {
            this.driverName = driverName;
        }

        public String getDriverPhone() {
            return driverPhone;
        }

        public void setDriverPhone(String driverPhone) {
            this.driverPhone = driverPhone;
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
        @SerializedName("order_items")
        @Expose
        private List<OrderItem> orderItems = null;
        @SerializedName("user_detail")
        @Expose
        private List<UserDetail> userDetail = null;
        @SerializedName("vendor_detail")
        @Expose
        private List<VendorDetail> vendorDetail = null;

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

        public List<OrderItem> getOrderItems() {
            return orderItems;
        }

        public void setOrderItems(List<OrderItem> orderItems) {
            this.orderItems = orderItems;
        }

        public List<UserDetail> getUserDetail() {
            return userDetail;
        }

        public void setUserDetail(List<UserDetail> userDetail) {
            this.userDetail = userDetail;
        }

        public List<VendorDetail> getVendorDetail() {
            return vendorDetail;
        }

        public void setVendorDetail(List<VendorDetail> vendorDetail) {
            this.vendorDetail = vendorDetail;
        }

    public class OrderItem {

        @SerializedName("id")
        @Expose
        private String id;

        public String getProduct_shop_price() {
            return product_shop_price;
        }

        public void setProduct_shop_price(String product_shop_price) {
            this.product_shop_price = product_shop_price;
        }

        @SerializedName("order_id")
        @Expose
        private String orderId;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("vendor_id")
        @Expose
        private String vendorId;
        @SerializedName("product_shop_price")
        @Expose
        private String product_shop_price;
        @SerializedName("product_id")
        @Expose
        private String productId;
        @SerializedName("product_price")
        @Expose
        private String productPrice;
        @SerializedName("product_unit")
        @Expose
        private String productUnit;
        @SerializedName("product_name")
        @Expose
        private String productName;
        @SerializedName("product_qty")
        @Expose
        private String productQty;
        @SerializedName("product_image")
        @Expose
        private String productImage;

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

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getVendorId() {
            return vendorId;
        }

        public void setVendorId(String vendorId) {
            this.vendorId = vendorId;
        }

        public String getProductId() {
            return productId;
        }

        public void setProductId(String productId) {
            this.productId = productId;
        }

        public String getProductPrice() {
            return productPrice;
        }

        public void setProductPrice(String productPrice) {
            this.productPrice = productPrice;
        }

        public String getProductUnit() {
            return productUnit;
        }

        public void setProductUnit(String productUnit) {
            this.productUnit = productUnit;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getProductQty() {
            return productQty;
        }

        public void setProductQty(String productQty) {
            this.productQty = productQty;
        }

        public String getProductImage() {
            return productImage;
        }

        public void setProductImage(String productImage) {
            this.productImage = productImage;
        }

    }

    public class UserDetail {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("user_id")
        @Expose
        private String userId;
        @SerializedName("first_name")
        @Expose
        private String firstName;
        @SerializedName("last_name")
        @Expose
        private String lastName;
        @SerializedName("house_no")
        @Expose
        private String houseNo;
        @SerializedName("contact_no")
        @Expose
        private String contactNo;
        @SerializedName("appartment")
        @Expose
        private String appartment;
        @SerializedName("street")
        @Expose
        private String street;
        @SerializedName("landmark")
        @Expose
        private String landmark;
        @SerializedName("pincode")
        @Expose
        private String pincode;
        @SerializedName("address_type")
        @Expose
        private String addressType;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("state")
        @Expose
        private String state;
        @SerializedName("address")
        @Expose
        private Object address;
        @SerializedName("lat")
        @Expose
        private String lat;
        @SerializedName("lng")
        @Expose
        private String lng;
        @SerializedName("status")
        @Expose
        private String status;
        @SerializedName("created_at")
        @Expose
        private String createdAt;
        @SerializedName("updated_at")
        @Expose
        private String updatedAt;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUserId() {
            return userId;
        }

        public void setUserId(String userId) {
            this.userId = userId;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getHouseNo() {
            return houseNo;
        }

        public void setHouseNo(String houseNo) {
            this.houseNo = houseNo;
        }

        public String getContactNo() {
            return contactNo;
        }

        public void setContactNo(String contactNo) {
            this.contactNo = contactNo;
        }

        public String getAppartment() {
            return appartment;
        }

        public void setAppartment(String appartment) {
            this.appartment = appartment;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getLandmark() {
            return landmark;
        }

        public void setLandmark(String landmark) {
            this.landmark = landmark;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }

        public String getAddressType() {
            return addressType;
        }

        public void setAddressType(String addressType) {
            this.addressType = addressType;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public Object getAddress() {
            return address;
        }

        public void setAddress(Object address) {
            this.address = address;
        }

        public String getLat() {
            return lat;
        }

        public void setLat(String lat) {
            this.lat = lat;
        }

        public String getLng() {
            return lng;
        }

        public void setLng(String lng) {
            this.lng = lng;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreatedAt() {
            return createdAt;
        }

        public void setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
        }

        public String getUpdatedAt() {
            return updatedAt;
        }

        public void setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
        }

    }

    public class VendorDetail {

        @SerializedName("vendor_lat")
        @Expose
        private String vendorLat;
        @SerializedName("vendor_lng")
        @Expose
        private String vendorLng;
        @SerializedName("vendor_store_name")
        @Expose
        private String vendorStoreName;
        @SerializedName("vendor_name")
        @Expose
        private String vendorName;
        @SerializedName("vendor_phone")
        @Expose
        private String vendorPhone;
        @SerializedName("vendor_address")
        @Expose
        private String vendorAddress;
        @SerializedName("vendor_manual_address")
        @Expose
        private String vendorManualAddress;
        @SerializedName("vendor_city")
        @Expose
        private String vendorCity;

        public String getVendorLat() {
            return vendorLat;
        }

        public void setVendorLat(String vendorLat) {
            this.vendorLat = vendorLat;
        }

        public String getVendorLng() {
            return vendorLng;
        }

        public void setVendorLng(String vendorLng) {
            this.vendorLng = vendorLng;
        }

        public String getVendorStoreName() {
            return vendorStoreName;
        }

        public void setVendorStoreName(String vendorStoreName) {
            this.vendorStoreName = vendorStoreName;
        }

        public String getVendorName() {
            return vendorName;
        }

        public void setVendorName(String vendorName) {
            this.vendorName = vendorName;
        }

        public String getVendorPhone() {
            return vendorPhone;
        }

        public void setVendorPhone(String vendorPhone) {
            this.vendorPhone = vendorPhone;
        }

        public String getVendorAddress() {
            return vendorAddress;
        }

        public void setVendorAddress(String vendorAddress) {
            this.vendorAddress = vendorAddress;
        }

        public String getVendorManualAddress() {
            return vendorManualAddress;
        }

        public void setVendorManualAddress(String vendorManualAddress) {
            this.vendorManualAddress = vendorManualAddress;
        }

        public String getVendorCity() {
            return vendorCity;
        }

        public void setVendorCity(String vendorCity) {
            this.vendorCity = vendorCity;
        }

    }
}
