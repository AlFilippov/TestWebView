package com.alexandr.testwebview;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

public class AlarmReceiverRepeatNotification extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences preferences = context.getSharedPreferences(Utils.OPEN_ACTIVITY,0);
        preferences.getInt("key", 0);
    }
}
