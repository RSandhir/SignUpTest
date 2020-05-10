package com.example.signuptest;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

public class MyPreferenceClass {
    public static MyPreferenceClass helper;
    public static Context mContext;

    public static SharedPreferences preferences;
    public static SharedPreferences.Editor mEditor;

    public static MyPreferenceClass getInstance(Context context) {
        mContext = context;
        preferences = PreferenceManager.getDefaultSharedPreferences(mContext);
        mEditor = preferences.edit();

        if (helper == null)
            helper = new MyPreferenceClass();
        return helper;
    }

    public String removeString(String key) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove(key);
        editor.apply();
        return key;
    }

    public boolean getIsLogin() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getBoolean("isLogin", false);
    }

    public void setIsLogin(boolean response) {
        mEditor.putBoolean("isLogin", response);
        mEditor.commit();
    }

    public boolean getIsDelivered() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getBoolean("isDelivered", false);
    }

    public void setIsDelivered(boolean response) {
        mEditor.putBoolean("isDelivered", response);
        mEditor.commit();
    }

    public boolean getIsPicked() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getBoolean("isPicked", false);
    }

    public void setIsPicked(boolean response) {
        mEditor.putBoolean("isPicked", response);
        mEditor.commit();
    }

    public boolean getRanBefore() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getBoolean("RanBefore", false);
    }

    public void setRanBefore(boolean response) {
        mEditor.putBoolean("RanBefore", response);
        mEditor.commit();
    }

    public String getAuthToken() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getString("accessToken", "");
    }

    public void setAuthToken(String authToken) {
        mEditor.putString("accessToken", authToken);
        mEditor.commit();
    }


    public String getEmail() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getString("email", "");
    }

    public void setEmail(String email) {
        mEditor.putString("email", email);
        mEditor.commit();
    }

    public String getString(String key) {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getString(key, "");
    }

    public void saveString(String key, String value) {
        mEditor.putString(key, value);
        mEditor.commit();
    }

    public String getRegistrationToken() {
        return PreferenceManager.getDefaultSharedPreferences(mContext).getString("registrationToken", "");

    }

    public String removeRegistrationToken() {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(mContext);
        SharedPreferences.Editor editor = settings.edit();
        editor.remove("registrationToken");
        editor.apply();
        return "registrationToken";
    }

    public void setRegistrationToken(String registrationToken) {
        mEditor.putString("registrationToken", registrationToken);
        mEditor.commit();
    }

}