package com.google.firebase.perf.v1;

import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import i9.InterfaceC4368a;
import i9.c;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class GaugeMetric extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final GaugeMetric DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile t0 PARSER = null;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private GaugeMetadata gaugeMetadata_;
    private String sessionId_ = "";
    private N.j cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    private N.j androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31876a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31876a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31876a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31876a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31876a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31876a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31876a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31876a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements InterfaceC3719h0 {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b j(AndroidMemoryReading androidMemoryReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addAndroidMemoryReadings(androidMemoryReading);
            return this;
        }

        public b m(CpuMetricReading cpuMetricReading) {
            copyOnWrite();
            ((GaugeMetric) this.instance).addCpuMetricReadings(cpuMetricReading);
            return this;
        }

        public b n(GaugeMetadata gaugeMetadata) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setGaugeMetadata(gaugeMetadata);
            return this;
        }

        public b o(String str) {
            copyOnWrite();
            ((GaugeMetric) this.instance).setSessionId(str);
            return this;
        }

        public b() {
            super(GaugeMetric.DEFAULT_INSTANCE);
        }
    }

    static {
        GaugeMetric gaugeMetric = new GaugeMetric();
        DEFAULT_INSTANCE = gaugeMetric;
        GeneratedMessageLite.registerDefaultInstance(GaugeMetric.class, gaugeMetric);
    }

    private GaugeMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAndroidMemoryReadings(Iterable<? extends AndroidMemoryReading> iterable) {
        ensureAndroidMemoryReadingsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.androidMemoryReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllCpuMetricReadings(Iterable<? extends CpuMetricReading> iterable) {
        ensureCpuMetricReadingsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.cpuMetricReadings_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAndroidMemoryReadings() {
        this.androidMemoryReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCpuMetricReadings() {
        this.cpuMetricReadings_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGaugeMetadata() {
        this.gaugeMetadata_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSessionId() {
        this.bitField0_ &= -2;
        this.sessionId_ = getDefaultInstance().getSessionId();
    }

    private void ensureAndroidMemoryReadingsIsMutable() {
        N.j jVar = this.androidMemoryReadings_;
        if (jVar.m()) {
            return;
        }
        this.androidMemoryReadings_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureCpuMetricReadingsIsMutable() {
        N.j jVar = this.cpuMetricReadings_;
        if (jVar.m()) {
            return;
        }
        this.cpuMetricReadings_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static GaugeMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        GaugeMetadata gaugeMetadata2 = this.gaugeMetadata_;
        if (gaugeMetadata2 == null || gaugeMetadata2 == GaugeMetadata.getDefaultInstance()) {
            this.gaugeMetadata_ = gaugeMetadata;
        } else {
            this.gaugeMetadata_ = (GaugeMetadata) ((GaugeMetadata.b) GaugeMetadata.newBuilder(this.gaugeMetadata_).mergeFrom((GeneratedMessageLite) gaugeMetadata)).buildPartial();
        }
        this.bitField0_ |= 2;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream) {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAndroidMemoryReadings(int i10) {
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeCpuMetricReadings(int i10) {
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAndroidMemoryReadings(int i10, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.set(i10, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCpuMetricReadings(int i10, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.set(i10, cpuMetricReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGaugeMetadata(GaugeMetadata gaugeMetadata) {
        gaugeMetadata.getClass();
        this.gaugeMetadata_ = gaugeMetadata;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionId(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSessionIdBytes(AbstractC3722j abstractC3722j) {
        this.sessionId_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31876a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new GaugeMetric();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0001\u0004\u001b", new Object[]{"bitField0_", "sessionId_", "cpuMetricReadings_", CpuMetricReading.class, "gaugeMetadata_", "androidMemoryReadings_", AndroidMemoryReading.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (GaugeMetric.class) {
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

    public AndroidMemoryReading getAndroidMemoryReadings(int i10) {
        return (AndroidMemoryReading) this.androidMemoryReadings_.get(i10);
    }

    public int getAndroidMemoryReadingsCount() {
        return this.androidMemoryReadings_.size();
    }

    public List<AndroidMemoryReading> getAndroidMemoryReadingsList() {
        return this.androidMemoryReadings_;
    }

    public InterfaceC4368a getAndroidMemoryReadingsOrBuilder(int i10) {
        return (InterfaceC4368a) this.androidMemoryReadings_.get(i10);
    }

    public List<? extends InterfaceC4368a> getAndroidMemoryReadingsOrBuilderList() {
        return this.androidMemoryReadings_;
    }

    public CpuMetricReading getCpuMetricReadings(int i10) {
        return (CpuMetricReading) this.cpuMetricReadings_.get(i10);
    }

    public int getCpuMetricReadingsCount() {
        return this.cpuMetricReadings_.size();
    }

    public List<CpuMetricReading> getCpuMetricReadingsList() {
        return this.cpuMetricReadings_;
    }

    public c getCpuMetricReadingsOrBuilder(int i10) {
        return (c) this.cpuMetricReadings_.get(i10);
    }

    public List<? extends c> getCpuMetricReadingsOrBuilderList() {
        return this.cpuMetricReadings_;
    }

    public GaugeMetadata getGaugeMetadata() {
        GaugeMetadata gaugeMetadata = this.gaugeMetadata_;
        return gaugeMetadata == null ? GaugeMetadata.getDefaultInstance() : gaugeMetadata;
    }

    public String getSessionId() {
        return this.sessionId_;
    }

    public AbstractC3722j getSessionIdBytes() {
        return AbstractC3722j.n(this.sessionId_);
    }

    public boolean hasGaugeMetadata() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSessionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(GaugeMetric gaugeMetric) {
        return (b) DEFAULT_INSTANCE.createBuilder(gaugeMetric);
    }

    public static GaugeMetric parseDelimitedFrom(InputStream inputStream, D d10) {
        return (GaugeMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static GaugeMetric parseFrom(ByteBuffer byteBuffer, D d10) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static GaugeMetric parseFrom(AbstractC3722j abstractC3722j) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAndroidMemoryReadings(int i10, AndroidMemoryReading androidMemoryReading) {
        androidMemoryReading.getClass();
        ensureAndroidMemoryReadingsIsMutable();
        this.androidMemoryReadings_.add(i10, androidMemoryReading);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addCpuMetricReadings(int i10, CpuMetricReading cpuMetricReading) {
        cpuMetricReading.getClass();
        ensureCpuMetricReadingsIsMutable();
        this.cpuMetricReadings_.add(i10, cpuMetricReading);
    }

    public static GaugeMetric parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static GaugeMetric parseFrom(byte[] bArr) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static GaugeMetric parseFrom(byte[] bArr, D d10) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static GaugeMetric parseFrom(InputStream inputStream) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static GaugeMetric parseFrom(InputStream inputStream, D d10) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static GaugeMetric parseFrom(AbstractC3724k abstractC3724k) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static GaugeMetric parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (GaugeMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
