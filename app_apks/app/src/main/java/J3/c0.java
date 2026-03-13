package J3;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface c0 {
    default void a(C0916y workSpecId) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        b(workSpecId, null);
    }

    void b(C0916y c0916y, WorkerParameters.a aVar);

    void c(C0916y c0916y, int i10);

    default void d(C0916y workSpecId, int i10) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        c(workSpecId, i10);
    }

    default void e(C0916y workSpecId) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        c(workSpecId, -512);
    }
}
