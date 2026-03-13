package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Q {
    private static final /* synthetic */ Q[] $VALUES;
    public static final Q BOOLEAN;
    public static final Q BYTE_STRING;
    public static final Q DOUBLE;
    public static final Q ENUM;
    public static final Q FLOAT;
    public static final Q INT;
    public static final Q LONG;
    public static final Q MESSAGE;
    public static final Q STRING;
    public static final Q VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        Q q10 = new Q("VOID", 0, Void.class, Void.class, null);
        VOID = q10;
        Class cls = Integer.TYPE;
        Q q11 = new Q("INT", 1, cls, Integer.class, 0);
        INT = q11;
        Q q12 = new Q("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = q12;
        Q q13 = new Q("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = q13;
        Q q14 = new Q("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = q14;
        Q q15 = new Q("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = q15;
        Q q16 = new Q("STRING", 6, String.class, String.class, "");
        STRING = q16;
        Q q17 = new Q("BYTE_STRING", 7, AbstractC3722j.class, AbstractC3722j.class, AbstractC3722j.f32236b);
        BYTE_STRING = q17;
        Q q18 = new Q("ENUM", 8, cls, Integer.class, null);
        ENUM = q18;
        Q q19 = new Q("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = q19;
        $VALUES = new Q[]{q10, q11, q12, q13, q14, q15, q16, q17, q18, q19};
    }

    public Q(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static Q valueOf(String str) {
        return (Q) java.lang.Enum.valueOf(Q.class, str);
    }

    public static Q[] values() {
        return (Q[]) $VALUES.clone();
    }

    public Class a() {
        return this.boxedType;
    }
}
