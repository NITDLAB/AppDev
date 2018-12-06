package com.hpr.ac.dev.appdev;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;

import java.util.Random;

public class PrimeChecker extends Service {
    private Handler handler=null;

    public PrimeChecker() {
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d("logs","service started");
        fib();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n%2==0) return false;
        //if not, then just check the odds
        for(int i=3;i*i<=n;i+=2) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    private void fib() {
        handler =new Handler();

        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Random r = new Random();
                int low = 2;
                int high = 1000000;
                int random = r.nextInt(high-low) + low;

                if(isPrime(random)) {
//                    Log.d("FIB = ", random+" is prime");
                    Toast toast = Toast.makeText(getApplicationContext(),random+" is Prime",Toast.LENGTH_SHORT);
                    toast.show();
                }
                else {
//                    Log.d("FIB = ", random+" is not prime");
                    Toast toast = Toast.makeText(getApplicationContext(),random+" is not Prime",Toast.LENGTH_SHORT);
                    toast.show();
                }

                handler.postDelayed(this,5000);
            }
        },2000);
    }

    @Override
    public void onDestroy() {
        handler.removeCallbacksAndMessages(null);
        Log.d("logs","service stop");
        super.onDestroy();
    }
}
