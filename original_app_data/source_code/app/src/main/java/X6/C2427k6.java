package X6;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: X6.k6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C2427k6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f19068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f19069b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC2539z f19070c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2443m6 f19071d;

    public C2427k6(C2443m6 c2443m6) {
        Objects.requireNonNull(c2443m6);
        this.f19071d = c2443m6;
        this.f19070c = new C2411i6(this, c2443m6.f18400a);
        long jC = c2443m6.f18400a.e().c();
        this.f19068a = jC;
        this.f19069b = jC;
    }

    public final void a(long j10) {
        this.f19071d.h();
        this.f19070c.d();
        this.f19068a = j10;
        this.f19069b = j10;
    }

    public final void b(long j10) {
        this.f19070c.d();
    }

    public final void c() {
        this.f19070c.d();
        long jC = this.f19071d.f18400a.e().c();
        this.f19068a = jC;
        this.f19069b = jC;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        C2443m6 c2443m6 = this.f19071d;
        c2443m6.h();
        c2443m6.j();
        if (c2443m6.f18400a.g()) {
            C2416j3 c2416j3 = c2443m6.f18400a;
            c2416j3.x().f18436q.b(c2416j3.e().a());
        }
        long j11 = j10 - this.f19068a;
        if (!z10 && j11 < 1000) {
            c2443m6.f18400a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f19069b;
            this.f19069b = j10;
        }
        C2416j3 c2416j32 = c2443m6.f18400a;
        c2416j32.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !c2416j32.w().N();
        C2416j3 c2416j33 = c2443m6.f18400a;
        a7.k0(c2416j33.I().q(z12), bundle, true);
        if (!z11) {
            c2416j33.B().t("auto", "_e", bundle);
        }
        this.f19068a = j10;
        AbstractC2539z abstractC2539z = this.f19070c;
        abstractC2539z.d();
        abstractC2539z.b(((Long) AbstractC2383f2.f18916r0.b(null)).longValue());
        return true;
    }
}
