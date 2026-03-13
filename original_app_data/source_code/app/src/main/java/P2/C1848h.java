package P2;

import G1.AbstractC0853a;
import P2.L;
import com.google.android.libraries.barhopper.RecognitionOptions;
import i2.C4329i;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import java.io.EOFException;

/* JADX INFO: renamed from: P2.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1848h implements InterfaceC4336p {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final i2.u f12814m = new i2.u() { // from class: P2.g
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return C1848h.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f12815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1849i f12816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final G1.C f12817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final G1.C f12818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final G1.B f12819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i2.r f12820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f12821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f12822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f12824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f12825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f12826l;

    public C1848h() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new C1848h()};
    }

    private static int e(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    private i2.J g(long j10, boolean z10) {
        return new C4329i(j10, this.f12822h, e(this.f12823i, this.f12816b.k()), this.f12823i, z10);
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f12825k = false;
        this.f12816b.b();
        this.f12821g = j11;
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        this.f12820f = rVar;
        this.f12816b.d(rVar, new L.d(0, 1));
        rVar.n();
    }

    public final void d(InterfaceC4337q interfaceC4337q) throws D1.w {
        int iH;
        if (this.f12824j) {
            return;
        }
        this.f12823i = -1;
        interfaceC4337q.i();
        long j10 = 0;
        if (interfaceC4337q.getPosition() == 0) {
            l(interfaceC4337q);
        }
        int i10 = 0;
        int i11 = 0;
        do {
            try {
                if (!interfaceC4337q.e(this.f12818d.f(), 0, 2, true)) {
                    break;
                }
                this.f12818d.a0(0);
                if (!C1849i.m(this.f12818d.T())) {
                    break;
                }
                if (!interfaceC4337q.e(this.f12818d.f(), 0, 4, true)) {
                    break;
                }
                this.f12819e.p(14);
                iH = this.f12819e.h(13);
                if (iH <= 6) {
                    this.f12824j = true;
                    throw D1.w.a("Malformed ADTS stream", null);
                }
                j10 += (long) iH;
                i11++;
                if (i11 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (interfaceC4337q.r(iH - 6, true));
        i10 = i11;
        interfaceC4337q.i();
        if (i10 > 0) {
            this.f12823i = (int) (j10 / ((long) i10));
        } else {
            this.f12823i = -1;
        }
        this.f12824j = true;
    }

    public final void h(long j10, boolean z10) {
        if (this.f12826l) {
            return;
        }
        boolean z11 = (this.f12815a & 1) != 0 && this.f12823i > 0;
        if (z11 && this.f12816b.k() == -9223372036854775807L && !z10) {
            return;
        }
        if (!z11 || this.f12816b.k() == -9223372036854775807L) {
            this.f12820f.v(new J.b(-9223372036854775807L));
        } else {
            this.f12820f.v(g(j10, (this.f12815a & 2) != 0));
        }
        this.f12826l = true;
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, i2.I i10) throws D1.w {
        AbstractC0853a.i(this.f12820f);
        long length = interfaceC4337q.getLength();
        int i11 = this.f12815a;
        if ((i11 & 2) != 0 || ((i11 & 1) != 0 && length != -1)) {
            d(interfaceC4337q);
        }
        int i12 = interfaceC4337q.read(this.f12817c.f(), 0, RecognitionOptions.PDF417);
        boolean z10 = i12 == -1;
        h(length, z10);
        if (z10) {
            return -1;
        }
        this.f12817c.a0(0);
        this.f12817c.Z(i12);
        if (!this.f12825k) {
            this.f12816b.e(this.f12821g, 4);
            this.f12825k = true;
        }
        this.f12816b.a(this.f12817c);
        return 0;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        int iL = l(interfaceC4337q);
        int i10 = iL;
        int i11 = 0;
        int i12 = 0;
        do {
            interfaceC4337q.s(this.f12818d.f(), 0, 2);
            this.f12818d.a0(0);
            if (C1849i.m(this.f12818d.T())) {
                i11++;
                if (i11 >= 4 && i12 > 188) {
                    return true;
                }
                interfaceC4337q.s(this.f12818d.f(), 0, 4);
                this.f12819e.p(14);
                int iH = this.f12819e.h(13);
                if (iH <= 6) {
                    i10++;
                    interfaceC4337q.i();
                    interfaceC4337q.o(i10);
                } else {
                    interfaceC4337q.o(iH - 6);
                    i12 += iH;
                }
            } else {
                i10++;
                interfaceC4337q.i();
                interfaceC4337q.o(i10);
            }
            i11 = 0;
            i12 = 0;
        } while (i10 - iL < 8192);
        return false;
    }

    public final int l(InterfaceC4337q interfaceC4337q) {
        int i10 = 0;
        while (true) {
            interfaceC4337q.s(this.f12818d.f(), 0, 10);
            this.f12818d.a0(0);
            if (this.f12818d.O() != 4801587) {
                break;
            }
            this.f12818d.b0(3);
            int iK = this.f12818d.K();
            i10 += iK + 10;
            interfaceC4337q.o(iK);
        }
        interfaceC4337q.i();
        interfaceC4337q.o(i10);
        if (this.f12822h == -1) {
            this.f12822h = i10;
        }
        return i10;
    }

    public C1848h(int i10) {
        this.f12815a = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f12816b = new C1849i(true, "audio/mp4a-latm");
        this.f12817c = new G1.C(RecognitionOptions.PDF417);
        this.f12823i = -1;
        this.f12822h = -1L;
        G1.C c10 = new G1.C(10);
        this.f12818d = c10;
        this.f12819e = new G1.B(c10.f());
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
