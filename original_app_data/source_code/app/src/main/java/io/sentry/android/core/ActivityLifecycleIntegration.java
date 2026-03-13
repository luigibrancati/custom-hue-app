package io.sentry.android.core;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import io.sentry.FullyDisplayedReporter;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryLifecycleToken;
import io.sentry.ISpan;
import io.sentry.ITransaction;
import io.sentry.Instrumenter;
import io.sentry.Integration;
import io.sentry.MeasurementUnit;
import io.sentry.NoOpTransaction;
import io.sentry.Scope;
import io.sentry.ScopeCallback;
import io.sentry.SentryDate;
import io.sentry.SentryLevel;
import io.sentry.SentryNanotimeDate;
import io.sentry.SentryOptions;
import io.sentry.SpanOptions;
import io.sentry.SpanStatus;
import io.sentry.TracesSamplingDecision;
import io.sentry.TransactionContext;
import io.sentry.TransactionFinishedCallback;
import io.sentry.TransactionOptions;
import io.sentry.android.core.internal.util.ClassUtil;
import io.sentry.android.core.internal.util.FirstDrawDoneListener;
import io.sentry.android.core.performance.ActivityLifecycleSpanHelper;
import io.sentry.android.core.performance.AppStartMetrics;
import io.sentry.android.core.performance.TimeSpan;
import io.sentry.protocol.MeasurementValue;
import io.sentry.protocol.TransactionNameSource;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Objects;
import io.sentry.util.TracingUtils;
import java.io.Closeable;
import java.lang.ref.WeakReference;
import java.util.Date;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class ActivityLifecycleIntegration implements Integration, Closeable, Application.ActivityLifecycleCallbacks {
    static final String APP_START_COLD = "app.start.cold";
    static final String APP_START_WARM = "app.start.warm";
    private static final String TRACE_ORIGIN = "auto.ui.activity";
    static final String TTFD_OP = "ui.load.full_display";
    static final long TTFD_TIMEOUT_MILLIS = 25000;
    static final String TTID_OP = "ui.load.initial_display";
    static final String UI_LOAD_OP = "ui.load";
    private final ActivityFramesTracker activityFramesTracker;
    private ISpan appStartSpan;
    private final Application application;
    private final BuildInfoProvider buildInfoProvider;
    private boolean isAllActivityCallbacksAvailable;
    private SentryAndroidOptions options;
    private IScopes scopes;
    private boolean performanceEnabled = false;
    private boolean timeToFullDisplaySpanEnabled = false;
    private boolean firstActivityCreated = false;
    private FullyDisplayedReporter fullyDisplayedReporter = null;
    private final WeakHashMap<Activity, ISpan> ttidSpanMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, ISpan> ttfdSpanMap = new WeakHashMap<>();
    private final WeakHashMap<Activity, ActivityLifecycleSpanHelper> activitySpanHelpers = new WeakHashMap<>();
    private SentryDate lastPausedTime = new SentryNanotimeDate(new Date(0), 0);
    private Future<?> ttfdAutoCloseFuture = null;
    private final WeakHashMap<Activity, ITransaction> activitiesWithOngoingTransactions = new WeakHashMap<>();
    private final AutoClosableReentrantLock lock = new AutoClosableReentrantLock();
    private boolean fullyDisplayedCalled = false;
    private final AutoClosableReentrantLock fullyDisplayedLock = new AutoClosableReentrantLock();

    public ActivityLifecycleIntegration(Application application, BuildInfoProvider buildInfoProvider, ActivityFramesTracker activityFramesTracker) {
        this.application = (Application) Objects.requireNonNull(application, "Application is required");
        this.buildInfoProvider = (BuildInfoProvider) Objects.requireNonNull(buildInfoProvider, "BuildInfoProvider is required");
        this.activityFramesTracker = (ActivityFramesTracker) Objects.requireNonNull(activityFramesTracker, "ActivityFramesTracker is required");
        if (buildInfoProvider.getSdkInfoVersion() >= 29) {
            this.isAllActivityCallbacksAvailable = true;
        }
    }

    private void cancelTtfdAutoClose() {
        Future<?> future = this.ttfdAutoCloseFuture;
        if (future != null) {
            future.cancel(false);
            this.ttfdAutoCloseFuture = null;
        }
    }

    private void clear() {
        this.firstActivityCreated = false;
        this.lastPausedTime = new SentryNanotimeDate(new Date(0L), 0L);
        this.activitySpanHelpers.clear();
    }

    public static /* synthetic */ void f(ActivityLifecycleIntegration activityLifecycleIntegration, IScope iScope, ITransaction iTransaction, ITransaction iTransaction2) {
        if (iTransaction2 == null) {
            activityLifecycleIntegration.getClass();
            iScope.setTransaction(iTransaction);
        } else {
            SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.options;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", iTransaction.getName());
            }
        }
    }

    private void finishAppStartSpan() {
        SentryDate projectedStopTimestamp = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options).getProjectedStopTimestamp();
        if (!this.performanceEnabled || projectedStopTimestamp == null) {
            return;
        }
        finishSpan(this.appStartSpan, projectedStopTimestamp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishExceededTtfdSpan(ISpan iSpan, ISpan iSpan2) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.setDescription(getExceededTtfdDesc(iSpan));
        SentryDate finishDate = iSpan2 != null ? iSpan2.getFinishDate() : null;
        if (finishDate == null) {
            finishDate = iSpan.getStartDate();
        }
        finishSpan(iSpan, finishDate, SpanStatus.DEADLINE_EXCEEDED);
    }

    private void finishSpan(ISpan iSpan) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.finish();
    }

    private void finishTransaction(final ITransaction iTransaction, ISpan iSpan, ISpan iSpan2) {
        if (iTransaction == null || iTransaction.isFinished()) {
            return;
        }
        finishSpan(iSpan, SpanStatus.DEADLINE_EXCEEDED);
        finishExceededTtfdSpan(iSpan2, iSpan);
        cancelTtfdAutoClose();
        SpanStatus status = iTransaction.getStatus();
        if (status == null) {
            status = SpanStatus.OK;
        }
        iTransaction.finish(status);
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.q
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    this.f38611a.clearScope(iScope, iTransaction);
                }
            });
        }
    }

    private String getActivityName(Activity activity) {
        return activity.getClass().getSimpleName();
    }

    private String getAppStartDesc(boolean z10) {
        return z10 ? "Cold Start" : "Warm Start";
    }

    private String getAppStartOp(boolean z10) {
        return z10 ? APP_START_COLD : APP_START_WARM;
    }

    private String getExceededTtfdDesc(ISpan iSpan) {
        String description = iSpan.getDescription();
        if (description != null && description.endsWith(" - Deadline Exceeded")) {
            return description;
        }
        return iSpan.getDescription() + " - Deadline Exceeded";
    }

    private String getTtfdDesc(String str) {
        return str + " full display";
    }

    private String getTtidDesc(String str) {
        return str + " initial display";
    }

    public static /* synthetic */ void i(ActivityLifecycleIntegration activityLifecycleIntegration, WeakReference weakReference, String str, ITransaction iTransaction) {
        activityLifecycleIntegration.getClass();
        Activity activity = (Activity) weakReference.get();
        if (activity != null) {
            activityLifecycleIntegration.activityFramesTracker.setMetrics(activity, iTransaction.getEventId());
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = activityLifecycleIntegration.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.WARNING, "Unable to track activity frames as the Activity %s has been destroyed.", str);
        }
    }

    private boolean isPerformanceEnabled(SentryAndroidOptions sentryAndroidOptions) {
        return sentryAndroidOptions.isTracingEnabled() && sentryAndroidOptions.isEnableAutoActivityLifecycleTracing();
    }

    private boolean isRunningTransactionOrTrace(Activity activity) {
        return this.activitiesWithOngoingTransactions.containsKey(activity);
    }

    public static /* synthetic */ void j(ITransaction iTransaction, IScope iScope, ITransaction iTransaction2) {
        if (iTransaction2 == iTransaction) {
            iScope.clearTransaction();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFirstFrameDrawn(ISpan iSpan, ISpan iSpan2) {
        AppStartMetrics appStartMetrics = AppStartMetrics.getInstance();
        TimeSpan appStartTimeSpan = appStartMetrics.getAppStartTimeSpan();
        TimeSpan sdkInitTimeSpan = appStartMetrics.getSdkInitTimeSpan();
        if (appStartTimeSpan.hasStarted() && appStartTimeSpan.hasNotStopped()) {
            appStartTimeSpan.stop();
        }
        if (sdkInitTimeSpan.hasStarted() && sdkInitTimeSpan.hasNotStopped()) {
            sdkInitTimeSpan.stop();
        }
        finishAppStartSpan();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.fullyDisplayedLock.acquire();
        try {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions == null || iSpan2 == null) {
                finishSpan(iSpan2);
                if (this.fullyDisplayedCalled) {
                    finishSpan(iSpan);
                }
            } else {
                SentryDate sentryDateNow = sentryAndroidOptions.getDateProvider().now();
                long millis = TimeUnit.NANOSECONDS.toMillis(sentryDateNow.diff(iSpan2.getStartDate()));
                Long lValueOf = Long.valueOf(millis);
                MeasurementUnit.Duration duration = MeasurementUnit.Duration.MILLISECOND;
                iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_INITIAL_DISPLAY, lValueOf, duration);
                if (iSpan != null && this.fullyDisplayedCalled) {
                    this.fullyDisplayedCalled = false;
                    iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(millis), duration);
                    iSpan.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(millis), duration);
                    finishSpan(iSpan, sentryDateNow);
                }
                finishSpan(iSpan2, sentryDateNow);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullFrameDrawn(ISpan iSpan, ISpan iSpan2) {
        cancelTtfdAutoClose();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.fullyDisplayedLock.acquire();
        try {
            if (!iSpan.isFinished()) {
                this.fullyDisplayedCalled = true;
                if (iSentryLifecycleTokenAcquire != null) {
                    iSentryLifecycleTokenAcquire.close();
                    return;
                }
                return;
            }
            SentryAndroidOptions sentryAndroidOptions = this.options;
            if (sentryAndroidOptions != null) {
                SentryDate sentryDateNow = sentryAndroidOptions.getDateProvider().now();
                iSpan2.setMeasurement(MeasurementValue.KEY_TIME_TO_FULL_DISPLAY, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(sentryDateNow.diff(iSpan2.getStartDate()))), MeasurementUnit.Duration.MILLISECOND);
                finishSpan(iSpan2, sentryDateNow);
            } else {
                finishSpan(iSpan2);
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

    private void setSpanOrigin(SpanOptions spanOptions) {
        spanOptions.setOrigin(TRACE_ORIGIN);
    }

    private void startTracing(Activity activity) {
        Boolean boolValueOf;
        SentryDate sentryDate;
        SentryDate sentryDate2;
        final ITransaction iTransaction;
        SpanOptions spanOptions;
        final WeakReference weakReference = new WeakReference(activity);
        if (this.scopes == null || isRunningTransactionOrTrace(activity)) {
            return;
        }
        if (!this.performanceEnabled) {
            this.activitiesWithOngoingTransactions.put(activity, NoOpTransaction.getInstance());
            if (this.options.isEnableAutoTraceIdGeneration()) {
                TracingUtils.startNewTrace(this.scopes);
                return;
            }
            return;
        }
        stopPreviousTransactions();
        final String activityName = getActivityName(activity);
        TimeSpan appStartTimeSpanWithFallback = AppStartMetrics.getInstance().getAppStartTimeSpanWithFallback(this.options);
        TracesSamplingDecision tracesSamplingDecision = null;
        if (ContextUtils.isForegroundImportance() && appStartTimeSpanWithFallback.hasStarted()) {
            SentryDate startTimestamp = appStartTimeSpanWithFallback.getStartTimestamp();
            boolValueOf = Boolean.valueOf(AppStartMetrics.getInstance().getAppStartType() == AppStartMetrics.AppStartType.COLD);
            sentryDate = startTimestamp;
        } else {
            boolValueOf = null;
            sentryDate = null;
        }
        TransactionOptions transactionOptions = new TransactionOptions();
        long deadlineTimeout = this.options.getDeadlineTimeout();
        transactionOptions.setDeadlineTimeout(deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout));
        if (this.options.isEnableActivityLifecycleTracingAutoFinish()) {
            transactionOptions.setIdleTimeout(this.options.getIdleTimeout());
            transactionOptions.setTrimEnd(true);
        }
        transactionOptions.setWaitForChildren(true);
        transactionOptions.setTransactionFinishedCallback(new TransactionFinishedCallback() { // from class: io.sentry.android.core.j
            @Override // io.sentry.TransactionFinishedCallback
            public final void execute(ITransaction iTransaction2) {
                ActivityLifecycleIntegration.i(this.f38578a, weakReference, activityName, iTransaction2);
            }
        });
        if (this.firstActivityCreated || sentryDate == null || boolValueOf == null) {
            sentryDate2 = this.lastPausedTime;
        } else {
            TracesSamplingDecision appStartSamplingDecision = AppStartMetrics.getInstance().getAppStartSamplingDecision();
            AppStartMetrics.getInstance().setAppStartSamplingDecision(null);
            tracesSamplingDecision = appStartSamplingDecision;
            sentryDate2 = sentryDate;
        }
        transactionOptions.setStartTimestamp(sentryDate2);
        transactionOptions.setAppStartTransaction(tracesSamplingDecision != null);
        setSpanOrigin(transactionOptions);
        ITransaction iTransactionStartTransaction = this.scopes.startTransaction(new TransactionContext(activityName, TransactionNameSource.COMPONENT, UI_LOAD_OP, tracesSamplingDecision), transactionOptions);
        SpanOptions spanOptions2 = new SpanOptions();
        setSpanOrigin(spanOptions2);
        if (this.firstActivityCreated || sentryDate == null || boolValueOf == null) {
            iTransaction = iTransactionStartTransaction;
            spanOptions = spanOptions2;
        } else {
            iTransaction = iTransactionStartTransaction;
            spanOptions = spanOptions2;
            this.appStartSpan = iTransaction.startChild(getAppStartOp(boolValueOf.booleanValue()), getAppStartDesc(boolValueOf.booleanValue()), sentryDate, Instrumenter.SENTRY, spanOptions2);
            finishAppStartSpan();
        }
        String ttidDesc = getTtidDesc(activityName);
        Instrumenter instrumenter = Instrumenter.SENTRY;
        SentryDate sentryDate3 = sentryDate2;
        final ISpan iSpanStartChild = iTransaction.startChild(TTID_OP, ttidDesc, sentryDate3, instrumenter, spanOptions);
        this.ttidSpanMap.put(activity, iSpanStartChild);
        if (this.timeToFullDisplaySpanEnabled && this.fullyDisplayedReporter != null && this.options != null) {
            final ISpan iSpanStartChild2 = iTransaction.startChild(TTFD_OP, getTtfdDesc(activityName), sentryDate3, instrumenter, spanOptions);
            try {
                this.ttfdSpanMap.put(activity, iSpanStartChild2);
                this.ttfdAutoCloseFuture = this.options.getExecutorService().schedule(new Runnable() { // from class: io.sentry.android.core.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f38582a.finishExceededTtfdSpan(iSpanStartChild2, iSpanStartChild);
                    }
                }, TTFD_TIMEOUT_MILLIS);
            } catch (RejectedExecutionException e10) {
                this.options.getLogger().log(SentryLevel.ERROR, "Failed to call the executor. Time to full display span will not be finished automatically. Did you call Sentry.close()?", e10);
            }
        }
        this.scopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.l
            @Override // io.sentry.ScopeCallback
            public final void run(IScope iScope) {
                this.f38587a.applyScope(iScope, iTransaction);
            }
        });
        this.activitiesWithOngoingTransactions.put(activity, iTransaction);
    }

    private void stopPreviousTransactions() {
        for (Map.Entry<Activity, ITransaction> entry : this.activitiesWithOngoingTransactions.entrySet()) {
            finishTransaction(entry.getValue(), this.ttidSpanMap.get(entry.getKey()), this.ttfdSpanMap.get(entry.getKey()));
        }
    }

    private void stopTracing(Activity activity, boolean z10) {
        if (this.performanceEnabled && z10) {
            finishTransaction(this.activitiesWithOngoingTransactions.get(activity), null, null);
        }
    }

    public void applyScope(final IScope iScope, final ITransaction iTransaction) {
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.r
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction2) {
                ActivityLifecycleIntegration.f(this.f38613a, iScope, iTransaction, iTransaction2);
            }
        });
    }

    public void clearScope(final IScope iScope, final ITransaction iTransaction) {
        iScope.withTransaction(new Scope.IWithTransaction() { // from class: io.sentry.android.core.i
            @Override // io.sentry.Scope.IWithTransaction
            public final void accept(ITransaction iTransaction2) {
                ActivityLifecycleIntegration.j(iTransaction, iScope, iTransaction2);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.application.unregisterActivityLifecycleCallbacks(this);
        SentryAndroidOptions sentryAndroidOptions = this.options;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration removed.", new Object[0]);
        }
        this.activityFramesTracker.stop();
    }

    public WeakHashMap<Activity, ITransaction> getActivitiesWithOngoingTransactions() {
        return this.activitiesWithOngoingTransactions;
    }

    public ActivityFramesTracker getActivityFramesTracker() {
        return this.activityFramesTracker;
    }

    public WeakHashMap<Activity, ActivityLifecycleSpanHelper> getActivitySpanHelpers() {
        return this.activitySpanHelpers;
    }

    public ISpan getAppStartSpan() {
        return this.appStartSpan;
    }

    public WeakHashMap<Activity, ISpan> getTtfdSpanMap() {
        return this.ttfdSpanMap;
    }

    public WeakHashMap<Activity, ISpan> getTtidSpanMap() {
        return this.ttidSpanMap;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        FullyDisplayedReporter fullyDisplayedReporter;
        SentryAndroidOptions sentryAndroidOptions;
        if (!this.isAllActivityCallbacksAvailable) {
            onActivityPreCreated(activity, bundle);
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.scopes != null && (sentryAndroidOptions = this.options) != null && sentryAndroidOptions.isEnableScreenTracking()) {
                final String className = ClassUtil.getClassName(activity);
                this.scopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.core.m
                    @Override // io.sentry.ScopeCallback
                    public final void run(IScope iScope) {
                        iScope.setScreen(className);
                    }
                });
            }
            startTracing(activity);
            final ISpan iSpan = this.ttidSpanMap.get(activity);
            final ISpan iSpan2 = this.ttfdSpanMap.get(activity);
            this.firstActivityCreated = true;
            if (this.performanceEnabled && iSpan != null && iSpan2 != null && (fullyDisplayedReporter = this.fullyDisplayedReporter) != null) {
                fullyDisplayedReporter.registerFullyDrawnListener(new FullyDisplayedReporter.FullyDisplayedReporterListener() { // from class: io.sentry.android.core.n
                    @Override // io.sentry.FullyDisplayedReporter.FullyDisplayedReporterListener
                    public final void onFullyDrawn() {
                        this.f38591a.onFullFrameDrawn(iSpan, iSpan2);
                    }
                });
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            ActivityLifecycleSpanHelper activityLifecycleSpanHelperRemove = this.activitySpanHelpers.remove(activity);
            if (activityLifecycleSpanHelperRemove != null) {
                activityLifecycleSpanHelperRemove.clear();
            }
            if (this.performanceEnabled) {
                finishSpan(this.appStartSpan, SpanStatus.CANCELLED);
                ISpan iSpan = this.ttidSpanMap.get(activity);
                ISpan iSpan2 = this.ttfdSpanMap.get(activity);
                finishSpan(iSpan, SpanStatus.DEADLINE_EXCEEDED);
                finishExceededTtfdSpan(iSpan2, iSpan);
                cancelTtfdAutoClose();
                stopTracing(activity, true);
                this.appStartSpan = null;
                this.ttidSpanMap.remove(activity);
                this.ttfdSpanMap.remove(activity);
            }
            this.activitiesWithOngoingTransactions.remove(activity);
            if (this.activitiesWithOngoingTransactions.isEmpty() && !activity.isChangingConfigurations()) {
                clear();
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isAllActivityCallbacksAvailable) {
                onActivityPrePaused(activity);
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = this.activitySpanHelpers.get(activity);
        if (activityLifecycleSpanHelper != null) {
            ITransaction iTransaction = this.appStartSpan;
            if (iTransaction == null) {
                iTransaction = this.activitiesWithOngoingTransactions.get(activity);
            }
            activityLifecycleSpanHelper.createAndStopOnCreateSpan(iTransaction);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostStarted(Activity activity) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = this.activitySpanHelpers.get(activity);
        if (activityLifecycleSpanHelper != null) {
            ITransaction iTransaction = this.appStartSpan;
            if (iTransaction == null) {
                iTransaction = this.activitiesWithOngoingTransactions.get(activity);
            }
            activityLifecycleSpanHelper.createAndStopOnStartSpan(iTransaction);
            activityLifecycleSpanHelper.saveSpanToAppStartMetrics();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = new ActivityLifecycleSpanHelper(activity.getClass().getName());
        this.activitySpanHelpers.put(activity, activityLifecycleSpanHelper);
        if (this.firstActivityCreated) {
            return;
        }
        IScopes iScopes = this.scopes;
        SentryDate sentryDateNow = iScopes != null ? iScopes.getOptions().getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime();
        this.lastPausedTime = sentryDateNow;
        activityLifecycleSpanHelper.setOnCreateStartTimestamp(sentryDateNow);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPrePaused(Activity activity) {
        this.firstActivityCreated = true;
        IScopes iScopes = this.scopes;
        this.lastPausedTime = iScopes != null ? iScopes.getOptions().getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreStarted(Activity activity) {
        ActivityLifecycleSpanHelper activityLifecycleSpanHelper = this.activitySpanHelpers.get(activity);
        if (activityLifecycleSpanHelper != null) {
            SentryAndroidOptions sentryAndroidOptions = this.options;
            activityLifecycleSpanHelper.setOnStartStartTimestamp(sentryAndroidOptions != null ? sentryAndroidOptions.getDateProvider().now() : AndroidDateUtils.getCurrentSentryDateTime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isAllActivityCallbacksAvailable) {
                onActivityPostStarted(activity);
            }
            if (this.performanceEnabled) {
                final ISpan iSpan = this.ttidSpanMap.get(activity);
                final ISpan iSpan2 = this.ttfdSpanMap.get(activity);
                if (activity.getWindow() != null) {
                    FirstDrawDoneListener.registerForNextDraw(activity, new Runnable() { // from class: io.sentry.android.core.o
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f38597a.onFirstFrameDrawn(iSpan2, iSpan);
                        }
                    }, this.buildInfoProvider);
                } else {
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: io.sentry.android.core.p
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f38605a.onFirstFrameDrawn(iSpan2, iSpan);
                        }
                    });
                }
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

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (!this.isAllActivityCallbacksAvailable) {
                onActivityPostCreated(activity, null);
                onActivityPreStarted(activity);
            }
            if (this.performanceEnabled) {
                this.activityFramesTracker.addActivity(activity);
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

    @Override // io.sentry.Integration
    public void register(IScopes iScopes, SentryOptions sentryOptions) {
        this.options = (SentryAndroidOptions) Objects.requireNonNull(sentryOptions instanceof SentryAndroidOptions ? (SentryAndroidOptions) sentryOptions : null, "SentryAndroidOptions is required");
        this.scopes = (IScopes) Objects.requireNonNull(iScopes, "Scopes are required");
        this.performanceEnabled = isPerformanceEnabled(this.options);
        this.fullyDisplayedReporter = this.options.getFullyDisplayedReporter();
        this.timeToFullDisplaySpanEnabled = this.options.isEnableTimeToFullDisplayTracing();
        this.application.registerActivityLifecycleCallbacks(this);
        this.options.getLogger().log(SentryLevel.DEBUG, "ActivityLifecycleIntegration installed.", new Object[0]);
        IntegrationUtils.addIntegrationToSdkVersion("ActivityLifecycle");
    }

    public void setFirstActivityCreated(boolean z10) {
        this.firstActivityCreated = z10;
    }

    private void finishSpan(ISpan iSpan, SentryDate sentryDate) {
        finishSpan(iSpan, sentryDate, null);
    }

    private void finishSpan(ISpan iSpan, SentryDate sentryDate, SpanStatus spanStatus) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        if (spanStatus == null) {
            spanStatus = iSpan.getStatus() != null ? iSpan.getStatus() : SpanStatus.OK;
        }
        iSpan.finish(spanStatus, sentryDate);
    }

    private void finishSpan(ISpan iSpan, SpanStatus spanStatus) {
        if (iSpan == null || iSpan.isFinished()) {
            return;
        }
        iSpan.finish(spanStatus);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
