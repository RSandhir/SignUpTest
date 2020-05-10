package com.example.signuptest.api;


import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.Window;

import com.google.gson.Gson;
import com.example.signuptest.R;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public abstract class CustomCallBacks<T> implements Callback<T> {
    Context context;
    private Dialog dialog;

    public CustomCallBacks(Context context, boolean showProgress) {
        this.context = context;
        progressDialog();
        if (showProgress) {
            startProgressDialog();
        }
    }

    @Override
    public void failure(RetrofitError arg0) {
        arg0.printStackTrace();
        stopProgressDialog();
        this.onFailure(arg0);
    }

    @Override
    public void success(T arg0, Response arg1) {
        try {
            stopProgressDialog();
        } catch (Exception e) {
        }
        this.onSucess(arg0, arg1);
        System.out.println("json_str=" + new Gson().toJson(arg0));
    }

    public abstract void onSucess(T arg0, Response arg1);

    public abstract void onFailure(RetrofitError arg0);


    private void progressDialog() {
        dialog = new Dialog(context);
        View view = View.inflate(context, R.layout.progress_dialog, null);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(view);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.setCancelable(false);
    }

    public void startProgressDialog() {
        if (dialog != null && !dialog.isShowing()) {
            try {
                dialog.show();
            } catch (Exception e) {
            }
        }
    }

    public void stopProgressDialog() {
        if (dialog != null && dialog.isShowing()) {
            try {
                dialog.dismiss();
            } catch (Exception e) {
            }
        }
    }

    }

