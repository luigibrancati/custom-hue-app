package Q1;

import D1.C0753k;
import D1.u;
import G1.AbstractC0853a;
import G1.C;
import G1.H;
import G1.J;
import I1.j;
import K7.AbstractC1081v;
import L1.B0;
import Q1.f;
import R1.f;
import android.net.Uri;
import e2.f;
import i2.C4330j;
import i2.InterfaceC4337q;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j extends b2.m {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final AtomicInteger f13381O = new AtomicInteger();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final boolean f13382A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final boolean f13383B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final B0 f13384C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final long f13385D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public k f13386E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public s f13387F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f13388G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f13389H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public volatile boolean f13390I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f13391J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public AbstractC1081v f13392K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f13393L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public long f13394M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public boolean f13395N;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f13396k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f13397l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Uri f13398m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f13399n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f13400o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final I1.f f13401p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I1.j f13402q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f13403r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f13404s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final boolean f13405t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final H f13406u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final h f13407v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final List f13408w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C0753k f13409x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final w2.h f13410y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final C f13411z;

    public j(h hVar, I1.f fVar, I1.j jVar, D1.o oVar, boolean z10, I1.f fVar2, I1.j jVar2, boolean z11, Uri uri, List list, int i10, Object obj, long j10, long j11, long j12, int i11, boolean z12, int i12, boolean z13, boolean z14, H h10, long j13, C0753k c0753k, k kVar, w2.h hVar2, C c10, boolean z15, boolean z16, B0 b02) {
        super(fVar, jVar, oVar, i10, obj, j10, j11, j12);
        this.f13382A = z10;
        this.f13400o = i11;
        this.f13394M = z12 ? j11 - j10 : -9223372036854775807L;
        this.f13397l = i12;
        this.f13402q = jVar2;
        this.f13401p = fVar2;
        this.f13389H = jVar2 != null;
        this.f13383B = z11;
        this.f13398m = uri;
        this.f13404s = z14;
        this.f13406u = h10;
        this.f13385D = j13;
        this.f13405t = z13;
        this.f13407v = hVar;
        this.f13408w = list;
        this.f13409x = c0753k;
        this.f13403r = kVar;
        this.f13410y = hVar2;
        this.f13411z = c10;
        this.f13395N = z15;
        this.f13399n = z16;
        this.f13384C = b02;
        this.f13392K = AbstractC1081v.z();
        this.f13396k = f13381O.getAndIncrement();
    }

    public static I1.f h(I1.f fVar, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return fVar;
        }
        AbstractC0853a.e(bArr2);
        return new a(fVar, bArr, bArr2);
    }

    public static j j(h hVar, I1.f fVar, D1.o oVar, long j10, R1.f fVar2, f.e eVar, Uri uri, List list, int i10, Object obj, boolean z10, v vVar, long j11, j jVar, byte[] bArr, byte[] bArr2, boolean z11, boolean z12, B0 b02, f.a aVar) {
        boolean z13;
        I1.f fVarH;
        I1.j jVarA;
        boolean z14;
        Uri uri2;
        w2.h hVar2;
        C c10;
        k kVar;
        f.g gVar = eVar.f13375a;
        I1.j jVarA2 = new j.b().i(J.g(fVar2.f14420a, gVar.f14383a)).h(gVar.f14391i).g(gVar.f14392j).b(eVar.f13378d ? 8 : 0).a();
        boolean z15 = bArr != null;
        I1.f fVarH2 = h(fVar, bArr, z15 ? l((String) AbstractC0853a.e(gVar.f14390h)) : null);
        f.C0178f c0178f = gVar.f14384b;
        if (c0178f != null) {
            boolean z16 = bArr2 != null;
            byte[] bArrL = z16 ? l((String) AbstractC0853a.e(c0178f.f14390h)) : null;
            z13 = true;
            jVarA = new j.b().i(J.g(fVar2.f14420a, c0178f.f14383a)).h(c0178f.f14391i).g(c0178f.f14392j).a();
            fVarH = h(fVar, bArr2, bArrL);
            z14 = z16;
        } else {
            z13 = true;
            fVarH = null;
            jVarA = null;
            z14 = false;
        }
        long j12 = j10 + gVar.f14387e;
        long j13 = j12 + gVar.f14385c;
        int i11 = fVar2.f14324j + gVar.f14386d;
        if (jVar != null) {
            I1.j jVar2 = jVar.f13402q;
            boolean z17 = (jVarA == jVar2 || (jVarA != null && jVar2 != null && jVarA.f5437a.equals(jVar2.f5437a) && jVarA.f5443g == jVar.f13402q.f5443g)) ? z13 : false;
            uri2 = uri;
            boolean z18 = (uri2.equals(jVar.f13398m) && jVar.f13391J) ? z13 : false;
            hVar2 = jVar.f13410y;
            c10 = jVar.f13411z;
            kVar = (z17 && z18 && !jVar.f13393L && jVar.f13397l == i11) ? jVar.f13386E : null;
        } else {
            uri2 = uri;
            hVar2 = new w2.h();
            c10 = new C(10);
            kVar = null;
        }
        return new j(hVar, fVarH2, jVarA2, oVar, z15, fVarH, jVarA, z14, uri2, list, i10, obj, j12, j13, eVar.f13376b, eVar.f13377c, !eVar.f13378d, i11, gVar.f14393k, z10, vVar.a(i11), j11, gVar.f14388f, kVar, hVar2, c10, z11, z12, b02);
    }

    public static byte[] l(String str) {
        if (J7.c.e(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    public static boolean x(j jVar, long j10, Uri uri, boolean z10, f.e eVar, long j11) {
        if (jVar == null) {
            return false;
        }
        if (uri.equals(jVar.f13398m) && jVar.f13391J) {
            return false;
        }
        return !z10 || j11 + eVar.f13375a.f14387e < j10;
    }

    @Override // e2.m.e
    public void b() {
        this.f13390I = true;
    }

    @Override // b2.m
    public boolean g() {
        return this.f13391J;
    }

    public void i() {
        this.f13395N = false;
    }

    public final void k(I1.f fVar, I1.j jVar, boolean z10, boolean z11) {
        I1.j jVarE;
        long position;
        if (z10) {
            z = this.f13388G != 0;
            jVarE = jVar;
        } else {
            jVarE = jVar.e(this.f13388G);
        }
        try {
            C4330j c4330jU = u(fVar, jVarE, z11);
            if (z) {
                c4330jU.q(this.f13388G);
            }
            while (!this.f13390I && this.f13386E.a(c4330jU)) {
                try {
                    try {
                    } catch (EOFException e10) {
                        if ((this.f24997d.f1796f & 16384) == 0) {
                            throw e10;
                        }
                        this.f13386E.d();
                        position = c4330jU.getPosition();
                    }
                } catch (Throwable th) {
                    this.f13388G = (int) (c4330jU.getPosition() - jVar.f5443g);
                    throw th;
                }
            }
            position = c4330jU.getPosition();
            this.f13388G = (int) (position - jVar.f5443g);
        } finally {
            I1.i.a(fVar);
        }
    }

    @Override // e2.m.e
    public void load() {
        k kVar;
        AbstractC0853a.e(this.f13387F);
        if (this.f13386E == null && (kVar = this.f13403r) != null && kVar.e()) {
            this.f13386E = this.f13403r;
            this.f13389H = false;
        }
        s();
        if (this.f13390I) {
            return;
        }
        if (!this.f13405t) {
            r();
        }
        this.f13391J = !this.f13390I;
    }

    public int m(int i10) {
        AbstractC0853a.g(!this.f13395N);
        if (i10 >= this.f13392K.size()) {
            return 0;
        }
        return ((Integer) this.f13392K.get(i10)).intValue();
    }

    public long n() {
        long j10 = this.f13394M;
        if (j10 != -9223372036854775807L) {
            return this.f25000g + j10;
        }
        return -9223372036854775807L;
    }

    public void o(s sVar, AbstractC1081v abstractC1081v) {
        this.f13387F = sVar;
        this.f13392K = abstractC1081v;
    }

    public void p() {
        this.f13393L = true;
    }

    public boolean q() {
        return this.f13394M != -9223372036854775807L;
    }

    public final void r() {
        k(this.f25002i, this.f24995b, this.f13382A, true);
    }

    public final void s() {
        if (this.f13389H) {
            AbstractC0853a.e(this.f13401p);
            AbstractC0853a.e(this.f13402q);
            k(this.f13401p, this.f13402q, this.f13383B, false);
            this.f13388G = 0;
            this.f13389H = false;
        }
    }

    public final long t(InterfaceC4337q interfaceC4337q) throws Throwable {
        interfaceC4337q.i();
        try {
            this.f13411z.W(10);
            interfaceC4337q.s(this.f13411z.f(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f13411z.O() != 4801587) {
            return -9223372036854775807L;
        }
        this.f13411z.b0(3);
        int iK = this.f13411z.K();
        int i10 = iK + 10;
        if (i10 > this.f13411z.b()) {
            byte[] bArrF = this.f13411z.f();
            this.f13411z.W(i10);
            System.arraycopy(bArrF, 0, this.f13411z.f(), 0, 10);
        }
        interfaceC4337q.s(this.f13411z.f(), 10, iK);
        D1.u uVarE = this.f13410y.e(this.f13411z.f(), iK);
        if (uVarE == null) {
            return -9223372036854775807L;
        }
        int iE = uVarE.e();
        for (int i11 = 0; i11 < iE; i11++) {
            u.a aVarD = uVarE.d(i11);
            if (aVarD instanceof w2.m) {
                w2.m mVar = (w2.m) aVarD;
                if ("com.apple.streaming.transportStreamTimestamp".equals(mVar.f46131b)) {
                    System.arraycopy(mVar.f46132c, 0, this.f13411z.f(), 0, 8);
                    this.f13411z.a0(0);
                    this.f13411z.Z(8);
                    return this.f13411z.E() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    public final C4330j u(I1.f fVar, I1.j jVar, boolean z10) throws Throwable {
        k kVarE;
        long jF = fVar.f(jVar);
        if (z10) {
            try {
                this.f13406u.j(this.f13404s, this.f25000g, this.f13385D);
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            } catch (TimeoutException e10) {
                throw new IOException(e10);
            }
        }
        C4330j c4330j = new C4330j(fVar, jVar.f5443g, jF);
        if (this.f13386E == null) {
            long jT = t(c4330j);
            c4330j.i();
            k kVar = this.f13403r;
            if (kVar != null) {
                kVarE = kVar.g();
            } else {
                kVarE = this.f13407v.e(jVar.f5437a, this.f24997d, this.f13408w, this.f13406u, fVar.g(), c4330j, this.f13384C);
                c4330j = c4330j;
            }
            this.f13386E = kVarE;
            if (kVarE.f()) {
                this.f13387F.r0(jT != -9223372036854775807L ? this.f13406u.b(jT) : this.f25000g);
            } else {
                this.f13387F.r0(0L);
            }
            this.f13387F.d0();
            this.f13386E.c(this.f13387F);
        }
        this.f13387F.o0(this.f13409x);
        return c4330j;
    }

    public void v(long j10) {
        this.f13394M = j10;
    }

    public boolean w() {
        return this.f13395N;
    }
}
