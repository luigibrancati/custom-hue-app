package Uc;

import fc.AbstractC4040w;
import gc.Q;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f16929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f16930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f16931c;

    static {
        m mVar = new m();
        f16929a = mVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        f16930b = linkedHashMap;
        kd.i iVar = kd.i.f39611a;
        mVar.c(iVar.l(), mVar.a("java.util.ArrayList", "java.util.LinkedList"));
        mVar.c(iVar.n(), mVar.a("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        mVar.c(iVar.m(), mVar.a("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        kd.b bVarM = kd.b.m(new kd.c("java.util.function.Function"));
        AbstractC4862t.d(bVarM, "topLevel(FqName(\"java.util.function.Function\"))");
        mVar.c(bVarM, mVar.a("java.util.function.UnaryOperator"));
        kd.b bVarM2 = kd.b.m(new kd.c("java.util.function.BiFunction"));
        AbstractC4862t.d(bVarM2, "topLevel(FqName(\"java.util.function.BiFunction\"))");
        mVar.c(bVarM2, mVar.a("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(AbstractC4040w.a(((kd.b) entry.getKey()).b(), ((kd.b) entry.getValue()).b()));
        }
        f16931c = Q.s(arrayList);
    }

    public final List a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(kd.b.m(new kd.c(str)));
        }
        return arrayList;
    }

    public final kd.c b(kd.c classFqName) {
        AbstractC4862t.e(classFqName, "classFqName");
        return (kd.c) f16931c.get(classFqName);
    }

    public final void c(kd.b bVar, List list) {
        Map map = f16930b;
        for (Object obj : list) {
            map.put(obj, bVar);
        }
    }
}
