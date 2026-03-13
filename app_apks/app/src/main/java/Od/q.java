package Od;

import kotlin.jvm.internal.AbstractC4854k;
import oc.AbstractC5277b;
import oc.InterfaceC5276a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class q {
    private static final /* synthetic */ InterfaceC5276a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    private final int mask;
    private final int value;
    public static final q IGNORE_CASE = new q("IGNORE_CASE", 0, 2, 0, 2, null);
    public static final q MULTILINE = new q("MULTILINE", 1, 8, 0, 2, null);
    public static final q LITERAL = new q("LITERAL", 2, 16, 0, 2, null);
    public static final q UNIX_LINES = new q("UNIX_LINES", 3, 1, 0, 2, null);
    public static final q COMMENTS = new q("COMMENTS", 4, 4, 0, 2, null);
    public static final q DOT_MATCHES_ALL = new q("DOT_MATCHES_ALL", 5, 32, 0, 2, null);
    public static final q CANON_EQ = new q("CANON_EQ", 6, 128, 0, 2, null);

    static {
        q[] qVarArrA = a();
        $VALUES = qVarArrA;
        $ENTRIES = AbstractC5277b.a(qVarArrA);
    }

    public q(String str, int i10, int i11, int i12) {
        this.value = i11;
        this.mask = i12;
    }

    public static final /* synthetic */ q[] a() {
        return new q[]{IGNORE_CASE, MULTILINE, LITERAL, UNIX_LINES, COMMENTS, DOT_MATCHES_ALL, CANON_EQ};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }

    public int b() {
        return this.value;
    }

    public /* synthetic */ q(String str, int i10, int i11, int i12, int i13, AbstractC4854k abstractC4854k) {
        this(str, i10, i11, (i13 & 2) != 0 ? i11 : i12);
    }
}
