package androidx.work;

import I3.W;
import O7.e;
import android.content.Context;
import androidx.work.Worker;
import androidx.work.c;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/work/Worker;", "Landroidx/work/c;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Landroidx/work/c$a;", "L", "()Landroidx/work/c$a;", "LO7/e;", "I", "()LO7/e;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class Worker extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParams) {
        super(context, workerParams);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(workerParams, "workerParams");
    }

    public static final c.a M(Worker worker) {
        return worker.L();
    }

    @Override // androidx.work.c
    public final e I() {
        Executor executorA = A();
        AbstractC4862t.d(executorA, "getBackgroundExecutor(...)");
        return W.e(executorA, new InterfaceC6082a() { // from class: I3.O
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return Worker.M(this.f5581a);
            }
        });
    }

    public abstract c.a L();
}
