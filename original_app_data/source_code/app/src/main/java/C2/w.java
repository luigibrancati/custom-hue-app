package C2;

import G1.AbstractC0853a;
import G1.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f1090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f1092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f1093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f1095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f1096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1097h;

    public w(t tVar, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        AbstractC0853a.a(iArr.length == jArr2.length);
        AbstractC0853a.a(jArr.length == jArr2.length);
        AbstractC0853a.a(iArr2.length == jArr2.length);
        this.f1090a = tVar;
        this.f1092c = jArr;
        this.f1093d = iArr;
        this.f1094e = i10;
        this.f1095f = jArr2;
        this.f1096g = iArr2;
        this.f1097h = j10;
        this.f1091b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j10) {
        for (int iH = M.h(this.f1095f, j10, true, false); iH >= 0; iH--) {
            if ((this.f1096g[iH] & 1) != 0) {
                return iH;
            }
        }
        return -1;
    }

    public int b(long j10) {
        for (int iD = M.d(this.f1095f, j10, true, false); iD < this.f1095f.length; iD++) {
            if ((this.f1096g[iD] & 1) != 0) {
                return iD;
            }
        }
        return -1;
    }
}
