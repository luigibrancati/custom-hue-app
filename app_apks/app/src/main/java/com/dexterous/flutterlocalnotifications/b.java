package com.dexterous.flutterlocalnotifications;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b extends Service {
    public static int a(ArrayList arrayList) {
        int iIntValue = ((Integer) arrayList.get(0)).intValue();
        for (int i10 = 1; i10 < arrayList.size(); i10++) {
            iIntValue |= ((Integer) arrayList.get(i10)).intValue();
        }
        return iIntValue;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i10, int i11) {
        c cVar = Build.VERSION.SDK_INT >= 33 ? (c) intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter", c.class) : (c) intent.getSerializableExtra("com.dexterous.flutterlocalnotifications.ForegroundServiceStartParameter");
        Notification notificationCreateNotification = FlutterLocalNotificationsPlugin.createNotification(this, cVar.f28876a);
        if (cVar.f28878c != null) {
            startForeground(cVar.f28876a.f28886id.intValue(), notificationCreateNotification, a(cVar.f28878c));
        } else {
            startForeground(cVar.f28876a.f28886id.intValue(), notificationCreateNotification);
        }
        return cVar.f28877b;
    }
}
