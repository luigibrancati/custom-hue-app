package g1;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: g1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4092b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f34911a;

    public C4092b(int i10) {
        this.f34911a = new AtomicInteger(i10);
    }

    public final int a() {
        return this.f34911a.decrementAndGet();
    }

    public final int b() {
        return this.f34911a.get();
    }

    public final int c() {
        return this.f34911a.getAndIncrement();
    }

    public final int d() {
        return this.f34911a.incrementAndGet();
    }
}
