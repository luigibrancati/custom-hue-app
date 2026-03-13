package jd;

import Od.C;
import com.fasterxml.jackson.core.JsonPointer;
import gc.C4179C;
import gc.C4206t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import pc.AbstractC5459c;

/* JADX INFO: renamed from: jd.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4761b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4761b f39154a = new C4761b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f39155b = C4179C.q0(C4206t.n('k', 'o', 't', 'l', 'i', 'n'), "", null, null, 0, null, null, 62, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f39156c;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listN = C4206t.n("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iC = AbstractC5459c.c(0, listN.size() - 1, 2);
        if (iC >= 0) {
            int i10 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f39155b;
                sb2.append(str);
                sb2.append(JsonPointer.SEPARATOR);
                sb2.append((String) listN.get(i10));
                int i11 = i10 + 1;
                linkedHashMap.put(sb2.toString(), listN.get(i11));
                linkedHashMap.put(str + JsonPointer.SEPARATOR + ((String) listN.get(i10)) + "Array", '[' + ((String) listN.get(i11)));
                if (i10 == iC) {
                    break;
                } else {
                    i10 += 2;
                }
            }
        }
        linkedHashMap.put(f39155b + "/Unit", "V");
        a(linkedHashMap, "Any", "java/lang/Object");
        a(linkedHashMap, "Nothing", "java/lang/Void");
        a(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : C4206t.n("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            a(linkedHashMap, str2, "java/lang/" + str2);
        }
        for (String str3 : C4206t.n("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            a(linkedHashMap, "collections/" + str3, "java/util/" + str3);
            a(linkedHashMap, "collections/Mutable" + str3, "java/util/" + str3);
        }
        a(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        a(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        a(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i12 = 0; i12 < 23; i12++) {
            StringBuilder sb3 = new StringBuilder();
            String str4 = f39155b;
            sb3.append(str4);
            sb3.append("/jvm/functions/Function");
            sb3.append(i12);
            a(linkedHashMap, "Function" + i12, sb3.toString());
            a(linkedHashMap, "reflect/KFunction" + i12, str4 + "/reflect/KFunction");
        }
        for (String str5 : C4206t.n("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            a(linkedHashMap, str5 + ".Companion", f39155b + "/jvm/internal/" + str5 + "CompanionObject");
        }
        f39156c = linkedHashMap;
    }

    public static final void a(Map map, String str, String str2) {
        map.put(f39155b + JsonPointer.SEPARATOR + str, 'L' + str2 + ';');
    }

    public static final String b(String classId) {
        AbstractC4862t.e(classId, "classId");
        String str = (String) f39156c.get(classId);
        if (str != null) {
            return str;
        }
        return 'L' + C.K(classId, '.', '$', false, 4, null) + ';';
    }
}
