package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.e6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2379e6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f18812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2443m6 f18813b;

    public RunnableC2379e6(C2443m6 c2443m6, long j10) {
        this.f18812a = j10;
        Objects.requireNonNull(c2443m6);
        this.f18813b = c2443m6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18813b.s(this.f18812a);
    }
}
