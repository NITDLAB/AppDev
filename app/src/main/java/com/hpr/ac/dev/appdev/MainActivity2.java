package com.hpr.ac.dev.appdev;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    Spinner spinner;
    public static Button button;
    String[] colors = {"light","amber","brown","dark"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        spinner = (Spinner) findViewById(R.id.color);
        button = (Button) findViewById(R.id.find_beer);

        ArrayAdapter aa = new ArrayAdapter(this, android.R.layout.simple_spinner_item, colors);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(aa);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        navigationView.getMenu().getItem(1).setChecked(true);
//    }

    public void func(View view) {
        TextView tv = (TextView)findViewById(R.id.tv_brands);
        String beerType = String.valueOf(spinner.getSelectedItem());

        tv.setText(beerType);
    }
}
