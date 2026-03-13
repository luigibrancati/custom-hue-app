package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.F;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t implements InterfaceC1853m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G1.C f13036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final F.a f13037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f13038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13039d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f13040e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i2.O f13041f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f13042g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f13043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13044i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13045j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f13046k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f13047l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13048m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f13049n;

    public t(String str) {
        this(null, 0, str);
    }

    @Override // P2.InterfaceC1853m
    public void a(G1.C c10) {
        AbstractC0853a.i(this.f13041f);
        while (c10.a() > 0) {
            int i10 = this.f13043h;
            if (i10 == 0) {
                f(c10);
            } else if (i10 == 1) {
                h(c10);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException();
                }
                g(c10);
            }
        }
    }

    @Override // P2.InterfaceC1853m
    public void b() {
        this.f13043h = 0;
        this.f13044i = 0;
        this.f13046k = false;
        this.f13049n = -9223372036854775807L;
    }

    @Override // P2.InterfaceC1853m
    public void d(i2.r rVar, L.d dVar) {
        dVar.a();
        this.f13042g = dVar.b();
        this.f13041f = rVar.f(dVar.c(), 1);
    }

    @Override // P2.InterfaceC1853m
    public void e(long j10, int i10) {
        this.f13049n = j10;
    }

    public final void f(G1.C c10) {
        byte[] bArrF = c10.f();
        int iJ = c10.j();
        for (int iG = c10.g(); iG < iJ; iG++) {
            byte b10 = bArrF[iG];
            boolean z10 = (b10 & ForkServer.ERROR) == 255;
            boolean z11 = this.f13046k && (b10 & 224) == 224;
            this.f13046k = z10;
            if (z11) {
                c10.a0(iG + 1);
                this.f13046k = false;
                this.f13036a.f()[1] = bArrF[iG];
                this.f13044i = 2;
                this.f13043h = 1;
                return;
            }
        }
        c10.a0(iJ);
    }

    public final void g(G1.C c10) {
        int iMin = Math.min(c10.a(), this.f13048m - this.f13044i);
        this.f13041f.b(c10, iMin);
        int i10 = this.f13044i + iMin;
        this.f13044i = i10;
        if (i10 < this.f13048m) {
            return;
        }
        AbstractC0853a.g(this.f13049n != -9223372036854775807L);
        this.f13041f.d(this.f13049n, 1, this.f13048m, 0, null);
        this.f13049n += this.f13047l;
        this.f13044i = 0;
        this.f13043h = 0;
    }

    public final void h(G1.C c10) {
        int iMin = Math.min(c10.a(), 4 - this.f13044i);
        c10.q(this.f13036a.f(), this.f13044i, iMin);
        int i10 = this.f13044i + iMin;
        this.f13044i = i10;
        if (i10 < 4) {
            return;
        }
        this.f13036a.a0(0);
        if (!this.f13037b.a(this.f13036a.u())) {
            this.f13044i = 0;
            this.f13043h = 1;
            return;
        }
        F.a aVar = this.f13037b;
        this.f13048m = aVar.f36866c;
        if (!this.f13045j) {
            this.f13047l = (((long) aVar.f36870g) * 1000000) / ((long) aVar.f36867d);
            this.f13041f.e(new o.b().j0(this.f13042g).W(this.f13040e).y0(this.f13037b.f36865b).o0(RecognitionOptions.AZTEC).T(this.f13037b.f36868e).z0(this.f13037b.f36867d).n0(this.f13038c).w0(this.f13039d).P());
            this.f13045j = true;
        }
        this.f13036a.a0(0);
        this.f13041f.b(this.f13036a, 4);
        this.f13043h = 2;
    }

    public t(String str, int i10, String str2) {
        this.f13043h = 0;
        G1.C c10 = new G1.C(4);
        this.f13036a = c10;
        c10.f()[0] = -1;
        this.f13037b = new F.a();
        this.f13049n = -9223372036854775807L;
        this.f13038c = str;
        this.f13039d = i10;
        this.f13040e = str2;
    }

    @Override // P2.InterfaceC1853m
    public void c(boolean z10) {
    }
}
