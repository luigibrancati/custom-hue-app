package kd;

import fc.AbstractC4040w;
import fc.C4034q;
import gc.C4207u;
import gc.P;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f39663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f39664b;

    static {
        c cVar = new c("java.lang");
        f39663a = cVar;
        c cVarC = cVar.c(f.s("annotation"));
        AbstractC4862t.d(cVarC, "JAVA_LANG_PACKAGE.child(…identifier(\"annotation\"))");
        f39664b = cVarC;
    }

    public static final b k(String str) {
        return new b(i.f39611a.b(), f.s(str));
    }

    public static final b l(String str) {
        return new b(i.f39611a.f(), f.s(str));
    }

    public static final b m(String str) {
        return new b(i.f39611a.c(), f.s(str));
    }

    public static final b n(String str) {
        return new b(i.f39611a.d(), f.s(str));
    }

    public static final b o(String str) {
        return new b(i.f39611a.e(), f.s(str));
    }

    public static final Map p(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(Bc.k.e(P.e(C4207u.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            C4034q c4034qA = AbstractC4040w.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(c4034qA.e(), c4034qA.f());
        }
        return linkedHashMap;
    }

    public static final b q(f fVar) {
        i iVar = i.f39611a;
        return new b(iVar.a().h(), f.s(fVar.p() + iVar.a().j().p()));
    }

    public static final b r(String str) {
        return new b(i.f39611a.g(), f.s(str));
    }

    public static final b s(String str) {
        return new b(i.f39611a.h(), f.s(str));
    }

    public static final b t(b bVar) {
        return new b(i.f39611a.f(), f.s('U' + bVar.j().p()));
    }
}
