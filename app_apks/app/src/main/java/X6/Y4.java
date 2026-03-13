package X6;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;
import com.google.android.gms.internal.measurement.EnumC3227j3;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Y4 extends AbstractC2399h2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JobScheduler f18658c;

    public Y4(C2416j3 c2416j3) {
        super(c2416j3);
    }

    @Override // X6.AbstractC2399h2
    public final boolean m() {
        return true;
    }

    @Override // X6.AbstractC2399h2
    public final void n() {
        this.f18658c = (JobScheduler) this.f18400a.d().getSystemService("jobscheduler");
    }

    public final void o(long j10) {
        j();
        h();
        JobScheduler jobScheduler = this.f18658c;
        if (jobScheduler != null && jobScheduler.getPendingJob(p()) != null) {
            this.f18400a.a().w().a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        EnumC3227j3 enumC3227j3Q = q();
        if (enumC3227j3Q != EnumC3227j3.CLIENT_UPLOAD_ELIGIBLE) {
            this.f18400a.a().w().b("[sgtm] Not eligible for Scion upload", enumC3227j3Q.name());
            return;
        }
        C2416j3 c2416j3 = this.f18400a;
        c2416j3.a().w().b("[sgtm] Scheduling Scion upload, millis", Long.valueOf(j10));
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        c2416j3.a().w().b("[sgtm] Scion upload job scheduled with result", ((JobScheduler) AbstractC6056k.l(this.f18658c)).schedule(new JobInfo.Builder(p(), new ComponentName(c2416j3.d(), "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j10).setOverrideDeadline(j10 + j10).setExtras(persistableBundle).build()) == 1 ? "SUCCESS" : "FAILURE");
    }

    public final int p() {
        return "measurement-client".concat(String.valueOf(this.f18400a.d().getPackageName())).hashCode();
    }

    public final EnumC3227j3 q() {
        j();
        h();
        if (this.f18658c == null) {
            return EnumC3227j3.MISSING_JOB_SCHEDULER;
        }
        C2416j3 c2416j3 = this.f18400a;
        if (!c2416j3.w().P()) {
            return EnumC3227j3.NOT_ENABLED_IN_MANIFEST;
        }
        C2416j3 c2416j32 = this.f18400a;
        return c2416j32.L().u() >= 119000 ? !a7.F(c2416j3.d(), "com.google.android.gms.measurement.AppMeasurementJobService") ? EnumC3227j3.MEASUREMENT_SERVICE_NOT_ENABLED : !c2416j32.J().y() ? EnumC3227j3.NON_PLAY_MODE : EnumC3227j3.CLIENT_UPLOAD_ELIGIBLE : EnumC3227j3.SDK_TOO_OLD;
    }
}
