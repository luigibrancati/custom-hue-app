package mc;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: mc.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC5044a {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC5044a[] $VALUES;
    public static final EnumC5044a COROUTINE_SUSPENDED = new EnumC5044a("COROUTINE_SUSPENDED", 0);
    public static final EnumC5044a UNDECIDED = new EnumC5044a("UNDECIDED", 1);
    public static final EnumC5044a RESUMED = new EnumC5044a("RESUMED", 2);

    static {
        EnumC5044a[] enumC5044aArrA = a();
        $VALUES = enumC5044aArrA;
        $ENTRIES = AbstractC5277b.a(enumC5044aArrA);
    }

    public EnumC5044a(String str, int i10) {
    }

    public static final /* synthetic */ EnumC5044a[] a() {
        return new EnumC5044a[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static EnumC5044a valueOf(String str) {
        return (EnumC5044a) Enum.valueOf(EnumC5044a.class, str);
    }

    public static EnumC5044a[] values() {
        return (EnumC5044a[]) $VALUES.clone();
    }
}
