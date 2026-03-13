package Ga;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ l[] $VALUES;
    public static final a Companion;
    private final int value;
    public static final l Idle = new l("Idle", 0, 1);
    public static final l Busy = new l("Busy", 1, 2);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final l a(int i10) {
            for (l lVar : l.values()) {
                if (lVar.b() == i10) {
                    return lVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        public a() {
        }
    }

    static {
        l[] lVarArrA = a();
        $VALUES = lVarArrA;
        $ENTRIES = AbstractC5277b.a(lVarArrA);
        Companion = new a(null);
    }

    public l(String str, int i10, int i11) {
        this.value = i11;
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{Idle, Busy};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final int b() {
        return this.value;
    }
}
