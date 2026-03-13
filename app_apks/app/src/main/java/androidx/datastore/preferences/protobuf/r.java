package androidx.datastore.preferences.protobuf;

import java.lang.reflect.Type;

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
/* JADX INFO: loaded from: classes.dex */
public final class r {
    private static final /* synthetic */ r[] $VALUES;
    public static final r BOOL;
    public static final r BOOL_LIST;
    public static final r BOOL_LIST_PACKED;
    public static final r BYTES;
    public static final r BYTES_LIST;
    public static final r DOUBLE;
    public static final r DOUBLE_LIST;
    public static final r DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final r ENUM;
    public static final r ENUM_LIST;
    public static final r ENUM_LIST_PACKED;
    public static final r FIXED32;
    public static final r FIXED32_LIST;
    public static final r FIXED32_LIST_PACKED;
    public static final r FIXED64;
    public static final r FIXED64_LIST;
    public static final r FIXED64_LIST_PACKED;
    public static final r FLOAT;
    public static final r FLOAT_LIST;
    public static final r FLOAT_LIST_PACKED;
    public static final r GROUP;
    public static final r GROUP_LIST;
    public static final r INT32;
    public static final r INT32_LIST;
    public static final r INT32_LIST_PACKED;
    public static final r INT64;
    public static final r INT64_LIST;
    public static final r INT64_LIST_PACKED;
    public static final r MAP;
    public static final r MESSAGE;
    public static final r MESSAGE_LIST;
    public static final r SFIXED32;
    public static final r SFIXED32_LIST;
    public static final r SFIXED32_LIST_PACKED;
    public static final r SFIXED64;
    public static final r SFIXED64_LIST;
    public static final r SFIXED64_LIST_PACKED;
    public static final r SINT32;
    public static final r SINT32_LIST;
    public static final r SINT32_LIST_PACKED;
    public static final r SINT64;
    public static final r SINT64_LIST;
    public static final r SINT64_LIST_PACKED;
    public static final r STRING;
    public static final r STRING_LIST;
    public static final r UINT32;
    public static final r UINT32_LIST;
    public static final r UINT32_LIST_PACKED;
    public static final r UINT64;
    public static final r UINT64_LIST;
    public static final r UINT64_LIST_PACKED;
    private static final r[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f22899id;
    private final EnumC2716w javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f22901b;

        static {
            int[] iArr = new int[EnumC2716w.values().length];
            f22901b = iArr;
            try {
                iArr[EnumC2716w.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22901b[EnumC2716w.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22901b[EnumC2716w.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f22900a = iArr2;
            try {
                iArr2[b.MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f22900a[b.VECTOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f22900a[b.SCALAR.ordinal()] = 3;
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
        EnumC2716w enumC2716w = EnumC2716w.DOUBLE;
        r rVar = new r("DOUBLE", 0, 0, bVar, enumC2716w);
        DOUBLE = rVar;
        EnumC2716w enumC2716w2 = EnumC2716w.FLOAT;
        r rVar2 = new r("FLOAT", 1, 1, bVar, enumC2716w2);
        FLOAT = rVar2;
        EnumC2716w enumC2716w3 = EnumC2716w.LONG;
        r rVar3 = new r("INT64", 2, 2, bVar, enumC2716w3);
        INT64 = rVar3;
        r rVar4 = new r("UINT64", 3, 3, bVar, enumC2716w3);
        UINT64 = rVar4;
        EnumC2716w enumC2716w4 = EnumC2716w.INT;
        r rVar5 = new r("INT32", 4, 4, bVar, enumC2716w4);
        INT32 = rVar5;
        r rVar6 = new r("FIXED64", 5, 5, bVar, enumC2716w3);
        FIXED64 = rVar6;
        r rVar7 = new r("FIXED32", 6, 6, bVar, enumC2716w4);
        FIXED32 = rVar7;
        EnumC2716w enumC2716w5 = EnumC2716w.BOOLEAN;
        r rVar8 = new r("BOOL", 7, 7, bVar, enumC2716w5);
        BOOL = rVar8;
        EnumC2716w enumC2716w6 = EnumC2716w.STRING;
        r rVar9 = new r("STRING", 8, 8, bVar, enumC2716w6);
        STRING = rVar9;
        EnumC2716w enumC2716w7 = EnumC2716w.MESSAGE;
        r rVar10 = new r("MESSAGE", 9, 9, bVar, enumC2716w7);
        MESSAGE = rVar10;
        EnumC2716w enumC2716w8 = EnumC2716w.BYTE_STRING;
        r rVar11 = new r("BYTES", 10, 10, bVar, enumC2716w8);
        BYTES = rVar11;
        r rVar12 = new r("UINT32", 11, 11, bVar, enumC2716w4);
        UINT32 = rVar12;
        EnumC2716w enumC2716w9 = EnumC2716w.ENUM;
        r rVar13 = new r("ENUM", 12, 12, bVar, enumC2716w9);
        ENUM = rVar13;
        r rVar14 = new r("SFIXED32", 13, 13, bVar, enumC2716w4);
        SFIXED32 = rVar14;
        r rVar15 = new r("SFIXED64", 14, 14, bVar, enumC2716w3);
        SFIXED64 = rVar15;
        r rVar16 = new r("SINT32", 15, 15, bVar, enumC2716w4);
        SINT32 = rVar16;
        r rVar17 = new r("SINT64", 16, 16, bVar, enumC2716w3);
        SINT64 = rVar17;
        r rVar18 = new r("GROUP", 17, 17, bVar, enumC2716w7);
        GROUP = rVar18;
        b bVar2 = b.VECTOR;
        r rVar19 = new r("DOUBLE_LIST", 18, 18, bVar2, enumC2716w);
        DOUBLE_LIST = rVar19;
        r rVar20 = new r("FLOAT_LIST", 19, 19, bVar2, enumC2716w2);
        FLOAT_LIST = rVar20;
        r rVar21 = new r("INT64_LIST", 20, 20, bVar2, enumC2716w3);
        INT64_LIST = rVar21;
        r rVar22 = new r("UINT64_LIST", 21, 21, bVar2, enumC2716w3);
        UINT64_LIST = rVar22;
        r rVar23 = new r("INT32_LIST", 22, 22, bVar2, enumC2716w4);
        INT32_LIST = rVar23;
        r rVar24 = new r("FIXED64_LIST", 23, 23, bVar2, enumC2716w3);
        FIXED64_LIST = rVar24;
        r rVar25 = new r("FIXED32_LIST", 24, 24, bVar2, enumC2716w4);
        FIXED32_LIST = rVar25;
        r rVar26 = new r("BOOL_LIST", 25, 25, bVar2, enumC2716w5);
        BOOL_LIST = rVar26;
        r rVar27 = new r("STRING_LIST", 26, 26, bVar2, enumC2716w6);
        STRING_LIST = rVar27;
        r rVar28 = new r("MESSAGE_LIST", 27, 27, bVar2, enumC2716w7);
        MESSAGE_LIST = rVar28;
        r rVar29 = new r("BYTES_LIST", 28, 28, bVar2, enumC2716w8);
        BYTES_LIST = rVar29;
        r rVar30 = new r("UINT32_LIST", 29, 29, bVar2, enumC2716w4);
        UINT32_LIST = rVar30;
        r rVar31 = new r("ENUM_LIST", 30, 30, bVar2, enumC2716w9);
        ENUM_LIST = rVar31;
        r rVar32 = new r("SFIXED32_LIST", 31, 31, bVar2, enumC2716w4);
        SFIXED32_LIST = rVar32;
        r rVar33 = new r("SFIXED64_LIST", 32, 32, bVar2, enumC2716w3);
        SFIXED64_LIST = rVar33;
        r rVar34 = new r("SINT32_LIST", 33, 33, bVar2, enumC2716w4);
        SINT32_LIST = rVar34;
        r rVar35 = new r("SINT64_LIST", 34, 34, bVar2, enumC2716w3);
        SINT64_LIST = rVar35;
        b bVar3 = b.PACKED_VECTOR;
        r rVar36 = new r("DOUBLE_LIST_PACKED", 35, 35, bVar3, enumC2716w);
        DOUBLE_LIST_PACKED = rVar36;
        r rVar37 = new r("FLOAT_LIST_PACKED", 36, 36, bVar3, enumC2716w2);
        FLOAT_LIST_PACKED = rVar37;
        r rVar38 = new r("INT64_LIST_PACKED", 37, 37, bVar3, enumC2716w3);
        INT64_LIST_PACKED = rVar38;
        r rVar39 = new r("UINT64_LIST_PACKED", 38, 38, bVar3, enumC2716w3);
        UINT64_LIST_PACKED = rVar39;
        r rVar40 = new r("INT32_LIST_PACKED", 39, 39, bVar3, enumC2716w4);
        INT32_LIST_PACKED = rVar40;
        r rVar41 = new r("FIXED64_LIST_PACKED", 40, 40, bVar3, enumC2716w3);
        FIXED64_LIST_PACKED = rVar41;
        r rVar42 = new r("FIXED32_LIST_PACKED", 41, 41, bVar3, enumC2716w4);
        FIXED32_LIST_PACKED = rVar42;
        r rVar43 = new r("BOOL_LIST_PACKED", 42, 42, bVar3, enumC2716w5);
        BOOL_LIST_PACKED = rVar43;
        r rVar44 = new r("UINT32_LIST_PACKED", 43, 43, bVar3, enumC2716w4);
        UINT32_LIST_PACKED = rVar44;
        r rVar45 = new r("ENUM_LIST_PACKED", 44, 44, bVar3, enumC2716w9);
        ENUM_LIST_PACKED = rVar45;
        r rVar46 = new r("SFIXED32_LIST_PACKED", 45, 45, bVar3, enumC2716w4);
        SFIXED32_LIST_PACKED = rVar46;
        r rVar47 = new r("SFIXED64_LIST_PACKED", 46, 46, bVar3, enumC2716w3);
        SFIXED64_LIST_PACKED = rVar47;
        r rVar48 = new r("SINT32_LIST_PACKED", 47, 47, bVar3, enumC2716w4);
        SINT32_LIST_PACKED = rVar48;
        r rVar49 = new r("SINT64_LIST_PACKED", 48, 48, bVar3, enumC2716w3);
        SINT64_LIST_PACKED = rVar49;
        r rVar50 = new r("GROUP_LIST", 49, 49, bVar2, enumC2716w7);
        GROUP_LIST = rVar50;
        r rVar51 = new r("MAP", 50, 50, b.MAP, EnumC2716w.VOID);
        MAP = rVar51;
        $VALUES = new r[]{rVar, rVar2, rVar3, rVar4, rVar5, rVar6, rVar7, rVar8, rVar9, rVar10, rVar11, rVar12, rVar13, rVar14, rVar15, rVar16, rVar17, rVar18, rVar19, rVar20, rVar21, rVar22, rVar23, rVar24, rVar25, rVar26, rVar27, rVar28, rVar29, rVar30, rVar31, rVar32, rVar33, rVar34, rVar35, rVar36, rVar37, rVar38, rVar39, rVar40, rVar41, rVar42, rVar43, rVar44, rVar45, rVar46, rVar47, rVar48, rVar49, rVar50, rVar51};
        EMPTY_TYPES = new Type[0];
        r[] rVarArrValues = values();
        VALUES = new r[rVarArrValues.length];
        for (r rVar52 : rVarArrValues) {
            VALUES[rVar52.f22899id] = rVar52;
        }
    }

    public r(String str, int i10, int i11, b bVar, EnumC2716w enumC2716w) {
        int i12;
        this.f22899id = i11;
        this.collection = bVar;
        this.javaType = enumC2716w;
        int i13 = a.f22900a[bVar.ordinal()];
        if (i13 == 1 || i13 == 2) {
            this.elementType = enumC2716w.a();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f22901b[enumC2716w.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    public int a() {
        return this.f22899id;
    }
}
