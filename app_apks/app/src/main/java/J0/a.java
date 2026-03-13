package J0;

import X0.e;
import X0.f;
import b0.J;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f5857a = new f(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f5858b = new J();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f5859c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f5860d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.f5858b.containsKey(obj) || !this.f5858b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f5858b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f5858b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f5858b.containsKey(obj)) {
            return;
        }
        this.f5858b.put(obj, null);
    }

    public void c() {
        int size = this.f5858b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f5858b.j(i10);
            if (arrayList != null) {
                j(arrayList);
            }
        }
        this.f5858b.clear();
    }

    public boolean d(Object obj) {
        return this.f5858b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f5858b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(arrayList2.get(i10), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f5857a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        int size = this.f5858b.size();
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList2 = (ArrayList) this.f5858b.j(i10);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f5858b.f(i10));
            }
        }
        return arrayList;
    }

    public ArrayList h() {
        this.f5859c.clear();
        this.f5860d.clear();
        int size = this.f5858b.size();
        for (int i10 = 0; i10 < size; i10++) {
            e(this.f5858b.f(i10), this.f5859c, this.f5860d);
        }
        return this.f5859c;
    }

    public boolean i(Object obj) {
        int size = this.f5858b.size();
        for (int i10 = 0; i10 < size; i10++) {
            ArrayList arrayList = (ArrayList) this.f5858b.j(i10);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void j(ArrayList arrayList) {
        arrayList.clear();
        this.f5857a.a(arrayList);
    }
}
