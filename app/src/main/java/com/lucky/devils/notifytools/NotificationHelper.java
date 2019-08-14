package com.lucky.devils.notifytools;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

import com.lucky.devils.receiver.AlarmReceiver;
import com.lucky.devils.receiver.AlarmReceiverRepeatNotification;

import java.util.Calendar;
import java.util.Objects;

import static android.content.Context.ALARM_SERVICE;

public class NotificationHelper {

    //Init Alarm after 4 hours down-g
    public static void scheduleSetElapsedNotificationFourHours(Context context) {
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("four",1);
        int ALARM_TYPE_ELAPSED = 101;
        PendingIntent alarmIntentElapsed = PendingIntent.getBroadcast(context, ALARM_TYPE_ELAPSED, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManagerElapsed = (AlarmManager) context.getSystemService(ALARM_SERVICE);
        Objects.requireNonNull(alarmManagerElapsed)
                .set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime() + 4*60*60 * 1000, alarmIntentElapsed);
    }

    public static void scheduleSetElapsedNotificationTwoDays(Context context) {
        Intent intent = new Intent(context, AlarmReceiver.class);
        intent.putExtra("two",2);
        PendingIntent alarmIntentElapsed = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(ALARM_SERVICE);
        assert alarmManager != null;
        alarmManager.set(AlarmManager.ELAPSED_REALTIME_WAKEUP, SystemClock.elapsedRealtime() +  2*24*60* 60 * 1000, alarmIntentElapsed);
    }

    // Set the alarm to start at 10:30 a.m.
   public static void scheduleSetRepeatingNotification(Context context) {
        AlarmManager alarmMgr = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, AlarmReceiverRepeatNotification.class);
        PendingIntent alarmIntent = PendingIntent.getBroadcast(context, 0, intent, 0);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY, 10);
        calendar.set(Calendar.MINUTE, 30);
        Objects.requireNonNull(alarmMgr).
                setInexactRepeating(AlarmManager.RTC_WAKEUP, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, alarmIntent);
    }
}
