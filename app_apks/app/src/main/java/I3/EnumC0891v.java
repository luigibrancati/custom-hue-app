package I3;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I3.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0891v {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC0891v[] $VALUES;
    public static final EnumC0891v NOT_REQUIRED = new EnumC0891v("NOT_REQUIRED", 0);
    public static final EnumC0891v CONNECTED = new EnumC0891v("CONNECTED", 1);
    public static final EnumC0891v UNMETERED = new EnumC0891v("UNMETERED", 2);
    public static final EnumC0891v NOT_ROAMING = new EnumC0891v("NOT_ROAMING", 3);
    public static final EnumC0891v METERED = new EnumC0891v("METERED", 4);
    public static final EnumC0891v TEMPORARILY_UNMETERED = new EnumC0891v("TEMPORARILY_UNMETERED", 5);

    static {
        EnumC0891v[] enumC0891vArrA = a();
        $VALUES = enumC0891vArrA;
        $ENTRIES = AbstractC5277b.a(enumC0891vArrA);
    }

    public EnumC0891v(String str, int i10) {
    }

    public static final /* synthetic */ EnumC0891v[] a() {
        return new EnumC0891v[]{NOT_REQUIRED, CONNECTED, UNMETERED, NOT_ROAMING, METERED, TEMPORARILY_UNMETERED};
    }

    public static EnumC0891v valueOf(String str) {
        return (EnumC0891v) Enum.valueOf(EnumC0891v.class, str);
    }

    public static EnumC0891v[] values() {
        return (EnumC0891v[]) $VALUES.clone();
    }
}
