package Q2;

import G1.M;
import i2.J;
import i2.K;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f13569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f13571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f13572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f13573e;

    public e(c cVar, int i10, long j10, long j11) {
        this.f13569a = cVar;
        this.f13570b = i10;
        this.f13571c = j10;
        long j12 = (j11 - j10) / ((long) cVar.f13562e);
        this.f13572d = j12;
        this.f13573e = a(j12);
    }

    public final long a(long j10) {
        return M.a1(j10 * ((long) this.f13570b), 1000000L, this.f13569a.f13560c);
    }

    @Override // i2.J
    public J.a e(long j10) {
        long jP = M.p((((long) this.f13569a.f13560c) * j10) / (((long) this.f13570b) * 1000000), 0L, this.f13572d - 1);
        long j11 = this.f13571c + (((long) this.f13569a.f13562e) * jP);
        long jA = a(jP);
        K k10 = new K(jA, j11);
        if (jA >= j10 || jP == this.f13572d - 1) {
            return new J.a(k10);
        }
        long j12 = jP + 1;
        return new J.a(k10, new K(a(j12), this.f13571c + (((long) this.f13569a.f13562e) * j12)));
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // i2.J
    public long m() {
        return this.f13573e;
    }
}
