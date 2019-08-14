package com.lucky.devils.workmanager;

import android.content.Context;

import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;

import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterEightDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterOneDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterSevenDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterSevenTeenDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterTenDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterThirtTeenDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterThirtyDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterThreeDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterTwentyOneDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterTwentySevenDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays.NotifyWorkerAfterTwoDay;
import com.lucky.devils.workmanager.NotifyWorker.NotifyWorkerFirstLoadFourHours;
import com.lucky.devils.workmanager.NotifyWorker.NotifyWorkerFirstLoadTwoDays;

import java.util.concurrent.TimeUnit;

public class WorkRequest {
    public static void scheduleReminderFourHours(Context context) {
        OneTimeWorkRequest workBuilderFourHours = new OneTimeWorkRequest.Builder
                (NotifyWorkerFirstLoadFourHours.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderFourHours, context);
    }

    public static void scheduleReminderTwoDays(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerFirstLoadTwoDays.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderOneDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterOneDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderTwoDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterTwoDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderThreeDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterThreeDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderSevenDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterSevenDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderEightDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterEightDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderTenDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterTenDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderThirtTeenDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterThirtTeenDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderSevenTeenDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterSevenTeenDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderTwentyOneDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterTwentyOneDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderTwentySevenDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterTwentySevenDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    public static void scheduleReminderThirtyDay(Context context) {
        OneTimeWorkRequest workBuilderTwoDays = new OneTimeWorkRequest.Builder
                (NotifyWorkerAfterThirtyDay.class).setInitialDelay(20, TimeUnit.SECONDS).build();
        setWorkManager(workBuilderTwoDays, context);
    }

    private static void setWorkManager(OneTimeWorkRequest oneTimeWorkRequest, Context context) {
        WorkManager.getInstance(context).beginWith(oneTimeWorkRequest).enqueue();
    }
}
