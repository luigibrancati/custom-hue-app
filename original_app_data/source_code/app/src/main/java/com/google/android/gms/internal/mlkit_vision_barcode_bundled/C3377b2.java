package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.b2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3377b2 extends G0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f29833h = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G0 f29835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G0 f29836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f29837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29838g;

    public static int L(int i10) {
        int[] iArr = f29833h;
        int length = iArr.length;
        if (i10 >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i10];
    }

    public static G0 O(G0 g02, G0 g03) {
        if (g03.f() == 0) {
            return g02;
        }
        if (g02.f() == 0) {
            return g03;
        }
        int iF = g02.f() + g03.f();
        if (iF < 128) {
            return P(g02, g03);
        }
        if (g02 instanceof C3377b2) {
            C3377b2 c3377b2 = (C3377b2) g02;
            if (c3377b2.f29836e.f() + g03.f() < 128) {
                return new C3377b2(c3377b2.f29835d, P(c3377b2.f29836e, g03));
            }
            if (c3377b2.f29835d.k() > c3377b2.f29836e.k() && c3377b2.f29838g > g03.k()) {
                return new C3377b2(c3377b2.f29835d, new C3377b2(c3377b2.f29836e, g03));
            }
        }
        return iF >= L(Math.max(g02.k(), g03.k()) + 1) ? new C3377b2(g02, g03) : W1.a(new W1(null), g02, g03);
    }

    public static G0 P(G0 g02, G0 g03) {
        int iF = g02.f();
        int iF2 = g03.f();
        byte[] bArr = new byte[iF + iF2];
        g02.I(bArr, 0, 0, iF);
        g03.I(bArr, 0, iF, iF2);
        return new F0(bArr);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final byte c(int i10) {
        G0.E(i10, this.f29834c);
        return d(i10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final byte d(int i10) {
        int i11 = this.f29837f;
        return i10 < i11 ? this.f29835d.d(i10) : this.f29836e.d(i10 - i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof G0)) {
            return false;
        }
        G0 g02 = (G0) obj;
        if (this.f29834c != g02.f()) {
            return false;
        }
        if (this.f29834c == 0) {
            return true;
        }
        int iX = x();
        int iX2 = g02.x();
        if (iX != 0 && iX2 != 0 && iX != iX2) {
            return false;
        }
        Y1 y12 = null;
        Z1 z12 = new Z1(this, y12);
        E0 e0A = z12.next();
        Z1 z13 = new Z1(g02, y12);
        E0 e0A2 = z13.next();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int iF = e0A.f() - i10;
            int iF2 = e0A2.f() - i11;
            int iMin = Math.min(iF, iF2);
            if (!(i10 == 0 ? e0A.L(e0A2, i11, iMin) : e0A2.L(e0A, i10, iMin))) {
                return false;
            }
            i12 += iMin;
            int i13 = this.f29834c;
            if (i12 >= i13) {
                if (i12 == i13) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iF) {
                e0A = z12.next();
                i10 = 0;
            } else {
                i10 += iMin;
                e0A = e0A;
            }
            if (iMin == iF2) {
                e0A2 = z13.next();
                i11 = 0;
            } else {
                i11 += iMin;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int f() {
        return this.f29834c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final void h(byte[] bArr, int i10, int i11, int i12) {
        int i13 = i10 + i12;
        int i14 = this.f29837f;
        if (i13 <= i14) {
            this.f29835d.h(bArr, i10, i11, i12);
        } else {
            if (i10 >= i14) {
                this.f29836e.h(bArr, i10 - i14, i11, i12);
                return;
            }
            int i15 = i14 - i10;
            this.f29835d.h(bArr, i10, i11, i15);
            this.f29836e.h(bArr, 0, i11 + i15, i12 - i15);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new U1(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int k() {
        return this.f29838g;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final boolean l() {
        return this.f29834c >= L(this.f29838g);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int n(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f29837f;
        if (i13 <= i14) {
            return this.f29835d.n(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f29836e.n(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f29836e.n(this.f29835d.n(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final int p(int i10, int i11, int i12) {
        int i13 = i11 + i12;
        int i14 = this.f29837f;
        if (i13 <= i14) {
            return this.f29835d.p(i10, i11, i12);
        }
        if (i11 >= i14) {
            return this.f29836e.p(i10, i11 - i14, i12);
        }
        int i15 = i14 - i11;
        return this.f29836e.p(this.f29835d.p(i10, i11, i15), 0, i12 - i15);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final G0 r(int i10, int i11) {
        int iW = G0.w(i10, i11, this.f29834c);
        if (iW == 0) {
            return G0.f29754b;
        }
        if (iW == this.f29834c) {
            return this;
        }
        int i12 = this.f29837f;
        if (i11 <= i12) {
            return this.f29835d.r(i10, i11);
        }
        if (i10 >= i12) {
            return this.f29836e.r(i10 - i12, i11 - i12);
        }
        G0 g02 = this.f29835d;
        return new C3377b2(g02.r(i10, g02.f()), this.f29836e.r(0, i11 - this.f29837f));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final String s(Charset charset) {
        return new String(J(), charset);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final void t(C3484x0 c3484x0) {
        this.f29835d.t(c3484x0);
        this.f29836e.t(c3484x0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    public final boolean v() {
        G0 g02 = this.f29835d;
        G0 g03 = this.f29836e;
        return g03.p(g02.p(0, 0, this.f29837f), 0, g03.f()) == 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G0
    /* JADX INFO: renamed from: y */
    public final C0 iterator() {
        return new U1(this);
    }

    public C3377b2(G0 g02, G0 g03) {
        this.f29835d = g02;
        this.f29836e = g03;
        int iF = g02.f();
        this.f29837f = iF;
        this.f29834c = iF + g03.f();
        this.f29838g = Math.max(g02.k(), g03.k()) + 1;
    }
}
