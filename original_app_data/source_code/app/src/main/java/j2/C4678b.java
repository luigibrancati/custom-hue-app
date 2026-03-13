package j2;

import D1.o;
import D1.w;
import G1.AbstractC0853a;
import G1.M;
import i2.C4329i;
import i2.C4334n;
import i2.E;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;
import i2.O;
import i2.r;
import i2.u;
import java.io.EOFException;
import java.util.Arrays;
import org.apache.tika.pipes.PipesConfigBase;

/* JADX INFO: renamed from: j2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4678b implements InterfaceC4336p {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final u f38942s = new u() { // from class: j2.a
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return C4678b.b();
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int[] f38943t = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int[] f38944u = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f38945v = M.u0("#!AMR\n");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f38946w = M.u0("#!AMR-WB\n");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f38947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O f38949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38952f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f38953g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f38954h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f38955i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f38956j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f38957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public r f38958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public O f38959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public O f38960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public J f38961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f38962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f38963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f38964r;

    public C4678b() {
        this(0);
    }

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new C4678b()};
    }

    public static int e(int i10, long j10) {
        return (int) ((((long) i10) * 8000000) / j10);
    }

    public static boolean r(InterfaceC4337q interfaceC4337q, byte[] bArr) {
        interfaceC4337q.i();
        byte[] bArr2 = new byte[bArr.length];
        interfaceC4337q.s(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f38951e = 0L;
        this.f38952f = 0;
        this.f38953g = 0;
        this.f38963q = j11;
        J j12 = this.f38961o;
        if (!(j12 instanceof E)) {
            if (j10 == 0 || !(j12 instanceof C4329i)) {
                this.f38957k = 0L;
                return;
            } else {
                this.f38957k = ((C4329i) j12).c(j10);
                return;
            }
        }
        long jB = ((E) j12).b(j10);
        this.f38957k = jB;
        if (m(jB, this.f38963q)) {
            return;
        }
        this.f38962p = true;
        this.f38960n = this.f38949c;
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f38958l = rVar;
        O oF = rVar.f(0, 1);
        this.f38959m = oF;
        this.f38960n = oF;
        rVar.n();
    }

    public final void d() {
        AbstractC0853a.i(this.f38959m);
        M.i(this.f38958l);
    }

    public final J g(long j10, boolean z10) {
        return new C4329i(j10, this.f38954h, e(this.f38955i, 20000L), this.f38955i, z10);
    }

    public final int h(int i10) throws w {
        if (n(i10)) {
            return this.f38950d ? f38944u[i10] : f38943t[i10];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Illegal AMR ");
        sb2.append(this.f38950d ? "WB" : "NB");
        sb2.append(" frame type ");
        sb2.append(i10);
        throw w.a(sb2.toString(), null);
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) throws w {
        d();
        if (interfaceC4337q.getPosition() == 0 && !t(interfaceC4337q)) {
            throw w.a("Could not find AMR header.", null);
        }
        p();
        int iU = u(interfaceC4337q);
        q(interfaceC4337q.getLength(), iU);
        if (iU == -1) {
            J j10 = this.f38961o;
            if (j10 instanceof E) {
                long j11 = this.f38957k + this.f38951e;
                ((E) j10).f(j11);
                this.f38958l.v(this.f38961o);
                this.f38959m.f(j11);
            }
        }
        return iU;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        return t(interfaceC4337q);
    }

    public final boolean l(int i10) {
        if (this.f38950d) {
            return false;
        }
        return i10 < 12 || i10 > 14;
    }

    public final boolean m(long j10, long j11) {
        return Math.abs(j11 - j10) < 20000;
    }

    public final boolean n(int i10) {
        if (i10 < 0 || i10 > 15) {
            return false;
        }
        return o(i10) || l(i10);
    }

    public final boolean o(int i10) {
        if (this.f38950d) {
            return i10 < 10 || i10 > 13;
        }
        return false;
    }

    public final void p() {
        if (this.f38964r) {
            return;
        }
        this.f38964r = true;
        boolean z10 = this.f38950d;
        String str = z10 ? "audio/amr-wb" : "audio/amr";
        this.f38959m.e(new o.b().W(str).y0(z10 ? "audio/amr-wb" : "audio/3gpp").o0(z10 ? f38944u[8] : f38943t[7]).T(1).z0(z10 ? 16000 : 8000).P());
    }

    public final void q(long j10, int i10) {
        int i11;
        if (this.f38961o != null) {
            return;
        }
        int i12 = this.f38948b;
        if ((i12 & 4) != 0) {
            this.f38961o = new E(new long[]{this.f38954h}, new long[]{0}, -9223372036854775807L);
        } else if ((i12 & 1) == 0 || !((i11 = this.f38955i) == -1 || i11 == this.f38952f)) {
            this.f38961o = new J.b(-9223372036854775807L);
        } else if (this.f38956j >= 20 || i10 == -1) {
            J jG = g(j10, (i12 & 2) != 0);
            this.f38961o = jG;
            this.f38959m.f(jG.m());
        }
        J j11 = this.f38961o;
        if (j11 != null) {
            this.f38958l.v(j11);
        }
    }

    public final int s(InterfaceC4337q interfaceC4337q) throws w {
        interfaceC4337q.i();
        interfaceC4337q.s(this.f38947a, 0, 1);
        byte b10 = this.f38947a[0];
        if ((b10 & 131) <= 0) {
            return h((b10 >> 3) & 15);
        }
        throw w.a("Invalid padding bits for frame header " + ((int) b10), null);
    }

    public final boolean t(InterfaceC4337q interfaceC4337q) {
        byte[] bArr = f38945v;
        if (r(interfaceC4337q, bArr)) {
            this.f38950d = false;
            interfaceC4337q.q(bArr.length);
            return true;
        }
        byte[] bArr2 = f38946w;
        if (!r(interfaceC4337q, bArr2)) {
            return false;
        }
        this.f38950d = true;
        interfaceC4337q.q(bArr2.length);
        return true;
    }

    public final int u(InterfaceC4337q interfaceC4337q) throws w {
        if (this.f38953g == 0) {
            try {
                int iS = s(interfaceC4337q);
                this.f38952f = iS;
                this.f38953g = iS;
                if (this.f38955i == -1) {
                    this.f38954h = interfaceC4337q.getPosition();
                    this.f38955i = this.f38952f;
                }
                if (this.f38955i == this.f38952f) {
                    this.f38956j++;
                }
                J j10 = this.f38961o;
                if (j10 instanceof E) {
                    E e10 = (E) j10;
                    long j11 = this.f38957k + this.f38951e + 20000;
                    long position = interfaceC4337q.getPosition() + ((long) this.f38952f);
                    if (!e10.c(j11, PipesConfigBase.DEFAULT_MAX_FOR_EMIT_BATCH)) {
                        e10.a(j11, position);
                    }
                    if (this.f38962p && m(j11, this.f38963q)) {
                        this.f38962p = false;
                        this.f38960n = this.f38959m;
                    }
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int iA = this.f38960n.a(interfaceC4337q, this.f38953g, true);
        if (iA == -1) {
            return -1;
        }
        int i10 = this.f38953g - iA;
        this.f38953g = i10;
        if (i10 > 0) {
            return 0;
        }
        this.f38960n.d(this.f38957k + this.f38951e, 1, this.f38952f, 0, null);
        this.f38951e += 20000;
        return 0;
    }

    public C4678b(int i10) {
        this.f38948b = (i10 & 2) != 0 ? i10 | 1 : i10;
        this.f38947a = new byte[1];
        this.f38955i = -1;
        C4334n c4334n = new C4334n();
        this.f38949c = c4334n;
        this.f38960n = c4334n;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
