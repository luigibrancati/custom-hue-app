package M4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ m[] $VALUES;
    public static final m Initialized = new m("Initialized", 0);
    public static final m Updated = new m("Updated", 1);

    static {
        m[] mVarArrA = a();
        $VALUES = mVarArrA;
        $ENTRIES = AbstractC5277b.a(mVarArrA);
    }

    public m(String str, int i10) {
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{Initialized, Updated};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }
}
