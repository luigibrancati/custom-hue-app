package com.google.cloud.audit;

import com.google.cloud.audit.AuthenticationInfo;
import com.google.cloud.audit.RequestMetadata;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.Any;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.Struct;
import com.google.protobuf.t0;
import com.google.rpc.Status;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class AuditLog extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int AUTHENTICATION_INFO_FIELD_NUMBER = 3;
    public static final int AUTHORIZATION_INFO_FIELD_NUMBER = 9;
    private static final AuditLog DEFAULT_INSTANCE;
    public static final int METHOD_NAME_FIELD_NUMBER = 8;
    public static final int NUM_RESPONSE_ITEMS_FIELD_NUMBER = 12;
    private static volatile t0 PARSER = null;
    public static final int REQUEST_FIELD_NUMBER = 16;
    public static final int REQUEST_METADATA_FIELD_NUMBER = 4;
    public static final int RESOURCE_NAME_FIELD_NUMBER = 11;
    public static final int RESPONSE_FIELD_NUMBER = 17;
    public static final int SERVICE_DATA_FIELD_NUMBER = 15;
    public static final int SERVICE_NAME_FIELD_NUMBER = 7;
    public static final int STATUS_FIELD_NUMBER = 2;
    private AuthenticationInfo authenticationInfo_;
    private int bitField0_;
    private long numResponseItems_;
    private RequestMetadata requestMetadata_;
    private Struct request_;
    private Struct response_;
    private Any serviceData_;
    private Status status_;
    private String serviceName_ = "";
    private String methodName_ = "";
    private String resourceName_ = "";
    private N.j authorizationInfo_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31378a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31378a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31378a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31378a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31378a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31378a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31378a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31378a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(AuditLog.DEFAULT_INSTANCE);
        }
    }

    static {
        AuditLog auditLog = new AuditLog();
        DEFAULT_INSTANCE = auditLog;
        GeneratedMessageLite.registerDefaultInstance(AuditLog.class, auditLog);
    }

    private AuditLog() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAuthorizationInfo(Iterable<? extends AuthorizationInfo> iterable) {
        ensureAuthorizationInfoIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.authorizationInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAuthorizationInfo(AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(authorizationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthenticationInfo() {
        this.authenticationInfo_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthorizationInfo() {
        this.authorizationInfo_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMethodName() {
        this.methodName_ = getDefaultInstance().getMethodName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumResponseItems() {
        this.numResponseItems_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequest() {
        this.request_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRequestMetadata() {
        this.requestMetadata_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceName() {
        this.resourceName_ = getDefaultInstance().getResourceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResponse() {
        this.response_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceData() {
        this.serviceData_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServiceName() {
        this.serviceName_ = getDefaultInstance().getServiceName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    private void ensureAuthorizationInfoIsMutable() {
        N.j jVar = this.authorizationInfo_;
        if (jVar.m()) {
            return;
        }
        this.authorizationInfo_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static AuditLog getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        AuthenticationInfo authenticationInfo2 = this.authenticationInfo_;
        if (authenticationInfo2 == null || authenticationInfo2 == AuthenticationInfo.getDefaultInstance()) {
            this.authenticationInfo_ = authenticationInfo;
        } else {
            this.authenticationInfo_ = (AuthenticationInfo) ((AuthenticationInfo.b) AuthenticationInfo.newBuilder(this.authenticationInfo_).mergeFrom((GeneratedMessageLite) authenticationInfo)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequest(Struct struct) {
        struct.getClass();
        Struct struct2 = this.request_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.request_ = struct;
        } else {
            this.request_ = (Struct) ((Struct.b) Struct.newBuilder(this.request_).mergeFrom((GeneratedMessageLite) struct)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        RequestMetadata requestMetadata2 = this.requestMetadata_;
        if (requestMetadata2 == null || requestMetadata2 == RequestMetadata.getDefaultInstance()) {
            this.requestMetadata_ = requestMetadata;
        } else {
            this.requestMetadata_ = (RequestMetadata) ((RequestMetadata.b) RequestMetadata.newBuilder(this.requestMetadata_).mergeFrom((GeneratedMessageLite) requestMetadata)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResponse(Struct struct) {
        struct.getClass();
        Struct struct2 = this.response_;
        if (struct2 == null || struct2 == Struct.getDefaultInstance()) {
            this.response_ = struct;
        } else {
            this.response_ = (Struct) ((Struct.b) Struct.newBuilder(this.response_).mergeFrom((GeneratedMessageLite) struct)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeServiceData(Any any) {
        any.getClass();
        Any any2 = this.serviceData_;
        if (any2 == null || any2 == Any.getDefaultInstance()) {
            this.serviceData_ = any;
        } else {
            this.serviceData_ = (Any) ((Any.b) Any.newBuilder(this.serviceData_).mergeFrom((GeneratedMessageLite) any)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(Status status) {
        status.getClass();
        Status status2 = this.status_;
        if (status2 == null || status2 == Status.getDefaultInstance()) {
            this.status_ = status;
        } else {
            this.status_ = (Status) ((Status.b) Status.newBuilder(this.status_).mergeFrom((GeneratedMessageLite) status)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream) {
        return (AuditLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAuthorizationInfo(int i10) {
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthenticationInfo(AuthenticationInfo authenticationInfo) {
        authenticationInfo.getClass();
        this.authenticationInfo_ = authenticationInfo;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthorizationInfo(int i10, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.set(i10, authorizationInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodName(String str) {
        str.getClass();
        this.methodName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMethodNameBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.methodName_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumResponseItems(long j10) {
        this.numResponseItems_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequest(Struct struct) {
        struct.getClass();
        this.request_ = struct;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequestMetadata(RequestMetadata requestMetadata) {
        requestMetadata.getClass();
        this.requestMetadata_ = requestMetadata;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceName(String str) {
        str.getClass();
        this.resourceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceNameBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.resourceName_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResponse(Struct struct) {
        struct.getClass();
        this.response_ = struct;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceData(Any any) {
        any.getClass();
        this.serviceData_ = any;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceName(String str) {
        str.getClass();
        this.serviceName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServiceNameBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.serviceName_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(Status status) {
        status.getClass();
        this.status_ = status;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31378a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new AuditLog();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u000b\u0000\u0001\u0002\u0011\u000b\u0000\u0001\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0007Ȉ\bȈ\t\u001b\u000bȈ\f\u0002\u000fဉ\u0005\u0010ဉ\u0003\u0011ဉ\u0004", new Object[]{"bitField0_", "status_", "authenticationInfo_", "requestMetadata_", "serviceName_", "methodName_", "authorizationInfo_", AuthorizationInfo.class, "resourceName_", "numResponseItems_", "serviceData_", "request_", "response_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (AuditLog.class) {
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

    public AuthenticationInfo getAuthenticationInfo() {
        AuthenticationInfo authenticationInfo = this.authenticationInfo_;
        return authenticationInfo == null ? AuthenticationInfo.getDefaultInstance() : authenticationInfo;
    }

    public AuthorizationInfo getAuthorizationInfo(int i10) {
        return (AuthorizationInfo) this.authorizationInfo_.get(i10);
    }

    public int getAuthorizationInfoCount() {
        return this.authorizationInfo_.size();
    }

    public List<AuthorizationInfo> getAuthorizationInfoList() {
        return this.authorizationInfo_;
    }

    public I7.a getAuthorizationInfoOrBuilder(int i10) {
        return (I7.a) this.authorizationInfo_.get(i10);
    }

    public List<? extends I7.a> getAuthorizationInfoOrBuilderList() {
        return this.authorizationInfo_;
    }

    public String getMethodName() {
        return this.methodName_;
    }

    public AbstractC3722j getMethodNameBytes() {
        return AbstractC3722j.n(this.methodName_);
    }

    public long getNumResponseItems() {
        return this.numResponseItems_;
    }

    public Struct getRequest() {
        Struct struct = this.request_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public RequestMetadata getRequestMetadata() {
        RequestMetadata requestMetadata = this.requestMetadata_;
        return requestMetadata == null ? RequestMetadata.getDefaultInstance() : requestMetadata;
    }

    public String getResourceName() {
        return this.resourceName_;
    }

    public AbstractC3722j getResourceNameBytes() {
        return AbstractC3722j.n(this.resourceName_);
    }

    public Struct getResponse() {
        Struct struct = this.response_;
        return struct == null ? Struct.getDefaultInstance() : struct;
    }

    public Any getServiceData() {
        Any any = this.serviceData_;
        return any == null ? Any.getDefaultInstance() : any;
    }

    public String getServiceName() {
        return this.serviceName_;
    }

    public AbstractC3722j getServiceNameBytes() {
        return AbstractC3722j.n(this.serviceName_);
    }

    public Status getStatus() {
        Status status = this.status_;
        return status == null ? Status.getDefaultInstance() : status;
    }

    public boolean hasAuthenticationInfo() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRequest() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRequestMetadata() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasResponse() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasServiceData() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(AuditLog auditLog) {
        return (b) DEFAULT_INSTANCE.createBuilder(auditLog);
    }

    public static AuditLog parseDelimitedFrom(InputStream inputStream, D d10) {
        return (AuditLog) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AuditLog parseFrom(ByteBuffer byteBuffer, D d10) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static AuditLog parseFrom(AbstractC3722j abstractC3722j) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAuthorizationInfo(int i10, AuthorizationInfo authorizationInfo) {
        authorizationInfo.getClass();
        ensureAuthorizationInfoIsMutable();
        this.authorizationInfo_.add(i10, authorizationInfo);
    }

    public static AuditLog parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static AuditLog parseFrom(byte[] bArr) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AuditLog parseFrom(byte[] bArr, D d10) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static AuditLog parseFrom(InputStream inputStream) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AuditLog parseFrom(InputStream inputStream, D d10) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static AuditLog parseFrom(AbstractC3724k abstractC3724k) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static AuditLog parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (AuditLog) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
