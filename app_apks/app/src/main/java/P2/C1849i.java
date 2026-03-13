package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.AbstractC4321a;
import i2.C4334n;
import java.util.Arrays;
import java.util.Collections;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: P2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1849i implements InterfaceC1853m {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final byte[] f12827x = {73, 68, 51};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f12828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.B f12829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.C f12830c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f12831d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f12832e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f12833f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f12834g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i2.O f12835h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i2.O f12836i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f12837j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f12838k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f12839l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12840m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f12841n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f12842o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12843p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f12844q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12845r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f12846s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f12847t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f12848u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i2.O f12849v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f12850w;

    public C1849i(boolean z10, String str) {
        this(z10, null, 0, str);
    }

    private boolean i(G1.C c10, byte[] bArr, int i10) {
        int iMin = Math.min(c10.a(), i10 - this.f12838k);
        c10.q(bArr, this.f12838k, iMin);
        int i11 = this.f12838k + iMin;
        this.f12838k = i11;
        return i11 == i10;
    }

    public static boolean m(int i10) {
        return (i10 & 65526) == 65520;
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        f();
        while (c10.a() > 0) {
            int i10 = this.f12837j;
            if (i10 == 0) {
                j(c10);
            } else if (i10 == 1) {
                g(c10);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    if (i(c10, this.f12829b.f4234a, this.f12840m ? 7 : 5)) {
                        n();
                    }
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException();
                    }
                    p(c10);
                }
            } else if (i(c10, this.f12830c.f(), 10)) {
                o();
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f12848u = -9223372036854775807L;
        q();
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f12834g = dVar.b();
        i2.O oF = rVar.f(dVar.c(), 1);
        this.f12835h = oF;
        this.f12849v = oF;
        if (!this.f12828a) {
            this.f12836i = new C4334n();
            return;
        }
        dVar.a();
        i2.O oF2 = rVar.f(dVar.c(), 5);
        this.f12836i = oF2;
        oF2.e(new o.b().j0(dVar.b()).W(this.f12833f).y0("application/id3").P());
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f12848u = j10;
    }

    public final void f() {
        AbstractC0853a.e(this.f12835h);
        G1.M.i(this.f12849v);
        G1.M.i(this.f12836i);
    }

    public final void g(G1.C c10) {
        if (c10.a() == 0) {
            return;
        }
        this.f12829b.f4234a[0] = c10.f()[c10.g()];
        this.f12829b.p(2);
        int iH = this.f12829b.h(4);
        int i10 = this.f12843p;
        if (i10 != -1 && iH != i10) {
            q();
            return;
        }
        if (!this.f12841n) {
            this.f12841n = true;
            this.f12842o = this.f12844q;
            this.f12843p = iH;
        }
        t();
    }

    public final boolean h(G1.C c10, int i10) {
        c10.a0(i10 + 1);
        if (!w(c10, this.f12829b.f4234a, 1)) {
            return false;
        }
        this.f12829b.p(4);
        int iH = this.f12829b.h(1);
        int i11 = this.f12842o;
        if (i11 != -1 && iH != i11) {
            return false;
        }
        if (this.f12843p != -1) {
            if (!w(c10, this.f12829b.f4234a, 1)) {
                return true;
            }
            this.f12829b.p(2);
            if (this.f12829b.h(4) != this.f12843p) {
                return false;
            }
            c10.a0(i10 + 2);
        }
        if (!w(c10, this.f12829b.f4234a, 4)) {
            return true;
        }
        this.f12829b.p(14);
        int iH2 = this.f12829b.h(13);
        if (iH2 < 7) {
            return false;
        }
        byte[] bArrF = c10.f();
        int iJ = c10.j();
        int i12 = i10 + iH2;
        if (i12 >= iJ) {
            return true;
        }
        byte b10 = bArrF[i12];
        if (b10 == -1) {
            int i13 = i12 + 1;
            if (i13 == iJ) {
                return true;
            }
            return l((byte) -1, bArrF[i13]) && ((bArrF[i13] & 8) >> 3) == iH;
        }
        if (b10 != 73) {
            return false;
        }
        int i14 = i12 + 1;
        if (i14 == iJ) {
            return true;
        }
        if (bArrF[i14] != 68) {
            return false;
        }
        int i15 = i12 + 2;
        return i15 == iJ || bArrF[i15] == 51;
    }

    public final void j(G1.C c10) {
        byte[] bArrF = c10.f();
        int iG = c10.g();
        int iJ = c10.j();
        while (iG < iJ) {
            int i10 = iG + 1;
            byte b10 = bArrF[iG];
            int i11 = b10 & ForkServer.ERROR;
            if (this.f12839l == 512 && l((byte) -1, (byte) i11) && (this.f12841n || h(c10, iG - 1))) {
                this.f12844q = (b10 & 8) >> 3;
                this.f12840m = (b10 & 1) == 0;
                if (this.f12841n) {
                    t();
                } else {
                    r();
                }
                c10.a0(i10);
                return;
            }
            int i12 = this.f12839l;
            int i13 = i11 | i12;
            if (i13 == 329) {
                this.f12839l = 768;
            } else if (i13 == 511) {
                this.f12839l = 512;
            } else if (i13 == 836) {
                this.f12839l = RecognitionOptions.UPC_E;
            } else if (i13 == 1075) {
                u();
                c10.a0(i10);
                return;
            } else if (i12 != 256) {
                this.f12839l = 256;
            }
            iG = i10;
        }
        c10.a0(iG);
    }

    public long k() {
        return this.f12846s;
    }

    public final boolean l(byte b10, byte b11) {
        return m(((b10 & ForkServer.ERROR) << 8) | (b11 & ForkServer.ERROR));
    }

    public final void n() {
        this.f12829b.p(0);
        if (this.f12845r) {
            this.f12829b.r(10);
        } else {
            int i10 = 2;
            int iH = this.f12829b.h(2) + 1;
            if (iH != 2) {
                G1.t.h("AdtsReader", "Detected audio object type: " + iH + ", but assuming AAC LC.");
            } else {
                i10 = iH;
            }
            this.f12829b.r(5);
            byte[] bArrB = AbstractC4321a.b(i10, this.f12843p, this.f12829b.h(3));
            AbstractC4321a.b bVarF = AbstractC4321a.f(bArrB);
            D1.o oVarP = new o.b().j0(this.f12834g).W(this.f12833f).y0("audio/mp4a-latm").U(bVarF.f36924c).T(bVarF.f36923b).z0(bVarF.f36922a).k0(Collections.singletonList(bArrB)).n0(this.f12831d).w0(this.f12832e).P();
            this.f12846s = 1024000000 / ((long) oVarP.f1781H);
            this.f12835h.e(oVarP);
            this.f12845r = true;
        }
        this.f12829b.r(4);
        int iH2 = this.f12829b.h(13);
        int i11 = iH2 - 7;
        if (this.f12840m) {
            i11 = iH2 - 9;
        }
        v(this.f12835h, this.f12846s, 0, i11);
    }

    public final void o() {
        this.f12836i.b(this.f12830c, 10);
        this.f12830c.a0(6);
        v(this.f12836i, 0L, 10, this.f12830c.K() + 10);
    }

    public final void p(G1.C c10) {
        int iMin = Math.min(c10.a(), this.f12847t - this.f12838k);
        this.f12849v.b(c10, iMin);
        int i10 = this.f12838k + iMin;
        this.f12838k = i10;
        if (i10 == this.f12847t) {
            AbstractC0853a.g(this.f12848u != -9223372036854775807L);
            this.f12849v.d(this.f12848u, 1, this.f12847t, 0, null);
            this.f12848u += this.f12850w;
            s();
        }
    }

    public final void q() {
        this.f12841n = false;
        s();
    }

    public final void r() {
        this.f12837j = 1;
        this.f12838k = 0;
    }

    public final void s() {
        this.f12837j = 0;
        this.f12838k = 0;
        this.f12839l = 256;
    }

    public final void t() {
        this.f12837j = 3;
        this.f12838k = 0;
    }

    public final void u() {
        this.f12837j = 2;
        this.f12838k = f12827x.length;
        this.f12847t = 0;
        this.f12830c.a0(0);
    }

    public final void v(i2.O o10, long j10, int i10, int i11) {
        this.f12837j = 4;
        this.f12838k = i10;
        this.f12849v = o10;
        this.f12850w = j10;
        this.f12847t = i11;
    }

    public final boolean w(G1.C c10, byte[] bArr, int i10) {
        if (c10.a() < i10) {
            return false;
        }
        c10.q(bArr, 0, i10);
        return true;
    }

    public C1849i(boolean z10, String str, int i10, String str2) {
        this.f12829b = new G1.B(new byte[7]);
        this.f12830c = new G1.C(Arrays.copyOf(f12827x, 10));
        this.f12842o = -1;
        this.f12843p = -1;
        this.f12846s = -9223372036854775807L;
        this.f12848u = -9223372036854775807L;
        this.f12828a = z10;
        this.f12831d = str;
        this.f12832e = i10;
        this.f12833f = str2;
        s();
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
