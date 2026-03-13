package Q4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ G[] $VALUES;
    public static final G running = new G("running", 0);
    public static final G complete = new G("complete", 1);
    public static final G error = new G("error", 2);
    public static final G paused = new G("paused", 3);
    public static final G canceled = new G("canceled", 4);

    static {
        G[] gArrA = a();
        $VALUES = gArrA;
        $ENTRIES = AbstractC5277b.a(gArrA);
    }

    public G(String str, int i10) {
    }

    public static final /* synthetic */ G[] a() {
        return new G[]{running, complete, error, paused, canceled};
    }

    public static G valueOf(String str) {
        return (G) Enum.valueOf(G.class, str);
    }

    public static G[] values() {
        return (G[]) $VALUES.clone();
    }
}
