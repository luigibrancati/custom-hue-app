package com.google.protobuf;

import com.google.protobuf.DescriptorProtos$OneofOptions;
import com.google.protobuf.GeneratedMessageLite;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$OneofDescriptorProto extends GeneratedMessageLite implements InterfaceC3742v {
    private static final DescriptorProtos$OneofDescriptorProto DEFAULT_INSTANCE;
    public static final int NAME_FIELD_NUMBER = 1;
    public static final int OPTIONS_FIELD_NUMBER = 2;
    private static volatile t0 PARSER;
    private int bitField0_;
    private byte memoizedIsInitialized = 2;
    private String name_ = "";
    private DescriptorProtos$OneofOptions options_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3742v {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$OneofDescriptorProto.DEFAULT_INSTANCE);
        }
    }

    static {
        DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto = new DescriptorProtos$OneofDescriptorProto();
        DEFAULT_INSTANCE = descriptorProtos$OneofDescriptorProto;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$OneofDescriptorProto.class, descriptorProtos$OneofDescriptorProto);
    }

    private DescriptorProtos$OneofDescriptorProto() {
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

    public static DescriptorProtos$OneofDescriptorProto getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.getClass();
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions2 = this.options_;
        if (descriptorProtos$OneofOptions2 == null || descriptorProtos$OneofOptions2 == DescriptorProtos$OneofOptions.getDefaultInstance()) {
            this.options_ = descriptorProtos$OneofOptions;
        } else {
            this.options_ = (DescriptorProtos$OneofOptions) ((DescriptorProtos$OneofOptions.a) DescriptorProtos$OneofOptions.newBuilder(this.options_).mergeFrom((GeneratedMessageLite) descriptorProtos$OneofOptions)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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
    public void setOptions(DescriptorProtos$OneofOptions descriptorProtos$OneofOptions) {
        descriptorProtos$OneofOptions.getClass();
        this.options_ = descriptorProtos$OneofOptions;
        this.bitField0_ |= 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$OneofDescriptorProto();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဈ\u0000\u0002ᐉ\u0001", new Object[]{"bitField0_", "name_", "options_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$OneofDescriptorProto.class) {
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

    public DescriptorProtos$OneofOptions getOptions() {
        DescriptorProtos$OneofOptions descriptorProtos$OneofOptions = this.options_;
        return descriptorProtos$OneofOptions == null ? DescriptorProtos$OneofOptions.getDefaultInstance() : descriptorProtos$OneofOptions;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOptions() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(DescriptorProtos$OneofDescriptorProto descriptorProtos$OneofDescriptorProto) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$OneofDescriptorProto);
    }

    public static DescriptorProtos$OneofDescriptorProto parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$OneofDescriptorProto parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$OneofDescriptorProto) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
