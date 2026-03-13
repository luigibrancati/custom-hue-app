package q4;

import Rd.AbstractC2132i;
import Rd.AbstractC2152s0;
import Rd.I;
import Rd.M;
import Rd.N;
import Rd.U;
import Rd.U0;
import android.app.Application;
import android.content.Context;
import fc.AbstractC4036s;
import fc.C4015H;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;
import vc.p;
import x4.C6298c;
import y4.C6401e;
import z4.C6504c;

/* JADX INFO: renamed from: q4.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C5485a extends D4.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C0575a f43113t = new C0575a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C6298c f43114r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public C6504c f43115s;

    /* JADX INFO: renamed from: q4.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0575a {
        public /* synthetic */ C0575a(AbstractC4854k abstractC4854k) {
            this();
        }

        public C0575a() {
        }
    }

    /* JADX INFO: renamed from: q4.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f43116j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public Object f43117k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public /* synthetic */ Object f43118l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f43120n;

        public b(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f43118l = obj;
            this.f43120n |= Integer.MIN_VALUE;
            return C5485a.K(C5485a.this, null, this);
        }
    }

    /* JADX INFO: renamed from: q4.a$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends C6298c {
        public c() {
        }

        @Override // x4.C6298c
        public void l(String deviceId) {
            AbstractC4862t.e(deviceId, "deviceId");
            C5485a.this.C(deviceId);
        }
    }

    /* JADX INFO: renamed from: q4.a$d */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends Thread {
        public d() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            F4.h hVarX = C5485a.this.x();
            AbstractC4862t.c(hVarX, "null cannot be cast to non-null type com.amplitude.android.Timeline");
            ((C5496l) hVarX).F();
        }
    }

    /* JADX INFO: renamed from: q4.a$e */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f43123j;

        public e(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return C5485a.this.new e(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f43123j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                U uZ = C5485a.this.z();
                this.f43123j = 1;
                if (uZ.i(this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            C6298c c6298c = null;
            C5485a.this.o().c().a().b(null).commit();
            C6298c c6298c2 = C5485a.this.f43114r;
            if (c6298c2 == null) {
                AbstractC4862t.p("androidContextPlugin");
            } else {
                c6298c = c6298c2;
            }
            D4.b bVarL = C5485a.this.l();
            AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
            c6298c.k((C5488d) bVarL);
            return C4015H.f34254a;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C5485a(C5488d c5488d, D4.e eVar, M m10, I i10, I i11, I i12, int i13, AbstractC4854k abstractC4854k) {
        M mA = (i13 & 4) != 0 ? N.a(U0.b(null, 1, null)) : m10;
        if ((i13 & 8) != 0) {
            ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
            AbstractC4862t.d(executorServiceNewCachedThreadPool, "newCachedThreadPool(...)");
            i10 = AbstractC2152s0.c(executorServiceNewCachedThreadPool);
        }
        I i14 = i10;
        if ((i13 & 16) != 0) {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            AbstractC4862t.d(executorServiceNewSingleThreadExecutor, "newSingleThreadExecutor(...)");
            i11 = AbstractC2152s0.c(executorServiceNewSingleThreadExecutor);
        }
        I i15 = i11;
        if ((i13 & 32) != 0) {
            ExecutorService executorServiceNewSingleThreadExecutor2 = Executors.newSingleThreadExecutor();
            AbstractC4862t.d(executorServiceNewSingleThreadExecutor2, "newSingleThreadExecutor(...)");
            i12 = AbstractC2152s0.c(executorServiceNewSingleThreadExecutor2);
        }
        this(c5488d, eVar, mA, i14, i15, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static /* synthetic */ java.lang.Object K(q4.C5485a r4, M4.f r5, lc.InterfaceC4988e r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof q4.C5485a.b
            if (r0 == 0) goto L13
            r0 = r6
            q4.a$b r0 = (q4.C5485a.b) r0
            int r1 = r0.f43120n
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f43120n = r1
            goto L18
        L13:
            q4.a$b r0 = new q4.a$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f43118l
            java.lang.Object r1 = mc.C5046c.f()
            int r2 = r0.f43120n
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.f43117k
            r5 = r4
            M4.f r5 = (M4.f) r5
            java.lang.Object r4 = r0.f43116j
            q4.a r4 = (q4.C5485a) r4
            fc.AbstractC4036s.b(r6)
            goto L4f
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            fc.AbstractC4036s.b(r6)
            w4.f r6 = new w4.f
            r6.<init>(r4)
            r0.f43116j = r4
            r0.f43117k = r5
            r0.f43120n = r3
            java.lang.Object r6 = r6.a(r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            r4.g(r5)
            D4.b r5 = r4.l()
            java.lang.Boolean r5 = r5.o()
            x4.e$a r6 = x4.C6300e.f47464d
            java.lang.Void r6 = r6.a()
            boolean r5 = kotlin.jvm.internal.AbstractC4862t.a(r5, r6)
            if (r5 != 0) goto L6e
            x4.e r5 = new x4.e
            r5.<init>()
            r4.c(r5)
        L6e:
            q4.a$c r5 = new q4.a$c
            r5.<init>()
            r4.f43114r = r5
            r4.c(r5)
            H4.b r5 = new H4.b
            r5.<init>()
            r4.c(r5)
            x4.d r5 = new x4.d
            z4.c r6 = r4.f43115s
            if (r6 != 0) goto L8c
            java.lang.String r6 = "activityLifecycleCallbacks"
            kotlin.jvm.internal.AbstractC4862t.p(r6)
            r6 = 0
        L8c:
            r5.<init>(r6)
            r4.c(r5)
            x4.a r5 = new x4.a
            r5.<init>()
            r4.c(r5)
            x4.b r5 = new x4.b
            r5.<init>()
            r4.c(r5)
            H4.a r5 = new H4.a
            r5.<init>()
            r4.c(r5)
            F4.h r4 = r4.x()
            java.lang.String r5 = "null cannot be cast to non-null type com.amplitude.android.Timeline"
            kotlin.jvm.internal.AbstractC4862t.c(r4, r5)
            q4.l r4 = (q4.C5496l) r4
            r4.C()
            fc.H r4 = fc.C4015H.f34254a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q4.C5485a.K(q4.a, M4.f, lc.e):java.lang.Object");
    }

    @Override // D4.a
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C5496l h() {
        C5496l c5496l = new C5496l(l().u());
        c5496l.g(this);
        return c5496l;
    }

    public final long M() {
        F4.h hVarX = x();
        AbstractC4862t.c(hVarX, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        return ((C5496l) hVarX).r();
    }

    public final void N(long j10) {
        F4.h hVarX = x();
        AbstractC4862t.c(hVarX, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        ((C5496l) hVarX).u(j10);
    }

    public final void O(long j10) {
        F4.h hVarX = x();
        AbstractC4862t.c(hVarX, "null cannot be cast to non-null type com.amplitude.android.Timeline");
        ((C5496l) hVarX).v(j10);
    }

    public final void P() {
        Runtime.getRuntime().addShutdownHook(new d());
    }

    public C5485a Q() {
        D(null);
        AbstractC2132i.d(k(), j(), null, new e(null), 2, null);
        return this;
    }

    @Override // D4.a
    public U d() {
        this.f43115s = new C6504c();
        return super.d();
    }

    @Override // D4.a
    public Object e(M4.f fVar, InterfaceC4988e interfaceC4988e) {
        return K(this, fVar, interfaceC4988e);
    }

    @Override // D4.a
    public M4.f f() {
        D4.b bVarL = l();
        AbstractC4862t.c(bVarL, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        C5488d c5488d = (C5488d) bVarL;
        String strL = c5488d.l();
        String strB = c5488d.b();
        M4.l lVarJ = c5488d.j();
        C6401e c6401e = C6401e.f48404a;
        return new M4.f(strL, strB, null, lVarJ, c6401e.e(c5488d), c6401e.f(), c5488d.m().a(this), 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5485a(C5488d configuration, D4.e state, M amplitudeScope, I amplitudeDispatcher, I networkIODispatcher, I storageIODispatcher) {
        super(configuration, state, amplitudeScope, amplitudeDispatcher, networkIODispatcher, storageIODispatcher);
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(state, "state");
        AbstractC4862t.e(amplitudeScope, "amplitudeScope");
        AbstractC4862t.e(amplitudeDispatcher, "amplitudeDispatcher");
        AbstractC4862t.e(networkIODispatcher, "networkIODispatcher");
        AbstractC4862t.e(storageIODispatcher, "storageIODispatcher");
        P();
        Set setB = configuration.B();
        if (setB == null || !setB.isEmpty()) {
            Iterator it = setB.iterator();
            while (it.hasNext()) {
                if (EnumC5486b.Companion.a().contains((EnumC5486b) it.next())) {
                    Context contextC = configuration.C();
                    AbstractC4862t.c(contextC, "null cannot be cast to non-null type android.app.Application");
                    Application application = (Application) contextC;
                    C6504c c6504c = this.f43115s;
                    if (c6504c == null) {
                        AbstractC4862t.p("activityLifecycleCallbacks");
                        c6504c = null;
                    }
                    application.registerActivityLifecycleCallbacks(c6504c);
                    return;
                }
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C5485a(C5488d configuration) {
        this(configuration, new D4.e(), null, null, null, null, 60, null);
        AbstractC4862t.e(configuration, "configuration");
    }
}
