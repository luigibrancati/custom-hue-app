package com.google.protobuf;

import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class DescriptorProtos$GeneratedCodeInfo extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int ANNOTATION_FIELD_NUMBER = 1;
    private static final DescriptorProtos$GeneratedCodeInfo DEFAULT_INSTANCE;
    private static volatile t0 PARSER;
    private N.j annotation_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Annotation extends GeneratedMessageLite implements a {
        public static final int BEGIN_FIELD_NUMBER = 3;
        private static final Annotation DEFAULT_INSTANCE;
        public static final int END_FIELD_NUMBER = 4;
        private static volatile t0 PARSER = null;
        public static final int PATH_FIELD_NUMBER = 1;
        public static final int SOURCE_FILE_FIELD_NUMBER = 2;
        private int begin_;
        private int bitField0_;
        private int end_;
        private int pathMemoizedSerializedSize = -1;
        private N.g path_ = GeneratedMessageLite.emptyIntList();
        private String sourceFile_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements a {
            public /* synthetic */ a(AbstractC3732o abstractC3732o) {
                this();
            }

            public a() {
                super(Annotation.DEFAULT_INSTANCE);
            }
        }

        static {
            Annotation annotation = new Annotation();
            DEFAULT_INSTANCE = annotation;
            GeneratedMessageLite.registerDefaultInstance(Annotation.class, annotation);
        }

        private Annotation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPath(Iterable<? extends Integer> iterable) {
            ensurePathIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.path_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPath(int i10) {
            ensurePathIsMutable();
            this.path_.x0(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBegin() {
            this.bitField0_ &= -3;
            this.begin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnd() {
            this.bitField0_ &= -5;
            this.end_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPath() {
            this.path_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSourceFile() {
            this.bitField0_ &= -2;
            this.sourceFile_ = getDefaultInstance().getSourceFile();
        }

        private void ensurePathIsMutable() {
            N.g gVar = this.path_;
            if (gVar.m()) {
                return;
            }
            this.path_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static Annotation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBegin(int i10) {
            this.bitField0_ |= 2;
            this.begin_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnd(int i10) {
            this.bitField0_ |= 4;
            this.end_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPath(int i10, int i11) {
            ensurePathIsMutable();
            this.path_.D(i10, i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFile(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.sourceFile_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSourceFileBytes(AbstractC3722j abstractC3722j) {
            this.sourceFile_ = abstractC3722j.J();
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = AbstractC3732o.f32325a[gVar.ordinal()];
            AbstractC3732o abstractC3732o = null;
            switch (i10) {
                case 1:
                    return new Annotation();
                case 2:
                    return new a(abstractC3732o);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001'\u0002ဈ\u0000\u0003င\u0001\u0004င\u0002", new Object[]{"bitField0_", "path_", "sourceFile_", "begin_", "end_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Annotation.class) {
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

        public int getBegin() {
            return this.begin_;
        }

        public int getEnd() {
            return this.end_;
        }

        public int getPath(int i10) {
            return this.path_.getInt(i10);
        }

        public int getPathCount() {
            return this.path_.size();
        }

        public List<Integer> getPathList() {
            return this.path_;
        }

        public String getSourceFile() {
            return this.sourceFile_;
        }

        public AbstractC3722j getSourceFileBytes() {
            return AbstractC3722j.n(this.sourceFile_);
        }

        public boolean hasBegin() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasEnd() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasSourceFile() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(Annotation annotation) {
            return (a) DEFAULT_INSTANCE.createBuilder(annotation);
        }

        public static Annotation parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Annotation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Annotation parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Annotation parseFrom(AbstractC3722j abstractC3722j) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Annotation parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Annotation parseFrom(byte[] bArr) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Annotation parseFrom(byte[] bArr, D d10) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Annotation parseFrom(InputStream inputStream) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Annotation parseFrom(InputStream inputStream, D d10) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Annotation parseFrom(AbstractC3724k abstractC3724k) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Annotation parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Annotation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a extends InterfaceC3719h0 {
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(AbstractC3732o abstractC3732o) {
            this();
        }

        public b() {
            super(DescriptorProtos$GeneratedCodeInfo.DEFAULT_INSTANCE);
        }
    }

    static {
        DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo = new DescriptorProtos$GeneratedCodeInfo();
        DEFAULT_INSTANCE = descriptorProtos$GeneratedCodeInfo;
        GeneratedMessageLite.registerDefaultInstance(DescriptorProtos$GeneratedCodeInfo.class, descriptorProtos$GeneratedCodeInfo);
    }

    private DescriptorProtos$GeneratedCodeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAnnotation(Iterable<? extends Annotation> iterable) {
        ensureAnnotationIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.annotation_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(annotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnnotation() {
        this.annotation_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAnnotationIsMutable() {
        N.j jVar = this.annotation_;
        if (jVar.m()) {
            return;
        }
        this.annotation_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static DescriptorProtos$GeneratedCodeInfo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAnnotation(int i10) {
        ensureAnnotationIsMutable();
        this.annotation_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnnotation(int i10, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.set(i10, annotation);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = AbstractC3732o.f32325a[gVar.ordinal()];
        AbstractC3732o abstractC3732o = null;
        switch (i10) {
            case 1:
                return new DescriptorProtos$GeneratedCodeInfo();
            case 2:
                return new b(abstractC3732o);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"annotation_", Annotation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (DescriptorProtos$GeneratedCodeInfo.class) {
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

    public Annotation getAnnotation(int i10) {
        return (Annotation) this.annotation_.get(i10);
    }

    public int getAnnotationCount() {
        return this.annotation_.size();
    }

    public List<Annotation> getAnnotationList() {
        return this.annotation_;
    }

    public a getAnnotationOrBuilder(int i10) {
        return (a) this.annotation_.get(i10);
    }

    public List<? extends a> getAnnotationOrBuilderList() {
        return this.annotation_;
    }

    public static b newBuilder(DescriptorProtos$GeneratedCodeInfo descriptorProtos$GeneratedCodeInfo) {
        return (b) DEFAULT_INSTANCE.createBuilder(descriptorProtos$GeneratedCodeInfo);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseDelimitedFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(ByteBuffer byteBuffer, D d10) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3722j abstractC3722j) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAnnotation(int i10, Annotation annotation) {
        annotation.getClass();
        ensureAnnotationIsMutable();
        this.annotation_.add(i10, annotation);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(byte[] bArr, D d10) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(InputStream inputStream, D d10) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3724k abstractC3724k) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static DescriptorProtos$GeneratedCodeInfo parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (DescriptorProtos$GeneratedCodeInfo) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
