package androidx.work.impl.utils;

import I3.AbstractC0890u;
import I3.L;
import J3.AbstractC0915x;
import J3.g0;
import L3.f;
import Q3.D;
import Q3.I;
import Q3.J;
import R3.s;
import R3.t;
import U0.n;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.text.TextUtils;
import androidx.work.a;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24814e = AbstractC0890u.i("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long f24815f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g0 f24817b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f24818c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24819d = 0;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String f24820a = AbstractC0890u.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            AbstractC0890u.e().j(f24820a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, g0 g0Var) {
        this.f24816a = context.getApplicationContext();
        this.f24817b = g0Var;
        this.f24818c = g0Var.m();
    }

    public static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    public static PendingIntent d(Context context, int i10) {
        return PendingIntent.getBroadcast(context, -1, c(context), i10);
    }

    public static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, 167772160);
        long jCurrentTimeMillis = System.currentTimeMillis() + f24815f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = f.i(this.f24816a, this.f24817b.q());
        WorkDatabase workDatabaseQ = this.f24817b.q();
        J jW = workDatabaseQ.W();
        D dV = workDatabaseQ.V();
        workDatabaseQ.h();
        try {
            List<I> listU = jW.u();
            boolean z10 = (listU == null || listU.isEmpty()) ? false : true;
            if (z10) {
                for (I i10 : listU) {
                    jW.b(L.c.ENQUEUED, i10.f13588a);
                    jW.e(i10.f13588a, -512);
                    jW.o(i10.f13588a, -1L);
                }
            }
            dV.b();
            workDatabaseQ.P();
            workDatabaseQ.p();
            return z10 || zI;
        } catch (Throwable th) {
            workDatabaseQ.p();
            throw th;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            AbstractC0890u.e().a(f24814e, "Rescheduling Workers.");
            this.f24817b.t();
            this.f24817b.m().e(false);
        } else if (e()) {
            AbstractC0890u.e().a(f24814e, "Application was force-stopped, rescheduling.");
            this.f24817b.t();
            this.f24818c.d(this.f24817b.j().a().a());
        } else if (zA) {
            AbstractC0890u.e().a(f24814e, "Found unfinished work, scheduling it.");
            AbstractC0915x.f(this.f24817b.j(), this.f24817b.q(), this.f24817b.o());
        }
    }

    public boolean e() {
        try {
            PendingIntent pendingIntentD = d(this.f24816a, 570425344);
            if (pendingIntentD != null) {
                pendingIntentD.cancel();
            }
            List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f24816a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
            if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                long jA = this.f24818c.a();
                for (int i10 = 0; i10 < historicalProcessExitReasons.size(); i10++) {
                    ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(i10);
                    if (applicationExitInfo.getReason() == 10 && applicationExitInfo.getTimestamp() >= jA) {
                        return true;
                    }
                }
            }
            return false;
        } catch (IllegalArgumentException | SecurityException e10) {
            AbstractC0890u.e().l(f24814e, "Ignoring exception", e10);
            return true;
        }
    }

    public boolean f() {
        a aVarJ = this.f24817b.j();
        if (TextUtils.isEmpty(aVarJ.c())) {
            AbstractC0890u.e().a(f24814e, "The default process name was not specified.");
            return true;
        }
        boolean zB = t.b(this.f24816a, aVarJ);
        AbstractC0890u.e().a(f24814e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f24817b.m().b();
    }

    public void i(long j10) {
        try {
            Thread.sleep(j10);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (f()) {
                while (true) {
                    try {
                        J3.I.c(this.f24816a);
                        AbstractC0890u.e().a(f24814e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e10) {
                            int i10 = this.f24819d + 1;
                            this.f24819d = i10;
                            if (i10 >= 3) {
                                String str = n.a(this.f24816a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                AbstractC0890u abstractC0890uE = AbstractC0890u.e();
                                String str2 = f24814e;
                                abstractC0890uE.d(str2, str, e10);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e10);
                                X0.a aVarE = this.f24817b.j().e();
                                if (aVarE == null) {
                                    throw illegalStateException;
                                }
                                AbstractC0890u.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                aVarE.accept(illegalStateException);
                            } else {
                                AbstractC0890u.e().b(f24814e, "Retrying after " + (((long) i10) * 300), e10);
                                i(((long) this.f24819d) * 300);
                            }
                        }
                    } catch (SQLiteException e11) {
                        AbstractC0890u.e().c(f24814e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e11);
                        X0.a aVarE2 = this.f24817b.j().e();
                        if (aVarE2 == null) {
                            throw illegalStateException2;
                        }
                        aVarE2.accept(illegalStateException2);
                    }
                }
            }
        } finally {
            this.f24817b.s();
        }
    }
}
