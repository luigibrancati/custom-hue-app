package p9;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: p9.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC5428d implements J8.f {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC5428d[] $VALUES;
    private final int number;
    public static final EnumC5428d COLLECTION_UNKNOWN = new EnumC5428d("COLLECTION_UNKNOWN", 0, 0);
    public static final EnumC5428d COLLECTION_SDK_NOT_INSTALLED = new EnumC5428d("COLLECTION_SDK_NOT_INSTALLED", 1, 1);
    public static final EnumC5428d COLLECTION_ENABLED = new EnumC5428d("COLLECTION_ENABLED", 2, 2);
    public static final EnumC5428d COLLECTION_DISABLED = new EnumC5428d("COLLECTION_DISABLED", 3, 3);
    public static final EnumC5428d COLLECTION_DISABLED_REMOTE = new EnumC5428d("COLLECTION_DISABLED_REMOTE", 4, 4);
    public static final EnumC5428d COLLECTION_SAMPLED = new EnumC5428d("COLLECTION_SAMPLED", 5, 5);

    static {
        EnumC5428d[] enumC5428dArrA = a();
        $VALUES = enumC5428dArrA;
        $ENTRIES = AbstractC5277b.a(enumC5428dArrA);
    }

    public EnumC5428d(String str, int i10, int i11) {
        this.number = i11;
    }

    public static final /* synthetic */ EnumC5428d[] a() {
        return new EnumC5428d[]{COLLECTION_UNKNOWN, COLLECTION_SDK_NOT_INSTALLED, COLLECTION_ENABLED, COLLECTION_DISABLED, COLLECTION_DISABLED_REMOTE, COLLECTION_SAMPLED};
    }

    public static EnumC5428d valueOf(String str) {
        return (EnumC5428d) Enum.valueOf(EnumC5428d.class, str);
    }

    public static EnumC5428d[] values() {
        return (EnumC5428d[]) $VALUES.clone();
    }

    @Override // J8.f
    public int getNumber() {
        return this.number;
    }
}
