package p9;

import Rd.AbstractC2132i;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import android.util.Log;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.AbstractC5160d;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U implements T {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s9.j f42374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N f42375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K f42376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final X f42377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4099i f42378f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC5446w f42379g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4992i f42380h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SessionData f42381i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f42382j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f42383k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f42384l;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f42385j;

        /* JADX INFO: renamed from: p9.U$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0562a extends nc.m implements vc.q {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f42387j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f42388k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public /* synthetic */ Object f42389l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public final /* synthetic */ U f42390m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0562a(U u10, InterfaceC4988e interfaceC4988e) {
                super(3, interfaceC4988e);
                this.f42390m = u10;
            }

            @Override // vc.q
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2314f interfaceC2314f, Throwable th, InterfaceC4988e interfaceC4988e) {
                C0562a c0562a = new C0562a(this.f42390m, interfaceC4988e);
                c0562a.f42388k = interfaceC2314f;
                c0562a.f42389l = th;
                return c0562a.invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f42387j;
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    InterfaceC2314f interfaceC2314f = (InterfaceC2314f) this.f42388k;
                    Throwable th = (Throwable) this.f42389l;
                    SessionData sessionData = new SessionData(this.f42390m.f42375c.a(null), (Time) null, (Map) null, 4, (AbstractC4854k) null);
                    Log.d("FirebaseSessions", "Init session datastore failed with exception message: " + th.getMessage() + ". Emit fallback session " + sessionData.getSessionDetails().getSessionId());
                    this.f42388k = null;
                    this.f42387j = 1;
                    if (interfaceC2314f.emit(sessionData, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                return C4015H.f34254a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements InterfaceC2314f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ U f42391a;

            public b(U u10) {
                this.f42391a = u10;
            }

            @Override // Ud.InterfaceC2314f
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionData sessionData, InterfaceC4988e interfaceC4988e) throws Throwable {
                this.f42391a.r(sessionData);
                Object objQ = this.f42391a.q(sessionData.getSessionDetails().getSessionId(), b.GENERAL, interfaceC4988e);
                return objQ == C5046c.f() ? objQ : C4015H.f34254a;
            }
        }

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return U.this.new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f42385j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e interfaceC2313eF = AbstractC2315g.f(U.this.f42378f.getData(), new C0562a(U.this, null));
                b bVar = new b(U.this);
                this.f42385j = 1;
                if (interfaceC2313eF.collect(bVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;
        public static final b GENERAL = new b("GENERAL", 0);
        public static final b FALLBACK = new b("FALLBACK", 1);

        static {
            b[] bVarArrA = a();
            $VALUES = bVarArrA;
            $ENTRIES = AbstractC5277b.a(bVarArrA);
        }

        public b(String str, int i10) {
        }

        public static final /* synthetic */ b[] a() {
            return new b[]{GENERAL, FALLBACK};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f42392a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.GENERAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.FALLBACK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f42392a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f42393j;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f42395j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f42396k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ U f42397l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(U u10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f42397l = u10;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, InterfaceC4988e interfaceC4988e) {
                return ((a) create(sessionData, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f42397l, interfaceC4988e);
                aVar.f42396k = obj;
                return aVar;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f42395j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return SessionData.c((SessionData) this.f42396k, null, this.f42397l.f42377e.a(), null, 5, null);
            }
        }

        public d(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return U.this.new d(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((d) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r6v10 */
        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f42393j;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    InterfaceC4099i interfaceC4099i = U.this.f42378f;
                    a aVar = new a(U.this, null);
                    this.f42393j = 1;
                    Object objA = interfaceC4099i.a(aVar, this);
                    this = objA;
                    if (objA == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    this = this;
                }
            } catch (Exception e10) {
                Log.d("FirebaseSessions", "App backgrounded, failed to update data. Message: " + e10.getMessage());
                U u10 = U.this;
                u10.r(SessionData.c(u10.m(), null, U.this.f42377e.a(), null, 5, null));
            }
            return C4015H.f34254a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f42398j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ SessionData f42400l;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f42401j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public /* synthetic */ Object f42402k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public final /* synthetic */ U f42403l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(U u10, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f42403l = u10;
            }

            @Override // vc.p
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(SessionData sessionData, InterfaceC4988e interfaceC4988e) {
                return ((a) create(sessionData, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                a aVar = new a(this.f42403l, interfaceC4988e);
                aVar.f42402k = obj;
                return aVar;
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                C5046c.f();
                if (this.f42401j != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                SessionData sessionData = (SessionData) this.f42402k;
                boolean zP = this.f42403l.p(sessionData);
                boolean zN = this.f42403l.n(sessionData);
                boolean zO = this.f42403l.o(sessionData);
                Map mapF = zN ? this.f42403l.f42379g.f() : zO ? this.f42403l.f42379g.c(sessionData.getProcessDataMap()) : sessionData.getProcessDataMap();
                SessionDetails sessionDetails = zN ? null : sessionData.getSessionDetails();
                if (!zP && !zN) {
                    return zO ? SessionData.c(sessionData, null, null, this.f42403l.f42379g.c(mapF), 3, null) : sessionData;
                }
                SessionDetails sessionDetailsA = this.f42403l.f42375c.a(sessionDetails);
                this.f42403l.f42376d.a(sessionDetailsA);
                this.f42403l.f42379g.d();
                return sessionData.b(sessionDetailsA, null, mapF);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SessionData sessionData, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f42400l = sessionData;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return U.this.new e(this.f42400l, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        
            if (r9 == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
        
            if (r10.q(r0, r3, r9) == r1) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0099, code lost:
        
            return r1;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r9v8 */
        @Override // nc.AbstractC5157a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r1 = mc.C5046c.f()
                int r0 = r9.f42398j
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L23
                if (r0 == r3) goto L1b
                if (r0 != r2) goto L13
                fc.AbstractC4036s.b(r10)
                goto L9a
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L1b:
                fc.AbstractC4036s.b(r10)     // Catch: java.lang.Exception -> L20
                goto L9a
            L20:
                r0 = move-exception
                r10 = r0
                goto L3d
            L23:
                fc.AbstractC4036s.b(r10)
                p9.U r10 = p9.U.this     // Catch: java.lang.Exception -> L20
                g1.i r10 = p9.U.e(r10)     // Catch: java.lang.Exception -> L20
                p9.U$e$a r0 = new p9.U$e$a     // Catch: java.lang.Exception -> L20
                p9.U r4 = p9.U.this     // Catch: java.lang.Exception -> L20
                r5 = 0
                r0.<init>(r4, r5)     // Catch: java.lang.Exception -> L20
                r9.f42398j = r3     // Catch: java.lang.Exception -> L20
                java.lang.Object r9 = r10.a(r0, r9)     // Catch: java.lang.Exception -> L20
                if (r9 != r1) goto L9a
                goto L99
            L3d:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r3 = "App foregrounded, failed to update data. Message: "
                r0.append(r3)
                java.lang.String r10 = r10.getMessage()
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                java.lang.String r0 = "FirebaseSessions"
                android.util.Log.d(r0, r10)
                p9.U r10 = p9.U.this
                p9.E r0 = r9.f42400l
                boolean r10 = p9.U.k(r10, r0)
                if (r10 == 0) goto L9a
                p9.U r10 = p9.U.this
                p9.N r10 = p9.U.g(r10)
                p9.E r0 = r9.f42400l
                p9.H r0 = r0.getSessionDetails()
                p9.H r4 = r10.a(r0)
                p9.U r10 = p9.U.this
                p9.E r3 = r9.f42400l
                r7 = 4
                r8 = 0
                r5 = 0
                r6 = 0
                p9.E r0 = p9.SessionData.c(r3, r4, r5, r6, r7, r8)
                r10.r(r0)
                p9.U r10 = p9.U.this
                p9.K r10 = p9.U.f(r10)
                r10.a(r4)
                p9.U r10 = p9.U.this
                java.lang.String r0 = r4.getSessionId()
                p9.U$b r3 = p9.U.b.FALLBACK
                r9.f42398j = r2
                java.lang.Object r9 = p9.U.l(r10, r0, r3, r9)
                if (r9 != r1) goto L9a
            L99:
                return r1
            L9a:
                fc.H r9 = fc.C4015H.f34254a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p9.U.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class f extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f42404j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f42405k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f42406l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f42408n;

        public f(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f42406l = obj;
            this.f42408n |= Integer.MIN_VALUE;
            return U.this.q(null, null, this);
        }
    }

    public U(s9.j sessionsSettings, N sessionGenerator, K sessionFirelogPublisher, X timeProvider, InterfaceC4099i sessionDataStore, InterfaceC5446w processDataManager, InterfaceC4992i backgroundDispatcher) {
        AbstractC4862t.e(sessionsSettings, "sessionsSettings");
        AbstractC4862t.e(sessionGenerator, "sessionGenerator");
        AbstractC4862t.e(sessionFirelogPublisher, "sessionFirelogPublisher");
        AbstractC4862t.e(timeProvider, "timeProvider");
        AbstractC4862t.e(sessionDataStore, "sessionDataStore");
        AbstractC4862t.e(processDataManager, "processDataManager");
        AbstractC4862t.e(backgroundDispatcher, "backgroundDispatcher");
        this.f42374b = sessionsSettings;
        this.f42375c = sessionGenerator;
        this.f42376d = sessionFirelogPublisher;
        this.f42377e = timeProvider;
        this.f42378f = sessionDataStore;
        this.f42379g = processDataManager;
        this.f42380h = backgroundDispatcher;
        this.f42383k = b.GENERAL;
        this.f42384l = "";
        AbstractC2132i.d(Rd.N.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    @Override // p9.T
    public boolean a() {
        return this.f42382j;
    }

    @Override // p9.T
    public void b() {
        this.f42382j = false;
        if (this.f42381i == null) {
            Log.d("FirebaseSessions", "App backgrounded, but local SessionData not initialized");
            return;
        }
        Log.d("FirebaseSessions", "App backgrounded on " + this.f42379g.a());
        AbstractC2132i.d(Rd.N.a(this.f42380h), null, null, new d(null), 3, null);
    }

    @Override // p9.T
    public void c() {
        this.f42382j = true;
        if (this.f42381i == null) {
            Log.d("FirebaseSessions", "App foregrounded, but local SessionData not initialized");
            return;
        }
        SessionData sessionDataM = m();
        Log.d("FirebaseSessions", "App foregrounded on " + this.f42379g.a());
        if (p(sessionDataM) || o(sessionDataM)) {
            AbstractC2132i.d(Rd.N.a(this.f42380h), null, null, new e(sessionDataM, null), 3, null);
        }
    }

    public final SessionData m() {
        SessionData sessionData = this.f42381i;
        if (sessionData != null) {
            return sessionData;
        }
        AbstractC4862t.p("localSessionData");
        return null;
    }

    public final boolean n(SessionData sessionData) {
        Map processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data map");
            return true;
        }
        boolean zE = this.f42379g.e(processDataMap);
        if (zE) {
            Log.d("FirebaseSessions", "Cold app start detected");
        }
        return zE;
    }

    public final boolean o(SessionData sessionData) {
        Map processDataMap = sessionData.getProcessDataMap();
        if (processDataMap == null) {
            Log.d("FirebaseSessions", "No process data for " + this.f42379g.a());
            return true;
        }
        boolean zB = this.f42379g.b(processDataMap);
        if (zB) {
            Log.d("FirebaseSessions", "Process " + this.f42379g.a() + " is stale");
        }
        return zB;
    }

    public final boolean p(SessionData sessionData) {
        Time backgroundTime = sessionData.getBackgroundTime();
        if (backgroundTime == null) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " has not backgrounded yet");
            return false;
        }
        boolean z10 = Pd.a.u(this.f42377e.a().c(backgroundTime), this.f42374b.b()) > 0;
        if (z10) {
            Log.d("FirebaseSessions", "Session " + sessionData.getSessionDetails().getSessionId() + " is expired");
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(java.lang.String r5, p9.U.b r6, lc.InterfaceC4988e r7) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p9.U.q(java.lang.String, p9.U$b, lc.e):java.lang.Object");
    }

    public final void r(SessionData sessionData) {
        AbstractC4862t.e(sessionData, "<set-?>");
        this.f42381i = sessionData;
    }
}
