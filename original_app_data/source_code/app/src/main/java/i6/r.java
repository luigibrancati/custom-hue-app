package i6;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import b6.AbstractC2840i;
import b6.AbstractC2847p;
import b6.C2839h;
import c6.g;
import e6.C3940a;
import e6.C3942c;
import f6.AbstractC3996a;
import j6.AbstractC4732k;
import j6.InterfaceC4724c;
import j6.InterfaceC4725d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import k6.C4805a;
import k6.InterfaceC4806b;
import l6.InterfaceC4957a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c6.e f37283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4725d f37284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f37285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f37286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC4806b f37287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC4957a f37288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final InterfaceC4957a f37289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC4724c f37290i;

    public r(Context context, c6.e eVar, InterfaceC4725d interfaceC4725d, x xVar, Executor executor, InterfaceC4806b interfaceC4806b, InterfaceC4957a interfaceC4957a, InterfaceC4957a interfaceC4957a2, InterfaceC4724c interfaceC4724c) {
        this.f37282a = context;
        this.f37283b = eVar;
        this.f37284c = interfaceC4725d;
        this.f37285d = xVar;
        this.f37286e = executor;
        this.f37287f = interfaceC4806b;
        this.f37288g = interfaceC4957a;
        this.f37289h = interfaceC4957a2;
        this.f37290i = interfaceC4724c;
    }

    public static /* synthetic */ Object b(r rVar, Iterable iterable, AbstractC2847p abstractC2847p, long j10) {
        rVar.f37284c.h0(iterable);
        rVar.f37284c.H0(abstractC2847p, rVar.f37288g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object c(r rVar) {
        rVar.f37290i.a();
        return null;
    }

    public static /* synthetic */ Object e(r rVar, Iterable iterable) {
        rVar.f37284c.x(iterable);
        return null;
    }

    public static /* synthetic */ Object f(r rVar, AbstractC2847p abstractC2847p, int i10) {
        rVar.f37285d.b(abstractC2847p, i10 + 1);
        return null;
    }

    public static /* synthetic */ Object g(r rVar, AbstractC2847p abstractC2847p, long j10) {
        rVar.f37284c.H0(abstractC2847p, rVar.f37288g.a() + j10);
        return null;
    }

    public static /* synthetic */ Object h(r rVar, Map map) {
        rVar.getClass();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            rVar.f37290i.b(((Integer) r0.getValue()).intValue(), C3942c.b.INVALID_PAYLOD, (String) ((Map.Entry) it.next()).getKey());
        }
        return null;
    }

    public static /* synthetic */ void i(final r rVar, final AbstractC2847p abstractC2847p, final int i10, Runnable runnable) {
        rVar.getClass();
        try {
            try {
                InterfaceC4806b interfaceC4806b = rVar.f37287f;
                final InterfaceC4725d interfaceC4725d = rVar.f37284c;
                Objects.requireNonNull(interfaceC4725d);
                interfaceC4806b.c(new InterfaceC4806b.a() { // from class: i6.i
                    @Override // k6.InterfaceC4806b.a
                    public final Object l() {
                        return Integer.valueOf(interfaceC4725d.w());
                    }
                });
                if (rVar.k()) {
                    rVar.l(abstractC2847p, i10);
                } else {
                    rVar.f37287f.c(new InterfaceC4806b.a() { // from class: i6.j
                        @Override // k6.InterfaceC4806b.a
                        public final Object l() {
                            return r.f(this.f37263a, abstractC2847p, i10);
                        }
                    });
                }
                runnable.run();
            } catch (C4805a unused) {
                rVar.f37285d.b(abstractC2847p, i10 + 1);
                runnable.run();
            }
        } catch (Throwable th) {
            runnable.run();
            throw th;
        }
    }

    public AbstractC2840i j(c6.m mVar) {
        InterfaceC4806b interfaceC4806b = this.f37287f;
        final InterfaceC4724c interfaceC4724c = this.f37290i;
        Objects.requireNonNull(interfaceC4724c);
        return mVar.b(AbstractC2840i.a().i(this.f37288g.a()).o(this.f37289h.a()).n("GDT_CLIENT_METRICS").h(new C2839h(Y5.c.b("proto"), ((C3940a) interfaceC4806b.c(new InterfaceC4806b.a() { // from class: i6.h
            @Override // k6.InterfaceC4806b.a
            public final Object l() {
                return interfaceC4724c.d();
            }
        })).f())).d());
    }

    public boolean k() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f37282a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public c6.g l(final AbstractC2847p abstractC2847p, int i10) {
        c6.g gVarA;
        c6.m mVar = this.f37283b.get(abstractC2847p.b());
        c6.g gVarE = c6.g.e(0L);
        final long j10 = 0;
        while (((Boolean) this.f37287f.c(new InterfaceC4806b.a() { // from class: i6.k
            @Override // k6.InterfaceC4806b.a
            public final Object l() {
                return Boolean.valueOf(this.f37266a.f37284c.w0(abstractC2847p));
            }
        })).booleanValue()) {
            final Iterable iterable = (Iterable) this.f37287f.c(new InterfaceC4806b.a() { // from class: i6.l
                @Override // k6.InterfaceC4806b.a
                public final Object l() {
                    return this.f37268a.f37284c.i0(abstractC2847p);
                }
            });
            if (!iterable.iterator().hasNext()) {
                return gVarE;
            }
            if (mVar == null) {
                AbstractC3996a.a("Uploader", "Unknown backend for %s, deleting event batch for it...", abstractC2847p);
                gVarA = c6.g.a();
            } else {
                ArrayList arrayList = new ArrayList();
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((AbstractC4732k) it.next()).b());
                }
                if (abstractC2847p.e()) {
                    arrayList.add(this.j(mVar));
                }
                gVarA = mVar.a(c6.f.a().b(arrayList).c(abstractC2847p.c()).a());
            }
            gVarE = gVarA;
            if (gVarE.c() == g.a.TRANSIENT_ERROR) {
                final r rVar = this;
                final AbstractC2847p abstractC2847p2 = abstractC2847p;
                this.f37287f.c(new InterfaceC4806b.a() { // from class: i6.m
                    @Override // k6.InterfaceC4806b.a
                    public final Object l() {
                        return r.b(this.f37270a, iterable, abstractC2847p2, j10);
                    }
                });
                rVar.f37285d.a(abstractC2847p2, i10 + 1, true);
                return gVarE;
            }
            final r rVar2 = this;
            AbstractC2847p abstractC2847p3 = abstractC2847p;
            rVar2.f37287f.c(new InterfaceC4806b.a() { // from class: i6.n
                @Override // k6.InterfaceC4806b.a
                public final Object l() {
                    return r.e(this.f37274a, iterable);
                }
            });
            if (gVarE.c() == g.a.OK) {
                long jMax = Math.max(j10, gVarE.b());
                if (abstractC2847p3.e()) {
                    rVar2.f37287f.c(new InterfaceC4806b.a() { // from class: i6.o
                        @Override // k6.InterfaceC4806b.a
                        public final Object l() {
                            return r.c(this.f37276a);
                        }
                    });
                }
                j10 = jMax;
            } else if (gVarE.c() == g.a.INVALID_PAYLOAD) {
                final HashMap map = new HashMap();
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    String strN = ((AbstractC4732k) it2.next()).b().n();
                    if (map.containsKey(strN)) {
                        map.put(strN, Integer.valueOf(((Integer) map.get(strN)).intValue() + 1));
                    } else {
                        map.put(strN, 1);
                    }
                }
                rVar2.f37287f.c(new InterfaceC4806b.a() { // from class: i6.p
                    @Override // k6.InterfaceC4806b.a
                    public final Object l() {
                        return r.h(this.f37277a, map);
                    }
                });
            }
            this = rVar2;
            abstractC2847p = abstractC2847p3;
        }
        final r rVar3 = this;
        final AbstractC2847p abstractC2847p4 = abstractC2847p;
        rVar3.f37287f.c(new InterfaceC4806b.a() { // from class: i6.q
            @Override // k6.InterfaceC4806b.a
            public final Object l() {
                return r.g(this.f37279a, abstractC2847p4, j10);
            }
        });
        return gVarE;
    }

    public void m(final AbstractC2847p abstractC2847p, final int i10, final Runnable runnable) {
        this.f37286e.execute(new Runnable() { // from class: i6.g
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f37257a, abstractC2847p, i10, runnable);
            }
        });
    }
}
