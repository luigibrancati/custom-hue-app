package i2;

import D1.o;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f37053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f37055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f37056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f37057f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f37058g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f37059h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f37060i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f37061j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final a f37062k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final D1.u f37063l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f37064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f37065b;

        public a(long[] jArr, long[] jArr2) {
            this.f37064a = jArr;
            this.f37065b = jArr2;
        }
    }

    public y(byte[] bArr, int i10) {
        G1.B b10 = new G1.B(bArr);
        b10.p(i10 * 8);
        this.f37052a = b10.h(16);
        this.f37053b = b10.h(16);
        this.f37054c = b10.h(24);
        this.f37055d = b10.h(24);
        int iH = b10.h(20);
        this.f37056e = iH;
        this.f37057f = j(iH);
        this.f37058g = b10.h(3) + 1;
        int iH2 = b10.h(5) + 1;
        this.f37059h = iH2;
        this.f37060i = e(iH2);
        this.f37061j = b10.j(36);
        this.f37062k = null;
        this.f37063l = null;
    }

    public static int e(int i10) {
        if (i10 == 8) {
            return 1;
        }
        if (i10 == 12) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 20) {
            return 5;
        }
        if (i10 != 24) {
            return i10 != 32 ? -1 : 7;
        }
        return 6;
    }

    public static int j(int i10) {
        switch (i10) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case 192000:
                return 3;
            default:
                return -1;
        }
    }

    public y a(List list) {
        return new y(this.f37052a, this.f37053b, this.f37054c, this.f37055d, this.f37056e, this.f37058g, this.f37059h, this.f37061j, this.f37062k, h(new D1.u(list)));
    }

    public y b(a aVar) {
        return new y(this.f37052a, this.f37053b, this.f37054c, this.f37055d, this.f37056e, this.f37058g, this.f37059h, this.f37061j, aVar, this.f37063l);
    }

    public y c(List list) {
        return new y(this.f37052a, this.f37053b, this.f37054c, this.f37055d, this.f37056e, this.f37058g, this.f37059h, this.f37061j, this.f37062k, h(S.d(list)));
    }

    public long d() {
        long j10;
        long j11;
        int i10 = this.f37055d;
        if (i10 > 0) {
            j10 = (((long) i10) + ((long) this.f37054c)) / 2;
            j11 = 1;
        } else {
            int i11 = this.f37052a;
            j10 = ((((i11 != this.f37053b || i11 <= 0) ? 4096L : i11) * ((long) this.f37058g)) * ((long) this.f37059h)) / 8;
            j11 = 64;
        }
        return j10 + j11;
    }

    public long f() {
        long j10 = this.f37061j;
        if (j10 == 0) {
            return -9223372036854775807L;
        }
        return (j10 * 1000000) / ((long) this.f37056e);
    }

    public D1.o g(byte[] bArr, D1.u uVar) {
        bArr[4] = -128;
        int i10 = this.f37055d;
        if (i10 <= 0) {
            i10 = -1;
        }
        return new o.b().y0("audio/flac").o0(i10).T(this.f37058g).z0(this.f37056e).s0(G1.M.i0(this.f37059h)).k0(Collections.singletonList(bArr)).r0(h(uVar)).P();
    }

    public D1.u h(D1.u uVar) {
        D1.u uVar2 = this.f37063l;
        return uVar2 == null ? uVar : uVar2.b(uVar);
    }

    public long i(long j10) {
        return G1.M.p((j10 * ((long) this.f37056e)) / 1000000, 0L, this.f37061j - 1);
    }

    public y(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, a aVar, D1.u uVar) {
        this.f37052a = i10;
        this.f37053b = i11;
        this.f37054c = i12;
        this.f37055d = i13;
        this.f37056e = i14;
        this.f37057f = j(i14);
        this.f37058g = i15;
        this.f37059h = i16;
        this.f37060i = e(i16);
        this.f37061j = j10;
        this.f37062k = aVar;
        this.f37063l = uVar;
    }
}
