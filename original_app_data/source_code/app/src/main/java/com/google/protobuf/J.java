package com.google.protobuf;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
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
public final class J {
    private static final /* synthetic */ J[] $VALUES;
    public static final J BOOL;
    public static final J BOOL_LIST;
    public static final J BOOL_LIST_PACKED;
    public static final J BYTES;
    public static final J BYTES_LIST;
    public static final J DOUBLE;
    public static final J DOUBLE_LIST;
    public static final J DOUBLE_LIST_PACKED;
    private static final java.lang.reflect.Type[] EMPTY_TYPES;
    public static final J ENUM;
    public static final J ENUM_LIST;
    public static final J ENUM_LIST_PACKED;
    public static final J FIXED32;
    public static final J FIXED32_LIST;
    public static final J FIXED32_LIST_PACKED;
    public static final J FIXED64;
    public static final J FIXED64_LIST;
    public static final J FIXED64_LIST_PACKED;
    public static final J FLOAT;
    public static final J FLOAT_LIST;
    public static final J FLOAT_LIST_PACKED;
    public static final J GROUP;
    public static final J GROUP_LIST;
    public static final J INT32;
    public static final J INT32_LIST;
    public static final J INT32_LIST_PACKED;
    public static final J INT64;
    public static final J INT64_LIST;
    public static final J INT64_LIST_PACKED;
    public static final J MAP;
    public static final J MESSAGE;
    public static final J MESSAGE_LIST;
    public static final J SFIXED32;
    public static final J SFIXED32_LIST;
    public static final J SFIXED32_LIST_PACKED;
    public static final J SFIXED64;
    public static final J SFIXED64_LIST;
    public static final J SFIXED64_LIST_PACKED;
    public static final J SINT32;
    public static final J SINT32_LIST;
    public static final J SINT32_LIST_PACKED;
    public static final J SINT64;
    public static final J SINT64_LIST;
    public static final J SINT64_LIST_PACKED;
    public static final J STRING;
    public static final J STRING_LIST;
    public static final J UINT32;
    public static final J UINT32_LIST;
    public static final J UINT32_LIST_PACKED;
    public static final J UINT64;
    public static final J UINT64_LIST;
    public static final J UINT64_LIST_PACKED;
    private static final J[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f32113id;
    private final Q javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f32115b;

        static {
            int[] iArr = new int[Q.values().length];
            f32115b = iArr;
            try {
                iArr[Q.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32115b[Q.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32115b[Q.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f32114a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32114a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32114a[b.SCALAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);

        private final boolean isList;

        b(boolean z10) {
            this.isList = z10;
        }
    }

    static {
        b bVar = b.SCALAR;
        Q q10 = Q.DOUBLE;
        J j10 = new J("DOUBLE", 0, 0, bVar, q10);
        DOUBLE = j10;
        Q q11 = Q.FLOAT;
        J j11 = new J("FLOAT", 1, 1, bVar, q11);
        FLOAT = j11;
        Q q12 = Q.LONG;
        J j12 = new J("INT64", 2, 2, bVar, q12);
        INT64 = j12;
        J j13 = new J("UINT64", 3, 3, bVar, q12);
        UINT64 = j13;
        Q q13 = Q.INT;
        J j14 = new J("INT32", 4, 4, bVar, q13);
        INT32 = j14;
        J j15 = new J("FIXED64", 5, 5, bVar, q12);
        FIXED64 = j15;
        J j16 = new J("FIXED32", 6, 6, bVar, q13);
        FIXED32 = j16;
        Q q14 = Q.BOOLEAN;
        J j17 = new J("BOOL", 7, 7, bVar, q14);
        BOOL = j17;
        Q q15 = Q.STRING;
        J j18 = new J("STRING", 8, 8, bVar, q15);
        STRING = j18;
        Q q16 = Q.MESSAGE;
        J j19 = new J("MESSAGE", 9, 9, bVar, q16);
        MESSAGE = j19;
        Q q17 = Q.BYTE_STRING;
        J j20 = new J("BYTES", 10, 10, bVar, q17);
        BYTES = j20;
        J j21 = new J("UINT32", 11, 11, bVar, q13);
        UINT32 = j21;
        Q q18 = Q.ENUM;
        J j22 = new J("ENUM", 12, 12, bVar, q18);
        ENUM = j22;
        J j23 = new J("SFIXED32", 13, 13, bVar, q13);
        SFIXED32 = j23;
        J j24 = new J("SFIXED64", 14, 14, bVar, q12);
        SFIXED64 = j24;
        J j25 = new J("SINT32", 15, 15, bVar, q13);
        SINT32 = j25;
        J j26 = new J("SINT64", 16, 16, bVar, q12);
        SINT64 = j26;
        J j27 = new J("GROUP", 17, 17, bVar, q16);
        GROUP = j27;
        b bVar2 = b.VECTOR;
        J j28 = new J("DOUBLE_LIST", 18, 18, bVar2, q10);
        DOUBLE_LIST = j28;
        J j29 = new J("FLOAT_LIST", 19, 19, bVar2, q11);
        FLOAT_LIST = j29;
        J j30 = new J("INT64_LIST", 20, 20, bVar2, q12);
        INT64_LIST = j30;
        J j31 = new J("UINT64_LIST", 21, 21, bVar2, q12);
        UINT64_LIST = j31;
        J j32 = new J("INT32_LIST", 22, 22, bVar2, q13);
        INT32_LIST = j32;
        J j33 = new J("FIXED64_LIST", 23, 23, bVar2, q12);
        FIXED64_LIST = j33;
        J j34 = new J("FIXED32_LIST", 24, 24, bVar2, q13);
        FIXED32_LIST = j34;
        J j35 = new J("BOOL_LIST", 25, 25, bVar2, q14);
        BOOL_LIST = j35;
        J j36 = new J("STRING_LIST", 26, 26, bVar2, q15);
        STRING_LIST = j36;
        J j37 = new J("MESSAGE_LIST", 27, 27, bVar2, q16);
        MESSAGE_LIST = j37;
        J j38 = new J("BYTES_LIST", 28, 28, bVar2, q17);
        BYTES_LIST = j38;
        J j39 = new J("UINT32_LIST", 29, 29, bVar2, q13);
        UINT32_LIST = j39;
        J j40 = new J("ENUM_LIST", 30, 30, bVar2, q18);
        ENUM_LIST = j40;
        J j41 = new J("SFIXED32_LIST", 31, 31, bVar2, q13);
        SFIXED32_LIST = j41;
        J j42 = new J("SFIXED64_LIST", 32, 32, bVar2, q12);
        SFIXED64_LIST = j42;
        J j43 = new J("SINT32_LIST", 33, 33, bVar2, q13);
        SINT32_LIST = j43;
        J j44 = new J("SINT64_LIST", 34, 34, bVar2, q12);
        SINT64_LIST = j44;
        b bVar3 = b.PACKED_VECTOR;
        J j45 = new J("DOUBLE_LIST_PACKED", 35, 35, bVar3, q10);
        DOUBLE_LIST_PACKED = j45;
        J j46 = new J("FLOAT_LIST_PACKED", 36, 36, bVar3, q11);
        FLOAT_LIST_PACKED = j46;
        J j47 = new J("INT64_LIST_PACKED", 37, 37, bVar3, q12);
        INT64_LIST_PACKED = j47;
        J j48 = new J("UINT64_LIST_PACKED", 38, 38, bVar3, q12);
        UINT64_LIST_PACKED = j48;
        J j49 = new J("INT32_LIST_PACKED", 39, 39, bVar3, q13);
        INT32_LIST_PACKED = j49;
        J j50 = new J("FIXED64_LIST_PACKED", 40, 40, bVar3, q12);
        FIXED64_LIST_PACKED = j50;
        J j51 = new J("FIXED32_LIST_PACKED", 41, 41, bVar3, q13);
        FIXED32_LIST_PACKED = j51;
        J j52 = new J("BOOL_LIST_PACKED", 42, 42, bVar3, q14);
        BOOL_LIST_PACKED = j52;
        J j53 = new J("UINT32_LIST_PACKED", 43, 43, bVar3, q13);
        UINT32_LIST_PACKED = j53;
        J j54 = new J("ENUM_LIST_PACKED", 44, 44, bVar3, q18);
        ENUM_LIST_PACKED = j54;
        J j55 = new J("SFIXED32_LIST_PACKED", 45, 45, bVar3, q13);
        SFIXED32_LIST_PACKED = j55;
        J j56 = new J("SFIXED64_LIST_PACKED", 46, 46, bVar3, q12);
        SFIXED64_LIST_PACKED = j56;
        J j57 = new J("SINT32_LIST_PACKED", 47, 47, bVar3, q13);
        SINT32_LIST_PACKED = j57;
        J j58 = new J("SINT64_LIST_PACKED", 48, 48, bVar3, q12);
        SINT64_LIST_PACKED = j58;
        J j59 = new J("GROUP_LIST", 49, 49, bVar2, q16);
        GROUP_LIST = j59;
        J j60 = new J("MAP", 50, 50, b.MAP, Q.VOID);
        MAP = j60;
        $VALUES = new J[]{j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60};
        EMPTY_TYPES = new java.lang.reflect.Type[0];
        J[] jArrValues = values();
        VALUES = new J[jArrValues.length];
        for (J j61 : jArrValues) {
            VALUES[j61.f32113id] = j61;
        }
    }

    public J(String str, int i10, int i11, b bVar, Q q10) {
        int i12;
        this.f32113id = i11;
        this.collection = bVar;
        this.javaType = q10;
        int i13 = a.f32114a[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = q10.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f32115b[q10.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static J valueOf(String str) {
        return (J) java.lang.Enum.valueOf(J.class, str);
    }

    public static J[] values() {
        return (J[]) $VALUES.clone();
    }

    public int a() {
        return this.f32113id;
    }
}
