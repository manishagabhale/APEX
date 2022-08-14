package com.example.apex;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_splash);


        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
//                if(prefConfig.readLoginStatus()==true){

                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                SplashActivity.this.finish();

                  /*  if (getIntent().hasExtra("pushnotification")) {//if apps is already open call this block
                        Intent intent = new Intent(SplashActivity.this, MyTripFragment.class);
                        startActivity(intent);
                        finish();
                    }

                    SplashActivity.this.finish();*/

//                }else {
//                    startActivity(new Intent(SplashActivity.this, SignInActivity.class));
//                    SplashActivity.this.finish();
//                }
            }
        }, 2000);

    }
}