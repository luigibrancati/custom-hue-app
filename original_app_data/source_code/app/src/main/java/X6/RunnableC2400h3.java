package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.h3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2400h3 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Z3 f18964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2416j3 f18965b;

    public RunnableC2400h3(C2416j3 c2416j3, Z3 z32) {
        this.f18964a = z32;
        Objects.requireNonNull(c2416j3);
        this.f18965b = c2416j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2416j3 c2416j3 = this.f18965b;
        Z3 z32 = this.f18964a;
        c2416j3.p(z32);
        c2416j3.v(z32.f18672d);
    }
}
