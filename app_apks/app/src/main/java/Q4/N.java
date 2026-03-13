package Q4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class N {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ N[] $VALUES;
    public static final N asSetByTask = new N("asSetByTask", 0);
    public static final N forAllTasks = new N("forAllTasks", 1);
    public static final N forNoTasks = new N("forNoTasks", 2);

    static {
        N[] nArrA = a();
        $VALUES = nArrA;
        $ENTRIES = AbstractC5277b.a(nArrA);
    }

    public N(String str, int i10) {
    }

    public static final /* synthetic */ N[] a() {
        return new N[]{asSetByTask, forAllTasks, forNoTasks};
    }

    public static InterfaceC5276a b() {
        return $ENTRIES;
    }

    public static N valueOf(String str) {
        return (N) Enum.valueOf(N.class, str);
    }

    public static N[] values() {
        return (N[]) $VALUES.clone();
    }
}
