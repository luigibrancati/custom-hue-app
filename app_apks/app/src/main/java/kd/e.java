package kd;

import Od.C;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39561a;

        static {
            int[] iArr = new int[k.values().length];
            try {
                iArr[k.BEGINNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[k.AFTER_DOT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[k.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39561a = iArr;
        }
    }

    public static final Object a(c cVar, Map values) {
        Object next;
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(values, "values");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : values.entrySet()) {
            c cVar2 = (c) entry.getKey();
            if (AbstractC4862t.a(cVar, cVar2) || b(cVar, cVar2)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (linkedHashMap.isEmpty()) {
            linkedHashMap = null;
        }
        if (linkedHashMap == null) {
            return null;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int length = g((c) ((Map.Entry) next).getKey(), cVar).b().length();
                do {
                    Object next2 = it.next();
                    int length2 = g((c) ((Map.Entry) next2).getKey(), cVar).b().length();
                    if (length > length2) {
                        next = next2;
                        length = length2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry2 = (Map.Entry) next;
        if (entry2 != null) {
            return entry2.getValue();
        }
        return null;
    }

    public static final boolean b(c cVar, c packageName) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(packageName, "packageName");
        return AbstractC4862t.a(f(cVar), packageName);
    }

    public static final boolean c(String str, String str2) {
        return C.P(str, str2, false, 2, null) && str.charAt(str2.length()) == '.';
    }

    public static final boolean d(c cVar, c packageName) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(packageName, "packageName");
        if (AbstractC4862t.a(cVar, packageName) || packageName.d()) {
            return true;
        }
        String strB = cVar.b();
        AbstractC4862t.d(strB, "this.asString()");
        String strB2 = packageName.b();
        AbstractC4862t.d(strB2, "packageName.asString()");
        return c(strB, strB2);
    }

    public static final boolean e(String str) {
        if (str == null) {
            return false;
        }
        k kVar = k.BEGINNING;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            int i11 = a.f39561a[kVar.ordinal()];
            if (i11 == 1 || i11 == 2) {
                if (!Character.isJavaIdentifierPart(cCharAt)) {
                    return false;
                }
                kVar = k.MIDDLE;
            } else if (i11 != 3) {
                continue;
            } else if (cCharAt == '.') {
                kVar = k.AFTER_DOT;
            } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                return false;
            }
        }
        return kVar != k.AFTER_DOT;
    }

    public static final c f(c cVar) {
        AbstractC4862t.e(cVar, "<this>");
        if (cVar.d()) {
            return null;
        }
        return cVar.e();
    }

    public static final c g(c cVar, c prefix) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(prefix, "prefix");
        if (!d(cVar, prefix) || prefix.d()) {
            return cVar;
        }
        if (AbstractC4862t.a(cVar, prefix)) {
            c ROOT = c.f39551c;
            AbstractC4862t.d(ROOT, "ROOT");
            return ROOT;
        }
        String strB = cVar.b();
        AbstractC4862t.d(strB, "asString()");
        String strSubstring = strB.substring(prefix.b().length() + 1);
        AbstractC4862t.d(strSubstring, "this as java.lang.String).substring(startIndex)");
        return new c(strSubstring);
    }
}
