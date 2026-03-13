package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$UninterpretedOption extends GeneratedMessageLite implements InterfaceC3744x {
    public static final int AGGREGATE_VALUE_FIELD_NUMBER = 8;
    private static final DescriptorProtos$UninterpretedOption DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 6;
    public static final int IDENTIFIER_VALUE_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 2;
    public static final int NEGATIVE_INT_VALUE_FIELD_NUMBER = 5;
    private static volatile t0 PARSER = null;
    public static final int POSITIVE_INT_VALUE_FIELD_NUMBER = 4;
    public static final int STRING_VALUE_FIELD_NUMBER = 7;
    private int bitField0_;
    private double doubleValue_;
    private long negativeIntValue_;
    private long positiveIntValue_;
    private byte memoizedIsInitialized = 2;
    private N.j name_ = GeneratedMessageLite.emptyProtobufList();
    private String identifierValue_ = "";
    private AbstractC3722j stringValue_ = AbstractC3722j.f32236b;
    private String aggregateValue_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class NamePart extends GeneratedMessageLite implements b {
        private static final NamePart DEFAULT_INSTANCE;
        public static final int IS_EXTENSION_FIELD_NUMBER = 2;
        public static final int NAME_PART_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private int bitField0_;
        private boolean isExtension_;
        private byte memoizedIsInitialized = 2;
        private String namePart_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements b {
            public /* synthetic */ a(AbstractC3732o abstractC3732o) {
                this();
            }

            public a() {
                super(NamePart.DEFAULT_INSTANCE);
            }
        }

        static {
            NamePart namePart = new NamePart();
            DEFAULT_INSTANCE = namePart;
            GeneratedMessageLite.registerDefaultInstance(NamePart.class, namePart);
        }

        private NamePart() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIsExtension() {
            this.bitField0_ &= -3;
            this.isExtension_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNamePart() {
            this.bitField0_ &= -2;
            this.namePart_ = getDefaultInstance().getNamePart();
        }

        public static NamePart getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream) {
            return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIsExtension(boolean z10) {
            this.bitField0_ |= 2;
            this.isExtension_ = z10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePart(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.namePart_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNamePartBytes(AbstractC3722j abstractC3722j) {
            this.namePart_ = abstractC3722j.J();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            AbstractC3732o abstractC3732o = null;
            switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
                case 1:
                    return new NamePart();
                case 2:
                    return new a(abstractC3732o);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (NamePart.class) {
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

        public boolean getIsExtension() {
            return this.isExtension_;
        }

        public String getNamePart() {
            return this.namePart_;
        }

        public AbstractC3722j getNamePartBytes() {
            return AbstractC3722j.n(this.namePart_);
        }

        public boolean hasIsExtension() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNamePart() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(NamePart namePart) {
            return (a) DEFAULT_INSTANCE.createBuilder(namePart);
        }

        public static NamePart parseDelimitedFrom(InputStream inputStream, D d10) {
            return (NamePart) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NamePart parseFrom(ByteBuffer byteBuffer, D d10) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static NamePart parseFrom(AbstractC3722j abstractC3722j) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static NamePart parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static NamePart parseFrom(byte[] bArr) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static NamePart parseFrom(byte[] bArr, D d10) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static NamePart parseFrom(InputStream inputStream) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static NamePart parseFrom(InputStream inputStream, D d10) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static NamePart parseFrom(AbstractC3724k abstractC3724k) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static NamePart parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (NamePart) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3744x {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$UninterpretedOption.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends InterfaceC3719h0 {
    }

    static {
        DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption = new DescriptorProtos$UninterpretedOption();
        DEFAULT_INSTANCE = descriptorProtos$UninterpretedOption;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$UninterpretedOption.class, descriptorProtos$UninterpretedOption);
    }

    private DescriptorProtos$UninterpretedOption() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllName(Iterable<? extends NamePart> iterable) {
        ensureNameIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.name_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAggregateValue() {
        this.bitField0_ &= -33;
        this.aggregateValue_ = getDefaultInstance().getAggregateValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        this.bitField0_ &= -9;
        this.doubleValue_ = 0.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdentifierValue() {
        this.bitField0_ &= -2;
        this.identifierValue_ = getDefaultInstance().getIdentifierValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNegativeIntValue() {
        this.bitField0_ &= -5;
        this.negativeIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPositiveIntValue() {
        this.bitField0_ &= -3;
        this.positiveIntValue_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        this.bitField0_ &= -17;
        this.stringValue_ = getDefaultInstance().getStringValue();
    }

    private void ensureNameIsMutable() {
        N.j jVar = this.name_;
        if (jVar.m()) {
            return;
        }
        this.name_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$UninterpretedOption getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeName(int i10) {
        ensureNameIsMutable();
        this.name_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValue(String str) {
        str.getClass();
        this.bitField0_ |= 32;
        this.aggregateValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAggregateValueBytes(AbstractC3722j abstractC3722j) {
        this.aggregateValue_ = abstractC3722j.J();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d10) {
        this.bitField0_ |= 8;
        this.doubleValue_ = d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValue(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.identifierValue_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdentifierValueBytes(AbstractC3722j abstractC3722j) {
        this.identifierValue_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(int i10, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.set(i10, namePart);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNegativeIntValue(long j10) {
        this.bitField0_ |= 4;
        this.negativeIntValue_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPositiveIntValue(long j10) {
        this.bitField0_ |= 2;
        this.positiveIntValue_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(AbstractC3722j abstractC3722j) {
        abstractC3722j.getClass();
        this.bitField0_ |= 16;
        this.stringValue_ = abstractC3722j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$UninterpretedOption();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"bitField0_", "name_", NamePart.class, "identifierValue_", "positiveIntValue_", "negativeIntValue_", "doubleValue_", "stringValue_", "aggregateValue_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$UninterpretedOption.class) {
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

    public String getAggregateValue() {
        return this.aggregateValue_;
    }

    public AbstractC3722j getAggregateValueBytes() {
        return AbstractC3722j.n(this.aggregateValue_);
    }

    public double getDoubleValue() {
        return this.doubleValue_;
    }

    public String getIdentifierValue() {
        return this.identifierValue_;
    }

    public AbstractC3722j getIdentifierValueBytes() {
        return AbstractC3722j.n(this.identifierValue_);
    }

    public NamePart getName(int i10) {
        return (NamePart) this.name_.get(i10);
    }

    public int getNameCount() {
        return this.name_.size();
    }

    public List<NamePart> getNameList() {
        return this.name_;
    }

    public b getNameOrBuilder(int i10) {
        return (b) this.name_.get(i10);
    }

    public List<? extends b> getNameOrBuilderList() {
        return this.name_;
    }

    public long getNegativeIntValue() {
        return this.negativeIntValue_;
    }

    public long getPositiveIntValue() {
        return this.positiveIntValue_;
    }

    public AbstractC3722j getStringValue() {
        return this.stringValue_;
    }

    public boolean hasAggregateValue() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasDoubleValue() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIdentifierValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNegativeIntValue() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPositiveIntValue() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStringValue() {
        return (this.bitField0_ & 16) != 0;
    }

    public static a newBuilder(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$UninterpretedOption parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addName(int i10, NamePart namePart) {
        namePart.getClass();
        ensureNameIsMutable();
        this.name_.add(i10, namePart);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$UninterpretedOption parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$UninterpretedOption) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
