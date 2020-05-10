package com.example.signuptest.api;

import retrofit.RestAdapter;

public class RestServiceConnector {
    private static RestAPI service;
    //service before login
    public static RestAPI getService() {
        return (service == null) ? setService() : service;
    }

    private static RestAPI setService() {
        RestAdapter restAdapter = new RestAdapter.Builder().
                setEndpoint(ApiConstants.BaseURL).
                setLogLevel(RestAdapter.LogLevel.FULL).build();
        service = restAdapter.create(RestAPI.class);
        return service;
    }
}


