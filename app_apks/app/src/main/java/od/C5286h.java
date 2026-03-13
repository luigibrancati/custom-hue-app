package od;

import Lc.InterfaceC1177e;
import Lc.InterfaceC1184l;
import Lc.InterfaceC1185m;
import Lc.InterfaceC1196y;
import Lc.U;
import Lc.e0;
import java.util.Comparator;

/* JADX INFO: renamed from: od.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C5286h implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C5286h f41542a = new C5286h();

    public static Integer b(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
        int iC = c(interfaceC1185m2) - c(interfaceC1185m);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (AbstractC5283e.B(interfaceC1185m) && AbstractC5283e.B(interfaceC1185m2)) {
            return 0;
        }
        int iCompareTo = interfaceC1185m.getName().compareTo(interfaceC1185m2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    public static int c(InterfaceC1185m interfaceC1185m) {
        if (AbstractC5283e.B(interfaceC1185m)) {
            return 8;
        }
        if (interfaceC1185m instanceof InterfaceC1184l) {
            return 7;
        }
        if (interfaceC1185m instanceof U) {
            return ((U) interfaceC1185m).M() == null ? 6 : 5;
        }
        if (interfaceC1185m instanceof InterfaceC1196y) {
            return ((InterfaceC1196y) interfaceC1185m).M() == null ? 4 : 3;
        }
        if (interfaceC1185m instanceof InterfaceC1177e) {
            return 2;
        }
        return interfaceC1185m instanceof e0 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(InterfaceC1185m interfaceC1185m, InterfaceC1185m interfaceC1185m2) {
        Integer numB = b(interfaceC1185m, interfaceC1185m2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
