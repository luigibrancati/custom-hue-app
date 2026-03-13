package X6;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F2 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Long f18252A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f18253B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public String f18254C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f18255D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public int f18256E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public long f18257F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public String f18258G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public byte[] f18259H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f18260I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public long f18261J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public long f18262K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public long f18263L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f18264M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public long f18265N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public long f18266O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public String f18267P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f18268Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public long f18269R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public long f18270S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2416j3 f18271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f18272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f18281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f18282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f18283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18284n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f18285o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Boolean f18287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f18288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public List f18289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f18290t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f18291u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f18292v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public long f18293w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f18294x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f18295y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Long f18296z;

    public F2(C2416j3 c2416j3, String str) {
        AbstractC6056k.l(c2416j3);
        AbstractC6056k.f(str);
        this.f18271a = c2416j3;
        this.f18272b = str;
        c2416j3.b().h();
    }

    public final boolean A() {
        this.f18271a.b().h();
        return this.f18268Q;
    }

    public final void A0(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18278h != j10;
        this.f18278h = j10;
    }

    public final int B() {
        this.f18271a.b().h();
        return this.f18255D;
    }

    public final long B0() {
        this.f18271a.b().h();
        return this.f18279i;
    }

    public final void C(int i10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18255D != i10;
        this.f18255D = i10;
    }

    public final void C0(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18279i != j10;
        this.f18279i = j10;
    }

    public final int D() {
        this.f18271a.b().h();
        return this.f18256E;
    }

    public final String D0() {
        this.f18271a.b().h();
        return this.f18280j;
    }

    public final void E(int i10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18256E != i10;
        this.f18256E = i10;
    }

    public final void E0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18280j, str);
        this.f18280j = str;
    }

    public final void F(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18257F != j10;
        this.f18257F = j10;
    }

    public final long F0() {
        this.f18271a.b().h();
        return this.f18281k;
    }

    public final long G() {
        this.f18271a.b().h();
        return this.f18257F;
    }

    public final void G0(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18281k != j10;
        this.f18281k = j10;
    }

    public final void H(String str) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18258G != str;
        this.f18258G = str;
    }

    public final String H0() {
        this.f18271a.b().h();
        return this.f18282l;
    }

    public final String I() {
        this.f18271a.b().h();
        return this.f18258G;
    }

    public final void I0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18282l, str);
        this.f18282l = str;
    }

    public final void J(byte[] bArr) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18259H != bArr;
        this.f18259H = bArr;
    }

    public final long J0() {
        this.f18271a.b().h();
        return this.f18283m;
    }

    public final byte[] K() {
        this.f18271a.b().h();
        return this.f18259H;
    }

    public final void K0(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18283m != j10;
        this.f18283m = j10;
    }

    public final void L(int i10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18260I != i10;
        this.f18260I = i10;
    }

    public final long L0() {
        this.f18271a.b().h();
        return this.f18284n;
    }

    public final int M() {
        this.f18271a.b().h();
        return this.f18260I;
    }

    public final String N() {
        this.f18271a.b().h();
        String str = this.f18267P;
        O(null);
        return str;
    }

    public final void O(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18267P, str);
        this.f18267P = str;
    }

    public final boolean P() {
        this.f18271a.b().h();
        return this.f18286p;
    }

    public final void Q(boolean z10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18286p != z10;
        this.f18286p = z10;
    }

    public final Boolean R() {
        this.f18271a.b().h();
        return this.f18287q;
    }

    public final void S(Boolean bool) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18287q, bool);
        this.f18287q = bool;
    }

    public final List T() {
        this.f18271a.b().h();
        return this.f18289s;
    }

    public final void U(List list) {
        this.f18271a.b().h();
        if (Objects.equals(this.f18289s, list)) {
            return;
        }
        this.f18268Q = true;
        this.f18289s = list != null ? new ArrayList(list) : null;
    }

    public final boolean V() {
        this.f18271a.b().h();
        return this.f18291u;
    }

    public final void W(boolean z10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18291u != z10;
        this.f18291u = z10;
    }

    public final long X() {
        this.f18271a.b().h();
        return this.f18292v;
    }

    public final void Y(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18292v != j10;
        this.f18292v = j10;
    }

    public final long Z() {
        this.f18271a.b().h();
        return this.f18293w;
    }

    public final void a(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18284n != j10;
        this.f18284n = j10;
    }

    public final void a0(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18293w != j10;
        this.f18293w = j10;
    }

    public final long b() {
        this.f18271a.b().h();
        return this.f18288r;
    }

    public final int b0() {
        this.f18271a.b().h();
        return this.f18294x;
    }

    public final void c(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18288r != j10;
        this.f18288r = j10;
    }

    public final void c0(int i10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18294x != i10;
        this.f18294x = i10;
    }

    public final boolean d() {
        this.f18271a.b().h();
        return this.f18285o;
    }

    public final boolean d0() {
        this.f18271a.b().h();
        return this.f18295y;
    }

    public final void e(boolean z10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18285o != z10;
        this.f18285o = z10;
    }

    public final void e0(boolean z10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18295y != z10;
        this.f18295y = z10;
    }

    public final void f(long j10) {
        AbstractC6056k.a(j10 >= 0);
        this.f18271a.b().h();
        this.f18268Q |= this.f18277g != j10;
        this.f18277g = j10;
    }

    public final Long f0() {
        this.f18271a.b().h();
        return this.f18296z;
    }

    public final long g() {
        this.f18271a.b().h();
        return this.f18277g;
    }

    public final void g0(Long l10) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18296z, l10);
        this.f18296z = l10;
    }

    public final long h() {
        this.f18271a.b().h();
        return this.f18269R;
    }

    public final Long h0() {
        this.f18271a.b().h();
        return this.f18252A;
    }

    public final void i(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18269R != j10;
        this.f18269R = j10;
    }

    public final void i0(Long l10) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18252A, l10);
        this.f18252A = l10;
    }

    public final long j() {
        this.f18271a.b().h();
        return this.f18270S;
    }

    public final long j0() {
        this.f18271a.b().h();
        return this.f18253B;
    }

    public final void k(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18270S != j10;
        this.f18270S = j10;
    }

    public final void k0(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18253B != j10;
        this.f18253B = j10;
    }

    public final void l() {
        C2416j3 c2416j3 = this.f18271a;
        c2416j3.b().h();
        long j10 = this.f18277g + 1;
        if (j10 > 2147483647L) {
            c2416j3.a().r().b("Bundle index overflow. appId", C2542z2.x(this.f18272b));
            j10 = 0;
        }
        this.f18268Q = true;
        this.f18277g = j10;
    }

    public final String l0() {
        this.f18271a.b().h();
        return this.f18254C;
    }

    public final void m(long j10) {
        C2416j3 c2416j3 = this.f18271a;
        c2416j3.b().h();
        long j11 = this.f18277g + j10;
        if (j11 > 2147483647L) {
            c2416j3.a().r().b("Bundle index overflow. appId", C2542z2.x(this.f18272b));
            j11 = (-1) + j10;
        }
        long j12 = this.f18257F + 1;
        if (j12 > 2147483647L) {
            c2416j3.a().r().b("Delivery index overflow. appId", C2542z2.x(this.f18272b));
            j12 = 0;
        }
        this.f18268Q = true;
        this.f18277g = j11;
        this.f18257F = j12;
    }

    public final void m0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18254C != str;
        this.f18254C = str;
    }

    public final long n() {
        this.f18271a.b().h();
        return this.f18261J;
    }

    public final void n0() {
        this.f18271a.b().h();
        this.f18268Q = false;
    }

    public final void o(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18261J != j10;
        this.f18261J = j10;
    }

    public final String o0() {
        this.f18271a.b().h();
        return this.f18272b;
    }

    public final long p() {
        this.f18271a.b().h();
        return this.f18262K;
    }

    public final String p0() {
        this.f18271a.b().h();
        return this.f18273c;
    }

    public final void q(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18262K != j10;
        this.f18262K = j10;
    }

    public final void q0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18273c, str);
        this.f18273c = str;
    }

    public final long r() {
        this.f18271a.b().h();
        return this.f18263L;
    }

    public final String r0() {
        this.f18271a.b().h();
        return this.f18274d;
    }

    public final void s(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18263L != j10;
        this.f18263L = j10;
    }

    public final void s0(String str) {
        this.f18271a.b().h();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.f18268Q |= true ^ Objects.equals(this.f18274d, str);
        this.f18274d = str;
    }

    public final long t() {
        this.f18271a.b().h();
        return this.f18264M;
    }

    public final String t0() {
        this.f18271a.b().h();
        return this.f18290t;
    }

    public final void u(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18264M != j10;
        this.f18264M = j10;
    }

    public final void u0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18290t, str);
        this.f18290t = str;
    }

    public final long v() {
        this.f18271a.b().h();
        return this.f18266O;
    }

    public final String v0() {
        this.f18271a.b().h();
        return this.f18275e;
    }

    public final void w(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18266O != j10;
        this.f18266O = j10;
    }

    public final void w0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18275e, str);
        this.f18275e = str;
    }

    public final long x() {
        this.f18271a.b().h();
        return this.f18265N;
    }

    public final String x0() {
        this.f18271a.b().h();
        return this.f18276f;
    }

    public final void y(long j10) {
        this.f18271a.b().h();
        this.f18268Q |= this.f18265N != j10;
        this.f18265N = j10;
    }

    public final void y0(String str) {
        this.f18271a.b().h();
        this.f18268Q |= !Objects.equals(this.f18276f, str);
        this.f18276f = str;
    }

    public final String z() {
        this.f18271a.b().h();
        return this.f18267P;
    }

    public final long z0() {
        this.f18271a.b().h();
        return this.f18278h;
    }
}
