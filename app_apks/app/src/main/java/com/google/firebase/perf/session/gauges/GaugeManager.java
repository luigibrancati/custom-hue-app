package com.google.firebase.perf.session.gauges;

import O8.b;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import b9.C2898a;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.l;
import com.google.firebase.perf.v1.AndroidMemoryReading;
import com.google.firebase.perf.v1.CpuMetricReading;
import com.google.firebase.perf.v1.GaugeMetadata;
import com.google.firebase.perf.v1.GaugeMetric;
import f9.C4003a;
import g9.C4163c;
import g9.C4169i;
import g9.C4172l;
import h9.k;
import i9.EnumC4369b;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import o8.w;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private EnumC4369b applicationProcessState;
    private final Y8.a configResolver;
    private final w cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final w gaugeManagerExecutor;
    private C4169i gaugeMetadataManager;
    private final w memoryGaugeCollector;
    private String sessionId;
    private final k transportManager;
    private static final C2898a logger = C2898a.e();
    private static final GaugeManager instance = new GaugeManager();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31847a;

        static {
            int[] iArr = new int[EnumC4369b.values().length];
            f31847a = iArr;
            try {
                iArr[EnumC4369b.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31847a[EnumC4369b.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new w(new b() { // from class: g9.f
            @Override // O8.b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), k.k(), Y8.a.g(), null, new w(new b() { // from class: g9.g
            @Override // O8.b
            public final Object get() {
                return GaugeManager.c();
            }
        }), new w(new b() { // from class: g9.h
            @Override // O8.b
            public final Object get() {
                return GaugeManager.b();
            }
        }));
    }

    public static /* synthetic */ C4172l b() {
        return new C4172l();
    }

    public static /* synthetic */ C4163c c() {
        return new C4163c();
    }

    private long getCpuGaugeCollectionFrequencyMs(EnumC4369b enumC4369b) {
        int i10 = a.f31847a[enumC4369b.ordinal()];
        long jZ = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.z() : this.configResolver.y();
        if (C4163c.f(jZ)) {
            return -1L;
        }
        return jZ;
    }

    private GaugeMetadata getGaugeMetadata() {
        return (GaugeMetadata) GaugeMetadata.newBuilder().j(this.gaugeMetadataManager.a()).m(this.gaugeMetadataManager.b()).n(this.gaugeMetadataManager.c()).build();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(EnumC4369b enumC4369b) {
        int i10 = a.f31847a[enumC4369b.ordinal()];
        long jC = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.C() : this.configResolver.B();
        if (C4172l.e(jC)) {
            return -1L;
        }
        return jC;
    }

    private boolean startCollectingCpuMetrics(long j10, l lVar) {
        if (j10 == -1) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        ((C4163c) this.cpuGaugeCollector.get()).i(j10, lVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, l lVar) {
        if (j10 == -1) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        ((C4172l) this.memoryGaugeCollector.get()).h(j10, lVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void syncFlush(String str, EnumC4369b enumC4369b) {
        GaugeMetric.b bVarNewBuilder = GaugeMetric.newBuilder();
        while (!((C4163c) this.cpuGaugeCollector.get()).f35541a.isEmpty()) {
            bVarNewBuilder.m((CpuMetricReading) ((C4163c) this.cpuGaugeCollector.get()).f35541a.poll());
        }
        while (!((C4172l) this.memoryGaugeCollector.get()).f35564b.isEmpty()) {
            bVarNewBuilder.j((AndroidMemoryReading) ((C4172l) this.memoryGaugeCollector.get()).f35564b.poll());
        }
        bVarNewBuilder.o(str);
        this.transportManager.v((GaugeMetric) bVarNewBuilder.build(), enumC4369b);
    }

    public void collectGaugeMetricOnce(l lVar) {
        collectGaugeMetricOnce((C4163c) this.cpuGaugeCollector.get(), (C4172l) this.memoryGaugeCollector.get(), lVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new C4169i(context);
    }

    public boolean logGaugeMetadata(String str, EnumC4369b enumC4369b) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.v((GaugeMetric) GaugeMetric.newBuilder().o(str).n(getGaugeMetadata()).build(), enumC4369b);
        return true;
    }

    public void startCollectingGauges(C4003a c4003a, final EnumC4369b enumC4369b) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(enumC4369b, c4003a.d());
        if (jStartCollectingGauges == -1) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strH = c4003a.h();
        this.sessionId = strH;
        this.applicationProcessState = enumC4369b;
        try {
            long j10 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new Runnable() { // from class: g9.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35550a.syncFlush(strH, enumC4369b);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final EnumC4369b enumC4369b = this.applicationProcessState;
        ((C4163c) this.cpuGaugeCollector.get()).j();
        ((C4172l) this.memoryGaugeCollector.get()).i();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new Runnable() { // from class: g9.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f35547a.syncFlush(str, enumC4369b);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = EnumC4369b.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(C4163c c4163c, C4172l c4172l, l lVar) {
        c4163c.c(lVar);
        c4172l.c(lVar);
    }

    public GaugeManager(w wVar, k kVar, Y8.a aVar, C4169i c4169i, w wVar2, w wVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = EnumC4369b.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = wVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = c4169i;
        this.cpuGaugeCollector = wVar2;
        this.memoryGaugeCollector = wVar3;
    }

    private long startCollectingGauges(EnumC4369b enumC4369b, l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(enumC4369b);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(enumC4369b);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar) ? cpuGaugeCollectionFrequencyMs == -1 ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
