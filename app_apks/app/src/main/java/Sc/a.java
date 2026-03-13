package Sc;

import Lc.InterfaceC1177e;
import Lc.K;
import Tc.b;
import Tc.c;
import kd.f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a {
    public static final void a(c cVar, b from, InterfaceC1177e scopeOwner, f name) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(from, "from");
        AbstractC4862t.e(scopeOwner, "scopeOwner");
        AbstractC4862t.e(name, "name");
        if (cVar == c.a.f16354a) {
            return;
        }
        from.a();
    }

    public static final void b(c cVar, b from, K scopeOwner, f name) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(from, "from");
        AbstractC4862t.e(scopeOwner, "scopeOwner");
        AbstractC4862t.e(name, "name");
        String strB = scopeOwner.e().b();
        AbstractC4862t.d(strB, "scopeOwner.fqName.asString()");
        String strB2 = name.b();
        AbstractC4862t.d(strB2, "name.asString()");
        c(cVar, from, strB, strB2);
    }

    public static final void c(c cVar, b from, String packageFqName, String name) {
        AbstractC4862t.e(cVar, "<this>");
        AbstractC4862t.e(from, "from");
        AbstractC4862t.e(packageFqName, "packageFqName");
        AbstractC4862t.e(name, "name");
        if (cVar == c.a.f16354a) {
            return;
        }
        from.a();
    }
}
