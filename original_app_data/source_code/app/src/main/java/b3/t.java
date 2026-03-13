package b3;

import Rd.AbstractC2152s0;
import Rd.InterfaceC2166z0;
import Rd.M;
import Rd.N;
import Rd.U0;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.util.Log;
import c3.C2939a;
import e3.C3927a;
import f3.AbstractC3989b;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4033p;
import fc.C4034q;
import g3.C4132b;
import g3.C4138h;
import gc.C4179C;
import gc.C4206t;
import gc.C4207u;
import gc.P;
import gc.Q;
import gc.U;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import k3.InterfaceC4792b;
import k3.InterfaceC4793c;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import l3.InterfaceC4877c;
import l3.InterfaceC4878d;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import m3.C5017i;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;
import q.C5473c;
import uc.AbstractC6017a;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final c f25204m = new c(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M f25205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC4992i f25206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f25207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Executor f25208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public p f25209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.room.a f25210f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f25212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C4132b f25213i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2939a f25211g = new C2939a(new g(this));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadLocal f25214j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f25215k = new LinkedHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f25216l = true;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public InterfaceC4992i f25217A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public boolean f25218B;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cc.d f25219a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f25220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f25221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC6082a f25222d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List f25223e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public f f25224f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f25225g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Executor f25226h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Executor f25227i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public InterfaceC4878d.c f25228j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f25229k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public d f25230l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Intent f25231m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public long f25232n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public TimeUnit f25233o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final e f25234p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public Set f25235q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Set f25236r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final List f25237s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public boolean f25238t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public boolean f25239u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f25240v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f25241w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public File f25242x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public Callable f25243y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public InterfaceC4793c f25244z;

        public a(Context context, Class klass, String str) {
            AbstractC4862t.e(context, "context");
            AbstractC4862t.e(klass, "klass");
            this.f25223e = new ArrayList();
            this.f25225g = new ArrayList();
            this.f25230l = d.AUTOMATIC;
            this.f25232n = -1L;
            this.f25234p = new e();
            this.f25235q = new LinkedHashSet();
            this.f25236r = new LinkedHashSet();
            this.f25237s = new ArrayList();
            this.f25238t = true;
            this.f25218B = true;
            this.f25219a = AbstractC6017a.e(klass);
            this.f25220b = context;
            this.f25221c = str;
            this.f25222d = null;
        }

        public a a(b callback) {
            AbstractC4862t.e(callback, "callback");
            this.f25223e.add(callback);
            return this;
        }

        public a b(AbstractC3989b... migrations) {
            AbstractC4862t.e(migrations, "migrations");
            for (AbstractC3989b abstractC3989b : migrations) {
                this.f25236r.add(Integer.valueOf(abstractC3989b.f34132a));
                this.f25236r.add(Integer.valueOf(abstractC3989b.f34133b));
            }
            this.f25234p.b((AbstractC3989b[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        public a c() {
            this.f25229k = true;
            return this;
        }

        public t d() {
            InterfaceC4878d.c nVar;
            InterfaceC4878d.c cVar;
            t tVar;
            Executor executor = this.f25226h;
            if (executor == null && this.f25227i == null) {
                Executor executorF = C5473c.f();
                this.f25227i = executorF;
                this.f25226h = executorF;
            } else if (executor != null && this.f25227i == null) {
                this.f25227i = executor;
            } else if (executor == null) {
                this.f25226h = this.f25227i;
            }
            u.b(this.f25236r, this.f25235q);
            InterfaceC4793c interfaceC4793c = this.f25244z;
            if (interfaceC4793c == null && this.f25228j == null) {
                nVar = new C5017i();
            } else if (interfaceC4793c == null) {
                nVar = this.f25228j;
            } else {
                if (this.f25228j != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                nVar = null;
            }
            boolean z10 = this.f25232n > 0;
            boolean z11 = (this.f25241w == null && this.f25242x == null && this.f25243y == null) ? false : true;
            if (nVar != null) {
                if (z10) {
                    if (this.f25221c == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.f25232n;
                    TimeUnit timeUnit = this.f25233o;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    nVar = new g3.l(nVar, new C4132b(j10, timeUnit, null, 4, null));
                }
                if (z11) {
                    if (this.f25221c == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.f25241w;
                    int i10 = str == null ? 0 : 1;
                    File file = this.f25242x;
                    int i11 = file == null ? 0 : 1;
                    Callable callable = this.f25243y;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    nVar = new g3.n(str, file, callable, nVar);
                }
                cVar = nVar;
            } else {
                cVar = null;
            }
            if (cVar == null) {
                if (z10) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z11) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.f25220b;
            String str2 = this.f25221c;
            e eVar = this.f25234p;
            List list = this.f25223e;
            boolean z12 = this.f25229k;
            d dVarB = this.f25230l.b(context);
            Executor executor2 = this.f25226h;
            if (executor2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor3 = this.f25227i;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2804c c2804c = new C2804c(context, str2, cVar, eVar, list, z12, dVarB, executor2, executor3, this.f25231m, this.f25238t, this.f25239u, this.f25235q, this.f25241w, this.f25242x, this.f25243y, this.f25224f, this.f25225g, this.f25237s, this.f25240v, this.f25244z, this.f25217A);
            c2804c.f(this.f25218B);
            InterfaceC6082a interfaceC6082a = this.f25222d;
            if (interfaceC6082a == null || (tVar = (t) interfaceC6082a.invoke()) == null) {
                tVar = (t) h3.f.b(AbstractC6017a.b(this.f25219a), null, 2, null);
            }
            tVar.G(c2804c);
            return tVar;
        }

        public final a e(boolean z10) {
            this.f25238t = false;
            this.f25239u = true;
            this.f25240v = z10;
            return this;
        }

        public a f(InterfaceC4878d.c cVar) {
            this.f25228j = cVar;
            return this;
        }

        public a g(Executor executor) {
            AbstractC4862t.e(executor, "executor");
            if (this.f25217A != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.f25226h = executor;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class b {
        public void a(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            if (connection instanceof C3927a) {
                b(((C3927a) connection).a());
            }
        }

        public void b(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
        }

        public void c(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            if (connection instanceof C3927a) {
                d(((C3927a) connection).a());
            }
        }

        public void d(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
        }

        public void e(InterfaceC4792b connection) {
            AbstractC4862t.e(connection, "connection");
            if (connection instanceof C3927a) {
                f(((C3927a) connection).a());
            }
        }

        public void f(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        public /* synthetic */ c(AbstractC4854k abstractC4854k) {
            this();
        }

        public c() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ d[] $VALUES;
        public static final d AUTOMATIC = new d("AUTOMATIC", 0);
        public static final d TRUNCATE = new d("TRUNCATE", 1);
        public static final d WRITE_AHEAD_LOGGING = new d("WRITE_AHEAD_LOGGING", 2);

        static {
            d[] dVarArrA = a();
            $VALUES = dVarArrA;
            $ENTRIES = AbstractC5277b.a(dVarArrA);
        }

        public d(String str, int i10) {
        }

        public static final /* synthetic */ d[] a() {
            return new d[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public final d b(Context context) {
            AbstractC4862t.e(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f25245a = new LinkedHashMap();

        public final void a(AbstractC3989b migration) {
            AbstractC4862t.e(migration, "migration");
            int i10 = migration.f34132a;
            int i11 = migration.f34133b;
            Map map = this.f25245a;
            Integer numValueOf = Integer.valueOf(i10);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void b(AbstractC3989b... migrations) {
            AbstractC4862t.e(migrations, "migrations");
            for (AbstractC3989b abstractC3989b : migrations) {
                a(abstractC3989b);
            }
        }

        public final boolean c(int i10, int i11) {
            return h3.g.a(this, i10, i11);
        }

        public Map d() {
            return this.f25245a;
        }

        public final C4034q e(int i10) {
            TreeMap treeMap = (TreeMap) this.f25245a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                return null;
            }
            return AbstractC4040w.a(treeMap, treeMap.descendingKeySet());
        }

        public final C4034q f(int i10) {
            TreeMap treeMap = (TreeMap) this.f25245a.get(Integer.valueOf(i10));
            if (treeMap == null) {
                return null;
            }
            return AbstractC4040w.a(treeMap, treeMap.keySet());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class f {
        public void a(InterfaceC4877c db2) {
            AbstractC4862t.e(db2, "db");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class g extends AbstractC4860q implements InterfaceC6082a {
        public g(Object obj) {
            super(0, obj, t.class, "onClosed", "onClosed()V", 0);
        }

        public final void i() {
            ((t) this.receiver).M();
        }

        @Override // vc.InterfaceC6082a
        public /* bridge */ /* synthetic */ Object invoke() {
            i();
            return C4015H.f34254a;
        }
    }

    public static final C4015H i(t tVar, InterfaceC4877c it) {
        AbstractC4862t.e(it, "it");
        tVar.H();
        return C4015H.f34254a;
    }

    public static final InterfaceC4878d k(t tVar, C2804c config) {
        AbstractC4862t.e(config, "config");
        return tVar.o(config);
    }

    public static final C4015H q(t tVar, InterfaceC4877c it) {
        AbstractC4862t.e(it, "it");
        tVar.I();
        return C4015H.f34254a;
    }

    public final Map A() {
        return z();
    }

    public Map B() {
        return Q.i();
    }

    public final InterfaceC4992i C() {
        InterfaceC4992i interfaceC4992i = this.f25206b;
        if (interfaceC4992i != null) {
            return interfaceC4992i;
        }
        AbstractC4862t.p("transactionContext");
        return null;
    }

    public final boolean D() {
        return this.f25216l;
    }

    public final boolean E() {
        p pVar = this.f25209e;
        if (pVar == null) {
            AbstractC4862t.p("connectionManager");
            pVar = null;
        }
        return pVar.G() != null;
    }

    public boolean F() {
        return L() && v().F0().R0();
    }

    public void G(C2804c configuration) {
        InterfaceC4992i coroutineContext;
        AbstractC4862t.e(configuration, "configuration");
        this.f25216l = configuration.d();
        this.f25209e = l(configuration);
        this.f25210f = m();
        u.a(this, configuration);
        u.c(this, configuration);
        InterfaceC4992i interfaceC4992i = configuration.f25176v;
        M m10 = null;
        if (interfaceC4992i != null) {
            InterfaceC4992i.b bVar = interfaceC4992i.get(InterfaceC4989f.f40086j0);
            AbstractC4862t.c(bVar, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            Rd.I i10 = (Rd.I) bVar;
            Executor executorA = AbstractC2152s0.a(i10);
            this.f25207c = executorA;
            if (executorA == null) {
                AbstractC4862t.p("internalQueryExecutor");
                executorA = null;
            }
            this.f25208d = new B(executorA);
            this.f25205a = N.a(configuration.f25176v.plus(U0.a((InterfaceC2166z0) configuration.f25176v.get(InterfaceC2166z0.f15218M))));
            if (E()) {
                M m11 = this.f25205a;
                if (m11 == null) {
                    AbstractC4862t.p("coroutineScope");
                    m11 = null;
                }
                coroutineContext = m11.getCoroutineContext().plus(i10.x0(1));
            } else {
                M m12 = this.f25205a;
                if (m12 == null) {
                    AbstractC4862t.p("coroutineScope");
                    m12 = null;
                }
                coroutineContext = m12.getCoroutineContext();
            }
            this.f25206b = coroutineContext;
        } else {
            this.f25207c = configuration.f25162h;
            this.f25208d = new B(configuration.f25163i);
            Executor executor = this.f25207c;
            if (executor == null) {
                AbstractC4862t.p("internalQueryExecutor");
                executor = null;
            }
            M mA = N.a(AbstractC2152s0.b(executor).plus(U0.b(null, 1, null)));
            this.f25205a = mA;
            if (mA == null) {
                AbstractC4862t.p("coroutineScope");
                mA = null;
            }
            InterfaceC4992i coroutineContext2 = mA.getCoroutineContext();
            Executor executor2 = this.f25208d;
            if (executor2 == null) {
                AbstractC4862t.p("internalTransactionExecutor");
                executor2 = null;
            }
            this.f25206b = coroutineContext2.plus(AbstractC2152s0.b(executor2));
        }
        this.f25212h = configuration.f25160f;
        p pVar = this.f25209e;
        if (pVar == null) {
            AbstractC4862t.p("connectionManager");
            pVar = null;
        }
        InterfaceC4878d interfaceC4878dG = pVar.G();
        if (interfaceC4878dG != null) {
            while (!(interfaceC4878dG instanceof g3.m)) {
                if (!(interfaceC4878dG instanceof InterfaceC2805d)) {
                    interfaceC4878dG = null;
                    break;
                }
                interfaceC4878dG = ((InterfaceC2805d) interfaceC4878dG).a();
            }
        } else {
            interfaceC4878dG = null;
            break;
        }
        g3.m mVar = (g3.m) interfaceC4878dG;
        if (mVar != null) {
            mVar.f(configuration);
        }
        p pVar2 = this.f25209e;
        if (pVar2 == null) {
            AbstractC4862t.p("connectionManager");
            pVar2 = null;
        }
        InterfaceC4878d interfaceC4878dG2 = pVar2.G();
        if (interfaceC4878dG2 != null) {
            while (!(interfaceC4878dG2 instanceof C4138h)) {
                if (!(interfaceC4878dG2 instanceof InterfaceC2805d)) {
                    interfaceC4878dG2 = null;
                    break;
                }
                interfaceC4878dG2 = ((InterfaceC2805d) interfaceC4878dG2).a();
            }
        } else {
            interfaceC4878dG2 = null;
            break;
        }
        C4138h c4138h = (C4138h) interfaceC4878dG2;
        if (c4138h != null) {
            this.f25213i = c4138h.b();
            C4132b c4132bB = c4138h.b();
            M m13 = this.f25205a;
            if (m13 == null) {
                AbstractC4862t.p("coroutineScope");
            } else {
                m10 = m13;
            }
            c4132bB.k(m10);
            u().y(c4138h.b());
        }
        if (configuration.f25164j != null) {
            if (configuration.f25156b == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            u().n(configuration.f25155a, configuration.f25156b, configuration.f25164j);
        }
    }

    public final void H() {
        f();
        InterfaceC4877c interfaceC4877cF0 = v().F0();
        if (!interfaceC4877cF0.R0()) {
            u().B();
        }
        if (interfaceC4877cF0.U0()) {
            interfaceC4877cF0.R();
        } else {
            interfaceC4877cF0.v();
        }
    }

    public final void I() {
        v().F0().V();
        if (F()) {
            return;
        }
        u().v();
    }

    public final void J(InterfaceC4792b connection) {
        AbstractC4862t.e(connection, "connection");
        u().o(connection);
    }

    public final boolean K() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public final boolean L() {
        p pVar = this.f25209e;
        if (pVar == null) {
            AbstractC4862t.p("connectionManager");
            pVar = null;
        }
        return pVar.J();
    }

    public final void M() {
        M m10 = this.f25205a;
        p pVar = null;
        if (m10 == null) {
            AbstractC4862t.p("coroutineScope");
            m10 = null;
        }
        N.c(m10, null, 1, null);
        u().z();
        p pVar2 = this.f25209e;
        if (pVar2 == null) {
            AbstractC4862t.p("connectionManager");
        } else {
            pVar = pVar2;
        }
        pVar.F();
    }

    public Object N(Callable body) {
        AbstractC4862t.e(body, "body");
        h();
        try {
            Object objCall = body.call();
            P();
            return objCall;
        } finally {
            p();
        }
    }

    public void O(Runnable body) {
        AbstractC4862t.e(body, "body");
        h();
        try {
            body.run();
            P();
        } finally {
            p();
        }
    }

    public void P() {
        v().F0().P();
    }

    public final Object Q(boolean z10, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        p pVar2 = this.f25209e;
        if (pVar2 == null) {
            AbstractC4862t.p("connectionManager");
            pVar2 = null;
        }
        return pVar2.K(z10, pVar, interfaceC4988e);
    }

    public final void e(Cc.d kclass, Object converter) {
        AbstractC4862t.e(kclass, "kclass");
        AbstractC4862t.e(converter, "converter");
        this.f25215k.put(kclass, converter);
    }

    public void f() {
        if (!this.f25212h && K()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void g() {
        if (E() && !F() && this.f25214j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void h() {
        f();
        C4132b c4132b = this.f25213i;
        if (c4132b == null) {
            H();
        } else {
            c4132b.h(new vc.l() { // from class: b3.r
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return t.i(this.f25202a, (InterfaceC4877c) obj);
                }
            });
        }
    }

    public List j(Map autoMigrationSpecs) {
        AbstractC4862t.e(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(P.e(autoMigrationSpecs.size()));
        for (Map.Entry entry : autoMigrationSpecs.entrySet()) {
            linkedHashMap.put(AbstractC6017a.b((Cc.d) entry.getKey()), entry.getValue());
        }
        return r(linkedHashMap);
    }

    public final p l(C2804c configuration) {
        x xVar;
        AbstractC4862t.e(configuration, "configuration");
        try {
            y yVarN = n();
            AbstractC4862t.c(yVarN, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            xVar = (x) yVarN;
        } catch (C4033p unused) {
            xVar = null;
        }
        return xVar == null ? new p(configuration, new vc.l() { // from class: b3.s
            @Override // vc.l
            public final Object invoke(Object obj) {
                return t.k(this.f25203a, (C2804c) obj);
            }
        }) : new p(configuration, xVar);
    }

    public abstract androidx.room.a m();

    public y n() {
        throw new C4033p(null, 1, null);
    }

    public InterfaceC4878d o(C2804c config) {
        AbstractC4862t.e(config, "config");
        throw new C4033p(null, 1, null);
    }

    public void p() {
        C4132b c4132b = this.f25213i;
        if (c4132b == null) {
            I();
        } else {
            c4132b.h(new vc.l() { // from class: b3.q
                @Override // vc.l
                public final Object invoke(Object obj) {
                    return t.q(this.f25201a, (InterfaceC4877c) obj);
                }
            });
        }
    }

    public List r(Map autoMigrationSpecs) {
        AbstractC4862t.e(autoMigrationSpecs, "autoMigrationSpecs");
        return C4206t.k();
    }

    public final C2939a s() {
        return this.f25211g;
    }

    public final M t() {
        M m10 = this.f25205a;
        if (m10 != null) {
            return m10;
        }
        AbstractC4862t.p("coroutineScope");
        return null;
    }

    public androidx.room.a u() {
        androidx.room.a aVar = this.f25210f;
        if (aVar != null) {
            return aVar;
        }
        AbstractC4862t.p("internalTracker");
        return null;
    }

    public InterfaceC4878d v() {
        p pVar = this.f25209e;
        if (pVar == null) {
            AbstractC4862t.p("connectionManager");
            pVar = null;
        }
        InterfaceC4878d interfaceC4878dG = pVar.G();
        if (interfaceC4878dG != null) {
            return interfaceC4878dG;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final InterfaceC4992i w() {
        M m10 = this.f25205a;
        if (m10 == null) {
            AbstractC4862t.p("coroutineScope");
            m10 = null;
        }
        return m10.getCoroutineContext();
    }

    public Set x() {
        Set setY = y();
        ArrayList arrayList = new ArrayList(C4207u.v(setY, 10));
        Iterator it = setY.iterator();
        while (it.hasNext()) {
            arrayList.add(AbstractC6017a.e((Class) it.next()));
        }
        return C4179C.Z0(arrayList);
    }

    public Set y() {
        return U.d();
    }

    public Map z() {
        Set<Map.Entry> setEntrySet = B().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            Cc.d dVarE = AbstractC6017a.e(cls);
            ArrayList arrayList = new ArrayList(C4207u.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(AbstractC6017a.e((Class) it.next()));
            }
            C4034q c4034qA = AbstractC4040w.a(dVarE, arrayList);
            linkedHashMap.put(c4034qA.e(), c4034qA.f());
        }
        return linkedHashMap;
    }
}
