package ge;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: ge.d0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC4230d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ee.e[] f35698a = new ee.e[0];

    public static final Set a(ee.e eVar) {
        AbstractC4862t.e(eVar, "<this>");
        if (eVar instanceof InterfaceC4245l) {
            return ((InterfaceC4245l) eVar).a();
        }
        HashSet hashSet = new HashSet(eVar.d());
        int iD = eVar.d();
        for (int i10 = 0; i10 < iD; i10++) {
            hashSet.add(eVar.e(i10));
        }
        return hashSet;
    }

    public static final ee.e[] b(List list) {
        ee.e[] eVarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (eVarArr = (ee.e[]) list.toArray(new ee.e[0])) == null) ? f35698a : eVarArr;
    }
}
