package a0;

import E.C0805o0;
import E.C0813t;
import E.C0817v;
import E.F;
import E.F0;
import E.G;
import E.I;
import E.InterfaceC0800m;
import E.InterfaceC0811s;
import E.InterfaceC0815u;
import E.W0;
import L.AbstractC1119q0;
import L.B;
import L.C1092d;
import L.D;
import L.E;
import L.J;
import M.x;
import O.n;
import a0.h;
import android.content.Context;
import androidx.lifecycle.InterfaceC2758n;
import fc.C4015H;
import gc.C4204q;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.S;
import s3.AbstractC5712a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20474a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G.b f20475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O7.e f20476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public O7.e f20477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f20478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public F f20479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Context f20480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f20481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashSet f20482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f20483j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements G.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G f20484a;

        public a(G g10) {
            this.f20484a = g10;
        }

        @Override // E.G.b
        public final G getCameraXConfig() {
            return this.f20484a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b implements O.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ F f20486b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f20487c;

        public b(F f10, Context context) {
            this.f20486b = f10;
            this.f20487c = context;
        }

        @Override // O.c
        public void a(Throwable t10) {
            AbstractC4862t.e(t10, "t");
            g.this.C(false);
        }

        @Override // O.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r22) {
            g.this.f20479f = this.f20486b;
            g.this.B(M.e.a(this.f20487c));
        }
    }

    public g() {
        O7.e eVarP = n.p(null);
        AbstractC4862t.d(eVarP, "immediateFuture(...)");
        this.f20477d = eVarP;
        h hVarC = h.c();
        AbstractC4862t.d(hVarC, "getInstance(...)");
        this.f20478e = hVarC;
        this.f20481h = new HashMap();
        this.f20482i = new HashSet();
        this.f20483j = -1;
    }

    public static final void D(g gVar) {
        gVar.E();
        gVar.f20478e.i(gVar.f20482i);
    }

    public static /* synthetic */ InterfaceC0800m o(g gVar, InterfaceC2758n interfaceC2758n, C0817v c0817v, C0817v c0817v2, I i10, I i11, F0 f02, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            c0817v2 = null;
        }
        C0817v c0817v3 = c0817v2;
        if ((i12 & 8) != 0) {
            i10 = I.f2784d;
        }
        I i13 = i10;
        if ((i12 & 16) != 0) {
            i11 = I.f2784d;
        }
        return gVar.n(interfaceC2758n, c0817v, c0817v3, i13, i11, f02);
    }

    public static final O7.e w(F f10, Void r12) {
        return f10.l();
    }

    public static final O7.e x(l lVar, Object obj) {
        return (O7.e) lVar.invoke(obj);
    }

    public void A(int i10) {
        this.f20483j = i10;
    }

    public final void B(Context context) {
        this.f20480g = context;
    }

    public final O7.e C(boolean z10) {
        O7.e eVarP;
        x.f(new Runnable() { // from class: a0.f
            @Override // java.lang.Runnable
            public final void run() {
                g.D(this.f20473a);
            }
        });
        F f10 = this.f20479f;
        if (f10 != null) {
            AbstractC4862t.b(f10);
            eVarP = f10.q();
        } else {
            eVarP = n.p(null);
        }
        AbstractC4862t.b(eVarP);
        synchronized (this.f20474a) {
            if (z10) {
                try {
                    this.f20475b = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f20476c = null;
            this.f20477d = eVarP;
            this.f20481h.clear();
            this.f20482i.clear();
            C4015H c4015h = C4015H.f34254a;
        }
        this.f20479f = null;
        this.f20480g = null;
        return eVarP;
    }

    public void E() {
        AbstractC5712a.b("CX:unbindAll");
        try {
            x.b();
            y(0);
            this.f20478e.m(this.f20482i);
            C4015H c4015h = C4015H.f34254a;
        } finally {
            AbstractC5712a.d();
        }
    }

    public InterfaceC0800m m(InterfaceC2758n lifecycleOwner, C0817v cameraSelector, W0... useCases) {
        AbstractC4862t.e(lifecycleOwner, "lifecycleOwner");
        AbstractC4862t.e(cameraSelector, "cameraSelector");
        AbstractC4862t.e(useCases, "useCases");
        AbstractC5712a.b("CX:bindToLifecycle");
        try {
            if (t() == 2) {
                throw new UnsupportedOperationException("bindToLifecycle for single camera is not supported in concurrent camera mode, call unbindAll() first");
            }
            y(1);
            return o(this, lifecycleOwner, cameraSelector, null, null, null, new C0805o0(C4204q.S(useCases), null, null, 6, null), 28, null);
        } finally {
            AbstractC5712a.d();
        }
    }

    public final InterfaceC0800m n(InterfaceC2758n interfaceC2758n, C0817v c0817v, C0817v c0817v2, I i10, I i11, F0 f02) {
        J j10;
        C1092d c1092d;
        AbstractC5712a.b("CX:bindToLifecycle-internal");
        try {
            x.b();
            F f10 = this.f20479f;
            AbstractC4862t.b(f10);
            J jG = c0817v.g(f10.h().m());
            AbstractC4862t.d(jG, "select(...)");
            jG.q(true);
            InterfaceC0815u interfaceC0815uS = s(c0817v);
            AbstractC4862t.c(interfaceC0815uS, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
            C1092d c1092d2 = (C1092d) interfaceC0815uS;
            if (c0817v2 != null) {
                F f11 = this.f20479f;
                AbstractC4862t.b(f11);
                J jG2 = c0817v2.g(f11.h().m());
                jG2.q(false);
                InterfaceC0815u interfaceC0815uS2 = s(c0817v2);
                AbstractC4862t.c(interfaceC0815uS2, "null cannot be cast to non-null type androidx.camera.core.impl.AdapterCameraInfo");
                j10 = jG2;
                c1092d = (C1092d) interfaceC0815uS2;
            } else {
                j10 = null;
                c1092d = null;
            }
            C0813t c0813tE = C0813t.f3022c.e(c1092d2, c1092d);
            c cVarD = this.f20478e.d(interfaceC2758n, c0813tE);
            Collection collectionF = this.f20478e.f();
            for (W0 w02 : f02.k()) {
                for (Object obj : collectionF) {
                    AbstractC4862t.d(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.t(w02) && !AbstractC4862t.a(cVar.r(), interfaceC2758n)) {
                        S s10 = S.f39781a;
                        String str = String.format("Use case %s already bound to a different lifecycle.", Arrays.copyOf(new Object[]{w02}, 1));
                        AbstractC4862t.d(str, "format(...)");
                        throw new IllegalStateException(str);
                    }
                }
            }
            if (cVarD == null) {
                h hVar = this.f20478e;
                F f12 = this.f20479f;
                AbstractC4862t.b(f12);
                cVarD = hVar.b(interfaceC2758n, f12.i().b(jG, j10, c1092d2, c1092d, i10, i11));
            }
            if (f02.k().isEmpty()) {
                AbstractC4862t.b(cVarD);
            } else {
                h hVar2 = this.f20478e;
                AbstractC4862t.b(cVarD);
                F f13 = this.f20479f;
                AbstractC4862t.b(f13);
                hVar2.a(cVarD, f02, f13.g().f());
                this.f20482i.add(h.a.a(interfaceC2758n, c0813tE));
            }
            return cVarD;
        } finally {
            AbstractC5712a.d();
        }
    }

    public final void p(G cameraXConfig) {
        AbstractC4862t.e(cameraXConfig, "cameraXConfig");
        AbstractC5712a.b("CX:configureInstanceInternal");
        try {
            synchronized (this.f20474a) {
                X0.h.g(cameraXConfig);
                X0.h.j(u() == null, "CameraX has already been configured. To use a different configuration, shutdown() must be called.");
                z(new a(cameraXConfig));
                C4015H c4015h = C4015H.f34254a;
            }
        } finally {
            AbstractC5712a.d();
        }
    }

    public List q() {
        AbstractC5712a.b("CX:getAvailableCameraInfos");
        try {
            ArrayList arrayList = new ArrayList();
            F f10 = this.f20479f;
            AbstractC4862t.b(f10);
            LinkedHashSet linkedHashSetM = f10.h().m();
            AbstractC4862t.d(linkedHashSetM, "getCameras(...)");
            Iterator it = linkedHashSetM.iterator();
            while (it.hasNext()) {
                InterfaceC0815u interfaceC0815uB = ((J) it.next()).b();
                AbstractC4862t.d(interfaceC0815uB, "getCameraInfo(...)");
                arrayList.add(interfaceC0815uB);
            }
            return arrayList;
        } finally {
            AbstractC5712a.d();
        }
    }

    public final B r(C0817v c0817v, InterfaceC0815u interfaceC0815u) {
        Iterator it = c0817v.c().iterator();
        AbstractC4862t.d(it, "iterator(...)");
        B b10 = null;
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC4862t.d(next, "next(...)");
            InterfaceC0811s interfaceC0811s = (InterfaceC0811s) next;
            if (!AbstractC4862t.a(interfaceC0811s.a(), InterfaceC0811s.f3017a)) {
                D dA = AbstractC1119q0.a(interfaceC0811s.a());
                Context context = this.f20480g;
                AbstractC4862t.b(context);
                B b11 = dA.b(interfaceC0815u, context);
                if (b11 == null) {
                    continue;
                } else {
                    if (b10 != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    b10 = b11;
                }
            }
        }
        return b10 == null ? E.a() : b10;
    }

    public InterfaceC0815u s(C0817v cameraSelector) {
        Object c1092d;
        AbstractC4862t.e(cameraSelector, "cameraSelector");
        AbstractC5712a.b("CX:getCameraInfo");
        try {
            F f10 = this.f20479f;
            AbstractC4862t.b(f10);
            L.I i10 = cameraSelector.g(f10.h().m()).i();
            AbstractC4862t.d(i10, "getCameraInfoInternal(...)");
            B bR = r(cameraSelector, i10);
            C0813t.a aVar = C0813t.f3022c;
            String strD = i10.d();
            AbstractC4862t.d(strD, "getCameraId(...)");
            C0813t c0813tB = aVar.b(strD, null, bR.W());
            synchronized (this.f20474a) {
                try {
                    c1092d = this.f20481h.get(c0813tB);
                    if (c1092d == null) {
                        c1092d = new C1092d(i10, bR);
                        this.f20481h.put(c0813tB, c1092d);
                    }
                    C4015H c4015h = C4015H.f34254a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (C1092d) c1092d;
        } finally {
            AbstractC5712a.d();
        }
    }

    public final int t() {
        F f10 = this.f20479f;
        if (f10 == null) {
            return 0;
        }
        AbstractC4862t.b(f10);
        return f10.g().f().c();
    }

    public final G.b u() {
        return this.f20475b;
    }

    public final O7.e v(Context context, G g10) {
        AbstractC4862t.e(context, "context");
        synchronized (this.f20474a) {
            O7.e eVar = this.f20476c;
            if (eVar != null) {
                AbstractC4862t.c(eVar, "null cannot be cast to non-null type com.google.common.util.concurrent.ListenableFuture<java.lang.Void>");
                return eVar;
            }
            if (g10 != null) {
                p(g10);
            }
            final F f10 = new F(context, this.f20475b);
            A(f10.j());
            O.d dVarC = O.d.c(this.f20477d);
            final l lVar = new l() { // from class: a0.d
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return g.w(f10, (Void) obj);
                }
            };
            O.d dVarG = dVarC.g(new O.a() { // from class: a0.e
                @Override // O.a
                public final O7.e apply(Object obj) {
                    return g.x(lVar, obj);
                }
            }, N.a.a());
            AbstractC4862t.d(dVarG, "transformAsync(...)");
            this.f20476c = dVarG;
            n.j(dVarG, new b(f10, context), N.a.a());
            O7.e eVarS = n.s(dVarG);
            AbstractC4862t.d(eVarS, "nonCancellationPropagating(...)");
            return eVarS;
        }
    }

    public final void y(int i10) {
        F f10 = this.f20479f;
        if (f10 == null) {
            return;
        }
        AbstractC4862t.b(f10);
        f10.g().f().g(i10);
    }

    public final void z(G.b bVar) {
        this.f20475b = bVar;
    }
}
