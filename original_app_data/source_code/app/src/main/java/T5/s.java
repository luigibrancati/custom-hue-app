package T5;

import io.sentry.ProfilingTraceData;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ s[] $VALUES;
    private final String value;
    public static final s NOT_AVAILABLE = new s("NOT_AVAILABLE", 0, "notAvailable");
    public static final s NORMAL = new s("NORMAL", 1, ProfilingTraceData.TRUNCATION_REASON_NORMAL);
    public static final s INITIALIZING = new s("INITIALIZING", 2, "initializing");
    public static final s EXCESSIVE_MOTION = new s("EXCESSIVE_MOTION", 3, "excessiveMotion");
    public static final s INSUFFICIENT_FEATURES = new s("INSUFFICIENT_FEATURES", 4, "insufficientFeatures");
    public static final s INSUFFICIENT_LIGHT = new s("INSUFFICIENT_LIGHT", 5, "insufficientLight");
    public static final s BAD_STATE = new s("BAD_STATE", 6, "badState");

    static {
        s[] sVarArrA = a();
        $VALUES = sVarArrA;
        $ENTRIES = AbstractC5277b.a(sVarArrA);
    }

    public s(String str, int i10, String str2) {
        this.value = str2;
    }

    public static final /* synthetic */ s[] a() {
        return new s[]{NOT_AVAILABLE, NORMAL, INITIALIZING, EXCESSIVE_MOTION, INSUFFICIENT_FEATURES, INSUFFICIENT_LIGHT, BAD_STATE};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) $VALUES.clone();
    }

    public final String b() {
        return this.value;
    }
}
