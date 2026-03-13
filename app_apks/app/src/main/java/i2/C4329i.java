package i2;

import i2.J;

/* JADX INFO: renamed from: i2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C4329i implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f36995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f36997e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f36999g;

    public C4329i(long j10, long j11, int i10, int i11, boolean z10) {
        this.f36993a = j10;
        this.f36994b = j11;
        this.f36995c = i11 == -1 ? 1 : i11;
        this.f36997e = i10;
        this.f36999g = z10;
        if (j10 == -1) {
            this.f36996d = -1L;
            this.f36998f = -9223372036854775807L;
        } else {
            this.f36996d = j10 - j11;
            this.f36998f = f(j10, j11, i10);
        }
    }

    public static long f(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    public final long a(long j10) {
        long j11 = (j10 * ((long) this.f36997e)) / 8000000;
        int i10 = this.f36995c;
        long jMin = (j11 / ((long) i10)) * ((long) i10);
        long j12 = this.f36996d;
        if (j12 != -1) {
            jMin = Math.min(jMin, j12 - ((long) i10));
        }
        return this.f36994b + Math.max(jMin, 0L);
    }

    public long c(long j10) {
        return f(j10, this.f36994b, this.f36997e);
    }

    @Override // i2.J
    public J.a e(long j10) {
        if (this.f36996d == -1 && !this.f36999g) {
            return new J.a(new K(0L, this.f36994b));
        }
        long jA = a(j10);
        long jC = c(jA);
        K k10 = new K(jC, jA);
        if (this.f36996d != -1 && jC < j10) {
            int i10 = this.f36995c;
            if (((long) i10) + jA < this.f36993a) {
                long j11 = jA + ((long) i10);
                return new J.a(k10, new K(c(j11), j11));
            }
        }
        return new J.a(k10);
    }

    @Override // i2.J
    public boolean h() {
        return this.f36996d != -1 || this.f36999g;
    }

    @Override // i2.J
    public long m() {
        return this.f36998f;
    }
}
