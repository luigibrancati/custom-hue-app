package gc;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4205s {
    public static List a(List builder) {
        AbstractC4862t.e(builder, "builder");
        return ((hc.b) builder).w();
    }

    public static final Object[] b(Object[] objArr, boolean z10) {
        AbstractC4862t.e(objArr, "<this>");
        if (z10 && AbstractC4862t.a(objArr.getClass(), Object[].class)) {
            return objArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length, Object[].class);
        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    public static List c() {
        return new hc.b(0, 1, null);
    }

    public static List d(Object obj) {
        List listSingletonList = Collections.singletonList(obj);
        AbstractC4862t.d(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    public static Object[] e(int i10, Object[] array) {
        AbstractC4862t.e(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }
}
