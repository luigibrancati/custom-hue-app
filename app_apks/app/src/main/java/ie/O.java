package ie;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class O {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ O[] $VALUES;
    public final char begin;
    public final char end;
    public static final O OBJ = new O("OBJ", 0, '{', '}');
    public static final O LIST = new O("LIST", 1, '[', ']');
    public static final O MAP = new O("MAP", 2, '{', '}');
    public static final O POLY_OBJ = new O("POLY_OBJ", 3, '[', ']');

    static {
        O[] oArrA = a();
        $VALUES = oArrA;
        $ENTRIES = AbstractC5277b.a(oArrA);
    }

    public O(String str, int i10, char c10, char c11) {
        this.begin = c10;
        this.end = c11;
    }

    public static final /* synthetic */ O[] a() {
        return new O[]{OBJ, LIST, MAP, POLY_OBJ};
    }

    public static InterfaceC5276a b() {
        return $ENTRIES;
    }

    public static O valueOf(String str) {
        return (O) Enum.valueOf(O.class, str);
    }

    public static O[] values() {
        return (O[]) $VALUES.clone();
    }
}
