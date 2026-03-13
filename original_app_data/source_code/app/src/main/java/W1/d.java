package W1;

import G1.AbstractC0853a;
import G1.C;
import G1.M;
import com.google.ar.core.ImageMetadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f17706l = new byte[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f17707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f17708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17709c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte f17710d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f17711e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte f17712f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f17713g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f17714h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f17715i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final byte[] f17716j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final byte[] f17717k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f17718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f17719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte f17720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17721d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f17722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f17723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public byte[] f17724g = d.f17706l;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f17725h = d.f17706l;

        public d i() {
            return new d(this);
        }

        public b j(byte[] bArr) {
            AbstractC0853a.e(bArr);
            this.f17724g = bArr;
            return this;
        }

        public b k(boolean z10) {
            this.f17719b = z10;
            return this;
        }

        public b l(boolean z10) {
            this.f17718a = z10;
            return this;
        }

        public b m(byte[] bArr) {
            AbstractC0853a.e(bArr);
            this.f17725h = bArr;
            return this;
        }

        public b n(byte b10) {
            this.f17720c = b10;
            return this;
        }

        public b o(int i10) {
            AbstractC0853a.a(i10 >= 0 && i10 <= 65535);
            this.f17721d = i10 & 65535;
            return this;
        }

        public b p(int i10) {
            this.f17723f = i10;
            return this;
        }

        public b q(long j10) {
            this.f17722e = j10;
            return this;
        }
    }

    public static int b(int i10) {
        return M7.d.c(i10 + 1, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    public static int c(int i10) {
        return M7.d.c(i10 - 1, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE);
    }

    public static d d(C c10) {
        byte[] bArr;
        if (c10.a() < 12) {
            return null;
        }
        int iL = c10.L();
        byte b10 = (byte) (iL >> 6);
        boolean z10 = ((iL >> 5) & 1) == 1;
        byte b11 = (byte) (iL & 15);
        boolean z11 = ((iL >> 4) & 1) == 1;
        if (b10 != 2) {
            return null;
        }
        int iL2 = c10.L();
        boolean z12 = ((iL2 >> 7) & 1) == 1;
        byte b12 = (byte) (iL2 & 127);
        int iT = c10.T();
        long jN = c10.N();
        int iU = c10.u();
        if (b11 > 0) {
            bArr = new byte[b11 * 4];
            for (int i10 = 0; i10 < b11; i10++) {
                c10.q(bArr, i10 * 4, 4);
            }
        } else {
            bArr = f17706l;
        }
        if (z11) {
            c10.b0(2);
            short sH = c10.H();
            if (sH != 0) {
                c10.b0(sH * 4);
            }
        }
        byte[] bArr2 = new byte[c10.a()];
        c10.q(bArr2, 0, c10.a());
        return new b().l(z10).k(z12).n(b12).o(iT).q(jN).p(iU).j(bArr).m(bArr2).i();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d.class == obj.getClass()) {
            d dVar = (d) obj;
            if (this.f17712f == dVar.f17712f && this.f17713g == dVar.f17713g && this.f17711e == dVar.f17711e && this.f17714h == dVar.f17714h && this.f17715i == dVar.f17715i) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i10 = (((((527 + this.f17712f) * 31) + this.f17713g) * 31) + (this.f17711e ? 1 : 0)) * 31;
        long j10 = this.f17714h;
        return ((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + this.f17715i;
    }

    public String toString() {
        return M.G("RtpPacket(payloadType=%d, seq=%d, timestamp=%d, ssrc=%x, marker=%b)", Byte.valueOf(this.f17712f), Integer.valueOf(this.f17713g), Long.valueOf(this.f17714h), Integer.valueOf(this.f17715i), Boolean.valueOf(this.f17711e));
    }

    public d(b bVar) {
        this.f17707a = (byte) 2;
        this.f17708b = bVar.f17718a;
        this.f17709c = false;
        this.f17711e = bVar.f17719b;
        this.f17712f = bVar.f17720c;
        this.f17713g = bVar.f17721d;
        this.f17714h = bVar.f17722e;
        this.f17715i = bVar.f17723f;
        byte[] bArr = bVar.f17724g;
        this.f17716j = bArr;
        this.f17710d = (byte) (bArr.length / 4);
        this.f17717k = bVar.f17725h;
    }
}
