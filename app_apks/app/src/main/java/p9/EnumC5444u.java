package p9;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p9.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5444u implements J8.f {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC5444u[] $VALUES;
    private final int number;
    public static final EnumC5444u LOG_ENVIRONMENT_UNKNOWN = new EnumC5444u("LOG_ENVIRONMENT_UNKNOWN", 0, 0);
    public static final EnumC5444u LOG_ENVIRONMENT_AUTOPUSH = new EnumC5444u("LOG_ENVIRONMENT_AUTOPUSH", 1, 1);
    public static final EnumC5444u LOG_ENVIRONMENT_STAGING = new EnumC5444u("LOG_ENVIRONMENT_STAGING", 2, 2);
    public static final EnumC5444u LOG_ENVIRONMENT_PROD = new EnumC5444u("LOG_ENVIRONMENT_PROD", 3, 3);

    static {
        EnumC5444u[] enumC5444uArrA = a();
        $VALUES = enumC5444uArrA;
        $ENTRIES = AbstractC5277b.a(enumC5444uArrA);
    }

    public EnumC5444u(String str, int i10, int i11) {
        this.number = i11;
    }

    public static final /* synthetic */ EnumC5444u[] a() {
        return new EnumC5444u[]{LOG_ENVIRONMENT_UNKNOWN, LOG_ENVIRONMENT_AUTOPUSH, LOG_ENVIRONMENT_STAGING, LOG_ENVIRONMENT_PROD};
    }

    public static EnumC5444u valueOf(String str) {
        return (EnumC5444u) Enum.valueOf(EnumC5444u.class, str);
    }

    public static EnumC5444u[] values() {
        return (EnumC5444u[]) $VALUES.clone();
    }

    @Override // J8.f
    public int getNumber() {
        return this.number;
    }
}
