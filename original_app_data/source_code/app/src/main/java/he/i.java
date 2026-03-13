package he;

import de.AbstractC3918a;
import fc.C4025h;
import ge.AbstractC4217F;
import ie.J;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.S;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ee.e f36608a = AbstractC4217F.a("kotlinx.serialization.json.JsonUnquotedLiteral", AbstractC3918a.G(S.f39781a));

    public static final AbstractC4300C a(String str) {
        return str == null ? x.INSTANCE : new t(str, true, null, 4, null);
    }

    public static final Void b(h hVar, String str) {
        throw new IllegalArgumentException("Element " + M.b(hVar.getClass()) + " is not a " + str);
    }

    public static final Boolean c(AbstractC4300C abstractC4300C) {
        AbstractC4862t.e(abstractC4300C, "<this>");
        return ie.M.d(abstractC4300C.c());
    }

    public static final String d(AbstractC4300C abstractC4300C) {
        AbstractC4862t.e(abstractC4300C, "<this>");
        if (abstractC4300C instanceof x) {
            return null;
        }
        return abstractC4300C.c();
    }

    public static final double e(AbstractC4300C abstractC4300C) {
        AbstractC4862t.e(abstractC4300C, "<this>");
        return Double.parseDouble(abstractC4300C.c());
    }

    public static final float f(AbstractC4300C abstractC4300C) {
        AbstractC4862t.e(abstractC4300C, "<this>");
        return Float.parseFloat(abstractC4300C.c());
    }

    public static final AbstractC4300C g(h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        AbstractC4300C abstractC4300C = hVar instanceof AbstractC4300C ? (AbstractC4300C) hVar : null;
        if (abstractC4300C != null) {
            return abstractC4300C;
        }
        b(hVar, "JsonPrimitive");
        throw new C4025h();
    }

    public static final ee.e h() {
        return f36608a;
    }

    public static final long i(AbstractC4300C abstractC4300C) {
        AbstractC4862t.e(abstractC4300C, "<this>");
        return new J(abstractC4300C.c()).p();
    }
}
