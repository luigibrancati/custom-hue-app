package ha;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.app.m;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ha.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C4293a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f36379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f36380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f36382d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public m.e f36383e;

    public C4293a(Context context, String channelId, int i10) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(channelId, "channelId");
        this.f36379a = context;
        this.f36380b = channelId;
        this.f36381c = i10;
        this.f36382d = new h(null, null, null, null, null, null, false, 127, null);
        m.e eVarF = new m.e(context, channelId).F(1);
        AbstractC4862t.d(eVarF, "setPriority(...)");
        this.f36383e = eVarF;
        e(this.f36382d, false);
    }

    public final Notification a() {
        d(this.f36382d.a());
        Notification notificationD = this.f36383e.d();
        AbstractC4862t.d(notificationD, "build(...)");
        return notificationD;
    }

    public final PendingIntent b() {
        Intent intent;
        Intent launchIntentForPackage = this.f36379a.getPackageManager().getLaunchIntentForPackage(this.f36379a.getPackageName());
        Intent flags = (launchIntentForPackage == null || (intent = launchIntentForPackage.setPackage(null)) == null) ? null : intent.setFlags(270532608);
        if (flags != null) {
            return PendingIntent.getActivity(this.f36379a, 0, flags, 67108864);
        }
        return null;
    }

    public final int c(String str) {
        return this.f36379a.getResources().getIdentifier(str, "drawable", this.f36379a.getPackageName());
    }

    public final void d(String str) {
        NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this.f36379a);
        AbstractC4862t.d(notificationManagerCompatFrom, "from(...)");
        NotificationChannel notificationChannel = new NotificationChannel(this.f36380b, str, 0);
        notificationChannel.setLockscreenVisibility(0);
        notificationManagerCompatFrom.createNotificationChannel(notificationChannel);
    }

    public final void e(h hVar, boolean z10) {
        m.e eVarL;
        m.e eVarM;
        int iC = c(hVar.d());
        if (iC == 0) {
            iC = c("navigation_empty_icon");
        }
        m.e eVarO = this.f36383e.o(hVar.g()).L(iC).n(hVar.f()).O(hVar.c());
        AbstractC4862t.d(eVarO, "setSubText(...)");
        this.f36383e = eVarO;
        if (hVar.b() != null) {
            eVarL = this.f36383e.k(hVar.b().intValue()).l(true);
            AbstractC4862t.b(eVarL);
        } else {
            eVarL = this.f36383e.k(0).l(false);
            AbstractC4862t.b(eVarL);
        }
        this.f36383e = eVarL;
        if (hVar.e()) {
            eVarM = this.f36383e.m(b());
            AbstractC4862t.b(eVarM);
        } else {
            eVarM = this.f36383e.m(null);
            AbstractC4862t.b(eVarM);
        }
        this.f36383e = eVarM;
        if (z10) {
            NotificationManagerCompat notificationManagerCompatFrom = NotificationManagerCompat.from(this.f36379a);
            AbstractC4862t.d(notificationManagerCompatFrom, "from(...)");
            notificationManagerCompatFrom.notify(this.f36381c, this.f36383e.d());
        }
    }

    public final void f(h options, boolean z10) {
        AbstractC4862t.e(options, "options");
        if (!AbstractC4862t.a(options.a(), this.f36382d.a())) {
            d(options.a());
        }
        e(options, z10);
        this.f36382d = options;
    }
}
