package B6;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import io.sentry.rrweb.RRWebVideoEvent;
import java.lang.reflect.Method;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Method f684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Method f685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Method f686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Method f687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Method f688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Method f689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Method f690i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static Boolean f691j;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Method method6;
        Method method7;
        Method method8;
        Class cls = Integer.TYPE;
        f682a = Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f683b = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f684c = method2;
        try {
            method3 = WorkSource.class.getMethod(RRWebVideoEvent.JsonKeys.SIZE, null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f685d = method3;
        try {
            method4 = WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
            method4 = null;
        }
        f686e = method4;
        try {
            method5 = WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
            method5 = null;
        }
        f687f = method5;
        if (l.f()) {
            try {
                method6 = WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
                method6 = null;
            }
        } else {
            method6 = null;
        }
        f688g = method6;
        if (l.f()) {
            try {
                method7 = Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
                method7 = null;
            }
        } else {
            method7 = null;
        }
        f689h = method7;
        if (l.f()) {
            try {
                method8 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method8.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
                method8 = null;
            }
        } else {
            method8 = null;
        }
        f690i = method8;
        f691j = null;
    }

    public static void a(WorkSource workSource, int i10, String str) {
        Method method = f684c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i10), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f683b;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i10));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static WorkSource b(Context context, String str) {
        if (context != null && context.getPackageManager() != null && str != null) {
            try {
                ApplicationInfo applicationInfoC = D6.d.a(context).c(str, 0);
                if (applicationInfoC == null) {
                    Log.e("WorkSourceUtil", "Could not get applicationInfo from package: ".concat(str));
                    return null;
                }
                int i10 = applicationInfoC.uid;
                WorkSource workSource = new WorkSource();
                a(workSource, i10, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("WorkSourceUtil", "Could not find package: ".concat(str));
            }
        }
        return null;
    }

    public static synchronized boolean c(Context context) {
        Boolean bool = f691j;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context == null) {
            return false;
        }
        boolean z10 = L0.a.a(context, "android.permission.UPDATE_DEVICE_STATS") == 0;
        f691j = Boolean.valueOf(z10);
        return z10;
    }

    public static boolean d(WorkSource workSource) {
        Method method = f690i;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(workSource, null);
                AbstractC6056k.l(objInvoke);
                return ((Boolean) objInvoke).booleanValue();
            } catch (Exception e10) {
                Log.e("WorkSourceUtil", "Unable to check WorkSource emptiness", e10);
            }
        }
        return e(workSource) == 0;
    }

    public static int e(WorkSource workSource) {
        Method method = f685d;
        if (method == null) {
            return 0;
        }
        try {
            Object objInvoke = method.invoke(workSource, null);
            AbstractC6056k.l(objInvoke);
            return ((Integer) objInvoke).intValue();
        } catch (Exception e10) {
            Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
            return 0;
        }
    }
}
