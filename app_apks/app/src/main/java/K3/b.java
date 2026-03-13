package K3;

import I3.AbstractC0890u;
import I3.C0874d;
import I3.G;
import I3.L;
import J3.C0910s;
import J3.C0916y;
import J3.InterfaceC0897e;
import J3.InterfaceC0912u;
import J3.InterfaceC0917z;
import J3.c0;
import M3.b;
import M3.g;
import M3.j;
import M3.k;
import O3.n;
import Q3.C1877w;
import Q3.I;
import Q3.q0;
import R3.t;
import Rd.InterfaceC2166z0;
import android.content.Context;
import android.text.TextUtils;
import io.sentry.TransactionOptions;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class b implements InterfaceC0912u, g, InterfaceC0897e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f7420o = AbstractC0890u.i("GreedyScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7421a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public K3.a f7423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7424d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0910s f7427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c0 f7428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.work.a f7429i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f7431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j f7432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S3.b f7433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f7434n;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7422b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7425e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC0917z f7426f = InterfaceC0917z.create();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f7430j = new HashMap();

    /* JADX INFO: renamed from: K3.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0113b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f7436b;

        public C0113b(int i10, long j10) {
            this.f7435a = i10;
            this.f7436b = j10;
        }
    }

    public b(Context context, androidx.work.a aVar, n nVar, C0910s c0910s, c0 c0Var, S3.b bVar) {
        this.f7421a = context;
        G gK = aVar.k();
        this.f7423c = new K3.a(this, gK, aVar.a());
        this.f7434n = new d(gK, c0Var);
        this.f7433m = bVar;
        this.f7432l = new j(nVar);
        this.f7429i = aVar;
        this.f7427g = c0910s;
        this.f7428h = c0Var;
    }

    @Override // J3.InterfaceC0912u
    public void a(String str) {
        if (this.f7431k == null) {
            f();
        }
        if (!this.f7431k.booleanValue()) {
            AbstractC0890u.e().f(f7420o, "Ignoring schedule request in non-main process");
            return;
        }
        g();
        AbstractC0890u.e().a(f7420o, "Cancelling work ID " + str);
        K3.a aVar = this.f7423c;
        if (aVar != null) {
            aVar.b(str);
        }
        for (C0916y c0916y : this.f7426f.remove(str)) {
            this.f7434n.b(c0916y);
            this.f7428h.e(c0916y);
        }
    }

    @Override // M3.g
    public void b(I i10, M3.b bVar) {
        C1877w c1877wA = q0.a(i10);
        if (bVar instanceof b.a) {
            if (this.f7426f.c(c1877wA)) {
                return;
            }
            AbstractC0890u.e().a(f7420o, "Constraints met: Scheduling work ID " + c1877wA);
            C0916y c0916yD = this.f7426f.d(c1877wA);
            this.f7434n.c(c0916yD);
            this.f7428h.a(c0916yD);
            return;
        }
        AbstractC0890u.e().a(f7420o, "Constraints not met: Cancelling work ID " + c1877wA);
        C0916y c0916yA = this.f7426f.a(c1877wA);
        if (c0916yA != null) {
            this.f7434n.b(c0916yA);
            this.f7428h.d(c0916yA, ((b.C0138b) bVar).a());
        }
    }

    @Override // J3.InterfaceC0897e
    public void c(C1877w c1877w, boolean z10) {
        C0916y c0916yA = this.f7426f.a(c1877w);
        if (c0916yA != null) {
            this.f7434n.b(c0916yA);
        }
        h(c1877w);
        if (z10) {
            return;
        }
        synchronized (this.f7425e) {
            this.f7430j.remove(c1877w);
        }
    }

    @Override // J3.InterfaceC0912u
    public boolean d() {
        return false;
    }

    @Override // J3.InterfaceC0912u
    public void e(I... iArr) {
        if (this.f7431k == null) {
            f();
        }
        if (!this.f7431k.booleanValue()) {
            AbstractC0890u.e().f(f7420o, "Ignoring schedule request in a secondary process");
            return;
        }
        g();
        HashSet<I> hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (I i10 : iArr) {
            if (!this.f7426f.c(q0.a(i10))) {
                long jMax = Math.max(i10.c(), i(i10));
                long jA = this.f7429i.a().a();
                if (i10.f13589b == L.c.ENQUEUED) {
                    if (jA < jMax) {
                        K3.a aVar = this.f7423c;
                        if (aVar != null) {
                            aVar.a(i10, jMax);
                        }
                    } else if (i10.m()) {
                        C0874d c0874d = i10.f13597j;
                        if (c0874d.j()) {
                            AbstractC0890u.e().a(f7420o, "Ignoring " + i10 + ". Requires device idle.");
                        } else if (c0874d.g()) {
                            AbstractC0890u.e().a(f7420o, "Ignoring " + i10 + ". Requires ContentUri triggers.");
                        } else {
                            hashSet.add(i10);
                            hashSet2.add(i10.f13588a);
                        }
                    } else if (!this.f7426f.c(q0.a(i10))) {
                        AbstractC0890u.e().a(f7420o, "Starting work for " + i10.f13588a);
                        C0916y c0916yE = this.f7426f.e(i10);
                        this.f7434n.c(c0916yE);
                        this.f7428h.a(c0916yE);
                    }
                }
            }
        }
        synchronized (this.f7425e) {
            try {
                if (!hashSet.isEmpty()) {
                    AbstractC0890u.e().a(f7420o, "Starting tracking for " + TextUtils.join(",", hashSet2));
                    for (I i11 : hashSet) {
                        C1877w c1877wA = q0.a(i11);
                        if (!this.f7422b.containsKey(c1877wA)) {
                            this.f7422b.put(c1877wA, k.c(this.f7432l, i11, this.f7433m.b(), this));
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f() {
        this.f7431k = Boolean.valueOf(t.b(this.f7421a, this.f7429i));
    }

    public final void g() {
        if (this.f7424d) {
            return;
        }
        this.f7427g.e(this);
        this.f7424d = true;
    }

    public final void h(C1877w c1877w) {
        InterfaceC2166z0 interfaceC2166z0;
        synchronized (this.f7425e) {
            interfaceC2166z0 = (InterfaceC2166z0) this.f7422b.remove(c1877w);
        }
        if (interfaceC2166z0 != null) {
            AbstractC0890u.e().a(f7420o, "Stopping tracking for " + c1877w);
            interfaceC2166z0.a(null);
        }
    }

    public final long i(I i10) {
        long jMax;
        synchronized (this.f7425e) {
            try {
                C1877w c1877wA = q0.a(i10);
                C0113b c0113b = (C0113b) this.f7430j.get(c1877wA);
                if (c0113b == null) {
                    c0113b = new C0113b(i10.f13598k, this.f7429i.a().a());
                    this.f7430j.put(c1877wA, c0113b);
                }
                jMax = c0113b.f7436b + (((long) Math.max((i10.f13598k - c0113b.f7435a) - 5, 0)) * TransactionOptions.DEFAULT_DEADLINE_TIMEOUT_AUTO_TRANSACTION);
            } catch (Throwable th) {
                throw th;
            }
        }
        return jMax;
    }
}
