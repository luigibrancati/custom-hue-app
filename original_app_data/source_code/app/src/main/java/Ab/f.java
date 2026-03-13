package Ab;

import android.view.GestureDetector;
import android.view.MotionEvent;
import cb.AbstractC3094e;
import cb.C3090a;
import cb.C3091b;
import cb.C3092c;
import cb.C3093d;
import cb.C3095f;
import com.google.android.filament.Engine;
import com.google.android.filament.EntityManager;
import com.google.android.filament.Scene;
import com.google.android.filament.TransformManager;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4035r;
import gc.C4205s;
import gc.U;
import gc.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import jb.AbstractC4754a;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.y;
import rb.AbstractC5695d;
import rb.C5694c;
import rb.o;
import vb.C6079c;
import vb.C6080d;
import vb.C6081e;
import vc.l;
import vc.p;
import vc.q;
import xb.AbstractC6357c;
import zb.AbstractC6555a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class f implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, GestureDetector.OnContextClickListener, C6079c.a, C6080d.a, C6081e.b, o {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public l f276A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public q f277B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public l f278C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public l f279D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public l f280E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public l f281F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public p f282G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public q f283H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public p f284I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public q f285J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public p f286K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public q f287L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public l f288M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public C5694c f289N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public AbstractC5695d f290O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public final List f291P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final List f292Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public final List f293R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public Long f294S;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Engine f295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Bc.c f303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f304j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f305k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f306l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C3093d f307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Set f309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public rb.g f310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Set f311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l f312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public l f313s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public l f314t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public l f315u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public p f316v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public l f317w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public l f318x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public l f319y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public q f320z;

    public f(Engine engine, int i10) {
        AbstractC4862t.e(engine, "engine");
        this.f295a = engine;
        this.f296b = i10;
        this.f297c = true;
        this.f298d = true;
        this.f301g = true;
        this.f302h = true;
        this.f303i = Bc.j.c(0.1f, 10.0f);
        this.f304j = true;
        this.f306l = 5.0f;
        this.f309o = U.d();
        this.f311q = U.d();
        this.f291P = C4205s.d(Integer.valueOf(i10));
        this.f292Q = new ArrayList();
        this.f293R = new ArrayList();
        if (X().hasComponent(i10)) {
            return;
        }
        X().create(i10);
    }

    public static /* synthetic */ f I0(f fVar, C3093d c3093d, boolean z10, float f10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: worldTransform");
        }
        if ((i10 & 2) != 0) {
            z10 = fVar.f305k;
        }
        if ((i10 & 4) != 0) {
            f10 = fVar.f306l;
        }
        return fVar.H0(c3093d, z10, f10);
    }

    public void A0(C3095f value) {
        AbstractC4862t.e(value, "value");
        C0(AbstractC6555a.b(R(), value, T()));
    }

    public void B0(C3091b value) {
        AbstractC4862t.e(value, "value");
        C0(AbstractC6555a.b(R(), S(), value));
    }

    public void C0(C3093d value) {
        AbstractC4862t.e(value, "value");
        AbstractC6357c.d(X(), W(), value);
        p0();
    }

    public void D0(C3091b value) {
        C3091b c3091bJ;
        AbstractC4862t.e(value, "value");
        f fVarO = O();
        if (fVarO != null && (c3091bJ = fVarO.J(value)) != null) {
            value = c3091bJ;
        }
        z0(value);
    }

    public final void E0(C3093d value) {
        C3093d c3093dK;
        AbstractC4862t.e(value, "value");
        f fVarO = O();
        if (fVarO != null && (c3093dK = fVarO.K(value)) != null) {
            value = c3093dK;
        }
        C0(value);
    }

    public f F0(C3093d transform, boolean z10, float f10) {
        AbstractC4862t.e(transform, "transform");
        if (z10) {
            this.f306l = f10;
            this.f307m = transform;
            return this;
        }
        this.f307m = null;
        C0(transform);
        return this;
    }

    public final f G(f node) {
        AbstractC4862t.e(node, "node");
        r0(V.l(this.f309o, node));
        return this;
    }

    public void G0() {
        Iterator it = this.f309o.iterator();
        while (it.hasNext()) {
            ((f) it.next()).G0();
        }
    }

    public void H() {
        try {
            C4035r.a aVar = C4035r.f34274b;
            w0(null);
            C4035r.b(C4015H.f34254a);
        } catch (Throwable th) {
            C4035r.a aVar2 = C4035r.f34274b;
            C4035r.b(AbstractC4036s.a(th));
        }
        AbstractC4754a.v(this.f295a, this.f296b);
        AbstractC4754a.h(this.f295a, this.f296b);
    }

    public f H0(C3093d worldTransform, boolean z10, float f10) {
        C3093d c3093dK;
        AbstractC4862t.e(worldTransform, "worldTransform");
        f fVarO = O();
        if (fVarO != null && (c3093dK = fVarO.K(worldTransform)) != null) {
            worldTransform = c3093dK;
        }
        return F0(worldTransform, z10, f10);
    }

    public final Set I() {
        return this.f309o;
    }

    public final C3091b J(C3091b worldPosition) {
        AbstractC4862t.e(worldPosition, "worldPosition");
        return AbstractC6555a.n(Z(), worldPosition);
    }

    public final C3093d K(C3093d worldTransform) {
        AbstractC4862t.e(worldTransform, "worldTransform");
        return Z().g(worldTransform);
    }

    public final List L() {
        return this.f292Q;
    }

    public final List M() {
        return this.f293R;
    }

    public final q N() {
        return this.f283H;
    }

    public f O() {
        return this.f308n;
    }

    public final Integer P() {
        return AbstractC6357c.a(X(), W());
    }

    public final Integer Q() {
        Integer numP = P();
        if (numP == null) {
            return null;
        }
        return Integer.valueOf(X().getInstance(numP.intValue()));
    }

    public C3091b R() {
        C3092c c3092cB = V().b();
        return new C3091b(c3092cB.b(), c3092cB.c(), c3092cB.d());
    }

    public C3095f S() {
        return AbstractC6555a.j(V());
    }

    public C3091b T() {
        C3093d c3093dV = V();
        C3092c c3092cC = c3093dV.c();
        C3091b c3091b = new C3091b(c3092cC.b(), c3092cC.c(), c3092cC.d());
        float fSqrt = (float) Math.sqrt((c3091b.a() * c3091b.a()) + (c3091b.b() * c3091b.b()) + (c3091b.c() * c3091b.c()));
        C3092c c3092cD = c3093dV.d();
        C3091b c3091b2 = new C3091b(c3092cD.b(), c3092cD.c(), c3092cD.d());
        float fSqrt2 = (float) Math.sqrt((c3091b2.a() * c3091b2.a()) + (c3091b2.b() * c3091b2.b()) + (c3091b2.c() * c3091b2.c()));
        C3092c c3092cE = c3093dV.e();
        C3091b c3091b3 = new C3091b(c3092cE.b(), c3092cE.c(), c3092cE.d());
        return new C3091b(fSqrt, fSqrt2, (float) Math.sqrt((c3091b3.a() * c3091b3.a()) + (c3091b3.b() * c3091b3.b()) + (c3091b3.c() * c3091b3.c())));
    }

    public List U() {
        return this.f291P;
    }

    public C3093d V() {
        return AbstractC6357c.b(X(), W());
    }

    public final int W() {
        return X().getInstance(this.f296b);
    }

    public final TransformManager X() {
        TransformManager transformManager = this.f295a.getTransformManager();
        AbstractC4862t.d(transformManager, "getTransformManager(...)");
        return transformManager;
    }

    public C3091b Y() {
        C3092c c3092cB = a0().b();
        return new C3091b(c3092cB.b(), c3092cB.c(), c3092cB.d());
    }

    public final C3093d Z() {
        return AbstractC3094e.a(a0());
    }

    @Override // vb.C6079c.a
    public boolean a(C6079c detector, MotionEvent e10) {
        p pVar;
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (d0() && ((pVar = this.f282G) == null || ((Boolean) pVar.invoke(detector, e10)).booleanValue())) {
            v0(V.l(this.f311q, new y() { // from class: Ab.f.a
                @Override // kotlin.jvm.internal.y, Cc.n
                public Object get(Object obj) {
                    return ((f) obj).R();
                }
            }));
            return true;
        }
        f fVarO = O();
        if (fVarO != null) {
            return fVarO.a(detector, e10);
        }
        return false;
    }

    public final C3093d a0() {
        return AbstractC6357c.c(X(), W());
    }

    @Override // vb.C6080d.a
    public boolean b(C6080d detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (e0()) {
            return m0(detector, e10, C3095f.f26476e.a(new C3091b(0.0f, 1.0f, 0.0f, 5, null), (-(detector.a() - detector.b())) * 57.295776f));
        }
        f fVarO = O();
        if (fVarO != null) {
            return fVarO.b(detector, e10);
        }
        return false;
    }

    public boolean b0() {
        return this.f299e;
    }

    @Override // vb.C6080d.a
    public boolean c(C6080d detector, MotionEvent e10) {
        p pVar;
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (e0() && ((pVar = this.f284I) == null || ((Boolean) pVar.invoke(detector, e10)).booleanValue())) {
            v0(V.l(this.f311q, new y() { // from class: Ab.f.c
                @Override // kotlin.jvm.internal.y, Cc.n
                public Object get(Object obj) {
                    return ((f) obj).S();
                }
            }));
            return true;
        }
        f fVarO = O();
        if (fVarO != null) {
            return fVarO.c(detector, e10);
        }
        return false;
    }

    public final boolean c0() {
        return this.f297c;
    }

    @Override // vb.C6081e.b
    public boolean d(C6081e detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (f0()) {
            v0(V.l(this.f311q, new y() { // from class: Ab.f.e
                @Override // kotlin.jvm.internal.y, Cc.n
                public Object get(Object obj) {
                    return ((f) obj).T();
                }
            }));
            return n0(detector, e10, detector.getScaleFactor());
        }
        f fVarO = O();
        if (fVarO != null) {
            return fVarO.d(detector, e10);
        }
        return false;
    }

    public boolean d0() {
        return b0() && this.f300f;
    }

    @Override // vb.C6079c.a
    public void e(C6079c detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (d0()) {
            v0(V.j(this.f311q, new y() { // from class: Ab.f.b
                @Override // kotlin.jvm.internal.y, Cc.n
                public Object get(Object obj) {
                    return ((f) obj).R();
                }
            }));
            return;
        }
        f fVarO = O();
        if (fVarO != null) {
            fVarO.e(detector, e10);
        }
    }

    public boolean e0() {
        return b0() && this.f301g;
    }

    @Override // vb.C6079c.a
    public boolean f(C6079c detector, MotionEvent e10) {
        List listD;
        Object next;
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (!d0()) {
            f fVarO = O();
            if (fVarO != null) {
                return fVarO.f(detector, e10);
            }
            return false;
        }
        rb.g gVar = this.f310p;
        if (gVar != null && (listD = gVar.d(e10)) != null) {
            Iterator it = listD.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (AbstractC4862t.a(((rb.h) next).f(), O())) {
                    break;
                }
            }
            rb.h hVar = (rb.h) next;
            if (hVar != null) {
                C3091b c3091bC = hVar.c();
                AbstractC4862t.d(c3091bC, "getWorldPosition(...)");
                return k0(detector, e10, c3091bC);
            }
        }
        return false;
    }

    public boolean f0() {
        return b0() && this.f302h;
    }

    @Override // vb.C6081e.b
    public boolean g(C6081e detector, MotionEvent e10) {
        p pVar;
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (f0() && ((pVar = this.f286K) == null || ((Boolean) pVar.invoke(detector, e10)).booleanValue())) {
            return true;
        }
        f fVarO = O();
        if (fVarO != null) {
            return fVarO.g(detector, e10);
        }
        return false;
    }

    public boolean g0() {
        return this.f298d;
    }

    public final int getEntity() {
        return this.f296b;
    }

    public boolean h0() {
        if (!this.f304j) {
            return false;
        }
        f fVarO = O();
        return fVarO == null || fVarO.h0();
    }

    @Override // vb.C6081e.b
    public void i(C6081e detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (f0()) {
            v0(V.j(this.f311q, new y() { // from class: Ab.f.f
                @Override // kotlin.jvm.internal.y, Cc.n
                public Object get(Object obj) {
                    return ((f) obj).T();
                }
            }));
            return;
        }
        f fVarO = O();
        if (fVarO != null) {
            fVarO.i(detector, e10);
        }
    }

    public void i0(Scene scene) {
        AbstractC4862t.e(scene, "scene");
        l lVar = this.f314t;
        if (lVar != null) {
            lVar.invoke(scene);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j0(long r10) {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: Ab.f.j0(long):void");
    }

    public boolean k0(C6079c detector, MotionEvent e10, C3091b worldPosition) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        AbstractC4862t.e(worldPosition, "worldPosition");
        q qVar = this.f283H;
        if (qVar != null && !((Boolean) qVar.invoke(detector, e10, worldPosition)).booleanValue()) {
            return false;
        }
        D0(worldPosition);
        return true;
    }

    @Override // vb.C6080d.a
    public void l(C6080d detector, MotionEvent e10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        if (e0()) {
            v0(V.j(this.f311q, new y() { // from class: Ab.f.d
                @Override // kotlin.jvm.internal.y, Cc.n
                public Object get(Object obj) {
                    return ((f) obj).S();
                }
            }));
            return;
        }
        f fVarO = O();
        if (fVarO != null) {
            fVarO.l(detector, e10);
        }
    }

    public void l0(Scene scene) {
        AbstractC4862t.e(scene, "scene");
        l lVar = this.f315u;
        if (lVar != null) {
            lVar.invoke(scene);
        }
    }

    public boolean m0(C6080d detector, MotionEvent e10, C3095f rotationDelta) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        AbstractC4862t.e(rotationDelta, "rotationDelta");
        q qVar = this.f285J;
        if (qVar != null && !((Boolean) qVar.invoke(detector, e10, rotationDelta)).booleanValue()) {
            return false;
        }
        C3095f c3095fS = S();
        A0(new C3095f((((c3095fS.a() * rotationDelta.b()) + (c3095fS.b() * rotationDelta.a())) + (c3095fS.c() * rotationDelta.d())) - (c3095fS.d() * rotationDelta.c()), ((c3095fS.a() * rotationDelta.c()) - (c3095fS.b() * rotationDelta.d())) + (c3095fS.c() * rotationDelta.a()) + (c3095fS.d() * rotationDelta.b()), (((c3095fS.a() * rotationDelta.d()) + (c3095fS.b() * rotationDelta.c())) - (c3095fS.c() * rotationDelta.b())) + (c3095fS.d() * rotationDelta.a()), (((c3095fS.a() * rotationDelta.a()) - (c3095fS.b() * rotationDelta.b())) - (c3095fS.c() * rotationDelta.c())) - (c3095fS.d() * rotationDelta.d())));
        return true;
    }

    public boolean n0(C6081e detector, MotionEvent e10, float f10) {
        AbstractC4862t.e(detector, "detector");
        AbstractC4862t.e(e10, "e");
        q qVar = this.f287L;
        if (qVar != null && !((Boolean) qVar.invoke(detector, e10, Float.valueOf(f10))).booleanValue()) {
            return false;
        }
        C3091b c3091bT = T();
        C3091b c3091b = new C3091b(c3091bT.a() * f10, c3091bT.b() * f10, c3091bT.c() * f10);
        if (!this.f303i.a(Float.valueOf(c3091b.a())) || !this.f303i.a(Float.valueOf(c3091b.b())) || !this.f303i.a(Float.valueOf(c3091b.c()))) {
            return false;
        }
        B0(c3091b);
        return true;
    }

    public boolean o0(MotionEvent e10, rb.h hitResult) {
        AbstractC4862t.e(e10, "e");
        AbstractC4862t.e(hitResult, "hitResult");
        p pVar = this.f316v;
        if (pVar != null) {
            return ((Boolean) pVar.invoke(e10, hitResult)).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f281F;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(e10)).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f279D;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(e10)).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTapEvent(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f280E;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(e10)).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f317w;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(e10)).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onFling(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        AbstractC4862t.e(e22, "e2");
        q qVar = this.f277B;
        if (qVar != null) {
            return ((Boolean) qVar.invoke(motionEvent, e22, new C3090a(f10, f11))).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onLongPress(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f276A;
        if (lVar != null) {
            lVar.invoke(e10);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent e22, float f10, float f11) {
        AbstractC4862t.e(e22, "e2");
        q qVar = this.f320z;
        if (qVar != null) {
            return ((Boolean) qVar.invoke(motionEvent, e22, new C3090a(f10, f11))).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public void onShowPress(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f318x;
        if (lVar != null) {
            lVar.invoke(e10);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f278C;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(e10)).booleanValue();
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent e10) {
        AbstractC4862t.e(e10, "e");
        l lVar = this.f319y;
        if (lVar != null) {
            return ((Boolean) lVar.invoke(e10)).booleanValue();
        }
        return false;
    }

    @Override // rb.o
    public rb.j p() {
        return AbstractC6555a.u(a0());
    }

    public void p0() {
        q0();
    }

    public void q0() {
        C5694c c5694c = this.f289N;
        if (c5694c != null) {
            c5694c.c();
        }
        Iterator it = this.f309o.iterator();
        while (it.hasNext()) {
            ((f) it.next()).q0();
        }
    }

    public final void r0(Set value) {
        AbstractC4862t.e(value, "value");
        if (AbstractC4862t.a(this.f309o, value)) {
            return;
        }
        Set<f> setI = V.i(this.f309o, value);
        Set<f> setI2 = V.i(value, this.f309o);
        this.f309o = value;
        for (f fVar : setI) {
            if (AbstractC4862t.a(fVar.O(), this)) {
                fVar.w0(null);
            }
            Iterator it = this.f293R.iterator();
            while (it.hasNext()) {
                ((l) it.next()).invoke(fVar);
            }
        }
        for (f fVar2 : setI2) {
            if (!AbstractC4862t.a(fVar2.O(), this)) {
                fVar2.w0(this);
            }
            Iterator it2 = this.f292Q.iterator();
            while (it2.hasNext()) {
                ((l) it2.next()).invoke(fVar2);
            }
        }
        p0();
    }

    public final void s0(C5694c c5694c) {
        rb.g gVar;
        rb.g gVar2;
        if (AbstractC4862t.a(this.f289N, c5694c)) {
            return;
        }
        C5694c c5694c2 = this.f289N;
        if (c5694c2 != null && (gVar2 = this.f310p) != null) {
            gVar2.h(c5694c2);
        }
        this.f289N = c5694c;
        if (c5694c == null || (gVar = this.f310p) == null) {
            return;
        }
        gVar.c(c5694c);
    }

    public final void t0(AbstractC5695d abstractC5695d) {
        this.f290O = abstractC5695d;
        if (abstractC5695d != null) {
            C5694c c5694c = this.f289N;
            if (c5694c == null) {
                c5694c = new C5694c(this);
                s0(c5694c);
            }
            c5694c.e(abstractC5695d);
        } else {
            s0(null);
        }
        p0();
    }

    public final void u0(rb.g gVar) {
        if (AbstractC4862t.a(this.f310p, gVar)) {
            return;
        }
        this.f310p = gVar;
        C5694c c5694c = this.f289N;
        if (c5694c != null) {
            c5694c.d(gVar);
        }
    }

    public final void v0(Set value) {
        AbstractC4862t.e(value, "value");
        if (AbstractC4862t.a(this.f311q, value)) {
            return;
        }
        this.f311q = value;
        l lVar = this.f288M;
        if (lVar != null) {
            lVar.invoke(value);
        }
    }

    public void w0(f fVar) {
        if (AbstractC4862t.a(this.f308n, fVar)) {
            return;
        }
        f fVar2 = this.f308n;
        this.f308n = fVar;
        if (fVar2 != null) {
            fVar2.r0(V.j(fVar2.f309o, this));
        }
        if (fVar != null) {
            fVar.r0(V.l(fVar.f309o, this));
        }
        x0(fVar != null ? Integer.valueOf(fVar.f296b) : null);
    }

    public final Engine x() {
        return this.f295a;
    }

    public final void x0(Integer num) {
        Integer numValueOf;
        if (AbstractC4862t.a(P(), num)) {
            return;
        }
        if (num != null) {
            numValueOf = Integer.valueOf(X().getInstance(num.intValue()));
        } else {
            numValueOf = null;
        }
        y0(numValueOf);
    }

    public final void y0(Integer num) {
        if (AbstractC4862t.a(Q(), num)) {
            return;
        }
        X().setParent(W(), num != null ? num.intValue() : 0);
    }

    public void z0(C3091b value) {
        AbstractC4862t.e(value, "value");
        C0(AbstractC6555a.b(value, S(), T()));
    }

    public /* synthetic */ f(Engine engine, int i10, int i11, AbstractC4854k abstractC4854k) {
        this(engine, (i11 & 2) != 0 ? EntityManager.get().create() : i10);
    }
}
