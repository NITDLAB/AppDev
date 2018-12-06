package com.hpr.ac.dev.appdev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity3_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_1);

        TextView rcv_tv_text = (TextView) findViewById(R.id.rcv_tv_text);
        Intent intent = getIntent();
        String str = intent.getStringExtra("msg");

        rcv_tv_text.setText(str);
    }
}
