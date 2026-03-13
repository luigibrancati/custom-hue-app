package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L0 extends O0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f29761d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f29762e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f29763f;

    public L0(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f29761d = bArr;
        this.f29763f = 0;
        this.f29762e = i11;
    }

    public final void D(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, i10, this.f29761d, this.f29763f, i11);
            this.f29763f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new M0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29763f), Integer.valueOf(this.f29762e), Integer.valueOf(i11)), e10);
        }
    }

    public final void E(String str) throws M0 {
        int i10 = this.f29763f;
        try {
            int iA = O0.a(str.length() * 3);
            int iA2 = O0.a(str.length());
            if (iA2 != iA) {
                w(C2.e(str));
                byte[] bArr = this.f29761d;
                int i11 = this.f29763f;
                this.f29763f = C2.d(str, bArr, i11, this.f29762e - i11);
                return;
            }
            int i12 = i10 + iA2;
            this.f29763f = i12;
            int iD = C2.d(str, this.f29761d, i12, this.f29762e - i12);
            this.f29763f = i10;
            w((iD - i10) - iA2);
            this.f29763f = iD;
        } catch (B2 e10) {
            this.f29763f = i10;
            d(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new M0(e11);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final int f() {
        return this.f29762e - this.f29763f;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void g(byte b10) throws M0 {
        try {
            byte[] bArr = this.f29761d;
            int i10 = this.f29763f;
            this.f29763f = i10 + 1;
            bArr[i10] = b10;
        } catch (IndexOutOfBoundsException e10) {
            throw new M0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29763f), Integer.valueOf(this.f29762e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void h(int i10, boolean z10) throws M0 {
        w(i10 << 3);
        g(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void i(int i10, G0 g02) throws M0 {
        w((i10 << 3) | 2);
        w(g02.f());
        g02.t(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void j(int i10, int i11) throws M0 {
        w((i10 << 3) | 5);
        k(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void k(int i10) throws M0 {
        try {
            byte[] bArr = this.f29761d;
            int i11 = this.f29763f;
            int i12 = i11 + 1;
            this.f29763f = i12;
            bArr[i11] = (byte) (i10 & 255);
            int i13 = i11 + 2;
            this.f29763f = i13;
            bArr[i12] = (byte) ((i10 >> 8) & 255);
            int i14 = i11 + 3;
            this.f29763f = i14;
            bArr[i13] = (byte) ((i10 >> 16) & 255);
            this.f29763f = i11 + 4;
            bArr[i14] = (byte) ((i10 >> 24) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new M0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29763f), Integer.valueOf(this.f29762e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void l(int i10, long j10) throws M0 {
        w((i10 << 3) | 1);
        m(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void m(long j10) throws M0 {
        try {
            byte[] bArr = this.f29761d;
            int i10 = this.f29763f;
            int i11 = i10 + 1;
            this.f29763f = i11;
            bArr[i10] = (byte) (((int) j10) & 255);
            int i12 = i10 + 2;
            this.f29763f = i12;
            bArr[i11] = (byte) (((int) (j10 >> 8)) & 255);
            int i13 = i10 + 3;
            this.f29763f = i13;
            bArr[i12] = (byte) (((int) (j10 >> 16)) & 255);
            int i14 = i10 + 4;
            this.f29763f = i14;
            bArr[i13] = (byte) (((int) (j10 >> 24)) & 255);
            int i15 = i10 + 5;
            this.f29763f = i15;
            bArr[i14] = (byte) (((int) (j10 >> 32)) & 255);
            int i16 = i10 + 6;
            this.f29763f = i16;
            bArr[i15] = (byte) (((int) (j10 >> 40)) & 255);
            int i17 = i10 + 7;
            this.f29763f = i17;
            bArr[i16] = (byte) (((int) (j10 >> 48)) & 255);
            this.f29763f = i10 + 8;
            bArr[i17] = (byte) (((int) (j10 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e10) {
            throw new M0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29763f), Integer.valueOf(this.f29762e), 1), e10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void n(int i10, int i11) throws M0 {
        w(i10 << 3);
        o(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void o(int i10) throws M0 {
        if (i10 >= 0) {
            w(i10);
        } else {
            y(i10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void p(byte[] bArr, int i10, int i11) {
        D(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void q(int i10, J1 j12, InterfaceC3382c2 interfaceC3382c2) throws M0 {
        w((i10 << 3) | 2);
        w(((AbstractC3454r0) j12).c(interfaceC3382c2));
        interfaceC3382c2.h(j12, this.f29785a);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void r(int i10, J1 j12) throws M0 {
        w(11);
        v(2, i10);
        w(26);
        w(j12.a());
        j12.e(this);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void s(int i10, G0 g02) throws M0 {
        w(11);
        v(2, i10);
        i(3, g02);
        w(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void t(int i10, String str) throws M0 {
        w((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void u(int i10, int i11) throws M0 {
        w((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void v(int i10, int i11) throws M0 {
        w(i10 << 3);
        w(i11);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void w(int i10) throws M0 {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f29761d;
                int i11 = this.f29763f;
                this.f29763f = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new M0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29763f), Integer.valueOf(this.f29762e), 1), e10);
            }
        }
        byte[] bArr2 = this.f29761d;
        int i12 = this.f29763f;
        this.f29763f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void x(int i10, long j10) throws M0 {
        w(i10 << 3);
        y(j10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.O0
    public final void y(long j10) throws M0 {
        if (!O0.f29784c || this.f29762e - this.f29763f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f29761d;
                    int i10 = this.f29763f;
                    this.f29763f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new M0(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f29763f), Integer.valueOf(this.f29762e), 1), e10);
                }
            }
            byte[] bArr2 = this.f29761d;
            int i11 = this.f29763f;
            this.f29763f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f29761d;
                int i13 = this.f29763f;
                this.f29763f = i13 + 1;
                AbstractC3481w2.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f29761d;
            int i14 = this.f29763f;
            this.f29763f = i14 + 1;
            AbstractC3481w2.s(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}
