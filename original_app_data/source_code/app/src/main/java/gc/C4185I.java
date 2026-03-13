package gc;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.I, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4185I {
    public static Map a(InterfaceC4184H interfaceC4184H) {
        AbstractC4862t.e(interfaceC4184H, "<this>");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itB = interfaceC4184H.b();
        while (itB.hasNext()) {
            Object objA = interfaceC4184H.a(itB.next());
            Object j10 = linkedHashMap.get(objA);
            if (j10 == null && !linkedHashMap.containsKey(objA)) {
                j10 = new kotlin.jvm.internal.J();
            }
            kotlin.jvm.internal.J j11 = (kotlin.jvm.internal.J) j10;
            j11.f39774a++;
            linkedHashMap.put(objA, j11);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AbstractC4862t.c(entry, "null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace>");
            kotlin.jvm.internal.T.d(entry).setValue(Integer.valueOf(((kotlin.jvm.internal.J) entry.getValue()).f39774a));
        }
        return kotlin.jvm.internal.T.c(linkedHashMap);
    }
}
