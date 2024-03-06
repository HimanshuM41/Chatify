package com.example.chatify.Activities;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.chatify.R;

public class SplashActivity extends AppCompatActivity {

    public static final long TIME_DELAY = 500;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this, PhoneNumberActivity.class);
                startActivity(splashIntent);
                finish();
            }
        }, TIME_DELAY);
    }
}