package com.google.type;

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
public final class Expr extends GeneratedMessageLite implements InterfaceC3719h0 {
    private static final Expr DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 3;
    public static final int EXPRESSION_FIELD_NUMBER = 1;
    public static final int LOCATION_FIELD_NUMBER = 4;
    private static volatile t0 PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 2;
    private String expression_ = "";
    private String title_ = "";
    private String description_ = "";
    private String location_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32362a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f32362a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32362a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32362a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f32362a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f32362a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f32362a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f32362a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(Expr.DEFAULT_INSTANCE);
        }
    }

    static {
        Expr expr = new Expr();
        DEFAULT_INSTANCE = expr;
        GeneratedMessageLite.registerDefaultInstance(Expr.class, expr);
    }

    private Expr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearExpression() {
        this.expression_ = getDefaultInstance().getExpression();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.location_ = getDefaultInstance().getLocation();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    public static Expr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Expr parseDelimitedFrom(InputStream inputStream) {
        return (Expr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setExpression(String str) {
        str.getClass();
        this.expression_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExpressionBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.expression_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocation(String str) {
        str.getClass();
        this.location_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.location_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        str.getClass();
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.title_ = abstractC3722j.J();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f32362a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new Expr();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"expression_", "title_", "description_", "location_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (Expr.class) {
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

    public String getExpression() {
        return this.expression_;
    }

    public AbstractC3722j getExpressionBytes() {
        return AbstractC3722j.n(this.expression_);
    }

    public String getLocation() {
        return this.location_;
    }

    public AbstractC3722j getLocationBytes() {
        return AbstractC3722j.n(this.location_);
    }

    public String getTitle() {
        return this.title_;
    }

    public AbstractC3722j getTitleBytes() {
        return AbstractC3722j.n(this.title_);
    }

    public static b newBuilder(Expr expr) {
        return (b) DEFAULT_INSTANCE.createBuilder(expr);
    }

    public static Expr parseDelimitedFrom(InputStream inputStream, D d10) {
        return (Expr) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Expr parseFrom(ByteBuffer byteBuffer, D d10) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static Expr parseFrom(AbstractC3722j abstractC3722j) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static Expr parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static Expr parseFrom(byte[] bArr) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Expr parseFrom(byte[] bArr, D d10) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static Expr parseFrom(InputStream inputStream) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Expr parseFrom(InputStream inputStream, D d10) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Expr parseFrom(AbstractC3724k abstractC3724k) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static Expr parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (Expr) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
