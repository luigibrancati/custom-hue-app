package hc;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {
    public static final Object[] d(int i10) {
        if (i10 >= 0) {
            return new Object[i10];
        }
        throw new IllegalArgumentException("capacity must be non-negative.");
    }

    public static final Object[] e(Object[] objArr, int i10) {
        AbstractC4862t.e(objArr, "<this>");
        Object[] objArrCopyOf = Arrays.copyOf(objArr, i10);
        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static final void f(Object[] objArr, int i10) {
        AbstractC4862t.e(objArr, "<this>");
        objArr[i10] = null;
    }

    public static final void g(Object[] objArr, int i10, int i11) {
        AbstractC4862t.e(objArr, "<this>");
        while (i10 < i11) {
            f(objArr, i10);
            i10++;
        }
    }

    public static final boolean h(Object[] objArr, int i10, int i11, List list) {
        if (i11 != list.size()) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (!AbstractC4862t.a(objArr[i10 + i12], list.get(i12))) {
                return false;
            }
        }
        return true;
    }

    public static final int i(Object[] objArr, int i10, int i11) {
        int iHashCode = 1;
        for (int i12 = 0; i12 < i11; i12++) {
            Object obj = objArr[i10 + i12];
            iHashCode = (iHashCode * 31) + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public static final String j(Object[] objArr, int i10, int i11, Collection collection) {
        StringBuilder sb2 = new StringBuilder((i11 * 3) + 2);
        sb2.append("[");
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            Object obj = objArr[i10 + i12];
            if (obj == collection) {
                sb2.append("(this Collection)");
            } else {
                sb2.append(obj);
            }
        }
        sb2.append("]");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        return string;
    }
}
