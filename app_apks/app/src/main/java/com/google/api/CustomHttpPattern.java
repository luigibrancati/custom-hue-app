package com.google.api;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class CustomHttpPattern extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final CustomHttpPattern DEFAULT_INSTANCE;
    public static final int KIND_FIELD_NUMBER = 1;
    private static volatile t0 PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    private String kind_ = "";
    private String path_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31042a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31042a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31042a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31042a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31042a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31042a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31042a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31042a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(CustomHttpPattern.DEFAULT_INSTANCE);
        }
    }

    static {
        CustomHttpPattern customHttpPattern = new CustomHttpPattern();
        DEFAULT_INSTANCE = customHttpPattern;
        GeneratedMessageLite.registerDefaultInstance(CustomHttpPattern.class, customHttpPattern);
    }

    private CustomHttpPattern() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKind() {
        this.kind_ = getDefaultInstance().getKind();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    public static CustomHttpPattern getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream) {
        return (CustomHttpPattern) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKind(String str) {
        str.getClass();
        this.kind_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKindBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.kind_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.path_ = abstractC3722j.J();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31042a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new CustomHttpPattern();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"kind_", "path_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (CustomHttpPattern.class) {
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

    public String getKind() {
        return this.kind_;
    }

    public AbstractC3722j getKindBytes() {
        return AbstractC3722j.n(this.kind_);
    }

    public String getPath() {
        return this.path_;
    }

    public AbstractC3722j getPathBytes() {
        return AbstractC3722j.n(this.path_);
    }

    public static b newBuilder(CustomHttpPattern customHttpPattern) {
        return (b) DEFAULT_INSTANCE.createBuilder(customHttpPattern);
    }

    public static CustomHttpPattern parseDelimitedFrom(InputStream inputStream, D d10) {
        return (CustomHttpPattern) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static CustomHttpPattern parseFrom(ByteBuffer byteBuffer, D d10) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static CustomHttpPattern parseFrom(AbstractC3722j abstractC3722j) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static CustomHttpPattern parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static CustomHttpPattern parseFrom(byte[] bArr) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static CustomHttpPattern parseFrom(byte[] bArr, D d10) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static CustomHttpPattern parseFrom(InputStream inputStream, D d10) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static CustomHttpPattern parseFrom(AbstractC3724k abstractC3724k) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static CustomHttpPattern parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (CustomHttpPattern) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
