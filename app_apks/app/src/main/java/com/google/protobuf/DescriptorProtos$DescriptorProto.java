package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$ExtensionRangeOptions;
import com.google.protobuf.DescriptorProtos$MessageOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$DescriptorProto extends GeneratedMessageLite implements InterfaceC3734p {
    private static final DescriptorProtos$DescriptorProto DEFAULT_INSTANCE;
    public static final int ENUM_TYPE_FIELD_NUMBER = 4;
    public static final int EXTENSION_FIELD_NUMBER = 6;
    public static final int EXTENSION_RANGE_FIELD_NUMBER = 5;
    public static final int FIELD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int NESTED_TYPE_FIELD_NUMBER = 3;
    public static final int ONEOF_DECL_FIELD_NUMBER = 8;
    public static final int OPTIONS_FIELD_NUMBER = 7;
    private static volatile t0 PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 10;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 9;
    private int bitField0_;
    private DescriptorProtos$MessageOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private N.j field_ = GeneratedMessageLite.emptyProtobufList();
    private N.j extension_ = GeneratedMessageLite.emptyProtobufList();
    private N.j nestedType_ = GeneratedMessageLite.emptyProtobufList();
    private N.j enumType_ = GeneratedMessageLite.emptyProtobufList();
    private N.j extensionRange_ = GeneratedMessageLite.emptyProtobufList();
    private N.j oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
    private N.j reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    private N.j reservedName_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ExtensionRange extends GeneratedMessageLite implements b {
        private static final ExtensionRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        public static final int OPTIONS_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private byte memoizedIsInitialized = 2;
        private DescriptorProtos$ExtensionRangeOptions options_;
        private int start_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements b {
            public /* synthetic */ a(AbstractC3732o abstractC3732o) {
                this();
            }

            public a() {
                super(ExtensionRange.DEFAULT_INSTANCE);
            }
        }

        static {
            ExtensionRange extensionRange = new ExtensionRange();
            DEFAULT_INSTANCE = extensionRange;
            GeneratedMessageLite.registerDefaultInstance(ExtensionRange.class, extensionRange);
        }

        private ExtensionRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOptions() {
            this.options_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static ExtensionRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions2 = this.options_;
            if (descriptorProtos$ExtensionRangeOptions2 == null || descriptorProtos$ExtensionRangeOptions2 == DescriptorProtos$ExtensionRangeOptions.getDefaultInstance()) {
                this.options_ = descriptorProtos$ExtensionRangeOptions;
            } else {
                this.options_ = (DescriptorProtos$ExtensionRangeOptions) ((DescriptorProtos$ExtensionRangeOptions.a) DescriptorProtos$ExtensionRangeOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$ExtensionRangeOptions)).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 2;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOptions(DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions) {
            descriptorProtos$ExtensionRangeOptions.getClass();
            this.options_ = descriptorProtos$ExtensionRangeOptions;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i10) {
            this.bitField0_ |= 1;
            this.start_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            AbstractC3732o abstractC3732o = null;
            switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
                case 1:
                    return new ExtensionRange();
                case 2:
                    return new a(abstractC3732o);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "start_", "end_", "options_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ExtensionRange.class) {
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

        public int getEnd() {
            return this.end_;
        }

        public DescriptorProtos$ExtensionRangeOptions getOptions() {
            DescriptorProtos$ExtensionRangeOptions descriptorProtos$ExtensionRangeOptions = this.options_;
            return descriptorProtos$ExtensionRangeOptions == null ? DescriptorProtos$ExtensionRangeOptions.getDefaultInstance() : descriptorProtos$ExtensionRangeOptions;
        }

        public int getStart() {
            return this.start_;
        }

        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasOptions() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(ExtensionRange extensionRange) {
            return (a) DEFAULT_INSTANCE.createBuilder(extensionRange);
        }

        public static ExtensionRange parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ExtensionRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ExtensionRange parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ExtensionRange parseFrom(AbstractC3722j abstractC3722j) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ExtensionRange parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ExtensionRange parseFrom(byte[] bArr) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ExtensionRange parseFrom(byte[] bArr, D d10) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ExtensionRange parseFrom(InputStream inputStream) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ExtensionRange parseFrom(InputStream inputStream, D d10) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ExtensionRange parseFrom(AbstractC3724k abstractC3724k) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ExtensionRange parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ExtensionRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class ReservedRange extends GeneratedMessageLite implements c {
        private static final ReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile t0 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements c {
            public /* synthetic */ a(AbstractC3732o abstractC3732o) {
                this();
            }

            public a() {
                super(ReservedRange.DEFAULT_INSTANCE);
            }
        }

        static {
            ReservedRange reservedRange = new ReservedRange();
            DEFAULT_INSTANCE = reservedRange;
            GeneratedMessageLite.registerDefaultInstance(ReservedRange.class, reservedRange);
        }

        private ReservedRange() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -3;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStart() {
            this.bitField0_ &= -2;
            this.start_ = 0;
        }

        public static ReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 2;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStart(int i10) {
            this.bitField0_ |= 1;
            this.start_ = i10;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AbstractC3732o.f32325a[gVar.ordinal()];
            AbstractC3732o abstractC3732o = null;
            switch (i10) {
                case 1:
                    return new ReservedRange();
                case 2:
                    return new a(abstractC3732o);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"bitField0_", "start_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (ReservedRange.class) {
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
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public int getEnd() {
            return this.end_;
        }

        public int getStart() {
            return this.start_;
        }

        public boolean hasEnd() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasStart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(ReservedRange reservedRange) {
            return (a) DEFAULT_INSTANCE.createBuilder(reservedRange);
        }

        public static ReservedRange parseDelimitedFrom(InputStream inputStream, D d10) {
            return (ReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReservedRange parseFrom(ByteBuffer byteBuffer, D d10) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static ReservedRange parseFrom(AbstractC3722j abstractC3722j) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static ReservedRange parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static ReservedRange parseFrom(byte[] bArr) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ReservedRange parseFrom(byte[] bArr, D d10) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static ReservedRange parseFrom(InputStream inputStream) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ReservedRange parseFrom(InputStream inputStream, D d10) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static ReservedRange parseFrom(AbstractC3724k abstractC3724k) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static ReservedRange parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (ReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3734p {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$DescriptorProto.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends InterfaceC3719h0 {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends InterfaceC3719h0 {
    }

    static {
        DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto = new DescriptorProtos$DescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$DescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$DescriptorProto.class, descriptorProtos$DescriptorProto);
    }

    private DescriptorProtos$DescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnumType(Iterable<? extends DescriptorProtos$EnumDescriptorProto> iterable) {
        ensureEnumTypeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.enumType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtension(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureExtensionIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.extension_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllExtensionRange(Iterable<? extends ExtensionRange> iterable) {
        ensureExtensionRangeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.extensionRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllField(Iterable<? extends DescriptorProtos$FieldDescriptorProto> iterable) {
        ensureFieldIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.field_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllNestedType(Iterable<? extends DescriptorProtos$DescriptorProto> iterable) {
        ensureNestedTypeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.nestedType_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllOneofDecl(Iterable<? extends DescriptorProtos$OneofDescriptorProto> iterable) {
        ensureOneofDeclIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.oneofDecl_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends ReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionRange(ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedName(String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedNameBytes(AbstractC3722j abstractC3722j) {
        ensureReservedNameIsMutable();
        this.reservedName_.add(abstractC3722j.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(reservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnumType() {
        this.enumType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtension() {
        this.extension_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExtensionRange() {
        this.extensionRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearField() {
        this.field_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNestedType() {
        this.nestedType_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOneofDecl() {
        this.oneofDecl_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOptions() {
        this.options_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedName() {
        this.reservedName_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReservedRange() {
        this.reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureEnumTypeIsMutable() {
        N.j jVar = this.enumType_;
        if (jVar.m()) {
            return;
        }
        this.enumType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureExtensionIsMutable() {
        N.j jVar = this.extension_;
        if (jVar.m()) {
            return;
        }
        this.extension_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureExtensionRangeIsMutable() {
        N.j jVar = this.extensionRange_;
        if (jVar.m()) {
            return;
        }
        this.extensionRange_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureFieldIsMutable() {
        N.j jVar = this.field_;
        if (jVar.m()) {
            return;
        }
        this.field_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureNestedTypeIsMutable() {
        N.j jVar = this.nestedType_;
        if (jVar.m()) {
            return;
        }
        this.nestedType_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureOneofDeclIsMutable() {
        N.j jVar = this.oneofDecl_;
        if (jVar.m()) {
            return;
        }
        this.oneofDecl_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureReservedNameIsMutable() {
        N.j jVar = this.reservedName_;
        if (jVar.m()) {
            return;
        }
        this.reservedName_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureReservedRangeIsMutable() {
        N.j jVar = this.reservedRange_;
        if (jVar.m()) {
            return;
        }
        this.reservedRange_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$DescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions2 = this.options_;
        if (descriptorProtos$MessageOptions2 == null || descriptorProtos$MessageOptions2 == DescriptorProtos$MessageOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$MessageOptions;
        } else {
            this.options_ = (DescriptorProtos$MessageOptions) ((DescriptorProtos$MessageOptions.a) DescriptorProtos$MessageOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$MessageOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnumType(int i10) {
        ensureEnumTypeIsMutable();
        this.enumType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtension(int i10) {
        ensureExtensionIsMutable();
        this.extension_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeExtensionRange(int i10) {
        ensureExtensionRangeIsMutable();
        this.extensionRange_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeField(int i10) {
        ensureFieldIsMutable();
        this.field_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeNestedType(int i10) {
        ensureNestedTypeIsMutable();
        this.nestedType_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeOneofDecl(int i10) {
        ensureOneofDeclIsMutable();
        this.oneofDecl_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i10) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.set(i10, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.set(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExtensionRange(int i10, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.set(i10, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setField(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.set(i10, descriptorProtos$FieldDescriptorProto);
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
    public void setNestedType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.set(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.set(i10, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOptions(DescriptorProtos$MessageOptions descriptorProtos$MessageOptions) {
        descriptorProtos$MessageOptions.getClass();
        this.options_ = descriptorProtos$MessageOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i10, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i10, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i10, reservedRange);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$DescriptorProto();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\n\n\u0000\b\u0007\u0001ဈ\u0000\u0002Л\u0003Л\u0004Л\u0005Л\u0006Л\u0007ᐉ\u0001\bЛ\t\u001b\n\u001a", new Object[]{"bitField0_", "name_", "field_", DescriptorProtos$FieldDescriptorProto.class, "nestedType_", DescriptorProtos$DescriptorProto.class, "enumType_", DescriptorProtos$EnumDescriptorProto.class, "extensionRange_", ExtensionRange.class, "extension_", DescriptorProtos$FieldDescriptorProto.class, "options_", "oneofDecl_", DescriptorProtos$OneofDescriptorProto.class, "reservedRange_", ReservedRange.class, "reservedName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$DescriptorProto.class) {
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

    public DescriptorProtos$EnumDescriptorProto getEnumType(int i10) {
        return (DescriptorProtos$EnumDescriptorProto) this.enumType_.get(i10);
    }

    public int getEnumTypeCount() {
        return this.enumType_.size();
    }

    public List<DescriptorProtos$EnumDescriptorProto> getEnumTypeList() {
        return this.enumType_;
    }

    public InterfaceC3736q getEnumTypeOrBuilder(int i10) {
        return (InterfaceC3736q) this.enumType_.get(i10);
    }

    public List<? extends InterfaceC3736q> getEnumTypeOrBuilderList() {
        return this.enumType_;
    }

    public DescriptorProtos$FieldDescriptorProto getExtension(int i10) {
        return (DescriptorProtos$FieldDescriptorProto) this.extension_.get(i10);
    }

    public int getExtensionCount() {
        return this.extension_.size();
    }

    public List<DescriptorProtos$FieldDescriptorProto> getExtensionList() {
        return this.extension_;
    }

    public InterfaceC3739s getExtensionOrBuilder(int i10) {
        return (InterfaceC3739s) this.extension_.get(i10);
    }

    public List<? extends InterfaceC3739s> getExtensionOrBuilderList() {
        return this.extension_;
    }

    public ExtensionRange getExtensionRange(int i10) {
        return (ExtensionRange) this.extensionRange_.get(i10);
    }

    public int getExtensionRangeCount() {
        return this.extensionRange_.size();
    }

    public List<ExtensionRange> getExtensionRangeList() {
        return this.extensionRange_;
    }

    public b getExtensionRangeOrBuilder(int i10) {
        return (b) this.extensionRange_.get(i10);
    }

    public List<? extends b> getExtensionRangeOrBuilderList() {
        return this.extensionRange_;
    }

    public DescriptorProtos$FieldDescriptorProto getField(int i10) {
        return (DescriptorProtos$FieldDescriptorProto) this.field_.get(i10);
    }

    public int getFieldCount() {
        return this.field_.size();
    }

    public List<DescriptorProtos$FieldDescriptorProto> getFieldList() {
        return this.field_;
    }

    public InterfaceC3739s getFieldOrBuilder(int i10) {
        return (InterfaceC3739s) this.field_.get(i10);
    }

    public List<? extends InterfaceC3739s> getFieldOrBuilderList() {
        return this.field_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public DescriptorProtos$DescriptorProto getNestedType(int i10) {
        return (DescriptorProtos$DescriptorProto) this.nestedType_.get(i10);
    }

    public int getNestedTypeCount() {
        return this.nestedType_.size();
    }

    public List<DescriptorProtos$DescriptorProto> getNestedTypeList() {
        return this.nestedType_;
    }

    public InterfaceC3734p getNestedTypeOrBuilder(int i10) {
        return (InterfaceC3734p) this.nestedType_.get(i10);
    }

    public List<? extends InterfaceC3734p> getNestedTypeOrBuilderList() {
        return this.nestedType_;
    }

    public DescriptorProtos$OneofDescriptorProto getOneofDecl(int i10) {
        return (DescriptorProtos$OneofDescriptorProto) this.oneofDecl_.get(i10);
    }

    public int getOneofDeclCount() {
        return this.oneofDecl_.size();
    }

    public List<DescriptorProtos$OneofDescriptorProto> getOneofDeclList() {
        return this.oneofDecl_;
    }

    public InterfaceC3742v getOneofDeclOrBuilder(int i10) {
        return (InterfaceC3742v) this.oneofDecl_.get(i10);
    }

    public List<? extends InterfaceC3742v> getOneofDeclOrBuilderList() {
        return this.oneofDecl_;
    }

    public DescriptorProtos$MessageOptions getOptions() {
        DescriptorProtos$MessageOptions descriptorProtos$MessageOptions = this.options_;
        return descriptorProtos$MessageOptions == null ? DescriptorProtos$MessageOptions.getDefaultInstance() : descriptorProtos$MessageOptions;
    }

    public String getReservedName(int i10) {
        return (String) this.reservedName_.get(i10);
    }

    public AbstractC3722j getReservedNameBytes(int i10) {
        return AbstractC3722j.n((String) this.reservedName_.get(i10));
    }

    public int getReservedNameCount() {
        return this.reservedName_.size();
    }

    public List<String> getReservedNameList() {
        return this.reservedName_;
    }

    public ReservedRange getReservedRange(int i10) {
        return (ReservedRange) this.reservedRange_.get(i10);
    }

    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    public List<ReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public c getReservedRangeOrBuilder(int i10) {
        return (c) this.reservedRange_.get(i10);
    }

    public List<? extends c> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$DescriptorProto);
    }

    public static DescriptorProtos$DescriptorProto parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnumType(int i10, DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        descriptorProtos$EnumDescriptorProto.getClass();
        ensureEnumTypeIsMutable();
        this.enumType_.add(i10, descriptorProtos$EnumDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtension(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureExtensionIsMutable();
        this.extension_.add(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addExtensionRange(int i10, ExtensionRange extensionRange) {
        extensionRange.getClass();
        ensureExtensionRangeIsMutable();
        this.extensionRange_.add(i10, extensionRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addField(int i10, DescriptorProtos$FieldDescriptorProto descriptorProtos$FieldDescriptorProto) {
        descriptorProtos$FieldDescriptorProto.getClass();
        ensureFieldIsMutable();
        this.field_.add(i10, descriptorProtos$FieldDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addNestedType(int i10, DescriptorProtos$DescriptorProto descriptorProtos$DescriptorProto) {
        descriptorProtos$DescriptorProto.getClass();
        ensureNestedTypeIsMutable();
        this.nestedType_.add(i10, descriptorProtos$DescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addOneofDecl(int i10, DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        descriptorProtos$OneofDescriptorProto.getClass();
        ensureOneofDeclIsMutable();
        this.oneofDecl_.add(i10, descriptorProtos$OneofDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i10, ReservedRange reservedRange) {
        reservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i10, reservedRange);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$DescriptorProto parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$DescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
