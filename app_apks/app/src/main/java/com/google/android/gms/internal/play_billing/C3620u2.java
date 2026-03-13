package com.google.android.gms.internal.play_billing;

import java.util.Locale;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3620u2 extends AbstractC3638x2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f30250d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f30251e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30252f;

    public C3620u2(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f30250d = bArr;
        this.f30252f = 0;
        this.f30251e = i11;
    }

    public final void C(byte[] bArr, int i10, int i11) {
        try {
            System.arraycopy(bArr, 0, this.f30250d, this.f30252f, i11);
            this.f30252f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new C3626v2(this.f30252f, this.f30251e, i11, e10);
        }
    }

    public final void D(String str) throws C3626v2 {
        int i10 = this.f30252f;
        try {
            int iB = AbstractC3638x2.B(str.length() * 3);
            int iB2 = AbstractC3638x2.B(str.length());
            if (iB2 != iB) {
                v(S3.c(str));
                byte[] bArr = this.f30250d;
                int i11 = this.f30252f;
                this.f30252f = S3.b(str, bArr, i11, this.f30251e - i11);
                return;
            }
            int i12 = i10 + iB2;
            this.f30252f = i12;
            int iB3 = S3.b(str, this.f30250d, i12, this.f30251e - i12);
            this.f30252f = i10;
            v((iB3 - i10) - iB2);
            this.f30252f = iB3;
        } catch (R3 e10) {
            this.f30252f = i10;
            c(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new C3626v2(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final int e() {
        return this.f30251e - this.f30252f;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void f(byte b10) throws C3626v2 {
        int i10;
        int i11 = this.f30252f;
        try {
            i10 = i11 + 1;
        } catch (IndexOutOfBoundsException e10) {
            e = e10;
        }
        try {
            this.f30250d[i11] = b10;
            this.f30252f = i10;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            i11 = i10;
            throw new C3626v2(i11, this.f30251e, 1, e);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void g(int i10, boolean z10) throws C3626v2 {
        v(i10 << 3);
        f(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void h(int i10, AbstractC3597q2 abstractC3597q2) throws C3626v2 {
        v((i10 << 3) | 2);
        v(abstractC3597q2.e());
        abstractC3597q2.k(this);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void i(int i10, int i11) throws C3626v2 {
        v((i10 << 3) | 5);
        j(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void j(int i10) throws C3626v2 {
        int i11 = this.f30252f;
        try {
            byte[] bArr = this.f30250d;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            this.f30252f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new C3626v2(i11, this.f30251e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void k(int i10, long j10) throws C3626v2 {
        v((i10 << 3) | 1);
        l(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void l(long j10) throws C3626v2 {
        int i10 = this.f30252f;
        try {
            byte[] bArr = this.f30250d;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            this.f30252f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new C3626v2(i10, this.f30251e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void m(int i10, int i11) throws C3626v2 {
        v(i10 << 3);
        n(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void n(int i10) throws C3626v2 {
        if (i10 >= 0) {
            v(i10);
        } else {
            x(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void o(byte[] bArr, int i10, int i11) {
        C(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void p(int i10, InterfaceC3568l3 interfaceC3568l3, InterfaceC3633w3 interfaceC3633w3) throws C3626v2 {
        v((i10 << 3) | 2);
        v(((AbstractC3507b2) interfaceC3568l3).b(interfaceC3633w3));
        interfaceC3633w3.h(interfaceC3568l3, this.f30266a);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void q(int i10, InterfaceC3568l3 interfaceC3568l3) throws C3626v2 {
        v(11);
        u(2, i10);
        v(26);
        v(interfaceC3568l3.h());
        interfaceC3568l3.a(this);
        v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void r(int i10, AbstractC3597q2 abstractC3597q2) throws C3626v2 {
        v(11);
        u(2, i10);
        h(3, abstractC3597q2);
        v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void s(int i10, String str) throws C3626v2 {
        v((i10 << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void t(int i10, int i11) throws C3626v2 {
        v((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void u(int i10, int i11) throws C3626v2 {
        v(i10 << 3);
        v(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void v(int i10) throws C3626v2 {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f30250d;
                int i11 = this.f30252f;
                this.f30252f = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new C3626v2(this.f30252f, this.f30251e, 1, e10);
            }
        }
        byte[] bArr2 = this.f30250d;
        int i12 = this.f30252f;
        this.f30252f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void w(int i10, long j10) throws C3626v2 {
        v(i10 << 3);
        x(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3638x2
    public final void x(long j10) throws C3626v2 {
        if (!AbstractC3638x2.f30265c || this.f30251e - this.f30252f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f30250d;
                    int i10 = this.f30252f;
                    this.f30252f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new C3626v2(this.f30252f, this.f30251e, 1, e10);
                }
            }
            byte[] bArr2 = this.f30250d;
            int i11 = this.f30252f;
            this.f30252f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f30250d;
                int i13 = this.f30252f;
                this.f30252f = i13 + 1;
                P3.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f30250d;
            int i14 = this.f30252f;
            this.f30252f = i14 + 1;
            P3.s(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}
