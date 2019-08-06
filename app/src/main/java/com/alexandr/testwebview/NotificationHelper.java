package com.alexandr.testwebview;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;

import java.util.Calendar;
import java.util.Locale;

import static android.content.Context.ALARM_SERVICE;

public class NotificationHelper {
    public static int ALARM_TYPE_ELAPSED = 101;
    private static AlarmManager alarmManagerElapsed;
    private static PendingIntent alarmIntentElapsed;
    public Locale mLocale;
    public static Calendar datetime;

    public static void scheduleRepeatingElapsedNotification(Context context) {

        Intent intent = new Intent(context, AlarmReceiver.class);

        alarmIntentElapsed = PendingIntent.getBroadcast(context, ALARM_TYPE_ELAPSED, intent, PendingIntent.FLAG_UPDATE_CURRENT);

        alarmManagerElapsed = (AlarmManager) context.getSystemService(ALARM_SERVICE);

        alarmManagerElapsed.set(alarmManagerElapsed.RTC_WAKEUP, AlarmManager.INTERVAL_DAY, alarmIntentElapsed);
    }
}
