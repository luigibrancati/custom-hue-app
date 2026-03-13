package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.f4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2385f4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f18942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f18943b;

    public RunnableC2385f4(R4 r42, boolean z10) {
        this.f18942a = z10;
        Objects.requireNonNull(r42);
        this.f18943b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f18943b;
        C2416j3 c2416j3 = r42.f18400a;
        boolean zG = c2416j3.g();
        boolean zF = c2416j3.f();
        boolean z10 = this.f18942a;
        c2416j3.P(z10);
        if (zF == z10) {
            c2416j3.a().w().b("Default data collection state already set to", Boolean.valueOf(z10));
        }
        if (c2416j3.g() == zG || c2416j3.g() != c2416j3.f()) {
            c2416j3.a().t().c("Default data collection is different than actual status", Boolean.valueOf(z10), Boolean.valueOf(zG));
        }
        r42.Y();
    }
}
