package z0;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z0.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6497k {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC6497k[] $VALUES;
    public static final EnumC6497k Ltr = new EnumC6497k("Ltr", 0);
    public static final EnumC6497k Rtl = new EnumC6497k("Rtl", 1);

    static {
        EnumC6497k[] enumC6497kArrA = a();
        $VALUES = enumC6497kArrA;
        $ENTRIES = AbstractC5277b.a(enumC6497kArrA);
    }

    public EnumC6497k(String str, int i10) {
    }

    public static final /* synthetic */ EnumC6497k[] a() {
        return new EnumC6497k[]{Ltr, Rtl};
    }

    public static EnumC6497k valueOf(String str) {
        return (EnumC6497k) Enum.valueOf(EnumC6497k.class, str);
    }

    public static EnumC6497k[] values() {
        return (EnumC6497k[]) $VALUES.clone();
    }
}
