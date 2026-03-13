package L;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f1 {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ f1[] $VALUES;
    private final long value;
    public static final f1 DEFAULT = new f1("DEFAULT", 0, 0);
    public static final f1 PREVIEW = new f1("PREVIEW", 1, 1);
    public static final f1 VIDEO_RECORD = new f1("VIDEO_RECORD", 2, 3);
    public static final f1 STILL_CAPTURE = new f1("STILL_CAPTURE", 3, 2);
    public static final f1 VIDEO_CALL = new f1("VIDEO_CALL", 4, 5);
    public static final f1 PREVIEW_VIDEO_STILL = new f1("PREVIEW_VIDEO_STILL", 5, 4);
    public static final f1 CROPPED_RAW = new f1("CROPPED_RAW", 6, 6);

    static {
        f1[] f1VarArrA = a();
        $VALUES = f1VarArrA;
        $ENTRIES = AbstractC5277b.a(f1VarArrA);
    }

    public f1(String str, int i10, int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ f1[] a() {
        return new f1[]{DEFAULT, PREVIEW, VIDEO_RECORD, STILL_CAPTURE, VIDEO_CALL, PREVIEW_VIDEO_STILL, CROPPED_RAW};
    }

    public static f1 valueOf(String str) {
        return (f1) Enum.valueOf(f1.class, str);
    }

    public static f1[] values() {
        return (f1[]) $VALUES.clone();
    }

    public final long b() {
        return this.value;
    }
}
