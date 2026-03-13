package I;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ b[] $VALUES;
    public static final b DYNAMIC_RANGE = new b("DYNAMIC_RANGE", 0);
    public static final b FPS_RANGE = new b("FPS_RANGE", 1);
    public static final b VIDEO_STABILIZATION = new b("VIDEO_STABILIZATION", 2);
    public static final b IMAGE_FORMAT = new b("IMAGE_FORMAT", 3);

    static {
        b[] bVarArrA = a();
        $VALUES = bVarArrA;
        $ENTRIES = AbstractC5277b.a(bVarArrA);
    }

    public b(String str, int i10) {
    }

    public static final /* synthetic */ b[] a() {
        return new b[]{DYNAMIC_RANGE, FPS_RANGE, VIDEO_STABILIZATION, IMAGE_FORMAT};
    }

    public static InterfaceC5276a b() {
        return $ENTRIES;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }
}
