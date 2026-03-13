package com.google.api;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class Monitoring extends GeneratedMessageLite implements InterfaceC3719h0 {
    public static final int CONSUMER_DESTINATIONS_FIELD_NUMBER = 2;
    private static final Monitoring DEFAULT_INSTANCE;
    private static volatile t0 PARSER = null;
    public static final int PRODUCER_DESTINATIONS_FIELD_NUMBER = 1;
    private N.j producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    private N.j consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class MonitoringDestination extends GeneratedMessageLite implements c {
        private static final MonitoringDestination DEFAULT_INSTANCE;
        public static final int METRICS_FIELD_NUMBER = 2;
        public static final int MONITORED_RESOURCE_FIELD_NUMBER = 1;
        private static volatile t0 PARSER;
        private String monitoredResource_ = "";
        private N.j metrics_ = GeneratedMessageLite.emptyProtobufList();

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements c {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(MonitoringDestination.DEFAULT_INSTANCE);
            }
        }

        static {
            MonitoringDestination monitoringDestination = new MonitoringDestination();
            DEFAULT_INSTANCE = monitoringDestination;
            GeneratedMessageLite.registerDefaultInstance(MonitoringDestination.class, monitoringDestination);
        }

        private MonitoringDestination() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllMetrics(Iterable<String> iterable) {
            ensureMetricsIsMutable();
            AbstractC3704a.addAll((Iterable) iterable, (List) this.metrics_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetrics(String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.add(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addMetricsBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            ensureMetricsIsMutable();
            this.metrics_.add(abstractC3722j.J());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMetrics() {
            this.metrics_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMonitoredResource() {
            this.monitoredResource_ = getDefaultInstance().getMonitoredResource();
        }

        private void ensureMetricsIsMutable() {
            N.j jVar = this.metrics_;
            if (jVar.m()) {
                return;
            }
            this.metrics_ = GeneratedMessageLite.mutableCopy(jVar);
        }

        public static MonitoringDestination getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream) {
            return (MonitoringDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetrics(int i10, String str) {
            str.getClass();
            ensureMetricsIsMutable();
            this.metrics_.set(i10, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResource(String str) {
            str.getClass();
            this.monitoredResource_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMonitoredResourceBytes(AbstractC3722j abstractC3722j) {
            AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
            this.monitoredResource_ = abstractC3722j.J();
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = a.f31064a[gVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new MonitoringDestination();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"monitoredResource_", "metrics_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (MonitoringDestination.class) {
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

        public String getMetrics(int i10) {
            return (String) this.metrics_.get(i10);
        }

        public AbstractC3722j getMetricsBytes(int i10) {
            return AbstractC3722j.n((String) this.metrics_.get(i10));
        }

        public int getMetricsCount() {
            return this.metrics_.size();
        }

        public List<String> getMetricsList() {
            return this.metrics_;
        }

        public String getMonitoredResource() {
            return this.monitoredResource_;
        }

        public AbstractC3722j getMonitoredResourceBytes() {
            return AbstractC3722j.n(this.monitoredResource_);
        }

        public static a newBuilder(MonitoringDestination monitoringDestination) {
            return (a) DEFAULT_INSTANCE.createBuilder(monitoringDestination);
        }

        public static MonitoringDestination parseDelimitedFrom(InputStream inputStream, D d10) {
            return (MonitoringDestination) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MonitoringDestination parseFrom(ByteBuffer byteBuffer, D d10) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static MonitoringDestination parseFrom(AbstractC3722j abstractC3722j) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static MonitoringDestination parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static MonitoringDestination parseFrom(byte[] bArr) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MonitoringDestination parseFrom(byte[] bArr, D d10) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MonitoringDestination parseFrom(InputStream inputStream, D d10) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MonitoringDestination parseFrom(AbstractC3724k abstractC3724k) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static MonitoringDestination parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (MonitoringDestination) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31064a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31064a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31064a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31064a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31064a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31064a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31064a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31064a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
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
            super(Monitoring.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface c extends InterfaceC3719h0 {
    }

    static {
        Monitoring monitoring = new Monitoring();
        DEFAULT_INSTANCE = monitoring;
        GeneratedMessageLite.registerDefaultInstance(Monitoring.class, monitoring);
    }

    private Monitoring() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllConsumerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureConsumerDestinationsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.consumerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllProducerDestinations(Iterable<? extends MonitoringDestination> iterable) {
        ensureProducerDestinationsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.producerDestinations_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearConsumerDestinations() {
        this.consumerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearProducerDestinations() {
        this.producerDestinations_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureConsumerDestinationsIsMutable() {
        N.j jVar = this.consumerDestinations_;
        if (jVar.m()) {
            return;
        }
        this.consumerDestinations_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureProducerDestinationsIsMutable() {
        N.j jVar = this.producerDestinations_;
        if (jVar.m()) {
            return;
        }
        this.producerDestinations_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static Monitoring getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream) {
        return (Monitoring) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeConsumerDestinations(int i10) {
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeProducerDestinations(int i10) {
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setConsumerDestinations(int i10, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.set(i10, monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setProducerDestinations(int i10, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.set(i10, monitoringDestination);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31064a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new Monitoring();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"producerDestinations_", MonitoringDestination.class, "consumerDestinations_", MonitoringDestination.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (Monitoring.class) {
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

    public MonitoringDestination getConsumerDestinations(int i10) {
        return (MonitoringDestination) this.consumerDestinations_.get(i10);
    }

    public int getConsumerDestinationsCount() {
        return this.consumerDestinations_.size();
    }

    public List<MonitoringDestination> getConsumerDestinationsList() {
        return this.consumerDestinations_;
    }

    public c getConsumerDestinationsOrBuilder(int i10) {
        return (c) this.consumerDestinations_.get(i10);
    }

    public List<? extends c> getConsumerDestinationsOrBuilderList() {
        return this.consumerDestinations_;
    }

    public MonitoringDestination getProducerDestinations(int i10) {
        return (MonitoringDestination) this.producerDestinations_.get(i10);
    }

    public int getProducerDestinationsCount() {
        return this.producerDestinations_.size();
    }

    public List<MonitoringDestination> getProducerDestinationsList() {
        return this.producerDestinations_;
    }

    public c getProducerDestinationsOrBuilder(int i10) {
        return (c) this.producerDestinations_.get(i10);
    }

    public List<? extends c> getProducerDestinationsOrBuilderList() {
        return this.producerDestinations_;
    }

    public static b newBuilder(Monitoring monitoring) {
        return (b) DEFAULT_INSTANCE.createBuilder(monitoring);
    }

    public static Monitoring parseDelimitedFrom(InputStream inputStream, D d10) {
        return (Monitoring) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Monitoring parseFrom(ByteBuffer byteBuffer, D d10) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static Monitoring parseFrom(AbstractC3722j abstractC3722j) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addConsumerDestinations(int i10, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureConsumerDestinationsIsMutable();
        this.consumerDestinations_.add(i10, monitoringDestination);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addProducerDestinations(int i10, MonitoringDestination monitoringDestination) {
        monitoringDestination.getClass();
        ensureProducerDestinationsIsMutable();
        this.producerDestinations_.add(i10, monitoringDestination);
    }

    public static Monitoring parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static Monitoring parseFrom(byte[] bArr) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Monitoring parseFrom(byte[] bArr, D d10) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static Monitoring parseFrom(InputStream inputStream) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Monitoring parseFrom(InputStream inputStream, D d10) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static Monitoring parseFrom(AbstractC3724k abstractC3724k) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static Monitoring parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (Monitoring) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
