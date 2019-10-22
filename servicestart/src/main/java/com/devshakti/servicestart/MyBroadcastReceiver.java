package com.devshakti.servicestart;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.ContactsContract;

import java.util.concurrent.TimeUnit;

import static android.content.Context.ALARM_SERVICE;

public class MyBroadcastReceiver extends BroadcastReceiver {
    //MediaPlayer mp;
    @Override
    public void onReceive(Context context, Intent intent) {
        //mp=MediaPlayer.create(context, R.raw.twin);
        //mp.start();


        // send to mainActivity
        int i=30;
        Intent intent1 = new Intent(context, MyBroadcastReceiver.class);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                context.getApplicationContext(), 234324243, intent1, 0);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(ALARM_SERVICE);
        assert alarmManager != null;
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ (i * 1000), pendingIntent);
    }
}
