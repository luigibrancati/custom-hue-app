package Ic;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTEARRAY' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class l {
    private static final /* synthetic */ l[] $VALUES;
    public static final l UBYTEARRAY;
    public static final l UINTARRAY;
    public static final l ULONGARRAY;
    public static final l USHORTARRAY;
    private final kd.b classId;
    private final kd.f typeName;

    static {
        kd.b bVarE = kd.b.e("kotlin/UByteArray");
        AbstractC4862t.d(bVarE, "fromString(\"kotlin/UByteArray\")");
        UBYTEARRAY = new l("UBYTEARRAY", 0, bVarE);
        kd.b bVarE2 = kd.b.e("kotlin/UShortArray");
        AbstractC4862t.d(bVarE2, "fromString(\"kotlin/UShortArray\")");
        USHORTARRAY = new l("USHORTARRAY", 1, bVarE2);
        kd.b bVarE3 = kd.b.e("kotlin/UIntArray");
        AbstractC4862t.d(bVarE3, "fromString(\"kotlin/UIntArray\")");
        UINTARRAY = new l("UINTARRAY", 2, bVarE3);
        kd.b bVarE4 = kd.b.e("kotlin/ULongArray");
        AbstractC4862t.d(bVarE4, "fromString(\"kotlin/ULongArray\")");
        ULONGARRAY = new l("ULONGARRAY", 3, bVarE4);
        $VALUES = a();
    }

    public l(String str, int i10, kd.b bVar) {
        this.classId = bVar;
        kd.f fVarJ = bVar.j();
        AbstractC4862t.d(fVarJ, "classId.shortClassName");
        this.typeName = fVarJ;
    }

    public static final /* synthetic */ l[] a() {
        return new l[]{UBYTEARRAY, USHORTARRAY, UINTARRAY, ULONGARRAY};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) $VALUES.clone();
    }

    public final kd.f b() {
        return this.typeName;
    }
}
