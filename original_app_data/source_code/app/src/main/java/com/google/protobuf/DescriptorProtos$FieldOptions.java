package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$FieldOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$FieldOptions, a> implements InterfaceC3719h0 {
    public static final int CTYPE_FIELD_NUMBER = 1;
    private static final DescriptorProtos$FieldOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 3;
    public static final int JSTYPE_FIELD_NUMBER = 6;
    public static final int LAZY_FIELD_NUMBER = 5;
    public static final int PACKED_FIELD_NUMBER = 2;
    private static volatile t0 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    public static final int WEAK_FIELD_NUMBER = 10;
    private int bitField0_;
    private int ctype_;
    private boolean deprecated_;
    private int jstype_;
    private boolean lazy_;
    private boolean packed_;
    private boolean weak_;
    private byte memoizedIsInitialized = 2;
    private N.j uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.d implements InterfaceC3719h0 {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$FieldOptions.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b implements N.c {
        STRING(0),
        CORD(1),
        STRING_PIECE(2);

        public static final int CORD_VALUE = 1;
        public static final int STRING_PIECE_VALUE = 2;
        public static final int STRING_VALUE = 0;
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

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$FieldOptions$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0378b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f32073a = new C0378b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return b.b(i10) != null;
            }
        }

        b(int i10) {
            this.value = i10;
        }

        public static b b(int i10) {
            if (i10 == 0) {
                return STRING;
            }
            if (i10 == 1) {
                return CORD;
            }
            if (i10 != 2) {
                return null;
            }
            return STRING_PIECE;
        }

        public static N.e j() {
            return C0378b.f32073a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements N.c {
        JS_NORMAL(0),
        JS_STRING(1),
        JS_NUMBER(2);

        public static final int JS_NORMAL_VALUE = 0;
        public static final int JS_NUMBER_VALUE = 2;
        public static final int JS_STRING_VALUE = 1;
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
            public static final N.e f32074a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return c.b(i10) != null;
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return JS_NORMAL;
            }
            if (i10 == 1) {
                return JS_STRING;
            }
            if (i10 != 2) {
                return null;
            }
            return JS_NUMBER;
        }

        public static N.e j() {
            return b.f32074a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        DescriptorProtos$FieldOptions descriptorProtos$FieldOptions = new DescriptorProtos$FieldOptions();
        DEFAULT_INSTANCE = descriptorProtos$FieldOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FieldOptions.class, descriptorProtos$FieldOptions);
    }

    private DescriptorProtos$FieldOptions() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUninterpretedOption(Iterable<? extends DescriptorProtos$UninterpretedOption> iterable) {
        ensureUninterpretedOptionIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.uninterpretedOption_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtype() {
        this.bitField0_ &= -2;
        this.ctype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeprecated() {
        this.bitField0_ &= -17;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJstype() {
        this.bitField0_ &= -5;
        this.jstype_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLazy() {
        this.bitField0_ &= -9;
        this.lazy_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPacked() {
        this.bitField0_ &= -3;
        this.packed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWeak() {
        this.bitField0_ &= -33;
        this.weak_ = false;
    }

    private void ensureUninterpretedOptionIsMutable() {
        N.j jVar = this.uninterpretedOption_;
        if (jVar.m()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FieldOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeUninterpretedOption(int i10) {
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtype(b bVar) {
        this.ctype_ = bVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 16;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJstype(c cVar) {
        this.jstype_ = cVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLazy(boolean z10) {
        this.bitField0_ |= 8;
        this.lazy_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPacked(boolean z10) {
        this.bitField0_ |= 2;
        this.packed_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWeak(boolean z10) {
        this.bitField0_ |= 32;
        this.weak_ = z10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FieldOptions();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001ϧ\u0007\u0000\u0001\u0001\u0001᠌\u0000\u0002ဇ\u0001\u0003ဇ\u0004\u0005ဇ\u0003\u0006᠌\u0002\nဇ\u0005ϧЛ", new Object[]{"bitField0_", "ctype_", b.j(), "packed_", "deprecated_", "lazy_", "jstype_", c.j(), "weak_", "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$FieldOptions.class) {
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

    public b getCtype() {
        b bVarB = b.b(this.ctype_);
        return bVarB == null ? b.STRING : bVarB;
    }

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public c getJstype() {
        c cVarB = c.b(this.jstype_);
        return cVarB == null ? c.JS_NORMAL : cVarB;
    }

    public boolean getLazy() {
        return this.lazy_;
    }

    public boolean getPacked() {
        return this.packed_;
    }

    public DescriptorProtos$UninterpretedOption getUninterpretedOption(int i10) {
        return (DescriptorProtos$UninterpretedOption) this.uninterpretedOption_.get(i10);
    }

    public int getUninterpretedOptionCount() {
        return this.uninterpretedOption_.size();
    }

    public List<DescriptorProtos$UninterpretedOption> getUninterpretedOptionList() {
        return this.uninterpretedOption_;
    }

    public InterfaceC3744x getUninterpretedOptionOrBuilder(int i10) {
        return (InterfaceC3744x) this.uninterpretedOption_.get(i10);
    }

    public List<? extends InterfaceC3744x> getUninterpretedOptionOrBuilderList() {
        return this.uninterpretedOption_;
    }

    public boolean getWeak() {
        return this.weak_;
    }

    public boolean hasCtype() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDeprecated() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasJstype() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLazy() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPacked() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasWeak() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(DescriptorProtos$FieldOptions descriptorProtos$FieldOptions) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FieldOptions);
    }

    public static DescriptorProtos$FieldOptions parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FieldOptions parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FieldOptions parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FieldOptions parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$FieldOptions parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$FieldOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
