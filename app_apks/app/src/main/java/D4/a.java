package D4;

import F4.h;
import M4.k;
import Rd.AbstractC2128g;
import Rd.AbstractC2132i;
import Rd.I;
import Rd.M;
import Rd.O;
import Rd.U;
import Ud.A;
import Ud.AbstractC2315g;
import Ud.C;
import Ud.v;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import gc.Q;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;
import nc.m;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;
import vc.q;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D4.b f2212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4.e f2213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f2214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I f2215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f2216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final I f2217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h f2218g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4028k f2219h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public D4.f f2220i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public k f2221j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC4028k f2222k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public M4.g f2223l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final U f2224m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final J4.c f2225n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC4028k f2226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f2227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final A f2228q;

    /* JADX INFO: renamed from: D4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0037a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2229j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ a f2231l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0037a(a aVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f2231l = aVar;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new C0037a(this.f2231l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((C0037a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f2229j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                a aVar = a.this;
                aVar.f2220i = aVar.l().i().a(this.f2231l, "amplitude-identify-intercept");
                M4.f fVarF = a.this.f();
                a aVar2 = a.this;
                aVar2.f2221j = aVar2.l().j().a(fVarF);
                a aVar3 = this.f2231l;
                this.f2229j = 1;
                if (aVar3.e(fVarF, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return AbstractC5158b.a(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2232j;

        /* JADX INFO: renamed from: D4.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0038a extends kotlin.jvm.internal.v implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0038a f2234a = new C0038a();

            public C0038a() {
                super(1);
            }

            public final void a(F4.f it) {
                AbstractC4862t.e(it, "it");
                F4.c cVar = it instanceof F4.c ? (F4.c) it : null;
                if (cVar != null) {
                    cVar.flush();
                }
            }

            @Override // vc.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((F4.f) obj);
                return C4015H.f34254a;
            }
        }

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f2232j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                U uZ = a.this.z();
                this.f2232j = 1;
                if (uZ.i(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            a.this.x().b(C0038a.f2234a);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public c() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final A4.a invoke() {
            return a.this.l().m().a(a.this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public d() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I4.a invoke() {
            return new I4.a(a.this.l().b(), a.this.l().t(), a.this.k(), a.this.s(), a.this.v(), a.this.u(), new K4.e(a.this.l(), a.this.r()), a.this.r());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2237j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f2239l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f2239l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new e(this.f2239l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f2237j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                U uZ = a.this.z();
                this.f2237j = 1;
                if (uZ.i(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            a.this.C(this.f2239l);
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f2240j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f2242l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f2242l = str;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return a.this.new f(this.f2242l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f2240j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                U uZ = a.this.z();
                this.f2240j = 1;
                obj = uZ.i(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                a.this.o().c().a().a(this.f2242l).commit();
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g extends kotlin.jvm.internal.v implements InterfaceC6082a {
        public g() {
            super(0);
        }

        @Override // vc.InterfaceC6082a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final D4.f invoke() {
            return D4.g.b(a.this.l().v(), a.this, null, 2, null);
        }
    }

    public a(D4.b configuration, D4.e store, M amplitudeScope, I amplitudeDispatcher, I networkIODispatcher, I storageIODispatcher) {
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(store, "store");
        AbstractC4862t.e(amplitudeScope, "amplitudeScope");
        AbstractC4862t.e(amplitudeDispatcher, "amplitudeDispatcher");
        AbstractC4862t.e(networkIODispatcher, "networkIODispatcher");
        AbstractC4862t.e(storageIODispatcher, "storageIODispatcher");
        this.f2212a = configuration;
        this.f2213b = store;
        this.f2214c = amplitudeScope;
        this.f2215d = amplitudeDispatcher;
        this.f2216e = networkIODispatcher;
        this.f2217f = storageIODispatcher;
        this.f2219h = C4029l.b(new g());
        this.f2222k = C4029l.b(new c());
        this.f2225n = new J4.c();
        this.f2226o = C4029l.b(new d());
        v vVarA = C.a(0, 1000, Td.a.DROP_OLDEST);
        this.f2227p = vVarA;
        this.f2228q = AbstractC2315g.a(vVarA);
        if (!configuration.y()) {
            throw new IllegalArgumentException("invalid configuration");
        }
        this.f2218g = h();
        U uD = d();
        this.f2224m = uD;
        uD.start();
    }

    public static /* synthetic */ a G(a aVar, E4.a aVar2, E4.b bVar, q qVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        if ((i10 & 4) != 0) {
            qVar = null;
        }
        return aVar.E(aVar2, bVar, qVar);
    }

    public static /* synthetic */ a H(a aVar, String str, Map map, E4.b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: track");
        }
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        return aVar.F(str, map, bVar);
    }

    public final void A(E4.a aVar) {
        if (this.f2212a.p()) {
            r().b("Skip event for opt out config.");
            return;
        }
        if (aVar.M() == null) {
            aVar.B0(Long.valueOf(System.currentTimeMillis()));
        }
        r().a("Logged event with type: " + aVar.F0());
        this.f2218g.f(aVar);
    }

    public final a B(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        AbstractC2132i.d(this.f2214c, this.f2215d, null, new e(deviceId, null), 2, null);
        return this;
    }

    public final void C(String deviceId) {
        AbstractC4862t.e(deviceId, "deviceId");
        o().c().a().b(deviceId).commit();
    }

    public final a D(String str) {
        AbstractC2132i.d(this.f2214c, this.f2215d, null, new f(str, null), 2, null);
        return this;
    }

    public final a E(E4.a event, E4.b bVar, q qVar) {
        AbstractC4862t.e(event, "event");
        if (bVar != null) {
            event.K0(bVar);
        }
        if (qVar != null) {
            event.U(qVar);
        }
        A(event);
        return this;
    }

    public final a F(String eventType, Map map, E4.b bVar) {
        AbstractC4862t.e(eventType, "eventType");
        E4.a aVar = new E4.a();
        aVar.M0(eventType);
        aVar.L0(map != null ? Q.w(map) : null);
        if (bVar != null) {
            aVar.K0(bVar);
        }
        A(aVar);
        return this;
    }

    public final a c(F4.f plugin) {
        AbstractC4862t.e(plugin, "plugin");
        if (plugin instanceof F4.e) {
            this.f2213b.a((F4.e) plugin, this);
            return this;
        }
        this.f2218g.a(plugin);
        return this;
    }

    public U d() {
        return AbstractC2128g.a(this.f2214c, this.f2215d, O.LAZY, new C0037a(this, null));
    }

    public abstract Object e(M4.f fVar, InterfaceC4988e interfaceC4988e);

    public abstract M4.f f();

    public final void g(M4.f identityConfiguration) {
        AbstractC4862t.e(identityConfiguration, "identityConfiguration");
        this.f2223l = M4.g.f9281c.a(identityConfiguration);
        J4.a aVar = new J4.a(this.f2213b);
        o().c().e(aVar);
        if (o().c().isInitialized()) {
            aVar.b(o().c().c(), M4.m.Initialized);
        }
    }

    public abstract h h();

    public final void i() {
        AbstractC2132i.d(this.f2214c, this.f2215d, null, new b(null), 2, null);
    }

    public final I j() {
        return this.f2215d;
    }

    public final M k() {
        return this.f2214c;
    }

    public final D4.b l() {
        return this.f2212a;
    }

    public final String m() {
        if (this.f2223l != null) {
            return o().c().c().a();
        }
        return null;
    }

    public final J4.c n() {
        return this.f2225n;
    }

    public final M4.g o() {
        M4.g gVar = this.f2223l;
        if (gVar != null) {
            return gVar;
        }
        AbstractC4862t.p("idContainer");
        return null;
    }

    public final D4.f p() {
        D4.f fVar = this.f2220i;
        if (fVar != null) {
            return fVar;
        }
        AbstractC4862t.p("identifyInterceptStorage");
        return null;
    }

    public final k q() {
        k kVar = this.f2221j;
        if (kVar != null) {
            return kVar;
        }
        AbstractC4862t.p("identityStorage");
        return null;
    }

    public final A4.a r() {
        return (A4.a) this.f2222k.getValue();
    }

    public final I s() {
        return this.f2216e;
    }

    public final A t() {
        return this.f2228q;
    }

    public final D4.f u() {
        return (D4.f) this.f2219h.getValue();
    }

    public final I v() {
        return this.f2217f;
    }

    public final D4.e w() {
        return this.f2213b;
    }

    public final h x() {
        return this.f2218g;
    }

    public final String y() {
        if (this.f2223l != null) {
            return o().c().c().b();
        }
        return null;
    }

    public final U z() {
        return this.f2224m;
    }
}
