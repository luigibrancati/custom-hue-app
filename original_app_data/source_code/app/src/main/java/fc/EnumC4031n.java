package fc;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: fc.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC4031n {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC4031n[] $VALUES;
    public static final EnumC4031n SYNCHRONIZED = new EnumC4031n("SYNCHRONIZED", 0);
    public static final EnumC4031n PUBLICATION = new EnumC4031n("PUBLICATION", 1);
    public static final EnumC4031n NONE = new EnumC4031n("NONE", 2);

    static {
        EnumC4031n[] enumC4031nArrA = a();
        $VALUES = enumC4031nArrA;
        $ENTRIES = AbstractC5277b.a(enumC4031nArrA);
    }

    public EnumC4031n(String str, int i10) {
    }

    public static final /* synthetic */ EnumC4031n[] a() {
        return new EnumC4031n[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    public static EnumC4031n valueOf(String str) {
        return (EnumC4031n) Enum.valueOf(EnumC4031n.class, str);
    }

    public static EnumC4031n[] values() {
        return (EnumC4031n[]) $VALUES.clone();
    }
}
