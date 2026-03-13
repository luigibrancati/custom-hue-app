package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$ServiceOptions;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$ServiceDescriptorProto extends GeneratedMessageLite implements InterfaceC3743w {
    private static final DescriptorProtos$ServiceDescriptorProto DEFAULT_INSTANCE;
    public static final int METHOD_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 3;
    private static volatile t0 PARSER;
    private int bitField0_;
    private DescriptorProtos$ServiceOptions options_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private N.j method_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3743w {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$ServiceDescriptorProto.DEFAULT_INSTANCE);
        }
    }

    static {
        DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto = new DescriptorProtos$ServiceDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$ServiceDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$ServiceDescriptorProto.class, descriptorProtos$ServiceDescriptorProto);
    }

    private DescriptorProtos$ServiceDescriptorProto() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMethod(Iterable<? extends DescriptorProtos$MethodDescriptorProto> iterable) {
        ensureMethodIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.method_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(descriptorProtos$MethodDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethod() {
        this.method_ = GeneratedMessageLite.emptyProtobufList();
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

    private void ensureMethodIsMutable() {
        N.j jVar = this.method_;
        if (jVar.m()) {
            return;
        }
        this.method_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$ServiceDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions2 = this.options_;
        if (descriptorProtos$ServiceOptions2 == null || descriptorProtos$ServiceOptions2 == DescriptorProtos$ServiceOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$ServiceOptions;
        } else {
            this.options_ = (DescriptorProtos$ServiceOptions) ((DescriptorProtos$ServiceOptions.a) DescriptorProtos$ServiceOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$ServiceOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMethod(int i10) {
        ensureMethodIsMutable();
        this.method_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethod(int i10, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.set(i10, descriptorProtos$MethodDescriptorProto);
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
    public void setOptions(DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions) {
        descriptorProtos$ServiceOptions.getClass();
        this.options_ = descriptorProtos$ServiceOptions;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$ServiceDescriptorProto();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0002\u0001ဈ\u0000\u0002Л\u0003ᐉ\u0001", new Object[]{"bitField0_", "name_", "method_", DescriptorProtos$MethodDescriptorProto.class, "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$ServiceDescriptorProto.class) {
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

    public DescriptorProtos$MethodDescriptorProto getMethod(int i10) {
        return (DescriptorProtos$MethodDescriptorProto) this.method_.get(i10);
    }

    public int getMethodCount() {
        return this.method_.size();
    }

    public List<DescriptorProtos$MethodDescriptorProto> getMethodList() {
        return this.method_;
    }

    public InterfaceC3741u getMethodOrBuilder(int i10) {
        return (InterfaceC3741u) this.method_.get(i10);
    }

    public List<? extends InterfaceC3741u> getMethodOrBuilderList() {
        return this.method_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public DescriptorProtos$ServiceOptions getOptions() {
        DescriptorProtos$ServiceOptions descriptorProtos$ServiceOptions = this.options_;
        return descriptorProtos$ServiceOptions == null ? DescriptorProtos$ServiceOptions.getDefaultInstance() : descriptorProtos$ServiceOptions;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DescriptorProtos$ServiceDescriptorProto descriptorProtos$ServiceDescriptorProto) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$ServiceDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMethod(int i10, DescriptorProtos$MethodDescriptorProto descriptorProtos$MethodDescriptorProto) {
        descriptorProtos$MethodDescriptorProto.getClass();
        ensureMethodIsMutable();
        this.method_.add(i10, descriptorProtos$MethodDescriptorProto);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$ServiceDescriptorProto parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$ServiceDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
