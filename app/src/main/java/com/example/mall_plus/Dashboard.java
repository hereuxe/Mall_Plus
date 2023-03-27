package com.example.mall_plus;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Dashboard extends AppCompatActivity {
    private ImageView aboutus;
    private ImageView navigate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        //hide the action bar
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        //about us button
        aboutus = (ImageView) findViewById(R.id.about);
        aboutus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                openAboutUs();
            }
        });

        //navigation button
        navigate = (ImageView) findViewById(R.id.navigate);
        navigate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void  onClick(View v) {
                gotoUrl("https://mallnavigation-2582c.web.app/");
            }
        });


    }

    public void openAboutUs(){
        Intent intent = new Intent(this, AboutUs.class);
        startActivity(intent);
    }

    private void gotoUrl(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW, uri));
    }



    ///public void openNavigation(){
    ///    Intent intent = new Intent(this, Navigation.class);
    ///    startActivity(intent);
    ///}

}