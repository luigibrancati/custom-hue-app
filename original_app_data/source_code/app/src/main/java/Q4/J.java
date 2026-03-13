package Q4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class J {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ J[] $VALUES;
    public static final J notifications = new J("notifications", 0);
    public static final J androidSharedStorage = new J("androidSharedStorage", 1);
    public static final J iosAddToPhotoLibrary = new J("iosAddToPhotoLibrary", 2);
    public static final J iosChangePhotoLibrary = new J("iosChangePhotoLibrary", 3);

    static {
        J[] jArrA = a();
        $VALUES = jArrA;
        $ENTRIES = AbstractC5277b.a(jArrA);
    }

    public J(String str, int i10) {
    }

    public static final /* synthetic */ J[] a() {
        return new J[]{notifications, androidSharedStorage, iosAddToPhotoLibrary, iosChangePhotoLibrary};
    }

    public static InterfaceC5276a b() {
        return $ENTRIES;
    }

    public static J valueOf(String str) {
        return (J) Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) $VALUES.clone();
    }
}
