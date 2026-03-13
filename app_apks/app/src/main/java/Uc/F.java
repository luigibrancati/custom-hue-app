package Uc;

import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class F {
    public static final List a(kd.f name) {
        AbstractC4862t.e(name, "name");
        String strB = name.b();
        AbstractC4862t.d(strB, "name.asString()");
        return A.c(strB) ? C4206t.o(b(name)) : A.d(strB) ? f(name) : C2305g.f16919a.b(name);
    }

    public static final kd.f b(kd.f methodName) {
        AbstractC4862t.e(methodName, "methodName");
        kd.f fVarE = e(methodName, "get", false, null, 12, null);
        return fVarE == null ? e(methodName, "is", false, null, 8, null) : fVarE;
    }

    public static final kd.f c(kd.f methodName, boolean z10) {
        AbstractC4862t.e(methodName, "methodName");
        return e(methodName, "set", false, z10 ? "is" : null, 4, null);
    }

    public static final kd.f d(kd.f fVar, String str, boolean z10, String str2) {
        if (fVar.u()) {
            return null;
        }
        String strP = fVar.p();
        AbstractC4862t.d(strP, "methodName.identifier");
        if (!Od.C.P(strP, str, false, 2, null) || strP.length() == str.length()) {
            return null;
        }
        char cCharAt = strP.charAt(str.length());
        if ('a' <= cCharAt && cCharAt < '{') {
            return null;
        }
        if (str2 != null) {
            return kd.f.s(str2 + Od.F.B0(strP, str));
        }
        if (!z10) {
            return fVar;
        }
        String strC = Kd.a.c(Od.F.B0(strP, str), true);
        if (kd.f.v(strC)) {
            return kd.f.s(strC);
        }
        return null;
    }

    public static /* synthetic */ kd.f e(kd.f fVar, String str, boolean z10, String str2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return d(fVar, str, z10, str2);
    }

    public static final List f(kd.f methodName) {
        AbstractC4862t.e(methodName, "methodName");
        return C4206t.p(c(methodName, false), c(methodName, true));
    }
}
