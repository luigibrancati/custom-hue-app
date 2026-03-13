package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.h6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2403h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RunnableC2395g6 f18974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2443m6 f18975b;

    public C2403h6(C2443m6 c2443m6) {
        Objects.requireNonNull(c2443m6);
        this.f18975b = c2443m6;
    }

    public final void a() {
        C2443m6 c2443m6 = this.f18975b;
        c2443m6.h();
        RunnableC2395g6 runnableC2395g6 = this.f18974a;
        if (runnableC2395g6 != null) {
            c2443m6.t().removeCallbacks(runnableC2395g6);
        }
        C2416j3 c2416j3 = c2443m6.f18400a;
        c2416j3.x().f18439t.b(false);
        c2443m6.o(false);
        if (c2416j3.w().H(null, AbstractC2383f2.f18858U0)) {
            C2416j3 c2416j32 = c2443m6.f18400a;
            if (c2416j32.B().v0()) {
                c2416j3.a().w().a("Retrying trigger URI registration in foreground");
                c2416j32.B().x0();
            }
        }
    }

    public final void b(long j10) {
        C2443m6 c2443m6 = this.f18975b;
        this.f18974a = new RunnableC2395g6(this, c2443m6.f18400a.e().a(), j10);
        c2443m6.t().postDelayed(this.f18974a, 2000L);
    }
}
