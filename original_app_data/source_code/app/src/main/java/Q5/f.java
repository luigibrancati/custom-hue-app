package Q5;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ f[] $VALUES;
    public static final f deviceDefault = new f("deviceDefault", 0);
    public static final f dictation = new f("dictation", 1);
    public static final f search = new f("search", 2);
    public static final f confirmation = new f("confirmation", 3);

    static {
        f[] fVarArrA = a();
        $VALUES = fVarArrA;
        $ENTRIES = AbstractC5277b.a(fVarArrA);
    }

    public f(String str, int i10) {
    }

    public static final /* synthetic */ f[] a() {
        return new f[]{deviceDefault, dictation, search, confirmation};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }
}
