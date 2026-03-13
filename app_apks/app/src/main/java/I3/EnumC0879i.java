package I3;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: I3.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC0879i {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC0879i[] $VALUES;
    public static final EnumC0879i REPLACE = new EnumC0879i("REPLACE", 0);
    public static final EnumC0879i KEEP = new EnumC0879i("KEEP", 1);
    public static final EnumC0879i APPEND = new EnumC0879i("APPEND", 2);
    public static final EnumC0879i APPEND_OR_REPLACE = new EnumC0879i("APPEND_OR_REPLACE", 3);

    static {
        EnumC0879i[] enumC0879iArrA = a();
        $VALUES = enumC0879iArrA;
        $ENTRIES = AbstractC5277b.a(enumC0879iArrA);
    }

    public EnumC0879i(String str, int i10) {
    }

    public static final /* synthetic */ EnumC0879i[] a() {
        return new EnumC0879i[]{REPLACE, KEEP, APPEND, APPEND_OR_REPLACE};
    }

    public static EnumC0879i valueOf(String str) {
        return (EnumC0879i) Enum.valueOf(EnumC0879i.class, str);
    }

    public static EnumC0879i[] values() {
        return (EnumC0879i[]) $VALUES.clone();
    }
}
