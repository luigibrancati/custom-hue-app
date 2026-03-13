package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.d6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2371d6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2443m6 f18787b;

    public RunnableC2371d6(C2443m6 c2443m6, long j10) {
        this.f18786a = j10;
        Objects.requireNonNull(c2443m6);
        this.f18787b = c2443m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18787b.r(this.f18786a);
    }
}
