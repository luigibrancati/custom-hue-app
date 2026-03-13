package a0;

import E.C0813t;
import E.F0;
import P.f;
import androidx.lifecycle.AbstractC2754j;
import androidx.lifecycle.InterfaceC2757m;
import androidx.lifecycle.InterfaceC2758n;
import androidx.lifecycle.y;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f20488f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static h f20489g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20490a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f20491b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f20492c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayDeque f20493d = new ArrayDeque();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public F.a f20494e;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class a {
        public static a a(InterfaceC2758n interfaceC2758n, C0813t c0813t) {
            return new C2606a(System.identityHashCode(interfaceC2758n), c0813t);
        }

        public abstract C0813t b();

        public abstract int c();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b implements InterfaceC2757m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h f20495a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final InterfaceC2758n f20496b;

        public b(InterfaceC2758n interfaceC2758n, h hVar) {
            this.f20496b = interfaceC2758n;
            this.f20495a = hVar;
        }

        public InterfaceC2758n a() {
            return this.f20496b;
        }

        @y(AbstractC2754j.a.ON_DESTROY)
        public void onDestroy(InterfaceC2758n interfaceC2758n) {
            this.f20495a.o(interfaceC2758n);
        }

        @y(AbstractC2754j.a.ON_START)
        public void onStart(InterfaceC2758n interfaceC2758n) {
            this.f20495a.j(interfaceC2758n);
        }

        @y(AbstractC2754j.a.ON_STOP)
        public void onStop(InterfaceC2758n interfaceC2758n) {
            this.f20495a.k(interfaceC2758n);
        }
    }

    public static h c() {
        h hVar;
        synchronized (f20488f) {
            try {
                if (f20489g == null) {
                    f20489g = new h();
                }
                hVar = f20489g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    public void a(c cVar, F0 f02, F.a aVar) {
        synchronized (this.f20490a) {
            try {
                X0.h.a(!f02.k().isEmpty());
                this.f20494e = aVar;
                InterfaceC2758n interfaceC2758nR = cVar.r();
                b bVarE = e(interfaceC2758nR);
                if (bVarE == null) {
                    return;
                }
                Set set = (Set) this.f20492c.get(bVarE);
                F.a aVar2 = this.f20494e;
                if (aVar2 == null || aVar2.c() != 2) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        c cVar2 = (c) X0.h.g((c) this.f20491b.get((a) it.next()));
                        if (!cVar2.equals(cVar) && !cVar2.s().isEmpty()) {
                            if (cVar2.u() || f02.m()) {
                                throw new IllegalArgumentException("Multiple LifecycleCameras with use cases are registered to the same LifecycleOwner. Please unbind first.");
                            }
                            cVar2.w();
                        }
                    }
                }
                try {
                    cVar.m(f02);
                    if (interfaceC2758nR.getLifecycle().b().b(AbstractC2754j.b.STARTED)) {
                        j(interfaceC2758nR);
                    }
                } catch (f.a e10) {
                    throw new IllegalArgumentException(e10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c b(InterfaceC2758n interfaceC2758n, P.f fVar) {
        synchronized (this.f20490a) {
            try {
                X0.h.b(this.f20491b.get(a.a(interfaceC2758n, fVar.H())) == null, "LifecycleCamera already exists for the given LifecycleOwner and set of cameras");
                c cVar = new c(interfaceC2758n, fVar);
                if (fVar.M().isEmpty()) {
                    cVar.v();
                }
                if (interfaceC2758n.getLifecycle().b() == AbstractC2754j.b.DESTROYED) {
                    return cVar;
                }
                h(cVar);
                return cVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public c d(InterfaceC2758n interfaceC2758n, C0813t c0813t) {
        c cVar;
        synchronized (this.f20490a) {
            cVar = (c) this.f20491b.get(a.a(interfaceC2758n, c0813t));
        }
        return cVar;
    }

    public final b e(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                for (b bVar : this.f20492c.keySet()) {
                    if (interfaceC2758n.equals(bVar.a())) {
                        return bVar;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Collection f() {
        Collection collectionUnmodifiableCollection;
        synchronized (this.f20490a) {
            collectionUnmodifiableCollection = Collections.unmodifiableCollection(this.f20491b.values());
        }
        return collectionUnmodifiableCollection;
    }

    public final boolean g(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                b bVarE = e(interfaceC2758n);
                if (bVarE == null) {
                    return false;
                }
                Iterator it = ((Set) this.f20492c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    if (!((c) X0.h.g((c) this.f20491b.get((a) it.next()))).s().isEmpty()) {
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(c cVar) {
        synchronized (this.f20490a) {
            try {
                InterfaceC2758n interfaceC2758nR = cVar.r();
                a aVarA = a.a(interfaceC2758nR, cVar.n().H());
                b bVarE = e(interfaceC2758nR);
                Set hashSet = bVarE != null ? (Set) this.f20492c.get(bVarE) : new HashSet();
                hashSet.add(aVarA);
                this.f20491b.put(aVarA, cVar);
                if (bVarE == null) {
                    b bVar = new b(interfaceC2758nR, this);
                    this.f20492c.put(bVar, hashSet);
                    interfaceC2758nR.getLifecycle().a(bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void i(Set set) {
        synchronized (this.f20490a) {
            if (set == null) {
                try {
                    set = this.f20491b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            for (a aVar : set) {
                if (this.f20491b.containsKey(aVar)) {
                    n((c) this.f20491b.get(aVar));
                }
            }
        }
    }

    public void j(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                if (g(interfaceC2758n)) {
                    if (this.f20493d.isEmpty()) {
                        this.f20493d.push(interfaceC2758n);
                    } else {
                        F.a aVar = this.f20494e;
                        if (aVar == null || aVar.c() != 2) {
                            InterfaceC2758n interfaceC2758n2 = (InterfaceC2758n) this.f20493d.peek();
                            if (!interfaceC2758n.equals(interfaceC2758n2)) {
                                l(interfaceC2758n2);
                                this.f20493d.remove(interfaceC2758n);
                                this.f20493d.push(interfaceC2758n);
                            }
                        }
                    }
                    p(interfaceC2758n);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void k(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                this.f20493d.remove(interfaceC2758n);
                l(interfaceC2758n);
                if (!this.f20493d.isEmpty()) {
                    p((InterfaceC2758n) this.f20493d.peek());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                b bVarE = e(interfaceC2758n);
                if (bVarE == null) {
                    return;
                }
                Iterator it = ((Set) this.f20492c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    ((c) X0.h.g((c) this.f20491b.get((a) it.next()))).v();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void m(Set set) {
        synchronized (this.f20490a) {
            if (set == null) {
                try {
                    set = this.f20491b.keySet();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Iterator it = set.iterator();
            while (it.hasNext()) {
                c cVar = (c) this.f20491b.get((a) it.next());
                if (cVar != null) {
                    cVar.w();
                    k(cVar.r());
                }
            }
        }
    }

    public final void n(c cVar) {
        synchronized (this.f20490a) {
            try {
                InterfaceC2758n interfaceC2758nR = cVar.r();
                a aVarA = a.a(interfaceC2758nR, cVar.n().H());
                this.f20491b.remove(aVarA);
                HashSet hashSet = new HashSet();
                for (b bVar : this.f20492c.keySet()) {
                    if (interfaceC2758nR.equals(bVar.a())) {
                        Set set = (Set) this.f20492c.get(bVar);
                        set.remove(aVarA);
                        if (set.isEmpty()) {
                            hashSet.add(bVar.a());
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    o((InterfaceC2758n) it.next());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void o(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                b bVarE = e(interfaceC2758n);
                if (bVarE == null) {
                    return;
                }
                k(interfaceC2758n);
                Iterator it = ((Set) this.f20492c.get(bVarE)).iterator();
                while (it.hasNext()) {
                    this.f20491b.remove((a) it.next());
                }
                this.f20492c.remove(bVarE);
                bVarE.a().getLifecycle().c(bVarE);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void p(InterfaceC2758n interfaceC2758n) {
        synchronized (this.f20490a) {
            try {
                Iterator it = ((Set) this.f20492c.get(e(interfaceC2758n))).iterator();
                while (it.hasNext()) {
                    c cVar = (c) this.f20491b.get((a) it.next());
                    if (!((c) X0.h.g(cVar)).s().isEmpty()) {
                        cVar.x();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
