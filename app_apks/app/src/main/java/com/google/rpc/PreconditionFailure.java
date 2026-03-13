package com.google.rpc;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class PreconditionFailure extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final PreconditionFailure DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int VIOLATIONS_FIELD_NUMBER = 1;
    private N.j violations_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class Violation extends GeneratedMessageLite implements c {
        private static final Violation DEFAULT_INSTANCE;
        public static final int DESCRIPTION_FIELD_NUMBER = 3;
        private static volatile t0 PARSER = null;
        public static final int SUBJECT_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private String type_ = "";
        private String subject_ = "";
        private String description_ = "";

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements c {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(Violation.DEFAULT_INSTANCE);
            }
        }

        static {
            Violation violation = new Violation();
            DEFAULT_INSTANCE = violation;
            GeneratedMessageLite.registerDefaultInstance(Violation.class, violation);
        }

        private Violation() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDescription() {
            this.description_ = getDefaultInstance().getDescription();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSubject() {
            this.subject_ = getDefaultInstance().getSubject();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearType() {
            this.type_ = getDefaultInstance().getType();
        }

        public static Violation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static Violation parseDelimitedFrom(InputStream inputStream) {
            return (Violation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescription(String str) {
            str.getClass();
            this.description_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDescriptionBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.description_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubject(String str) {
            str.getClass();
            this.subject_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSubjectBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.subject_ = abstractC3722j.J();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setType(String str) {
            str.getClass();
            this.type_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTypeBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.type_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = a.f32348a[gVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new Violation();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"type_", "subject_", "description_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (Violation.class) {
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

        public String getDescription() {
            return this.description_;
        }

        public AbstractC3722j getDescriptionBytes() {
            return AbstractC3722j.n(this.description_);
        }

        public String getSubject() {
            return this.subject_;
        }

        public AbstractC3722j getSubjectBytes() {
            return AbstractC3722j.n(this.subject_);
        }

        public String getType() {
            return this.type_;
        }

        public AbstractC3722j getTypeBytes() {
            return AbstractC3722j.n(this.type_);
        }

        public static a newBuilder(Violation violation) {
            return (a) DEFAULT_INSTANCE.createBuilder(violation);
        }

        public static Violation parseDelimitedFrom(InputStream inputStream, D d10) {
            return (Violation) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Violation parseFrom(ByteBuffer byteBuffer, D d10) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static Violation parseFrom(AbstractC3722j abstractC3722j) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static Violation parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static Violation parseFrom(byte[] bArr) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static Violation parseFrom(byte[] bArr, D d10) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static Violation parseFrom(InputStream inputStream) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static Violation parseFrom(InputStream inputStream, D d10) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static Violation parseFrom(AbstractC3724k abstractC3724k) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static Violation parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (Violation) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32348a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f32348a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32348a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32348a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32348a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32348a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32348a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32348a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(PreconditionFailure.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends InterfaceC3719h0 {
    }

    static {
        PreconditionFailure preconditionFailure = new PreconditionFailure();
        DEFAULT_INSTANCE = preconditionFailure;
        GeneratedMessageLite.registerDefaultInstance(PreconditionFailure.class, preconditionFailure);
    }

    private PreconditionFailure() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllViolations(Iterable<? extends Violation> iterable) {
        ensureViolationsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.violations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(violation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearViolations() {
        this.violations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureViolationsIsMutable() {
        N.j jVar = this.violations_;
        if (jVar.m()) {
            return;
        }
        this.violations_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static PreconditionFailure getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream) {
        return (PreconditionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeViolations(int i10) {
        ensureViolationsIsMutable();
        this.violations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setViolations(int i10, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.set(i10, violation);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f32348a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new PreconditionFailure();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"violations_", Violation.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (PreconditionFailure.class) {
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

    public Violation getViolations(int i10) {
        return (Violation) this.violations_.get(i10);
    }

    public int getViolationsCount() {
        return this.violations_.size();
    }

    public List<Violation> getViolationsList() {
        return this.violations_;
    }

    public c getViolationsOrBuilder(int i10) {
        return (c) this.violations_.get(i10);
    }

    public List<? extends c> getViolationsOrBuilderList() {
        return this.violations_;
    }

    public static b newBuilder(PreconditionFailure preconditionFailure) {
        return (b) DEFAULT_INSTANCE.createBuilder(preconditionFailure);
    }

    public static PreconditionFailure parseDelimitedFrom(InputStream inputStream, D d10) {
        return (PreconditionFailure) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static PreconditionFailure parseFrom(ByteBuffer byteBuffer, D d10) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static PreconditionFailure parseFrom(AbstractC3722j abstractC3722j) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addViolations(int i10, Violation violation) {
        violation.getClass();
        ensureViolationsIsMutable();
        this.violations_.add(i10, violation);
    }

    public static PreconditionFailure parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static PreconditionFailure parseFrom(byte[] bArr) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PreconditionFailure parseFrom(byte[] bArr, D d10) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PreconditionFailure parseFrom(InputStream inputStream, D d10) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static PreconditionFailure parseFrom(AbstractC3724k abstractC3724k) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static PreconditionFailure parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (PreconditionFailure) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
