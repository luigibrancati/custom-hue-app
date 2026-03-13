package androidx.work.impl.background.systemjob;

import I3.AbstractC0890u;
import J3.C0910s;
import J3.C0916y;
import J3.InterfaceC0897e;
import J3.InterfaceC0917z;
import J3.c0;
import J3.e0;
import J3.g0;
import Q3.C1877w;
import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.net.Network;
import android.net.Uri;
import android.os.Looper;
import android.os.PersistableBundle;
import androidx.work.WorkerParameters;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements InterfaceC0897e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f24790e = AbstractC0890u.i("SystemJobService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g0 f24791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f24792b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC0917z f24793c = InterfaceC0917z.b(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c0 f24794d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {
        public static String[] a(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentAuthorities();
        }

        public static Uri[] b(JobParameters jobParameters) {
            return jobParameters.getTriggeredContentUris();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        public static Network a(JobParameters jobParameters) {
            return jobParameters.getNetwork();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {
        public static int a(JobParameters jobParameters) {
            return SystemJobService.b(jobParameters.getStopReason());
        }
    }

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    public static int b(int i10) {
        switch (i10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return i10;
            default:
                return -512;
        }
    }

    public static C1877w d(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C1877w(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // J3.InterfaceC0897e
    public void c(C1877w c1877w, boolean z10) {
        a("onExecuted");
        AbstractC0890u.e().a(f24790e, c1877w.b() + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.f24792b.remove(c1877w);
        this.f24793c.a(c1877w);
        if (jobParameters != null) {
            jobFinished(jobParameters, z10);
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        try {
            g0 g0VarL = g0.l(getApplicationContext());
            this.f24791a = g0VarL;
            C0910s c0910sN = g0VarL.n();
            this.f24794d = new e0(c0910sN, this.f24791a.r());
            c0910sN.e(this);
        } catch (IllegalStateException e10) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e10);
            }
            AbstractC0890u.e().k(f24790e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        g0 g0Var = this.f24791a;
        if (g0Var != null) {
            g0Var.n().m(this);
        }
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        if (this.f24791a == null) {
            AbstractC0890u.e().a(f24790e, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        C1877w c1877wD = d(jobParameters);
        if (c1877wD == null) {
            AbstractC0890u.e().c(f24790e, "WorkSpec id not found!");
            return false;
        }
        if (this.f24792b.containsKey(c1877wD)) {
            AbstractC0890u.e().a(f24790e, "Job is already being executed by SystemJobService: " + c1877wD);
            return false;
        }
        AbstractC0890u.e().a(f24790e, "onStartJob for " + c1877wD);
        this.f24792b.put(c1877wD, jobParameters);
        WorkerParameters.a aVar = new WorkerParameters.a();
        if (a.b(jobParameters) != null) {
            aVar.f24724b = Arrays.asList(a.b(jobParameters));
        }
        if (a.a(jobParameters) != null) {
            aVar.f24723a = Arrays.asList(a.a(jobParameters));
        }
        aVar.f24725c = b.a(jobParameters);
        this.f24794d.b(this.f24793c.d(c1877wD), aVar);
        return true;
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        a("onStopJob");
        if (this.f24791a == null) {
            AbstractC0890u.e().a(f24790e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        C1877w c1877wD = d(jobParameters);
        if (c1877wD == null) {
            AbstractC0890u.e().c(f24790e, "WorkSpec id not found!");
            return false;
        }
        AbstractC0890u.e().a(f24790e, "onStopJob for " + c1877wD);
        this.f24792b.remove(c1877wD);
        C0916y c0916yA = this.f24793c.a(c1877wD);
        if (c0916yA != null) {
            this.f24794d.d(c0916yA, c.a(jobParameters));
        }
        return !this.f24791a.n().j(c1877wD.b());
    }
}
