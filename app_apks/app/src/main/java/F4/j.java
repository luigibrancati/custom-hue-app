package F4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ j[] $VALUES;
    public static final j EVENT = new j("EVENT", 0);
    public static final j FLUSH = new j("FLUSH", 1);

    static {
        j[] jVarArrA = a();
        $VALUES = jVarArrA;
        $ENTRIES = AbstractC5277b.a(jVarArrA);
    }

    public j(String str, int i10) {
    }

    public static final /* synthetic */ j[] a() {
        return new j[]{EVENT, FLUSH};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) $VALUES.clone();
    }
}
