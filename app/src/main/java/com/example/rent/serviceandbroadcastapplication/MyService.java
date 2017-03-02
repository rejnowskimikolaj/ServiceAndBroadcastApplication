package com.example.rent.serviceandbroadcastapplication;

import android.app.IntentService;
import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by RENT on 2017-03-02.
 */

public class MyService extends IntentService {

    public static final String MY_ACTION = "com.example.rent.serviceandbroadcastapplication.myaction";
    public static final String MESSAGE = "com.example.rent.serviceandbroadcastapplication.message";


    public MyService() {
        super("myService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Intent i = new Intent(MY_ACTION);
        i.putExtra(MESSAGE, SimpleDateFormat.getDateTimeInstance().format(new Date()));
        LocalBroadcastManager.getInstance(this).sendBroadcast(i);

    }
}
