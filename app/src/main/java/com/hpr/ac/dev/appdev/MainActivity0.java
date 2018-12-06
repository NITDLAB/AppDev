package com.hpr.ac.dev.appdev;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity0 extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    DrawerLayout drawer;
    NavigationView navigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main0);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.main_activity0, menu);
//        return true;
//    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();


        if (id == R.id.Activity1) {
            startActivity(new Intent(getApplicationContext(), MainActivity1.class));
        } else if (id == R.id.Activity2) {
            startActivity(new Intent(getApplicationContext(), MainActivity2.class));
        } else if (id == R.id.Activity3) {
            startActivity(new Intent(getApplicationContext(), MainActivity3.class));
        } else if (id == R.id.Activity4) {
            startActivity(new Intent(getApplicationContext(), MainActivity4.class));
        } else if (id == R.id.Activity5) {
            startActivity(new Intent(getApplicationContext(), MainActivity5.class));
        } else if (id == R.id.Activity6) {
            startActivity(new Intent(getApplicationContext(), MainActivity6.class));
        } else if (id == R.id.Activity7) {
            startActivity(new Intent(getApplicationContext(), MainActivity7.class));
        } else if (id == R.id.Activity8) {
            startActivity(new Intent(getApplicationContext(), MainActivity8.class));
        } else if (id == R.id.Activity9) {
            startActivity(new Intent(getApplicationContext(), MainActivity9.class));
        } else if (id == R.id.Activity10) {
            startActivity(new Intent(getApplicationContext(), MainActivity10.class));
        } else if (id == R.id.Activity11) {
            startActivity(new Intent(getApplicationContext(), MainActivity11.class));
        }


            DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
