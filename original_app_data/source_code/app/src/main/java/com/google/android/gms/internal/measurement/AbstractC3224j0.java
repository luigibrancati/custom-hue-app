package com.google.android.gms.internal.measurement;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.UserHandle;
import android.util.Log;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3224j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Method f29504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Method f29505b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        try {
            declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No scheduleAsPackage method available, falling back to schedule");
            }
            declaredMethod = null;
        }
        f29504a = declaredMethod;
        try {
            declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
        } catch (NoSuchMethodException unused2) {
            if (Log.isLoggable("JobSchedulerCompat", 6)) {
                Log.e("JobSchedulerCompat", "No myUserId method available");
            }
        }
        f29505b = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r3, android.app.job.JobInfo r4, java.lang.String r5, java.lang.String r6) {
        /*
            java.lang.String r5 = "jobscheduler"
            java.lang.Object r5 = r3.getSystemService(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.Object r5 = J7.n.j(r5)
            android.app.job.JobScheduler r5 = (android.app.job.JobScheduler) r5
            java.lang.reflect.Method r6 = com.google.android.gms.internal.measurement.AbstractC3224j0.f29504a
            if (r6 == 0) goto L6b
            java.lang.String r6 = "android.permission.UPDATE_DEVICE_STATS"
            int r3 = r3.checkSelfPermission(r6)
            if (r3 == 0) goto L1b
            goto L6b
        L1b:
            java.lang.reflect.Method r3 = com.google.android.gms.internal.measurement.AbstractC3224j0.f29505b
            r6 = 0
            if (r3 == 0) goto L32
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r3 = r3.invoke(r0, r1)     // Catch: java.lang.Throwable -> L30
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L30
            if (r3 == 0) goto L32
            int r3 = r3.intValue()     // Catch: java.lang.Throwable -> L30
            goto L43
        L30:
            r3 = move-exception
            goto L34
        L32:
            r3 = r6
            goto L43
        L34:
            r0 = 6
            java.lang.String r1 = "JobSchedulerCompat"
            boolean r0 = android.util.Log.isLoggable(r1, r0)
            if (r0 == 0) goto L32
            java.lang.String r0 = "myUserId invocation illegal"
            android.util.Log.e(r1, r0, r3)
            goto L32
        L43:
            java.lang.String r0 = "UploadAlarm"
            java.lang.String r1 = "com.google.android.gms"
            java.lang.reflect.Method r2 = com.google.android.gms.internal.measurement.AbstractC3224j0.f29504a
            if (r2 == 0) goto L66
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L60
            java.lang.Object[] r3 = new java.lang.Object[]{r4, r1, r3, r0}     // Catch: java.lang.Throwable -> L60
            java.lang.Object r3 = r2.invoke(r5, r3)     // Catch: java.lang.Throwable -> L60
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch: java.lang.Throwable -> L60
            if (r3 == 0) goto L6a
            int r6 = r3.intValue()     // Catch: java.lang.Throwable -> L60
            goto L6a
        L60:
            r3 = move-exception
            java.lang.String r6 = "error calling scheduleAsPackage"
            android.util.Log.e(r0, r6, r3)
        L66:
            int r6 = r5.schedule(r4)
        L6a:
            return r6
        L6b:
            int r3 = r5.schedule(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.AbstractC3224j0.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
