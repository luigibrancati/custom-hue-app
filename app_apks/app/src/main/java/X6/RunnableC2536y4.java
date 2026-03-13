package X6;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.y4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2536y4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f19321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19322b;

    public RunnableC2536y4(R4 r42, AtomicReference atomicReference) {
        this.f19321a = atomicReference;
        Objects.requireNonNull(r42);
        this.f19322b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f19321a;
        synchronized (atomicReference) {
            try {
                try {
                    R4 r42 = this.f19322b;
                    atomicReference.set(Double.valueOf(r42.f18400a.w().G(r42.f18400a.L().q(), AbstractC2383f2.f18885f0)));
                } finally {
                    this.f19321a.notify();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
