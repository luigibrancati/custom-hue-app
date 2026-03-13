package com.google.crypto.tink.shaded.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
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
/* JADX INFO: loaded from: classes3.dex */
public final class B {
    private static final /* synthetic */ B[] $VALUES;
    public static final B BOOLEAN;
    public static final B BYTE_STRING;
    public static final B DOUBLE;
    public static final B ENUM;
    public static final B FLOAT;
    public static final B INT;
    public static final B LONG;
    public static final B MESSAGE;
    public static final B STRING;
    public static final B VOID = new B("VOID", 0, Void.class, Void.class, null);
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Class cls = Integer.TYPE;
        INT = new B("INT", 1, cls, Integer.class, 0);
        LONG = new B("LONG", 2, Long.TYPE, Long.class, 0L);
        FLOAT = new B("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        DOUBLE = new B("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        BOOLEAN = new B("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        STRING = new B("STRING", 6, String.class, String.class, "");
        BYTE_STRING = new B("BYTE_STRING", 7, AbstractC3661h.class, AbstractC3661h.class, AbstractC3661h.f31448b);
        ENUM = new B("ENUM", 8, cls, Integer.class, null);
        MESSAGE = new B("MESSAGE", 9, Object.class, Object.class, null);
        $VALUES = a();
    }

    public B(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static /* synthetic */ B[] a() {
        return new B[]{VOID, INT, LONG, FLOAT, DOUBLE, BOOLEAN, STRING, BYTE_STRING, ENUM, MESSAGE};
    }

    public static B valueOf(String str) {
        return (B) Enum.valueOf(B.class, str);
    }

    public static B[] values() {
        return (B[]) $VALUES.clone();
    }

    public Class b() {
        return this.boxedType;
    }
}
