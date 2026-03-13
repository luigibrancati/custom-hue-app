package Md;

import gc.C4179C;
import gc.C4205s;
import gc.C4206t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(Collection collection, Object obj) {
        AbstractC4862t.e(collection, "<this>");
        if (obj != null) {
            collection.add(obj);
        }
    }

    public static final int b(int i10) {
        if (i10 < 3) {
            return 3;
        }
        return i10 + (i10 / 3) + 1;
    }

    public static final List c(ArrayList arrayList) {
        AbstractC4862t.e(arrayList, "<this>");
        int size = arrayList.size();
        if (size == 0) {
            return C4206t.k();
        }
        if (size == 1) {
            return C4205s.d(C4179C.h0(arrayList));
        }
        arrayList.trimToSize();
        return arrayList;
    }

    public static final Map d(Iterable iterable) {
        AbstractC4862t.e(iterable, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = iterable.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            linkedHashMap.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return linkedHashMap;
    }

    public static final HashMap e(int i10) {
        return new HashMap(b(i10));
    }

    public static final HashSet f(int i10) {
        return new HashSet(b(i10));
    }

    public static final LinkedHashSet g(int i10) {
        return new LinkedHashSet(b(i10));
    }
}
