package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$MethodOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$MethodOptions, a> implements InterfaceC3719h0 {
    private static final DescriptorProtos$MethodOptions DEFAULT_INSTANCE;
    public static final int DEPRECATED_FIELD_NUMBER = 33;
    public static final int IDEMPOTENCY_LEVEL_FIELD_NUMBER = 34;
    private static volatile t0 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private int bitField0_;
    private boolean deprecated_;
    private int idempotencyLevel_;
    private byte memoizedIsInitialized = 2;
    private N.j uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.d implements InterfaceC3719h0 {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$MethodOptions.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum b implements N.c {
        IDEMPOTENCY_UNKNOWN(0),
        NO_SIDE_EFFECTS(1),
        IDEMPOTENT(2);

        public static final int IDEMPOTENCY_UNKNOWN_VALUE = 0;
        public static final int IDEMPOTENT_VALUE = 2;
        public static final int NO_SIDE_EFFECTS_VALUE = 1;
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

        /* JADX INFO: renamed from: com.google.protobuf.DescriptorProtos$MethodOptions$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0380b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f32076a = new C0380b();

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
                return IDEMPOTENCY_UNKNOWN;
            }
            if (i10 == 1) {
                return NO_SIDE_EFFECTS;
            }
            if (i10 != 2) {
                return null;
            }
            return IDEMPOTENT;
        }

        public static N.e j() {
            return C0380b.f32076a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        DescriptorProtos$MethodOptions descriptorProtos$MethodOptions = new DescriptorProtos$MethodOptions();
        DEFAULT_INSTANCE = descriptorProtos$MethodOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$MethodOptions.class, descriptorProtos$MethodOptions);
    }

    private DescriptorProtos$MethodOptions() {
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
    public void clearDeprecated() {
        this.bitField0_ &= -2;
        this.deprecated_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdempotencyLevel() {
        this.bitField0_ &= -3;
        this.idempotencyLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUninterpretedOption() {
        this.uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureUninterpretedOptionIsMutable() {
        N.j jVar = this.uninterpretedOption_;
        if (jVar.m()) {
            return;
        }
        this.uninterpretedOption_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$MethodOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setDeprecated(boolean z10) {
        this.bitField0_ |= 1;
        this.deprecated_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdempotencyLevel(b bVar) {
        this.idempotencyLevel_ = bVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.set(i10, descriptorProtos$UninterpretedOption);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$MethodOptions();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001!ϧ\u0003\u0000\u0001\u0001!ဇ\u0000\"᠌\u0001ϧЛ", new Object[]{"bitField0_", "deprecated_", "idempotencyLevel_", b.j(), "uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$MethodOptions.class) {
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

    public boolean getDeprecated() {
        return this.deprecated_;
    }

    public b getIdempotencyLevel() {
        b bVarB = b.b(this.idempotencyLevel_);
        return bVarB == null ? b.IDEMPOTENCY_UNKNOWN : bVarB;
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

    public boolean hasDeprecated() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIdempotencyLevel() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DescriptorProtos$MethodOptions descriptorProtos$MethodOptions) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$MethodOptions);
    }

    public static DescriptorProtos$MethodOptions parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$MethodOptions parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$MethodOptions parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$MethodOptions parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$MethodOptions parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$MethodOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
