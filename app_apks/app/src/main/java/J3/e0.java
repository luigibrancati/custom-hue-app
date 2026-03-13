package J3;

import androidx.work.WorkerParameters;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e0 implements c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0910s f5988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S3.b f5989b;

    public e0(C0910s processor, S3.b workTaskExecutor) {
        AbstractC4862t.e(processor, "processor");
        AbstractC4862t.e(workTaskExecutor, "workTaskExecutor");
        this.f5988a = processor;
        this.f5989b = workTaskExecutor;
    }

    public static final void g(e0 e0Var, C0916y c0916y, WorkerParameters.a aVar) {
        e0Var.f5988a.o(c0916y, aVar);
    }

    @Override // J3.c0
    public void b(final C0916y workSpecId, final WorkerParameters.a aVar) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        this.f5989b.d(new Runnable() { // from class: J3.d0
            @Override // java.lang.Runnable
            public final void run() {
                e0.g(this.f5985a, workSpecId, aVar);
            }
        });
    }

    @Override // J3.c0
    public void c(C0916y workSpecId, int i10) {
        AbstractC4862t.e(workSpecId, "workSpecId");
        this.f5989b.d(new R3.y(this.f5988a, workSpecId, false, i10));
    }
}
