package N6;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class F0 extends AbstractMap {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f9716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Collection f9717b;

    public abstract Set a();

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.f9716a;
        if (set != null) {
            return set;
        }
        Set setA = a();
        this.f9716a = setA;
        return setA;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.f9717b;
        if (collection != null) {
            return collection;
        }
        E0 e02 = new E0(this);
        this.f9717b = e02;
        return e02;
    }
}
