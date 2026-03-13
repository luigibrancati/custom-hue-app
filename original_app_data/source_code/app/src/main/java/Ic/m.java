package Ic;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'UBYTE' uses external variables
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
public final class m {
    private static final /* synthetic */ m[] $VALUES;
    public static final m UBYTE;
    public static final m UINT;
    public static final m ULONG;
    public static final m USHORT;
    private final kd.b arrayClassId;
    private final kd.b classId;
    private final kd.f typeName;

    static {
        kd.b bVarE = kd.b.e("kotlin/UByte");
        AbstractC4862t.d(bVarE, "fromString(\"kotlin/UByte\")");
        UBYTE = new m("UBYTE", 0, bVarE);
        kd.b bVarE2 = kd.b.e("kotlin/UShort");
        AbstractC4862t.d(bVarE2, "fromString(\"kotlin/UShort\")");
        USHORT = new m("USHORT", 1, bVarE2);
        kd.b bVarE3 = kd.b.e("kotlin/UInt");
        AbstractC4862t.d(bVarE3, "fromString(\"kotlin/UInt\")");
        UINT = new m("UINT", 2, bVarE3);
        kd.b bVarE4 = kd.b.e("kotlin/ULong");
        AbstractC4862t.d(bVarE4, "fromString(\"kotlin/ULong\")");
        ULONG = new m("ULONG", 3, bVarE4);
        $VALUES = a();
    }

    public m(String str, int i10, kd.b bVar) {
        this.classId = bVar;
        kd.f fVarJ = bVar.j();
        AbstractC4862t.d(fVarJ, "classId.shortClassName");
        this.typeName = fVarJ;
        this.arrayClassId = new kd.b(bVar.h(), kd.f.s(fVarJ.b() + "Array"));
    }

    public static final /* synthetic */ m[] a() {
        return new m[]{UBYTE, USHORT, UINT, ULONG};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) $VALUES.clone();
    }

    public final kd.b b() {
        return this.arrayClassId;
    }

    public final kd.b j() {
        return this.classId;
    }

    public final kd.f p() {
        return this.typeName;
    }
}
