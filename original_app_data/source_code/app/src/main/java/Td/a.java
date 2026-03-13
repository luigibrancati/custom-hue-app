package Td;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    public static final a SUSPEND = new a("SUSPEND", 0);
    public static final a DROP_OLDEST = new a("DROP_OLDEST", 1);
    public static final a DROP_LATEST = new a("DROP_LATEST", 2);

    static {
        a[] aVarArrA = a();
        $VALUES = aVarArrA;
        $ENTRIES = AbstractC5277b.a(aVarArrA);
    }

    public a(String str, int i10) {
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }
}
