package defpackage;

import android.util.Log;
import gc.C4204q;
import gc.C4206t;
import gc.M;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f38859a = new j();

    public final boolean a(Object obj, Object obj2) {
        if ((obj instanceof byte[]) && (obj2 instanceof byte[])) {
            return Arrays.equals((byte[]) obj, (byte[]) obj2);
        }
        if ((obj instanceof int[]) && (obj2 instanceof int[])) {
            return Arrays.equals((int[]) obj, (int[]) obj2);
        }
        if ((obj instanceof long[]) && (obj2 instanceof long[])) {
            return Arrays.equals((long[]) obj, (long[]) obj2);
        }
        if ((obj instanceof double[]) && (obj2 instanceof double[])) {
            return Arrays.equals((double[]) obj, (double[]) obj2);
        }
        if ((obj instanceof Object[]) && (obj2 instanceof Object[])) {
            Object[] objArr = (Object[]) obj;
            Object[] objArr2 = (Object[]) obj2;
            if (objArr.length == objArr2.length) {
                Iterable iterableW = C4204q.W(objArr);
                if (!(iterableW instanceof Collection) || !((Collection) iterableW).isEmpty()) {
                    Iterator it = iterableW.iterator();
                    while (it.hasNext()) {
                        int iNextInt = ((M) it).nextInt();
                        if (!f38859a.a(objArr[iNextInt], objArr2[iNextInt])) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if ((obj instanceof List) && (obj2 instanceof List)) {
            List list = (List) obj;
            List list2 = (List) obj2;
            if (list.size() == list2.size()) {
                Iterable iterableL = C4206t.l((Collection) obj);
                if (!(iterableL instanceof Collection) || !((Collection) iterableL).isEmpty()) {
                    Iterator it2 = iterableL.iterator();
                    while (it2.hasNext()) {
                        int iNextInt2 = ((M) it2).nextInt();
                        if (!f38859a.a(list.get(iNextInt2), list2.get(iNextInt2))) {
                        }
                    }
                }
                return true;
            }
            return false;
        }
        if (!(obj instanceof Map) || !(obj2 instanceof Map)) {
            return AbstractC4862t.a(obj, obj2);
        }
        Map map = (Map) obj;
        Map map2 = (Map) obj2;
        if (map.size() == map2.size()) {
            if (!map.isEmpty()) {
                for (Map.Entry entry : map.entrySet()) {
                    if (!map2.containsKey(entry.getKey()) || !f38859a.a(entry.getValue(), map2.get(entry.getKey()))) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final List b(Throwable exception) {
        AbstractC4862t.e(exception, "exception");
        return C4206t.n(exception.getClass().getSimpleName(), exception.toString(), "Cause: " + exception.getCause() + ", Stacktrace: " + Log.getStackTraceString(exception));
    }
}
