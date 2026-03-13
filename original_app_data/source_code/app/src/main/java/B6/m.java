package B6;

import android.app.Application;
import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Boolean f680b;

    public static String a() {
        if (f679a == null) {
            f679a = Application.getProcessName();
        }
        return f679a;
    }

    public static boolean b() {
        Boolean boolValueOf = f680b;
        if (boolValueOf == null) {
            if (l.f()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = J6.q.a(Process.class, "isIsolated", new J6.p[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new J6.t(J6.s.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f680b = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}
