package com.example.user.mybirthday;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    RelativeLayout wishes;
    ImageView wishess;
    ImageView wishesss;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wishes=findViewById(R.id.layout2);
        wishess=findViewById(R.id.ImageView);
        wishesss=findViewById(R.id.ImageView2);

    }

    public void wishes(View view) {wishes.setVisibility(View.VISIBLE);}
    public void wishess(View view) {wishes.setVisibility(View.VISIBLE);}
    public void wishesss(View view) {wishes.setVisibility(View.VISIBLE);
    }


}
