package D2;

import D1.o;
import D1.w;
import D2.i;
import G1.AbstractC0853a;
import G1.C;
import K7.AbstractC1081v;
import i2.S;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f2202n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f2203o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f2204p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public S.c f2205q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public S.a f2206r;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final S.c f2207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S.a f2208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f2209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final S.b[] f2210d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f2211e;

        public a(S.c cVar, S.a aVar, byte[] bArr, S.b[] bVarArr, int i10) {
            this.f2207a = cVar;
            this.f2208b = aVar;
            this.f2209c = bArr;
            this.f2210d = bVarArr;
            this.f2211e = i10;
        }
    }

    public static void n(C c10, long j10) {
        if (c10.b() < c10.j() + 4) {
            c10.X(Arrays.copyOf(c10.f(), c10.j() + 4));
        } else {
            c10.Z(c10.j() + 4);
        }
        byte[] bArrF = c10.f();
        bArrF[c10.j() - 4] = (byte) (j10 & 255);
        bArrF[c10.j() - 3] = (byte) ((j10 >>> 8) & 255);
        bArrF[c10.j() - 2] = (byte) ((j10 >>> 16) & 255);
        bArrF[c10.j() - 1] = (byte) ((j10 >>> 24) & 255);
    }

    public static int o(byte b10, a aVar) {
        return !aVar.f2210d[p(b10, aVar.f2211e, 1)].f36906a ? aVar.f2207a.f36916g : aVar.f2207a.f36917h;
    }

    public static int p(byte b10, int i10, int i11) {
        return (b10 >> i11) & (255 >>> (8 - i10));
    }

    public static boolean r(C c10) {
        try {
            return S.o(1, c10, true);
        } catch (w unused) {
            return false;
        }
    }

    @Override // D2.i
    public void e(long j10) {
        super.e(j10);
        this.f2204p = j10 != 0;
        S.c cVar = this.f2205q;
        this.f2203o = cVar != null ? cVar.f36916g : 0;
    }

    @Override // D2.i
    public long f(C c10) {
        if ((c10.f()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(c10.f()[0], (a) AbstractC0853a.i(this.f2202n));
        long j10 = this.f2204p ? (this.f2203o + iO) / 4 : 0;
        n(c10, j10);
        this.f2204p = true;
        this.f2203o = iO;
        return j10;
    }

    @Override // D2.i
    public boolean h(C c10, long j10, i.b bVar) throws w {
        if (this.f2202n != null) {
            AbstractC0853a.e(bVar.f2200a);
            return false;
        }
        a aVarQ = q(c10);
        this.f2202n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        S.c cVar = aVarQ.f2207a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f36919j);
        arrayList.add(aVarQ.f2209c);
        bVar.f2200a = new o.b().W("audio/ogg").y0("audio/vorbis").S(cVar.f36914e).t0(cVar.f36913d).T(cVar.f36911b).z0(cVar.f36912c).k0(arrayList).r0(S.d(AbstractC1081v.w(aVarQ.f2208b.f36904b))).P();
        return true;
    }

    @Override // D2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f2202n = null;
            this.f2205q = null;
            this.f2206r = null;
        }
        this.f2203o = 0;
        this.f2204p = false;
    }

    public a q(C c10) throws w {
        S.c cVar = this.f2205q;
        if (cVar == null) {
            this.f2205q = S.l(c10);
            return null;
        }
        S.a aVar = this.f2206r;
        if (aVar == null) {
            this.f2206r = S.j(c10);
            return null;
        }
        byte[] bArr = new byte[c10.j()];
        System.arraycopy(c10.f(), 0, bArr, 0, c10.j());
        return new a(cVar, aVar, bArr, S.m(c10, cVar.f36911b), S.b(r4.length - 1));
    }
}
