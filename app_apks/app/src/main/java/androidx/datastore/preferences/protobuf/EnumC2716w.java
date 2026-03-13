package androidx.datastore.preferences.protobuf;

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
/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC2716w {
    private static final /* synthetic */ EnumC2716w[] $VALUES;
    public static final EnumC2716w BOOLEAN;
    public static final EnumC2716w BYTE_STRING;
    public static final EnumC2716w DOUBLE;
    public static final EnumC2716w ENUM;
    public static final EnumC2716w FLOAT;
    public static final EnumC2716w INT;
    public static final EnumC2716w LONG;
    public static final EnumC2716w MESSAGE;
    public static final EnumC2716w STRING;
    public static final EnumC2716w VOID;
    private final Class<?> boxedType;
    private final Object defaultDefault;
    private final Class<?> type;

    static {
        EnumC2716w enumC2716w = new EnumC2716w("VOID", 0, Void.class, Void.class, null);
        VOID = enumC2716w;
        Class cls = Integer.TYPE;
        EnumC2716w enumC2716w2 = new EnumC2716w("INT", 1, cls, Integer.class, 0);
        INT = enumC2716w2;
        EnumC2716w enumC2716w3 = new EnumC2716w("LONG", 2, Long.TYPE, Long.class, 0L);
        LONG = enumC2716w3;
        EnumC2716w enumC2716w4 = new EnumC2716w("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        FLOAT = enumC2716w4;
        EnumC2716w enumC2716w5 = new EnumC2716w("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        DOUBLE = enumC2716w5;
        EnumC2716w enumC2716w6 = new EnumC2716w("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        BOOLEAN = enumC2716w6;
        EnumC2716w enumC2716w7 = new EnumC2716w("STRING", 6, String.class, String.class, "");
        STRING = enumC2716w7;
        EnumC2716w enumC2716w8 = new EnumC2716w("BYTE_STRING", 7, AbstractC2700f.class, AbstractC2700f.class, AbstractC2700f.f22793b);
        BYTE_STRING = enumC2716w8;
        EnumC2716w enumC2716w9 = new EnumC2716w("ENUM", 8, cls, Integer.class, null);
        ENUM = enumC2716w9;
        EnumC2716w enumC2716w10 = new EnumC2716w("MESSAGE", 9, Object.class, Object.class, null);
        MESSAGE = enumC2716w10;
        $VALUES = new EnumC2716w[]{enumC2716w, enumC2716w2, enumC2716w3, enumC2716w4, enumC2716w5, enumC2716w6, enumC2716w7, enumC2716w8, enumC2716w9, enumC2716w10};
    }

    public EnumC2716w(String str, int i10, Class cls, Class cls2, Object obj) {
        this.type = cls;
        this.boxedType = cls2;
        this.defaultDefault = obj;
    }

    public static EnumC2716w valueOf(String str) {
        return (EnumC2716w) Enum.valueOf(EnumC2716w.class, str);
    }

    public static EnumC2716w[] values() {
        return (EnumC2716w[]) $VALUES.clone();
    }

    public Class a() {
        return this.boxedType;
    }
}
