package K7;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class M implements Comparator {
    public static M b(Comparator comparator) {
        return comparator instanceof M ? (M) comparator : new C1073m(comparator);
    }

    public static M d() {
        return J.f7592a;
    }

    public M a(Comparator comparator) {
        return new C1075o(this, (Comparator) J7.n.j(comparator));
    }

    public AbstractC1081v c(Iterable iterable) {
        return AbstractC1081v.M(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public M e() {
        return f(F.e());
    }

    public M f(J7.f fVar) {
        return new C1068h(fVar, this);
    }

    public M g() {
        return new T(this);
    }
}
