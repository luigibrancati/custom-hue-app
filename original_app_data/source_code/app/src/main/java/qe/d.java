package qe;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class d {
    public static final boolean a(pe.h hVar, Object obj) {
        AbstractC4862t.e(hVar, "<this>");
        if (!(obj instanceof pe.h)) {
            return false;
        }
        pe.h hVar2 = (pe.h) obj;
        return AbstractC4862t.a(hVar2.d(), hVar.d()) && AbstractC4862t.a(hVar2.a(), hVar.a());
    }

    public static final int b(pe.h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return ((899 + hVar.d().hashCode()) * 31) + hVar.a().hashCode();
    }

    public static final String c(pe.h hVar) {
        AbstractC4862t.e(hVar, "<this>");
        return hVar.d() + " authParams=" + hVar.a();
    }
}
