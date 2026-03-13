package com.google.api;

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
public final class ContextRule extends GeneratedMessageLite implements E7.f {
    public static final int ALLOWED_REQUEST_EXTENSIONS_FIELD_NUMBER = 4;
    public static final int ALLOWED_RESPONSE_EXTENSIONS_FIELD_NUMBER = 5;
    private static final ContextRule DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int PROVIDED_FIELD_NUMBER = 3;
    public static final int REQUESTED_FIELD_NUMBER = 2;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private String selector_ = "";
    private N.j requested_ = GeneratedMessageLite.emptyProtobufList();
    private N.j provided_ = GeneratedMessageLite.emptyProtobufList();
    private N.j allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    private N.j allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31040a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31040a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31040a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31040a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31040a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31040a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31040a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31040a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements E7.f {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(ContextRule.DEFAULT_INSTANCE);
        }
    }

    static {
        ContextRule contextRule = new ContextRule();
        DEFAULT_INSTANCE = contextRule;
        GeneratedMessageLite.registerDefaultInstance(ContextRule.class, contextRule);
    }

    private ContextRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedRequestExtensions(Iterable<String> iterable) {
        ensureAllowedRequestExtensionsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.allowedRequestExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAllowedResponseExtensions(Iterable<String> iterable) {
        ensureAllowedResponseExtensionsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.allowedResponseExtensions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProvided(Iterable<String> iterable) {
        ensureProvidedIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.provided_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRequested(Iterable<String> iterable) {
        ensureRequestedIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.requested_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensions(String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedRequestExtensionsBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.add(abstractC3722j.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensions(String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllowedResponseExtensionsBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.add(abstractC3722j.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvided(String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProvidedBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        ensureProvidedIsMutable();
        this.provided_.add(abstractC3722j.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequested(String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRequestedBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        ensureRequestedIsMutable();
        this.requested_.add(abstractC3722j.J());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedRequestExtensions() {
        this.allowedRequestExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAllowedResponseExtensions() {
        this.allowedResponseExtensions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProvided() {
        this.provided_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequested() {
        this.requested_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    private void ensureAllowedRequestExtensionsIsMutable() {
        N.j jVar = this.allowedRequestExtensions_;
        if (jVar.m()) {
            return;
        }
        this.allowedRequestExtensions_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureAllowedResponseExtensionsIsMutable() {
        N.j jVar = this.allowedResponseExtensions_;
        if (jVar.m()) {
            return;
        }
        this.allowedResponseExtensions_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureProvidedIsMutable() {
        N.j jVar = this.provided_;
        if (jVar.m()) {
            return;
        }
        this.provided_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureRequestedIsMutable() {
        N.j jVar = this.requested_;
        if (jVar.m()) {
            return;
        }
        this.requested_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static ContextRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream) {
        return (ContextRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedRequestExtensions(int i10, String str) {
        str.getClass();
        ensureAllowedRequestExtensionsIsMutable();
        this.allowedRequestExtensions_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAllowedResponseExtensions(int i10, String str) {
        str.getClass();
        ensureAllowedResponseExtensionsIsMutable();
        this.allowedResponseExtensions_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProvided(int i10, String str) {
        str.getClass();
        ensureProvidedIsMutable();
        this.provided_.set(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequested(int i10, String str) {
        str.getClass();
        ensureRequestedIsMutable();
        this.requested_.set(i10, str);
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
        int i10 = a.f31040a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new ContextRule();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0004\u0000\u0001Ȉ\u0002Ț\u0003Ț\u0004Ț\u0005Ț", new Object[]{"selector_", "requested_", "provided_", "allowedRequestExtensions_", "allowedResponseExtensions_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (ContextRule.class) {
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

    public String getAllowedRequestExtensions(int i10) {
        return (String) this.allowedRequestExtensions_.get(i10);
    }

    public AbstractC3722j getAllowedRequestExtensionsBytes(int i10) {
        return AbstractC3722j.n((String) this.allowedRequestExtensions_.get(i10));
    }

    public int getAllowedRequestExtensionsCount() {
        return this.allowedRequestExtensions_.size();
    }

    public List<String> getAllowedRequestExtensionsList() {
        return this.allowedRequestExtensions_;
    }

    public String getAllowedResponseExtensions(int i10) {
        return (String) this.allowedResponseExtensions_.get(i10);
    }

    public AbstractC3722j getAllowedResponseExtensionsBytes(int i10) {
        return AbstractC3722j.n((String) this.allowedResponseExtensions_.get(i10));
    }

    public int getAllowedResponseExtensionsCount() {
        return this.allowedResponseExtensions_.size();
    }

    public List<String> getAllowedResponseExtensionsList() {
        return this.allowedResponseExtensions_;
    }

    public String getProvided(int i10) {
        return (String) this.provided_.get(i10);
    }

    public AbstractC3722j getProvidedBytes(int i10) {
        return AbstractC3722j.n((String) this.provided_.get(i10));
    }

    public int getProvidedCount() {
        return this.provided_.size();
    }

    public List<String> getProvidedList() {
        return this.provided_;
    }

    public String getRequested(int i10) {
        return (String) this.requested_.get(i10);
    }

    public AbstractC3722j getRequestedBytes(int i10) {
        return AbstractC3722j.n((String) this.requested_.get(i10));
    }

    public int getRequestedCount() {
        return this.requested_.size();
    }

    public List<String> getRequestedList() {
        return this.requested_;
    }

    public String getSelector() {
        return this.selector_;
    }

    public AbstractC3722j getSelectorBytes() {
        return AbstractC3722j.n(this.selector_);
    }

    public static b newBuilder(ContextRule contextRule) {
        return (b) DEFAULT_INSTANCE.createBuilder(contextRule);
    }

    public static ContextRule parseDelimitedFrom(InputStream inputStream, D d10) {
        return (ContextRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static ContextRule parseFrom(ByteBuffer byteBuffer, D d10) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static ContextRule parseFrom(AbstractC3722j abstractC3722j) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static ContextRule parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static ContextRule parseFrom(byte[] bArr) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ContextRule parseFrom(byte[] bArr, D d10) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static ContextRule parseFrom(InputStream inputStream) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ContextRule parseFrom(InputStream inputStream, D d10) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static ContextRule parseFrom(AbstractC3724k abstractC3724k) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static ContextRule parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (ContextRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
