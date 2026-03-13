package X6;

import java.util.Objects;

/* JADX INFO: renamed from: X6.g6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC2395g6 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f18957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2403h6 f18959c;

    public RunnableC2395g6(C2403h6 c2403h6, long j10, long j11) {
        Objects.requireNonNull(c2403h6);
        this.f18959c = c2403h6;
        this.f18957a = j10;
        this.f18958b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18959c.f18975b.f18400a.b().t(new Runnable() { // from class: X6.f6
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                RunnableC2395g6 runnableC2395g6 = this.f18945a;
                C2443m6 c2443m6 = runnableC2395g6.f18959c.f18975b;
                c2443m6.h();
                C2416j3 c2416j3 = c2443m6.f18400a;
                c2416j3.a().v().a("Application going to the background");
                c2416j3.x().f18439t.b(true);
                c2443m6.o(true);
                if (!c2416j3.w().N()) {
                    long j10 = runnableC2395g6.f18958b;
                    C2427k6 c2427k6 = c2443m6.f19106f;
                    c2427k6.d(false, false, j10);
                    c2427k6.b(j10);
                }
                c2416j3.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(runnableC2395g6.f18957a));
                C2416j3 c2416j32 = c2443m6.f18400a;
                R4 r4B = c2416j32.B();
                r4B.h();
                C2416j3 c2416j33 = r4B.f18400a;
                r4B.j();
                U5 u5J = c2416j33.J();
                u5J.h();
                u5J.j();
                if (!u5J.y() || u5J.f18400a.C().W() >= 242600) {
                    c2416j33.J().t();
                }
                if (c2416j3.w().H(null, AbstractC2383f2.f18846O0)) {
                    long jD = c2416j3.C().P(c2416j3.d().getPackageName(), c2416j3.w().R()) ? 1000L : c2416j3.w().D(c2416j3.d().getPackageName(), AbstractC2383f2.f18825E);
                    c2416j3.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jD));
                    c2416j32.N().o(jD);
                }
            }
        });
    }
}
