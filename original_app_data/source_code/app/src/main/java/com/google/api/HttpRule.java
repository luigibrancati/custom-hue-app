package com.google.api;

import com.google.api.CustomHttpPattern;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class HttpRule extends GeneratedMessageLite implements com.google.api.b {
    public static final int ADDITIONAL_BINDINGS_FIELD_NUMBER = 11;
    public static final int BODY_FIELD_NUMBER = 7;
    public static final int CUSTOM_FIELD_NUMBER = 8;
    private static final HttpRule DEFAULT_INSTANCE;
    public static final int DELETE_FIELD_NUMBER = 5;
    public static final int GET_FIELD_NUMBER = 2;
    private static volatile t0 PARSER = null;
    public static final int PATCH_FIELD_NUMBER = 6;
    public static final int POST_FIELD_NUMBER = 4;
    public static final int PUT_FIELD_NUMBER = 3;
    public static final int RESPONSE_BODY_FIELD_NUMBER = 12;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private Object pattern_;
    private int patternCase_ = 0;
    private String selector_ = "";
    private String body_ = "";
    private String responseBody_ = "";
    private N.j additionalBindings_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31049a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31049a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31049a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31049a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31049a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31049a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31049a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31049a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements com.google.api.b {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(HttpRule.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c {
        GET(2),
        PUT(3),
        POST(4),
        DELETE(5),
        PATCH(6),
        CUSTOM(8),
        PATTERN_NOT_SET(0);

        private final int value;

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return PATTERN_NOT_SET;
            }
            if (i10 == 8) {
                return CUSTOM;
            }
            if (i10 == 2) {
                return GET;
            }
            if (i10 == 3) {
                return PUT;
            }
            if (i10 == 4) {
                return POST;
            }
            if (i10 == 5) {
                return DELETE;
            }
            if (i10 != 6) {
                return null;
            }
            return PATCH;
        }
    }

    static {
        HttpRule httpRule = new HttpRule();
        DEFAULT_INSTANCE = httpRule;
        GeneratedMessageLite.registerDefaultInstance(HttpRule.class, httpRule);
    }

    private HttpRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAdditionalBindings(Iterable<? extends HttpRule> iterable) {
        ensureAdditionalBindingsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.additionalBindings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdditionalBindings() {
        this.additionalBindings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustom() {
        if (this.patternCase_ == 8) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelete() {
        if (this.patternCase_ == 5) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGet() {
        if (this.patternCase_ == 2) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPatch() {
        if (this.patternCase_ == 6) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPattern() {
        this.patternCase_ = 0;
        this.pattern_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPost() {
        if (this.patternCase_ == 4) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPut() {
        if (this.patternCase_ == 3) {
            this.patternCase_ = 0;
            this.pattern_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseBody() {
        this.responseBody_ = getDefaultInstance().getResponseBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAdditionalBindingsIsMutable() {
        N.j jVar = this.additionalBindings_;
        if (jVar.m()) {
            return;
        }
        this.additionalBindings_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static HttpRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        if (this.patternCase_ != 8 || this.pattern_ == CustomHttpPattern.getDefaultInstance()) {
            this.pattern_ = customHttpPattern;
        } else {
            this.pattern_ = ((CustomHttpPattern.b) CustomHttpPattern.newBuilder((CustomHttpPattern) this.pattern_).mergeFrom((GeneratedMessageLite) customHttpPattern)).buildPartial();
        }
        this.patternCase_ = 8;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream) {
        return (HttpRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAdditionalBindings(int i10) {
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdditionalBindings(int i10, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.set(i10, httpRule);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        str.getClass();
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.body_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustom(CustomHttpPattern customHttpPattern) {
        customHttpPattern.getClass();
        this.pattern_ = customHttpPattern;
        this.patternCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelete(String str) {
        str.getClass();
        this.patternCase_ = 5;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeleteBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.pattern_ = abstractC3722j.J();
        this.patternCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGet(String str) {
        str.getClass();
        this.patternCase_ = 2;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGetBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.pattern_ = abstractC3722j.J();
        this.patternCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatch(String str) {
        str.getClass();
        this.patternCase_ = 6;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPatchBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.pattern_ = abstractC3722j.J();
        this.patternCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPost(String str) {
        str.getClass();
        this.patternCase_ = 4;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPostBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.pattern_ = abstractC3722j.J();
        this.patternCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPut(String str) {
        str.getClass();
        this.patternCase_ = 3;
        this.pattern_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPutBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.pattern_ = abstractC3722j.J();
        this.patternCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBody(String str) {
        str.getClass();
        this.responseBody_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseBodyBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.responseBody_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelector(String str) {
        str.getClass();
        this.selector_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSelectorBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.selector_ = abstractC3722j.J();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31049a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new HttpRule();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0001\u0000\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002Ȼ\u0000\u0003Ȼ\u0000\u0004Ȼ\u0000\u0005Ȼ\u0000\u0006Ȼ\u0000\u0007Ȉ\b<\u0000\u000b\u001b\fȈ", new Object[]{"pattern_", "patternCase_", "selector_", "body_", CustomHttpPattern.class, "additionalBindings_", HttpRule.class, "responseBody_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (HttpRule.class) {
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

    public HttpRule getAdditionalBindings(int i10) {
        return (HttpRule) this.additionalBindings_.get(i10);
    }

    public int getAdditionalBindingsCount() {
        return this.additionalBindings_.size();
    }

    public List<HttpRule> getAdditionalBindingsList() {
        return this.additionalBindings_;
    }

    public com.google.api.b getAdditionalBindingsOrBuilder(int i10) {
        return (com.google.api.b) this.additionalBindings_.get(i10);
    }

    public List<? extends com.google.api.b> getAdditionalBindingsOrBuilderList() {
        return this.additionalBindings_;
    }

    public String getBody() {
        return this.body_;
    }

    public AbstractC3722j getBodyBytes() {
        return AbstractC3722j.n(this.body_);
    }

    public CustomHttpPattern getCustom() {
        return this.patternCase_ == 8 ? (CustomHttpPattern) this.pattern_ : CustomHttpPattern.getDefaultInstance();
    }

    public String getDelete() {
        return this.patternCase_ == 5 ? (String) this.pattern_ : "";
    }

    public AbstractC3722j getDeleteBytes() {
        return AbstractC3722j.n(this.patternCase_ == 5 ? (String) this.pattern_ : "");
    }

    public String getGet() {
        return this.patternCase_ == 2 ? (String) this.pattern_ : "";
    }

    public AbstractC3722j getGetBytes() {
        return AbstractC3722j.n(this.patternCase_ == 2 ? (String) this.pattern_ : "");
    }

    public String getPatch() {
        return this.patternCase_ == 6 ? (String) this.pattern_ : "";
    }

    public AbstractC3722j getPatchBytes() {
        return AbstractC3722j.n(this.patternCase_ == 6 ? (String) this.pattern_ : "");
    }

    public c getPatternCase() {
        return c.b(this.patternCase_);
    }

    public String getPost() {
        return this.patternCase_ == 4 ? (String) this.pattern_ : "";
    }

    public AbstractC3722j getPostBytes() {
        return AbstractC3722j.n(this.patternCase_ == 4 ? (String) this.pattern_ : "");
    }

    public String getPut() {
        return this.patternCase_ == 3 ? (String) this.pattern_ : "";
    }

    public AbstractC3722j getPutBytes() {
        return AbstractC3722j.n(this.patternCase_ == 3 ? (String) this.pattern_ : "");
    }

    public String getResponseBody() {
        return this.responseBody_;
    }

    public AbstractC3722j getResponseBodyBytes() {
        return AbstractC3722j.n(this.responseBody_);
    }

    public String getSelector() {
        return this.selector_;
    }

    public AbstractC3722j getSelectorBytes() {
        return AbstractC3722j.n(this.selector_);
    }

    public boolean hasCustom() {
        return this.patternCase_ == 8;
    }

    public boolean hasDelete() {
        return this.patternCase_ == 5;
    }

    public boolean hasGet() {
        return this.patternCase_ == 2;
    }

    public boolean hasPatch() {
        return this.patternCase_ == 6;
    }

    public boolean hasPost() {
        return this.patternCase_ == 4;
    }

    public boolean hasPut() {
        return this.patternCase_ == 3;
    }

    public static b newBuilder(HttpRule httpRule) {
        return (b) DEFAULT_INSTANCE.createBuilder(httpRule);
    }

    public static HttpRule parseDelimitedFrom(InputStream inputStream, D d10) {
        return (HttpRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static HttpRule parseFrom(ByteBuffer byteBuffer, D d10) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static HttpRule parseFrom(AbstractC3722j abstractC3722j) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAdditionalBindings(int i10, HttpRule httpRule) {
        httpRule.getClass();
        ensureAdditionalBindingsIsMutable();
        this.additionalBindings_.add(i10, httpRule);
    }

    public static HttpRule parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static HttpRule parseFrom(byte[] bArr) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static HttpRule parseFrom(byte[] bArr, D d10) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static HttpRule parseFrom(InputStream inputStream) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static HttpRule parseFrom(InputStream inputStream, D d10) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static HttpRule parseFrom(AbstractC3724k abstractC3724k) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static HttpRule parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (HttpRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
