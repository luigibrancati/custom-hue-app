package n6;

import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: n6.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5136c extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f40613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f40614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CountDownLatch f40615c = new CountDownLatch(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f40616d = false;

    public C5136c(C5134a c5134a, long j10) {
        this.f40613a = new WeakReference(c5134a);
        this.f40614b = j10;
        start();
    }

    public final void a() {
        C5134a c5134a = (C5134a) this.f40613a.get();
        if (c5134a != null) {
            c5134a.c();
            this.f40616d = true;
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            if (this.f40615c.await(this.f40614b, TimeUnit.MILLISECONDS)) {
                return;
            }
            a();
        } catch (InterruptedException unused) {
            a();
        }
    }
}
