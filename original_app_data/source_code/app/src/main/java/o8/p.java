package o8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C5233c f41282a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f41283b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f41284c = new HashSet();

        public b(C5233c c5233c) {
            this.f41282a = c5233c;
        }

        public void a(b bVar) {
            this.f41283b.add(bVar);
        }

        public void b(b bVar) {
            this.f41284c.add(bVar);
        }

        public C5233c c() {
            return this.f41282a;
        }

        public Set d() {
            return this.f41283b;
        }

        public boolean e() {
            return this.f41283b.isEmpty();
        }

        public boolean f() {
            return this.f41284c.isEmpty();
        }

        public void g(b bVar) {
            this.f41284c.remove(bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final E f41285a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f41286b;

        public boolean equals(Object obj) {
            if (obj instanceof c) {
                c cVar = (c) obj;
                if (cVar.f41285a.equals(this.f41285a) && cVar.f41286b == this.f41286b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Boolean.valueOf(this.f41286b).hashCode() ^ ((this.f41285a.hashCode() ^ 1000003) * 1000003);
        }

        public c(E e10, boolean z10) {
            this.f41285a = e10;
            this.f41286b = z10;
        }
    }

    public static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i10 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i10++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i10 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new r(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (q qVar : bVar.c().g()) {
                            if (qVar.e() && (set = (Set) map.get(new c(qVar.c(), qVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C5233c c5233c = (C5233c) it.next();
            b bVar3 = new b(c5233c);
            for (E e10 : c5233c.j()) {
                c cVar = new c(e10, !c5233c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f41286b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", e10));
                }
                set2.add(bVar3);
            }
        }
    }
}
