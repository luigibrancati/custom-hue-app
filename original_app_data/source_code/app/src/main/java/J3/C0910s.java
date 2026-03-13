package J3;

import I3.AbstractC0890u;
import I3.C0880j;
import J3.m0;
import Q3.C1877w;
import android.content.Context;
import android.os.PowerManager;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import org.apache.tika.utils.StringUtils;

/* JADX INFO: renamed from: J3.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C0910s implements P3.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f6077l = AbstractC0890u.i("Processor");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f6079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.work.a f6080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public S3.b f6081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WorkDatabase f6082e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map f6084g = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map f6083f = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Set f6086i = new HashSet();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f6087j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public PowerManager.WakeLock f6078a = null;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f6088k = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Map f6085h = new HashMap();

    public C0910s(Context context, androidx.work.a aVar, S3.b bVar, WorkDatabase workDatabase) {
        this.f6079b = context;
        this.f6080c = aVar;
        this.f6081d = bVar;
        this.f6082e = workDatabase;
    }

    public static /* synthetic */ Q3.I b(C0910s c0910s, ArrayList arrayList, String str) {
        arrayList.addAll(c0910s.f6082e.X().b(str));
        return c0910s.f6082e.W().i(str);
    }

    public static /* synthetic */ void c(C0910s c0910s, C1877w c1877w, boolean z10) {
        synchronized (c0910s.f6088k) {
            try {
                Iterator it = c0910s.f6087j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0897e) it.next()).c(c1877w, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static /* synthetic */ void d(C0910s c0910s, O7.e eVar, m0 m0Var) {
        boolean zBooleanValue;
        c0910s.getClass();
        try {
            zBooleanValue = ((Boolean) eVar.get()).booleanValue();
        } catch (InterruptedException | ExecutionException unused) {
            zBooleanValue = true;
        }
        c0910s.l(m0Var, zBooleanValue);
    }

    public static boolean i(String str, m0 m0Var, int i10) {
        if (m0Var == null) {
            AbstractC0890u.e().a(f6077l, "WorkerWrapper could not be found for " + str);
            return false;
        }
        m0Var.o(i10);
        AbstractC0890u.e().a(f6077l, "WorkerWrapper interrupted for " + str);
        return true;
    }

    @Override // P3.a
    public void a(String str, C0880j c0880j) {
        synchronized (this.f6088k) {
            try {
                AbstractC0890u.e().f(f6077l, "Moving WorkSpec (" + str + ") to the foreground");
                m0 m0Var = (m0) this.f6084g.remove(str);
                if (m0Var != null) {
                    if (this.f6078a == null) {
                        PowerManager.WakeLock wakeLockA = R3.z.a(this.f6079b, "ProcessorForegroundLck");
                        this.f6078a = wakeLockA;
                        wakeLockA.acquire();
                    }
                    this.f6083f.put(str, m0Var);
                    L0.a.q(this.f6079b, androidx.work.impl.foreground.a.f(this.f6079b, m0Var.l(), c0880j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(InterfaceC0897e interfaceC0897e) {
        synchronized (this.f6088k) {
            this.f6087j.add(interfaceC0897e);
        }
    }

    public final m0 f(String str) {
        m0 m0Var = (m0) this.f6083f.remove(str);
        boolean z10 = m0Var != null;
        if (!z10) {
            m0Var = (m0) this.f6084g.remove(str);
        }
        this.f6085h.remove(str);
        if (z10) {
            q();
        }
        return m0Var;
    }

    public Q3.I g(String str) {
        synchronized (this.f6088k) {
            try {
                m0 m0VarH = h(str);
                if (m0VarH == null) {
                    return null;
                }
                return m0VarH.m();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final m0 h(String str) {
        m0 m0Var = (m0) this.f6083f.get(str);
        return m0Var == null ? (m0) this.f6084g.get(str) : m0Var;
    }

    public boolean j(String str) {
        boolean zContains;
        synchronized (this.f6088k) {
            zContains = this.f6086i.contains(str);
        }
        return zContains;
    }

    public boolean k(String str) {
        boolean z10;
        synchronized (this.f6088k) {
            z10 = h(str) != null;
        }
        return z10;
    }

    public final void l(m0 m0Var, boolean z10) {
        synchronized (this.f6088k) {
            try {
                C1877w c1877wL = m0Var.l();
                String strB = c1877wL.b();
                if (h(strB) == m0Var) {
                    f(strB);
                }
                AbstractC0890u.e().a(f6077l, getClass().getSimpleName() + StringUtils.SPACE + strB + " executed; reschedule = " + z10);
                Iterator it = this.f6087j.iterator();
                while (it.hasNext()) {
                    ((InterfaceC0897e) it.next()).c(c1877wL, z10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(InterfaceC0897e interfaceC0897e) {
        synchronized (this.f6088k) {
            this.f6087j.remove(interfaceC0897e);
        }
    }

    public final void n(final C1877w c1877w, final boolean z10) {
        this.f6081d.a().execute(new Runnable() { // from class: J3.r
            @Override // java.lang.Runnable
            public final void run() {
                C0910s.c(this.f6074a, c1877w, z10);
            }
        });
    }

    public boolean o(C0916y c0916y, WorkerParameters.a aVar) {
        C1877w c1877wA = c0916y.a();
        final String strB = c1877wA.b();
        final ArrayList arrayList = new ArrayList();
        Q3.I i10 = (Q3.I) this.f6082e.N(new Callable() { // from class: J3.p
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return C0910s.b(this.f6068a, arrayList, strB);
            }
        });
        if (i10 == null) {
            AbstractC0890u.e().k(f6077l, "Didn't find WorkSpec for id " + c1877wA);
            n(c1877wA, false);
            return false;
        }
        synchronized (this.f6088k) {
            try {
                if (k(strB)) {
                    Set set = (Set) this.f6085h.get(strB);
                    if (((C0916y) set.iterator().next()).a().a() == c1877wA.a()) {
                        set.add(c0916y);
                        AbstractC0890u.e().a(f6077l, "Work " + c1877wA + " is already enqueued for processing");
                    } else {
                        n(c1877wA, false);
                    }
                    return false;
                }
                if (i10.g() != c1877wA.a()) {
                    n(c1877wA, false);
                    return false;
                }
                final m0 m0VarA = new m0.a(this.f6079b, this.f6080c, this.f6081d, this, this.f6082e, i10, arrayList).k(aVar).a();
                final O7.e eVarQ = m0VarA.q();
                eVarQ.b(new Runnable() { // from class: J3.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        C0910s.d(this.f6071a, eVarQ, m0VarA);
                    }
                }, this.f6081d.a());
                this.f6084g.put(strB, m0VarA);
                HashSet hashSet = new HashSet();
                hashSet.add(c0916y);
                this.f6085h.put(strB, hashSet);
                AbstractC0890u.e().a(f6077l, getClass().getSimpleName() + ": processing " + c1877wA);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean p(String str, int i10) {
        m0 m0VarF;
        synchronized (this.f6088k) {
            AbstractC0890u.e().a(f6077l, "Processor cancelling " + str);
            this.f6086i.add(str);
            m0VarF = f(str);
        }
        return i(str, m0VarF, i10);
    }

    public final void q() {
        synchronized (this.f6088k) {
            try {
                if (this.f6083f.isEmpty()) {
                    try {
                        this.f6079b.startService(androidx.work.impl.foreground.a.g(this.f6079b));
                    } catch (Throwable th) {
                        AbstractC0890u.e().d(f6077l, "Unable to stop foreground service", th);
                    }
                    PowerManager.WakeLock wakeLock = this.f6078a;
                    if (wakeLock != null) {
                        wakeLock.release();
                        this.f6078a = null;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean r(C0916y c0916y, int i10) {
        m0 m0VarF;
        String strB = c0916y.a().b();
        synchronized (this.f6088k) {
            m0VarF = f(strB);
        }
        return i(strB, m0VarF, i10);
    }

    public boolean s(C0916y c0916y, int i10) {
        String strB = c0916y.a().b();
        synchronized (this.f6088k) {
            try {
                if (this.f6083f.get(strB) == null) {
                    Set set = (Set) this.f6085h.get(strB);
                    if (set != null && set.contains(c0916y)) {
                        return i(strB, f(strB), i10);
                    }
                    return false;
                }
                AbstractC0890u.e().a(f6077l, "Ignored stopWork. WorkerWrapper " + strB + " is in foreground");
                return false;
            } finally {
            }
        }
    }
}
