package he;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: he.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4303a {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC4303a[] $VALUES;
    public static final EnumC4303a NONE = new EnumC4303a("NONE", 0);
    public static final EnumC4303a ALL_JSON_OBJECTS = new EnumC4303a("ALL_JSON_OBJECTS", 1);
    public static final EnumC4303a POLYMORPHIC = new EnumC4303a("POLYMORPHIC", 2);

    static {
        EnumC4303a[] enumC4303aArrA = a();
        $VALUES = enumC4303aArrA;
        $ENTRIES = AbstractC5277b.a(enumC4303aArrA);
    }

    public EnumC4303a(String str, int i10) {
    }

    public static final /* synthetic */ EnumC4303a[] a() {
        return new EnumC4303a[]{NONE, ALL_JSON_OBJECTS, POLYMORPHIC};
    }

    public static EnumC4303a valueOf(String str) {
        return (EnumC4303a) Enum.valueOf(EnumC4303a.class, str);
    }

    public static EnumC4303a[] values() {
        return (EnumC4303a[]) $VALUES.clone();
    }
}
