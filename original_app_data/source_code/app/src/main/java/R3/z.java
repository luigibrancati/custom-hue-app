package R3;

import I3.AbstractC0890u;
import android.content.Context;
import android.os.PowerManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14558a;

    static {
        String strI = AbstractC0890u.i("WakeLocks");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f14558a = strI;
    }

    public static final PowerManager.WakeLock a(Context context, String tag) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(tag, "tag");
        Object systemService = context.getApplicationContext().getSystemService("power");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        String str = "WorkManager: " + tag;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, str);
        A a10 = A.f14504a;
        synchronized (a10) {
        }
        AbstractC4862t.b(wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
