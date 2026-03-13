package R3;

import I3.N;
import Q3.I;
import androidx.work.b;
import androidx.work.impl.WorkDatabase;
import gc.C4206t;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final void a(WorkDatabase workDatabase, androidx.work.a configuration, J3.F continuation) {
        int i10;
        AbstractC4862t.e(workDatabase, "workDatabase");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(continuation, "continuation");
        List listQ = C4206t.q(continuation);
        int i11 = 0;
        while (!listQ.isEmpty()) {
            J3.F f10 = (J3.F) gc.y.K(listQ);
            List listG = f10.g();
            AbstractC4862t.d(listG, "getWork(...)");
            if (listG == null || !listG.isEmpty()) {
                Iterator it = listG.iterator();
                i10 = 0;
                while (it.hasNext()) {
                    if (((N) it.next()).d().f13597j.g() && (i10 = i10 + 1) < 0) {
                        C4206t.t();
                    }
                }
            } else {
                i10 = 0;
            }
            i11 += i10;
            List listF = f10.f();
            if (listF != null) {
                listQ.addAll(listF);
            }
        }
        if (i11 == 0) {
            return;
        }
        int iA = workDatabase.W().A();
        int iB = configuration.b();
        if (iA + i11 <= iB) {
            return;
        }
        throw new IllegalArgumentException("Too many workers with contentUriTriggers are enqueued:\ncontentUriTrigger workers limit: " + iB + ";\nalready enqueued count: " + iA + ";\ncurrent enqueue operation count: " + i11 + ".\nTo address this issue you can: \n1. enqueue less workers or batch some of workers with content uri triggers together;\n2. increase limit via Configuration.Builder.setContentUriTriggerWorkersLimit;\nPlease beware that workers with content uri triggers immediately occupy slots in JobScheduler so no updates to content uris are missed.");
    }

    public static final I b(I workSpec) {
        AbstractC4862t.e(workSpec, "workSpec");
        boolean zG = workSpec.f13592e.g("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", String.class);
        boolean zG2 = workSpec.f13592e.g("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME", String.class);
        boolean zG3 = workSpec.f13592e.g("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME", String.class);
        if (zG || !zG2 || !zG3) {
            return workSpec;
        }
        return I.e(workSpec, null, null, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", null, new b.a().c(workSpec.f13592e).h("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", workSpec.f13590c).a(), null, 0L, 0L, 0L, null, 0, null, 0L, 0L, 0L, 0L, false, null, 0, 0, 0L, 0, 0, null, null, 33554411, null);
    }

    public static final I c(List schedulers, I workSpec) {
        AbstractC4862t.e(schedulers, "schedulers");
        AbstractC4862t.e(workSpec, "workSpec");
        return b(workSpec);
    }
}
