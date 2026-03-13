package B2;

import G1.C;
import G1.M;
import G1.t;
import i2.F;
import i2.J;
import i2.K;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f602a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f607f;

    public h(long[] jArr, long[] jArr2, long j10, long j11, long j12, int i10) {
        this.f602a = jArr;
        this.f603b = jArr2;
        this.f604c = j10;
        this.f605d = j11;
        this.f606e = j12;
        this.f607f = i10;
    }

    public static h a(long j10, long j11, F.a aVar, C c10) {
        int iL;
        c10.b0(6);
        int iU = c10.u();
        long j12 = j11 + ((long) aVar.f36866c);
        long jMax = ((long) iU) + j12;
        int iU2 = c10.u();
        if (iU2 <= 0) {
            return null;
        }
        long jZ0 = M.Z0((((long) iU2) * ((long) aVar.f36870g)) - 1, aVar.f36867d);
        int iT = c10.T();
        int iT2 = c10.T();
        int iT3 = c10.T();
        c10.b0(2);
        int i10 = iT2;
        long[] jArr = new long[iT];
        long[] jArr2 = new long[iT];
        int i11 = 0;
        long j13 = j11 + ((long) aVar.f36866c);
        while (i11 < iT) {
            long[] jArr3 = jArr2;
            long[] jArr4 = jArr;
            jArr4[i11] = (((long) i11) * jZ0) / ((long) iT);
            jArr3[i11] = j13;
            if (iT3 == 1) {
                iL = c10.L();
            } else if (iT3 == 2) {
                iL = c10.T();
            } else if (iT3 == 3) {
                iL = c10.O();
            } else {
                if (iT3 != 4) {
                    return null;
                }
                iL = c10.P();
            }
            int i12 = i11;
            int i13 = i10;
            j13 += ((long) iL) * ((long) i13);
            i10 = i13;
            i11 = i12 + 1;
            iT = iT;
            jArr = jArr4;
            jArr2 = jArr3;
        }
        long[] jArr5 = jArr2;
        long[] jArr6 = jArr;
        if (j10 != -1 && j10 != jMax) {
            t.h("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + jMax);
        }
        if (jMax != j13) {
            t.h("VbriSeeker", "VBRI bytes and ToC mismatch (using max): " + jMax + ", " + j13 + "\nSeeking will be inaccurate.");
            jMax = Math.max(jMax, j13);
        }
        return new h(jArr6, jArr5, jZ0, j12, jMax, aVar.f36869f);
    }

    @Override // B2.g
    public long b(long j10) {
        return this.f602a[M.h(this.f603b, j10, true, true)];
    }

    @Override // B2.g
    public long d() {
        return this.f605d;
    }

    @Override // i2.J
    public J.a e(long j10) {
        int iH = M.h(this.f602a, j10, true, true);
        K k10 = new K(this.f602a[iH], this.f603b[iH]);
        if (k10.f36877a >= j10 || iH == this.f602a.length - 1) {
            return new J.a(k10);
        }
        int i10 = iH + 1;
        return new J.a(k10, new K(this.f602a[i10], this.f603b[i10]));
    }

    @Override // B2.g
    public long g() {
        return this.f606e;
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // B2.g
    public int l() {
        return this.f607f;
    }

    @Override // i2.J
    public long m() {
        return this.f604c;
    }
}
