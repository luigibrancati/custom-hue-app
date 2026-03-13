package ie;

import de.AbstractC3918a;
import fc.C4009B;
import fc.C4012E;
import fc.C4041x;
import fc.C4043z;
import gc.U;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f37514a = U.h(AbstractC3918a.u(C4043z.f34293b).getDescriptor(), AbstractC3918a.v(C4009B.f34243b).getDescriptor(), AbstractC3918a.t(C4041x.f34288b).getDescriptor(), AbstractC3918a.w(C4012E.f34249b).getDescriptor());

    public static final boolean a(ee.e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        return eVar.isInline() && AbstractC4862t.a(eVar, he.i.h());
    }

    public static final boolean b(ee.e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        return eVar.isInline() && f37514a.contains(eVar);
    }
}
