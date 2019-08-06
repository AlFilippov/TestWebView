package com.alexandr.testwebview;

import android.content.Context;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import java.util.concurrent.TimeUnit;

public class WorkRequest {
    static void scheduleReminder(Context context) {


        OneTimeWorkRequest workBuilder1 = new OneTimeWorkRequest.Builder(NotifyWorker.class).setInitialDelay(20, TimeUnit.SECONDS).build();

        WorkManager.getInstance(context).beginWith(workBuilder1).enqueue();
    }
}
