package K7;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: renamed from: K7.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1075o extends M implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator[] f7707a;

    public C1075o(Comparator comparator, Comparator comparator2) {
        this.f7707a = new Comparator[]{comparator, comparator2};
    }

    @Override // K7.M, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f7707a;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C1075o) {
            return Arrays.equals(this.f7707a, ((C1075o) obj).f7707a);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f7707a);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f7707a) + ")";
    }
}
