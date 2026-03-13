package z4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: z4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC6503b {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ EnumC6503b[] $VALUES;
    public static final EnumC6503b Created = new EnumC6503b("Created", 0);
    public static final EnumC6503b Started = new EnumC6503b("Started", 1);
    public static final EnumC6503b Resumed = new EnumC6503b("Resumed", 2);
    public static final EnumC6503b Paused = new EnumC6503b("Paused", 3);
    public static final EnumC6503b Stopped = new EnumC6503b("Stopped", 4);
    public static final EnumC6503b Destroyed = new EnumC6503b("Destroyed", 5);

    static {
        EnumC6503b[] enumC6503bArrA = a();
        $VALUES = enumC6503bArrA;
        $ENTRIES = AbstractC5277b.a(enumC6503bArrA);
    }

    public EnumC6503b(String str, int i10) {
    }

    public static final /* synthetic */ EnumC6503b[] a() {
        return new EnumC6503b[]{Created, Started, Resumed, Paused, Stopped, Destroyed};
    }

    public static EnumC6503b valueOf(String str) {
        return (EnumC6503b) Enum.valueOf(EnumC6503b.class, str);
    }

    public static EnumC6503b[] values() {
        return (EnumC6503b[]) $VALUES.clone();
    }
}
