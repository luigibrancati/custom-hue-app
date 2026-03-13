package androidx.media3.exoplayer.dash;

import D1.o;
import D1.v;
import F2.s;
import G1.AbstractC0853a;
import G1.J;
import G1.M;
import I1.f;
import I1.x;
import K1.F0;
import K1.k1;
import K7.AbstractC1083x;
import L1.B0;
import N1.g;
import N1.h;
import O1.i;
import O1.j;
import a2.C2616b;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.dash.a;
import androidx.media3.exoplayer.dash.d;
import b2.AbstractC2792b;
import b2.AbstractC2795e;
import b2.C2794d;
import b2.C2797g;
import b2.C2800j;
import b2.InterfaceC2796f;
import b2.l;
import b2.m;
import d2.r;
import e2.e;
import e2.f;
import e2.k;
import e2.n;
import i2.C4327g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class c implements androidx.media3.exoplayer.dash.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f23621a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N1.b f23622b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f23623c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f23624d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f23625e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f23626f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f23627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d.c f23628h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b[] f23629i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public r f23630j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public O1.c f23631k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f23632l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IOException f23633m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f23634n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f23635o = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements a.InterfaceC0299a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.a f23636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f23637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC2796f.a f23638c;

        public a(f.a aVar) {
            this(aVar, 1);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0299a
        public o d(o oVar) {
            return this.f23638c.d(oVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0299a
        public androidx.media3.exoplayer.dash.a e(n nVar, O1.c cVar, N1.b bVar, int i10, int[] iArr, r rVar, int i11, long j10, boolean z10, List list, d.c cVar2, x xVar, B0 b02, e eVar) {
            f fVarA = this.f23636a.a();
            if (xVar != null) {
                fVarA.h(xVar);
            }
            return new c(this.f23638c, nVar, cVar, bVar, i10, iArr, rVar, i11, fVarA, j10, this.f23637b, z10, list, cVar2, b02, eVar);
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0299a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(boolean z10) {
            this.f23638c.b(z10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0299a
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f23638c.c(i10);
            return this;
        }

        @Override // androidx.media3.exoplayer.dash.a.InterfaceC0299a
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public a a(s.a aVar) {
            this.f23638c.a(aVar);
            return this;
        }

        public a(f.a aVar, int i10) {
            this(new C2794d.b(), aVar, i10);
        }

        public a(InterfaceC2796f.a aVar, f.a aVar2, int i10) {
            this.f23638c = aVar;
            this.f23636a = aVar2;
            this.f23637b = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2796f f23639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j f23640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final O1.b f23641c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g f23642d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long f23643e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f23644f;

        public b(long j10, j jVar, O1.b bVar, InterfaceC2796f interfaceC2796f, long j11, g gVar) {
            this.f23643e = j10;
            this.f23640b = jVar;
            this.f23641c = bVar;
            this.f23644f = j11;
            this.f23639a = interfaceC2796f;
            this.f23642d = gVar;
        }

        public b b(long j10, j jVar) throws C2616b {
            long jF;
            long jF2;
            g gVarL = this.f23640b.l();
            g gVarL2 = jVar.l();
            if (gVarL == null) {
                return new b(j10, jVar, this.f23641c, this.f23639a, this.f23644f, gVarL);
            }
            if (!gVarL.h()) {
                return new b(j10, jVar, this.f23641c, this.f23639a, this.f23644f, gVarL2);
            }
            long jG = gVarL.g(j10);
            if (jG == 0) {
                return new b(j10, jVar, this.f23641c, this.f23639a, this.f23644f, gVarL2);
            }
            AbstractC0853a.i(gVarL2);
            long jI = gVarL.i();
            long jB = gVarL.b(jI);
            long j11 = jG + jI;
            long j12 = j11 - 1;
            long jB2 = gVarL.b(j12) + gVarL.a(j12, j10);
            long jI2 = gVarL2.i();
            long jB3 = gVarL2.b(jI2);
            long j13 = this.f23644f;
            if (jB2 == jB3) {
                jF = j11 - jI2;
            } else {
                if (jB2 < jB3) {
                    throw new C2616b();
                }
                if (jB3 < jB) {
                    jF2 = j13 - (gVarL2.f(jB, j10) - jI);
                    return new b(j10, jVar, this.f23641c, this.f23639a, jF2, gVarL2);
                }
                jF = gVarL.f(jB3, j10) - jI2;
            }
            jF2 = j13 + jF;
            return new b(j10, jVar, this.f23641c, this.f23639a, jF2, gVarL2);
        }

        public b c(g gVar) {
            return new b(this.f23643e, this.f23640b, this.f23641c, this.f23639a, this.f23644f, gVar);
        }

        public b d(O1.b bVar) {
            return new b(this.f23643e, this.f23640b, bVar, this.f23639a, this.f23644f, this.f23642d);
        }

        public long e(long j10) {
            return ((g) AbstractC0853a.i(this.f23642d)).c(this.f23643e, j10) + this.f23644f;
        }

        public long f() {
            return ((g) AbstractC0853a.i(this.f23642d)).i() + this.f23644f;
        }

        public long g(long j10) {
            return (e(j10) + ((g) AbstractC0853a.i(this.f23642d)).j(this.f23643e, j10)) - 1;
        }

        public long h() {
            return ((g) AbstractC0853a.i(this.f23642d)).g(this.f23643e);
        }

        public long i(long j10) {
            return k(j10) + ((g) AbstractC0853a.i(this.f23642d)).a(j10 - this.f23644f, this.f23643e);
        }

        public long j(long j10) {
            return ((g) AbstractC0853a.i(this.f23642d)).f(j10, this.f23643e) + this.f23644f;
        }

        public long k(long j10) {
            return ((g) AbstractC0853a.i(this.f23642d)).b(j10 - this.f23644f);
        }

        public i l(long j10) {
            return ((g) AbstractC0853a.i(this.f23642d)).e(j10 - this.f23644f);
        }

        public boolean m(long j10, long j11) {
            return ((g) AbstractC0853a.i(this.f23642d)).h() || j11 == -9223372036854775807L || i(j10) <= j11;
        }
    }

    /* JADX INFO: renamed from: androidx.media3.exoplayer.dash.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0300c extends AbstractC2792b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f23645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f23646f;

        public C0300c(b bVar, long j10, long j11, long j12) {
            super(j10, j11);
            this.f23645e = bVar;
            this.f23646f = j12;
        }

        @Override // b2.n
        public long a() {
            c();
            return this.f23645e.k(d());
        }

        @Override // b2.n
        public long b() {
            c();
            return this.f23645e.i(d());
        }
    }

    public c(InterfaceC2796f.a aVar, n nVar, O1.c cVar, N1.b bVar, int i10, int[] iArr, r rVar, int i11, f fVar, long j10, int i12, boolean z10, List list, d.c cVar2, B0 b02, e eVar) {
        this.f23621a = nVar;
        this.f23631k = cVar;
        this.f23622b = bVar;
        this.f23623c = iArr;
        this.f23630j = rVar;
        int i13 = i11;
        this.f23624d = i13;
        this.f23625e = fVar;
        this.f23632l = i10;
        this.f23626f = j10;
        this.f23627g = i12;
        d.c cVar3 = cVar2;
        this.f23628h = cVar3;
        long jG = cVar.g(i10);
        ArrayList arrayListO = o();
        this.f23629i = new b[rVar.length()];
        int i14 = 0;
        while (i14 < this.f23629i.length) {
            j jVar = (j) arrayListO.get(rVar.f(i14));
            O1.b bVarJ = bVar.j(jVar.f10818c);
            b[] bVarArr = this.f23629i;
            O1.b bVar2 = bVarJ == null ? (O1.b) jVar.f10818c.get(0) : bVarJ;
            InterfaceC2796f interfaceC2796fE = aVar.e(i13, jVar.f10817b, z10, list, cVar3, b02);
            long j11 = jG;
            int i15 = i14;
            bVarArr[i15] = new b(j11, jVar, bVar2, interfaceC2796fE, 0L, jVar.l());
            i14 = i15 + 1;
            i13 = i11;
            jG = j11;
            cVar3 = cVar2;
        }
    }

    @Override // b2.InterfaceC2799i
    public void a() throws IOException {
        IOException iOException = this.f23633m;
        if (iOException != null) {
            throw iOException;
        }
        this.f23621a.a();
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void b(r rVar) {
        this.f23630j = rVar;
    }

    @Override // b2.InterfaceC2799i
    public long c(long j10, k1 k1Var) {
        b[] bVarArr = this.f23629i;
        int length = bVarArr.length;
        int i10 = 0;
        while (i10 < length) {
            b bVar = bVarArr[i10];
            if (bVar.f23642d != null) {
                long jH = bVar.h();
                if (jH != 0) {
                    long j11 = bVar.j(j10);
                    long jK = bVar.k(j11);
                    return k1Var.a(j10, jK, (jK >= j10 || (jH != -1 && j11 >= (bVar.f() + jH) - 1)) ? jK : bVar.k(j11 + 1));
                }
            }
            i10++;
            k1Var = k1Var;
            j10 = j10;
        }
        return j10;
    }

    @Override // b2.InterfaceC2799i
    public boolean d(long j10, AbstractC2795e abstractC2795e, List list) {
        if (this.f23633m != null) {
            return false;
        }
        return this.f23630j.m(j10, abstractC2795e, list);
    }

    @Override // b2.InterfaceC2799i
    public void e(AbstractC2795e abstractC2795e) {
        C4327g c4327gC;
        if (abstractC2795e instanceof l) {
            int iD = this.f23630j.d(((l) abstractC2795e).f24997d);
            b bVar = this.f23629i[iD];
            if (bVar.f23642d == null && (c4327gC = ((InterfaceC2796f) AbstractC0853a.i(bVar.f23639a)).c()) != null) {
                this.f23629i[iD] = bVar.c(new N1.i(c4327gC, bVar.f23640b.f10819d));
            }
        }
        d.c cVar = this.f23628h;
        if (cVar != null) {
            cVar.j(abstractC2795e);
        }
    }

    @Override // b2.InterfaceC2799i
    public void f(F0 f02, long j10, List list, C2797g c2797g) {
        boolean z10;
        b2.n[] nVarArr;
        long j11;
        int i10;
        int i11;
        c cVar;
        m mVar;
        c cVar2 = this;
        if (cVar2.f23633m != null) {
            return;
        }
        long j12 = f02.f6848a;
        long j13 = j10 - j12;
        long jM0 = M.M0(cVar2.f23631k.f10766a) + M.M0(cVar2.f23631k.d(cVar2.f23632l).f10803b) + j10;
        d.c cVar3 = cVar2.f23628h;
        if (cVar3 == null || !cVar3.i(jM0)) {
            long jM02 = M.M0(M.h0(cVar2.f23626f));
            long jN = cVar2.n(jM02);
            boolean z11 = true;
            m mVar2 = list.isEmpty() ? null : (m) list.get(list.size() - 1);
            int length = cVar2.f23630j.length();
            b2.n[] nVarArr2 = new b2.n[length];
            int i12 = 0;
            while (i12 < length) {
                b bVar = cVar2.f23629i[i12];
                if (bVar.f23642d == null) {
                    nVarArr2[i12] = b2.n.f25049a;
                    cVar = cVar2;
                    mVar = mVar2;
                    z10 = z11;
                    nVarArr = nVarArr2;
                    j11 = j13;
                    i11 = length;
                    i10 = i12;
                } else {
                    b2.n[] nVarArr3 = nVarArr2;
                    long jE = bVar.e(jM02);
                    z10 = z11;
                    nVarArr = nVarArr3;
                    m mVar3 = mVar2;
                    long jG = bVar.g(jM02);
                    j11 = j13;
                    i10 = i12;
                    i11 = length;
                    long jP = cVar2.p(bVar, mVar3, j10, jE, jG);
                    cVar = cVar2;
                    mVar = mVar3;
                    if (jP < jE) {
                        nVarArr[i10] = b2.n.f25049a;
                    } else {
                        nVarArr[i10] = new C0300c(cVar.s(i10), jP, jG, jN);
                    }
                }
                i12 = i10 + 1;
                cVar2 = cVar;
                length = i11;
                mVar2 = mVar;
                nVarArr2 = nVarArr;
                z11 = z10;
                j13 = j11;
            }
            c cVar4 = cVar2;
            m mVar4 = mVar2;
            boolean z12 = z11;
            cVar4.f23630j.g(j12, j13, cVar4.l(jM02, j12), list, nVarArr2);
            int iB = cVar4.f23630j.b();
            cVar4.f23635o = SystemClock.elapsedRealtime();
            b bVarS = cVar4.s(iB);
            InterfaceC2796f interfaceC2796f = bVarS.f23639a;
            if (interfaceC2796f != null) {
                j jVar = bVarS.f23640b;
                i iVarN = interfaceC2796f.d() == null ? jVar.n() : null;
                i iVarM = bVarS.f23642d == null ? jVar.m() : null;
                if (iVarN != null || iVarM != null) {
                    c2797g.f25003a = cVar4.q(bVarS, cVar4.f23625e, cVar4.f23630j.s(), cVar4.f23630j.t(), cVar4.f23630j.j(), iVarN, iVarM, null);
                    return;
                }
            }
            long j14 = bVarS.f23643e;
            O1.c cVar5 = cVar4.f23631k;
            boolean z13 = (cVar5.f10769d && cVar4.f23632l == cVar5.e() + (-1)) ? z12 : false;
            boolean z14 = (z13 && j14 == -9223372036854775807L) ? false : z12;
            if (bVarS.h() == 0) {
                c2797g.f25004b = z14;
                return;
            }
            long jE2 = bVarS.e(jM02);
            long jG2 = bVarS.g(jM02);
            if (z13) {
                long jI = bVarS.i(jG2);
                z14 &= jI + (jI - bVarS.k(jG2)) >= j14 ? z12 : false;
            }
            boolean z15 = z14;
            long jP2 = cVar4.p(bVarS, mVar4, j10, jE2, jG2);
            if (jP2 < jE2) {
                cVar4.f23633m = new C2616b();
                return;
            }
            if (jP2 > jG2 || (cVar4.f23634n && jP2 >= jG2)) {
                c2797g.f25004b = z15;
                return;
            }
            if (z15 && bVarS.k(jP2) >= j14) {
                c2797g.f25004b = z12;
                return;
            }
            int iMin = (int) Math.min(cVar4.f23627g, (jG2 - jP2) + 1);
            if (j14 != -9223372036854775807L) {
                while (iMin > 1 && bVarS.k((((long) iMin) + jP2) - 1) >= j14) {
                    iMin--;
                }
            }
            c2797g.f25003a = cVar4.r(bVarS, cVar4.f23625e, cVar4.f23624d, cVar4.f23630j.s(), cVar4.f23630j.t(), cVar4.f23630j.j(), jP2, iMin, list.isEmpty() ? j10 : -9223372036854775807L, jN, null);
        }
    }

    @Override // b2.InterfaceC2799i
    public int g(long j10, List list) {
        return (this.f23633m != null || this.f23630j.length() < 2) ? list.size() : this.f23630j.q(j10, list);
    }

    @Override // b2.InterfaceC2799i
    public boolean i(AbstractC2795e abstractC2795e, boolean z10, k.c cVar, k kVar) {
        k.b bVarC;
        if (!z10) {
            return false;
        }
        d.c cVar2 = this.f23628h;
        if (cVar2 != null && cVar2.k(abstractC2795e)) {
            return true;
        }
        if (!this.f23631k.f10769d && (abstractC2795e instanceof m)) {
            IOException iOException = cVar.f33630c;
            if ((iOException instanceof I1.s) && ((I1.s) iOException).f5505d == 404) {
                b bVar = this.f23629i[this.f23630j.d(abstractC2795e.f24997d)];
                long jH = bVar.h();
                if (jH != -1 && jH != 0) {
                    if (((m) abstractC2795e).f() > (bVar.f() + jH) - 1) {
                        this.f23634n = true;
                        return true;
                    }
                }
            }
        }
        b bVar2 = this.f23629i[this.f23630j.d(abstractC2795e.f24997d)];
        O1.b bVarJ = this.f23622b.j(bVar2.f23640b.f10818c);
        if (bVarJ != null && !bVar2.f23641c.equals(bVarJ)) {
            return true;
        }
        k.a aVarK = k(this.f23630j, bVar2.f23640b.f10818c);
        if ((aVarK.a(2) || aVarK.a(1)) && (bVarC = kVar.c(aVarK, cVar)) != null && aVarK.a(bVarC.f33626a)) {
            int i10 = bVarC.f33626a;
            if (i10 == 2) {
                r rVar = this.f23630j;
                return rVar.h(rVar.d(abstractC2795e.f24997d), bVarC.f33627b);
            }
            if (i10 == 1) {
                this.f23622b.e(bVar2.f23641c, bVarC.f33627b);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.dash.a
    public void j(O1.c cVar, int i10) {
        try {
            this.f23631k = cVar;
            this.f23632l = i10;
            long jG = cVar.g(i10);
            ArrayList arrayListO = o();
            for (int i11 = 0; i11 < this.f23629i.length; i11++) {
                j jVar = (j) arrayListO.get(this.f23630j.f(i11));
                b[] bVarArr = this.f23629i;
                bVarArr[i11] = bVarArr[i11].b(jG, jVar);
            }
        } catch (C2616b e10) {
            this.f23633m = e10;
        }
    }

    public final k.a k(r rVar, List list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = rVar.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            if (rVar.a(i11, jElapsedRealtime)) {
                i10++;
            }
        }
        int iF = N1.b.f(list);
        return new k.a(iF, iF - this.f23622b.g(list), length, i10);
    }

    public final long l(long j10, long j11) {
        if (!this.f23631k.f10769d || this.f23629i[0].h() == 0) {
            return -9223372036854775807L;
        }
        return Math.max(0L, Math.min(n(j10), this.f23629i[0].i(this.f23629i[0].g(j10))) - j11);
    }

    public final Pair m(long j10, i iVar, b bVar) {
        long j11 = j10 + 1;
        if (j11 >= bVar.h()) {
            return null;
        }
        i iVarL = bVar.l(j11);
        String strA = J.a(iVar.b(bVar.f23641c.f10762a), iVarL.b(bVar.f23641c.f10762a));
        String str = iVarL.f10812a + "-";
        if (iVarL.f10813b != -1) {
            str = str + (iVarL.f10812a + iVarL.f10813b);
        }
        return new Pair(strA, str);
    }

    public final long n(long j10) {
        O1.c cVar = this.f23631k;
        long j11 = cVar.f10766a;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 - M.M0(j11 + cVar.d(this.f23632l).f10803b);
    }

    public final ArrayList o() {
        List list = this.f23631k.d(this.f23632l).f10804c;
        ArrayList arrayList = new ArrayList();
        for (int i10 : this.f23623c) {
            arrayList.addAll(((O1.a) list.get(i10)).f10758c);
        }
        return arrayList;
    }

    public final long p(b bVar, m mVar, long j10, long j11, long j12) {
        return mVar != null ? mVar.f() : M.p(bVar.j(j10), j11, j12);
    }

    public AbstractC2795e q(b bVar, f fVar, o oVar, int i10, Object obj, i iVar, i iVar2, f.a aVar) {
        i iVar3 = iVar;
        j jVar = bVar.f23640b;
        if (iVar3 != null) {
            i iVarA = iVar3.a(iVar2, bVar.f23641c.f10762a);
            if (iVarA != null) {
                iVar3 = iVarA;
            }
        } else {
            iVar3 = (i) AbstractC0853a.e(iVar2);
        }
        return new l(fVar, h.a(jVar, bVar.f23641c.f10762a, iVar3, 0, AbstractC1083x.j()), oVar, i10, obj, bVar.f23639a);
    }

    public AbstractC2795e r(b bVar, I1.f fVar, int i10, o oVar, int i11, Object obj, long j10, int i12, long j11, long j12, f.a aVar) {
        j jVar = bVar.f23640b;
        long jK = bVar.k(j10);
        i iVarL = bVar.l(j10);
        if (bVar.f23639a == null) {
            int i13 = 8;
            long jI = bVar.i(j10);
            if (bVar.m(j10, j12)) {
                i13 = 0;
            }
            return new b2.o(fVar, h.a(jVar, bVar.f23641c.f10762a, iVarL, i13, AbstractC1083x.j()), oVar, i11, obj, jK, jI, j10, i10, oVar);
        }
        int i14 = 8;
        int i15 = 1;
        int i16 = 1;
        while (i15 < i12) {
            i iVarA = iVarL.a(bVar.l(j10 + ((long) i15)), bVar.f23641c.f10762a);
            if (iVarA == null) {
                break;
            }
            i16++;
            i15++;
            iVarL = iVarA;
        }
        long j13 = (j10 + ((long) i16)) - 1;
        int i17 = i16;
        long jI2 = bVar.i(j13);
        long j14 = bVar.f23643e;
        if (j14 == -9223372036854775807L || j14 > jI2) {
            j14 = -9223372036854775807L;
        }
        if (bVar.m(j13, j12)) {
            i14 = 0;
        }
        I1.j jVarA = h.a(jVar, bVar.f23641c.f10762a, iVarL, i14, AbstractC1083x.j());
        long j15 = -jVar.f10819d;
        if (v.q(oVar.f1805o)) {
            j15 += jK;
        }
        return new C2800j(fVar, jVarA, oVar, i11, obj, jK, jI2, j11, j14, j10, i17, j15, bVar.f23639a);
    }

    @Override // b2.InterfaceC2799i
    public void release() {
        for (b bVar : this.f23629i) {
            InterfaceC2796f interfaceC2796f = bVar.f23639a;
            if (interfaceC2796f != null) {
                interfaceC2796f.release();
            }
        }
    }

    public final b s(int i10) {
        b bVar = this.f23629i[i10];
        O1.b bVarJ = this.f23622b.j(bVar.f23640b.f10818c);
        if (bVarJ == null || bVarJ.equals(bVar.f23641c)) {
            return bVar;
        }
        b bVarD = bVar.d(bVarJ);
        this.f23629i[i10] = bVarD;
        return bVarD;
    }
}
