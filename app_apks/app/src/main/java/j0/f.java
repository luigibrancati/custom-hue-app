package j0;

import gc.C4202o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f38875b = i.b(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f38876c = new int[16];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f38877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f38878e;

    public f() {
        int[] iArr = new int[16];
        int i10 = 0;
        while (i10 < 16) {
            int i11 = i10 + 1;
            iArr[i10] = i11;
            i10 = i11;
        }
        this.f38877d = iArr;
    }

    public final int a(long j10) {
        c(this.f38874a + 1);
        int i10 = this.f38874a;
        this.f38874a = i10 + 1;
        int iB = b();
        this.f38875b[i10] = j10;
        this.f38876c[i10] = iB;
        this.f38877d[iB] = i10;
        g(i10);
        return iB;
    }

    public final int b() {
        int length = this.f38877d.length;
        if (this.f38878e >= length) {
            int i10 = length * 2;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i11 + 1;
                iArr[i11] = i12;
                i11 = i12;
            }
            C4202o.p(this.f38877d, iArr, 0, 0, 0, 14, null);
            this.f38877d = iArr;
        }
        int i13 = this.f38878e;
        this.f38878e = this.f38877d[i13];
        return i13;
    }

    public final void c(int i10) {
        int length = this.f38875b.length;
        if (i10 <= length) {
            return;
        }
        int i11 = length * 2;
        long[] jArrB = i.b(i11);
        int[] iArr = new int[i11];
        C4202o.q(this.f38875b, jArrB, 0, 0, 0, 12, null);
        C4202o.p(this.f38876c, iArr, 0, 0, 0, 14, null);
        this.f38875b = jArrB;
        this.f38876c = iArr;
    }

    public final void d(int i10) {
        this.f38877d[i10] = this.f38878e;
        this.f38878e = i10;
    }

    public final void e(int i10) {
        int i11 = this.f38877d[i10];
        h(i11, this.f38874a - 1);
        this.f38874a--;
        g(i11);
        f(i11);
        d(i10);
    }

    public final void f(int i10) {
        long[] jArr = this.f38875b;
        int i11 = this.f38874a >> 1;
        while (i10 < i11) {
            int i12 = (i10 + 1) << 1;
            int i13 = i12 - 1;
            if (i12 >= this.f38874a || AbstractC4862t.g(jArr[i12], jArr[i13]) >= 0) {
                if (AbstractC4862t.g(jArr[i13], jArr[i10]) >= 0) {
                    return;
                }
                h(i13, i10);
                i10 = i13;
            } else {
                if (AbstractC4862t.g(jArr[i12], jArr[i10]) >= 0) {
                    return;
                }
                h(i12, i10);
                i10 = i12;
            }
        }
    }

    public final void g(int i10) {
        long[] jArr = this.f38875b;
        long j10 = jArr[i10];
        while (i10 > 0) {
            int i11 = ((i10 + 1) >> 1) - 1;
            if (AbstractC4862t.g(jArr[i11], j10) <= 0) {
                return;
            }
            h(i11, i10);
            i10 = i11;
        }
    }

    public final void h(int i10, int i11) {
        long[] jArr = this.f38875b;
        int[] iArr = this.f38876c;
        int[] iArr2 = this.f38877d;
        long j10 = jArr[i10];
        jArr[i10] = jArr[i11];
        jArr[i11] = j10;
        int i12 = iArr[i10];
        int i13 = iArr[i11];
        iArr[i10] = i13;
        iArr[i11] = i12;
        iArr2[i13] = i10;
        iArr2[i12] = i11;
    }
}
