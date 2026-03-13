package com.google.api;

import E7.i;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.D;
import com.google.protobuf.Duration;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InterfaceC3719h0;
import com.google.protobuf.N;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class MetricDescriptor extends GeneratedMessageLite implements e {
    private static final MetricDescriptor DEFAULT_INSTANCE;
    public static final int DESCRIPTION_FIELD_NUMBER = 6;
    public static final int DISPLAY_NAME_FIELD_NUMBER = 7;
    public static final int LABELS_FIELD_NUMBER = 2;
    public static final int LAUNCH_STAGE_FIELD_NUMBER = 12;
    public static final int METADATA_FIELD_NUMBER = 10;
    public static final int METRIC_KIND_FIELD_NUMBER = 3;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile t0 PARSER = null;
    public static final int TYPE_FIELD_NUMBER = 8;
    public static final int UNIT_FIELD_NUMBER = 5;
    public static final int VALUE_TYPE_FIELD_NUMBER = 4;
    private int bitField0_;
    private int launchStage_;
    private MetricDescriptorMetadata metadata_;
    private int metricKind_;
    private int valueType_;
    private String name_ = "";
    private String type_ = "";
    private N.j labels_ = GeneratedMessageLite.emptyProtobufList();
    private String unit_ = "";
    private String description_ = "";
    private String displayName_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class MetricDescriptorMetadata extends GeneratedMessageLite implements InterfaceC3719h0 {
        private static final MetricDescriptorMetadata DEFAULT_INSTANCE;
        public static final int INGEST_DELAY_FIELD_NUMBER = 3;
        public static final int LAUNCH_STAGE_FIELD_NUMBER = 1;
        private static volatile t0 PARSER = null;
        public static final int SAMPLE_PERIOD_FIELD_NUMBER = 2;
        private int bitField0_;
        private Duration ingestDelay_;
        private int launchStage_;
        private Duration samplePeriod_;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a extends GeneratedMessageLite.b implements InterfaceC3719h0 {
            public /* synthetic */ a(a aVar) {
                this();
            }

            public a() {
                super(MetricDescriptorMetadata.DEFAULT_INSTANCE);
            }
        }

        static {
            MetricDescriptorMetadata metricDescriptorMetadata = new MetricDescriptorMetadata();
            DEFAULT_INSTANCE = metricDescriptorMetadata;
            GeneratedMessageLite.registerDefaultInstance(MetricDescriptorMetadata.class, metricDescriptorMetadata);
        }

        private MetricDescriptorMetadata() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIngestDelay() {
            this.ingestDelay_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLaunchStage() {
            this.launchStage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSamplePeriod() {
            this.samplePeriod_ = null;
            this.bitField0_ &= -2;
        }

        public static MetricDescriptorMetadata getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIngestDelay(Duration duration) {
            duration.getClass();
            Duration duration2 = this.ingestDelay_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.ingestDelay_ = duration;
            } else {
                this.ingestDelay_ = (Duration) ((Duration.b) Duration.newBuilder(this.ingestDelay_).mergeFrom((GeneratedMessageLite) duration)).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSamplePeriod(Duration duration) {
            duration.getClass();
            Duration duration2 = this.samplePeriod_;
            if (duration2 == null || duration2 == Duration.getDefaultInstance()) {
                this.samplePeriod_ = duration;
            } else {
                this.samplePeriod_ = (Duration) ((Duration.b) Duration.newBuilder(this.samplePeriod_).mergeFrom((GeneratedMessageLite) duration)).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        public static a newBuilder() {
            return (a) DEFAULT_INSTANCE.createBuilder();
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static t0 parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIngestDelay(Duration duration) {
            duration.getClass();
            this.ingestDelay_ = duration;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLaunchStage(i iVar) {
            this.launchStage_ = iVar.getNumber();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLaunchStageValue(int i10) {
            this.launchStage_ = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSamplePeriod(Duration duration) {
            duration.getClass();
            this.samplePeriod_ = duration;
            this.bitField0_ |= 1;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
            t0 cVar;
            int i10 = a.f31056a[gVar.ordinal()];
            a aVar = null;
            switch (i10) {
                case 1:
                    return new MetricDescriptorMetadata();
                case 2:
                    return new a(aVar);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "launchStage_", "samplePeriod_", "ingestDelay_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    t0 t0Var = PARSER;
                    if (t0Var != null) {
                        return t0Var;
                    }
                    synchronized (MetricDescriptorMetadata.class) {
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

        public Duration getIngestDelay() {
            Duration duration = this.ingestDelay_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        @Deprecated
        public i getLaunchStage() {
            i iVarB = i.b(this.launchStage_);
            return iVarB == null ? i.UNRECOGNIZED : iVarB;
        }

        @Deprecated
        public int getLaunchStageValue() {
            return this.launchStage_;
        }

        public Duration getSamplePeriod() {
            Duration duration = this.samplePeriod_;
            return duration == null ? Duration.getDefaultInstance() : duration;
        }

        public boolean hasIngestDelay() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasSamplePeriod() {
            return (this.bitField0_ & 1) != 0;
        }

        public static a newBuilder(MetricDescriptorMetadata metricDescriptorMetadata) {
            return (a) DEFAULT_INSTANCE.createBuilder(metricDescriptorMetadata);
        }

        public static MetricDescriptorMetadata parseDelimitedFrom(InputStream inputStream, D d10) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MetricDescriptorMetadata parseFrom(ByteBuffer byteBuffer, D d10) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
        }

        public static MetricDescriptorMetadata parseFrom(AbstractC3722j abstractC3722j) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
        }

        public static MetricDescriptorMetadata parseFrom(AbstractC3722j abstractC3722j, D d10) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static MetricDescriptorMetadata parseFrom(byte[] bArr, D d10) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static MetricDescriptorMetadata parseFrom(InputStream inputStream, D d10) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
        }

        public static MetricDescriptorMetadata parseFrom(AbstractC3724k abstractC3724k) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
        }

        public static MetricDescriptorMetadata parseFrom(AbstractC3724k abstractC3724k, D d10) {
            return (MetricDescriptorMetadata) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31056a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31056a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31056a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31056a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31056a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31056a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31056a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31056a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements e {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(MetricDescriptor.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum c implements N.c {
        METRIC_KIND_UNSPECIFIED(0),
        GAUGE(1),
        DELTA(2),
        CUMULATIVE(3),
        UNRECOGNIZED(-1);

        public static final int CUMULATIVE_VALUE = 3;
        public static final int DELTA_VALUE = 2;
        public static final int GAUGE_VALUE = 1;
        public static final int METRIC_KIND_UNSPECIFIED_VALUE = 0;
        private static final N.d internalValueMap = new a();
        private final int value;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public class a implements N.d {
            @Override // com.google.protobuf.N.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c findValueByNumber(int i10) {
                return c.b(i10);
            }
        }

        c(int i10) {
            this.value = i10;
        }

        public static c b(int i10) {
            if (i10 == 0) {
                return METRIC_KIND_UNSPECIFIED;
            }
            if (i10 == 1) {
                return GAUGE;
            }
            if (i10 == 2) {
                return DELTA;
            }
            if (i10 != 3) {
                return null;
            }
            return CUMULATIVE;
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public enum d implements N.c {
        VALUE_TYPE_UNSPECIFIED(0),
        BOOL(1),
        INT64(2),
        DOUBLE(3),
        STRING(4),
        DISTRIBUTION(5),
        MONEY(6),
        UNRECOGNIZED(-1);

        public static final int BOOL_VALUE = 1;
        public static final int DISTRIBUTION_VALUE = 5;
        public static final int DOUBLE_VALUE = 3;
        public static final int INT64_VALUE = 2;
        public static final int MONEY_VALUE = 6;
        public static final int STRING_VALUE = 4;
        public static final int VALUE_TYPE_UNSPECIFIED_VALUE = 0;
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

        d(int i10) {
            this.value = i10;
        }

        public static d b(int i10) {
            switch (i10) {
                case 0:
                    return VALUE_TYPE_UNSPECIFIED;
                case 1:
                    return BOOL;
                case 2:
                    return INT64;
                case 3:
                    return DOUBLE;
                case 4:
                    return STRING;
                case 5:
                    return DISTRIBUTION;
                case 6:
                    return MONEY;
                default:
                    return null;
            }
        }

        @Override // com.google.protobuf.N.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        MetricDescriptor metricDescriptor = new MetricDescriptor();
        DEFAULT_INSTANCE = metricDescriptor;
        GeneratedMessageLite.registerDefaultInstance(MetricDescriptor.class, metricDescriptor);
    }

    private MetricDescriptor() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllLabels(Iterable<? extends LabelDescriptor> iterable) {
        ensureLabelsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.labels_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(labelDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescription() {
        this.description_ = getDefaultInstance().getDescription();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayName() {
        this.displayName_ = getDefaultInstance().getDisplayName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLabels() {
        this.labels_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLaunchStage() {
        this.launchStage_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetricKind() {
        this.metricKind_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnit() {
        this.unit_ = getDefaultInstance().getUnit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValueType() {
        this.valueType_ = 0;
    }

    private void ensureLabelsIsMutable() {
        N.j jVar = this.labels_;
        if (jVar.m()) {
            return;
        }
        this.labels_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static MetricDescriptor getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        MetricDescriptorMetadata metricDescriptorMetadata2 = this.metadata_;
        if (metricDescriptorMetadata2 == null || metricDescriptorMetadata2 == MetricDescriptorMetadata.getDefaultInstance()) {
            this.metadata_ = metricDescriptorMetadata;
        } else {
            this.metadata_ = (MetricDescriptorMetadata) ((MetricDescriptorMetadata.a) MetricDescriptorMetadata.newBuilder(this.metadata_).mergeFrom((GeneratedMessageLite) metricDescriptorMetadata)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream) {
        return (MetricDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeLabels(int i10) {
        ensureLabelsIsMutable();
        this.labels_.remove(i10);
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
    public void setDisplayName(String str) {
        str.getClass();
        this.displayName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayNameBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.displayName_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLabels(int i10, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.set(i10, labelDescriptor);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStage(i iVar) {
        this.launchStage_ = iVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLaunchStageValue(int i10) {
        this.launchStage_ = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(MetricDescriptorMetadata metricDescriptorMetadata) {
        metricDescriptorMetadata.getClass();
        this.metadata_ = metricDescriptorMetadata;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKind(c cVar) {
        this.metricKind_ = cVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetricKindValue(int i10) {
        this.metricKind_ = i10;
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
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.type_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnit(String str) {
        str.getClass();
        this.unit_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnitBytes(AbstractC3722j abstractC3722j) {
        AbstractC3704a.checkByteStringIsUtf8(abstractC3722j);
        this.unit_ = abstractC3722j.J();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueType(d dVar) {
        this.valueType_ = dVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValueTypeValue(int i10) {
        this.valueType_ = i10;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31056a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new MetricDescriptor();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\f\n\u0000\u0001\u0000\u0001Ȉ\u0002\u001b\u0003\f\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\nဉ\u0000\f\f", new Object[]{"bitField0_", "name_", "labels_", LabelDescriptor.class, "metricKind_", "valueType_", "unit_", "description_", "displayName_", "type_", "metadata_", "launchStage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (MetricDescriptor.class) {
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

    public String getDisplayName() {
        return this.displayName_;
    }

    public AbstractC3722j getDisplayNameBytes() {
        return AbstractC3722j.n(this.displayName_);
    }

    public LabelDescriptor getLabels(int i10) {
        return (LabelDescriptor) this.labels_.get(i10);
    }

    public int getLabelsCount() {
        return this.labels_.size();
    }

    public List<LabelDescriptor> getLabelsList() {
        return this.labels_;
    }

    public com.google.api.d getLabelsOrBuilder(int i10) {
        return (com.google.api.d) this.labels_.get(i10);
    }

    public List<? extends com.google.api.d> getLabelsOrBuilderList() {
        return this.labels_;
    }

    public i getLaunchStage() {
        i iVarB = i.b(this.launchStage_);
        return iVarB == null ? i.UNRECOGNIZED : iVarB;
    }

    public int getLaunchStageValue() {
        return this.launchStage_;
    }

    public MetricDescriptorMetadata getMetadata() {
        MetricDescriptorMetadata metricDescriptorMetadata = this.metadata_;
        return metricDescriptorMetadata == null ? MetricDescriptorMetadata.getDefaultInstance() : metricDescriptorMetadata;
    }

    public c getMetricKind() {
        c cVarB = c.b(this.metricKind_);
        return cVarB == null ? c.UNRECOGNIZED : cVarB;
    }

    public int getMetricKindValue() {
        return this.metricKind_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
    }

    public String getType() {
        return this.type_;
    }

    public AbstractC3722j getTypeBytes() {
        return AbstractC3722j.n(this.type_);
    }

    public String getUnit() {
        return this.unit_;
    }

    public AbstractC3722j getUnitBytes() {
        return AbstractC3722j.n(this.unit_);
    }

    public d getValueType() {
        d dVarB = d.b(this.valueType_);
        return dVarB == null ? d.UNRECOGNIZED : dVarB;
    }

    public int getValueTypeValue() {
        return this.valueType_;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(MetricDescriptor metricDescriptor) {
        return (b) DEFAULT_INSTANCE.createBuilder(metricDescriptor);
    }

    public static MetricDescriptor parseDelimitedFrom(InputStream inputStream, D d10) {
        return (MetricDescriptor) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static MetricDescriptor parseFrom(ByteBuffer byteBuffer, D d10) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static MetricDescriptor parseFrom(AbstractC3722j abstractC3722j) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addLabels(int i10, LabelDescriptor labelDescriptor) {
        labelDescriptor.getClass();
        ensureLabelsIsMutable();
        this.labels_.add(i10, labelDescriptor);
    }

    public static MetricDescriptor parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static MetricDescriptor parseFrom(byte[] bArr) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricDescriptor parseFrom(byte[] bArr, D d10) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricDescriptor parseFrom(InputStream inputStream, D d10) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static MetricDescriptor parseFrom(AbstractC3724k abstractC3724k) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static MetricDescriptor parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (MetricDescriptor) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
