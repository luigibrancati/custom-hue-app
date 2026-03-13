package p9;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p9.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5434j implements J8.f {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC5434j[] $VALUES;
    public static final EnumC5434j EVENT_TYPE_UNKNOWN = new EnumC5434j("EVENT_TYPE_UNKNOWN", 0, 0);
    public static final EnumC5434j SESSION_START = new EnumC5434j("SESSION_START", 1, 1);
    private final int number;

    static {
        EnumC5434j[] enumC5434jArrA = a();
        $VALUES = enumC5434jArrA;
        $ENTRIES = AbstractC5277b.a(enumC5434jArrA);
    }

    public EnumC5434j(String str, int i10, int i11) {
        this.number = i11;
    }

    public static final /* synthetic */ EnumC5434j[] a() {
        return new EnumC5434j[]{EVENT_TYPE_UNKNOWN, SESSION_START};
    }

    public static EnumC5434j valueOf(String str) {
        return (EnumC5434j) Enum.valueOf(EnumC5434j.class, str);
    }

    public static EnumC5434j[] values() {
        return (EnumC5434j[]) $VALUES.clone();
    }

    @Override // J8.f
    public int getNumber() {
        return this.number;
    }
}
