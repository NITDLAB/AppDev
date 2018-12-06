package com.hpr.ac.dev.appdev;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
    }

//    @Override
//    protected void onResume() {
//        super.onResume();
//        // to check current activity in the navigation drawer
//        navigationView.getMenu().getItem(4).setChecked(true);
//    }

    public void selectFrag(View view) {
        Fragment fr;

        if (view == findViewById(R.id.frag1)) {
            fr = new Frag5_1();
        } else {
            fr = new Frag5_2();
        }

        FragmentManager fm = getFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.replace(R.id.frag_place, fr);
        fragmentTransaction.commit();
    }
}
