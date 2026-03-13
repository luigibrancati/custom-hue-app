package u9;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class g extends j implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f45470a = new ArrayList();

    @Override // u9.j
    public boolean c() {
        return s().c();
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof g) && ((g) obj).f45470a.equals(this.f45470a);
        }
        return true;
    }

    @Override // u9.j
    public String h() {
        return s().h();
    }

    public int hashCode() {
        return this.f45470a.hashCode();
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f45470a.iterator();
    }

    public void r(j jVar) {
        if (jVar == null) {
            jVar = l.f45471a;
        }
        this.f45470a.add(jVar);
    }

    public final j s() {
        int size = this.f45470a.size();
        if (size == 1) {
            return (j) this.f45470a.get(0);
        }
        throw new IllegalStateException("Array must have size 1, but has size " + size);
    }
}
