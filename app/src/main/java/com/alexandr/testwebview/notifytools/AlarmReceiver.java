package com.alexandr.testwebview.notifytools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.alexandr.testwebview.workmanager.WorkRequest;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        WorkRequest.scheduleReminderFourHours(context);
    }

}
