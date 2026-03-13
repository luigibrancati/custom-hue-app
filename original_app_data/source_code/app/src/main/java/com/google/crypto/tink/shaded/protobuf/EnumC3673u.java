package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Type;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'DOUBLE' uses external variables
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
/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC3673u {
    private static final /* synthetic */ EnumC3673u[] $VALUES;
    public static final EnumC3673u BOOL;
    public static final EnumC3673u BOOL_LIST;
    public static final EnumC3673u BOOL_LIST_PACKED;
    public static final EnumC3673u BYTES;
    public static final EnumC3673u BYTES_LIST;
    public static final EnumC3673u DOUBLE;
    public static final EnumC3673u DOUBLE_LIST;
    public static final EnumC3673u DOUBLE_LIST_PACKED;
    private static final Type[] EMPTY_TYPES;
    public static final EnumC3673u ENUM;
    public static final EnumC3673u ENUM_LIST;
    public static final EnumC3673u ENUM_LIST_PACKED;
    public static final EnumC3673u FIXED32;
    public static final EnumC3673u FIXED32_LIST;
    public static final EnumC3673u FIXED32_LIST_PACKED;
    public static final EnumC3673u FIXED64;
    public static final EnumC3673u FIXED64_LIST;
    public static final EnumC3673u FIXED64_LIST_PACKED;
    public static final EnumC3673u FLOAT;
    public static final EnumC3673u FLOAT_LIST;
    public static final EnumC3673u FLOAT_LIST_PACKED;
    public static final EnumC3673u GROUP;
    public static final EnumC3673u GROUP_LIST;
    public static final EnumC3673u INT32;
    public static final EnumC3673u INT32_LIST;
    public static final EnumC3673u INT32_LIST_PACKED;
    public static final EnumC3673u INT64;
    public static final EnumC3673u INT64_LIST;
    public static final EnumC3673u INT64_LIST_PACKED;
    public static final EnumC3673u MAP;
    public static final EnumC3673u MESSAGE;
    public static final EnumC3673u MESSAGE_LIST;
    public static final EnumC3673u SFIXED32;
    public static final EnumC3673u SFIXED32_LIST;
    public static final EnumC3673u SFIXED32_LIST_PACKED;
    public static final EnumC3673u SFIXED64;
    public static final EnumC3673u SFIXED64_LIST;
    public static final EnumC3673u SFIXED64_LIST_PACKED;
    public static final EnumC3673u SINT32;
    public static final EnumC3673u SINT32_LIST;
    public static final EnumC3673u SINT32_LIST_PACKED;
    public static final EnumC3673u SINT64;
    public static final EnumC3673u SINT64_LIST;
    public static final EnumC3673u SINT64_LIST_PACKED;
    public static final EnumC3673u STRING;
    public static final EnumC3673u STRING_LIST;
    public static final EnumC3673u UINT32;
    public static final EnumC3673u UINT32_LIST;
    public static final EnumC3673u UINT32_LIST_PACKED;
    public static final EnumC3673u UINT64;
    public static final EnumC3673u UINT64_LIST;
    public static final EnumC3673u UINT64_LIST_PACKED;
    private static final EnumC3673u[] VALUES;
    private final b collection;
    private final Class<?> elementType;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f31571id;
    private final B javaType;
    private final boolean primitiveScalar;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31572a;

        static {
            int[] iArr = new int[B.values().length];
            f31572a = iArr;
            try {
                iArr[B.BYTE_STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31572a[B.MESSAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31572a[B.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.u$b */
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
        B b10 = B.DOUBLE;
        DOUBLE = new EnumC3673u("DOUBLE", 0, 0, bVar, b10);
        B b11 = B.FLOAT;
        FLOAT = new EnumC3673u("FLOAT", 1, 1, bVar, b11);
        B b12 = B.LONG;
        INT64 = new EnumC3673u("INT64", 2, 2, bVar, b12);
        UINT64 = new EnumC3673u("UINT64", 3, 3, bVar, b12);
        B b13 = B.INT;
        INT32 = new EnumC3673u("INT32", 4, 4, bVar, b13);
        FIXED64 = new EnumC3673u("FIXED64", 5, 5, bVar, b12);
        FIXED32 = new EnumC3673u("FIXED32", 6, 6, bVar, b13);
        B b14 = B.BOOLEAN;
        BOOL = new EnumC3673u("BOOL", 7, 7, bVar, b14);
        B b15 = B.STRING;
        STRING = new EnumC3673u("STRING", 8, 8, bVar, b15);
        B b16 = B.MESSAGE;
        MESSAGE = new EnumC3673u("MESSAGE", 9, 9, bVar, b16);
        B b17 = B.BYTE_STRING;
        BYTES = new EnumC3673u("BYTES", 10, 10, bVar, b17);
        UINT32 = new EnumC3673u("UINT32", 11, 11, bVar, b13);
        B b18 = B.ENUM;
        ENUM = new EnumC3673u("ENUM", 12, 12, bVar, b18);
        SFIXED32 = new EnumC3673u("SFIXED32", 13, 13, bVar, b13);
        SFIXED64 = new EnumC3673u("SFIXED64", 14, 14, bVar, b12);
        SINT32 = new EnumC3673u("SINT32", 15, 15, bVar, b13);
        SINT64 = new EnumC3673u("SINT64", 16, 16, bVar, b12);
        GROUP = new EnumC3673u("GROUP", 17, 17, bVar, b16);
        b bVar2 = b.VECTOR;
        DOUBLE_LIST = new EnumC3673u("DOUBLE_LIST", 18, 18, bVar2, b10);
        FLOAT_LIST = new EnumC3673u("FLOAT_LIST", 19, 19, bVar2, b11);
        INT64_LIST = new EnumC3673u("INT64_LIST", 20, 20, bVar2, b12);
        UINT64_LIST = new EnumC3673u("UINT64_LIST", 21, 21, bVar2, b12);
        INT32_LIST = new EnumC3673u("INT32_LIST", 22, 22, bVar2, b13);
        FIXED64_LIST = new EnumC3673u("FIXED64_LIST", 23, 23, bVar2, b12);
        FIXED32_LIST = new EnumC3673u("FIXED32_LIST", 24, 24, bVar2, b13);
        BOOL_LIST = new EnumC3673u("BOOL_LIST", 25, 25, bVar2, b14);
        STRING_LIST = new EnumC3673u("STRING_LIST", 26, 26, bVar2, b15);
        MESSAGE_LIST = new EnumC3673u("MESSAGE_LIST", 27, 27, bVar2, b16);
        BYTES_LIST = new EnumC3673u("BYTES_LIST", 28, 28, bVar2, b17);
        UINT32_LIST = new EnumC3673u("UINT32_LIST", 29, 29, bVar2, b13);
        ENUM_LIST = new EnumC3673u("ENUM_LIST", 30, 30, bVar2, b18);
        SFIXED32_LIST = new EnumC3673u("SFIXED32_LIST", 31, 31, bVar2, b13);
        SFIXED64_LIST = new EnumC3673u("SFIXED64_LIST", 32, 32, bVar2, b12);
        SINT32_LIST = new EnumC3673u("SINT32_LIST", 33, 33, bVar2, b13);
        SINT64_LIST = new EnumC3673u("SINT64_LIST", 34, 34, bVar2, b12);
        b bVar3 = b.PACKED_VECTOR;
        DOUBLE_LIST_PACKED = new EnumC3673u("DOUBLE_LIST_PACKED", 35, 35, bVar3, b10);
        FLOAT_LIST_PACKED = new EnumC3673u("FLOAT_LIST_PACKED", 36, 36, bVar3, b11);
        INT64_LIST_PACKED = new EnumC3673u("INT64_LIST_PACKED", 37, 37, bVar3, b12);
        UINT64_LIST_PACKED = new EnumC3673u("UINT64_LIST_PACKED", 38, 38, bVar3, b12);
        INT32_LIST_PACKED = new EnumC3673u("INT32_LIST_PACKED", 39, 39, bVar3, b13);
        FIXED64_LIST_PACKED = new EnumC3673u("FIXED64_LIST_PACKED", 40, 40, bVar3, b12);
        FIXED32_LIST_PACKED = new EnumC3673u("FIXED32_LIST_PACKED", 41, 41, bVar3, b13);
        BOOL_LIST_PACKED = new EnumC3673u("BOOL_LIST_PACKED", 42, 42, bVar3, b14);
        UINT32_LIST_PACKED = new EnumC3673u("UINT32_LIST_PACKED", 43, 43, bVar3, b13);
        ENUM_LIST_PACKED = new EnumC3673u("ENUM_LIST_PACKED", 44, 44, bVar3, b18);
        SFIXED32_LIST_PACKED = new EnumC3673u("SFIXED32_LIST_PACKED", 45, 45, bVar3, b13);
        SFIXED64_LIST_PACKED = new EnumC3673u("SFIXED64_LIST_PACKED", 46, 46, bVar3, b12);
        SINT32_LIST_PACKED = new EnumC3673u("SINT32_LIST_PACKED", 47, 47, bVar3, b13);
        SINT64_LIST_PACKED = new EnumC3673u("SINT64_LIST_PACKED", 48, 48, bVar3, b12);
        GROUP_LIST = new EnumC3673u("GROUP_LIST", 49, 49, bVar2, b16);
        MAP = new EnumC3673u("MAP", 50, 50, b.MAP, B.VOID);
        $VALUES = a();
        EMPTY_TYPES = new Type[0];
        EnumC3673u[] enumC3673uArrValues = values();
        VALUES = new EnumC3673u[enumC3673uArrValues.length];
        for (EnumC3673u enumC3673u : enumC3673uArrValues) {
            VALUES[enumC3673u.f31571id] = enumC3673u;
        }
    }

    public EnumC3673u(String str, int i10, int i11, b bVar, B b10) {
        int i12;
        this.f31571id = i11;
        this.collection = bVar;
        this.javaType = b10;
        int iOrdinal = bVar.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            this.elementType = b10.b();
        } else {
            this.elementType = null;
        }
        this.primitiveScalar = (bVar != b.SCALAR || (i12 = a.f31572a[b10.ordinal()]) == 1 || i12 == 2 || i12 == 3) ? false : true;
    }

    public static /* synthetic */ EnumC3673u[] a() {
        return new EnumC3673u[]{DOUBLE, FLOAT, INT64, UINT64, INT32, FIXED64, FIXED32, BOOL, STRING, MESSAGE, BYTES, UINT32, ENUM, SFIXED32, SFIXED64, SINT32, SINT64, GROUP, DOUBLE_LIST, FLOAT_LIST, INT64_LIST, UINT64_LIST, INT32_LIST, FIXED64_LIST, FIXED32_LIST, BOOL_LIST, STRING_LIST, MESSAGE_LIST, BYTES_LIST, UINT32_LIST, ENUM_LIST, SFIXED32_LIST, SFIXED64_LIST, SINT32_LIST, SINT64_LIST, DOUBLE_LIST_PACKED, FLOAT_LIST_PACKED, INT64_LIST_PACKED, UINT64_LIST_PACKED, INT32_LIST_PACKED, FIXED64_LIST_PACKED, FIXED32_LIST_PACKED, BOOL_LIST_PACKED, UINT32_LIST_PACKED, ENUM_LIST_PACKED, SFIXED32_LIST_PACKED, SFIXED64_LIST_PACKED, SINT32_LIST_PACKED, SINT64_LIST_PACKED, GROUP_LIST, MAP};
    }

    public static EnumC3673u valueOf(String str) {
        return (EnumC3673u) Enum.valueOf(EnumC3673u.class, str);
    }

    public static EnumC3673u[] values() {
        return (EnumC3673u[]) $VALUES.clone();
    }

    public int b() {
        return this.f31571id;
    }
}
