package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.g4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2393g4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R4 f18954a;

    public RunnableC2393g4(R4 r42) {
        Objects.requireNonNull(r42);
        this.f18954a = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18954a.f18505r.a();
    }
}
