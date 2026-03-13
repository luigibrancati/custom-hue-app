package R1;

import D1.w;
import G1.AbstractC0853a;
import G1.M;
import I1.j;
import I1.s;
import K7.A;
import R1.c;
import R1.f;
import R1.h;
import R1.j;
import R1.l;
import a2.C2609B;
import a2.C2638y;
import a2.L;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import e2.k;
import e2.m;
import e2.o;
import io.sentry.TransactionOptions;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements l, m.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final l.a f14285p = new l.a() { // from class: R1.b
        @Override // R1.l.a
        public final l a(Q1.g gVar, e2.k kVar, k kVar2, e2.e eVar) {
            return new c(gVar, kVar, kVar2, eVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q1.g f14286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f14287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2.k f14288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f14289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CopyOnWriteArrayList f14290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f14291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L.a f14292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m f14293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Handler f14294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l.e f14295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public h f14296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Uri f14297l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f14298m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f14299n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f14300o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b implements l.b {
        public b() {
        }

        @Override // R1.l.b
        public boolean a(Uri uri, k.c cVar, boolean z10) {
            C0177c c0177c;
            if (c.this.f14298m == null) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                List list = ((h) M.i(c.this.f14296k)).f14401e;
                int i10 = 0;
                for (int i11 = 0; i11 < list.size(); i11++) {
                    C0177c c0177c2 = (C0177c) c.this.f14289d.get(((h.b) list.get(i11)).f14414a);
                    if (c0177c2 != null && jElapsedRealtime < c0177c2.f14309h) {
                        i10++;
                    }
                }
                k.b bVarC = c.this.f14288c.c(new k.a(1, 0, c.this.f14296k.f14401e.size(), i10), cVar);
                if (bVarC != null && bVarC.f33626a == 2 && (c0177c = (C0177c) c.this.f14289d.get(uri)) != null) {
                    c0177c.h(bVarC.f33627b);
                }
            }
            return false;
        }

        @Override // R1.l.b
        public void f() {
            c.this.f14290e.remove(this);
        }
    }

    /* JADX INFO: renamed from: R1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class C0177c implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f14302a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final m f14303b = new m("DefaultHlsPlaylistTracker:MediaPlaylist");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final I1.f f14304c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public f f14305d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f14306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public long f14307f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f14308g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f14309h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f14310i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public IOException f14311j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f14312k;

        public C0177c(Uri uri) {
            this.f14302a = uri;
            this.f14304c = c.this.f14286a.a(4);
        }

        public static /* synthetic */ void a(C0177c c0177c, Uri uri) {
            c0177c.f14310i = false;
            c0177c.n(uri);
        }

        public void A(boolean z10) {
            this.f14312k = z10;
        }

        public final boolean h(long j10) {
            this.f14309h = SystemClock.elapsedRealtime() + j10;
            return this.f14302a.equals(c.this.f14297l) && !c.this.P();
        }

        public final Uri i() {
            f fVar = this.f14305d;
            if (fVar != null) {
                f.h hVar = fVar.f14336v;
                if (hVar.f14394a != -9223372036854775807L || hVar.f14398e) {
                    Uri.Builder builderBuildUpon = this.f14302a.buildUpon();
                    f fVar2 = this.f14305d;
                    if (fVar2.f14336v.f14398e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(fVar2.f14325k + ((long) fVar2.f14332r.size())));
                        f fVar3 = this.f14305d;
                        if (fVar3.f14328n != -9223372036854775807L) {
                            List list = fVar3.f14333s;
                            int size = list.size();
                            if (!list.isEmpty() && ((f.d) A.d(list)).f14377m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    f.h hVar2 = this.f14305d.f14336v;
                    if (hVar2.f14394a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", hVar2.f14395b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f14302a;
        }

        public f j() {
            return this.f14305d;
        }

        public boolean k() {
            return this.f14312k;
        }

        public boolean l() {
            int i10;
            if (this.f14305d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION, M.o1(this.f14305d.f14335u));
            f fVar = this.f14305d;
            return fVar.f14329o || (i10 = fVar.f14318d) == 2 || i10 == 1 || this.f14306e + jMax > jElapsedRealtime;
        }

        public void m(boolean z10) {
            p(z10 ? i() : this.f14302a);
        }

        public final void n(Uri uri) {
            o.a aVarB = c.this.f14287b.b(c.this.f14296k, this.f14305d);
            I1.j jVarA = new j.b().i(uri).b(1).a();
            c.u(c.this);
            o oVar = new o(this.f14304c, jVarA, 4, aVarB);
            this.f14303b.n(oVar, this, c.this.f14288c.b(oVar.f33654c));
        }

        public final void p(final Uri uri) {
            this.f14309h = 0L;
            if (this.f14310i || this.f14303b.j() || this.f14303b.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.f14308g) {
                n(uri);
            } else {
                this.f14310i = true;
                c.this.f14294i.postDelayed(new Runnable() { // from class: R1.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.C0177c.a(this.f14314a, uri);
                    }
                }, this.f14308g - jElapsedRealtime);
            }
        }

        public void q() throws IOException {
            this.f14303b.a();
            IOException iOException = this.f14311j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void t(o oVar, long j10, long j11, boolean z10) {
            C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
            c.this.f14288c.d(oVar.f33652a);
            c.this.f14292g.l(c2638y, 4);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public void w(o oVar, long j10, long j11) {
            i iVar = (i) oVar.d();
            C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
            if (iVar instanceof f) {
                y((f) iVar, c2638y);
                c.this.f14292g.o(c2638y, 4);
            } else {
                this.f14311j = w.c("Loaded playlist has unexpected type.", null);
                c.this.f14292g.s(c2638y, 4, this.f14311j, true);
            }
            c.this.f14288c.d(oVar.f33652a);
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
            m.c cVarH;
            C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
            boolean z10 = iOException instanceof j.a;
            if ((oVar.e().getQueryParameter("_HLS_msn") != null) || z10) {
                int i11 = iOException instanceof s ? ((s) iOException).f5505d : Integer.MAX_VALUE;
                if (z10 || i11 == 400 || i11 == 503) {
                    this.f14308g = SystemClock.elapsedRealtime();
                    m(false);
                    ((L.a) M.i(c.this.f14292g)).s(c2638y, oVar.f33654c, iOException, true);
                    return m.f33634f;
                }
            }
            k.c cVar = new k.c(c2638y, new C2609B(oVar.f33654c), iOException, i10);
            if (c.this.R(this.f14302a, cVar, false)) {
                long jA = c.this.f14288c.a(cVar);
                cVarH = jA != -9223372036854775807L ? m.h(false, jA) : m.f33635g;
            } else {
                cVarH = m.f33634f;
            }
            boolean zC = cVarH.c();
            c.this.f14292g.s(c2638y, oVar.f33654c, iOException, !zC);
            if (!zC) {
                c.this.f14288c.d(oVar.f33652a);
            }
            return cVarH;
        }

        @Override // e2.m.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public void s(o oVar, long j10, long j11, int i10) {
            c.this.f14292g.u(i10 == 0 ? new C2638y(oVar.f33652a, oVar.f33653b, j10) : new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a()), oVar.f33654c, i10);
        }

        public final void y(f fVar, C2638y c2638y) {
            boolean z10;
            long j10;
            f fVar2 = this.f14305d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f14306e = jElapsedRealtime;
            f fVarJ = c.this.J(fVar2, fVar);
            this.f14305d = fVarJ;
            IOException dVar = null;
            if (fVarJ != fVar2) {
                this.f14311j = null;
                this.f14307f = jElapsedRealtime;
                c.this.W(this.f14302a, fVarJ);
            } else if (!fVarJ.f14329o) {
                if (fVar.f14325k + ((long) fVar.f14332r.size()) < this.f14305d.f14325k) {
                    dVar = new l.c(this.f14302a);
                    z10 = true;
                } else {
                    z10 = false;
                    if (jElapsedRealtime - this.f14307f > M.o1(r13.f14327m) * c.this.f14291f) {
                        dVar = new l.d(this.f14302a);
                    }
                }
                if (dVar != null) {
                    this.f14311j = dVar;
                    c.this.R(this.f14302a, new k.c(c2638y, new C2609B(4), dVar, 1), z10);
                }
            }
            f fVar3 = this.f14305d;
            if (!fVar3.f14336v.f14398e) {
                j10 = fVar3 != fVar2 ? fVar3.f14327m : fVar3.f14327m / 2;
            } else if (fVar3 == fVar2) {
                long j11 = fVar3.f14328n;
                j10 = j11 != -9223372036854775807L ? j11 / 2 : fVar3.f14327m / 2;
            } else {
                j10 = 0;
            }
            this.f14308g = (jElapsedRealtime + M.o1(j10)) - c2638y.f20921f;
            if (this.f14305d.f14329o) {
                return;
            }
            if (this.f14302a.equals(c.this.f14297l) || this.f14312k) {
                p(i());
            }
        }

        public void z() {
            this.f14303b.l();
        }
    }

    public c(Q1.g gVar, e2.k kVar, k kVar2, e2.e eVar) {
        this(gVar, kVar, kVar2, eVar, 3.5d);
    }

    public static f.C0178f I(f fVar, f fVar2) {
        int i10 = (int) (fVar2.f14325k - fVar.f14325k);
        List list = fVar.f14332r;
        if (i10 < list.size()) {
            return (f.C0178f) list.get(i10);
        }
        return null;
    }

    public static /* synthetic */ e2.e u(c cVar) {
        cVar.getClass();
        return null;
    }

    public final void H(List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Uri uri = (Uri) list.get(i10);
            this.f14289d.put(uri, new C0177c(uri));
        }
    }

    public final f J(f fVar, f fVar2) {
        return !fVar2.f(fVar) ? fVar2.f14329o ? fVar.d() : fVar : fVar2.c(L(fVar, fVar2), K(fVar, fVar2));
    }

    public final int K(f fVar, f fVar2) {
        f.C0178f c0178fI;
        if (fVar2.f14323i) {
            return fVar2.f14324j;
        }
        f fVar3 = this.f14298m;
        int i10 = fVar3 != null ? fVar3.f14324j : 0;
        return (fVar == null || (c0178fI = I(fVar, fVar2)) == null) ? i10 : (fVar.f14324j + c0178fI.f14386d) - ((f.C0178f) fVar2.f14332r.get(0)).f14386d;
    }

    public final long L(f fVar, f fVar2) {
        if (fVar2.f14330p) {
            return fVar2.f14322h;
        }
        f fVar3 = this.f14298m;
        long j10 = fVar3 != null ? fVar3.f14322h : 0L;
        if (fVar != null) {
            int size = fVar.f14332r.size();
            f.C0178f c0178fI = I(fVar, fVar2);
            if (c0178fI != null) {
                return fVar.f14322h + c0178fI.f14387e;
            }
            if (size == fVar2.f14325k - fVar.f14325k) {
                return fVar.e();
            }
        }
        return j10;
    }

    public final Uri M(Uri uri) {
        f.e eVar;
        f fVar = this.f14298m;
        if (fVar == null || !fVar.f14336v.f14398e || (eVar = (f.e) fVar.f14334t.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(eVar.f14379b));
        int i10 = eVar.f14380c;
        if (i10 != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i10));
        }
        return builderBuildUpon.build();
    }

    public final boolean N(Uri uri) {
        List list = this.f14296k.f14401e;
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (uri.equals(((h.b) list.get(i10)).f14414a)) {
                return true;
            }
        }
        return false;
    }

    public final void O(Uri uri) {
        C0177c c0177c = (C0177c) this.f14289d.get(uri);
        f fVarJ = c0177c.j();
        if (c0177c.k()) {
            return;
        }
        c0177c.A(true);
        if (fVarJ == null || fVarJ.f14329o) {
            return;
        }
        c0177c.m(true);
    }

    public final boolean P() {
        List list = this.f14296k.f14401e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i10 = 0; i10 < size; i10++) {
            C0177c c0177c = (C0177c) AbstractC0853a.e((C0177c) this.f14289d.get(((h.b) list.get(i10)).f14414a));
            if (jElapsedRealtime > c0177c.f14309h) {
                Uri uri = c0177c.f14302a;
                this.f14297l = uri;
                c0177c.p(M(uri));
                return true;
            }
        }
        return false;
    }

    public final void Q(Uri uri) {
        if (uri.equals(this.f14297l) || !N(uri)) {
            return;
        }
        f fVar = this.f14298m;
        if (fVar == null || !fVar.f14329o) {
            this.f14297l = uri;
            C0177c c0177c = (C0177c) this.f14289d.get(uri);
            f fVar2 = c0177c.f14305d;
            if (fVar2 == null || !fVar2.f14329o) {
                c0177c.p(M(uri));
            } else {
                this.f14298m = fVar2;
                this.f14295j.g(fVar2);
            }
        }
    }

    public final boolean R(Uri uri, k.c cVar, boolean z10) {
        Iterator it = this.f14290e.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            z11 |= !((l.b) it.next()).a(uri, cVar, z10);
        }
        return z11;
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public void t(o oVar, long j10, long j11, boolean z10) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        this.f14288c.d(oVar.f33652a);
        this.f14292g.l(c2638y, 4);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void w(o oVar, long j10, long j11) {
        i iVar = (i) oVar.d();
        boolean z10 = iVar instanceof f;
        h hVarE = z10 ? h.e(iVar.f14420a) : (h) iVar;
        this.f14296k = hVarE;
        this.f14297l = ((h.b) hVarE.f14401e.get(0)).f14414a;
        this.f14290e.add(new b());
        H(hVarE.f14400d);
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        C0177c c0177c = (C0177c) this.f14289d.get(this.f14297l);
        if (z10) {
            c0177c.y((f) iVar, c2638y);
        } else {
            c0177c.m(false);
        }
        this.f14288c.d(oVar.f33652a);
        this.f14292g.o(c2638y, 4);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public m.c o(o oVar, long j10, long j11, IOException iOException, int i10) {
        C2638y c2638y = new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a());
        long jA = this.f14288c.a(new k.c(c2638y, new C2609B(oVar.f33654c), iOException, i10));
        boolean z10 = jA == -9223372036854775807L;
        this.f14292g.s(c2638y, oVar.f33654c, iOException, z10);
        if (z10) {
            this.f14288c.d(oVar.f33652a);
        }
        return z10 ? m.f33635g : m.h(false, jA);
    }

    @Override // e2.m.b
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void s(o oVar, long j10, long j11, int i10) {
        this.f14292g.u(i10 == 0 ? new C2638y(oVar.f33652a, oVar.f33653b, j10) : new C2638y(oVar.f33652a, oVar.f33653b, oVar.e(), oVar.c(), j10, j11, oVar.a()), oVar.f33654c, i10);
    }

    public final void W(Uri uri, f fVar) {
        if (uri.equals(this.f14297l)) {
            if (this.f14298m == null) {
                this.f14299n = !fVar.f14329o;
                this.f14300o = fVar.f14322h;
            }
            this.f14298m = fVar;
            this.f14295j.g(fVar);
        }
        Iterator it = this.f14290e.iterator();
        while (it.hasNext()) {
            ((l.b) it.next()).f();
        }
    }

    @Override // R1.l
    public void a(Uri uri) {
        C0177c c0177c = (C0177c) this.f14289d.get(uri);
        if (c0177c != null) {
            c0177c.A(false);
        }
    }

    @Override // R1.l
    public void b(Uri uri) throws IOException {
        ((C0177c) this.f14289d.get(uri)).q();
    }

    @Override // R1.l
    public long c() {
        return this.f14300o;
    }

    @Override // R1.l
    public h d() {
        return this.f14296k;
    }

    @Override // R1.l
    public void e(Uri uri) {
        ((C0177c) this.f14289d.get(uri)).m(true);
    }

    @Override // R1.l
    public void f(l.b bVar) {
        this.f14290e.remove(bVar);
    }

    @Override // R1.l
    public boolean g(Uri uri) {
        return ((C0177c) this.f14289d.get(uri)).l();
    }

    @Override // R1.l
    public boolean h() {
        return this.f14299n;
    }

    @Override // R1.l
    public boolean i(Uri uri, long j10) {
        if (((C0177c) this.f14289d.get(uri)) != null) {
            return !r0.h(j10);
        }
        return false;
    }

    @Override // R1.l
    public void j(l.b bVar) {
        AbstractC0853a.e(bVar);
        this.f14290e.add(bVar);
    }

    @Override // R1.l
    public void k() throws IOException {
        m mVar = this.f14293h;
        if (mVar != null) {
            mVar.a();
        }
        Uri uri = this.f14297l;
        if (uri != null) {
            b(uri);
        }
    }

    @Override // R1.l
    public void l(Uri uri, L.a aVar, l.e eVar) {
        this.f14294i = M.z();
        this.f14292g = aVar;
        this.f14295j = eVar;
        o oVar = new o(this.f14286a.a(4), new j.b().i(uri).b(1).a(), 4, this.f14287b.a());
        AbstractC0853a.g(this.f14293h == null);
        m mVar = new m("DefaultHlsPlaylistTracker:MultivariantPlaylist");
        this.f14293h = mVar;
        mVar.n(oVar, this, this.f14288c.b(oVar.f33654c));
    }

    @Override // R1.l
    public f m(Uri uri, boolean z10) {
        f fVarJ = ((C0177c) this.f14289d.get(uri)).j();
        if (fVarJ != null && z10) {
            Q(uri);
            O(uri);
        }
        return fVarJ;
    }

    @Override // R1.l
    public void stop() {
        this.f14297l = null;
        this.f14298m = null;
        this.f14296k = null;
        this.f14300o = -9223372036854775807L;
        this.f14293h.l();
        this.f14293h = null;
        Iterator it = this.f14289d.values().iterator();
        while (it.hasNext()) {
            ((C0177c) it.next()).z();
        }
        this.f14294i.removeCallbacksAndMessages(null);
        this.f14294i = null;
        this.f14289d.clear();
    }

    public c(Q1.g gVar, e2.k kVar, k kVar2, e2.e eVar, double d10) {
        this.f14286a = gVar;
        this.f14287b = kVar2;
        this.f14288c = kVar;
        this.f14291f = d10;
        this.f14290e = new CopyOnWriteArrayList();
        this.f14289d = new HashMap();
        this.f14300o = -9223372036854775807L;
    }
}
