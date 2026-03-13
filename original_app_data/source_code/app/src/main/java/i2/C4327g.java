package i2;

import i2.J;
import java.util.Arrays;

/* JADX INFO: renamed from: i2.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4327g implements J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f36986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f36987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f36988c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f36989d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f36990e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f36991f;

    public C4327g(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f36987b = iArr;
        this.f36988c = jArr;
        this.f36989d = jArr2;
        this.f36990e = jArr3;
        int length = iArr.length;
        this.f36986a = length;
        if (length > 0) {
            this.f36991f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f36991f = 0L;
        }
    }

    public int a(long j10) {
        return G1.M.h(this.f36990e, j10, true, true);
    }

    @Override // i2.J
    public J.a e(long j10) {
        int iA = a(j10);
        K k10 = new K(this.f36990e[iA], this.f36988c[iA]);
        if (k10.f36877a >= j10 || iA == this.f36986a - 1) {
            return new J.a(k10);
        }
        int i10 = iA + 1;
        return new J.a(k10, new K(this.f36990e[i10], this.f36988c[i10]));
    }

    @Override // i2.J
    public boolean h() {
        return true;
    }

    @Override // i2.J
    public long m() {
        return this.f36991f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f36986a + ", sizes=" + Arrays.toString(this.f36987b) + ", offsets=" + Arrays.toString(this.f36988c) + ", timeUs=" + Arrays.toString(this.f36990e) + ", durationsUs=" + Arrays.toString(this.f36989d) + ")";
    }
}
