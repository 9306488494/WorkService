package com.devshakti.servicestart;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import static android.content.Context.ALARM_SERVICE;
import static android.content.Context.MODE_PRIVATE;

public class WorkFCM {

    public static void goScheduler(Context mcontext, String Activity) {
        // send to mainActivity
        int i=500;
        Intent intent1 = new Intent(mcontext, MyBroadcastReceiver.class);

        PendingIntent pendingIntent = PendingIntent.getBroadcast(
                mcontext.getApplicationContext(), 234324243, intent1, 0);
        AlarmManager alarmManager = (AlarmManager) mcontext.getSystemService(ALARM_SERVICE);
        assert alarmManager != null;
        alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis()+ (i * 1000), pendingIntent);
    }
}
