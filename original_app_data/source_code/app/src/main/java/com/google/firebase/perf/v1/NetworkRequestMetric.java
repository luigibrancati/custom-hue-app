package com.google.firebase.perf.v1;

import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.C3705a0;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.Q0;
import com.google.protobuf.Z;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class NetworkRequestMetric extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
    private static final NetworkRequestMetric DEFAULT_INSTANCE;
    public static final int HTTP_METHOD_FIELD_NUMBER = 2;
    public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
    public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
    private static volatile t0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
    public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
    public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
    public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
    public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
    public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
    public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
    public static final int URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private long clientStartTimeUs_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private long requestPayloadBytes_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private C3705a0 customAttributes_ = C3705a0.i();
    private String url_ = "";
    private String responseContentType_ = "";
    private N.j perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31880a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31880a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31880a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31880a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31880a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31880a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31880a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31880a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b A(long j10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseInitiatedUs(j10);
            return this;
        }

        public b B(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setUrl(str);
            return this;
        }

        public b j(Iterable iterable) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).addAllPerfSessions(iterable);
            return this;
        }

        public b m() {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).clearResponseContentType();
            return this;
        }

        public long n() {
            return ((NetworkRequestMetric) this.instance).getTimeToResponseInitiatedUs();
        }

        public boolean o() {
            return ((NetworkRequestMetric) this.instance).hasClientStartTimeUs();
        }

        public boolean p() {
            return ((NetworkRequestMetric) this.instance).hasHttpResponseCode();
        }

        public boolean q() {
            return ((NetworkRequestMetric) this.instance).hasTimeToResponseCompletedUs();
        }

        public b r(long j10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setClientStartTimeUs(j10);
            return this;
        }

        public b s(d dVar) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpMethod(dVar);
            return this;
        }

        public b t(int i10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setHttpResponseCode(i10);
            return this;
        }

        public b u(e eVar) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setNetworkClientErrorReason(eVar);
            return this;
        }

        public b v(long j10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setRequestPayloadBytes(j10);
            return this;
        }

        public b w(String str) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponseContentType(str);
            return this;
        }

        public b x(long j10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setResponsePayloadBytes(j10);
            return this;
        }

        public b y(long j10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToRequestCompletedUs(j10);
            return this;
        }

        public b z(long j10) {
            copyOnWrite();
            ((NetworkRequestMetric) this.instance).setTimeToResponseCompletedUs(j10);
            return this;
        }

        public b() {
            super(NetworkRequestMetric.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f31881a;

        static {
            Q0.b bVar = Q0.b.STRING;
            f31881a = Z.d(bVar, "", bVar, "");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d implements N.c {
        HTTP_METHOD_UNKNOWN(0),
        GET(1),
        PUT(2),
        POST(3),
        DELETE(4),
        HEAD(5),
        PATCH(6),
        OPTIONS(7),
        TRACE(8),
        CONNECT(9);

        public static final int CONNECT_VALUE = 9;
        public static final int DELETE_VALUE = 4;
        public static final int GET_VALUE = 1;
        public static final int HEAD_VALUE = 5;
        public static final int HTTP_METHOD_UNKNOWN_VALUE = 0;
        public static final int OPTIONS_VALUE = 7;
        public static final int PATCH_VALUE = 6;
        public static final int POST_VALUE = 3;
        public static final int PUT_VALUE = 2;
        public static final int TRACE_VALUE = 8;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public d findValueByNumber(int i10) {
                return d.b(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f31882a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return d.b(i10) != null;
            }
        }

        d(int i10) {
            this.value = i10;
        }

        public static d b(int i10) {
            switch (i10) {
                case 0:
                    return HTTP_METHOD_UNKNOWN;
                case 1:
                    return GET;
                case 2:
                    return PUT;
                case 3:
                    return POST;
                case 4:
                    return DELETE;
                case 5:
                    return HEAD;
                case 6:
                    return PATCH;
                case 7:
                    return OPTIONS;
                case 8:
                    return TRACE;
                case 9:
                    return CONNECT;
                default:
                    return null;
            }
        }

        public static N.e j() {
            return b.f31882a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum e implements N.c {
        NETWORK_CLIENT_ERROR_REASON_UNKNOWN(0),
        GENERIC_CLIENT_ERROR(1);

        public static final int GENERIC_CLIENT_ERROR_VALUE = 1;
        public static final int NETWORK_CLIENT_ERROR_REASON_UNKNOWN_VALUE = 0;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e findValueByNumber(int i10) {
                return e.b(i10);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class b implements N.e {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final N.e f31883a = new b();

            @Override // com.google.protobuf.N.e
            public boolean isInRange(int i10) {
                return e.b(i10) != null;
            }
        }

        e(int i10) {
            this.value = i10;
        }

        public static e b(int i10) {
            if (i10 == 0) {
                return NETWORK_CLIENT_ERROR_REASON_UNKNOWN;
            }
            if (i10 != 1) {
                return null;
            }
            return GENERIC_CLIENT_ERROR;
        }

        public static N.e j() {
            return b.f31883a;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            return this.value;
        }
    }

    static {
        NetworkRequestMetric networkRequestMetric = new NetworkRequestMetric();
        DEFAULT_INSTANCE = networkRequestMetric;
        GeneratedMessageLite.registerDefaultInstance(NetworkRequestMetric.class, networkRequestMetric);
    }

    private NetworkRequestMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -129;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpMethod() {
        this.bitField0_ &= -3;
        this.httpMethod_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttpResponseCode() {
        this.bitField0_ &= -33;
        this.httpResponseCode_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkClientErrorReason() {
        this.bitField0_ &= -17;
        this.networkClientErrorReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestPayloadBytes() {
        this.bitField0_ &= -5;
        this.requestPayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponseContentType() {
        this.bitField0_ &= -65;
        this.responseContentType_ = getDefaultInstance().getResponseContentType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponsePayloadBytes() {
        this.bitField0_ &= -9;
        this.responsePayloadBytes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToRequestCompletedUs() {
        this.bitField0_ &= -257;
        this.timeToRequestCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseCompletedUs() {
        this.bitField0_ &= -1025;
        this.timeToResponseCompletedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToResponseInitiatedUs() {
        this.bitField0_ &= -513;
        this.timeToResponseInitiatedUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -2;
        this.url_ = getDefaultInstance().getUrl();
    }

    private void ensurePerfSessionsIsMutable() {
        N.j jVar = this.perfSessions_;
        if (jVar.m()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static NetworkRequestMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private C3705a0 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private C3705a0 internalGetMutableCustomAttributes() {
        if (!this.customAttributes_.o()) {
            this.customAttributes_ = this.customAttributes_.r();
        }
        return this.customAttributes_;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removePerfSessions(int i10) {
        ensurePerfSessionsIsMutable();
        this.perfSessions_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j10) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpMethod(d dVar) {
        this.httpMethod_ = dVar.getNumber();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttpResponseCode(int i10) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkClientErrorReason(e eVar) {
        this.networkClientErrorReason_ = eVar.getNumber();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i10, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i10, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestPayloadBytes(long j10) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentType(String str) {
        str.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponseContentTypeBytes(AbstractC3722j abstractC3722j) {
        this.responseContentType_ = abstractC3722j.J();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponsePayloadBytes(long j10) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToRequestCompletedUs(long j10) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseCompletedUs(long j10) {
        this.bitField0_ |= RecognitionOptions.UPC_E;
        this.timeToResponseCompletedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToResponseInitiatedUs(long j10) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(AbstractC3722j abstractC3722j) {
        this.url_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        a aVar = null;
        switch (a.f31880a[gVar.ordinal()]) {
            case 1:
                return new NetworkRequestMetric();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005င\u0005\u0006ဈ\u0006\u0007ဂ\u0007\bဂ\b\tဂ\t\nဂ\n\u000b᠌\u0004\f2\r\u001b", new Object[]{"bitField0_", "url_", "httpMethod_", d.j(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.j(), "customAttributes_", c.f31881a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (NetworkRequestMetric.class) {
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

    public long getClientStartTimeUs() {
        return this.clientStartTimeUs_;
    }

    @Deprecated
    public Map<String, String> getCustomAttributes() {
        return getCustomAttributesMap();
    }

    public int getCustomAttributesCount() {
        return internalGetCustomAttributes().size();
    }

    public Map<String, String> getCustomAttributesMap() {
        return Collections.unmodifiableMap(internalGetCustomAttributes());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getCustomAttributesOrDefault(String str, String str2) {
        str.getClass();
        C3705a0 c3705a0InternalGetCustomAttributes = internalGetCustomAttributes();
        return c3705a0InternalGetCustomAttributes.containsKey(str) ? (String) c3705a0InternalGetCustomAttributes.get(str) : str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String getCustomAttributesOrThrow(String str) {
        str.getClass();
        C3705a0 c3705a0InternalGetCustomAttributes = internalGetCustomAttributes();
        if (c3705a0InternalGetCustomAttributes.containsKey(str)) {
            return (String) c3705a0InternalGetCustomAttributes.get(str);
        }
        throw new IllegalArgumentException();
    }

    public d getHttpMethod() {
        d dVarB = d.b(this.httpMethod_);
        return dVarB == null ? d.HTTP_METHOD_UNKNOWN : dVarB;
    }

    public int getHttpResponseCode() {
        return this.httpResponseCode_;
    }

    public e getNetworkClientErrorReason() {
        e eVarB = e.b(this.networkClientErrorReason_);
        return eVarB == null ? e.NETWORK_CLIENT_ERROR_REASON_UNKNOWN : eVarB;
    }

    public PerfSession getPerfSessions(int i10) {
        return (PerfSession) this.perfSessions_.get(i10);
    }

    public int getPerfSessionsCount() {
        return this.perfSessions_.size();
    }

    public List<PerfSession> getPerfSessionsList() {
        return this.perfSessions_;
    }

    public i9.e getPerfSessionsOrBuilder(int i10) {
        return (i9.e) this.perfSessions_.get(i10);
    }

    public List<? extends i9.e> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public long getRequestPayloadBytes() {
        return this.requestPayloadBytes_;
    }

    public String getResponseContentType() {
        return this.responseContentType_;
    }

    public AbstractC3722j getResponseContentTypeBytes() {
        return AbstractC3722j.n(this.responseContentType_);
    }

    public long getResponsePayloadBytes() {
        return this.responsePayloadBytes_;
    }

    public long getTimeToRequestCompletedUs() {
        return this.timeToRequestCompletedUs_;
    }

    public long getTimeToResponseCompletedUs() {
        return this.timeToResponseCompletedUs_;
    }

    public long getTimeToResponseInitiatedUs() {
        return this.timeToResponseInitiatedUs_;
    }

    public String getUrl() {
        return this.url_;
    }

    public AbstractC3722j getUrlBytes() {
        return AbstractC3722j.n(this.url_);
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasHttpMethod() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttpResponseCode() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNetworkClientErrorReason() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRequestPayloadBytes() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResponseContentType() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasResponsePayloadBytes() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeToRequestCompletedUs() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimeToResponseCompletedUs() {
        return (this.bitField0_ & RecognitionOptions.UPC_E) != 0;
    }

    public boolean hasTimeToResponseInitiatedUs() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(NetworkRequestMetric networkRequestMetric) {
        return (b) DEFAULT_INSTANCE.createBuilder(networkRequestMetric);
    }

    public static NetworkRequestMetric parseDelimitedFrom(InputStream inputStream, D d10) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static NetworkRequestMetric parseFrom(ByteBuffer byteBuffer, D d10) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static NetworkRequestMetric parseFrom(AbstractC3722j abstractC3722j) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i10, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i10, perfSession);
    }

    public static NetworkRequestMetric parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static NetworkRequestMetric parseFrom(byte[] bArr, D d10) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static NetworkRequestMetric parseFrom(InputStream inputStream, D d10) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static NetworkRequestMetric parseFrom(AbstractC3724k abstractC3724k) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static NetworkRequestMetric parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (NetworkRequestMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
