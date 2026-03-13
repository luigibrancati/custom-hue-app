package com.google.android.gms.internal.measurement;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class H4 extends J4 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f29217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29219f;

    public H4(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f29217d = bArr;
        this.f29219f = 0;
        this.f29218e = i11;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void A(int i10) throws I4 {
        int i11 = this.f29219f;
        try {
            byte[] bArr = this.f29217d;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f29219f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new I4(i11, this.f29218e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void B(long j10) throws I4 {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i11;
        boolean z10 = J4.f29244c;
        int i12 = this.f29219f;
        if (!z10 || this.f29218e - i12 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    i11 = i12 + 1;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                }
                try {
                    this.f29217d[i12] = (byte) (((int) j10) | 128);
                    j10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                    i12 = i11;
                    throw new I4(i12, this.f29218e, 1, indexOutOfBoundsException);
                }
            }
            i10 = i12 + 1;
            try {
                this.f29217d[i12] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i12 = i10;
                throw new I4(i12, this.f29218e, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                AbstractC3194f6.u(this.f29217d, i12, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i12++;
            }
            i10 = i12 + 1;
            AbstractC3194f6.u(this.f29217d, i12, (byte) j10);
        }
        this.f29219f = i10;
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void C(long j10) throws I4 {
        int i10 = this.f29219f;
        try {
            byte[] bArr = this.f29217d;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f29219f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new I4(i10, this.f29218e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void D(byte[] bArr, int i10, int i11) {
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void E(String str) throws I4 {
        int i10 = this.f29219f;
        try {
            int iG = J4.G(str.length() * 3);
            int iG2 = J4.G(str.length());
            if (iG2 != iG) {
                z(AbstractC3221i6.b(str));
                byte[] bArr = this.f29217d;
                int i11 = this.f29219f;
                this.f29219f = AbstractC3221i6.c(str, bArr, i11, this.f29218e - i11);
                return;
            }
            int i12 = i10 + iG2;
            this.f29219f = i12;
            int iC = AbstractC3221i6.c(str, this.f29217d, i12, this.f29218e - i12);
            this.f29219f = i10;
            z((iC - i10) - iG2);
            this.f29219f = iC;
        } catch (C3212h6 e10) {
            this.f29219f = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new I4(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final int F() {
        return this.f29218e - this.f29219f;
    }

    public final void H(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f29217d, this.f29219f, i11);
            this.f29219f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new I4(this.f29219f, this.f29218e, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void i(int i10, int i11) throws I4 {
        z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void j(int i10, int i11) throws I4 {
        z(i10 << 3);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void k(int i10, int i11) throws I4 {
        z(i10 << 3);
        z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void l(int i10, int i11) throws I4 {
        z((i10 << 3) | 5);
        A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void m(int i10, long j10) throws I4 {
        z(i10 << 3);
        B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void n(int i10, long j10) throws I4 {
        z((i10 << 3) | 1);
        C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void o(int i10, boolean z10) throws I4 {
        z(i10 << 3);
        x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void p(int i10, String str) throws I4 {
        z((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void q(int i10, E4 e42) throws I4 {
        z((i10 << 3) | 2);
        r(e42);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void r(E4 e42) throws I4 {
        z(e42.e());
        e42.h(this);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void s(byte[] bArr, int i10, int i11) throws I4 {
        z(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void t(int i10, C5 c52, N5 n52) throws I4 {
        z((i10 << 3) | 2);
        z(((AbstractC3282p4) c52).c(n52));
        n52.g(c52, this.f29245a);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void u(int i10, C5 c52) throws I4 {
        z(11);
        k(2, i10);
        z(26);
        w(c52);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void v(int i10, E4 e42) throws I4 {
        z(11);
        k(2, i10);
        q(3, e42);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void w(C5 c52) throws I4 {
        z(c52.a());
        c52.g(this);
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void x(byte b10) throws I4 {
        int i10;
        int i11 = this.f29219f;
        try {
            i10 = i11 + 1;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
        try {
            this.f29217d[i11] = b10;
            this.f29219f = i10;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            i11 = i10;
            throw new I4(i11, this.f29218e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void y(int i10) throws I4 {
        if (i10 >= 0) {
            z(i10);
        } else {
            B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.J4
    public final void z(int i10) throws I4 {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f29219f;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
            } catch (IndexOutOfBoundsException e10) {
                indexOutOfBoundsException = e10;
                throw new I4(i12, this.f29218e, 1, indexOutOfBoundsException);
            }
            try {
                this.f29217d[i12] = (byte) (i10 | 128);
                i10 >>>= 7;
                i12 = i11;
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                i12 = i11;
                throw new I4(i12, this.f29218e, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f29217d[i12] = (byte) i10;
        this.f29219f = i11;
    }
}
