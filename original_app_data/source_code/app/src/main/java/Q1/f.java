package Q1;

import D1.E;
import G1.AbstractC0853a;
import G1.J;
import G1.M;
import I1.j;
import I1.x;
import K1.F0;
import K1.k1;
import K7.A;
import K7.AbstractC1081v;
import L1.B0;
import R1.f;
import a2.C2616b;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import b2.AbstractC2792b;
import b2.AbstractC2795e;
import d2.AbstractC3809c;
import e2.f;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f13346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I1.f f13347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I1.f f13348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f13349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri[] f13350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final D1.o[] f13351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final R1.l f13352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final E f13353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13354i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B0 f13356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f13357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13358m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public IOException f13360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Uri f13361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Uri f13362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public d2.r f13364s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f13366u = -9223372036854775807L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Q1.e f13355j = new Q1.e(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f13359n = M.f4267f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f13365t = -9223372036854775807L;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends b2.k {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f13367l;

        public a(I1.f fVar, I1.j jVar, D1.o oVar, int i10, Object obj, byte[] bArr) {
            super(fVar, jVar, 3, oVar, i10, obj, bArr);
        }

        @Override // b2.k
        public void f(byte[] bArr, int i10) {
            this.f13367l = Arrays.copyOf(bArr, i10);
        }

        public byte[] i() {
            return this.f13367l;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC2795e f13368a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f13369b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Uri f13370c;

        public b() {
            a();
        }

        public void a() {
            this.f13368a = null;
            this.f13369b = false;
            this.f13370c = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC2792b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f13371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final long f13372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f13373g;

        public c(String str, long j10, List list) {
            super(0L, list.size() - 1);
            this.f13373g = str;
            this.f13372f = j10;
            this.f13371e = list;
        }

        @Override // b2.n
        public long a() {
            c();
            return this.f13372f + ((f.g) this.f13371e.get((int) d())).f14387e;
        }

        @Override // b2.n
        public long b() {
            c();
            f.g gVar = (f.g) this.f13371e.get((int) d());
            return this.f13372f + gVar.f14387e + gVar.f14385c;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC3809c {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f13374i;

        public d(E e10, int[] iArr) {
            super(e10, iArr);
            this.f13374i = d(e10.a(iArr[0]));
        }

        @Override // d2.r
        public int b() {
            return this.f13374i;
        }

        @Override // d2.r
        public void g(long j10, long j11, long j12, List list, b2.n[] nVarArr) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (a(this.f13374i, jElapsedRealtime)) {
                for (int i10 = this.f32817b - 1; i10 >= 0; i10--) {
                    if (!a(i10, jElapsedRealtime)) {
                        this.f13374i = i10;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // d2.r
        public Object j() {
            return null;
        }

        @Override // d2.r
        public int t() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.g f13375a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f13376b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13377c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f13378d;

        public e(f.g gVar, long j10, int i10) {
            this.f13375a = gVar;
            this.f13376b = j10;
            this.f13377c = i10;
            this.f13378d = (gVar instanceof f.d) && ((f.d) gVar).f14377m;
        }
    }

    public f(h hVar, R1.l lVar, Uri[] uriArr, D1.o[] oVarArr, g gVar, x xVar, v vVar, long j10, List list, B0 b02, e2.e eVar) {
        this.f13346a = hVar;
        this.f13352g = lVar;
        this.f13350e = uriArr;
        this.f13351f = oVarArr;
        this.f13349d = vVar;
        this.f13357l = j10;
        this.f13354i = list;
        this.f13356k = b02;
        I1.f fVarA = gVar.a(1);
        this.f13347b = fVarA;
        if (xVar != null) {
            fVarA.h(xVar);
        }
        this.f13348c = gVar.a(3);
        this.f13353h = new E(oVarArr);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < uriArr.length; i10++) {
            if ((oVarArr[i10].f1796f & 16384) == 0) {
                arrayList.add(Integer.valueOf(i10));
            }
        }
        this.f13364s = new d(this.f13353h, N7.g.o(arrayList));
    }

    public static boolean A(boolean z10, R1.f fVar, long j10, int i10, j jVar, long j11, long j12) {
        if (!z10 || jVar == null) {
            return false;
        }
        if (j10 < fVar.f14325k) {
            return true;
        }
        e eVarH = h(fVar, j10, i10);
        return eVarH != null && j11 + eVarH.f13375a.f14387e < j12;
    }

    public static Uri e(R1.f fVar, f.g gVar) {
        String str;
        if (gVar == null || (str = gVar.f14389g) == null) {
            return null;
        }
        return J.g(fVar.f14420a, str);
    }

    public static e h(R1.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f14325k);
        if (i11 == fVar.f14332r.size()) {
            if (i10 == -1) {
                i10 = 0;
            }
            if (i10 < fVar.f14333s.size()) {
                return new e((f.g) fVar.f14333s.get(i10), j10, i10);
            }
            return null;
        }
        f.C0178f c0178f = (f.C0178f) fVar.f14332r.get(i11);
        if (i10 == -1) {
            return new e(c0178f, j10, -1);
        }
        if (i10 < c0178f.f14382m.size()) {
            return new e((f.g) c0178f.f14382m.get(i10), j10, i10);
        }
        int i12 = i11 + 1;
        if (i12 < fVar.f14332r.size()) {
            return new e((f.g) fVar.f14332r.get(i12), j10 + 1, -1);
        }
        if (fVar.f14333s.isEmpty()) {
            return null;
        }
        return new e((f.g) fVar.f14333s.get(0), j10 + 1, 0);
    }

    public static List k(R1.f fVar, long j10, int i10) {
        int i11 = (int) (j10 - fVar.f14325k);
        if (i11 < 0 || fVar.f14332r.size() < i11) {
            return AbstractC1081v.z();
        }
        ArrayList arrayList = new ArrayList();
        if (i11 < fVar.f14332r.size()) {
            if (i10 != -1) {
                f.C0178f c0178f = (f.C0178f) fVar.f14332r.get(i11);
                if (i10 == 0) {
                    arrayList.add(c0178f);
                } else if (i10 < c0178f.f14382m.size()) {
                    List list = c0178f.f14382m;
                    arrayList.addAll(list.subList(i10, list.size()));
                }
                i11++;
            }
            List list2 = fVar.f14332r;
            arrayList.addAll(list2.subList(i11, list2.size()));
            i10 = 0;
        }
        if (fVar.f14328n != -9223372036854775807L) {
            int i12 = i10 != -1 ? i10 : 0;
            if (i12 < fVar.f14333s.size()) {
                List list3 = fVar.f14333s;
                arrayList.addAll(list3.subList(i12, list3.size()));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public static boolean o(e eVar, R1.f fVar) {
        f.g gVar = eVar.f13375a;
        if (!(gVar instanceof f.d)) {
            return fVar.f14422c;
        }
        if (((f.d) gVar).f14376l) {
            return true;
        }
        return eVar.f13377c == 0 && fVar.f14422c;
    }

    public final void B(R1.f fVar) {
        this.f13365t = fVar.f14329o ? -9223372036854775807L : fVar.e() - this.f13352g.c();
    }

    public b2.n[] a(j jVar, long j10) {
        int iB = jVar == null ? -1 : this.f13353h.b(jVar.f24997d);
        int length = this.f13364s.length();
        b2.n[] nVarArr = new b2.n[length];
        for (int i10 = 0; i10 < length; i10++) {
            int iF = this.f13364s.f(i10);
            Uri uri = this.f13350e[iF];
            if (this.f13352g.g(uri)) {
                R1.f fVarM = this.f13352g.m(uri, false);
                AbstractC0853a.e(fVarM);
                long jC = fVarM.f14322h - this.f13352g.c();
                Pair pairG = g(jVar, iF != iB, fVarM, jC, j10);
                nVarArr[i10] = new c(fVarM.f14420a, jC, k(fVarM, ((Long) pairG.first).longValue(), ((Integer) pairG.second).intValue()));
            } else {
                nVarArr[i10] = b2.n.f25049a;
            }
        }
        return nVarArr;
    }

    public final void b() {
        this.f13352g.a(this.f13350e[this.f13364s.r()]);
    }

    public long c(long j10, k1 k1Var) {
        int iB = this.f13364s.b();
        Uri[] uriArr = this.f13350e;
        R1.f fVarM = (iB >= uriArr.length || iB == -1) ? null : this.f13352g.m(uriArr[this.f13364s.r()], true);
        if (fVarM == null || fVarM.f14332r.isEmpty()) {
            return j10;
        }
        long jC = fVarM.f14322h - this.f13352g.c();
        long j11 = j10 - jC;
        int iF = M.f(fVarM.f14332r, Long.valueOf(j11), true, true);
        long j12 = ((f.C0178f) fVarM.f14332r.get(iF)).f14387e;
        return k1Var.a(j11, j12, (!fVarM.f14422c || iF == fVarM.f14332r.size() - 1) ? j12 : ((f.C0178f) fVarM.f14332r.get(iF + 1)).f14387e) + jC;
    }

    public int d(j jVar) {
        if (jVar.f13400o == -1) {
            return 1;
        }
        R1.f fVar = (R1.f) AbstractC0853a.e(this.f13352g.m(this.f13350e[this.f13353h.b(jVar.f24997d)], false));
        int i10 = (int) (jVar.f25048j - fVar.f14325k);
        if (i10 < 0) {
            return 1;
        }
        List list = i10 < fVar.f14332r.size() ? ((f.C0178f) fVar.f14332r.get(i10)).f14382m : fVar.f14333s;
        if (jVar.f13400o >= list.size()) {
            return 2;
        }
        f.d dVar = (f.d) list.get(jVar.f13400o);
        if (dVar.f14377m) {
            return 0;
        }
        return Objects.equals(Uri.parse(J.f(fVar.f14420a, dVar.f14383a)), jVar.f24995b.f5437a) ? 1 : 2;
    }

    public void f(F0 f02, long j10, long j11, List list, boolean z10, b bVar) {
        int i10;
        boolean z11;
        Uri uri;
        long j12;
        boolean z12;
        e eVar;
        j jVar = list.isEmpty() ? null : (j) A.d(list);
        int iB = jVar == null ? -1 : this.f13353h.b(jVar.f24997d);
        long j13 = f02.f6848a;
        long jMax = j10 - j13;
        long jW = w(j13);
        if (jVar != null && !this.f13363r) {
            long jC = jVar.c();
            jMax = Math.max(0L, jMax - jC);
            if (jW != -9223372036854775807L) {
                jW = Math.max(0L, jW - jC);
            }
        }
        this.f13364s.g(j13, jMax, jW, list, a(jVar, j10));
        int iR = this.f13364s.r();
        boolean z13 = iB != iR;
        Uri uri2 = this.f13350e[iR];
        if (!this.f13352g.g(uri2)) {
            bVar.f13370c = uri2;
            this.f13362q = uri2;
            return;
        }
        R1.f fVarM = this.f13352g.m(uri2, true);
        AbstractC0853a.e(fVarM);
        this.f13363r = fVarM.f14422c;
        B(fVarM);
        long jC2 = fVarM.f14322h - this.f13352g.c();
        Pair pairG = g(jVar, z13, fVarM, jC2, j10);
        long jLongValue = ((Long) pairG.first).longValue();
        int iIntValue = ((Integer) pairG.second).intValue();
        boolean z14 = z13;
        int i11 = iB;
        R1.f fVar = fVarM;
        j jVar2 = jVar;
        long j14 = jLongValue;
        if (A(z14, fVar, j14, iIntValue, jVar2, jC2, j11)) {
            Uri uri3 = this.f13350e[i11];
            R1.f fVarM2 = this.f13352g.m(uri3, true);
            AbstractC0853a.e(fVarM2);
            long jC3 = fVarM2.f14322h - this.f13352g.c();
            i10 = i11;
            z11 = false;
            Pair pairG2 = g(jVar2, false, fVarM2, jC3, j10);
            long jLongValue2 = ((Long) pairG2.first).longValue();
            iIntValue = ((Integer) pairG2.second).intValue();
            fVar = fVarM2;
            uri = uri3;
            j14 = jLongValue2;
            j12 = jC3;
            iR = i10;
        } else {
            i10 = i11;
            z11 = false;
            uri = uri2;
            j12 = jC2;
        }
        if (iR != i10 && i10 != -1) {
            this.f13352g.a(this.f13350e[i10]);
        }
        if (j14 < fVar.f14325k) {
            this.f13360o = new C2616b();
            return;
        }
        e eVarH = h(fVar, j14, iIntValue);
        if (eVarH != null) {
            z12 = true;
            eVar = eVarH;
        } else if (!fVar.f14329o) {
            bVar.f13370c = uri;
            this.f13362q = uri;
            return;
        } else if (z10 || fVar.f14332r.isEmpty()) {
            bVar.f13369b = true;
            return;
        } else {
            eVar = new e((f.g) A.d(fVar.f14332r), (fVar.f14325k + ((long) fVar.f14332r.size())) - 1, -1);
            z12 = true;
        }
        this.f13362q = null;
        this.f13366u = SystemClock.elapsedRealtime();
        Uri uriE = e(fVar, eVar.f13375a.f14384b);
        AbstractC2795e abstractC2795eP = p(uriE, iR, z12, null);
        bVar.f13368a = abstractC2795eP;
        if (abstractC2795eP != null) {
            return;
        }
        Uri uriE2 = e(fVar, eVar.f13375a);
        AbstractC2795e abstractC2795eP2 = p(uriE2, iR, z11, null);
        bVar.f13368a = abstractC2795eP2;
        if (abstractC2795eP2 != null) {
            return;
        }
        boolean zO = o(eVar, fVar);
        boolean zX = j.x(jVar2, j10, uri, zO, eVar, j12);
        Uri uri4 = uri;
        if (zX && eVar.f13378d) {
            return;
        }
        bVar.f13368a = j.j(this.f13346a, this.f13347b, this.f13351f[iR], j12, fVar, eVar, uri4, this.f13354i, this.f13364s.t(), this.f13364s.j(), this.f13358m, this.f13349d, this.f13357l, jVar2, this.f13355j.a(uriE2), this.f13355j.a(uriE), zX, zO, this.f13356k, null);
    }

    public final Pair g(j jVar, boolean z10, R1.f fVar, long j10, long j11) {
        if (jVar != null && !z10) {
            if (!jVar.g()) {
                return new Pair(Long.valueOf(jVar.f25048j), Integer.valueOf(jVar.f13400o));
            }
            Long lValueOf = Long.valueOf(jVar.f13400o == -1 ? jVar.f() : jVar.f25048j);
            int i10 = jVar.f13400o;
            return new Pair(lValueOf, Integer.valueOf(i10 != -1 ? i10 + 1 : -1));
        }
        long j12 = fVar.f14335u + j10;
        if (jVar != null && !this.f13363r) {
            j11 = jVar.f25000g;
        }
        if (!fVar.f14329o && j11 >= j12) {
            return new Pair(Long.valueOf(fVar.f14325k + ((long) fVar.f14332r.size())), -1);
        }
        long j13 = j11 - j10;
        int i11 = 0;
        int iF = M.f(fVar.f14332r, Long.valueOf(j13), true, !this.f13352g.h() || jVar == null);
        long j14 = ((long) iF) + fVar.f14325k;
        if (iF >= 0) {
            f.C0178f c0178f = (f.C0178f) fVar.f14332r.get(iF);
            List list = j13 < c0178f.f14387e + c0178f.f14385c ? c0178f.f14382m : fVar.f14333s;
            while (true) {
                if (i11 >= list.size()) {
                    break;
                }
                f.d dVar = (f.d) list.get(i11);
                if (j13 >= dVar.f14387e + dVar.f14385c) {
                    i11++;
                } else if (dVar.f14376l) {
                    j14 += list == fVar.f14333s ? 1L : 0L;
                    i = i11;
                }
            }
        }
        return new Pair(Long.valueOf(j14), Integer.valueOf(i));
    }

    public int i(long j10, List list) {
        return (this.f13360o != null || this.f13364s.length() < 2) ? list.size() : this.f13364s.q(j10, list);
    }

    public long j(j jVar) {
        AbstractC0853a.g(jVar.f13400o != -1);
        R1.f fVar = (R1.f) AbstractC0853a.e(this.f13352g.m(this.f13350e[this.f13353h.b(jVar.f24997d)], false));
        int i10 = (int) (jVar.f25048j - fVar.f14325k);
        if (i10 < 0) {
            return 0L;
        }
        return ((f.d) (i10 < fVar.f14332r.size() ? ((f.C0178f) fVar.f14332r.get(i10)).f14382m : fVar.f14333s).get(jVar.f13400o)).f14385c;
    }

    public E l() {
        return this.f13353h;
    }

    public d2.r m() {
        return this.f13364s;
    }

    public boolean n() {
        return this.f13363r;
    }

    public final AbstractC2795e p(Uri uri, int i10, boolean z10, f.a aVar) {
        if (uri == null) {
            return null;
        }
        byte[] bArrC = this.f13355j.c(uri);
        if (bArrC != null) {
            this.f13355j.b(uri, bArrC);
            return null;
        }
        return new a(this.f13348c, new j.b().i(uri).b(1).a(), this.f13351f[i10], this.f13364s.t(), this.f13364s.j(), this.f13359n);
    }

    public boolean q(AbstractC2795e abstractC2795e, long j10) {
        d2.r rVar = this.f13364s;
        return rVar.h(rVar.l(this.f13353h.b(abstractC2795e.f24997d)), j10);
    }

    public void r() throws IOException {
        IOException iOException = this.f13360o;
        if (iOException != null) {
            throw iOException;
        }
        Uri uri = this.f13361p;
        if (uri == null || !uri.equals(this.f13362q)) {
            return;
        }
        this.f13352g.b(this.f13361p);
    }

    public boolean s(Uri uri) {
        return M.r(this.f13350e, uri);
    }

    public void t(AbstractC2795e abstractC2795e) {
        if (abstractC2795e instanceof a) {
            a aVar = (a) abstractC2795e;
            this.f13359n = aVar.g();
            this.f13355j.b(aVar.f24995b.f5437a, (byte[]) AbstractC0853a.e(aVar.i()));
        }
    }

    public boolean u(Uri uri, long j10) {
        int iL;
        int i10 = 0;
        while (true) {
            Uri[] uriArr = this.f13350e;
            if (i10 >= uriArr.length) {
                i10 = -1;
                break;
            }
            if (uriArr[i10].equals(uri)) {
                break;
            }
            i10++;
        }
        if (i10 == -1 || (iL = this.f13364s.l(i10)) == -1) {
            return true;
        }
        this.f13361p = uri;
        return j10 != -9223372036854775807L && this.f13364s.h(iL, j10) && this.f13352g.i(uri, j10);
    }

    public void v() {
        b();
        this.f13360o = null;
    }

    public final long w(long j10) {
        long j11 = this.f13365t;
        if (j11 != -9223372036854775807L) {
            return j11 - j10;
        }
        return -9223372036854775807L;
    }

    public void x(boolean z10) {
        this.f13358m = z10;
    }

    public void y(d2.r rVar) {
        b();
        this.f13364s = rVar;
    }

    public boolean z(long j10, AbstractC2795e abstractC2795e, List list) {
        if (this.f13360o != null) {
            return false;
        }
        return this.f13364s.m(j10, abstractC2795e, list);
    }
}
