package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import io.sentry.DateUtils;
import io.sentry.ILogger;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ITransaction;
import io.sentry.ITransactionProfiler;
import io.sentry.PerformanceCollectionData;
import io.sentry.ProfilingTraceData;
import io.sentry.ProfilingTransactionData;
import io.sentry.ScopesAdapter;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.core.AndroidProfiler;
import io.sentry.android.core.internal.util.CpuInfoUtils;
import io.sentry.android.core.internal.util.SentryFrameMetricsCollector;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.WebrtcBuildVersion;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
final class AndroidTransactionProfiler implements ITransactionProfiler {
    private final BuildInfoProvider buildInfoProvider;
    private final Context context;
    private volatile ProfilingTransactionData currentProfilingTransactionData;
    private final ISentryExecutorService executorService;
    private final SentryFrameMetricsCollector frameMetricsCollector;
    private boolean isInitialized;
    private final boolean isProfilingEnabled;
    private final AtomicBoolean isRunning;
    private final AutoClosableReentrantLock lock;
    private final ILogger logger;
    private long profileStartCpuMillis;
    private long profileStartNanos;
    private Date profileStartTimestamp;
    private volatile AndroidProfiler profiler;
    private final String profilingTracesDirPath;
    private final int profilingTracesHz;

    public AndroidTransactionProfiler(Context context, SentryAndroidOptions sentryAndroidOptions, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector) {
        this(context, buildInfoProvider, sentryFrameMetricsCollector, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getProfilingTracesDirPath(), sentryAndroidOptions.isProfilingEnabled(), sentryAndroidOptions.getProfilingTracesHz(), sentryAndroidOptions.getExecutorService());
    }

    private void init() {
        if (this.isInitialized) {
            return;
        }
        this.isInitialized = true;
        if (!this.isProfilingEnabled) {
            this.logger.log(SentryLevel.INFO, "Profiling is disabled in options.", new Object[0]);
            return;
        }
        String str = this.profilingTracesDirPath;
        if (str == null) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because no profiling traces dir path is defined in options.", new Object[0]);
            return;
        }
        int i10 = this.profilingTracesHz;
        if (i10 <= 0) {
            this.logger.log(SentryLevel.WARNING, "Disabling profiling because trace rate is set to %d", Integer.valueOf(i10));
        } else {
            this.profiler = new AndroidProfiler(str, ((int) TimeUnit.SECONDS.toMicros(1L)) / this.profilingTracesHz, this.frameMetricsCollector, this.executorService, this.logger);
        }
    }

    @SuppressLint({"NewApi"})
    private boolean onFirstStart() {
        AndroidProfiler.ProfileStartData profileStartDataStart;
        if (this.profiler == null || (profileStartDataStart = this.profiler.start()) == null) {
            return false;
        }
        this.profileStartNanos = profileStartDataStart.startNanos;
        this.profileStartCpuMillis = profileStartDataStart.startCpuMillis;
        this.profileStartTimestamp = profileStartDataStart.startTimestamp;
        return true;
    }

    @Override // io.sentry.ITransactionProfiler
    public void bindTransaction(ITransaction iTransaction) {
        if (this.isRunning.get() && this.currentProfilingTransactionData == null) {
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                if (this.isRunning.get() && this.currentProfilingTransactionData == null) {
                    this.currentProfilingTransactionData = new ProfilingTransactionData(iTransaction, Long.valueOf(this.profileStartNanos), Long.valueOf(this.profileStartCpuMillis));
                }
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public void close() {
        AndroidTransactionProfiler androidTransactionProfiler;
        ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
        if (profilingTransactionData != null) {
            androidTransactionProfiler = this;
            androidTransactionProfiler.onTransactionFinish(profilingTransactionData.getName(), profilingTransactionData.getId(), profilingTransactionData.getTraceId(), true, null, ScopesAdapter.getInstance().getOptions());
        } else {
            androidTransactionProfiler = this;
        }
        androidTransactionProfiler.isRunning.set(false);
        if (androidTransactionProfiler.profiler != null) {
            androidTransactionProfiler.profiler.close();
        }
    }

    @Override // io.sentry.ITransactionProfiler
    public boolean isRunning() {
        return this.isRunning.get();
    }

    @Override // io.sentry.ITransactionProfiler
    public ProfilingTraceData onTransactionFinish(ITransaction iTransaction, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        return onTransactionFinish(iTransaction.getName(), iTransaction.getEventId().toString(), iTransaction.getSpanContext().getTraceId().toString(), false, list, sentryOptions);
    }

    @Override // io.sentry.ITransactionProfiler
    public void start() {
        if (this.buildInfoProvider.getSdkInfoVersion() >= 22 && !this.isRunning.getAndSet(true)) {
            init();
            if (onFirstStart()) {
                this.logger.log(SentryLevel.DEBUG, "Profiler started.", new Object[0]);
                return;
            }
            if (this.profiler != null && this.profiler.isRunning()) {
                this.logger.log(SentryLevel.WARNING, "A profile is already running. This profile will be ignored.", new Object[0]);
                return;
            }
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
            try {
                this.currentProfilingTransactionData = null;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                this.isRunning.set(false);
            } catch (Throwable th) {
                if (iSentryLifecycleTokenAcquire != null) {
                    try {
                        iSentryLifecycleTokenAcquire.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        }
    }

    @SuppressLint({"NewApi"})
    private ProfilingTraceData onTransactionFinish(String str, String str2, String str3, boolean z10, List<PerformanceCollectionData> list, SentryOptions sentryOptions) {
        String string;
        String str4;
        if (this.buildInfoProvider.getSdkInfoVersion() < 22 || this.profiler == null) {
            return null;
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ProfilingTransactionData profilingTransactionData = this.currentProfilingTransactionData;
            if (profilingTransactionData != null && profilingTransactionData.getId().equals(str2)) {
                this.currentProfilingTransactionData = null;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                }
                this.logger.log(SentryLevel.DEBUG, "Transaction %s (%s) finished.", str, str3);
                AndroidProfiler.ProfileEndData profileEndDataEndAndCollect = this.profiler.endAndCollect(false, list);
                this.isRunning.set(false);
                if (profileEndDataEndAndCollect == null) {
                    return null;
                }
                long j10 = profileEndDataEndAndCollect.endNanos - this.profileStartNanos;
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(profilingTransactionData);
                profilingTransactionData.notifyFinish(Long.valueOf(profileEndDataEndAndCollect.endNanos), Long.valueOf(this.profileStartNanos), Long.valueOf(profileEndDataEndAndCollect.endCpuMillis), Long.valueOf(this.profileStartCpuMillis));
                Long totalMemory = sentryOptions instanceof SentryAndroidOptions ? DeviceInfoUtil.getInstance(this.context, (SentryAndroidOptions) sentryOptions).getTotalMemory() : null;
                if (totalMemory != null) {
                    string = Long.toString(totalMemory.longValue());
                } else {
                    string = WebrtcBuildVersion.maint_version;
                }
                String str5 = string;
                String[] strArr = Build.SUPPORTED_ABIS;
                File file = profileEndDataEndAndCollect.traceFile;
                Date date = this.profileStartTimestamp;
                String string2 = Long.toString(j10);
                int sdkInfoVersion = this.buildInfoProvider.getSdkInfoVersion();
                String str6 = (strArr == null || strArr.length <= 0) ? "" : strArr[0];
                Callable callable = new Callable() { // from class: io.sentry.android.core.A
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return CpuInfoUtils.getInstance().readMaxFrequencies();
                    }
                };
                String manufacturer = this.buildInfoProvider.getManufacturer();
                String model = this.buildInfoProvider.getModel();
                String versionRelease = this.buildInfoProvider.getVersionRelease();
                Boolean boolIsEmulator = this.buildInfoProvider.isEmulator();
                String proguardUuid = sentryOptions.getProguardUuid();
                String release = sentryOptions.getRelease();
                String environment = sentryOptions.getEnvironment();
                if (!profileEndDataEndAndCollect.didTimeout && !z10) {
                    str4 = ProfilingTraceData.TRUNCATION_REASON_NORMAL;
                } else {
                    str4 = ProfilingTraceData.TRUNCATION_REASON_TIMEOUT;
                }
                return new ProfilingTraceData(file, date, arrayList, str, str2, str3, string2, sdkInfoVersion, str6, callable, manufacturer, model, versionRelease, boolIsEmulator, str5, proguardUuid, release, environment, str4, profileEndDataEndAndCollect.measurementsMap);
            }
            this.logger.log(SentryLevel.INFO, "Transaction %s (%s) finished, but was not currently being profiled. Skipping", str, str3);
            if (iSentryLifecycleTokenAcquire != null) {
                iSentryLifecycleTokenAcquire.close();
            }
            return null;
        } finally {
        }
    }

    public AndroidTransactionProfiler(Context context, BuildInfoProvider buildInfoProvider, SentryFrameMetricsCollector sentryFrameMetricsCollector, ILogger iLogger, String str, boolean z10, int i10, ISentryExecutorService iSentryExecutorService) {
        this.isInitialized = false;
        this.isRunning = new AtomicBoolean(false);
        this.profiler = null;
        this.lock = new AutoClosableReentrantLock();
        this.context = (Context) Objects.requireNonNull(ContextUtils.getApplicationContext(context), "The application context is required");
        this.logger = (ILogger) Objects.requireNonNull(iLogger, "ILogger is required");
        this.frameMetricsCollector = (SentryFrameMetricsCollector) Objects.requireNonNull(sentryFrameMetricsCollector, "SentryFrameMetricsCollector is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "The BuildInfoProvider is required.");
        this.profilingTracesDirPath = str;
        this.isProfilingEnabled = z10;
        this.profilingTracesHz = i10;
        this.executorService = (ISentryExecutorService) Objects.requireNonNull(iSentryExecutorService, "The ISentryExecutorService is required.");
        this.profileStartTimestamp = DateUtils.getCurrentDateTime();
    }
}
