package com.google.api;

import E7.h;
import E7.j;
import E7.l;
import com.google.android.libraries.barhopper.RecognitionOptions;
import com.google.api.Authentication;
import com.google.api.Backend;
import com.google.api.Billing;
import com.google.api.Context;
import com.google.api.Control;
import com.google.api.Documentation;
import com.google.api.Http;
import com.google.api.Logging;
import com.google.api.Monitoring;
import com.google.api.Quota;
import com.google.api.SourceInfo;
import com.google.api.SystemParameters;
import com.google.api.Usage;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.Api;
import com.google.protobuf.D;
import com.google.protobuf.Enum;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.H0;
import com.google.protobuf.InterfaceC3714f;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.InterfaceC3746z;
import com.google.protobuf.N;
import com.google.protobuf.Type;
import com.google.protobuf.UInt32Value;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Service extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int APIS_FIELD_NUMBER = 3;
    public static final int AUTHENTICATION_FIELD_NUMBER = 11;
    public static final int BACKEND_FIELD_NUMBER = 8;
    public static final int BILLING_FIELD_NUMBER = 26;
    public static final int CONFIG_VERSION_FIELD_NUMBER = 20;
    public static final int CONTEXT_FIELD_NUMBER = 12;
    public static final int CONTROL_FIELD_NUMBER = 21;
    private static final Service DEFAULT_INSTANCE;
    public static final int DOCUMENTATION_FIELD_NUMBER = 6;
    public static final int ENDPOINTS_FIELD_NUMBER = 18;
    public static final int ENUMS_FIELD_NUMBER = 5;
    public static final int HTTP_FIELD_NUMBER = 9;
    public static final int ID_FIELD_NUMBER = 33;
    public static final int LOGGING_FIELD_NUMBER = 27;
    public static final int LOGS_FIELD_NUMBER = 23;
    public static final int METRICS_FIELD_NUMBER = 24;
    public static final int MONITORED_RESOURCES_FIELD_NUMBER = 25;
    public static final int MONITORING_FIELD_NUMBER = 28;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile t0 PARSER = null;
    public static final int PRODUCER_PROJECT_ID_FIELD_NUMBER = 22;
    public static final int QUOTA_FIELD_NUMBER = 10;
    public static final int SOURCE_INFO_FIELD_NUMBER = 37;
    public static final int SYSTEM_PARAMETERS_FIELD_NUMBER = 29;
    public static final int TITLE_FIELD_NUMBER = 2;
    public static final int TYPES_FIELD_NUMBER = 4;
    public static final int USAGE_FIELD_NUMBER = 15;
    private Authentication authentication_;
    private Backend backend_;
    private Billing billing_;
    private int bitField0_;
    private UInt32Value configVersion_;
    private Context context_;
    private Control control_;
    private Documentation documentation_;
    private Http http_;
    private Logging logging_;
    private Monitoring monitoring_;
    private Quota quota_;
    private SourceInfo sourceInfo_;
    private SystemParameters systemParameters_;
    private Usage usage_;
    private String name_ = "";
    private String id_ = "";
    private String title_ = "";
    private String producerProjectId_ = "";
    private N.j apis_ = GeneratedMessageLite.emptyProtobufList();
    private N.j types_ = GeneratedMessageLite.emptyProtobufList();
    private N.j enums_ = GeneratedMessageLite.emptyProtobufList();
    private N.j endpoints_ = GeneratedMessageLite.emptyProtobufList();
    private N.j logs_ = GeneratedMessageLite.emptyProtobufList();
    private N.j metrics_ = GeneratedMessageLite.emptyProtobufList();
    private N.j monitoredResources_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31074a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31074a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31074a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31074a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31074a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31074a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31074a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31074a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(Service.DEFAULT_INSTANCE);
        }
    }

    static {
        Service service = new Service();
        DEFAULT_INSTANCE = service;
        GeneratedMessageLite.registerDefaultInstance(Service.class, service);
    }

    private Service() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllApis(Iterable<? extends Api> iterable) {
        ensureApisIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.apis_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEndpoints(Iterable<? extends Endpoint> iterable) {
        ensureEndpointsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.endpoints_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEnums(Iterable<? extends Enum> iterable) {
        ensureEnumsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.enums_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLogs(Iterable<? extends LogDescriptor> iterable) {
        ensureLogsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.logs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMetrics(Iterable<? extends MetricDescriptor> iterable) {
        ensureMetricsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.metrics_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllMonitoredResources(Iterable<? extends MonitoredResourceDescriptor> iterable) {
        ensureMonitoredResourcesIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.monitoredResources_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllTypes(Iterable<? extends Type> iterable) {
        ensureTypesIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.types_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(Enum r12) {
        r12.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(r12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApis() {
        this.apis_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAuthentication() {
        this.authentication_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBackend() {
        this.backend_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBilling() {
        this.billing_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConfigVersion() {
        this.configVersion_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = null;
        this.bitField0_ &= -65;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearControl() {
        this.control_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDocumentation() {
        this.documentation_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEndpoints() {
        this.endpoints_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEnums() {
        this.enums_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHttp() {
        this.http_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogging() {
        this.logging_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogs() {
        this.logs_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetrics() {
        this.metrics_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoredResources() {
        this.monitoredResources_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMonitoring() {
        this.monitoring_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerProjectId() {
        this.producerProjectId_ = getDefaultInstance().getProducerProjectId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearQuota() {
        this.quota_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSourceInfo() {
        this.sourceInfo_ = null;
        this.bitField0_ &= -8193;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSystemParameters() {
        this.systemParameters_ = null;
        this.bitField0_ &= -4097;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.title_ = getDefaultInstance().getTitle();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTypes() {
        this.types_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUsage() {
        this.usage_ = null;
        this.bitField0_ &= -129;
    }

    private void ensureApisIsMutable() {
        N.j jVar = this.apis_;
        if (jVar.m()) {
            return;
        }
        this.apis_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureEndpointsIsMutable() {
        N.j jVar = this.endpoints_;
        if (jVar.m()) {
            return;
        }
        this.endpoints_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureEnumsIsMutable() {
        N.j jVar = this.enums_;
        if (jVar.m()) {
            return;
        }
        this.enums_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureLogsIsMutable() {
        N.j jVar = this.logs_;
        if (jVar.m()) {
            return;
        }
        this.logs_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureMetricsIsMutable() {
        N.j jVar = this.metrics_;
        if (jVar.m()) {
            return;
        }
        this.metrics_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureMonitoredResourcesIsMutable() {
        N.j jVar = this.monitoredResources_;
        if (jVar.m()) {
            return;
        }
        this.monitoredResources_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureTypesIsMutable() {
        N.j jVar = this.types_;
        if (jVar.m()) {
            return;
        }
        this.types_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Service getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAuthentication(Authentication authentication) {
        authentication.getClass();
        Authentication authentication2 = this.authentication_;
        if (authentication2 == null || authentication2 == Authentication.getDefaultInstance()) {
            this.authentication_ = authentication;
        } else {
            this.authentication_ = (Authentication) ((Authentication.b) Authentication.newBuilder(this.authentication_).mergeFrom((GeneratedMessageLite) authentication)).buildPartial();
        }
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBackend(Backend backend) {
        backend.getClass();
        Backend backend2 = this.backend_;
        if (backend2 == null || backend2 == Backend.getDefaultInstance()) {
            this.backend_ = backend;
        } else {
            this.backend_ = (Backend) ((Backend.b) Backend.newBuilder(this.backend_).mergeFrom((GeneratedMessageLite) backend)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBilling(Billing billing) {
        billing.getClass();
        Billing billing2 = this.billing_;
        if (billing2 == null || billing2 == Billing.getDefaultInstance()) {
            this.billing_ = billing;
        } else {
            this.billing_ = (Billing) ((Billing.c) Billing.newBuilder(this.billing_).mergeFrom((GeneratedMessageLite) billing)).buildPartial();
        }
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        UInt32Value uInt32Value2 = this.configVersion_;
        if (uInt32Value2 == null || uInt32Value2 == UInt32Value.getDefaultInstance()) {
            this.configVersion_ = uInt32Value;
        } else {
            this.configVersion_ = (UInt32Value) ((UInt32Value.b) UInt32Value.newBuilder(this.configVersion_).mergeFrom((GeneratedMessageLite) uInt32Value)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeContext(Context context) {
        context.getClass();
        Context context2 = this.context_;
        if (context2 == null || context2 == Context.getDefaultInstance()) {
            this.context_ = context;
        } else {
            this.context_ = (Context) ((Context.b) Context.newBuilder(this.context_).mergeFrom((GeneratedMessageLite) context)).buildPartial();
        }
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeControl(Control control) {
        control.getClass();
        Control control2 = this.control_;
        if (control2 == null || control2 == Control.getDefaultInstance()) {
            this.control_ = control;
        } else {
            this.control_ = (Control) ((Control.b) Control.newBuilder(this.control_).mergeFrom((GeneratedMessageLite) control)).buildPartial();
        }
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDocumentation(Documentation documentation) {
        documentation.getClass();
        Documentation documentation2 = this.documentation_;
        if (documentation2 == null || documentation2 == Documentation.getDefaultInstance()) {
            this.documentation_ = documentation;
        } else {
            this.documentation_ = (Documentation) ((Documentation.b) Documentation.newBuilder(this.documentation_).mergeFrom((GeneratedMessageLite) documentation)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHttp(Http http) {
        http.getClass();
        Http http2 = this.http_;
        if (http2 == null || http2 == Http.getDefaultInstance()) {
            this.http_ = http;
        } else {
            this.http_ = (Http) ((Http.b) Http.newBuilder(this.http_).mergeFrom((GeneratedMessageLite) http)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLogging(Logging logging) {
        logging.getClass();
        Logging logging2 = this.logging_;
        if (logging2 == null || logging2 == Logging.getDefaultInstance()) {
            this.logging_ = logging;
        } else {
            this.logging_ = (Logging) ((Logging.b) Logging.newBuilder(this.logging_).mergeFrom((GeneratedMessageLite) logging)).buildPartial();
        }
        this.bitField0_ |= RecognitionOptions.UPC_E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        Monitoring monitoring2 = this.monitoring_;
        if (monitoring2 == null || monitoring2 == Monitoring.getDefaultInstance()) {
            this.monitoring_ = monitoring;
        } else {
            this.monitoring_ = (Monitoring) ((Monitoring.b) Monitoring.newBuilder(this.monitoring_).mergeFrom((GeneratedMessageLite) monitoring)).buildPartial();
        }
        this.bitField0_ |= RecognitionOptions.PDF417;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeQuota(Quota quota) {
        quota.getClass();
        Quota quota2 = this.quota_;
        if (quota2 == null || quota2 == Quota.getDefaultInstance()) {
            this.quota_ = quota;
        } else {
            this.quota_ = (Quota) ((Quota.b) Quota.newBuilder(this.quota_).mergeFrom((GeneratedMessageLite) quota)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        SourceInfo sourceInfo2 = this.sourceInfo_;
        if (sourceInfo2 == null || sourceInfo2 == SourceInfo.getDefaultInstance()) {
            this.sourceInfo_ = sourceInfo;
        } else {
            this.sourceInfo_ = (SourceInfo) ((SourceInfo.b) SourceInfo.newBuilder(this.sourceInfo_).mergeFrom((GeneratedMessageLite) sourceInfo)).buildPartial();
        }
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        SystemParameters systemParameters2 = this.systemParameters_;
        if (systemParameters2 == null || systemParameters2 == SystemParameters.getDefaultInstance()) {
            this.systemParameters_ = systemParameters;
        } else {
            this.systemParameters_ = (SystemParameters) ((SystemParameters.b) SystemParameters.newBuilder(this.systemParameters_).mergeFrom((GeneratedMessageLite) systemParameters)).buildPartial();
        }
        this.bitField0_ |= RecognitionOptions.AZTEC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUsage(Usage usage) {
        usage.getClass();
        Usage usage2 = this.usage_;
        if (usage2 == null || usage2 == Usage.getDefaultInstance()) {
            this.usage_ = usage;
        } else {
            this.usage_ = (Usage) ((Usage.b) Usage.newBuilder(this.usage_).mergeFrom((GeneratedMessageLite) usage)).buildPartial();
        }
        this.bitField0_ |= 128;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Service parseDelimitedFrom(InputStream inputStream) {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(ByteBuffer byteBuffer) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeApis(int i10) {
        ensureApisIsMutable();
        this.apis_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEndpoints(int i10) {
        ensureEndpointsIsMutable();
        this.endpoints_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEnums(int i10) {
        ensureEnumsIsMutable();
        this.enums_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLogs(int i10) {
        ensureLogsIsMutable();
        this.logs_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMetrics(int i10) {
        ensureMetricsIsMutable();
        this.metrics_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeMonitoredResources(int i10) {
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeTypes(int i10) {
        ensureTypesIsMutable();
        this.types_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApis(int i10, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.set(i10, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAuthentication(Authentication authentication) {
        authentication.getClass();
        this.authentication_ = authentication;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBackend(Backend backend) {
        backend.getClass();
        this.backend_ = backend;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBilling(Billing billing) {
        billing.getClass();
        this.billing_ = billing;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConfigVersion(UInt32Value uInt32Value) {
        uInt32Value.getClass();
        this.configVersion_ = uInt32Value;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(Context context) {
        context.getClass();
        this.context_ = context;
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setControl(Control control) {
        control.getClass();
        this.control_ = control;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDocumentation(Documentation documentation) {
        documentation.getClass();
        this.documentation_ = documentation;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEndpoints(int i10, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.set(i10, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEnums(int i10, Enum r22) {
        r22.getClass();
        ensureEnumsIsMutable();
        this.enums_.set(i10, r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHttp(Http http) {
        http.getClass();
        this.http_ = http;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.id_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogging(Logging logging) {
        logging.getClass();
        this.logging_ = logging;
        this.bitField0_ |= RecognitionOptions.UPC_E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogs(int i10, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.set(i10, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetrics(int i10, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.set(i10, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoredResources(int i10, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.set(i10, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMonitoring(Monitoring monitoring) {
        monitoring.getClass();
        this.monitoring_ = monitoring;
        this.bitField0_ |= RecognitionOptions.PDF417;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.name_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectId(String str) {
        str.getClass();
        this.producerProjectId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerProjectIdBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.producerProjectId_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setQuota(Quota quota) {
        quota.getClass();
        this.quota_ = quota;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSourceInfo(SourceInfo sourceInfo) {
        sourceInfo.getClass();
        this.sourceInfo_ = sourceInfo;
        this.bitField0_ |= 8192;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSystemParameters(SystemParameters systemParameters) {
        systemParameters.getClass();
        this.systemParameters_ = systemParameters;
        this.bitField0_ |= RecognitionOptions.AZTEC;
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypes(int i10, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.set(i10, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUsage(Usage usage) {
        usage.getClass();
        this.usage_ = usage;
        this.bitField0_ |= 128;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        a aVar = null;
        switch (a.f31074a[gVar.ordinal()]) {
            case 1:
                return new Service();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0019\u0000\u0001\u0001%\u0019\u0000\u0007\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u001b\u0005\u001b\u0006ဉ\u0001\bဉ\u0002\tဉ\u0003\nဉ\u0004\u000bဉ\u0005\fဉ\u0006\u000fဉ\u0007\u0012\u001b\u0014ဉ\u0000\u0015ဉ\b\u0016Ȉ\u0017\u001b\u0018\u001b\u0019\u001b\u001aဉ\t\u001bဉ\n\u001cဉ\u000b\u001dဉ\f!Ȉ%ဉ\r", new Object[]{"bitField0_", "name_", "title_", "apis_", Api.class, "types_", Type.class, "enums_", Enum.class, "documentation_", "backend_", "http_", "quota_", "authentication_", "context_", "usage_", "endpoints_", Endpoint.class, "configVersion_", "control_", "producerProjectId_", "logs_", LogDescriptor.class, "metrics_", MetricDescriptor.class, "monitoredResources_", MonitoredResourceDescriptor.class, "billing_", "logging_", "monitoring_", "systemParameters_", "id_", "sourceInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (Service.class) {
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

    public Api getApis(int i10) {
        return (Api) this.apis_.get(i10);
    }

    public int getApisCount() {
        return this.apis_.size();
    }

    public List<Api> getApisList() {
        return this.apis_;
    }

    public InterfaceC3714f getApisOrBuilder(int i10) {
        return (InterfaceC3714f) this.apis_.get(i10);
    }

    public List<? extends InterfaceC3714f> getApisOrBuilderList() {
        return this.apis_;
    }

    public Authentication getAuthentication() {
        Authentication authentication = this.authentication_;
        return authentication == null ? Authentication.getDefaultInstance() : authentication;
    }

    public Backend getBackend() {
        Backend backend = this.backend_;
        return backend == null ? Backend.getDefaultInstance() : backend;
    }

    public Billing getBilling() {
        Billing billing = this.billing_;
        return billing == null ? Billing.getDefaultInstance() : billing;
    }

    public UInt32Value getConfigVersion() {
        UInt32Value uInt32Value = this.configVersion_;
        return uInt32Value == null ? UInt32Value.getDefaultInstance() : uInt32Value;
    }

    public Context getContext() {
        Context context = this.context_;
        return context == null ? Context.getDefaultInstance() : context;
    }

    public Control getControl() {
        Control control = this.control_;
        return control == null ? Control.getDefaultInstance() : control;
    }

    public Documentation getDocumentation() {
        Documentation documentation = this.documentation_;
        return documentation == null ? Documentation.getDefaultInstance() : documentation;
    }

    public Endpoint getEndpoints(int i10) {
        return (Endpoint) this.endpoints_.get(i10);
    }

    public int getEndpointsCount() {
        return this.endpoints_.size();
    }

    public List<Endpoint> getEndpointsList() {
        return this.endpoints_;
    }

    public h getEndpointsOrBuilder(int i10) {
        return (h) this.endpoints_.get(i10);
    }

    public List<? extends h> getEndpointsOrBuilderList() {
        return this.endpoints_;
    }

    public Enum getEnums(int i10) {
        return (Enum) this.enums_.get(i10);
    }

    public int getEnumsCount() {
        return this.enums_.size();
    }

    public List<Enum> getEnumsList() {
        return this.enums_;
    }

    public InterfaceC3746z getEnumsOrBuilder(int i10) {
        return (InterfaceC3746z) this.enums_.get(i10);
    }

    public List<? extends InterfaceC3746z> getEnumsOrBuilderList() {
        return this.enums_;
    }

    public Http getHttp() {
        Http http = this.http_;
        return http == null ? Http.getDefaultInstance() : http;
    }

    public String getId() {
        return this.id_;
    }

    public AbstractC3722j getIdBytes() {
        return AbstractC3722j.n(this.id_);
    }

    public Logging getLogging() {
        Logging logging = this.logging_;
        return logging == null ? Logging.getDefaultInstance() : logging;
    }

    public LogDescriptor getLogs(int i10) {
        return (LogDescriptor) this.logs_.get(i10);
    }

    public int getLogsCount() {
        return this.logs_.size();
    }

    public List<LogDescriptor> getLogsList() {
        return this.logs_;
    }

    public j getLogsOrBuilder(int i10) {
        return (j) this.logs_.get(i10);
    }

    public List<? extends j> getLogsOrBuilderList() {
        return this.logs_;
    }

    public MetricDescriptor getMetrics(int i10) {
        return (MetricDescriptor) this.metrics_.get(i10);
    }

    public int getMetricsCount() {
        return this.metrics_.size();
    }

    public List<MetricDescriptor> getMetricsList() {
        return this.metrics_;
    }

    public e getMetricsOrBuilder(int i10) {
        return (e) this.metrics_.get(i10);
    }

    public List<? extends e> getMetricsOrBuilderList() {
        return this.metrics_;
    }

    public MonitoredResourceDescriptor getMonitoredResources(int i10) {
        return (MonitoredResourceDescriptor) this.monitoredResources_.get(i10);
    }

    public int getMonitoredResourcesCount() {
        return this.monitoredResources_.size();
    }

    public List<MonitoredResourceDescriptor> getMonitoredResourcesList() {
        return this.monitoredResources_;
    }

    public l getMonitoredResourcesOrBuilder(int i10) {
        return (l) this.monitoredResources_.get(i10);
    }

    public List<? extends l> getMonitoredResourcesOrBuilderList() {
        return this.monitoredResources_;
    }

    public Monitoring getMonitoring() {
        Monitoring monitoring = this.monitoring_;
        return monitoring == null ? Monitoring.getDefaultInstance() : monitoring;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public String getProducerProjectId() {
        return this.producerProjectId_;
    }

    public AbstractC3722j getProducerProjectIdBytes() {
        return AbstractC3722j.n(this.producerProjectId_);
    }

    public Quota getQuota() {
        Quota quota = this.quota_;
        return quota == null ? Quota.getDefaultInstance() : quota;
    }

    public SourceInfo getSourceInfo() {
        SourceInfo sourceInfo = this.sourceInfo_;
        return sourceInfo == null ? SourceInfo.getDefaultInstance() : sourceInfo;
    }

    public SystemParameters getSystemParameters() {
        SystemParameters systemParameters = this.systemParameters_;
        return systemParameters == null ? SystemParameters.getDefaultInstance() : systemParameters;
    }

    public String getTitle() {
        return this.title_;
    }

    public AbstractC3722j getTitleBytes() {
        return AbstractC3722j.n(this.title_);
    }

    public Type getTypes(int i10) {
        return (Type) this.types_.get(i10);
    }

    public int getTypesCount() {
        return this.types_.size();
    }

    public List<Type> getTypesList() {
        return this.types_;
    }

    public H0 getTypesOrBuilder(int i10) {
        return (H0) this.types_.get(i10);
    }

    public List<? extends H0> getTypesOrBuilderList() {
        return this.types_;
    }

    public Usage getUsage() {
        Usage usage = this.usage_;
        return usage == null ? Usage.getDefaultInstance() : usage;
    }

    public boolean hasAuthentication() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBackend() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBilling() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasConfigVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasContext() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasControl() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasDocumentation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasHttp() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLogging() {
        return (this.bitField0_ & RecognitionOptions.UPC_E) != 0;
    }

    public boolean hasMonitoring() {
        return (this.bitField0_ & RecognitionOptions.PDF417) != 0;
    }

    public boolean hasQuota() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSourceInfo() {
        return (this.bitField0_ & 8192) != 0;
    }

    public boolean hasSystemParameters() {
        return (this.bitField0_ & RecognitionOptions.AZTEC) != 0;
    }

    public boolean hasUsage() {
        return (this.bitField0_ & 128) != 0;
    }

    public static b newBuilder(Service service) {
        return (b) DEFAULT_INSTANCE.createBuilder(service);
    }

    public static Service parseDelimitedFrom(InputStream inputStream, D d10) {
        return (Service) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Service parseFrom(ByteBuffer byteBuffer, D d10) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static Service parseFrom(AbstractC3722j abstractC3722j) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addApis(int i10, Api api) {
        api.getClass();
        ensureApisIsMutable();
        this.apis_.add(i10, api);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEndpoints(int i10, Endpoint endpoint) {
        endpoint.getClass();
        ensureEndpointsIsMutable();
        this.endpoints_.add(i10, endpoint);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEnums(int i10, Enum r22) {
        r22.getClass();
        ensureEnumsIsMutable();
        this.enums_.add(i10, r22);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLogs(int i10, LogDescriptor logDescriptor) {
        logDescriptor.getClass();
        ensureLogsIsMutable();
        this.logs_.add(i10, logDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMetrics(int i10, MetricDescriptor metricDescriptor) {
        metricDescriptor.getClass();
        ensureMetricsIsMutable();
        this.metrics_.add(i10, metricDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addMonitoredResources(int i10, MonitoredResourceDescriptor monitoredResourceDescriptor) {
        monitoredResourceDescriptor.getClass();
        ensureMonitoredResourcesIsMutable();
        this.monitoredResources_.add(i10, monitoredResourceDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addTypes(int i10, Type type) {
        type.getClass();
        ensureTypesIsMutable();
        this.types_.add(i10, type);
    }

    public static Service parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static Service parseFrom(byte[] bArr) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Service parseFrom(byte[] bArr, D d10) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static Service parseFrom(InputStream inputStream) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Service parseFrom(InputStream inputStream, D d10) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Service parseFrom(AbstractC3724k abstractC3724k) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static Service parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (Service) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
