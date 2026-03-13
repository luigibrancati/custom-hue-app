package rd;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: rd.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5697a implements Comparable {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(AbstractC5697a other) {
        AbstractC4862t.e(other, "other");
        int iCompareTo = b().compareTo(other.b());
        if (iCompareTo == 0 && !j() && other.j()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract EnumC5698b b();

    public abstract boolean j();
}
