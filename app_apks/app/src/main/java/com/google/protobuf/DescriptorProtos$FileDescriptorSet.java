package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$FileDescriptorSet extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final DescriptorProtos$FileDescriptorSet DEFAULT_INSTANCE;
    public static final int FILE_FIELD_NUMBER = 1;
    private static volatile t0 PARSER;
    private byte memoizedIsInitialized = 2;
    private N.j file_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ a(AbstractC3732o abstractC3732o) {
            this();
        }

        public a() {
            super(DescriptorProtos$FileDescriptorSet.DEFAULT_INSTANCE);
        }
    }

    static {
        DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet = new DescriptorProtos$FileDescriptorSet();
        DEFAULT_INSTANCE = descriptorProtos$FileDescriptorSet;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$FileDescriptorSet.class, descriptorProtos$FileDescriptorSet);
    }

    private DescriptorProtos$FileDescriptorSet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFile(Iterable<? extends DescriptorProtos$FileDescriptorProto> iterable) {
        ensureFileIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.file_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFile(DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(descriptorProtos$FileDescriptorProto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFile() {
        this.file_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureFileIsMutable() {
        N.j jVar = this.file_;
        if (jVar.m()) {
            return;
        }
        this.file_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$FileDescriptorSet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeFile(int i10) {
        ensureFileIsMutable();
        this.file_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFile(int i10, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.set(i10, descriptorProtos$FileDescriptorProto);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        AbstractC3732o abstractC3732o = null;
        switch (AbstractC3732o.f32325a[gVar.ordinal()]) {
            case 1:
                return new DescriptorProtos$FileDescriptorSet();
            case 2:
                return new a(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"file_", DescriptorProtos$FileDescriptorProto.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$FileDescriptorSet.class) {
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

    public DescriptorProtos$FileDescriptorProto getFile(int i10) {
        return (DescriptorProtos$FileDescriptorProto) this.file_.get(i10);
    }

    public int getFileCount() {
        return this.file_.size();
    }

    public List<DescriptorProtos$FileDescriptorProto> getFileList() {
        return this.file_;
    }

    public InterfaceC3740t getFileOrBuilder(int i10) {
        return (InterfaceC3740t) this.file_.get(i10);
    }

    public List<? extends InterfaceC3740t> getFileOrBuilderList() {
        return this.file_;
    }

    public static a newBuilder(DescriptorProtos$FileDescriptorSet descriptorProtos$FileDescriptorSet) {
        return (a) DEFAULT_INSTANCE.createBuilder(descriptorProtos$FileDescriptorSet);
    }

    public static DescriptorProtos$FileDescriptorSet parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addFile(int i10, DescriptorProtos$FileDescriptorProto descriptorProtos$FileDescriptorProto) {
        descriptorProtos$FileDescriptorProto.getClass();
        ensureFileIsMutable();
        this.file_.add(i10, descriptorProtos$FileDescriptorProto);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$FileDescriptorSet parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$FileDescriptorSet) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
