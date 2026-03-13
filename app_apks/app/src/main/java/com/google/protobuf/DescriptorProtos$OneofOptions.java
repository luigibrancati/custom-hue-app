package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$OneofOptions extends GeneratedMessageLite.ExtendableMessage<DescriptorProtos$OneofOptions, a> implements InterfaceC3719h0 {
    private static final DescriptorProtos$OneofOptions DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int UNINTERPRETED_OPTION_FIELD_NUMBER = 999;
    private byte memoizedIsInitialized = 2;
    private N.j uninterpretedOption_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.d implements InterfaceC3719h0 {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$OneofOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = new DescriptorProtos$OneofOptions();
        DEFAULT_INSTANCE = descriptorProtos$OneofOptions;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$OneofOptions.class, descriptorProtos$OneofOptions);
    }

    private DescriptorProtos$OneofOptions() {
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

    public static DescriptorProtos$OneofOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
                return new DescriptorProtos$OneofOptions();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000ϧϧ\u0001\u0000\u0001\u0001ϧЛ", new Object[]{"uninterpretedOption_", DescriptorProtos$UninterpretedOption.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$OneofOptions.class) {
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

    public static a newBuilder(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofOptions);
    }

    public static DescriptorProtos$OneofOptions parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$OneofOptions parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$OneofOptions parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUninterpretedOption(int i10, DescriptorProtos$UninterpretedOption descriptorProtos$UninterpretedOption) {
        descriptorProtos$UninterpretedOption.getClass();
        ensureUninterpretedOptionIsMutable();
        this.uninterpretedOption_.add(i10, descriptorProtos$UninterpretedOption);
    }

    public static DescriptorProtos$OneofOptions parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$OneofOptions parseFrom(byte[] bArr) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$OneofOptions parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$OneofOptions parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofOptions parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$OneofOptions parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$OneofOptions parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$OneofOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
