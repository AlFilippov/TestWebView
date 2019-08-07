package com.alexandr.testwebview.notifytools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;

import com.alexandr.testwebview.Utils;

public class AlarmReceiverRepeatNotification extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        SharedPreferences preferences = context.getSharedPreferences(Utils.OPEN_ACTIVITY, 0);
        int key = preferences.getInt("key", 0);
//Создать счетчик запусков менеджера
    }

    public void countOpenActivity(int key) {
        if (key == 1) {

        }
    }
}
