package E4;

import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ e[] $VALUES;
    private final String operationType;
    public static final e SET = new e("SET", 0, "$set");
    public static final e SET_ONCE = new e("SET_ONCE", 1, "$setOnce");
    public static final e ADD = new e("ADD", 2, "$add");
    public static final e APPEND = new e("APPEND", 3, "$append");
    public static final e CLEAR_ALL = new e("CLEAR_ALL", 4, "$clearAll");
    public static final e PREPEND = new e("PREPEND", 5, "$prepend");
    public static final e UNSET = new e("UNSET", 6, "$unset");
    public static final e PRE_INSERT = new e("PRE_INSERT", 7, "$preInsert");
    public static final e POST_INSERT = new e("POST_INSERT", 8, "$postInsert");
    public static final e REMOVE = new e("REMOVE", 9, "$remove");

    static {
        e[] eVarArrA = a();
        $VALUES = eVarArrA;
        $ENTRIES = AbstractC5277b.a(eVarArrA);
    }

    public e(String str, int i10, String str2) {
        this.operationType = str2;
    }

    public static final /* synthetic */ e[] a() {
        return new e[]{SET, SET_ONCE, ADD, APPEND, CLEAR_ALL, PREPEND, UNSET, PRE_INSERT, POST_INSERT, REMOVE};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) $VALUES.clone();
    }

    public final String b() {
        return this.operationType;
    }
}
