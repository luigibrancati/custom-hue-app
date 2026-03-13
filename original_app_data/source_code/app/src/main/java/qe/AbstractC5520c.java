package qe;

import Od.F;
import Pd.a;
import kotlin.jvm.internal.AbstractC4862t;
import pe.C5468d;

/* JADX INFO: renamed from: qe.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5520c {
    public static final C5468d a(C5468d.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        return new C5468d(aVar.f(), aVar.g(), aVar.c(), -1, false, false, false, aVar.d(), aVar.e(), aVar.i(), aVar.h(), aVar.b(), null);
    }

    public static final int b(long j10) {
        if (j10 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) j10;
    }

    public static final C5468d c(C5468d.b bVar) {
        AbstractC4862t.e(bVar, "<this>");
        C5468d.a aVarM = new C5468d.a().m();
        a.C0170a c0170a = Pd.a.f13294b;
        return aVarM.j(Pd.c.s(Integer.MAX_VALUE, Pd.d.SECONDS)).a();
    }

    public static final C5468d d(C5468d.b bVar) {
        AbstractC4862t.e(bVar, "<this>");
        return new C5468d.a().k().a();
    }

    public static final C5468d.a e(C5468d.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        aVar.n(true);
        return aVar;
    }

    public static final C5468d.a f(C5468d.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        aVar.o(true);
        return aVar;
    }

    public static final C5468d.a g(C5468d.a aVar) {
        AbstractC4862t.e(aVar, "<this>");
        aVar.p(true);
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final pe.C5468d h(pe.C5468d.b r30, pe.u r31) {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qe.AbstractC5520c.h(pe.d$b, pe.u):pe.d");
    }

    public static final String i(C5468d c5468d) {
        AbstractC4862t.e(c5468d, "<this>");
        String strA = c5468d.a();
        if (strA != null) {
            return strA;
        }
        StringBuilder sb2 = new StringBuilder();
        if (c5468d.i()) {
            sb2.append("no-cache, ");
        }
        if (c5468d.j()) {
            sb2.append("no-store, ");
        }
        if (c5468d.e() != -1) {
            sb2.append("max-age=");
            sb2.append(c5468d.e());
            sb2.append(", ");
        }
        if (c5468d.m() != -1) {
            sb2.append("s-maxage=");
            sb2.append(c5468d.m());
            sb2.append(", ");
        }
        if (c5468d.c()) {
            sb2.append("private, ");
        }
        if (c5468d.d()) {
            sb2.append("public, ");
        }
        if (c5468d.h()) {
            sb2.append("must-revalidate, ");
        }
        if (c5468d.f() != -1) {
            sb2.append("max-stale=");
            sb2.append(c5468d.f());
            sb2.append(", ");
        }
        if (c5468d.g() != -1) {
            sb2.append("min-fresh=");
            sb2.append(c5468d.g());
            sb2.append(", ");
        }
        if (c5468d.l()) {
            sb2.append("only-if-cached, ");
        }
        if (c5468d.k()) {
            sb2.append("no-transform, ");
        }
        if (c5468d.b()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        AbstractC4862t.d(sb2.delete(sb2.length() - 2, sb2.length()), "delete(...)");
        String string = sb2.toString();
        AbstractC4862t.d(string, "toString(...)");
        c5468d.n(string);
        return string;
    }

    public static final int j(String str, String str2, int i10) {
        int length = str.length();
        while (i10 < length) {
            if (F.U(str2, str.charAt(i10), false, 2, null)) {
                return i10;
            }
            i10++;
        }
        return str.length();
    }
}
