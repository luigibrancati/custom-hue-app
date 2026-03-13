package X6;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class X5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ R6 f18650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f18651b;

    public X5(C2363c6 c2363c6, R6 r62, Runnable runnable) {
        this.f18650a = r62;
        this.f18651b = runnable;
        Objects.requireNonNull(c2363c6);
    }

    @Override // java.lang.Runnable
    public final void run() {
        R6 r62 = this.f18650a;
        r62.E();
        r62.D(this.f18651b);
        r62.r();
    }
}
