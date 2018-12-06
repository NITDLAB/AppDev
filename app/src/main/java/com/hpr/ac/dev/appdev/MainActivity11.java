package com.hpr.ac.dev.appdev;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity11 extends AppCompatActivity {

    private LinearLayout linearLayout_11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        linearLayout_11=findViewById(R.id.linearLayout_11);
    }

    public void onClickStart(View view) {
        startService(new Intent(this, PrimeChecker.class));
        Snackbar snackbar = Snackbar.make(linearLayout_11, "Service Started", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }

    public void onClickStop(View view) {
        stopService(new Intent(this, PrimeChecker.class));

        Snackbar snackbar = Snackbar.make(linearLayout_11, "Service Stopped", Snackbar.LENGTH_SHORT);
        snackbar.show();
    }
}
