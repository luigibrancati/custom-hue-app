package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$EnumOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$EnumDescriptorProto extends GeneratedMessageLite implements InterfaceC3736q {
    private static final DescriptorProtos$EnumDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile t0 PARSER = null;
    public static final int RESERVED_NAME_FIELD_NUMBER = 5;
    public static final int RESERVED_RANGE_FIELD_NUMBER = 4;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private DescriptorProtos$EnumOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private N.j value_ = GeneratedMessageLite.emptyProtobufList();
    private N.j reservedRange_ = GeneratedMessageLite.emptyProtobufList();
    private N.j reservedName_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class EnumReservedRange extends GeneratedMessageLite implements b {
        private static final EnumReservedRange DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 2;
        private static volatile t0 PARSER = null;
        public static final int START_FIELD_NUMBER = 1;
        private int bitField0_;
        private int end_;
        private int start_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements b {
            public /* synthetic */ a(AbstractC3732o abstractC3732o) {
                this();
            }

            public a() {
                super(EnumReservedRange.DEFAULT_INSTANCE);
            }
        }

        static {
            EnumReservedRange enumReservedRange = new EnumReservedRange();
            DEFAULT_INSTANCE = enumReservedRange;
            GeneratedMessageLite.registerDefaultInstance(EnumReservedRange.class, enumReservedRange);
        }

        private EnumReservedRange() {
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

        public static EnumReservedRange getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                    return new EnumReservedRange();
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
                    synchronized (EnumReservedRange.class) {
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

        public static a newBuilder(EnumReservedRange enumReservedRange) {
            return (a) DEFAULT_INSTANCE.createBuilder(enumReservedRange);
        }

        public static EnumReservedRange parseDelimitedFrom(InputStream inputStream, D d10) {
            return (EnumReservedRange) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static EnumReservedRange parseFrom(ByteBuffer byteBuffer, D d10) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static EnumReservedRange parseFrom(AbstractC3722j abstractC3722j) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static EnumReservedRange parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static EnumReservedRange parseFrom(byte[] bArr) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static EnumReservedRange parseFrom(byte[] bArr, D d10) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static EnumReservedRange parseFrom(InputStream inputStream, D d10) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static EnumReservedRange parseFrom(AbstractC3724k abstractC3724k) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static EnumReservedRange parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (EnumReservedRange) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3736q {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$EnumDescriptorProto.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b extends InterfaceC3719h0 {
    }

    static {
        DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto = new DescriptorProtos$EnumDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$EnumDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$EnumDescriptorProto.class, descriptorProtos$EnumDescriptorProto);
    }

    private DescriptorProtos$EnumDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedName(Iterable<String> iterable) {
        ensureReservedNameIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.reservedName_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllReservedRange(Iterable<? extends EnumReservedRange> iterable) {
        ensureReservedRangeIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.reservedRange_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValue(Iterable<? extends DescriptorProtos$EnumValueDescriptorProto> iterable) {
        ensureValueIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.value_);
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
    public void addReservedRange(EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(descriptorProtos$EnumValueDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureValueIsMutable() {
        N.j jVar = this.value_;
        if (jVar.m()) {
            return;
        }
        this.value_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$EnumDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions2 = this.options_;
        if (descriptorProtos$EnumOptions2 == null || descriptorProtos$EnumOptions2 == DescriptorProtos$EnumOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$EnumOptions;
        } else {
            this.options_ = (DescriptorProtos$EnumOptions) ((DescriptorProtos$EnumOptions.a) DescriptorProtos$EnumOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$EnumOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeReservedRange(int i10) {
        ensureReservedRangeIsMutable();
        this.reservedRange_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValue(int i10) {
        ensureValueIsMutable();
        this.value_.remove(i10);
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
    public void setOptions(DescriptorProtos$EnumOptions descriptorProtos$EnumOptions) {
        descriptorProtos$EnumOptions.getClass();
        this.options_ = descriptorProtos$EnumOptions;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedName(int i10, String str) {
        str.getClass();
        ensureReservedNameIsMutable();
        this.reservedName_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReservedRange(int i10, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.set(i10, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(int i10, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.set(i10, descriptorProtos$EnumValueDescriptorProto);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$EnumDescriptorProto();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0003\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001\u0004\u001b\u0005\u001a", new Object[]{"bitField0_", "name_", "value_", DescriptorProtos$EnumValueDescriptorProto.class, "options_", "reservedRange_", EnumReservedRange.class, "reservedName_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$EnumDescriptorProto.class) {
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

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public DescriptorProtos$EnumOptions getOptions() {
        DescriptorProtos$EnumOptions descriptorProtos$EnumOptions = this.options_;
        return descriptorProtos$EnumOptions == null ? DescriptorProtos$EnumOptions.getDefaultInstance() : descriptorProtos$EnumOptions;
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

    public EnumReservedRange getReservedRange(int i10) {
        return (EnumReservedRange) this.reservedRange_.get(i10);
    }

    public int getReservedRangeCount() {
        return this.reservedRange_.size();
    }

    public List<EnumReservedRange> getReservedRangeList() {
        return this.reservedRange_;
    }

    public b getReservedRangeOrBuilder(int i10) {
        return (b) this.reservedRange_.get(i10);
    }

    public List<? extends b> getReservedRangeOrBuilderList() {
        return this.reservedRange_;
    }

    public DescriptorProtos$EnumValueDescriptorProto getValue(int i10) {
        return (DescriptorProtos$EnumValueDescriptorProto) this.value_.get(i10);
    }

    public int getValueCount() {
        return this.value_.size();
    }

    public List<DescriptorProtos$EnumValueDescriptorProto> getValueList() {
        return this.value_;
    }

    public r getValueOrBuilder(int i10) {
        return (r) this.value_.get(i10);
    }

    public List<? extends r> getValueOrBuilderList() {
        return this.value_;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DescriptorProtos$EnumDescriptorProto descriptorProtos$EnumDescriptorProto) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$EnumDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addReservedRange(int i10, EnumReservedRange enumReservedRange) {
        enumReservedRange.getClass();
        ensureReservedRangeIsMutable();
        this.reservedRange_.add(i10, enumReservedRange);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValue(int i10, DescriptorProtos$EnumValueDescriptorProto descriptorProtos$EnumValueDescriptorProto) {
        descriptorProtos$EnumValueDescriptorProto.getClass();
        ensureValueIsMutable();
        this.value_.add(i10, descriptorProtos$EnumValueDescriptorProto);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$EnumDescriptorProto parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$EnumDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
