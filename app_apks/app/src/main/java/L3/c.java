package L3;

import I3.AbstractC0890u;
import android.app.job.JobScheduler;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import gc.C4179C;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8549a;

    static {
        String strI = AbstractC0890u.i("SystemJobScheduler");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f8549a = strI;
    }

    public static final String a(Context context, WorkDatabase workDatabase, androidx.work.a configuration) {
        String str;
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(workDatabase, "workDatabase");
        AbstractC4862t.e(configuration, "configuration");
        int i10 = Build.VERSION.SDK_INT;
        int size = workDatabase.W().f().size();
        String strQ0 = "<faulty JobScheduler failed to getPendingJobs>";
        if (i10 >= 34) {
            JobScheduler jobSchedulerC = c(context);
            List listB = b(jobSchedulerC);
            if (listB != null) {
                List listG = f.g(context, jobSchedulerC);
                int size2 = listG != null ? listB.size() - listG.size() : 0;
                String str2 = null;
                if (size2 == 0) {
                    str = null;
                } else {
                    str = size2 + " of which are not owned by WorkManager";
                }
                Object systemService = context.getSystemService("jobscheduler");
                AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
                List listG2 = f.g(context, (JobScheduler) systemService);
                int size3 = listG2 != null ? listG2.size() : 0;
                if (size3 != 0) {
                    str2 = size3 + " from WorkManager in the default namespace";
                }
                strQ0 = C4179C.q0(C4206t.p(listB.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", str, str2), ",\n", null, null, 0, null, null, 62, null);
            }
        } else {
            List listG3 = f.g(context, c(context));
            if (listG3 != null) {
                strQ0 = listG3.size() + " jobs from WorkManager";
            }
        }
        return "JobScheduler 150 job limit exceeded.\nIn JobScheduler there are " + strQ0 + ".\nThere are " + size + " jobs tracked by WorkManager's database;\nthe Configuration limit is " + configuration.h() + '.';
    }

    public static final List b(JobScheduler jobScheduler) {
        AbstractC4862t.e(jobScheduler, "<this>");
        try {
            return a.f8547a.a(jobScheduler);
        } catch (Throwable th) {
            AbstractC0890u.e().d(f8549a, "getAllPendingJobs() is not reliable on this device.", th);
            return null;
        }
    }

    public static final JobScheduler c(Context context) {
        AbstractC4862t.e(context, "<this>");
        Object systemService = context.getSystemService("jobscheduler");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.app.job.JobScheduler");
        JobScheduler jobScheduler = (JobScheduler) systemService;
        return Build.VERSION.SDK_INT >= 34 ? b.f8548a.a(jobScheduler) : jobScheduler;
    }
}
