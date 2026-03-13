package com.google.api;

import E7.k;
import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.C3705a0;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Q0;
import com.google.protobuf.Z;
import com.google.protobuf.t0;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class MetricRule extends GeneratedMessageLite implements k {
    private static final MetricRule DEFAULT_INSTANCE;
    public static final int METRIC_COSTS_FIELD_NUMBER = 2;
    private static volatile t0 PARSER = null;
    public static final int SELECTOR_FIELD_NUMBER = 1;
    private C3705a0 metricCosts_ = C3705a0.i();
    private String selector_ = "";

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31057a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31057a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31057a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31057a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31057a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31057a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31057a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31057a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements k {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b() {
            super(MetricRule.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f31058a = Z.d(Q0.b.STRING, "", Q0.b.INT64, 0L);
    }

    static {
        MetricRule metricRule = new MetricRule();
        DEFAULT_INSTANCE = metricRule;
        GeneratedMessageLite.registerDefaultInstance(MetricRule.class, metricRule);
    }

    private MetricRule() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSelector() {
        this.selector_ = getDefaultInstance().getSelector();
    }

    public static MetricRule getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableMetricCostsMap() {
        return internalGetMutableMetricCosts();
    }

    private C3705a0 internalGetMetricCosts() {
        return this.metricCosts_;
    }

    private C3705a0 internalGetMutableMetricCosts() {
        if (!this.metricCosts_.o()) {
            this.metricCosts_ = this.metricCosts_.r();
        }
        return this.metricCosts_;
    }

    public static b newBuilder() {
        return (b) DEFAULT_INSTANCE.createBuilder();
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream) {
        return (MetricRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t0 parser() {
        return DEFAULT_INSTANCE.getParserForType();
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

    public boolean containsMetricCosts(String str) {
        str.getClass();
        return internalGetMetricCosts().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31057a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new MetricRule();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001Ȉ\u00022", new Object[]{"selector_", "metricCosts_", c.f31058a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (MetricRule.class) {
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

    @Deprecated
    public Map<String, Long> getMetricCosts() {
        return getMetricCostsMap();
    }

    public int getMetricCostsCount() {
        return internalGetMetricCosts().size();
    }

    public Map<String, Long> getMetricCostsMap() {
        return Collections.unmodifiableMap(internalGetMetricCosts());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long getMetricCostsOrDefault(String str, long j10) {
        str.getClass();
        C3705a0 c3705a0InternalGetMetricCosts = internalGetMetricCosts();
        return c3705a0InternalGetMetricCosts.containsKey(str) ? ((Long) c3705a0InternalGetMetricCosts.get(str)).longValue() : j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long getMetricCostsOrThrow(String str) {
        str.getClass();
        C3705a0 c3705a0InternalGetMetricCosts = internalGetMetricCosts();
        if (c3705a0InternalGetMetricCosts.containsKey(str)) {
            return ((Long) c3705a0InternalGetMetricCosts.get(str)).longValue();
        }
        throw new IllegalArgumentException();
    }

    public String getSelector() {
        return this.selector_;
    }

    public AbstractC3722j getSelectorBytes() {
        return AbstractC3722j.n(this.selector_);
    }

    public static b newBuilder(MetricRule metricRule) {
        return (b) DEFAULT_INSTANCE.createBuilder(metricRule);
    }

    public static MetricRule parseDelimitedFrom(InputStream inputStream, D d10) {
        return (MetricRule) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static MetricRule parseFrom(ByteBuffer byteBuffer, D d10) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static MetricRule parseFrom(AbstractC3722j abstractC3722j) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    public static MetricRule parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static MetricRule parseFrom(byte[] bArr) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static MetricRule parseFrom(byte[] bArr, D d10) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static MetricRule parseFrom(InputStream inputStream) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static MetricRule parseFrom(InputStream inputStream, D d10) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static MetricRule parseFrom(AbstractC3724k abstractC3724k) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static MetricRule parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (MetricRule) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
