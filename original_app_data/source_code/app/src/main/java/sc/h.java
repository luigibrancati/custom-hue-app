package sc;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class h {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    public static final h TOP_DOWN = new h("TOP_DOWN", 0);
    public static final h BOTTOM_UP = new h("BOTTOM_UP", 1);

    static {
        h[] hVarArrA = a();
        $VALUES = hVarArrA;
        $ENTRIES = AbstractC5277b.a(hVarArrA);
    }

    public h(String str, int i10) {
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{TOP_DOWN, BOTTOM_UP};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }
}
