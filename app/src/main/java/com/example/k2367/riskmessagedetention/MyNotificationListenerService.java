package com.example.k2367.riskmessagedetention;

import android.service.notification.NotificationListenerService;
import android.service.notification.StatusBarNotification;

public class MyNotificationListenerService extends NotificationListenerService {
    @Override
    public void onNotificationPosted(StatusBarNotification sbn){
        Log.i("NotificationListener","Notification posted");
    }
}
