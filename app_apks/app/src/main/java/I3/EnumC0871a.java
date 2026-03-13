package I3;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0871a {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC0871a[] $VALUES;
    public static final EnumC0871a EXPONENTIAL = new EnumC0871a("EXPONENTIAL", 0);
    public static final EnumC0871a LINEAR = new EnumC0871a("LINEAR", 1);

    static {
        EnumC0871a[] enumC0871aArrA = a();
        $VALUES = enumC0871aArrA;
        $ENTRIES = AbstractC5277b.a(enumC0871aArrA);
    }

    public EnumC0871a(String str, int i10) {
    }

    public static final /* synthetic */ EnumC0871a[] a() {
        return new EnumC0871a[]{EXPONENTIAL, LINEAR};
    }

    public static EnumC0871a valueOf(String str) {
        return (EnumC0871a) Enum.valueOf(EnumC0871a.class, str);
    }

    public static EnumC0871a[] values() {
        return (EnumC0871a[]) $VALUES.clone();
    }
}
