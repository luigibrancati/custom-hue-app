package X6;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import v6.AbstractC6056k;

/* JADX INFO: renamed from: X6.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2368d3 extends FutureTask implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f18776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f18777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2384f3 f18778d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2368d3(C2384f3 c2384f3, Runnable runnable, boolean z10, String str) {
        super(runnable, null);
        Objects.requireNonNull(c2384f3);
        this.f18778d = c2384f3;
        AbstractC6056k.l(str);
        long andIncrement = C2384f3.f18933k.getAndIncrement();
        this.f18775a = andIncrement;
        this.f18777c = str;
        this.f18776b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2384f3.f18400a.a().o().a("Tasks index overflow");
        }
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C2368d3 c2368d3 = (C2368d3) obj;
        boolean z10 = c2368d3.f18776b;
        boolean z11 = this.f18776b;
        if (z11 != z10) {
            return !z11 ? 1 : -1;
        }
        long j10 = this.f18775a;
        long j11 = c2368d3.f18775a;
        if (j10 < j11) {
            return -1;
        }
        if (j10 > j11) {
            return 1;
        }
        this.f18778d.f18400a.a().p().b("Two tasks share the same index. index", Long.valueOf(j10));
        return 0;
    }

    @Override // java.util.concurrent.FutureTask
    public final void setException(Throwable th) {
        this.f18778d.f18400a.a().o().b(this.f18777c, th);
        super.setException(th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2368d3(C2384f3 c2384f3, Callable callable, boolean z10, String str) {
        super(callable);
        Objects.requireNonNull(c2384f3);
        this.f18778d = c2384f3;
        AbstractC6056k.l("Task exception on worker thread");
        long andIncrement = C2384f3.f18933k.getAndIncrement();
        this.f18775a = andIncrement;
        this.f18777c = "Task exception on worker thread";
        this.f18776b = z10;
        if (andIncrement == Long.MAX_VALUE) {
            c2384f3.f18400a.a().o().a("Tasks index overflow");
        }
    }
}
