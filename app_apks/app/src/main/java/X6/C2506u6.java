package X6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.AbstractC3215i0;
import com.google.android.gms.internal.measurement.AbstractC3224j0;

/* JADX INFO: renamed from: X6.u6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2506u6 extends C6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AlarmManager f19245d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AbstractC2539z f19246e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f19247f;

    public C2506u6(R6 r62) {
        super(r62);
        this.f19245d = (AlarmManager) this.f18400a.d().getSystemService("alarm");
    }

    private final void p() {
        JobScheduler jobScheduler = (JobScheduler) this.f18400a.d().getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(q());
        }
    }

    private final int q() {
        if (this.f19247f == null) {
            this.f19247f = Integer.valueOf("measurement".concat(String.valueOf(this.f18400a.d().getPackageName())).hashCode());
        }
        return this.f19247f.intValue();
    }

    @Override // X6.C6
    public final boolean l() {
        AlarmManager alarmManager = this.f19245d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        p();
        return false;
    }

    public final void m(long j10) {
        j();
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.c();
        Context contextD = c2416j3.d();
        if (!a7.j0(contextD)) {
            c2416j3.a().v().a("Receiver not registered/enabled");
        }
        if (!a7.E(contextD, false)) {
            c2416j3.a().v().a("Service not registered/enabled");
        }
        n();
        c2416j3.a().w().b("Scheduling upload, millis", Long.valueOf(j10));
        c2416j3.e().c();
        c2416j3.w();
        if (j10 < Math.max(0L, ((Long) AbstractC2383f2.f18841M.b(null)).longValue()) && !o().c()) {
            o().b(j10);
        }
        c2416j3.c();
        Context contextD2 = c2416j3.d();
        ComponentName componentName = new ComponentName(contextD2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iQ = q();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        AbstractC3224j0.a(contextD2, new JobInfo.Builder(iQ, componentName).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void n() {
        j();
        this.f18400a.a().w().a("Unscheduling upload");
        AlarmManager alarmManager = this.f19245d;
        if (alarmManager != null) {
            alarmManager.cancel(r());
        }
        o().d();
        p();
    }

    public final AbstractC2539z o() {
        if (this.f19246e == null) {
            this.f19246e = new C2498t6(this, this.f19261b.g0());
        }
        return this.f19246e;
    }

    public final PendingIntent r() {
        Context contextD = this.f18400a.d();
        return PendingIntent.getBroadcast(contextD, 0, new Intent().setClassName(contextD, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), AbstractC3215i0.f29491a);
    }
}
