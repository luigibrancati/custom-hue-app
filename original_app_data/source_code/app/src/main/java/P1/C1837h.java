package P1;

import D1.AbstractC0747e;
import D1.C0753k;
import G1.AbstractC0853a;
import G1.M;
import K7.AbstractC1081v;
import K7.AbstractC1085z;
import K7.U;
import K7.Y;
import L1.B0;
import P1.A;
import P1.C1836g;
import P1.C1837h;
import P1.m;
import P1.t;
import P1.u;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: renamed from: P1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1837h implements u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final UUID f12603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A.c f12604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f12605d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f12606e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f12607f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int[] f12608g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f12609h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f12610i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e2.k f12611j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C0165h f12612k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f12613l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f12614m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Set f12615n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set f12616o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f12617p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public A f12618q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C1836g f12619r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C1836g f12620s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Looper f12621t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Handler f12622u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f12623v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public byte[] f12624w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public B0 f12625x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile d f12626y;

    /* JADX INFO: renamed from: P1.h$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12630d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f12627a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public UUID f12628b = AbstractC0747e.f1687d;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public A.c f12629c = E.f12555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f12631e = new int[0];

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f12632f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e2.k f12633g = new e2.j();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public long f12634h = 300000;

        public C1837h a(H h10) {
            return new C1837h(this.f12628b, this.f12629c, h10, this.f12627a, this.f12630d, this.f12631e, this.f12632f, this.f12633g, this.f12634h);
        }

        public b b(e2.k kVar) {
            this.f12633g = (e2.k) AbstractC0853a.e(kVar);
            return this;
        }

        public b c(boolean z10) {
            this.f12630d = z10;
            return this;
        }

        public b d(boolean z10) {
            this.f12632f = z10;
            return this;
        }

        public b e(int... iArr) {
            for (int i10 : iArr) {
                boolean z10 = true;
                if (i10 != 2 && i10 != 1) {
                    z10 = false;
                }
                AbstractC0853a.a(z10);
            }
            this.f12631e = (int[]) iArr.clone();
            return this;
        }

        public b f(UUID uuid, A.c cVar) {
            this.f12628b = (UUID) AbstractC0853a.e(uuid);
            this.f12629c = (A.c) AbstractC0853a.e(cVar);
            return this;
        }
    }

    /* JADX INFO: renamed from: P1.h$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class c implements A.b {
        public c() {
        }

        @Override // P1.A.b
        public void a(A a10, byte[] bArr, int i10, int i11, byte[] bArr2) {
            ((d) AbstractC0853a.e(C1837h.this.f12626y)).obtainMessage(i10, bArr).sendToTarget();
        }
    }

    /* JADX INFO: renamed from: P1.h$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            for (C1836g c1836g : C1837h.this.f12614m) {
                if (c1836g.u(bArr)) {
                    c1836g.A(message.what);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: P1.h$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends Exception {
        public e(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    /* JADX INFO: renamed from: P1.h$f */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class f implements u.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final t.a f12637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public m f12638c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f12639d;

        public f(t.a aVar) {
            this.f12637b = aVar;
        }

        public static /* synthetic */ void b(f fVar, D1.o oVar) {
            if (C1837h.this.f12617p == 0 || fVar.f12639d) {
                return;
            }
            C1837h c1837h = C1837h.this;
            fVar.f12638c = c1837h.s((Looper) AbstractC0853a.e(c1837h.f12621t), fVar.f12637b, oVar, false);
            C1837h.this.f12615n.add(fVar);
        }

        public static /* synthetic */ void c(f fVar) {
            if (fVar.f12639d) {
                return;
            }
            m mVar = fVar.f12638c;
            if (mVar != null) {
                mVar.c(fVar.f12637b);
            }
            C1837h.this.f12615n.remove(fVar);
            fVar.f12639d = true;
        }

        public void d(final D1.o oVar) {
            ((Handler) AbstractC0853a.e(C1837h.this.f12622u)).post(new Runnable() { // from class: P1.i
                @Override // java.lang.Runnable
                public final void run() {
                    C1837h.f.b(this.f12645a, oVar);
                }
            });
        }

        @Override // P1.u.b
        public void release() {
            M.W0((Handler) AbstractC0853a.e(C1837h.this.f12622u), new Runnable() { // from class: P1.j
                @Override // java.lang.Runnable
                public final void run() {
                    C1837h.f.c(this.f12647a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: P1.h$g */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class g implements C1836g.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f12641a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C1836g f12642b;

        public g() {
        }

        @Override // P1.C1836g.a
        public void a(Exception exc, boolean z10) {
            this.f12642b = null;
            AbstractC1081v abstractC1081vV = AbstractC1081v.v(this.f12641a);
            this.f12641a.clear();
            Y it = abstractC1081vV.iterator();
            while (it.hasNext()) {
                ((C1836g) it.next()).C(exc, z10);
            }
        }

        @Override // P1.C1836g.a
        public void b() {
            this.f12642b = null;
            AbstractC1081v abstractC1081vV = AbstractC1081v.v(this.f12641a);
            this.f12641a.clear();
            Y it = abstractC1081vV.iterator();
            while (it.hasNext()) {
                ((C1836g) it.next()).B();
            }
        }

        @Override // P1.C1836g.a
        public void c(C1836g c1836g) {
            this.f12641a.add(c1836g);
            if (this.f12642b != null) {
                return;
            }
            this.f12642b = c1836g;
            c1836g.G();
        }

        public void d(C1836g c1836g) {
            this.f12641a.remove(c1836g);
            if (this.f12642b == c1836g) {
                this.f12642b = null;
                if (this.f12641a.isEmpty()) {
                    return;
                }
                C1836g c1836g2 = (C1836g) this.f12641a.iterator().next();
                this.f12642b = c1836g2;
                c1836g2.G();
            }
        }
    }

    /* JADX INFO: renamed from: P1.h$h, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class C0165h implements C1836g.b {
        public C0165h() {
        }

        @Override // P1.C1836g.b
        public void a(final C1836g c1836g, int i10) {
            if (i10 == 1 && C1837h.this.f12617p > 0 && C1837h.this.f12613l != -9223372036854775807L) {
                C1837h.this.f12616o.add(c1836g);
                ((Handler) AbstractC0853a.e(C1837h.this.f12622u)).postAtTime(new Runnable() { // from class: P1.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        c1836g.c(null);
                    }
                }, c1836g, SystemClock.uptimeMillis() + C1837h.this.f12613l);
            } else if (i10 == 0) {
                C1837h.this.f12614m.remove(c1836g);
                if (C1837h.this.f12619r == c1836g) {
                    C1837h.this.f12619r = null;
                }
                if (C1837h.this.f12620s == c1836g) {
                    C1837h.this.f12620s = null;
                }
                C1837h.this.f12610i.d(c1836g);
                if (C1837h.this.f12613l != -9223372036854775807L) {
                    ((Handler) AbstractC0853a.e(C1837h.this.f12622u)).removeCallbacksAndMessages(c1836g);
                    C1837h.this.f12616o.remove(c1836g);
                }
            }
            C1837h.this.C();
        }

        @Override // P1.C1836g.b
        public void b(C1836g c1836g, int i10) {
            if (C1837h.this.f12613l != -9223372036854775807L) {
                C1837h.this.f12616o.remove(c1836g);
                ((Handler) AbstractC0853a.e(C1837h.this.f12622u)).removeCallbacksAndMessages(c1836g);
            }
        }
    }

    public static boolean t(m mVar) {
        if (mVar.getState() != 1) {
            return false;
        }
        Throwable cause = ((m.a) AbstractC0853a.e(mVar.e())).getCause();
        return (cause instanceof ResourceBusyException) || x.e(cause);
    }

    public static List y(C0753k c0753k, UUID uuid, boolean z10) {
        ArrayList arrayList = new ArrayList(c0753k.f1727d);
        for (int i10 = 0; i10 < c0753k.f1727d; i10++) {
            C0753k.b bVarE = c0753k.e(i10);
            if ((bVarE.d(uuid) || (AbstractC0747e.f1686c.equals(uuid) && bVarE.d(AbstractC0747e.f1685b))) && (bVarE.f1732e != null || z10)) {
                arrayList.add(bVarE);
            }
        }
        return arrayList;
    }

    public final m A(int i10, boolean z10) {
        A a10 = (A) AbstractC0853a.e(this.f12618q);
        if ((a10.f() == 2 && B.f12549d) || M.J0(this.f12608g, i10) == -1 || a10.f() == 1) {
            return null;
        }
        C1836g c1836g = this.f12619r;
        if (c1836g == null) {
            C1836g c1836gX = x(AbstractC1081v.z(), true, null, z10);
            this.f12614m.add(c1836gX);
            this.f12619r = c1836gX;
        } else {
            c1836g.d(null);
        }
        return this.f12619r;
    }

    public final void B(Looper looper) {
        if (this.f12626y == null) {
            this.f12626y = new d(looper);
        }
    }

    public final void C() {
        if (this.f12618q != null && this.f12617p == 0 && this.f12614m.isEmpty() && this.f12615n.isEmpty()) {
            ((A) AbstractC0853a.e(this.f12618q)).release();
            this.f12618q = null;
        }
    }

    public final void D() {
        Y it = AbstractC1085z.t(this.f12616o).iterator();
        while (it.hasNext()) {
            ((m) it.next()).c(null);
        }
    }

    public final void E() {
        Y it = AbstractC1085z.t(this.f12615n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
    }

    public void F(int i10, byte[] bArr) {
        AbstractC0853a.g(this.f12614m.isEmpty());
        if (i10 == 1 || i10 == 3) {
            AbstractC0853a.e(bArr);
        }
        this.f12623v = i10;
        this.f12624w = bArr;
    }

    public final void G(m mVar, t.a aVar) {
        mVar.c(aVar);
        if (this.f12613l != -9223372036854775807L) {
            mVar.c(null);
        }
    }

    public final void H(boolean z10) {
        if (z10 && this.f12621t == null) {
            G1.t.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        if (Thread.currentThread() != ((Looper) AbstractC0853a.e(this.f12621t)).getThread()) {
            G1.t.i("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f12621t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // P1.u
    public m a(t.a aVar, D1.o oVar) {
        H(false);
        AbstractC0853a.g(this.f12617p > 0);
        AbstractC0853a.i(this.f12621t);
        return s(this.f12621t, aVar, oVar, true);
    }

    @Override // P1.u
    public int b(D1.o oVar) {
        H(false);
        int iF = ((A) AbstractC0853a.e(this.f12618q)).f();
        C0753k c0753k = oVar.f1809s;
        if (c0753k == null) {
            if (M.J0(this.f12608g, D1.v.k(oVar.f1805o)) == -1) {
                return 0;
            }
        } else if (!v(c0753k)) {
            return 1;
        }
        return iF;
    }

    @Override // P1.u
    public void c(Looper looper, B0 b02) {
        z(looper);
        this.f12625x = b02;
    }

    @Override // P1.u
    public u.b d(t.a aVar, D1.o oVar) {
        AbstractC0853a.g(this.f12617p > 0);
        AbstractC0853a.i(this.f12621t);
        f fVar = new f(aVar);
        fVar.d(oVar);
        return fVar;
    }

    @Override // P1.u
    public final void release() {
        H(true);
        int i10 = this.f12617p - 1;
        this.f12617p = i10;
        if (i10 != 0) {
            return;
        }
        if (this.f12613l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f12614m);
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                ((C1836g) arrayList.get(i11)).c(null);
            }
        }
        E();
        C();
    }

    public final m s(Looper looper, t.a aVar, D1.o oVar, boolean z10) {
        List listY;
        B(looper);
        C0753k c0753k = oVar.f1809s;
        if (c0753k == null) {
            return A(D1.v.k(oVar.f1805o), z10);
        }
        C1836g c1836g = null;
        byte b10 = 0;
        if (this.f12624w == null) {
            listY = y((C0753k) AbstractC0853a.e(c0753k), this.f12603b, false);
            if (listY.isEmpty()) {
                e eVar = new e(this.f12603b);
                G1.t.d("DefaultDrmSessionMgr", "DRM error", eVar);
                if (aVar != null) {
                    aVar.l(eVar);
                }
                return new z(new m.a(eVar, 6003));
            }
        } else {
            listY = null;
        }
        if (this.f12607f) {
            Iterator it = this.f12614m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1836g c1836g2 = (C1836g) it.next();
                if (Objects.equals(c1836g2.f12570a, listY)) {
                    c1836g = c1836g2;
                    break;
                }
            }
        } else {
            c1836g = this.f12620s;
        }
        if (c1836g != null) {
            c1836g.d(aVar);
            return c1836g;
        }
        C1836g c1836gX = x(listY, false, aVar, z10);
        if (!this.f12607f) {
            this.f12620s = c1836gX;
        }
        this.f12614m.add(c1836gX);
        return c1836gX;
    }

    @Override // P1.u
    public final void u() {
        H(true);
        int i10 = this.f12617p;
        this.f12617p = i10 + 1;
        if (i10 != 0) {
            return;
        }
        if (this.f12618q == null) {
            A a10 = this.f12604c.a(this.f12603b);
            this.f12618q = a10;
            a10.h(new c());
        } else if (this.f12613l != -9223372036854775807L) {
            for (int i11 = 0; i11 < this.f12614m.size(); i11++) {
                ((C1836g) this.f12614m.get(i11)).d(null);
            }
        }
    }

    public final boolean v(C0753k c0753k) {
        if (this.f12624w != null) {
            return true;
        }
        if (y(c0753k, this.f12603b, true).isEmpty()) {
            if (c0753k.f1727d != 1 || !c0753k.e(0).d(AbstractC0747e.f1685b)) {
                return false;
            }
            G1.t.h("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + this.f12603b);
        }
        String str = c0753k.f1726c;
        if (str == null || "cenc".equals(str) || "cbcs".equals(str)) {
            return true;
        }
        return ("cbc1".equals(str) || "cens".equals(str)) ? false : true;
    }

    public final C1836g w(List list, boolean z10, t.a aVar) {
        AbstractC0853a.e(this.f12618q);
        C1836g c1836g = new C1836g(this.f12603b, this.f12618q, this.f12610i, this.f12612k, list, this.f12623v, this.f12609h | z10, z10, this.f12624w, this.f12606e, this.f12605d, (Looper) AbstractC0853a.e(this.f12621t), this.f12611j, (B0) AbstractC0853a.e(this.f12625x));
        c1836g.d(aVar);
        if (this.f12613l != -9223372036854775807L) {
            c1836g.d(null);
        }
        return c1836g;
    }

    public final C1836g x(List list, boolean z10, t.a aVar, boolean z11) {
        C1836g c1836gW = w(list, z10, aVar);
        if (t(c1836gW) && !this.f12616o.isEmpty()) {
            D();
            G(c1836gW, aVar);
            c1836gW = w(list, z10, aVar);
        }
        if (!t(c1836gW) || !z11 || this.f12615n.isEmpty()) {
            return c1836gW;
        }
        E();
        if (!this.f12616o.isEmpty()) {
            D();
        }
        G(c1836gW, aVar);
        return w(list, z10, aVar);
    }

    public final synchronized void z(Looper looper) {
        try {
            Looper looper2 = this.f12621t;
            if (looper2 == null) {
                this.f12621t = looper;
                this.f12622u = new Handler(looper);
            } else {
                AbstractC0853a.g(looper2 == looper);
                AbstractC0853a.e(this.f12622u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public C1837h(UUID uuid, A.c cVar, H h10, HashMap map, boolean z10, int[] iArr, boolean z11, e2.k kVar, long j10) {
        AbstractC0853a.e(uuid);
        AbstractC0853a.b(!AbstractC0747e.f1685b.equals(uuid), "Use C.CLEARKEY_UUID instead");
        this.f12603b = uuid;
        this.f12604c = cVar;
        this.f12605d = h10;
        this.f12606e = map;
        this.f12607f = z10;
        this.f12608g = iArr;
        this.f12609h = z11;
        this.f12611j = kVar;
        this.f12610i = new g();
        this.f12612k = new C0165h();
        this.f12623v = 0;
        this.f12614m = new ArrayList();
        this.f12615n = U.h();
        this.f12616o = U.h();
        this.f12613l = j10;
    }
}
