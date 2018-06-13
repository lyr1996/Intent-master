package com.example.dell_.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Getdata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_getdata);
        TextView textView=(TextView)findViewById(R.id.xianshi);
        Intent intent=getIntent();
        String data=intent.getStringExtra("getdata");
        textView.setText(data);
    }
}
