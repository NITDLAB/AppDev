package com.hpr.ac.dev.appdev;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Console;

public class MainActivity3 extends AppCompatActivity {

    EditText msg;
//    Button btn,shareBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        msg = (EditText)findViewById(R.id.et_text);
//        btn = (Button)findViewById(R.id.btn_send_text);
//        shareBtn = (Button)findViewById(R.id.btn_share);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        // to check current activity in the navigation drawer
//        navigationView.getMenu().getItem(2).setChecked(true);
//    }

    public void onClickSendText(View view) {
        String str = msg.getText().toString();
        Intent it = new Intent(getApplicationContext(),MainActivity3_1.class);
        Log.i("str", str);
        it.putExtra("msg",str);
        startActivity(it);
    }

    public void onClickShare(View view) {
        String str = msg.getText().toString();
        Intent it = new Intent(Intent.ACTION_SEND);
        it.setType("text/plain");
        it.putExtra(Intent.EXTRA_TEXT,str);
        startActivity(it);
    }
}
