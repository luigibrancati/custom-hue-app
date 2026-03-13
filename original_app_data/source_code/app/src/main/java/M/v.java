package M;

import E.L;
import L.c1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static L a(c1 c1Var, L l10) {
        boolean z10;
        if (c1Var == null) {
            return l10;
        }
        L.a aVar = new L.a(l10);
        boolean z11 = true;
        if (l10.c().isEmpty() || b(c1Var, 1, 2)) {
            z10 = false;
        } else {
            aVar.c(1);
            z10 = true;
        }
        if (!l10.b().isEmpty() && !b(c1Var, 3)) {
            aVar.c(2);
            z10 = true;
        }
        if (l10.d().isEmpty() || b(c1Var, 4)) {
            z11 = z10;
        } else {
            aVar.c(4);
        }
        if (!z11) {
            return l10;
        }
        L lB = aVar.b();
        if (lB.c().isEmpty() && lB.b().isEmpty() && lB.d().isEmpty()) {
            return null;
        }
        return aVar.b();
    }

    public static boolean b(c1 c1Var, int... iArr) {
        if (c1Var == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i10 : iArr) {
            arrayList.add(Integer.valueOf(i10));
        }
        return c1Var.a().containsAll(arrayList);
    }
}
