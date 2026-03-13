package x;

import E.AbstractC0807p0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f47079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f47080b;

    public m2(Executor executor) {
        AbstractC4862t.e(executor, "executor");
        this.f47079a = executor;
        this.f47080b = new AtomicInteger(0);
    }

    public final int a() {
        return this.f47080b.get();
    }

    public final void b() {
        this.f47080b.set(0);
        AbstractC0807p0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
