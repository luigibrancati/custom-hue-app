package Ga;

import android.app.Notification;
import android.content.Context;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4667a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f4668b = "foreground_service";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f4669c = 1002;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public static /* synthetic */ Notification b(q qVar, Context context, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = f.f4648i;
        }
        return qVar.a(context, i10);
    }

    public final Notification a(Context context, int i10) {
        AbstractC4862t.e(context, "context");
        Notification notificationD = new m.e(context, f4668b).L(c.f4631a).o(context.getResources().getString(i10)).d();
        AbstractC4862t.d(notificationD, "build(...)");
        return notificationD;
    }

    public final int c() {
        return f4669c;
    }

    public final Notification d(Context context, String str) {
        Notification notificationD = new m.e(context, f4668b).L(c.f4631a).o(str).d();
        AbstractC4862t.d(notificationD, "build(...)");
        return notificationD;
    }

    public final void e(Context context, int i10) {
        AbstractC4862t.e(context, "context");
        String string = context.getString(i10);
        AbstractC4862t.d(string, "getString(...)");
        NotificationManagerCompat.from(context).notify(f4669c, d(context, string));
    }
}
