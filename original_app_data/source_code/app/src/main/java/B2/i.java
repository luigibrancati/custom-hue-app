package B2;

import G1.C;
import G1.M;
import i2.F;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F.a f608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f613f;

    public i(F.a aVar, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f608a = new F.a(aVar);
        this.f609b = j10;
        this.f610c = j11;
        this.f613f = jArr;
        this.f611d = i10;
        this.f612e = i11;
    }

    public static i b(F.a aVar, C c10) {
        long[] jArr;
        int i10;
        int i11;
        int iU = c10.u();
        int iP = (iU & 1) != 0 ? c10.P() : -1;
        long jN = (iU & 2) != 0 ? c10.N() : -1L;
        if ((iU & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = c10.L();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iU & 8) != 0) {
            c10.b0(4);
        }
        if (c10.a() >= 24) {
            c10.b0(21);
            int iO = c10.O();
            i11 = iO & 4095;
            i10 = (16773120 & iO) >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new i(aVar, iP, jN, jArr2, i10, i11);
    }

    public long a() {
        long j10 = this.f609b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        F.a aVar = this.f608a;
        return M.Z0((j10 * ((long) aVar.f36870g)) - 1, aVar.f36867d);
    }
}
