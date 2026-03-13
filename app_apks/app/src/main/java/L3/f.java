package L3;

import I3.AbstractC0890u;
import I3.D;
import I3.L;
import J3.InterfaceC0912u;
import Q3.AbstractC1876v;
import Q3.C1870o;
import Q3.C1877w;
import Q3.I;
import Q3.J;
import Q3.q0;
import R3.k;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f implements InterfaceC0912u {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8555f = AbstractC0890u.i("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final JobScheduler f8557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f8558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkDatabase f8559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.a f8560e;

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar) {
        this(context, workDatabase, aVar, c.c(context), new d(context, aVar.a(), aVar.s()));
    }

    public static void b(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            c.c(context).cancelAll();
        }
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List listG = g(context, jobScheduler);
        if (listG == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            c(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void c(JobScheduler jobScheduler, int i10) {
        try {
            jobScheduler.cancel(i10);
        } catch (Throwable th) {
            AbstractC0890u.e().d(f8555f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i10)), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            C1877w c1877wH = h(jobInfo);
            if (c1877wH != null && str.equals(c1877wH.b())) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> listB = c.b(jobScheduler);
        if (listB == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : listB) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static C1877w h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new C1877w(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, WorkDatabase workDatabase) {
        JobScheduler jobSchedulerC = c.c(context);
        List<JobInfo> listG = g(context, jobSchedulerC);
        List listD = workDatabase.T().d();
        boolean z10 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                C1877w c1877wH = h(jobInfo);
                if (c1877wH != null) {
                    hashSet.add(c1877wH.b());
                } else {
                    c(jobSchedulerC, jobInfo.getId());
                }
            }
        }
        Iterator it = listD.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                AbstractC0890u.e().a(f8555f, "Reconciling jobs");
                z10 = true;
                break;
            }
        }
        if (!z10) {
            return z10;
        }
        workDatabase.h();
        try {
            J jW = workDatabase.W();
            Iterator it2 = listD.iterator();
            while (it2.hasNext()) {
                jW.o((String) it2.next(), -1L);
            }
            workDatabase.P();
            workDatabase.p();
            return z10;
        } catch (Throwable th) {
            workDatabase.p();
            throw th;
        }
    }

    @Override // J3.InterfaceC0912u
    public void a(String str) {
        List listF = f(this.f8556a, this.f8557b, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            c(this.f8557b, ((Integer) it.next()).intValue());
        }
        this.f8559d.T().e(str);
    }

    @Override // J3.InterfaceC0912u
    public boolean d() {
        return true;
    }

    @Override // J3.InterfaceC0912u
    public void e(I... iArr) {
        k kVar = new k(this.f8559d);
        for (I i10 : iArr) {
            this.f8559d.h();
            try {
                I i11 = this.f8559d.W().i(i10.f13588a);
                if (i11 == null) {
                    AbstractC0890u.e().k(f8555f, "Skipping scheduling " + i10.f13588a + " because it's no longer in the DB");
                    this.f8559d.P();
                } else if (i11.f13589b != L.c.ENQUEUED) {
                    AbstractC0890u.e().k(f8555f, "Skipping scheduling " + i10.f13588a + " because it is no longer enqueued");
                    this.f8559d.P();
                } else {
                    C1877w c1877wA = q0.a(i10);
                    C1870o c1870oB = this.f8559d.T().b(c1877wA);
                    int iB = c1870oB != null ? c1870oB.f13717c : kVar.b(this.f8560e.i(), this.f8560e.g());
                    if (c1870oB == null) {
                        this.f8559d.T().a(AbstractC1876v.a(c1877wA, iB));
                    }
                    j(i10, iB);
                    this.f8559d.P();
                }
            } finally {
                this.f8559d.p();
            }
        }
    }

    public void j(I i10, int i11) {
        JobInfo jobInfoA = this.f8558c.a(i10, i11);
        AbstractC0890u abstractC0890uE = AbstractC0890u.e();
        String str = f8555f;
        abstractC0890uE.a(str, "Scheduling work ID " + i10.f13588a + "Job ID " + i11);
        try {
            if (this.f8557b.schedule(jobInfoA) == 0) {
                AbstractC0890u.e().k(str, "Unable to schedule work ID " + i10.f13588a);
                if (i10.f13604q && i10.f13605r == D.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    i10.f13604q = false;
                    AbstractC0890u.e().a(str, String.format("Scheduling a non-expedited job (work ID %s)", i10.f13588a));
                    j(i10, i11);
                }
            }
        } catch (IllegalStateException e10) {
            String strA = c.a(this.f8556a, this.f8559d, this.f8560e);
            AbstractC0890u.e().c(f8555f, strA);
            IllegalStateException illegalStateException = new IllegalStateException(strA, e10);
            X0.a aVarL = this.f8560e.l();
            if (aVarL == null) {
                throw illegalStateException;
            }
            aVarL.accept(illegalStateException);
        } catch (Throwable th) {
            AbstractC0890u.e().d(f8555f, "Unable to schedule " + i10, th);
        }
    }

    public f(Context context, WorkDatabase workDatabase, androidx.work.a aVar, JobScheduler jobScheduler, d dVar) {
        this.f8556a = context;
        this.f8557b = jobScheduler;
        this.f8558c = dVar;
        this.f8559d = workDatabase;
        this.f8560e = aVar;
    }
}
