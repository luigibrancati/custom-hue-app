package E;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: E.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0817v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C0817v f3027c = new a().b(0).a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0817v f3028d = new a().b(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f3029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3030b;

    /* JADX INFO: renamed from: E.v$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final LinkedHashSet f3031a = new LinkedHashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3032b;

        public C0817v a() {
            return new C0817v(this.f3031a, this.f3032b);
        }

        public a b(int i10) {
            X0.h.j(i10 != -1, "The specified lens facing is invalid.");
            this.f3031a.add(new L.B0(i10));
            return this;
        }
    }

    public C0817v(LinkedHashSet linkedHashSet, String str) {
        this.f3029a = linkedHashSet;
        this.f3030b = str;
    }

    public LinkedHashSet a(LinkedHashSet linkedHashSet) {
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(((L.J) it.next()).b());
        }
        List listB = b(arrayList);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            L.J j10 = (L.J) it2.next();
            if (listB.contains(j10.b())) {
                linkedHashSet2.add(j10);
            }
        }
        return linkedHashSet2;
    }

    public List b(List list) {
        List arrayList = new ArrayList(list);
        Iterator it = this.f3029a.iterator();
        while (it.hasNext()) {
            arrayList = ((InterfaceC0811s) it.next()).b(Collections.unmodifiableList(arrayList));
        }
        arrayList.retainAll(list);
        return arrayList;
    }

    public LinkedHashSet c() {
        return this.f3029a;
    }

    public Integer d() {
        Integer num = null;
        for (InterfaceC0811s interfaceC0811s : this.f3029a) {
            if (interfaceC0811s instanceof L.B0) {
                Integer numValueOf = Integer.valueOf(((L.B0) interfaceC0811s).c());
                if (num == null) {
                    num = numValueOf;
                } else if (!num.equals(numValueOf)) {
                    throw new IllegalStateException("Multiple conflicting lens facing requirements exist.");
                }
            }
        }
        return num;
    }

    public final String e(Set set) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cams:");
        sb2.append(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            L.I i10 = ((L.J) it.next()).i();
            sb2.append(String.format(" Id:%s  Lens:%s", i10.d(), Integer.valueOf(i10.f())));
        }
        return sb2.toString();
    }

    public final String f() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(String.format("PhyId:%s  Filters:%s", this.f3030b, Integer.valueOf(this.f3029a.size())));
        for (InterfaceC0811s interfaceC0811s : this.f3029a) {
            sb2.append(" Id:");
            sb2.append(interfaceC0811s.a());
            if (interfaceC0811s instanceof L.B0) {
                sb2.append(" LensFilter:");
                sb2.append(((L.B0) interfaceC0811s).c());
            }
        }
        return sb2.toString();
    }

    public L.J g(LinkedHashSet linkedHashSet) {
        Iterator it = a(linkedHashSet).iterator();
        if (it.hasNext()) {
            return (L.J) it.next();
        }
        throw new IllegalArgumentException(String.format("No available camera can be found. %s %s", e(linkedHashSet), f()));
    }
}
