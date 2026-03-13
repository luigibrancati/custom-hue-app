package o8;

import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import o8.n;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class n implements InterfaceC5234d, G8.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final O8.b f41268i = new O8.b() { // from class: o8.j
        @Override // O8.b
        public final Object get() {
            return Collections.EMPTY_SET;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f41270b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f41271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f41272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f41273e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final u f41274f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f41275g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final i f41276h;

    public static /* synthetic */ Object i(n nVar, C5233c c5233c) {
        nVar.getClass();
        return c5233c.h().a(new F(c5233c, nVar));
    }

    public static b l(Executor executor) {
        return new b(executor);
    }

    public static List p(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // o8.InterfaceC5234d
    public synchronized O8.b b(E e10) {
        D.c(e10, "Null interface requested.");
        return (O8.b) this.f41270b.get(e10);
    }

    @Override // o8.InterfaceC5234d
    public O8.a d(E e10) {
        O8.b bVarB = b(e10);
        return bVarB == null ? C.e() : bVarB instanceof C ? (C) bVarB : C.f(bVarB);
    }

    @Override // o8.InterfaceC5234d
    public synchronized O8.b f(E e10) {
        x xVar = (x) this.f41271c.get(e10);
        if (xVar != null) {
            return xVar;
        }
        return f41268i;
    }

    public final void m(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f41272d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((O8.b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f41276h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (v e10) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e10);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C5233c) it2.next()).j().toArray();
                int length = array.length;
                int i10 = 0;
                while (true) {
                    if (i10 < length) {
                        Object obj = array[i10];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f41273e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f41273e.add(obj.toString());
                        }
                        i10++;
                    }
                }
            }
            if (this.f41269a.isEmpty()) {
                p.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f41269a.keySet());
                arrayList2.addAll(list);
                p.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C5233c c5233c = (C5233c) it3.next();
                this.f41269a.put(c5233c, new w(new O8.b() { // from class: o8.k
                    @Override // O8.b
                    public final Object get() {
                        return n.i(this.f41262a, c5233c);
                    }
                }));
            }
            arrayList.addAll(s(list));
            arrayList.addAll(t());
            r();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        q();
    }

    public final void n(Map map, boolean z10) {
        for (Map.Entry entry : map.entrySet()) {
            C5233c c5233c = (C5233c) entry.getKey();
            O8.b bVar = (O8.b) entry.getValue();
            if (c5233c.n() || (c5233c.o() && z10)) {
                bVar.get();
            }
        }
        this.f41274f.f();
    }

    public void o(boolean z10) {
        HashMap map;
        if (T1.e.a(this.f41275g, null, Boolean.valueOf(z10))) {
            synchronized (this) {
                map = new HashMap(this.f41269a);
            }
            n(map, z10);
        }
    }

    public final void q() {
        Boolean bool = (Boolean) this.f41275g.get();
        if (bool != null) {
            n(this.f41269a, bool.booleanValue());
        }
    }

    public final void r() {
        for (C5233c c5233c : this.f41269a.keySet()) {
            for (q qVar : c5233c.g()) {
                if (qVar.g() && !this.f41271c.containsKey(qVar.c())) {
                    this.f41271c.put(qVar.c(), x.b(Collections.EMPTY_SET));
                } else if (this.f41270b.containsKey(qVar.c())) {
                    continue;
                } else {
                    if (qVar.f()) {
                        throw new y(String.format("Unsatisfied dependency for component %s: %s", c5233c, qVar.c()));
                    }
                    if (!qVar.g()) {
                        this.f41270b.put(qVar.c(), C.e());
                    }
                }
            }
        }
    }

    public final List s(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C5233c c5233c = (C5233c) it.next();
            if (c5233c.p()) {
                final O8.b bVar = (O8.b) this.f41269a.get(c5233c);
                for (E e10 : c5233c.j()) {
                    if (this.f41270b.containsKey(e10)) {
                        final C c10 = (C) ((O8.b) this.f41270b.get(e10));
                        arrayList.add(new Runnable() { // from class: o8.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                c10.g(bVar);
                            }
                        });
                    } else {
                        this.f41270b.put(e10, bVar);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List t() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f41269a.entrySet()) {
            C5233c c5233c = (C5233c) entry.getKey();
            if (!c5233c.p()) {
                O8.b bVar = (O8.b) entry.getValue();
                for (E e10 : c5233c.j()) {
                    if (!map.containsKey(e10)) {
                        map.put(e10, new HashSet());
                    }
                    ((Set) map.get(e10)).add(bVar);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f41271c.containsKey(entry2.getKey())) {
                final x xVar = (x) this.f41271c.get(entry2.getKey());
                for (final O8.b bVar2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: o8.m
                        @Override // java.lang.Runnable
                        public final void run() {
                            xVar.a(bVar2);
                        }
                    });
                }
            } else {
                this.f41271c.put((E) entry2.getKey(), x.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }

    public n(Executor executor, Iterable iterable, Collection collection, i iVar) {
        this.f41269a = new HashMap();
        this.f41270b = new HashMap();
        this.f41271c = new HashMap();
        this.f41273e = new HashSet();
        this.f41275g = new AtomicReference();
        u uVar = new u(executor);
        this.f41274f = uVar;
        this.f41276h = iVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C5233c.q(uVar, u.class, L8.d.class, L8.c.class));
        arrayList.add(C5233c.q(this, G8.a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C5233c c5233c = (C5233c) it.next();
            if (c5233c != null) {
                arrayList.add(c5233c);
            }
        }
        this.f41272d = p(iterable);
        m(arrayList);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f41277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f41278b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f41279c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public i f41280d = i.f41261a;

        public b(Executor executor) {
            this.f41277a = executor;
        }

        public b b(C5233c c5233c) {
            this.f41279c.add(c5233c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f41278b.add(new O8.b() { // from class: o8.o
                @Override // O8.b
                public final Object get() {
                    return n.b.a(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f41278b.addAll(collection);
            return this;
        }

        public n e() {
            return new n(this.f41277a, this.f41278b, this.f41279c, this.f41280d);
        }

        public b f(i iVar) {
            this.f41280d = iVar;
            return this;
        }

        public static /* synthetic */ ComponentRegistrar a(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }
    }
}
