package com.google.protobuf;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.DescriptorProtos$FieldOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$FieldDescriptorProto extends GeneratedMessageLite implements InterfaceC3739s {
    private static final DescriptorProtos$FieldDescriptorProto DEFAULT_INSTANCE;
    public static final int DEFAULT_VALUE_FIELD_NUMBER = 7;
    public static final int EXTENDEE_FIELD_NUMBER = 2;
    public static final int JSON_NAME_FIELD_NUMBER = 10;
    public static final int LABEL_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NUMBER_FIELD_NUMBER = 3;
    public static final int ONEOF_INDEX_FIELD_NUMBER = 9;
    public static final int OPTIONS_FIELD_NUMBER = 8;
    private static volatile t0 PARSER = null;
    public static final int PROTO3_OPTIONAL_FIELD_NUMBER = 17;
    public static final int TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_NAME_FIELD_NUMBER = 6;
    private int bitField0_;
    private int number_;
    private int oneofIndex_;
    private DescriptorProtos$FieldOptions options_;
    private boolean proto3Optional_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private int label_ = 1;
    private int type_ = 1;
    private String typeName_ = "";
    private String extendee_ = "";
    private String defaultValue_ = "";
    private String jsonName_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3739s {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$FieldDescriptorProto.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b implements N.c {
        LABEL_OPTIONAL(1),
        LABEL_REQUIRED(2),
        LABEL_REPEATED(3);

        public static final int LABEL_OPTIONAL_VALUE = 1;
        public static final int LABEL_REPEATED_VALUE = 3;
        public static final int LABEL_REQUIRED_VALUE = 2;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b findValueByNumber(int i10) {
                return b.b(i10);
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldDescriptorProto$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0377b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f32071a = new C0377b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return b.b(i10) != null;
            }
        }

        b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            if (i10 == 1) {
                return LABEL_OPTIONAL;
            }
            if (i10 == 2) {
                return LABEL_REQUIRED;
            }
            if (i10 != 3) {
                return null;
            }
            return LABEL_REPEATED;
        }

        public static N.e j() {
            return C0377b.f32071a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements N.c {
        TYPE_DOUBLE(1),
        TYPE_FLOAT(2),
        TYPE_INT64(3),
        TYPE_UINT64(4),
        TYPE_INT32(5),
        TYPE_FIXED64(6),
        TYPE_FIXED32(7),
        TYPE_BOOL(8),
        TYPE_STRING(9),
        TYPE_GROUP(10),
        TYPE_MESSAGE(11),
        TYPE_BYTES(12),
        TYPE_UINT32(13),
        TYPE_ENUM(14),
        TYPE_SFIXED32(15),
        TYPE_SFIXED64(16),
        TYPE_SINT32(17),
        TYPE_SINT64(18);

        public static final int TYPE_BOOL_VALUE = 8;
        public static final int TYPE_BYTES_VALUE = 12;
        public static final int TYPE_DOUBLE_VALUE = 1;
        public static final int TYPE_ENUM_VALUE = 14;
        public static final int TYPE_FIXED32_VALUE = 7;
        public static final int TYPE_FIXED64_VALUE = 6;
        public static final int TYPE_FLOAT_VALUE = 2;
        public static final int TYPE_GROUP_VALUE = 10;
        public static final int TYPE_INT32_VALUE = 5;
        public static final int TYPE_INT64_VALUE = 3;
        public static final int TYPE_MESSAGE_VALUE = 11;
        public static final int TYPE_SFIXED32_VALUE = 15;
        public static final int TYPE_SFIXED64_VALUE = 16;
        public static final int TYPE_SINT32_VALUE = 17;
        public static final int TYPE_SINT64_VALUE = 18;
        public static final int TYPE_STRING_VALUE = 9;
        public static final int TYPE_UINT32_VALUE = 13;
        public static final int TYPE_UINT64_VALUE = 4;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c findValueByNumber(int i10) {
                return c.b(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f32072a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return c.b(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            switch (i10) {
                case 1:
                    return TYPE_DOUBLE;
                case 2:
                    return TYPE_FLOAT;
                case 3:
                    return TYPE_INT64;
                case 4:
                    return TYPE_UINT64;
                case 5:
                    return TYPE_INT32;
                case 6:
                    return TYPE_FIXED64;
                case 7:
                    return TYPE_FIXED32;
                case 8:
                    return TYPE_BOOL;
                case 9:
                    return TYPE_STRING;
                case 10:
                    return TYPE_GROUP;
                case 11:
                    return TYPE_MESSAGE;
                case 12:
                    return TYPE_BYTES;
                case 13:
                    return TYPE_UINT32;
                case 14:
                    return TYPE_ENUM;
                case 15:
                    return TYPE_SFIXED32;
                case 16:
                    return TYPE_SFIXED64;
                case 17:
                    return TYPE_SINT32;
                case 18:
                    return TYPE_SINT64;
                default:
                    return null;
            }
        }

        public static N.e j() {
            return b.f32072a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto = new DescriptorProtos$FieldDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$FieldDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldDescriptorProto.class, descriptorProtos$FieldDescriptorProto);
    }

    private DescriptorProtos$FieldDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultValue() {
        this.bitField0_ &= -65;
        this.defaultValue_ = getDefaultInstance().getDefaultValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtendee() {
        this.bitField0_ &= -33;
        this.extendee_ = getDefaultInstance().getExtendee();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJsonName() {
        this.bitField0_ &= -257;
        this.jsonName_ = getDefaultInstance().getJsonName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabel() {
        this.bitField0_ &= -5;
        this.label_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumber() {
        this.bitField0_ &= -3;
        this.number_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofIndex() {
        this.bitField0_ &= -129;
        this.oneofIndex_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProto3Optional() {
        this.bitField0_ &= -1025;
        this.proto3Optional_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -9;
        this.type_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypeName() {
        this.bitField0_ &= -17;
        this.typeName_ = getDefaultInstance().getTypeName();
    }

    public static DescriptorProtos$FieldDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions2 = this.options_;
        if (descriptorProtos$FieldOptions2 == null || descriptorProtos$FieldOptions2 == DescriptorProtos$FieldOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$FieldOptions;
        } else {
            this.options_ = (DescriptorProtos$FieldOptions) ((DescriptorProtos$FieldOptions.a) DescriptorProtos$FieldOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$FieldOptions)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValue(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.defaultValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultValueBytes(AbstractC3722j abstractC3722j) {
        this.defaultValue_ = abstractC3722j.J();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendee(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.extendee_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtendeeBytes(AbstractC3722j abstractC3722j) {
        this.extendee_ = abstractC3722j.J();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonName(String str) {
        str.getClass();
        this.bitField0_ |= 256;
        this.jsonName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJsonNameBytes(AbstractC3722j abstractC3722j) {
        this.jsonName_ = abstractC3722j.J();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabel(b bVar) {
        this.label_ = bVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC3722j abstractC3722j) {
        this.name_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumber(int i10) {
        this.bitField0_ |= 2;
        this.number_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofIndex(int i10) {
        this.bitField0_ |= 128;
        this.oneofIndex_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        descriptorProtos$FieldOptions.getClass();
        this.options_ = descriptorProtos$FieldOptions;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProto3Optional(boolean z10) {
        this.bitField0_ |= RecognitionOptions.UPC_E;
        this.proto3Optional_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(c cVar) {
        this.type_ = cVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeName(String str) {
        str.getClass();
        this.bitField0_ |= 16;
        this.typeName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeNameBytes(AbstractC3722j abstractC3722j) {
        this.typeName_ = abstractC3722j.J();
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FieldDescriptorProto();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u0011\u000b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဈ\u0005\u0003င\u0001\u0004᠌\u0002\u0005᠌\u0003\u0006ဈ\u0004\u0007ဈ\u0006\bᐉ\t\tင\u0007\nဈ\b\u0011ဇ\n", new Object[]{"bitField0_", "name_", "extendee_", "number_", "label_", b.j(), "type_", c.j(), "typeName_", "defaultValue_", "options_", "oneofIndex_", "jsonName_", "proto3Optional_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$FieldDescriptorProto.class) {
                    try {
                        cVar = PARSER;
                        if (cVar == null) {
                            cVar = new GeneratedMessageLite.c(DEFAULT_INSTANCE);
                            PARSER = cVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cVar;
            case 6:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 7:
                this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public String getDefaultValue() {
        return this.defaultValue_;
    }

    public AbstractC3722j getDefaultValueBytes() {
        return AbstractC3722j.n(this.defaultValue_);
    }

    public String getExtendee() {
        return this.extendee_;
    }

    public AbstractC3722j getExtendeeBytes() {
        return AbstractC3722j.n(this.extendee_);
    }

    public String getJsonName() {
        return this.jsonName_;
    }

    public AbstractC3722j getJsonNameBytes() {
        return AbstractC3722j.n(this.jsonName_);
    }

    public b getLabel() {
        b bVarB = b.b(this.label_);
        return bVarB == null ? b.LABEL_OPTIONAL : bVarB;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public int getNumber() {
        return this.number_;
    }

    public int getOneofIndex() {
        return this.oneofIndex_;
    }

    public DescriptorProtos$FieldOptions getOptions() {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = this.options_;
        return descriptorProtos$FieldOptions == null ? DescriptorProtos$FieldOptions.getDefaultInstance() : descriptorProtos$FieldOptions;
    }

    public boolean getProto3Optional() {
        return this.proto3Optional_;
    }

    public c getType() {
        c cVarB = c.b(this.type_);
        return cVarB == null ? c.TYPE_DOUBLE : cVarB;
    }

    public String getTypeName() {
        return this.typeName_;
    }

    public AbstractC3722j getTypeNameBytes() {
        return AbstractC3722j.n(this.typeName_);
    }

    public boolean hasDefaultValue() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasExtendee() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasJsonName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasLabel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNumber() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOneofIndex() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasOptions() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasProto3Optional() {
        return (this.bitField0_ & RecognitionOptions.UPC_E) != 0;
    }

    public boolean hasType() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTypeName() {
        return (this.bitField0_ & 16) != 0;
    }

    public static a newBuilder(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldDescriptorProto);
    }

    public static DescriptorProtos$FieldDescriptorProto parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$FieldDescriptorProto parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$FieldDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
