package com.alexandr.testwebview.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.alexandr.testwebview.Utils;
import com.alexandr.testwebview.workmanager.WorkRequest;

public class AlarmReceiverRepeatNotification extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences preferences = context.getSharedPreferences(Utils.OPEN_ACTIVITY, 0);
        int key = preferences.getInt("key", 0);
        int opened = preferences.getInt("opened", 0);
        countOpenActivity(key, preferences);
        getOpenedCount(opened, context);
    }

    public void countOpenActivity(int key, SharedPreferences sharedPreferences) {
        if (key == 1) {
            SharedPreferences.Editor editor = sharedPreferences.edit();
            int dopened = sharedPreferences.getInt("opened", 0);
            dopened++;
            editor.putInt("opened", dopened);
            editor.apply();

        }
    }

    public void getOpenedCount(int opened, Context context) {
        if (opened == 1) {
            WorkRequest.scheduleReminderOneDay(context);
        } else if (opened == 2) {
            WorkRequest.scheduleReminderTwoDay(context);
        } else if (opened == 3) {
            WorkRequest.scheduleReminderThreeDay(context);
        } else if (opened == 7) {
            WorkRequest.scheduleReminderSevenDay(context);
        } else if (opened == 8) {
            WorkRequest.scheduleReminderEightDay(context);
        } else if (opened == 10) {
            WorkRequest.scheduleReminderTenDay(context);
        } else if (opened == 13) {
            WorkRequest.scheduleReminderThirtTeenDay(context);
        } else if (opened == 17) {
            WorkRequest.scheduleReminderSevenTeenDay(context);
        } else if (opened == 21) {
            WorkRequest.scheduleReminderTwentyOneDay(context);
        } else if (opened == 27) {
            WorkRequest.scheduleReminderTwentySevenDay(context);
        } else if (opened == 30) {
            WorkRequest.scheduleReminderThirtyDay(context);
        }


    }
}
