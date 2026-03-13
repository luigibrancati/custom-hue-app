package M;

import X.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {
    public static X.c a(X.c cVar, X.c cVar2) {
        if (cVar2 == null) {
            return cVar;
        }
        if (cVar == null) {
            return cVar2;
        }
        c.a aVarB = c.a.b(cVar);
        if (cVar2.b() != null) {
            aVarB.d(cVar2.b());
        }
        if (cVar2.d() != null) {
            aVarB.f(cVar2.d());
        }
        if (cVar2.c() != null) {
            aVarB.e(cVar2.c());
        }
        if (cVar2.a() != 0) {
            aVarB.c(cVar2.a());
        }
        return aVarB.a();
    }
}
