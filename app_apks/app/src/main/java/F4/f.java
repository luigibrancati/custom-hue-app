package F4;

import kotlin.jvm.internal.AbstractC4862t;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        private static final /* synthetic */ InterfaceC5276a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a Before = new a("Before", 0);
        public static final a Enrichment = new a("Enrichment", 1);
        public static final a Destination = new a("Destination", 2);
        public static final a Utility = new a("Utility", 3);
        public static final a Observe = new a("Observe", 4);

        static {
            a[] aVarArrA = a();
            $VALUES = aVarArrA;
            $ENTRIES = AbstractC5277b.a(aVarArrA);
        }

        public a(String str, int i10) {
        }

        public static final /* synthetic */ a[] a() {
            return new a[]{Before, Enrichment, Destination, Utility, Observe};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    void a(D4.a aVar);

    default void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        a(amplitude);
    }

    default E4.a g(E4.a event) {
        AbstractC4862t.e(event, "event");
        return event;
    }

    a getType();
}
