package com.example.signuptest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.signuptest.api.CustomCallBacks;
import com.example.signuptest.api.RestServiceConnector;
import com.example.signuptest.modelclasses.SignUpModel;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.InstanceIdResult;

import retrofit.RetrofitError;
import retrofit.client.Response;

public class EnterOtp extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "FireDebug" ;
    Button submit;
    EditText enterOtp;
    String otp;
    String verificationId;
    private FirebaseAuth mAuth;
    String deviceId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter_otp);

        submit=findViewById(R.id.submit);
        enterOtp=findViewById(R.id.enterOtp);
        deviceId= Settings.Secure.getString(getApplicationContext().getContentResolver(), Settings.Secure.ANDROID_ID);
        MyPreferenceClass.getInstance(this).saveString("deviceId",deviceId);

        submit.setOnClickListener(this);

        Bundle bundle=getIntent().getExtras();
        verificationId=bundle.getString("id");
        mAuth=FirebaseAuth.getInstance();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.submit:
                otp=enterOtp.getText().toString();

                PhoneAuthCredential credential= PhoneAuthProvider.getCredential(verificationId,otp);
                signInWithPhoneAuthCredential(credential);
        }
    }

    private void signInWithPhoneAuthCredential(PhoneAuthCredential credential) {
        mAuth.signInWithCredential(credential)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d(TAG, "signInWithCredential:success");
                            FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(EnterOtp.this, new OnSuccessListener<InstanceIdResult>() {
                                @Override
                                public void onSuccess(InstanceIdResult instanceIdResult) {
                                    String fireToken=instanceIdResult.getToken();
                                    MyPreferenceClass.getInstance(getApplicationContext()).saveString("fireId",fireToken);
                                }
                            });
                            regServer();
                            FirebaseUser user = task.getResult().getUser();
                            // ...
                        } else {
                            // Sign in failed, display a message and update the UI
                            Log.w(TAG, "signInWithCredential:failure", task.getException());
                            if (task.getException() instanceof FirebaseAuthInvalidCredentialsException) {
                                // The verification code entered was invalid
                            }
                        }
                    }
                });
    }

    private  void regServer(){

        RestServiceConnector.getService().signup(MyPreferenceClass.getInstance(this).getString("uname")
                ,MyPreferenceClass.getInstance(this).getString("mobile")
                ,MyPreferenceClass.getInstance(this).getString("email")
                ,MyPreferenceClass.getInstance(this).getString("pass")
                ,""
                ,""
                ,""
                ,MyPreferenceClass.getInstance(this).getString("deviceId")
                ,"","android"
                ,MyPreferenceClass.getInstance(this).getString("fireId")
                ,"",""
                ,signUpCallback()
                );
    }

    private  CustomCallBacks<SignUpModel> signUpCallback(){
        Log.d(TAG,"api callback");
        return new CustomCallBacks<SignUpModel>(this,true) {
            @Override
            public void onSucess(SignUpModel arg0, Response arg1) {
                if(arg0.getStatus().equals("200")) {
                    if(arg0.getUserStatus().equals("1")){
//                        TODO implemend on success
                    }
                }
            }

            @Override
            public void onFailure(RetrofitError arg0) {
                Log.d(TAG,"api fail");
            }
        };
    }
}