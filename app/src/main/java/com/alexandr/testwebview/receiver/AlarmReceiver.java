package com.alexandr.testwebview.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.alexandr.testwebview.workmanager.WorkRequest;

public class AlarmReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        int fourhours = intent.getIntExtra("four", 0);
        int twodays = intent.getIntExtra("two", 0);
        if (fourhours == 1)
            WorkRequest.scheduleReminderFourHours(context);
        if(twodays==2)
            WorkRequest.scheduleReminderTwoDays(context);
        }


    }

