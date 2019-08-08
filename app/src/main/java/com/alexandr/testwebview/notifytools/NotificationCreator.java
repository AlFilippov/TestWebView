package com.alexandr.testwebview.notifytools;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Color;

import androidx.core.app.NotificationCompat;

import com.alexandr.testwebview.R;

import static com.alexandr.testwebview.Utils.CHANNEL_ID;

public class NotificationCreator {
    private Context mContext;

    public NotificationCreator(Context context) {
        mContext = context;
    }


    public Notification notifyCreate(PendingIntent intent,Context context,int title,int text) {
        NotificationCompat.Builder notification = new NotificationCompat.Builder(mContext, CHANNEL_ID)
                .setContentTitle(context.getString(title))
                .setContentText(context.getString(text))
                .setContentIntent(intent)
                .setLights(Color.BLUE, 500, 500)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setVisibility(NotificationCompat.VISIBILITY_PUBLIC)
                .setPriority(2)
                .setAutoCancel(true);
        return notification.build();
    }
}
