package com.lucky.devils.workmanager.NotifyWorker.NotifyAfterSomeDays;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.lucky.devils.R;
import com.lucky.devils.notifytools.NotificationCreator;
import com.lucky.devils.webview.WebActivity;

import java.util.Objects;

public class NotifyWorkerAfterTwoDay extends Worker {
    private NotificationCreator mCreator;

    public NotifyWorkerAfterTwoDay(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }


    @NonNull
    @Override
    public Result doWork() {
        sendNotification();
        return Result.success();
    }

    private PendingIntent createIntent() {
        Intent notificationIntent = new Intent(getApplicationContext(), WebActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_NEW_TASK);
        return PendingIntent.getActivity(getApplicationContext(), 0,
                notificationIntent, 0);
    }

    private void sendNotification() {
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        mCreator = new NotificationCreator(getApplicationContext());
        Objects.requireNonNull(notificationManager).notify(1, mCreator.notifyCreate(createIntent(),
                getApplicationContext(), R.string.two_after_title, R.string.two_after_text));

    }


}
