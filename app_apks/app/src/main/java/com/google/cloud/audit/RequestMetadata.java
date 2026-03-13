package com.google.cloud.audit;

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
public final class RequestMetadata extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int CALLER_IP_FIELD_NUMBER = 1;
    public static final int CALLER_SUPPLIED_USER_AGENT_FIELD_NUMBER = 2;
    private static final RequestMetadata DEFAULT_INSTANCE;
    private static volatile t0 PARSER;
    private String callerIp_ = "";
    private String callerSuppliedUserAgent_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31381a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31381a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31381a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31381a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31381a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31381a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31381a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31381a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(RequestMetadata.DEFAULT_INSTANCE);
        }
    }

    static {
        RequestMetadata requestMetadata = new RequestMetadata();
        DEFAULT_INSTANCE = requestMetadata;
        GeneratedMessageLite.registerDefaultInstance(RequestMetadata.class, requestMetadata);
    }

    private RequestMetadata() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallerIp() {
        this.callerIp_ = getDefaultInstance().getCallerIp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallerSuppliedUserAgent() {
        this.callerSuppliedUserAgent_ = getDefaultInstance().getCallerSuppliedUserAgent();
    }

    public static RequestMetadata getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream) {
        return (RequestMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerIp(String str) {
        str.getClass();
        this.callerIp_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerIpBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.callerIp_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerSuppliedUserAgent(String str) {
        str.getClass();
        this.callerSuppliedUserAgent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallerSuppliedUserAgentBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.callerSuppliedUserAgent_ = abstractC3722j.J();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31381a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new RequestMetadata();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"callerIp_", "callerSuppliedUserAgent_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (RequestMetadata.class) {
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

    public String getCallerIp() {
        return this.callerIp_;
    }

    public AbstractC3722j getCallerIpBytes() {
        return AbstractC3722j.n(this.callerIp_);
    }

    public String getCallerSuppliedUserAgent() {
        return this.callerSuppliedUserAgent_;
    }

    public AbstractC3722j getCallerSuppliedUserAgentBytes() {
        return AbstractC3722j.n(this.callerSuppliedUserAgent_);
    }

    public static b newBuilder(RequestMetadata requestMetadata) {
        return (b) DEFAULT_INSTANCE.createBuilder(requestMetadata);
    }

    public static RequestMetadata parseDelimitedFrom(InputStream inputStream, D d10) {
        return (RequestMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static RequestMetadata parseFrom(ByteBuffer byteBuffer, D d10) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static RequestMetadata parseFrom(AbstractC3722j abstractC3722j) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static RequestMetadata parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static RequestMetadata parseFrom(byte[] bArr) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static RequestMetadata parseFrom(byte[] bArr, D d10) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static RequestMetadata parseFrom(InputStream inputStream) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static RequestMetadata parseFrom(InputStream inputStream, D d10) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static RequestMetadata parseFrom(AbstractC3724k abstractC3724k) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static RequestMetadata parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (RequestMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
