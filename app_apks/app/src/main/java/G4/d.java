package G4;

import D4.f;
import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import fc.C4015H;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f4492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D4.a f4493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A4.a f4494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final D4.b f4495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final H4.a f4496e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AtomicBoolean f4497f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f4498g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f4499h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f4500i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final G4.c f4501j;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f4502j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f4503k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f4504l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f4506n;

        public a(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f4504l = obj;
            this.f4506n |= Integer.MIN_VALUE;
            return d.this.f(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f4507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f4508k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4510m;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f4508k = obj;
            this.f4510m |= Integer.MIN_VALUE;
            return d.this.m(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f4511j;

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return d.this.new c(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        
            if (r7.o(r6) == r0) goto L17;
         */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = mc.C5046c.f()
                int r1 = r6.f4511j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                fc.AbstractC4036s.b(r7)
                goto L54
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L1a:
                fc.AbstractC4036s.b(r7)
                goto L49
            L1e:
                fc.AbstractC4036s.b(r7)
                G4.d r7 = G4.d.this
                java.util.concurrent.atomic.AtomicBoolean r7 = G4.d.b(r7)
                boolean r7 = r7.get()
                if (r7 != 0) goto L5e
                G4.d r7 = G4.d.this
                java.util.concurrent.atomic.AtomicBoolean r7 = G4.d.b(r7)
                r7.getAndSet(r3)
                G4.d r7 = G4.d.this
                D4.b r7 = G4.d.a(r7)
                long r4 = r7.h()
                r6.f4511j = r3
                java.lang.Object r7 = Rd.X.a(r4, r6)
                if (r7 != r0) goto L49
                goto L53
            L49:
                G4.d r7 = G4.d.this
                r6.f4511j = r2
                java.lang.Object r7 = r7.o(r6)
                if (r7 != r0) goto L54
            L53:
                return r0
            L54:
                G4.d r6 = G4.d.this
                java.util.concurrent.atomic.AtomicBoolean r6 = G4.d.b(r6)
                r7 = 0
                r6.getAndSet(r7)
            L5e:
                fc.H r6 = fc.C4015H.f34254a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: G4.d.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: G4.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0073d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f4513j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f4514k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f4516m;

        public C0073d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f4514k = obj;
            this.f4516m |= Integer.MIN_VALUE;
            return d.this.o(this);
        }
    }

    public d(f storage, D4.a amplitude, A4.a logger, D4.b configuration, H4.a plugin) {
        AbstractC4862t.e(storage, "storage");
        AbstractC4862t.e(amplitude, "amplitude");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(plugin, "plugin");
        this.f4492a = storage;
        this.f4493b = amplitude;
        this.f4494c = logger;
        this.f4495d = configuration;
        this.f4496e = plugin;
        this.f4497f = new AtomicBoolean(false);
        this.f4500i = new AtomicBoolean(false);
        this.f4501j = G4.c.f4490a.a(storage, logger, amplitude);
    }

    public final Object d(InterfaceC4988e interfaceC4988e) {
        G4.c cVar = this.f4501j;
        AbstractC4862t.b(cVar);
        Object objA = cVar.a(interfaceC4988e);
        return objA == C5046c.f() ? objA : C4015H.f34254a;
    }

    public final Object e(InterfaceC4988e interfaceC4988e) {
        G4.c cVar = this.f4501j;
        AbstractC4862t.b(cVar);
        return cVar.b(interfaceC4988e);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0094, code lost:
    
        if (r9.m(r10, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(E4.a r10, lc.InterfaceC4988e r11) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.d.f(E4.a, lc.e):java.lang.Object");
    }

    public final boolean g(E4.a aVar, E4.e eVar) {
        Map mapI0 = aVar.I0();
        return mapI0 != null && mapI0.size() == 1 && mapI0.containsKey(eVar.b());
    }

    public final boolean h(E4.a aVar) {
        return g(aVar, E4.e.CLEAR_ALL);
    }

    public final boolean i(String str, String str2) {
        if (str == null && str2 == null) {
            return false;
        }
        return str == null || str2 == null || !AbstractC4862t.a(str, str2);
    }

    public final boolean j(E4.a aVar) {
        boolean z10;
        if (!this.f4500i.getAndSet(true)) {
            this.f4498g = aVar.N();
            this.f4499h = aVar.l();
            return true;
        }
        if (i(this.f4498g, aVar.N())) {
            this.f4498g = aVar.N();
            z10 = true;
        } else {
            z10 = false;
        }
        if (!i(this.f4499h, aVar.l())) {
            return z10;
        }
        this.f4499h = aVar.l();
        return true;
    }

    public final boolean k(E4.a aVar) {
        if (aVar.H0() == null) {
            return false;
        }
        Map mapH0 = aVar.H0();
        AbstractC4862t.b(mapH0);
        return !mapH0.isEmpty();
    }

    public final boolean l(E4.a aVar) {
        return g(aVar, E4.e.SET);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(E4.a r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof G4.d.b
            if (r0 == 0) goto L13
            r0 = r6
            G4.d$b r0 = (G4.d.b) r0
            int r1 = r0.f4510m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4510m = r1
            goto L18
        L13:
            G4.d$b r0 = new G4.d$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f4508k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f4510m
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f4507j
            G4.d r4 = (G4.d) r4
            fc.AbstractC4036s.b(r6)     // Catch: java.lang.Exception -> L2d
            goto L4e
        L2d:
            r5 = move-exception
            goto L47
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            fc.AbstractC4036s.b(r6)
            D4.f r6 = r4.f4492a     // Catch: java.lang.Exception -> L2d
            r0.f4507j = r4     // Catch: java.lang.Exception -> L2d
            r0.f4510m = r3     // Catch: java.lang.Exception -> L2d
            java.lang.Object r4 = r6.l(r5, r0)     // Catch: java.lang.Exception -> L2d
            if (r4 != r1) goto L4e
            return r1
        L47:
            A4.a r4 = r4.f4494c
            java.lang.String r6 = "Error when intercepting identifies"
            J4.q.a(r5, r4, r6)
        L4e:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.d.m(E4.a, lc.e):java.lang.Object");
    }

    public final InterfaceC2166z0 n() {
        return AbstractC2132i.d(this.f4493b.k(), this.f4493b.v(), null, new c(null), 2, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(lc.InterfaceC4988e r5) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r5 instanceof G4.d.C0073d
            if (r0 == 0) goto L13
            r0 = r5
            G4.d$d r0 = (G4.d.C0073d) r0
            int r1 = r0.f4516m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f4516m = r1
            goto L18
        L13:
            G4.d$d r0 = new G4.d$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f4514k
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f4516m
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f4513j
            G4.d r4 = (G4.d) r4
            fc.AbstractC4036s.b(r5)
            goto L43
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            fc.AbstractC4036s.b(r5)
            r0.f4513j = r4
            r0.f4516m = r3
            java.lang.Object r5 = r4.e(r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            E4.a r5 = (E4.a) r5
            if (r5 == 0) goto L4c
            H4.a r4 = r4.f4496e
            r4.n(r5)
        L4c:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: G4.d.o(lc.e):java.lang.Object");
    }
}
