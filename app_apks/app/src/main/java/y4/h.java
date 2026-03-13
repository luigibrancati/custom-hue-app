package y4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;

    /* JADX INFO: renamed from: V3, reason: collision with root package name */
    public static final h f48419V3 = new h("V3", 0, 3);
    private final int rawValue;

    static {
        h[] hVarArrA = a();
        $VALUES = hVarArrA;
        $ENTRIES = AbstractC5277b.a(hVarArrA);
    }

    public h(String str, int i10, int i11) {
        this.rawValue = i11;
    }

    public static final /* synthetic */ h[] a() {
        return new h[]{f48419V3};
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final int b() {
        return this.rawValue;
    }
}
