package za;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import gc.C4205s;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static /* synthetic */ Notification d(j jVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = t.f48876c;
        }
        return jVar.c(context, i10);
    }

    public final void a(Context context) {
        AbstractC4862t.e(context, "context");
        Object systemService = context.getSystemService("notification");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        ((NotificationManager) systemService).createNotificationChannels(C4205s.d(b()));
    }

    public final NotificationChannel b() {
        NotificationChannel notificationChannel = new NotificationChannel("foreground_service", "Background Processing notification", 2);
        notificationChannel.setDescription("Information about background processing is displayed by this category of notification.");
        return notificationChannel;
    }

    public final Notification c(Context context, int i10) {
        AbstractC4862t.e(context, "context");
        Notification notificationD = new m.e(context, "foreground_service").L(q.f48865a).o(context.getResources().getString(i10)).d();
        AbstractC4862t.d(notificationD, "build(...)");
        return notificationD;
    }

    public final int e() {
        return 1001;
    }

    public final Notification f(Context context, String str) {
        Notification notificationD = new m.e(context, "foreground_service").L(q.f48865a).o(str).d();
        AbstractC4862t.d(notificationD, "build(...)");
        return notificationD;
    }

    public final void g(String title, Context context) {
        AbstractC4862t.e(title, "title");
        AbstractC4862t.e(context, "context");
        NotificationManagerCompat.from(context).notify(1001, f(context, title));
    }
}
