package Rd;

import fc.C4032o;
import lc.AbstractC4990g;
import lc.InterfaceC4988e;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class O {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ O[] $VALUES;
    public static final O DEFAULT = new O("DEFAULT", 0);
    public static final O LAZY = new O("LAZY", 1);
    public static final O ATOMIC = new O("ATOMIC", 2);
    public static final O UNDISPATCHED = new O("UNDISPATCHED", 3);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15144a;

        static {
            int[] iArr = new int[O.values().length];
            try {
                iArr[O.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[O.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f15144a = iArr;
        }
    }

    static {
        O[] oArrA = a();
        $VALUES = oArrA;
        $ENTRIES = AbstractC5277b.a(oArrA);
    }

    public O(String str, int i10) {
    }

    public static final /* synthetic */ O[] a() {
        return new O[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }

    public final void b(vc.p pVar, Object obj, InterfaceC4988e interfaceC4988e) {
        int i10 = a.f15144a[ordinal()];
        if (i10 == 1) {
            Xd.a.c(pVar, obj, interfaceC4988e);
            return;
        }
        if (i10 == 2) {
            AbstractC4990g.a(pVar, obj, interfaceC4988e);
        } else if (i10 == 3) {
            Xd.b.c(pVar, obj, interfaceC4988e);
        } else if (i10 != 4) {
            throw new C4032o();
        }
    }

    public final boolean j() {
        return this == LAZY;
    }
}
