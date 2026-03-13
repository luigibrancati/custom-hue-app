package Q4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class I {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ I[] $VALUES;
    public static final I undetermined = new I("undetermined", 0);
    public static final I denied = new I("denied", 1);
    public static final I granted = new I("granted", 2);
    public static final I partial = new I("partial", 3);
    public static final I requestError = new I("requestError", 4);

    static {
        I[] iArrA = a();
        $VALUES = iArrA;
        $ENTRIES = AbstractC5277b.a(iArrA);
    }

    public I(String str, int i10) {
    }

    public static final /* synthetic */ I[] a() {
        return new I[]{undetermined, denied, granted, partial, requestError};
    }

    public static I valueOf(String str) {
        return (I) Enum.valueOf(I.class, str);
    }

    public static I[] values() {
        return (I[]) $VALUES.clone();
    }
}
