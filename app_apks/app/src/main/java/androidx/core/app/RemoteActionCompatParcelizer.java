package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import v3.AbstractC6037a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC6037a abstractC6037a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f22471a = (IconCompat) abstractC6037a.v(remoteActionCompat.f22471a, 1);
        remoteActionCompat.f22472b = abstractC6037a.l(remoteActionCompat.f22472b, 2);
        remoteActionCompat.f22473c = abstractC6037a.l(remoteActionCompat.f22473c, 3);
        remoteActionCompat.f22474d = (PendingIntent) abstractC6037a.r(remoteActionCompat.f22474d, 4);
        remoteActionCompat.f22475e = abstractC6037a.h(remoteActionCompat.f22475e, 5);
        remoteActionCompat.f22476f = abstractC6037a.h(remoteActionCompat.f22476f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC6037a abstractC6037a) {
        abstractC6037a.x(false, false);
        abstractC6037a.M(remoteActionCompat.f22471a, 1);
        abstractC6037a.D(remoteActionCompat.f22472b, 2);
        abstractC6037a.D(remoteActionCompat.f22473c, 3);
        abstractC6037a.H(remoteActionCompat.f22474d, 4);
        abstractC6037a.z(remoteActionCompat.f22475e, 5);
        abstractC6037a.z(remoteActionCompat.f22476f, 6);
    }
}
