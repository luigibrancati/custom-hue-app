package R6;

import v6.AbstractC6056k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class B {
    public static int a(int i10) {
        boolean z10 = true;
        if (i10 != 100 && i10 != 102 && i10 != 104) {
            if (i10 == 105) {
                i10 = 105;
            } else {
                z10 = false;
            }
        }
        AbstractC6056k.c(z10, "priority %d must be a Priority.PRIORITY_* constant", Integer.valueOf(i10));
        return i10;
    }

    public static String b(int i10) {
        if (i10 == 100) {
            return "HIGH_ACCURACY";
        }
        if (i10 == 102) {
            return "BALANCED_POWER_ACCURACY";
        }
        if (i10 == 104) {
            return "LOW_POWER";
        }
        if (i10 == 105) {
            return "PASSIVE";
        }
        throw new IllegalArgumentException();
    }
}
