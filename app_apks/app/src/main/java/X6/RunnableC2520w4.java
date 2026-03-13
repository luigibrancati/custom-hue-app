package X6;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.w4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2520w4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19286b;

    public RunnableC2520w4(R4 r42, AtomicReference atomicReference) {
        this.f19285a = atomicReference;
        Objects.requireNonNull(r42);
        this.f19286b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f19285a;
        synchronized (atomicReference) {
            try {
                try {
                    R4 r42 = this.f19286b;
                    atomicReference.set(Long.valueOf(r42.f18400a.w().D(r42.f18400a.L().q(), AbstractC2383f2.f18879d0)));
                } finally {
                    this.f19285a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
