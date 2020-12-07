package com.one.designexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.one.designexample.Activity.AppBar;
import com.one.designexample.Activity.CallRetroApi;
import com.one.designexample.Activity.ImageAppBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.btn_appBar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AppBar.class);
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.btn_imageAppBar)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ImageAppBar.class);
                startActivity(intent);
            }
        });

        ((Button) findViewById(R.id.btn_callApi)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, CallRetroApi.class);
                startActivity(intent);
            }
        });
    }
}