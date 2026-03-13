package com.dexterous.flutterlocalnotifications;

import com.dexterous.flutterlocalnotifications.models.NotificationDetails;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationDetails f28876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f28878c;

    public c(NotificationDetails notificationDetails, int i10, ArrayList arrayList) {
        this.f28876a = notificationDetails;
        this.f28877b = i10;
        this.f28878c = arrayList;
    }

    public String toString() {
        return "ForegroundServiceStartParameter{notificationData=" + this.f28876a + ", startMode=" + this.f28877b + ", foregroundServiceTypes=" + this.f28878c + '}';
    }
}
