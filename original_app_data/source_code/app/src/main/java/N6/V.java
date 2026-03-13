package N6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class V implements H0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Collection f10091a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Set f10092b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient Map f10093c;

    public abstract Collection b();

    public abstract Iterator c();

    public abstract Map d();

    public abstract Set e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof H0) {
            return u().equals(((H0) obj).u());
        }
        return false;
    }

    public final Collection g() {
        Collection collection = this.f10091a;
        if (collection != null) {
            return collection;
        }
        Collection collectionB = b();
        this.f10091a = collectionB;
        return collectionB;
    }

    public final int hashCode() {
        return u().hashCode();
    }

    @Override // N6.H0
    public final Set l() {
        Set set = this.f10092b;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.f10092b = setE;
        return setE;
    }

    public final String toString() {
        return u().toString();
    }

    @Override // N6.H0
    public final Map u() {
        Map map = this.f10093c;
        if (map != null) {
            return map;
        }
        Map mapD = d();
        this.f10093c = mapD;
        return mapD;
    }

    @Override // N6.H0
    public final boolean v(Object obj, Object obj2) {
        Collection collection = ((I) u()).get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // N6.H0
    public final boolean w(Object obj, Object obj2) {
        Collection collection = ((I) u()).get(obj);
        return collection != null && collection.remove(obj2);
    }
}
