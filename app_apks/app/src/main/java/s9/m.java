package s9;

import Rd.AbstractC2130h;
import Rd.AbstractC2132i;
import Rd.M;
import Rd.N;
import Ud.AbstractC2315g;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.InterfaceC4023f;
import g1.InterfaceC4099i;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.C4844a;
import kotlin.jvm.internal.InterfaceC4857n;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.AbstractC5160d;
import p9.X;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f44381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X f44382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4099i f44383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f44384d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44385j;

        /* JADX INFO: renamed from: s9.m$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public /* synthetic */ class C0595a implements InterfaceC2314f, InterfaceC4857n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AtomicReference f44387a;

            public C0595a(AtomicReference atomicReference) {
                this.f44387a = atomicReference;
            }

            @Override // kotlin.jvm.internal.InterfaceC4857n
            public final InterfaceC4023f a() {
                return new C4844a(2, this.f44387a, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            }

            @Override // Ud.InterfaceC2314f
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(SessionConfigs sessionConfigs, InterfaceC4988e interfaceC4988e) {
                Object objF = a.f(this.f44387a, sessionConfigs, interfaceC4988e);
                return objF == C5046c.f() ? objF : C4015H.f34254a;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2314f) && (obj instanceof InterfaceC4857n)) {
                    return AbstractC4862t.a(a(), ((InterfaceC4857n) obj).a());
                }
                return false;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        public static final /* synthetic */ Object f(AtomicReference atomicReference, SessionConfigs sessionConfigs, InterfaceC4988e interfaceC4988e) {
            atomicReference.set(sessionConfigs);
            return C4015H.f34254a;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return m.this.new a(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f44385j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e data = m.this.f44383c.getData();
                C0595a c0595a = new C0595a(m.this.f44384d);
                this.f44385j = 1;
                if (data.collect(c0595a, this) == objF) {
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
    public static final class b extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44388j;

        public b(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return m.this.new b(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((b) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f44388j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            InterfaceC2313e data = m.this.f44383c.getData();
            this.f44388j = 1;
            Object objQ = AbstractC2315g.q(data, this);
            return objQ == objF ? objF : objQ;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public /* synthetic */ Object f44390j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f44392l;

        public c(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f44390j = obj;
            this.f44392l |= Integer.MIN_VALUE;
            return m.this.e(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f44393j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ SessionConfigs f44394k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SessionConfigs sessionConfigs, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f44394k = sessionConfigs;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(SessionConfigs sessionConfigs, InterfaceC4988e interfaceC4988e) {
            return ((d) create(sessionConfigs, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new d(this.f44394k, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            C5046c.f();
            if (this.f44393j != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return this.f44394k;
        }
    }

    public m(InterfaceC4992i backgroundDispatcher, X timeProvider, InterfaceC4099i sessionConfigsDataStore) {
        AbstractC4862t.e(backgroundDispatcher, "backgroundDispatcher");
        AbstractC4862t.e(timeProvider, "timeProvider");
        AbstractC4862t.e(sessionConfigsDataStore, "sessionConfigsDataStore");
        this.f44381a = backgroundDispatcher;
        this.f44382b = timeProvider;
        this.f44383c = sessionConfigsDataStore;
        this.f44384d = new AtomicReference();
        AbstractC2132i.d(N.a(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    @Override // s9.l
    public Double a() {
        return h().getSessionSamplingRate();
    }

    @Override // s9.l
    public boolean b() {
        Long cacheUpdatedTimeSeconds = h().getCacheUpdatedTimeSeconds();
        Integer cacheDurationSeconds = h().getCacheDurationSeconds();
        return cacheUpdatedTimeSeconds == null || cacheDurationSeconds == null || this.f44382b.a().getSeconds() - cacheUpdatedTimeSeconds.longValue() >= ((long) cacheDurationSeconds.intValue());
    }

    @Override // s9.l
    public Boolean c() {
        return h().getSessionsEnabled();
    }

    @Override // s9.l
    public Integer d() {
        return h().getSessionTimeoutSeconds();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s9.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object e(s9.SessionConfigs r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof s9.m.c
            if (r0 == 0) goto L13
            r0 = r6
            s9.m$c r0 = (s9.m.c) r0
            int r1 = r0.f44392l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f44392l = r1
            goto L18
        L13:
            s9.m$c r0 = new s9.m$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f44390j
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f44392l
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            fc.AbstractC4036s.b(r6)     // Catch: java.io.IOException -> L45
            goto L5c
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            fc.AbstractC4036s.b(r6)
            g1.i r4 = r4.f44383c     // Catch: java.io.IOException -> L45
            s9.m$d r6 = new s9.m$d     // Catch: java.io.IOException -> L45
            r2 = 0
            r6.<init>(r5, r2)     // Catch: java.io.IOException -> L45
            r0.f44392l = r3     // Catch: java.io.IOException -> L45
            java.lang.Object r4 = r4.a(r6, r0)     // Catch: java.io.IOException -> L45
            if (r4 != r1) goto L5c
            return r1
        L45:
            r4 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Failed to update config values: "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r5 = "FirebaseSessions"
            android.util.Log.w(r5, r4)
        L5c:
            fc.H r4 = fc.C4015H.f34254a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: s9.m.e(s9.h, lc.e):java.lang.Object");
    }

    public final SessionConfigs h() {
        if (this.f44384d.get() == null) {
            T1.e.a(this.f44384d, null, AbstractC2130h.b(null, new b(null), 1, null));
        }
        Object obj = this.f44384d.get();
        AbstractC4862t.d(obj, "get(...)");
        return (SessionConfigs) obj;
    }
}
