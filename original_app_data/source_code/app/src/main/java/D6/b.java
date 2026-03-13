package D6;

import B6.l;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f2274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f2275b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = f2274a;
        if (context2 != null && (bool = f2275b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        f2275b = null;
        if (l.e()) {
            f2275b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                f2275b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                f2275b = Boolean.FALSE;
            }
        }
        f2274a = applicationContext;
        return f2275b.booleanValue();
    }
}
