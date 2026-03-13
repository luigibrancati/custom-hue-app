package androidx.media3.exoplayer.smoothstreaming;

import C2.t;
import C2.u;
import D1.o;
import F2.h;
import F2.s;
import G1.AbstractC0853a;
import I1.f;
import I1.j;
import I1.x;
import K1.F0;
import K1.k1;
import K7.AbstractC1081v;
import Z1.a;
import a2.C2616b;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.exoplayer.smoothstreaming.b;
import b2.AbstractC2792b;
import b2.AbstractC2795e;
import b2.C2794d;
import b2.C2797g;
import b2.C2800j;
import b2.InterfaceC2796f;
import b2.m;
import d2.r;
import d2.w;
import e2.e;
import e2.f;
import e2.k;
import e2.n;
import java.io.IOException;
import java.util.List;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a implements androidx.media3.exoplayer.smoothstreaming.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f23866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC2796f[] f23868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f23869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public r f23870e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Z1.a f23871f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23872g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public IOException f23873h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f23874i = -9223372036854775807L;

    /* JADX INFO: renamed from: androidx.media3.exoplayer.smoothstreaming.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0305a implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f.a f23875a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s.a f23876b = new h();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23877c;

        public C0305a(f.a aVar) {
            this.f23875a = aVar;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public androidx.media3.exoplayer.smoothstreaming.b c(n nVar, Z1.a aVar, int i10, r rVar, x xVar, e eVar) {
            f fVarA = this.f23875a.a();
            if (xVar != null) {
                fVarA.h(xVar);
            }
            return new a(nVar, aVar, i10, rVar, fVarA, eVar, this.f23876b, this.f23877c);
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        public o d(o oVar) {
            String str;
            if (!this.f23877c || !this.f23876b.a(oVar)) {
                return oVar;
            }
            o.b bVarY = oVar.b().y0("application/x-media3-cues").Y(this.f23876b.c(oVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(oVar.f1805o);
            if (oVar.f1801k != null) {
                str = StringUtils.SPACE + oVar.f1801k;
            } else {
                str = "";
            }
            sb2.append(str);
            return bVarY.U(sb2.toString()).C0(Long.MAX_VALUE).P();
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C0305a b(boolean z10) {
            this.f23877c = z10;
            return this;
        }

        @Override // androidx.media3.exoplayer.smoothstreaming.b.a
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public C0305a a(s.a aVar) {
            this.f23876b = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC2792b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a.b f23878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f23879f;

        public b(a.b bVar, int i10, int i11) {
            super(i11, bVar.f20166k - 1);
            this.f23878e = bVar;
            this.f23879f = i10;
        }

        @Override // b2.n
        public long a() {
            c();
            return this.f23878e.e((int) d());
        }

        @Override // b2.n
        public long b() {
            return a() + this.f23878e.c((int) d());
        }
    }

    public a(n nVar, Z1.a aVar, int i10, r rVar, f fVar, e eVar, s.a aVar2, boolean z10) {
        this.f23866a = nVar;
        this.f23871f = aVar;
        this.f23867b = i10;
        this.f23870e = rVar;
        this.f23869d = fVar;
        a.b bVar = aVar.f20150f[i10];
        this.f23868c = new InterfaceC2796f[rVar.length()];
        for (int i11 = 0; i11 < this.f23868c.length; i11++) {
            int iF = rVar.f(i11);
            o oVar = bVar.f20165j[iF];
            u[] uVarArr = oVar.f1809s != null ? ((a.C0258a) AbstractC0853a.e(aVar.f20149e)).f20155c : null;
            int i12 = bVar.f20156a;
            int i13 = i12 == 2 ? 4 : 0;
            long j10 = bVar.f20158c;
            long j11 = aVar.f20151g;
            this.f23868c[i11] = new C2794d(new C2.h(aVar2, !z10 ? 35 : 3, null, new t(iF, i12, j10, -9223372036854775807L, j11, j11, oVar, 0, uVarArr, i13, null, null), AbstractC1081v.z(), null), bVar.f20156a, oVar);
        }
    }

    public static m k(o oVar, f fVar, Uri uri, int i10, long j10, long j11, long j12, int i11, Object obj, InterfaceC2796f interfaceC2796f, f.a aVar) {
        return new C2800j(fVar, new j.b().i(uri).a(), oVar, i11, obj, j10, j11, j12, -9223372036854775807L, i10, 1, j10, interfaceC2796f);
    }

    @Override // b2.InterfaceC2799i
    public void a() throws IOException {
        IOException iOException = this.f23873h;
        if (iOException != null) {
            throw iOException;
        }
        this.f23866a.a();
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void b(r rVar) {
        this.f23870e = rVar;
    }

    @Override // b2.InterfaceC2799i
    public long c(long j10, k1 k1Var) {
        a.b bVar = this.f23871f.f20150f[this.f23867b];
        int iD = bVar.d(j10);
        long jE = bVar.e(iD);
        return k1Var.a(j10, jE, (jE >= j10 || iD >= bVar.f20166k + (-1)) ? jE : bVar.e(iD + 1));
    }

    @Override // b2.InterfaceC2799i
    public boolean d(long j10, AbstractC2795e abstractC2795e, List list) {
        if (this.f23873h != null) {
            return false;
        }
        return this.f23870e.m(j10, abstractC2795e, list);
    }

    @Override // b2.InterfaceC2799i
    public final void f(F0 f02, long j10, List list, C2797g c2797g) {
        List list2;
        int iF;
        if (this.f23873h != null) {
            return;
        }
        a.b bVar = this.f23871f.f20150f[this.f23867b];
        if (bVar.f20166k == 0) {
            c2797g.f25004b = !r4.f20148d;
            return;
        }
        if (list.isEmpty()) {
            iF = bVar.d(j10);
            list2 = list;
        } else {
            list2 = list;
            iF = (int) (((m) list2.get(list.size() - 1)).f() - ((long) this.f23872g));
            if (iF < 0) {
                this.f23873h = new C2616b();
                return;
            }
        }
        if (iF >= bVar.f20166k) {
            c2797g.f25004b = !this.f23871f.f20148d;
            return;
        }
        long j11 = f02.f6848a;
        long j12 = j10 - j11;
        long jL = l(j11);
        int length = this.f23870e.length();
        b2.n[] nVarArr = new b2.n[length];
        for (int i10 = 0; i10 < length; i10++) {
            nVarArr[i10] = new b(bVar, this.f23870e.f(i10), iF);
        }
        this.f23870e.g(j11, j12, jL, list2, nVarArr);
        long jE = bVar.e(iF);
        long jC = jE + bVar.c(iF);
        long j13 = list.isEmpty() ? j10 : -9223372036854775807L;
        int i11 = iF + this.f23872g;
        int iB = this.f23870e.b();
        InterfaceC2796f interfaceC2796f = this.f23868c[iB];
        Uri uriA = bVar.a(this.f23870e.f(iB), iF);
        this.f23874i = SystemClock.elapsedRealtime();
        c2797g.f25003a = k(this.f23870e.s(), this.f23869d, uriA, i11, jE, jC, j13, this.f23870e.t(), this.f23870e.j(), interfaceC2796f, null);
    }

    @Override // b2.InterfaceC2799i
    public int g(long j10, List list) {
        return (this.f23873h != null || this.f23870e.length() < 2) ? list.size() : this.f23870e.q(j10, list);
    }

    @Override // androidx.media3.exoplayer.smoothstreaming.b
    public void h(Z1.a aVar) {
        a.b[] bVarArr = this.f23871f.f20150f;
        int i10 = this.f23867b;
        a.b bVar = bVarArr[i10];
        int i11 = bVar.f20166k;
        a.b bVar2 = aVar.f20150f[i10];
        if (i11 == 0 || bVar2.f20166k == 0) {
            this.f23872g += i11;
        } else {
            int i12 = i11 - 1;
            long jE = bVar.e(i12) + bVar.c(i12);
            long jE2 = bVar2.e(0);
            if (jE <= jE2) {
                this.f23872g += i11;
            } else {
                this.f23872g += bVar.d(jE2);
            }
        }
        this.f23871f = aVar;
    }

    @Override // b2.InterfaceC2799i
    public boolean i(AbstractC2795e abstractC2795e, boolean z10, k.c cVar, k kVar) {
        k.b bVarC = kVar.c(w.c(this.f23870e), cVar);
        if (!z10 || bVarC == null || bVarC.f33626a != 2) {
            return false;
        }
        r rVar = this.f23870e;
        return rVar.h(rVar.d(abstractC2795e.f24997d), bVarC.f33627b);
    }

    public final long l(long j10) {
        Z1.a aVar = this.f23871f;
        if (!aVar.f20148d) {
            return -9223372036854775807L;
        }
        a.b bVar = aVar.f20150f[this.f23867b];
        int i10 = bVar.f20166k - 1;
        return (bVar.e(i10) + bVar.c(i10)) - j10;
    }

    @Override // b2.InterfaceC2799i
    public void release() {
        for (InterfaceC2796f interfaceC2796f : this.f23868c) {
            interfaceC2796f.release();
        }
    }

    @Override // b2.InterfaceC2799i
    public void e(AbstractC2795e abstractC2795e) {
    }
}
