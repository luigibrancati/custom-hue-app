package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f32175a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f32176b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32177c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f32178d = c(3, 2);

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32179a;

        static {
            int[] iArr = new int[b.values().length];
            f32179a = iArr;
            try {
                iArr[b.DOUBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32179a[b.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32179a[b.INT64.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32179a[b.UINT64.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32179a[b.INT32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32179a[b.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32179a[b.FIXED32.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f32179a[b.BOOL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f32179a[b.BYTES.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f32179a[b.UINT32.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f32179a[b.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f32179a[b.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f32179a[b.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f32179a[b.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f32179a[b.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f32179a[b.GROUP.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f32179a[b.MESSAGE.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f32179a[b.ENUM.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'INT64' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {
        private static final /* synthetic */ b[] $VALUES;
        public static final b BOOL;
        public static final b BYTES;
        public static final b DOUBLE;
        public static final b ENUM;
        public static final b FIXED32;
        public static final b FIXED64;
        public static final b FLOAT;
        public static final b GROUP;
        public static final b INT32;
        public static final b INT64;
        public static final b MESSAGE;
        public static final b SFIXED32;
        public static final b SFIXED64;
        public static final b SINT32;
        public static final b SINT64;
        public static final b STRING;
        public static final b UINT32;
        public static final b UINT64;
        private final c javaType;
        private final int wireType;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum a extends b {
            public a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.Q0.b
            public boolean j() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.Q0$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum C0381b extends b {
            public C0381b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.Q0.b
            public boolean j() {
                return false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum c extends b {
            public c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.Q0.b
            public boolean j() {
                return false;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum d extends b {
            public d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.Q0.b
            public boolean j() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            DOUBLE = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            FLOAT = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            INT64 = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            UINT64 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            INT32 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            FIXED64 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            FIXED32 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            BOOL = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            STRING = aVar;
            c cVar3 = c.MESSAGE;
            C0381b c0381b = new C0381b("GROUP", 9, cVar3, 3);
            GROUP = c0381b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            MESSAGE = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            BYTES = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            UINT32 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            ENUM = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            SFIXED32 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            SFIXED64 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            SINT32 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            SINT64 = bVar14;
            $VALUES = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0381b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) java.lang.Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        public c a() {
            return this.javaType;
        }

        public int b() {
            return this.wireType;
        }

        public boolean j() {
            return true;
        }

        public b(String str, int i10, c cVar, int i11) {
            this.javaType = cVar;
            this.wireType = i11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(AbstractC3722j.f32236b),
        ENUM(null),
        MESSAGE(null);

        private final Object defaultDefault;

        c(Object obj) {
            this.defaultDefault = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static abstract class d {
        private static final /* synthetic */ d[] $VALUES;
        public static final d LAZY;
        public static final d LOOSE;
        public static final d STRICT;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum a extends d {
            public a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.Q0.d
            public Object a(AbstractC3724k abstractC3724k) {
                return abstractC3724k.H();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum b extends d {
            public b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.Q0.d
            public Object a(AbstractC3724k abstractC3724k) {
                return abstractC3724k.I();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public enum c extends d {
            public c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.Q0.d
            public Object a(AbstractC3724k abstractC3724k) {
                return abstractC3724k.r();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            LOOSE = aVar;
            b bVar = new b("STRICT", 1);
            STRICT = bVar;
            c cVar = new c("LAZY", 2);
            LAZY = cVar;
            $VALUES = new d[]{aVar, bVar, cVar};
        }

        public d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) java.lang.Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) $VALUES.clone();
        }

        public abstract Object a(AbstractC3724k abstractC3724k);

        public /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    public static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    public static Object d(AbstractC3724k abstractC3724k, b bVar, d dVar) {
        switch (a.f32179a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(abstractC3724k.s());
            case 2:
                return Float.valueOf(abstractC3724k.w());
            case 3:
                return Long.valueOf(abstractC3724k.z());
            case 4:
                return Long.valueOf(abstractC3724k.L());
            case 5:
                return Integer.valueOf(abstractC3724k.y());
            case 6:
                return Long.valueOf(abstractC3724k.v());
            case 7:
                return Integer.valueOf(abstractC3724k.u());
            case 8:
                return Boolean.valueOf(abstractC3724k.q());
            case 9:
                return abstractC3724k.r();
            case 10:
                return Integer.valueOf(abstractC3724k.K());
            case 11:
                return Integer.valueOf(abstractC3724k.D());
            case 12:
                return Long.valueOf(abstractC3724k.E());
            case 13:
                return Integer.valueOf(abstractC3724k.F());
            case 14:
                return Long.valueOf(abstractC3724k.G());
            case 15:
                return dVar.a(abstractC3724k);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
