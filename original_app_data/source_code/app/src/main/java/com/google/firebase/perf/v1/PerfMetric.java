package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.ApplicationInfo;
import com.google.firebase.perf.v1.GaugeMetric;
import com.google.firebase.perf.v1.NetworkRequestMetric;
import com.google.firebase.perf.v1.TraceMetric;
import com.google.firebase.perf.v1.TransportInfo;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.t0;
import i9.d;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class PerfMetric extends GeneratedMessageLite implements d {
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final PerfMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile t0 PARSER = null;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private ApplicationInfo applicationInfo_;
    private int bitField0_;
    private GaugeMetric gaugeMetric_;
    private NetworkRequestMetric networkRequestMetric_;
    private TraceMetric traceMetric_;
    private TransportInfo transportInfo_;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31884a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31884a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31884a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31884a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31884a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31884a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31884a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31884a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements d {
        public /* synthetic */ b(a aVar) {
            this();
        }

        @Override // i9.d
        public GaugeMetric getGaugeMetric() {
            return ((PerfMetric) this.instance).getGaugeMetric();
        }

        @Override // i9.d
        public NetworkRequestMetric getNetworkRequestMetric() {
            return ((PerfMetric) this.instance).getNetworkRequestMetric();
        }

        @Override // i9.d
        public TraceMetric getTraceMetric() {
            return ((PerfMetric) this.instance).getTraceMetric();
        }

        @Override // i9.d
        public boolean hasGaugeMetric() {
            return ((PerfMetric) this.instance).hasGaugeMetric();
        }

        @Override // i9.d
        public boolean hasNetworkRequestMetric() {
            return ((PerfMetric) this.instance).hasNetworkRequestMetric();
        }

        @Override // i9.d
        public boolean hasTraceMetric() {
            return ((PerfMetric) this.instance).hasTraceMetric();
        }

        public b j(ApplicationInfo.b bVar) {
            copyOnWrite();
            ((PerfMetric) this.instance).setApplicationInfo((ApplicationInfo) bVar.build());
            return this;
        }

        public b m(GaugeMetric gaugeMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setGaugeMetric(gaugeMetric);
            return this;
        }

        public b n(NetworkRequestMetric networkRequestMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setNetworkRequestMetric(networkRequestMetric);
            return this;
        }

        public b o(TraceMetric traceMetric) {
            copyOnWrite();
            ((PerfMetric) this.instance).setTraceMetric(traceMetric);
            return this;
        }

        public b() {
            super(PerfMetric.DEFAULT_INSTANCE);
        }
    }

    static {
        PerfMetric perfMetric = new PerfMetric();
        DEFAULT_INSTANCE = perfMetric;
        GeneratedMessageLite.registerDefaultInstance(PerfMetric.class, perfMetric);
    }

    private PerfMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearApplicationInfo() {
        this.applicationInfo_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetric() {
        this.gaugeMetric_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRequestMetric() {
        this.networkRequestMetric_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTraceMetric() {
        this.traceMetric_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransportInfo() {
        this.transportInfo_ = null;
        this.bitField0_ &= -17;
    }

    public static PerfMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        ApplicationInfo applicationInfo2 = this.applicationInfo_;
        if (applicationInfo2 == null || applicationInfo2 == ApplicationInfo.getDefaultInstance()) {
            this.applicationInfo_ = applicationInfo;
        } else {
            this.applicationInfo_ = (ApplicationInfo) ((ApplicationInfo.b) ApplicationInfo.newBuilder(this.applicationInfo_).mergeFrom((GeneratedMessageLite) applicationInfo)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        GaugeMetric gaugeMetric2 = this.gaugeMetric_;
        if (gaugeMetric2 == null || gaugeMetric2 == GaugeMetric.getDefaultInstance()) {
            this.gaugeMetric_ = gaugeMetric;
        } else {
            this.gaugeMetric_ = (GaugeMetric) ((GaugeMetric.b) GaugeMetric.newBuilder(this.gaugeMetric_).mergeFrom((GeneratedMessageLite) gaugeMetric)).buildPartial();
        }
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        NetworkRequestMetric networkRequestMetric2 = this.networkRequestMetric_;
        if (networkRequestMetric2 == null || networkRequestMetric2 == NetworkRequestMetric.getDefaultInstance()) {
            this.networkRequestMetric_ = networkRequestMetric;
        } else {
            this.networkRequestMetric_ = (NetworkRequestMetric) ((NetworkRequestMetric.b) NetworkRequestMetric.newBuilder(this.networkRequestMetric_).mergeFrom((GeneratedMessageLite) networkRequestMetric)).buildPartial();
        }
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        TraceMetric traceMetric2 = this.traceMetric_;
        if (traceMetric2 == null || traceMetric2 == TraceMetric.getDefaultInstance()) {
            this.traceMetric_ = traceMetric;
        } else {
            this.traceMetric_ = (TraceMetric) ((TraceMetric.b) TraceMetric.newBuilder(this.traceMetric_).mergeFrom((GeneratedMessageLite) traceMetric)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        TransportInfo transportInfo2 = this.transportInfo_;
        if (transportInfo2 == null || transportInfo2 == TransportInfo.getDefaultInstance()) {
            this.transportInfo_ = transportInfo;
        } else {
            this.transportInfo_ = (TransportInfo) ((TransportInfo.b) TransportInfo.newBuilder(this.transportInfo_).mergeFrom((GeneratedMessageLite) transportInfo)).buildPartial();
        }
        this.bitField0_ |= 16;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream) {
        return (PerfMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationInfo(ApplicationInfo applicationInfo) {
        applicationInfo.getClass();
        this.applicationInfo_ = applicationInfo;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetric(GaugeMetric gaugeMetric) {
        gaugeMetric.getClass();
        this.gaugeMetric_ = gaugeMetric;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRequestMetric(NetworkRequestMetric networkRequestMetric) {
        networkRequestMetric.getClass();
        this.networkRequestMetric_ = networkRequestMetric;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTraceMetric(TraceMetric traceMetric) {
        traceMetric.getClass();
        this.traceMetric_ = traceMetric;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransportInfo(TransportInfo transportInfo) {
        transportInfo.getClass();
        this.transportInfo_ = transportInfo;
        this.bitField0_ |= 16;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31884a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new PerfMetric();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (PerfMetric.class) {
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

    public ApplicationInfo getApplicationInfo() {
        ApplicationInfo applicationInfo = this.applicationInfo_;
        return applicationInfo == null ? ApplicationInfo.getDefaultInstance() : applicationInfo;
    }

    @Override // i9.d
    public GaugeMetric getGaugeMetric() {
        GaugeMetric gaugeMetric = this.gaugeMetric_;
        return gaugeMetric == null ? GaugeMetric.getDefaultInstance() : gaugeMetric;
    }

    @Override // i9.d
    public NetworkRequestMetric getNetworkRequestMetric() {
        NetworkRequestMetric networkRequestMetric = this.networkRequestMetric_;
        return networkRequestMetric == null ? NetworkRequestMetric.getDefaultInstance() : networkRequestMetric;
    }

    @Override // i9.d
    public TraceMetric getTraceMetric() {
        TraceMetric traceMetric = this.traceMetric_;
        return traceMetric == null ? TraceMetric.getDefaultInstance() : traceMetric;
    }

    public TransportInfo getTransportInfo() {
        TransportInfo transportInfo = this.transportInfo_;
        return transportInfo == null ? TransportInfo.getDefaultInstance() : transportInfo;
    }

    public boolean hasApplicationInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // i9.d
    public boolean hasGaugeMetric() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // i9.d
    public boolean hasNetworkRequestMetric() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // i9.d
    public boolean hasTraceMetric() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTransportInfo() {
        return (this.bitField0_ & 16) != 0;
    }

    public static b newBuilder(PerfMetric perfMetric) {
        return (b) DEFAULT_INSTANCE.createBuilder(perfMetric);
    }

    public static PerfMetric parseDelimitedFrom(InputStream inputStream, D d10) {
        return (PerfMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static PerfMetric parseFrom(ByteBuffer byteBuffer, D d10) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static PerfMetric parseFrom(AbstractC3722j abstractC3722j) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static PerfMetric parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static PerfMetric parseFrom(byte[] bArr) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PerfMetric parseFrom(byte[] bArr, D d10) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static PerfMetric parseFrom(InputStream inputStream) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PerfMetric parseFrom(InputStream inputStream, D d10) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static PerfMetric parseFrom(AbstractC3724k abstractC3724k) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static PerfMetric parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (PerfMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
