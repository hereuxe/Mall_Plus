package com.example.mall_plus;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class AboutUs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        //hide the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
    }
}