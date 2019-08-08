package com.alexandr.testwebview.workmanager.NotifyWorker;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import com.alexandr.testwebview.R;
import com.alexandr.testwebview.notifytools.NotificationCreator;
import com.alexandr.testwebview.webview.MainActivity;

import java.util.Objects;

public class NotifyWorkerFirstLoadTwoDays extends Worker {
    private NotificationCreator mCreator;

    public NotifyWorkerFirstLoadTwoDays(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        sendNotification();
        return Result.success();
    }

    private PendingIntent createIntent() {
        Intent notificationIntent = new Intent(getApplicationContext(), MainActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP
                | Intent.FLAG_ACTIVITY_SINGLE_TOP);
        return PendingIntent.getActivity(getApplicationContext(), 0,
                notificationIntent, 0);
    }

    private void sendNotification() {
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        mCreator = new NotificationCreator(getApplicationContext());
        Objects.requireNonNull(notificationManager).notify(2, mCreator.notifyCreate(createIntent(), getApplicationContext(), R.string.always_twodays_title, R.string.always_twodays_text));
    }


}
