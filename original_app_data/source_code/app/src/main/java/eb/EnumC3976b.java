package eb;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: eb.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC3976b {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC3976b[] $VALUES;
    private final int intValue;
    public static final EnumC3976b NO_DUPLICATES = new EnumC3976b("NO_DUPLICATES", 0, 0);
    public static final EnumC3976b NORMAL = new EnumC3976b("NORMAL", 1, 1);
    public static final EnumC3976b UNRESTRICTED = new EnumC3976b("UNRESTRICTED", 2, 2);

    static {
        EnumC3976b[] enumC3976bArrA = a();
        $VALUES = enumC3976bArrA;
        $ENTRIES = AbstractC5277b.a(enumC3976bArrA);
    }

    public EnumC3976b(String str, int i10, int i11) {
        this.intValue = i11;
    }

    public static final /* synthetic */ EnumC3976b[] a() {
        return new EnumC3976b[]{NO_DUPLICATES, NORMAL, UNRESTRICTED};
    }

    public static EnumC3976b valueOf(String str) {
        return (EnumC3976b) Enum.valueOf(EnumC3976b.class, str);
    }

    public static EnumC3976b[] values() {
        return (EnumC3976b[]) $VALUES.clone();
    }
}
