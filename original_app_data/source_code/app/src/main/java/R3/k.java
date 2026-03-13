package R3;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f14535a;

    public k(WorkDatabase workDatabase) {
        AbstractC4862t.e(workDatabase, "workDatabase");
        this.f14535a = workDatabase;
    }

    public static final Integer c(k kVar, int i10, int i11) {
        int iD = l.d(kVar.f14535a, "next_job_scheduler_id");
        if (i10 > iD || iD > i11) {
            l.e(kVar.f14535a, "next_job_scheduler_id", i10 + 1);
        } else {
            i10 = iD;
        }
        return Integer.valueOf(i10);
    }

    public final int b(final int i10, final int i11) {
        Object objN = this.f14535a.N(new Callable() { // from class: R3.j
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return k.c(this.f14532a, i10, i11);
            }
        });
        AbstractC4862t.d(objN, "runInTransaction(...)");
        return ((Number) objN).intValue();
    }
}
