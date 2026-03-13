package q2;

import C2.n;
import D1.o;
import D1.u;
import F2.s;
import G1.AbstractC0853a;
import G1.C;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.r;
import x2.C6291a;

/* JADX INFO: renamed from: q2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5480b implements InterfaceC4336p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r f43083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43086e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C6291a f43088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC4337q f43089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C5482d f43090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public n f43091j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f43082a = new C(2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f43087f = -1;

    public static C6291a e(String str, long j10) {
        C5481c c5481cA;
        if (j10 == -1 || (c5481cA = f.a(str)) == null) {
            return null;
        }
        return c5481cA.a(j10);
    }

    private void m(InterfaceC4337q interfaceC4337q) {
        String strF;
        if (this.f43085d == 65505) {
            C c10 = new C(this.f43086e);
            interfaceC4337q.readFully(c10.f(), 0, this.f43086e);
            if (this.f43088g == null && "http://ns.adobe.com/xap/1.0/".equals(c10.F()) && (strF = c10.F()) != null) {
                C6291a c6291aE = e(strF, interfaceC4337q.getLength());
                this.f43088g = c6291aE;
                if (c6291aE != null) {
                    this.f43087f = c6291aE.f47341d;
                }
            }
        } else {
            interfaceC4337q.q(this.f43086e);
        }
        this.f43084c = 0;
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f43084c = 0;
            this.f43091j = null;
        } else if (this.f43084c == 5) {
            ((n) AbstractC0853a.e(this.f43091j)).a(j10, j11);
        }
    }

    public final void b(InterfaceC4337q interfaceC4337q) {
        this.f43082a.W(2);
        interfaceC4337q.s(this.f43082a.f(), 0, 2);
        interfaceC4337q.o(this.f43082a.T() - 2);
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f43083b = rVar;
    }

    public final void d() {
        ((r) AbstractC0853a.e(this.f43083b)).n();
        this.f43083b.v(new J.b(-9223372036854775807L));
        this.f43084c = 6;
    }

    public final void g(C6291a c6291a) {
        ((r) AbstractC0853a.e(this.f43083b)).f(RecognitionOptions.UPC_E, 4).e(new o.b().W("image/jpeg").r0(new u(c6291a)).P());
    }

    public final int h(InterfaceC4337q interfaceC4337q) {
        this.f43082a.W(2);
        interfaceC4337q.s(this.f43082a.f(), 0, 2);
        return this.f43082a.T();
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        int i11 = this.f43084c;
        if (i11 == 0) {
            l(interfaceC4337q);
            return 0;
        }
        if (i11 == 1) {
            n(interfaceC4337q);
            return 0;
        }
        if (i11 == 2) {
            m(interfaceC4337q);
            return 0;
        }
        if (i11 == 4) {
            long position = interfaceC4337q.getPosition();
            long j10 = this.f43087f;
            if (position != j10) {
                i10.f36871a = j10;
                return 1;
            }
            o(interfaceC4337q);
            return 0;
        }
        if (i11 != 5) {
            if (i11 == 6) {
                return -1;
            }
            throw new IllegalStateException();
        }
        if (this.f43090i == null || interfaceC4337q != this.f43089h) {
            this.f43089h = interfaceC4337q;
            this.f43090i = new C5482d(interfaceC4337q, this.f43087f);
        }
        int i12 = ((n) AbstractC0853a.e(this.f43091j)).i(this.f43090i, i10);
        if (i12 == 1) {
            i10.f36871a += this.f43087f;
        }
        return i12;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        if (h(interfaceC4337q) != 65496) {
            return false;
        }
        int iH = h(interfaceC4337q);
        this.f43085d = iH;
        if (iH == 65504) {
            b(interfaceC4337q);
            this.f43085d = h(interfaceC4337q);
        }
        return this.f43085d == 65505;
    }

    public final void l(InterfaceC4337q interfaceC4337q) {
        this.f43082a.W(2);
        interfaceC4337q.readFully(this.f43082a.f(), 0, 2);
        int iT = this.f43082a.T();
        this.f43085d = iT;
        if (iT == 65498) {
            if (this.f43087f != -1) {
                this.f43084c = 4;
                return;
            } else {
                d();
                return;
            }
        }
        if ((iT < 65488 || iT > 65497) && iT != 65281) {
            this.f43084c = 1;
        }
    }

    public final void n(InterfaceC4337q interfaceC4337q) {
        this.f43082a.W(2);
        interfaceC4337q.readFully(this.f43082a.f(), 0, 2);
        this.f43086e = this.f43082a.T() - 2;
        this.f43084c = 2;
    }

    public final void o(InterfaceC4337q interfaceC4337q) {
        if (!interfaceC4337q.e(this.f43082a.f(), 0, 1, true)) {
            d();
            return;
        }
        interfaceC4337q.i();
        if (this.f43091j == null) {
            this.f43091j = new n(s.a.f3686a, 8);
        }
        C5482d c5482d = new C5482d(interfaceC4337q, this.f43087f);
        this.f43090i = c5482d;
        if (!this.f43091j.j(c5482d)) {
            d();
        } else {
            this.f43091j.c(new C5483e(this.f43087f, (r) AbstractC0853a.e(this.f43083b)));
            p();
        }
    }

    public final void p() {
        g((C6291a) AbstractC0853a.e(this.f43088g));
        this.f43084c = 5;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
        n nVar = this.f43091j;
        if (nVar != null) {
            nVar.release();
        }
    }
}
