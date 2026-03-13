package X6;

import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X6.o4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2457o4 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f19141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R4 f19142b;

    public RunnableC2457o4(R4 r42, long j10) {
        this.f19141a = j10;
        Objects.requireNonNull(r42);
        this.f19142b = r42;
    }

    @Override // java.lang.Runnable
    public final void run() {
        R4 r42 = this.f19142b;
        r42.h();
        r42.j();
        C2416j3 c2416j3 = r42.f18400a;
        c2416j3.a().v().a("Resetting analytics data (FE)");
        C2416j3 c2416j32 = r42.f18400a;
        C2443m6 c2443m6Z = c2416j32.z();
        c2443m6Z.h();
        c2443m6Z.f19106f.c();
        c2416j32.L().p();
        boolean z10 = !r42.f18400a.g();
        N2 n2X = c2416j3.x();
        n2X.f18425f.b(this.f19141a);
        C2416j3 c2416j33 = n2X.f18400a;
        if (!TextUtils.isEmpty(c2416j33.x().f18442w.a())) {
            n2X.f18442w.b(null);
        }
        n2X.f18436q.b(0L);
        n2X.f18437r.b(0L);
        if (!c2416j33.w().L()) {
            n2X.y(z10);
        }
        n2X.f18443x.b(null);
        n2X.f18444y.b(0L);
        n2X.f18445z.b(null);
        c2416j32.J().p();
        c2416j32.z().f19105e.a();
        r42.f18506s = z10;
        c2416j32.J().q(new AtomicReference());
    }
}
