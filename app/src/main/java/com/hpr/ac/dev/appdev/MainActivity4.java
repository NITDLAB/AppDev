package com.hpr.ac.dev.appdev;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity4 extends AppCompatActivity {

    private int seconds =0;
    private boolean running = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        runTimer();
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        // to check current activity in the navigation drawer
//        navigationView.getMenu().getItem(3).setChecked(true);
//    }

    public void onClickStart(View view) {
        running=true;
    }

    public void onClickStop(View view) {
        running=false;
    }

    public void onClickReset(View view) {
        running=false;
        seconds=0;
    }

    public void runTimer() {
        final TextView tv_timer = findViewById(R.id.tv_timer);
        final Handler handler = new Handler();

        handler.post(new Runnable() {
            @Override
            public void run() {
                int hours=seconds/3600;
                int minutes=(seconds%3600)/60;
                int secs=seconds%60;

                String time= String.format("%d:%02d:%02d",hours,minutes,secs);
                tv_timer.setText(time);

                if(running) seconds++;

                handler.postDelayed(this,1000);
            }
        });
    }
}
