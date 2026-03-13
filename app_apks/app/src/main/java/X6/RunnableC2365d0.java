package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2365d0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0 f18772b;

    public RunnableC2365d0(E0 e02, long j10) {
        this.f18771a = j10;
        Objects.requireNonNull(e02);
        this.f18772b = e02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18772b.n(this.f18771a);
    }
}
