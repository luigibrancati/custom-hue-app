package P;

import E.AbstractC0807p0;
import E.C0781c0;
import E.C0813t;
import E.C0822x0;
import E.I;
import E.InterfaceC0800m;
import E.InterfaceC0802n;
import E.InterfaceC0815u;
import E.V0;
import E.W0;
import E.X0;
import L.B;
import L.C1092d;
import L.C1094e;
import L.C1128v0;
import L.F;
import L.InterfaceC1099g0;
import L.J;
import L.M0;
import L.a1;
import L.e1;
import L.s1;
import L.t1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC0800m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1094e f12495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1094e f12496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t1 f12497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0813t f12498d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F.a f12501g;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final B f12505k;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public W0 f12509o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Y.f f12510p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final I f12511q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final I f12512r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m f12514t;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f12499e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f12500f = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f12502h = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12503i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Range f12504j = e1.f8057a;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Object f12506l = new Object();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f12507m = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC1099g0 f12508n = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final S.e f12513s = new S.e();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends Exception {
        public a() {
        }

        public a(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s1 f12515a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public s1 f12516b;

        public b(s1 s1Var, s1 s1Var2) {
            this.f12515a = s1Var;
            this.f12516b = s1Var2;
        }
    }

    public f(J j10, J j11, C1092d c1092d, C1092d c1092d2, I i10, I i11, F.a aVar, m mVar, t1 t1Var) {
        this.f12505k = c1092d.s();
        this.f12495a = new C1094e(j10, c1092d);
        if (j11 == null || c1092d2 == null) {
            this.f12496b = null;
        } else {
            this.f12496b = new C1094e(j11, c1092d2);
        }
        this.f12511q = i10;
        this.f12512r = i11;
        this.f12501g = aVar;
        this.f12497c = t1Var;
        this.f12498d = C0813t.b(c1092d, c1092d2);
        this.f12514t = mVar;
    }

    public static void B(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((W0) it.next()).X(null);
        }
    }

    public static s1 G(t1 t1Var, Y.f fVar) {
        s1 s1VarM = new C0822x0.a().c().m(false, t1Var);
        if (s1VarM == null) {
            return null;
        }
        M0 m0H0 = M0.h0(s1VarM);
        m0H0.i0(q.f12542N);
        return fVar.E(m0H0).b();
    }

    private int I() {
        synchronized (this.f12506l) {
            try {
                return this.f12501g.c() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Map J(Collection collection, t1 t1Var, t1 t1Var2, int i10, Range range) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            map.put(w02, new b(Y.f.u0(w02) ? G(t1Var, (Y.f) w02) : w02.m(false, t1Var), t(w02, w02.m(true, t1Var2), i10, range)));
        }
        return map;
    }

    public static boolean O(e1 e1Var, a1 a1Var) {
        InterfaceC1099g0 interfaceC1099g0D = e1Var.d();
        InterfaceC1099g0 interfaceC1099g0G = a1Var.g();
        Objects.requireNonNull(interfaceC1099g0D);
        if (interfaceC1099g0D.b().size() != a1Var.g().b().size()) {
            return true;
        }
        for (InterfaceC1099g0.a aVar : interfaceC1099g0D.b()) {
            if (!interfaceC1099g0G.d(aVar) || !Objects.equals(interfaceC1099g0G.a(aVar), interfaceC1099g0D.a(aVar))) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (Y(((W0) it.next()).l().C())) {
                return true;
            }
        }
        return false;
    }

    public static boolean Q(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            if (X(w02)) {
                s1 s1VarL = w02.l();
                InterfaceC1099g0.a aVar = C1128v0.f8203U;
                if (s1VarL.d(aVar) && ((Integer) X0.h.g((Integer) s1VarL.a(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean R(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            if (X(w02)) {
                s1 s1VarL = w02.l();
                InterfaceC1099g0.a aVar = C1128v0.f8203U;
                if (s1VarL.d(aVar) && ((Integer) X0.h.g((Integer) s1VarL.a(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean S(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (c0((W0) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean U(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            if (Z(w02) || Y.f.u0(w02)) {
                z10 = true;
            } else if (X(w02)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    public static boolean V(Collection collection) {
        Iterator it = collection.iterator();
        boolean z10 = false;
        boolean z11 = false;
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            if (Z(w02) || Y.f.u0(w02)) {
                z11 = true;
            } else if (X(w02)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    public static boolean W(List... listArr) {
        boolean z10 = false;
        for (List list : listArr) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((W0) it.next()).o() != null) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    public static boolean X(W0 w02) {
        return w02 instanceof C0781c0;
    }

    public static boolean Y(E.J j10) {
        return (j10.a() == 10) || (j10.b() != 1 && j10.b() != 0);
    }

    public static boolean Z(W0 w02) {
        return w02 instanceof C0822x0;
    }

    public static boolean b0(Collection collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (w02.G(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    public static boolean c0(W0 w02) {
        if (w02 != null) {
            if (w02.l().d(s1.f8181G)) {
                return w02.l().S() == t1.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", w02 + " UseCase does not have capture type.");
        }
        return false;
    }

    public static /* synthetic */ void d(V0 v02) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(v02.n().getWidth(), v02.n().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        v02.r(surface, N.a.a(), new X0.a() { // from class: P.e
            @Override // X0.a
            public final void accept(Object obj) {
                f.j(surface, surfaceTexture, (V0.g) obj);
            }
        });
    }

    public static void e0(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            ((W0) entry.getKey()).X((Set) entry.getValue());
        }
    }

    public static List h0(List list, Collection collection) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            ((W0) it.next()).W(null);
            Iterator it2 = list.iterator();
            if (it2.hasNext()) {
                android.support.v4.media.session.a.a(it2.next());
                throw null;
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void j(Surface surface, SurfaceTexture surfaceTexture, V0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    public static void n0(List list, Collection collection, Collection collection2) {
        List listH0 = h0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List listH02 = h0(listH0, arrayList);
        if (listH02.isEmpty()) {
            return;
        }
        AbstractC0807p0.l("CameraUseCaseAdapter", "Unused effects: " + listH02);
    }

    public static Map s(Collection collection, H.b bVar) {
        HashMap map = new HashMap();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            map.put(w02, w02.o());
            w02.X(bVar != null ? bVar.a() : null);
        }
        return map;
    }

    public static s1 t(W0 w02, s1 s1Var, int i10, Range range) {
        M0 m0H0 = s1Var != null ? M0.h0(s1Var) : M0.g0();
        m0H0.H(s1.f8176B, Integer.valueOf(i10));
        if (!e1.f8057a.equals(range)) {
            m0H0.Y(s1.f8177C, InterfaceC1099g0.c.HIGH_PRIORITY_REQUIRED, range);
            m0H0.H(s1.f8178D, Boolean.TRUE);
        }
        return w02.E(m0H0).b();
    }

    public static Collection x(Collection collection, W0 w02, Y.f fVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (w02 != null) {
            arrayList.add(w02);
        }
        if (fVar != null) {
            arrayList.add(fVar);
            arrayList.removeAll(fVar.q0());
        }
        return arrayList;
    }

    public static Matrix z(Rect rect, Size size) {
        X0.h.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    public final void A(Collection collection) {
        if (N()) {
            if (P(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (Q(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f12506l) {
            try {
                if (!this.f12502h.isEmpty() && (R(collection) || Q(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } finally {
            }
        }
    }

    public final C0781c0 C() {
        return new C0781c0.b().n("ImageCapture-Extra").c();
    }

    public final C0822x0 D() {
        C0822x0 c0822x0C = new C0822x0.a().m("Preview-Extra").c();
        c0822x0C.m0(new C0822x0.c() { // from class: P.d
            @Override // E.C0822x0.c
            public final void a(V0 v02) {
                f.d(v02);
            }
        });
        return c0822x0C;
    }

    public final Y.f E(Collection collection, boolean z10) {
        synchronized (this.f12506l) {
            try {
                Set setL = L(collection, z10);
                if (setL.size() >= 2 || (N() && S(setL))) {
                    Y.f fVar = this.f12510p;
                    if (fVar == null || !fVar.q0().equals(setL)) {
                        if (!b0(setL)) {
                            return null;
                        }
                        return new Y.f(this.f12495a, this.f12496b, this.f12511q, this.f12512r, setL, this.f12497c);
                    }
                    this.f12510p.z0(setL);
                    Y.f fVar2 = this.f12510p;
                    Objects.requireNonNull(fVar2);
                    return fVar2;
                }
                return null;
            } finally {
            }
        }
    }

    public void F() {
        synchronized (this.f12506l) {
            try {
                if (this.f12507m) {
                    this.f12495a.h(new ArrayList(this.f12500f));
                    C1094e c1094e = this.f12496b;
                    if (c1094e != null) {
                        c1094e.h(new ArrayList(this.f12500f));
                    }
                    v();
                    this.f12507m = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public C0813t H() {
        return this.f12498d;
    }

    public final int K(boolean z10) {
        int i10;
        synchronized (this.f12506l) {
            try {
                Iterator it = this.f12502h.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.session.a.a(it.next());
                    throw null;
                }
                i10 = z10 ? 3 : 0;
            } finally {
            }
        }
        return i10;
    }

    public final Set L(Collection collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int iK = K(z10);
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            W0 w02 = (W0) it.next();
            X0.h.b(!Y.f.u0(w02), "Only support one level of sharing for now.");
            if (w02.G(iK)) {
                hashSet.add(w02);
            }
        }
        return hashSet;
    }

    public List M() {
        ArrayList arrayList;
        synchronized (this.f12506l) {
            arrayList = new ArrayList(this.f12499e);
        }
        return arrayList;
    }

    public final boolean N() {
        synchronized (this.f12506l) {
            this.f12505k.q(null);
        }
        return false;
    }

    public final boolean T() {
        boolean z10;
        synchronized (this.f12506l) {
            z10 = true;
            if (this.f12505k.t() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // E.InterfaceC0800m
    public InterfaceC0802n a() {
        return this.f12495a.a();
    }

    public final boolean a0() {
        return (N() || this.f12496b != null || this.f12503i == 1) ? false : true;
    }

    @Override // E.InterfaceC0800m
    public InterfaceC0815u b() {
        return this.f12495a.b();
    }

    public void d0(Collection collection) {
        synchronized (this.f12506l) {
            B(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f12499e);
            linkedHashSet.removeAll(collection);
            n(w(linkedHashSet, this.f12496b != null, false));
        }
    }

    public void f(boolean z10) {
        this.f12495a.f(z10);
    }

    public final void f0() {
        synchronized (this.f12506l) {
            try {
                if (this.f12508n != null) {
                    this.f12495a.c().g(this.f12508n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void g0(List list) {
        synchronized (this.f12506l) {
            this.f12502h = list;
        }
    }

    public void i0(Range range) {
        synchronized (this.f12506l) {
            this.f12504j = range;
        }
    }

    public void j0(int i10) {
        synchronized (this.f12506l) {
            this.f12503i = i10;
        }
    }

    public void k0(X0 x02) {
        synchronized (this.f12506l) {
        }
    }

    public final boolean l0(Collection collection) {
        if (N() && S(collection)) {
            return true;
        }
        return this.f12513s.a(this.f12495a.i().d(), collection);
    }

    public void m(Collection collection, H.b bVar) {
        AbstractC0807p0.a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f12506l) {
            try {
                r();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f12499e);
                linkedHashSet.addAll(collection);
                Map mapS = s(linkedHashSet, bVar);
                try {
                    n(w(linkedHashSet, this.f12496b != null, false));
                } catch (IllegalArgumentException e10) {
                    e0(mapS);
                    throw new a(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public P.b m0(Collection collection, H.b bVar, boolean z10) {
        P.b bVarW;
        AbstractC0807p0.a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + bVar);
        synchronized (this.f12506l) {
            r();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f12499e);
            linkedHashSet.addAll(collection);
            Map mapS = s(linkedHashSet, bVar);
            try {
                try {
                    bVarW = w(linkedHashSet, this.f12496b != null, z10);
                } catch (IllegalArgumentException e10) {
                    throw new a(e10);
                }
            } finally {
                e0(mapS);
            }
        }
        return bVarW;
    }

    public final void n(P.b bVar) {
        o0(bVar.g().b(), bVar.b());
        n0(this.f12502h, bVar.b(), bVar.a());
        Iterator it = bVar.d().iterator();
        while (it.hasNext()) {
            ((W0) it.next()).a0(this.f12495a);
        }
        this.f12495a.h(bVar.d());
        if (this.f12496b != null) {
            for (W0 w02 : bVar.d()) {
                C1094e c1094e = this.f12496b;
                Objects.requireNonNull(c1094e);
                w02.a0(c1094e);
            }
            C1094e c1094e2 = this.f12496b;
            Objects.requireNonNull(c1094e2);
            c1094e2.h(bVar.d());
        }
        if (bVar.d().isEmpty()) {
            for (W0 w03 : bVar.e()) {
                Map mapB = bVar.g().b();
                if (mapB.containsKey(w03)) {
                    e1 e1Var = (e1) mapB.get(w03);
                    Objects.requireNonNull(e1Var);
                    InterfaceC1099g0 interfaceC1099g0D = e1Var.d();
                    if (interfaceC1099g0D != null && O(e1Var, w03.A())) {
                        w03.d0(interfaceC1099g0D);
                        if (this.f12507m) {
                            this.f12495a.n(w03);
                            C1094e c1094e3 = this.f12496b;
                            if (c1094e3 != null) {
                                Objects.requireNonNull(c1094e3);
                                c1094e3.n(w03);
                            }
                        }
                    }
                }
            }
        }
        for (W0 w04 : bVar.c()) {
            b bVar2 = (b) bVar.j().get(w04);
            Objects.requireNonNull(bVar2);
            C1094e c1094e4 = this.f12496b;
            if (c1094e4 != null) {
                C1094e c1094e5 = this.f12495a;
                Objects.requireNonNull(c1094e4);
                w04.d(c1094e5, c1094e4, bVar2.f12515a, bVar2.f12516b);
                w04.c0((e1) X0.h.g((e1) bVar.g().b().get(w04)), (e1) ((l) X0.h.g(bVar.h())).b().get(w04));
            } else {
                w04.d(this.f12495a, null, bVar2.f12515a, bVar2.f12516b);
                w04.c0((e1) X0.h.g((e1) bVar.g().b().get(w04)), null);
            }
        }
        if (this.f12507m) {
            this.f12495a.g(bVar.c());
            C1094e c1094e6 = this.f12496b;
            if (c1094e6 != null) {
                Objects.requireNonNull(c1094e6);
                c1094e6.g(bVar.c());
            }
        }
        Iterator it2 = bVar.c().iterator();
        while (it2.hasNext()) {
            ((W0) it2.next()).M();
        }
        this.f12499e.clear();
        this.f12499e.addAll(bVar.a());
        this.f12500f.clear();
        this.f12500f.addAll(bVar.b());
        this.f12509o = bVar.f();
        this.f12510p = bVar.i();
    }

    public final void o0(Map map, Collection collection) {
        synchronized (this.f12506l) {
            try {
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    W0 w02 = (W0) it.next();
                    w02.Y(z(this.f12495a.i().e(), ((e1) X0.h.g((e1) map.get(w02))).f()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r() {
        this.f12495a.k(this.f12505k);
        C1094e c1094e = this.f12496b;
        if (c1094e != null) {
            c1094e.k(this.f12505k);
        }
    }

    public void u() {
        synchronized (this.f12506l) {
            try {
                if (!this.f12507m) {
                    if (!this.f12500f.isEmpty()) {
                        this.f12495a.k(this.f12505k);
                        C1094e c1094e = this.f12496b;
                        if (c1094e != null) {
                            c1094e.k(this.f12505k);
                        }
                    }
                    this.f12495a.g(this.f12500f);
                    C1094e c1094e2 = this.f12496b;
                    if (c1094e2 != null) {
                        c1094e2.g(this.f12500f);
                    }
                    f0();
                    Iterator it = this.f12500f.iterator();
                    while (it.hasNext()) {
                        ((W0) it.next()).M();
                    }
                    this.f12507m = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v() {
        synchronized (this.f12506l) {
            F fC = this.f12495a.c();
            this.f12508n = fC.i();
            fC.m();
        }
    }

    public final P.b w(Collection collection, boolean z10, boolean z11) {
        l lVarB;
        l lVarB2;
        boolean z12 = z11;
        A(collection);
        if (!z10 && l0(collection)) {
            return w(collection, true, z12);
        }
        Y.f fVarE = E(collection, z10);
        W0 w0Y = y(collection, fVarE);
        Collection<?> collectionX = x(collection, w0Y, fVarE);
        ArrayList arrayList = new ArrayList(collectionX);
        arrayList.removeAll(this.f12500f);
        ArrayList arrayList2 = new ArrayList(collectionX);
        arrayList2.retainAll(this.f12500f);
        ArrayList arrayList3 = new ArrayList(this.f12500f);
        arrayList3.removeAll(collectionX);
        Map mapJ = J(arrayList, this.f12505k.j(), this.f12497c, this.f12503i, this.f12504j);
        boolean zW = W(arrayList, arrayList2);
        try {
            lVarB = this.f12514t.b(I(), this.f12495a.i(), arrayList, arrayList2, this.f12505k, this.f12503i, this.f12504j, zW, z12);
        } catch (IllegalArgumentException e10) {
            e = e10;
        }
        try {
            if (this.f12496b != null) {
                m mVar = this.f12514t;
                int I10 = I();
                C1094e c1094e = this.f12496b;
                Objects.requireNonNull(c1094e);
                z12 = z11;
                lVarB2 = mVar.b(I10, c1094e.i(), arrayList, arrayList2, this.f12505k, this.f12503i, this.f12504j, zW, z12);
            } else {
                lVarB2 = null;
            }
            return new P.b(collection, collectionX, arrayList, arrayList2, arrayList3, fVarE, w0Y, mapJ, lVarB, lVarB2);
        } catch (IllegalArgumentException e11) {
            e = e11;
            z12 = z11;
            if (z10 || !a0()) {
                throw e;
            }
            return w(collection, true, z12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final E.W0 y(java.util.Collection r3, Y.f r4) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f12506l
            monitor-enter(r0)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L15
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L15
            if (r4 == 0) goto L17
            r1.add(r4)     // Catch: java.lang.Throwable -> L15
            java.util.Set r3 = r4.q0()     // Catch: java.lang.Throwable -> L15
            r1.removeAll(r3)     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r2 = move-exception
            goto L4c
        L17:
            boolean r3 = r2.T()     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L49
            boolean r3 = V(r1)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L33
            E.W0 r3 = r2.f12509o     // Catch: java.lang.Throwable -> L15
            boolean r3 = Z(r3)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L2e
            E.W0 r2 = r2.f12509o     // Catch: java.lang.Throwable -> L15
            goto L4a
        L2e:
            E.x0 r2 = r2.D()     // Catch: java.lang.Throwable -> L15
            goto L4a
        L33:
            boolean r3 = U(r1)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L49
            E.W0 r3 = r2.f12509o     // Catch: java.lang.Throwable -> L15
            boolean r3 = X(r3)     // Catch: java.lang.Throwable -> L15
            if (r3 == 0) goto L44
            E.W0 r2 = r2.f12509o     // Catch: java.lang.Throwable -> L15
            goto L4a
        L44:
            E.c0 r2 = r2.C()     // Catch: java.lang.Throwable -> L15
            goto L4a
        L49:
            r2 = 0
        L4a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            return r2
        L4c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: P.f.y(java.util.Collection, Y.f):E.W0");
    }
}
