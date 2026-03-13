package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.UserManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class J3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static UserManager f29241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile boolean f29242b = !a();

    public static boolean a() {
        return true;
    }

    public static boolean b(Context context) {
        return a() && !d(context);
    }

    public static boolean c(Context context) {
        return !a() || d(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        r5 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean d(android.content.Context r7) {
        /*
            boolean r0 = com.google.android.gms.internal.measurement.J3.f29242b
            r1 = 1
            if (r0 == 0) goto L6
            return r1
        L6:
            java.lang.Class<com.google.android.gms.internal.measurement.J3> r0 = com.google.android.gms.internal.measurement.J3.class
            monitor-enter(r0)
            boolean r2 = com.google.android.gms.internal.measurement.J3.f29242b     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r1
        Lf:
            r7 = move-exception
            goto L54
        L11:
            r2 = r1
        L12:
            r3 = 2
            r4 = 0
            r5 = 0
            if (r2 > r3) goto L4a
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.J3.f29241a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L25
            java.lang.Class<android.os.UserManager> r3 = android.os.UserManager.class
            java.lang.Object r3 = r7.getSystemService(r3)     // Catch: java.lang.Throwable -> Lf
            android.os.UserManager r3 = (android.os.UserManager) r3     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.J3.f29241a = r3     // Catch: java.lang.Throwable -> Lf
        L25:
            android.os.UserManager r3 = com.google.android.gms.internal.measurement.J3.f29241a     // Catch: java.lang.Throwable -> Lf
            if (r3 != 0) goto L2b
            r5 = r1
            goto L4e
        L2b:
            boolean r6 = r3.isUserUnlocked()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r6 != 0) goto L3b
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            boolean r7 = r3.isUserRunning(r6)     // Catch: java.lang.Throwable -> Lf java.lang.NullPointerException -> L3d
            if (r7 != 0) goto L4a
        L3b:
            r5 = r1
            goto L4a
        L3d:
            r3 = move-exception
            java.lang.String r5 = "DirectBootUtils"
            java.lang.String r6 = "Failed to check if user is unlocked."
            android.util.Log.w(r5, r6, r3)     // Catch: java.lang.Throwable -> Lf
            com.google.android.gms.internal.measurement.J3.f29241a = r4     // Catch: java.lang.Throwable -> Lf
            int r2 = r2 + 1
            goto L12
        L4a:
            if (r5 == 0) goto L4e
            com.google.android.gms.internal.measurement.J3.f29241a = r4     // Catch: java.lang.Throwable -> Lf
        L4e:
            if (r5 == 0) goto L52
            com.google.android.gms.internal.measurement.J3.f29242b = r1     // Catch: java.lang.Throwable -> Lf
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return r5
        L54:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.J3.d(android.content.Context):boolean");
    }
}
