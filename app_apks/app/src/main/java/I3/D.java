package I3;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class D {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ D[] $VALUES;
    public static final D RUN_AS_NON_EXPEDITED_WORK_REQUEST = new D("RUN_AS_NON_EXPEDITED_WORK_REQUEST", 0);
    public static final D DROP_WORK_REQUEST = new D("DROP_WORK_REQUEST", 1);

    static {
        D[] dArrA = a();
        $VALUES = dArrA;
        $ENTRIES = AbstractC5277b.a(dArrA);
    }

    public D(String str, int i10) {
    }

    public static final /* synthetic */ D[] a() {
        return new D[]{RUN_AS_NON_EXPEDITED_WORK_REQUEST, DROP_WORK_REQUEST};
    }

    public static D valueOf(String str) {
        return (D) Enum.valueOf(D.class, str);
    }

    public static D[] values() {
        return (D[]) $VALUES.clone();
    }
}
