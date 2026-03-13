package com.google.firebase.perf.v1;

import com.google.protobuf.AbstractC3704a;
import com.google.protobuf.AbstractC3722j;
import com.google.protobuf.AbstractC3724k;
import com.google.protobuf.C3705a0;
import com.google.protobuf.D;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.N;
import com.google.protobuf.Q0;
import com.google.protobuf.Z;
import com.google.protobuf.t0;
import i9.e;
import i9.g;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class TraceMetric extends GeneratedMessageLite implements g {
    public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
    public static final int COUNTERS_FIELD_NUMBER = 6;
    public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
    private static final TraceMetric DEFAULT_INSTANCE;
    public static final int DURATION_US_FIELD_NUMBER = 5;
    public static final int IS_AUTO_FIELD_NUMBER = 2;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile t0 PARSER = null;
    public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
    public static final int SUBTRACES_FIELD_NUMBER = 7;
    private int bitField0_;
    private long clientStartTimeUs_;
    private long durationUs_;
    private boolean isAuto_;
    private C3705a0 counters_ = C3705a0.i();
    private C3705a0 customAttributes_ = C3705a0.i();
    private String name_ = "";
    private N.j subtraces_ = GeneratedMessageLite.emptyProtobufList();
    private N.j perfSessions_ = GeneratedMessageLite.emptyProtobufList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31886a;

        static {
            int[] iArr = new int[GeneratedMessageLite.g.values().length];
            f31886a = iArr;
            try {
                iArr[GeneratedMessageLite.g.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31886a[GeneratedMessageLite.g.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31886a[GeneratedMessageLite.g.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31886a[GeneratedMessageLite.g.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31886a[GeneratedMessageLite.g.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31886a[GeneratedMessageLite.g.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31886a[GeneratedMessageLite.g.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends GeneratedMessageLite.b implements g {
        public /* synthetic */ b(a aVar) {
            this();
        }

        public b j(Iterable iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllPerfSessions(iterable);
            return this;
        }

        public b m(Iterable iterable) {
            copyOnWrite();
            ((TraceMetric) this.instance).addAllSubtraces(iterable);
            return this;
        }

        public b n(PerfSession perfSession) {
            copyOnWrite();
            ((TraceMetric) this.instance).addPerfSessions(perfSession);
            return this;
        }

        public b o(TraceMetric traceMetric) {
            copyOnWrite();
            ((TraceMetric) this.instance).addSubtraces(traceMetric);
            return this;
        }

        public b p(Map map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().putAll(map);
            return this;
        }

        public b q(Map map) {
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().putAll(map);
            return this;
        }

        public b r(String str, long j10) {
            str.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCountersMap().put(str, Long.valueOf(j10));
            return this;
        }

        public b s(String str, String str2) {
            str.getClass();
            str2.getClass();
            copyOnWrite();
            ((TraceMetric) this.instance).getMutableCustomAttributesMap().put(str, str2);
            return this;
        }

        public b t(long j10) {
            copyOnWrite();
            ((TraceMetric) this.instance).setClientStartTimeUs(j10);
            return this;
        }

        public b u(long j10) {
            copyOnWrite();
            ((TraceMetric) this.instance).setDurationUs(j10);
            return this;
        }

        public b v(String str) {
            copyOnWrite();
            ((TraceMetric) this.instance).setName(str);
            return this;
        }

        public b() {
            super(TraceMetric.DEFAULT_INSTANCE);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f31887a = Z.d(Q0.b.STRING, "", Q0.b.INT64, 0L);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Z f31888a;

        static {
            Q0.b bVar = Q0.b.STRING;
            f31888a = Z.d(bVar, "", bVar, "");
        }
    }

    static {
        TraceMetric traceMetric = new TraceMetric();
        DEFAULT_INSTANCE = traceMetric;
        GeneratedMessageLite.registerDefaultInstance(TraceMetric.class, traceMetric);
    }

    private TraceMetric() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllPerfSessions(Iterable<? extends PerfSession> iterable) {
        ensurePerfSessionsIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.perfSessions_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSubtraces(Iterable<? extends TraceMetric> iterable) {
        ensureSubtracesIsMutable();
        AbstractC3704a.addAll((Iterable) iterable, (List) this.subtraces_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(traceMetric);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientStartTimeUs() {
        this.bitField0_ &= -5;
        this.clientStartTimeUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationUs() {
        this.bitField0_ &= -9;
        this.durationUs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAuto() {
        this.bitField0_ &= -3;
        this.isAuto_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.bitField0_ &= -2;
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPerfSessions() {
        this.perfSessions_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSubtraces() {
        this.subtraces_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensurePerfSessionsIsMutable() {
        N.j jVar = this.perfSessions_;
        if (jVar.m()) {
            return;
        }
        this.perfSessions_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    private void ensureSubtracesIsMutable() {
        N.j jVar = this.subtraces_;
        if (jVar.m()) {
            return;
        }
        this.subtraces_ = GeneratedMessageLite.mutableCopy(jVar);
    }

    public static TraceMetric getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Long> getMutableCountersMap() {
        return internalGetMutableCounters();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, String> getMutableCustomAttributesMap() {
        return internalGetMutableCustomAttributes();
    }

    private C3705a0 internalGetCounters() {
        return this.counters_;
    }

    private C3705a0 internalGetCustomAttributes() {
        return this.customAttributes_;
    }

    private C3705a0 internalGetMutableCounters() {
        if (!this.counters_.o()) {
            this.counters_ = this.counters_.r();
        }
        return this.counters_;
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

    public static TraceMetric parseDelimitedFrom(InputStream inputStream) {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void removeSubtraces(int i10) {
        ensureSubtracesIsMutable();
        this.subtraces_.remove(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientStartTimeUs(long j10) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationUs(long j10) {
        this.bitField0_ |= 8;
        this.durationUs_ = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAuto(boolean z10) {
        this.bitField0_ |= 2;
        this.isAuto_ = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.bitField0_ |= 1;
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(AbstractC3722j abstractC3722j) {
        this.name_ = abstractC3722j.J();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPerfSessions(int i10, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.set(i10, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSubtraces(int i10, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.set(i10, traceMetric);
    }

    public boolean containsCounters(String str) {
        str.getClass();
        return internalGetCounters().containsKey(str);
    }

    public boolean containsCustomAttributes(String str) {
        str.getClass();
        return internalGetCustomAttributes().containsKey(str);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.g gVar, Object obj, Object obj2) {
        t0 cVar;
        int i10 = a.f31886a[gVar.ordinal()];
        a aVar = null;
        switch (i10) {
            case 1:
                return new TraceMetric();
            case 2:
                return new b(aVar);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[]{"bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", c.f31887a, "subtraces_", TraceMetric.class, "customAttributes_", d.f31888a, "perfSessions_", PerfSession.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                t0 t0Var = PARSER;
                if (t0Var != null) {
                    return t0Var;
                }
                synchronized (TraceMetric.class) {
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
    public Map<String, Long> getCounters() {
        return getCountersMap();
    }

    public int getCountersCount() {
        return internalGetCounters().size();
    }

    public Map<String, Long> getCountersMap() {
        return Collections.unmodifiableMap(internalGetCounters());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long getCountersOrDefault(String str, long j10) {
        str.getClass();
        C3705a0 c3705a0InternalGetCounters = internalGetCounters();
        return c3705a0InternalGetCounters.containsKey(str) ? ((Long) c3705a0InternalGetCounters.get(str)).longValue() : j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public long getCountersOrThrow(String str) {
        str.getClass();
        C3705a0 c3705a0InternalGetCounters = internalGetCounters();
        if (c3705a0InternalGetCounters.containsKey(str)) {
            return ((Long) c3705a0InternalGetCounters.get(str)).longValue();
        }
        throw new IllegalArgumentException();
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

    public long getDurationUs() {
        return this.durationUs_;
    }

    public boolean getIsAuto() {
        return this.isAuto_;
    }

    public String getName() {
        return this.name_;
    }

    public AbstractC3722j getNameBytes() {
        return AbstractC3722j.n(this.name_);
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

    public e getPerfSessionsOrBuilder(int i10) {
        return (e) this.perfSessions_.get(i10);
    }

    public List<? extends e> getPerfSessionsOrBuilderList() {
        return this.perfSessions_;
    }

    public TraceMetric getSubtraces(int i10) {
        return (TraceMetric) this.subtraces_.get(i10);
    }

    public int getSubtracesCount() {
        return this.subtraces_.size();
    }

    public List<TraceMetric> getSubtracesList() {
        return this.subtraces_;
    }

    public g getSubtracesOrBuilder(int i10) {
        return (g) this.subtraces_.get(i10);
    }

    public List<? extends g> getSubtracesOrBuilderList() {
        return this.subtraces_;
    }

    public boolean hasClientStartTimeUs() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDurationUs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAuto() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasName() {
        return (this.bitField0_ & 1) != 0;
    }

    public static b newBuilder(TraceMetric traceMetric) {
        return (b) DEFAULT_INSTANCE.createBuilder(traceMetric);
    }

    public static TraceMetric parseDelimitedFrom(InputStream inputStream, D d10) {
        return (TraceMetric) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static TraceMetric parseFrom(ByteBuffer byteBuffer, D d10) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, d10);
    }

    public static TraceMetric parseFrom(AbstractC3722j abstractC3722j) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addPerfSessions(int i10, PerfSession perfSession) {
        perfSession.getClass();
        ensurePerfSessionsIsMutable();
        this.perfSessions_.add(i10, perfSession);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSubtraces(int i10, TraceMetric traceMetric) {
        traceMetric.getClass();
        ensureSubtracesIsMutable();
        this.subtraces_.add(i10, traceMetric);
    }

    public static TraceMetric parseFrom(AbstractC3722j abstractC3722j, D d10) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3722j, d10);
    }

    public static TraceMetric parseFrom(byte[] bArr) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TraceMetric parseFrom(byte[] bArr, D d10) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, d10);
    }

    public static TraceMetric parseFrom(InputStream inputStream) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TraceMetric parseFrom(InputStream inputStream, D d10) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, d10);
    }

    public static TraceMetric parseFrom(AbstractC3724k abstractC3724k) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k);
    }

    public static TraceMetric parseFrom(AbstractC3724k abstractC3724k, D d10) {
        return (TraceMetric) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, abstractC3724k, d10);
    }
}
