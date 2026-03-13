package D4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ d[] $VALUES;
    public static final d US = new d("US", 0);
    public static final d EU = new d("EU", 1);

    static {
        d[] dVarArrA = a();
        $VALUES = dVarArrA;
        $ENTRIES = AbstractC5277b.a(dVarArrA);
    }

    public d(String str, int i10) {
    }

    public static final /* synthetic */ d[] a() {
        return new d[]{US, EU};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) $VALUES.clone();
    }
}
