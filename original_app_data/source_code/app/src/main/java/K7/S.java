package K7;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class S extends M implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final S f7617a = new S();

    @Override // K7.M
    public M g() {
        return M.d();
    }

    @Override // K7.M, java.util.Comparator
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        J7.n.j(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
