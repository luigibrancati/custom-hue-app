package Uc;

import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4179C;
import gc.C4207u;
import gc.P;
import gc.Q;
import gc.U;
import gc.V;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import td.EnumC5882e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f16886a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f16887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List f16888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List f16889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Map f16890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f16891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Set f16892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Set f16893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a.C0211a f16894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Map f16895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Map f16896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final List f16897l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Map f16898m;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: Uc.I$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0211a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final kd.f f16899a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f16900b;

            public C0211a(kd.f name, String signature) {
                AbstractC4862t.e(name, "name");
                AbstractC4862t.e(signature, "signature");
                this.f16899a = name;
                this.f16900b = signature;
            }

            public final kd.f a() {
                return this.f16899a;
            }

            public final String b() {
                return this.f16900b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0211a)) {
                    return false;
                }
                C0211a c0211a = (C0211a) obj;
                return AbstractC4862t.a(this.f16899a, c0211a.f16899a) && AbstractC4862t.a(this.f16900b, c0211a.f16900b);
            }

            public int hashCode() {
                return (this.f16899a.hashCode() * 31) + this.f16900b.hashCode();
            }

            public String toString() {
                return "NameAndSignature(name=" + this.f16899a + ", signature=" + this.f16900b + ')';
            }
        }

        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final kd.f b(kd.f name) {
            AbstractC4862t.e(name, "name");
            return (kd.f) f().get(name);
        }

        public final List c() {
            return I.f16888c;
        }

        public final Set d() {
            return I.f16892g;
        }

        public final Set e() {
            return I.f16893h;
        }

        public final Map f() {
            return I.f16898m;
        }

        public final List g() {
            return I.f16897l;
        }

        public final C0211a h() {
            return I.f16894i;
        }

        public final Map i() {
            return I.f16891f;
        }

        public final Map j() {
            return I.f16896k;
        }

        public final boolean k(kd.f fVar) {
            AbstractC4862t.e(fVar, "<this>");
            return g().contains(fVar);
        }

        public final b l(String builtinSignature) {
            AbstractC4862t.e(builtinSignature, "builtinSignature");
            return c().contains(builtinSignature) ? b.ONE_COLLECTION_PARAMETER : ((c) Q.j(i(), builtinSignature)) == c.NULL ? b.OBJECT_PARAMETER_GENERIC : b.OBJECT_PARAMETER_NON_GENERIC;
        }

        public final C0211a m(String str, String str2, String str3, String str4) {
            kd.f fVarS = kd.f.s(str2);
            AbstractC4862t.d(fVarS, "identifier(name)");
            return new C0211a(fVarS, dd.y.f33464a.k(str, str2 + '(' + str3 + ')' + str4));
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        ONE_COLLECTION_PARAMETER("Ljava/util/Collection<+Ljava/lang/Object;>;", false),
        OBJECT_PARAMETER_NON_GENERIC(null, true),
        OBJECT_PARAMETER_GENERIC("Ljava/lang/Object;", true);

        private final boolean isObjectReplacedWithTypeParameter;
        private final String valueParametersSignature;

        b(String str, boolean z10) {
            this.valueParametersSignature = str;
            this.isObjectReplacedWithTypeParameter = z10;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {
        private final Object defaultValue;
        public static final c NULL = new c("NULL", 0, null);
        public static final c INDEX = new c("INDEX", 1, -1);
        public static final c FALSE = new c("FALSE", 2, Boolean.FALSE);
        public static final c MAP_GET_OR_DEFAULT = new a("MAP_GET_OR_DEFAULT", 3);
        private static final /* synthetic */ c[] $VALUES = a();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends c {
            /* JADX WARN: Illegal instructions before constructor call */
            public a(String str, int i10) {
                AbstractC4854k abstractC4854k = null;
                super(str, i10, abstractC4854k, abstractC4854k);
            }
        }

        public /* synthetic */ c(String str, int i10, Object obj, AbstractC4854k abstractC4854k) {
            this(str, i10, obj);
        }

        public static final /* synthetic */ c[] a() {
            return new c[]{NULL, INDEX, FALSE, MAP_GET_OR_DEFAULT};
        }

        public static c valueOf(String str) {
            return (c) Enum.valueOf(c.class, str);
        }

        public static c[] values() {
            return (c[]) $VALUES.clone();
        }

        public c(String str, int i10, Object obj) {
            this.defaultValue = obj;
        }
    }

    static {
        Set<String> setH = U.h("containsAll", "removeAll", "retainAll");
        ArrayList arrayList = new ArrayList(C4207u.v(setH, 10));
        for (String str : setH) {
            a aVar = f16886a;
            String strP = EnumC5882e.BOOLEAN.p();
            AbstractC4862t.d(strP, "BOOLEAN.desc");
            arrayList.add(aVar.m("java/util/Collection", str, "Ljava/util/Collection;", strP));
        }
        f16887b = arrayList;
        ArrayList arrayList2 = new ArrayList(C4207u.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((a.C0211a) it.next()).b());
        }
        f16888c = arrayList2;
        List list = f16887b;
        ArrayList arrayList3 = new ArrayList(C4207u.v(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((a.C0211a) it2.next()).a().b());
        }
        f16889d = arrayList3;
        dd.y yVar = dd.y.f33464a;
        a aVar2 = f16886a;
        String strI = yVar.i("Collection");
        EnumC5882e enumC5882e = EnumC5882e.BOOLEAN;
        String strP2 = enumC5882e.p();
        AbstractC4862t.d(strP2, "BOOLEAN.desc");
        a.C0211a c0211aM = aVar2.m(strI, "contains", "Ljava/lang/Object;", strP2);
        c cVar = c.FALSE;
        C4034q c4034qA = AbstractC4040w.a(c0211aM, cVar);
        String strI2 = yVar.i("Collection");
        String strP3 = enumC5882e.p();
        AbstractC4862t.d(strP3, "BOOLEAN.desc");
        C4034q c4034qA2 = AbstractC4040w.a(aVar2.m(strI2, "remove", "Ljava/lang/Object;", strP3), cVar);
        String strI3 = yVar.i("Map");
        String strP4 = enumC5882e.p();
        AbstractC4862t.d(strP4, "BOOLEAN.desc");
        C4034q c4034qA3 = AbstractC4040w.a(aVar2.m(strI3, "containsKey", "Ljava/lang/Object;", strP4), cVar);
        String strI4 = yVar.i("Map");
        String strP5 = enumC5882e.p();
        AbstractC4862t.d(strP5, "BOOLEAN.desc");
        C4034q c4034qA4 = AbstractC4040w.a(aVar2.m(strI4, "containsValue", "Ljava/lang/Object;", strP5), cVar);
        String strI5 = yVar.i("Map");
        String strP6 = enumC5882e.p();
        AbstractC4862t.d(strP6, "BOOLEAN.desc");
        C4034q c4034qA5 = AbstractC4040w.a(aVar2.m(strI5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", strP6), cVar);
        C4034q c4034qA6 = AbstractC4040w.a(aVar2.m(yVar.i("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), c.MAP_GET_OR_DEFAULT);
        a.C0211a c0211aM2 = aVar2.m(yVar.i("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;");
        c cVar2 = c.NULL;
        C4034q c4034qA7 = AbstractC4040w.a(c0211aM2, cVar2);
        C4034q c4034qA8 = AbstractC4040w.a(aVar2.m(yVar.i("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), cVar2);
        String strI6 = yVar.i("List");
        EnumC5882e enumC5882e2 = EnumC5882e.INT;
        String strP7 = enumC5882e2.p();
        AbstractC4862t.d(strP7, "INT.desc");
        a.C0211a c0211aM3 = aVar2.m(strI6, "indexOf", "Ljava/lang/Object;", strP7);
        c cVar3 = c.INDEX;
        C4034q c4034qA9 = AbstractC4040w.a(c0211aM3, cVar3);
        String strI7 = yVar.i("List");
        String strP8 = enumC5882e2.p();
        AbstractC4862t.d(strP8, "INT.desc");
        Map mapL = Q.l(c4034qA, c4034qA2, c4034qA3, c4034qA4, c4034qA5, c4034qA6, c4034qA7, c4034qA8, c4034qA9, AbstractC4040w.a(aVar2.m(strI7, "lastIndexOf", "Ljava/lang/Object;", strP8), cVar3));
        f16890e = mapL;
        LinkedHashMap linkedHashMap = new LinkedHashMap(P.e(mapL.size()));
        for (Map.Entry entry : mapL.entrySet()) {
            linkedHashMap.put(((a.C0211a) entry.getKey()).b(), entry.getValue());
        }
        f16891f = linkedHashMap;
        Set setK = V.k(f16890e.keySet(), f16887b);
        ArrayList arrayList4 = new ArrayList(C4207u.v(setK, 10));
        Iterator it3 = setK.iterator();
        while (it3.hasNext()) {
            arrayList4.add(((a.C0211a) it3.next()).a());
        }
        f16892g = C4179C.Z0(arrayList4);
        ArrayList arrayList5 = new ArrayList(C4207u.v(setK, 10));
        Iterator it4 = setK.iterator();
        while (it4.hasNext()) {
            arrayList5.add(((a.C0211a) it4.next()).b());
        }
        f16893h = C4179C.Z0(arrayList5);
        a aVar3 = f16886a;
        EnumC5882e enumC5882e3 = EnumC5882e.INT;
        String strP9 = enumC5882e3.p();
        AbstractC4862t.d(strP9, "INT.desc");
        a.C0211a c0211aM4 = aVar3.m("java/util/List", "removeAt", strP9, "Ljava/lang/Object;");
        f16894i = c0211aM4;
        dd.y yVar2 = dd.y.f33464a;
        String strH = yVar2.h("Number");
        String strP10 = EnumC5882e.BYTE.p();
        AbstractC4862t.d(strP10, "BYTE.desc");
        C4034q c4034qA10 = AbstractC4040w.a(aVar3.m(strH, "toByte", "", strP10), kd.f.s("byteValue"));
        String strH2 = yVar2.h("Number");
        String strP11 = EnumC5882e.SHORT.p();
        AbstractC4862t.d(strP11, "SHORT.desc");
        C4034q c4034qA11 = AbstractC4040w.a(aVar3.m(strH2, "toShort", "", strP11), kd.f.s("shortValue"));
        String strH3 = yVar2.h("Number");
        String strP12 = enumC5882e3.p();
        AbstractC4862t.d(strP12, "INT.desc");
        C4034q c4034qA12 = AbstractC4040w.a(aVar3.m(strH3, "toInt", "", strP12), kd.f.s("intValue"));
        String strH4 = yVar2.h("Number");
        String strP13 = EnumC5882e.LONG.p();
        AbstractC4862t.d(strP13, "LONG.desc");
        C4034q c4034qA13 = AbstractC4040w.a(aVar3.m(strH4, "toLong", "", strP13), kd.f.s("longValue"));
        String strH5 = yVar2.h("Number");
        String strP14 = EnumC5882e.FLOAT.p();
        AbstractC4862t.d(strP14, "FLOAT.desc");
        C4034q c4034qA14 = AbstractC4040w.a(aVar3.m(strH5, "toFloat", "", strP14), kd.f.s("floatValue"));
        String strH6 = yVar2.h("Number");
        String strP15 = EnumC5882e.DOUBLE.p();
        AbstractC4862t.d(strP15, "DOUBLE.desc");
        C4034q c4034qA15 = AbstractC4040w.a(aVar3.m(strH6, "toDouble", "", strP15), kd.f.s("doubleValue"));
        C4034q c4034qA16 = AbstractC4040w.a(c0211aM4, kd.f.s("remove"));
        String strH7 = yVar2.h("CharSequence");
        String strP16 = enumC5882e3.p();
        AbstractC4862t.d(strP16, "INT.desc");
        String strP17 = EnumC5882e.CHAR.p();
        AbstractC4862t.d(strP17, "CHAR.desc");
        Map mapL2 = Q.l(c4034qA10, c4034qA11, c4034qA12, c4034qA13, c4034qA14, c4034qA15, c4034qA16, AbstractC4040w.a(aVar3.m(strH7, "get", strP16, strP17), kd.f.s("charAt")));
        f16895j = mapL2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(P.e(mapL2.size()));
        for (Map.Entry entry2 : mapL2.entrySet()) {
            linkedHashMap2.put(((a.C0211a) entry2.getKey()).b(), entry2.getValue());
        }
        f16896k = linkedHashMap2;
        Set setKeySet = f16895j.keySet();
        ArrayList arrayList6 = new ArrayList(C4207u.v(setKeySet, 10));
        Iterator it5 = setKeySet.iterator();
        while (it5.hasNext()) {
            arrayList6.add(((a.C0211a) it5.next()).a());
        }
        f16897l = arrayList6;
        Set<Map.Entry> setEntrySet = f16895j.entrySet();
        ArrayList<C4034q> arrayList7 = new ArrayList(C4207u.v(setEntrySet, 10));
        for (Map.Entry entry3 : setEntrySet) {
            arrayList7.add(new C4034q(((a.C0211a) entry3.getKey()).a(), entry3.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(arrayList7, 10)), 16));
        for (C4034q c4034q : arrayList7) {
            linkedHashMap3.put((kd.f) c4034q.f(), (kd.f) c4034q.e());
        }
        f16898m = linkedHashMap3;
    }
}
