package K7;

import K7.I;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: K7.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1066f implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Collection f7669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f7670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Collection f7671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient Map f7672d;

    /* JADX INFO: renamed from: K7.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a extends I.b {
        public a() {
        }

        @Override // K7.I.b
        public G c() {
            return AbstractC1066f.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1066f.this.i();
        }
    }

    /* JADX INFO: renamed from: K7.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class b extends AbstractCollection {
        public b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractC1066f.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC1066f.this.d(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return AbstractC1066f.this.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractC1066f.this.size();
        }
    }

    @Override // K7.G
    public Collection a() {
        Collection collection = this.f7669a;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.f7669a = collectionF;
        return collectionF;
    }

    @Override // K7.G
    public Map b() {
        Map map = this.f7672d;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f7672d = mapE;
        return mapE;
    }

    @Override // K7.G
    public boolean c(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.contains(obj2);
    }

    public boolean d(Object obj) {
        Iterator it = b().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map e();

    public boolean equals(Object obj) {
        return I.a(this, obj);
    }

    public abstract Collection f();

    public abstract Set g();

    public abstract Collection h();

    public int hashCode() {
        return b().hashCode();
    }

    public abstract Iterator i();

    public abstract Iterator j();

    @Override // K7.G
    public Set keySet() {
        Set set = this.f7670b;
        if (set != null) {
            return set;
        }
        Set setG = g();
        this.f7670b = setG;
        return setG;
    }

    @Override // K7.G
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) b().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public String toString() {
        return b().toString();
    }

    @Override // K7.G
    public Collection values() {
        Collection collection = this.f7671c;
        if (collection != null) {
            return collection;
        }
        Collection collectionH = h();
        this.f7671c = collectionH;
        return collectionH;
    }
}
