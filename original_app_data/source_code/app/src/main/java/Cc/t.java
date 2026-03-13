package Cc;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class t {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ t[] $VALUES;
    public static final t PUBLIC = new t("PUBLIC", 0);
    public static final t PROTECTED = new t("PROTECTED", 1);
    public static final t INTERNAL = new t("INTERNAL", 2);
    public static final t PRIVATE = new t("PRIVATE", 3);

    static {
        t[] tVarArrA = a();
        $VALUES = tVarArrA;
        $ENTRIES = AbstractC5277b.a(tVarArrA);
    }

    public t(String str, int i10) {
    }

    public static final /* synthetic */ t[] a() {
        return new t[]{PUBLIC, PROTECTED, INTERNAL, PRIVATE};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) $VALUES.clone();
    }
}
