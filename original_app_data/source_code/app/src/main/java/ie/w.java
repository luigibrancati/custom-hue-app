package ie;

import ee.k;
import ee.l;
import gc.C4179C;
import gc.Q;
import he.AbstractC4302E;
import he.AbstractC4304b;
import ie.C4392n;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4392n.a f37546a = new C4392n.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C4392n.a f37547b = new C4392n.a();

    public static final Map b(ee.e eVar, AbstractC4304b abstractC4304b) {
        String lowerCase;
        String[] strArrNames;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        boolean zD = d(abstractC4304b, eVar);
        n(eVar, abstractC4304b);
        int iD = eVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            List listG = eVar.g(i10);
            ArrayList arrayList = new ArrayList();
            for (Object obj : listG) {
                if (obj instanceof he.v) {
                    arrayList.add(obj);
                }
            }
            he.v vVar = (he.v) C4179C.H0(arrayList);
            if (vVar != null && (strArrNames = vVar.names()) != null) {
                for (String lowerCase2 : strArrNames) {
                    if (zD) {
                        lowerCase2 = lowerCase2.toLowerCase(Locale.ROOT);
                        AbstractC4862t.d(lowerCase2, "toLowerCase(...)");
                    }
                    c(linkedHashMap, eVar, lowerCase2, i10);
                }
            }
            if (zD) {
                lowerCase = eVar.e(i10).toLowerCase(Locale.ROOT);
                AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                c(linkedHashMap, eVar, lowerCase, i10);
            }
        }
        return linkedHashMap.isEmpty() ? Q.i() : linkedHashMap;
    }

    public static final void c(Map map, ee.e eVar, String str, int i10) {
        String str2 = AbstractC4862t.a(eVar.f(), k.b.f33970a) ? "enum value" : "property";
        if (!map.containsKey(str)) {
            map.put(str, Integer.valueOf(i10));
            return;
        }
        throw new t("The suggested name '" + str + "' for " + str2 + ' ' + eVar.e(i10) + " is already one of the names for " + str2 + ' ' + eVar.e(((Number) Q.j(map, str)).intValue()) + " in " + eVar);
    }

    public static final boolean d(AbstractC4304b abstractC4304b, ee.e eVar) {
        return abstractC4304b.c().h() && AbstractC4862t.a(eVar.f(), k.b.f33970a);
    }

    public static final Map e(final AbstractC4304b abstractC4304b, final ee.e descriptor) {
        AbstractC4862t.e(abstractC4304b, "<this>");
        AbstractC4862t.e(descriptor, "descriptor");
        return (Map) AbstractC4302E.a(abstractC4304b).b(descriptor, f37546a, new InterfaceC6082a() { // from class: ie.v
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return w.f(descriptor, abstractC4304b);
            }
        });
    }

    public static final Map f(ee.e eVar, AbstractC4304b abstractC4304b) {
        return b(eVar, abstractC4304b);
    }

    public static final C4392n.a g() {
        return f37546a;
    }

    public static final String h(ee.e eVar, AbstractC4304b json, int i10) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(json, "json");
        n(eVar, json);
        return eVar.e(i10);
    }

    public static final int i(ee.e eVar, AbstractC4304b json, String name) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(name, "name");
        if (d(json, eVar)) {
            String lowerCase = name.toLowerCase(Locale.ROOT);
            AbstractC4862t.d(lowerCase, "toLowerCase(...)");
            return l(eVar, json, lowerCase);
        }
        n(eVar, json);
        int iC = eVar.c(name);
        return (iC == -3 && json.c().o()) ? l(eVar, json, name) : iC;
    }

    public static final int j(ee.e eVar, AbstractC4304b json, String name, String suffix) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(json, "json");
        AbstractC4862t.e(name, "name");
        AbstractC4862t.e(suffix, "suffix");
        int i10 = i(eVar, json, name);
        if (i10 != -3) {
            return i10;
        }
        throw new ce.f(eVar.i() + " does not contain element with name '" + name + '\'' + suffix);
    }

    public static /* synthetic */ int k(ee.e eVar, AbstractC4304b abstractC4304b, String str, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = "";
        }
        return j(eVar, abstractC4304b, str, str2);
    }

    public static final int l(ee.e eVar, AbstractC4304b abstractC4304b, String str) {
        Integer num = (Integer) e(abstractC4304b, eVar).get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public static final boolean m(ee.e eVar, AbstractC4304b json) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(json, "json");
        if (json.c().k()) {
            return true;
        }
        List annotations = eVar.getAnnotations();
        if (annotations != null && annotations.isEmpty()) {
            return false;
        }
        Iterator it = annotations.iterator();
        while (it.hasNext()) {
            if (((Annotation) it.next()) instanceof he.s) {
                return true;
            }
        }
        return false;
    }

    public static final he.w n(ee.e eVar, AbstractC4304b json) {
        AbstractC4862t.e(eVar, "<this>");
        AbstractC4862t.e(json, "json");
        if (AbstractC4862t.a(eVar.f(), l.a.f33971a)) {
            json.c().l();
        }
        return null;
    }
}
