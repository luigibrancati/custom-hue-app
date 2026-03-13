package J3;

import I3.AbstractC0889t;
import I3.AbstractC0890u;
import I3.InterfaceC0872b;
import I3.InterfaceC0881k;
import I3.L;
import J3.m0;
import Q3.C1877w;
import Q3.InterfaceC1857b;
import Q3.q0;
import Rd.AbstractC2128g;
import Rd.D0;
import Rd.InterfaceC2163y;
import android.content.Context;
import androidx.work.WorkerParameters;
import androidx.work.c;
import androidx.work.impl.WorkDatabase;
import fc.AbstractC4036s;
import fc.C4015H;
import fc.C4032o;
import gc.C4179C;
import gc.C4206t;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5160d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q3.I f6022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f6023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f6024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WorkerParameters.a f6025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.work.c f6026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final S3.b f6027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.work.a f6028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC0872b f6029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final P3.a f6030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final WorkDatabase f6031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Q3.J f6032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final InterfaceC1857b f6033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f6034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f6035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC2163y f6036o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final androidx.work.a f6037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final S3.b f6038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final P3.a f6039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final WorkDatabase f6040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Q3.I f6041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f6042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Context f6043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public androidx.work.c f6044h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public WorkerParameters.a f6045i;

        public a(Context context, androidx.work.a configuration, S3.b workTaskExecutor, P3.a foregroundProcessor, WorkDatabase workDatabase, Q3.I workSpec, List tags) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(configuration, "configuration");
            AbstractC4862t.e(workTaskExecutor, "workTaskExecutor");
            AbstractC4862t.e(foregroundProcessor, "foregroundProcessor");
            AbstractC4862t.e(workDatabase, "workDatabase");
            AbstractC4862t.e(workSpec, "workSpec");
            AbstractC4862t.e(tags, "tags");
            this.f6037a = configuration;
            this.f6038b = workTaskExecutor;
            this.f6039c = foregroundProcessor;
            this.f6040d = workDatabase;
            this.f6041e = workSpec;
            this.f6042f = tags;
            Context applicationContext = context.getApplicationContext();
            AbstractC4862t.d(applicationContext, "getApplicationContext(...)");
            this.f6043g = applicationContext;
            this.f6045i = new WorkerParameters.a();
        }

        public final m0 a() {
            return new m0(this);
        }

        public final Context b() {
            return this.f6043g;
        }

        public final androidx.work.a c() {
            return this.f6037a;
        }

        public final P3.a d() {
            return this.f6039c;
        }

        public final WorkerParameters.a e() {
            return this.f6045i;
        }

        public final List f() {
            return this.f6042f;
        }

        public final WorkDatabase g() {
            return this.f6040d;
        }

        public final Q3.I h() {
            return this.f6041e;
        }

        public final S3.b i() {
            return this.f6038b;
        }

        public final androidx.work.c j() {
            return this.f6044h;
        }

        public final a k(WorkerParameters.a aVar) {
            if (aVar != null) {
                this.f6045i = aVar;
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c.a f6046a;

            public a() {
                this(null, 1, 0 == true ? 1 : 0);
            }

            public final c.a a() {
                return this.f6046a;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c.a result) {
                super(null);
                AbstractC4862t.e(result, "result");
                this.f6046a = result;
            }

            public /* synthetic */ a(c.a aVar, int i10, AbstractC4854k abstractC4854k) {
                this((i10 & 1) != 0 ? new c.a.C0320a() : aVar);
            }
        }

        /* JADX INFO: renamed from: J3.m0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0101b extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final c.a f6047a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0101b(c.a result) {
                super(null);
                AbstractC4862t.e(result, "result");
                this.f6047a = result;
            }

            public final c.a a() {
                return this.f6047a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class c extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6048a;

            public c() {
                this(0, 1, null);
            }

            public final int a() {
                return this.f6048a;
            }

            public c(int i10) {
                super(null);
                this.f6048a = i10;
            }

            public /* synthetic */ c(int i10, int i11, AbstractC4854k abstractC4854k) {
                this((i11 & 1) != 0 ? -256 : i10);
            }
        }

        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6049j;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends nc.m implements vc.p {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public int f6051j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public final /* synthetic */ m0 f6052k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m0 m0Var, InterfaceC4988e interfaceC4988e) {
                super(2, interfaceC4988e);
                this.f6052k = m0Var;
            }

            @Override // nc.AbstractC5157a
            public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
                return new a(this.f6052k, interfaceC4988e);
            }

            @Override // vc.p
            public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
                return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
            }

            @Override // nc.AbstractC5157a
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = C5046c.f();
                int i10 = this.f6051j;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                    return obj;
                }
                AbstractC4036s.b(obj);
                m0 m0Var = this.f6052k;
                this.f6051j = 1;
                Object objV = m0Var.v(this);
                return objV == objF ? objF : objV;
            }
        }

        public c(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        public static final Boolean f(b bVar, m0 m0Var) {
            boolean zU;
            if (bVar instanceof b.C0101b) {
                zU = m0Var.r(((b.C0101b) bVar).a());
            } else if (bVar instanceof b.a) {
                m0Var.y(((b.a) bVar).a());
                zU = false;
            } else {
                if (!(bVar instanceof b.c)) {
                    throw new C4032o();
                }
                zU = m0Var.u(((b.c) bVar).a());
            }
            return Boolean.valueOf(zU);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return m0.this.new c(interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((c) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            final b aVar;
            Object objF = C5046c.f();
            int i10 = this.f6049j;
            int i11 = 1;
            c.a aVar2 = null;
            byte b10 = 0;
            byte b11 = 0;
            byte b12 = 0;
            try {
                if (i10 == 0) {
                    AbstractC4036s.b(obj);
                    InterfaceC2163y interfaceC2163y = m0.this.f6036o;
                    a aVar3 = new a(m0.this, null);
                    this.f6049j = 1;
                    obj = AbstractC2128g.g(interfaceC2163y, aVar3, this);
                    if (obj == objF) {
                        return objF;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4036s.b(obj);
                }
                aVar = (b) obj;
            } catch (i0 e10) {
                aVar = new b.c(e10.a());
            } catch (CancellationException unused) {
                aVar = new b.a(aVar2, i11, b12 == true ? 1 : 0);
            } catch (Throwable th) {
                AbstractC0890u.e().d(o0.f6065a, "Unexpected error in WorkerWrapper", th);
                aVar = new b.a(b11 == true ? 1 : 0, i11, b10 == true ? 1 : 0);
            }
            WorkDatabase workDatabase = m0.this.f6031j;
            final m0 m0Var = m0.this;
            Object objN = workDatabase.N(new Callable() { // from class: J3.n0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return m0.c.f(aVar, m0Var);
                }
            });
            AbstractC4862t.d(objN, "runInTransaction(...)");
            return objN;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d extends AbstractC5160d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f6053j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f6054k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f6056m;

        public d(InterfaceC4988e interfaceC4988e) {
            super(interfaceC4988e);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) {
            this.f6054k = obj;
            this.f6056m |= Integer.MIN_VALUE;
            return m0.this.v(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f6057j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.work.c f6059l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC0881k f6060m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.work.c cVar, InterfaceC0881k interfaceC0881k, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f6059l = cVar;
            this.f6060m = interfaceC0881k;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return m0.this.new e(this.f6059l, this.f6060m, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(Rd.M m10, InterfaceC4988e interfaceC4988e) {
            return ((e) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            e eVar;
            Object objF = C5046c.f();
            int i10 = this.f6057j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Context context = m0.this.f6023b;
                Q3.I iM = m0.this.m();
                androidx.work.c cVar = this.f6059l;
                InterfaceC0881k interfaceC0881k = this.f6060m;
                S3.b bVar = m0.this.f6027f;
                this.f6057j = 1;
                eVar = this;
                if (R3.B.a(context, iM, cVar, interfaceC0881k, bVar, eVar) != objF) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            eVar = this;
            String str = o0.f6065a;
            m0 m0Var = m0.this;
            AbstractC0890u.e().a(str, "Starting work for " + m0Var.m().f13590c);
            O7.e eVarI = eVar.f6059l.I();
            AbstractC4862t.d(eVarI, "startWork(...)");
            androidx.work.c cVar2 = eVar.f6059l;
            eVar.f6057j = 2;
            Object objD = o0.d(eVarI, cVar2, eVar);
            return objD == objF ? objF : objD;
        }
    }

    public m0(a builder) {
        AbstractC4862t.e(builder, "builder");
        Q3.I iH = builder.h();
        this.f6022a = iH;
        this.f6023b = builder.b();
        this.f6024c = iH.f13588a;
        this.f6025d = builder.e();
        this.f6026e = builder.j();
        this.f6027f = builder.i();
        androidx.work.a aVarC = builder.c();
        this.f6028g = aVarC;
        this.f6029h = aVarC.a();
        this.f6030i = builder.d();
        WorkDatabase workDatabaseG = builder.g();
        this.f6031j = workDatabaseG;
        this.f6032k = workDatabaseG.W();
        this.f6033l = workDatabaseG.R();
        List listF = builder.f();
        this.f6034m = listF;
        this.f6035n = k(listF);
        this.f6036o = D0.b(null, 1, null);
    }

    public static final Boolean B(m0 m0Var) {
        boolean z10;
        if (m0Var.f6032k.h(m0Var.f6024c) == L.c.ENQUEUED) {
            m0Var.f6032k.b(L.c.RUNNING, m0Var.f6024c);
            m0Var.f6032k.z(m0Var.f6024c);
            m0Var.f6032k.e(m0Var.f6024c, -256);
            z10 = true;
        } else {
            z10 = false;
        }
        return Boolean.valueOf(z10);
    }

    public static final Boolean w(m0 m0Var) {
        Q3.I i10 = m0Var.f6022a;
        if (i10.f13589b != L.c.ENQUEUED) {
            String str = o0.f6065a;
            AbstractC0890u.e().a(str, m0Var.f6022a.f13590c + " is not in ENQUEUED state. Nothing more to do");
            return Boolean.TRUE;
        }
        if ((!i10.o() && !m0Var.f6022a.n()) || m0Var.f6029h.a() >= m0Var.f6022a.c()) {
            return Boolean.FALSE;
        }
        AbstractC0890u.e().a(o0.f6065a, "Delaying execution for " + m0Var.f6022a.f13590c + " because it is being executed before schedule.");
        return Boolean.TRUE;
    }

    public static final C4015H x(androidx.work.c cVar, boolean z10, String str, m0 m0Var, Throwable th) {
        if (th instanceof i0) {
            cVar.J(((i0) th).a());
        }
        if (z10 && str != null) {
            m0Var.f6028g.n().b(str, m0Var.f6022a.hashCode());
        }
        return C4015H.f34254a;
    }

    public final boolean A() {
        Object objN = this.f6031j.N(new Callable() { // from class: J3.l0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return m0.B(this.f6020a);
            }
        });
        AbstractC4862t.d(objN, "runInTransaction(...)");
        return ((Boolean) objN).booleanValue();
    }

    public final String k(List list) {
        return "Work [ id=" + this.f6024c + ", tags={ " + C4179C.q0(list, ",", null, null, 0, null, null, 62, null) + " } ]";
    }

    public final C1877w l() {
        return q0.a(this.f6022a);
    }

    public final Q3.I m() {
        return this.f6022a;
    }

    public final boolean n(c.a aVar) {
        if (aVar instanceof c.a.C0321c) {
            String str = o0.f6065a;
            AbstractC0890u.e().f(str, "Worker result SUCCESS for " + this.f6035n);
            return this.f6022a.o() ? t() : z(aVar);
        }
        if (aVar instanceof c.a.b) {
            String str2 = o0.f6065a;
            AbstractC0890u.e().f(str2, "Worker result RETRY for " + this.f6035n);
            return s(-256);
        }
        String str3 = o0.f6065a;
        AbstractC0890u.e().f(str3, "Worker result FAILURE for " + this.f6035n);
        if (this.f6022a.o()) {
            return t();
        }
        if (aVar == null) {
            aVar = new c.a.C0320a();
        }
        return y(aVar);
    }

    public final void o(int i10) {
        this.f6036o.a(new i0(i10));
    }

    public final void p(String str) {
        List listQ = C4206t.q(str);
        while (!listQ.isEmpty()) {
            String str2 = (String) gc.y.K(listQ);
            if (this.f6032k.h(str2) != L.c.CANCELLED) {
                this.f6032k.b(L.c.FAILED, str2);
            }
            listQ.addAll(this.f6033l.a(str2));
        }
    }

    public final O7.e q() {
        return AbstractC0889t.k(this.f6027f.b().plus(D0.b(null, 1, null)), null, new c(null), 2, null);
    }

    public final boolean r(c.a aVar) {
        L.c cVarH = this.f6032k.h(this.f6024c);
        this.f6031j.V().a(this.f6024c);
        if (cVarH == null) {
            return false;
        }
        if (cVarH == L.c.RUNNING) {
            return n(aVar);
        }
        if (cVarH.b()) {
            return false;
        }
        return s(-512);
    }

    public final boolean s(int i10) {
        this.f6032k.b(L.c.ENQUEUED, this.f6024c);
        this.f6032k.t(this.f6024c, this.f6029h.a());
        this.f6032k.B(this.f6024c, this.f6022a.i());
        this.f6032k.o(this.f6024c, -1L);
        this.f6032k.e(this.f6024c, i10);
        return true;
    }

    public final boolean t() {
        this.f6032k.t(this.f6024c, this.f6029h.a());
        this.f6032k.b(L.c.ENQUEUED, this.f6024c);
        this.f6032k.x(this.f6024c);
        this.f6032k.B(this.f6024c, this.f6022a.i());
        this.f6032k.c(this.f6024c);
        this.f6032k.o(this.f6024c, -1L);
        return false;
    }

    public final boolean u(int i10) {
        if (AbstractC4862t.a(this.f6022a.f(), Boolean.TRUE)) {
            String str = o0.f6065a;
            AbstractC0890u.e().a(str, "Worker " + this.f6022a.f13590c + " was interrupted. Backing off.");
            s(i10);
            return true;
        }
        L.c cVarH = this.f6032k.h(this.f6024c);
        if (cVarH == null || cVarH.b()) {
            String str2 = o0.f6065a;
            AbstractC0890u.e().a(str2, "Status for " + this.f6024c + " is " + cVarH + " ; not doing any work");
            return false;
        }
        String str3 = o0.f6065a;
        AbstractC0890u.e().a(str3, "Status for " + this.f6024c + " is " + cVarH + "; not doing any work and rescheduling for later execution");
        this.f6032k.b(L.c.ENQUEUED, this.f6024c);
        this.f6032k.e(this.f6024c, i10);
        this.f6032k.o(this.f6024c, -1L);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object v(lc.InterfaceC4988e r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J3.m0.v(lc.e):java.lang.Object");
    }

    public final boolean y(c.a result) {
        AbstractC4862t.e(result, "result");
        p(this.f6024c);
        androidx.work.b bVarC = ((c.a.C0320a) result).c();
        AbstractC4862t.d(bVarC, "getOutputData(...)");
        this.f6032k.B(this.f6024c, this.f6022a.i());
        this.f6032k.s(this.f6024c, bVarC);
        return false;
    }

    public final boolean z(c.a aVar) {
        this.f6032k.b(L.c.SUCCEEDED, this.f6024c);
        AbstractC4862t.c(aVar, "null cannot be cast to non-null type androidx.work.ListenableWorker.Result.Success");
        androidx.work.b bVarC = ((c.a.C0321c) aVar).c();
        AbstractC4862t.d(bVarC, "getOutputData(...)");
        this.f6032k.s(this.f6024c, bVarC);
        long jA = this.f6029h.a();
        for (String str : this.f6033l.a(this.f6024c)) {
            if (this.f6032k.h(str) == L.c.BLOCKED && this.f6033l.b(str)) {
                String str2 = o0.f6065a;
                AbstractC0890u.e().f(str2, "Setting status to enqueued for " + str);
                this.f6032k.b(L.c.ENQUEUED, str);
                this.f6032k.t(str, jA);
            }
        }
        return false;
    }
}
