package Lc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class N {
    public static final void a(L l10, kd.c fqName, Collection packageFragments) {
        AbstractC4862t.e(l10, "<this>");
        AbstractC4862t.e(fqName, "fqName");
        AbstractC4862t.e(packageFragments, "packageFragments");
        if (l10 instanceof O) {
            ((O) l10).b(fqName, packageFragments);
        } else {
            packageFragments.addAll(l10.a(fqName));
        }
    }

    public static final boolean b(L l10, kd.c fqName) {
        AbstractC4862t.e(l10, "<this>");
        AbstractC4862t.e(fqName, "fqName");
        return l10 instanceof O ? ((O) l10).c(fqName) : c(l10, fqName).isEmpty();
    }

    public static final List c(L l10, kd.c fqName) {
        AbstractC4862t.e(l10, "<this>");
        AbstractC4862t.e(fqName, "fqName");
        ArrayList arrayList = new ArrayList();
        a(l10, fqName, arrayList);
        return arrayList;
    }
}
