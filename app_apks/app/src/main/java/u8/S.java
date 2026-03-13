package u8;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f45297a = new AtomicInteger();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f45298b = new AtomicInteger();

    public int a() {
        return this.f45298b.get();
    }

    public int b() {
        return this.f45297a.get();
    }

    public void c() {
        this.f45298b.getAndIncrement();
    }

    public void d() {
        this.f45297a.getAndIncrement();
    }

    public void e() {
        this.f45298b.set(0);
    }
}
