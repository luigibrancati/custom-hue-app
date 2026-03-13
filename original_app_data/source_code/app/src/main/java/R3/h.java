package R3;

import I3.AbstractC0890u;
import J3.AbstractC0915x;
import J3.g0;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f14531a = AbstractC0890u.i("EnqueueRunnable");

    public static boolean a(J3.F f10) {
        g0 g0VarH = f10.h();
        WorkDatabase workDatabaseQ = g0VarH.q();
        workDatabaseQ.h();
        try {
            i.a(workDatabaseQ, g0VarH.j(), f10);
            boolean zE = e(f10);
            workDatabaseQ.P();
            return zE;
        } finally {
            workDatabaseQ.p();
        }
    }

    public static void b(J3.F f10) {
        if (!f10.i()) {
            if (a(f10)) {
                f(f10);
            }
        } else {
            throw new IllegalStateException("WorkContinuation has cycles (" + f10 + ")");
        }
    }

    public static boolean c(J3.F f10) {
        boolean zD = d(f10.h(), f10.g(), (String[]) J3.F.m(f10).toArray(new String[0]), f10.e(), f10.c());
        f10.l();
        return zD;
    }

    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(J3.g0 r18, java.util.List r19, java.lang.String[] r20, java.lang.String r21, I3.EnumC0879i r22) {
        /*
            Method dump skipped, instruction units count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: R3.h.d(J3.g0, java.util.List, java.lang.String[], java.lang.String, I3.i):boolean");
    }

    public static boolean e(J3.F f10) {
        List<J3.F> listF = f10.f();
        boolean zE = false;
        if (listF != null) {
            for (J3.F f11 : listF) {
                if (f11.k()) {
                    AbstractC0890u.e().k(f14531a, "Already enqueued work ids (" + TextUtils.join(", ", f11.d()) + ")");
                } else {
                    zE |= e(f11);
                }
            }
        }
        return c(f10) | zE;
    }

    public static void f(J3.F f10) {
        g0 g0VarH = f10.h();
        AbstractC0915x.f(g0VarH.j(), g0VarH.q(), g0VarH.o());
    }
}
