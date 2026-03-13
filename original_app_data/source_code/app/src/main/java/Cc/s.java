package Cc;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class s {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    public static final s INVARIANT = new s("INVARIANT", 0);
    public static final s IN = new s("IN", 1);
    public static final s OUT = new s("OUT", 2);

    static {
        s[] sVarArrA = a();
        $VALUES = sVarArrA;
        $ENTRIES = AbstractC5277b.a(sVarArrA);
    }

    public s(String str, int i10) {
    }

    public static final /* synthetic */ s[] a() {
        return new s[]{INVARIANT, IN, OUT};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }
}
