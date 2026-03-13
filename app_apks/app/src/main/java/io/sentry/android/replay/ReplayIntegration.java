package io.sentry.android.replay;

import Od.C;
import Od.F;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import io.sentry.Breadcrumb;
import io.sentry.DataCategory;
import io.sentry.Hint;
import io.sentry.IConnectionStatusProvider;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ISentryExecutorService;
import io.sentry.ISentryLifecycleToken;
import io.sentry.Integration;
import io.sentry.NoOpReplayBreadcrumbConverter;
import io.sentry.ReplayBreadcrumbConverter;
import io.sentry.ReplayController;
import io.sentry.ScopeCallback;
import io.sentry.SentryIntegrationPackageStorage;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayOptions;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.BufferCaptureStrategy;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.capture.SessionCaptureStrategy;
import io.sentry.android.replay.gestures.GestureRecorder;
import io.sentry.android.replay.gestures.TouchRecorderCallback;
import io.sentry.android.replay.util.ContextKt;
import io.sentry.android.replay.util.ExecutorsKt;
import io.sentry.android.replay.util.MainLooperHandler;
import io.sentry.android.replay.util.ReplayExecutorService;
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.cache.PersistingScopeObserver;
import io.sentry.hints.Backfillable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.transport.RateLimiter;
import io.sentry.util.AutoClosableReentrantLock;
import io.sentry.util.FileUtils;
import io.sentry.util.HintUtils;
import io.sentry.util.IntegrationUtils;
import io.sentry.util.Random;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.v;
import tc.AbstractC5877a;
import vc.InterfaceC6082a;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0006\u0097\u0001\u0098\u0001\u0099\u0001BA\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0016Bu\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r¢\u0006\u0004\b\u0014\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010!J\u000f\u0010#\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b$\u0010!J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010!J\u0019\u0010(\u001a\u00020\u001f2\b\b\u0002\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010!J\u001f\u0010/\u001a\u00020\u001f2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0017H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u001fH\u0016¢\u0006\u0004\b3\u0010!J\u000f\u00104\u001a\u00020\u001fH\u0016¢\u0006\u0004\b4\u0010!J\u0019\u00106\u001a\u00020\u001f2\b\u00105\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020:H\u0016¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u00020\u001fH\u0016¢\u0006\u0004\b@\u0010!J\u000f\u0010A\u001a\u00020\u001fH\u0016¢\u0006\u0004\bA\u0010!J\u000f\u0010B\u001a\u00020\u001fH\u0016¢\u0006\u0004\bB\u0010!J\u000f\u0010C\u001a\u00020\u0017H\u0016¢\u0006\u0004\bC\u00102J\u000f\u0010D\u001a\u00020\u001fH\u0016¢\u0006\u0004\bD\u0010!J\u0017\u0010G\u001a\u00020\u001f2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u001f\u0010G\u001a\u00020\u001f2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bG\u0010MJ\u000f\u0010N\u001a\u00020\u001fH\u0016¢\u0006\u0004\bN\u0010!J\u0017\u0010Q\u001a\u00020\u001f2\u0006\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bQ\u0010RJ\u0017\u0010U\u001a\u00020\u001f2\u0006\u0010T\u001a\u00020SH\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010Y\u001a\u00020\u001f2\u0006\u0010X\u001a\u00020WH\u0016¢\u0006\u0004\bY\u0010ZJ\u001f\u0010^\u001a\u00020\u001f2\u0006\u0010\\\u001a\u00020[2\u0006\u0010]\u001a\u00020[H\u0016¢\u0006\u0004\b^\u0010_J\u0015\u0010b\u001a\u00020\u001f2\u0006\u0010a\u001a\u00020`¢\u0006\u0004\bb\u0010cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010dR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010eR\u001c\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010fR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010gR\u0016\u0010h\u001a\u00020O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR\u0016\u0010j\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010lR\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010mR\u0018\u0010n\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010p\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u001b\u0010w\u001a\u00020r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR\u001b\u0010|\u001a\u00020x8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\by\u0010t\u001a\u0004\bz\u0010{R\u001d\u0010\u0081\u0001\u001a\u00020}8BX\u0082\u0084\u0002¢\u0006\r\n\u0004\b~\u0010t\u001a\u0005\b\u007f\u0010\u0080\u0001R \u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u0084\u0001\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R \u0010\u0087\u0001\u001a\u00030\u0082\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0084\u0001\u001a\u0006\b\u0088\u0001\u0010\u0086\u0001R\u001b\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008b\u0001\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R$\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010gR\u0017\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010\u008d\u0001R\u001e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010fR\u0018\u0010\u008f\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u0016\u0010\u0096\u0001\u001a\u0004\u0018\u00010I8F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u009a\u0001"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration;", "Lio/sentry/Integration;", "Ljava/io/Closeable;", "Lio/sentry/android/replay/ScreenshotRecorderCallback;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Lio/sentry/ReplayController;", "Lio/sentry/IConnectionStatusProvider$IConnectionStatusObserver;", "Lio/sentry/transport/RateLimiter$IRateLimitObserver;", "Lio/sentry/android/replay/WindowCallback;", "Landroid/content/Context;", "context", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Lkotlin/Function0;", "Lio/sentry/android/replay/Recorder;", "recorderProvider", "Lkotlin/Function1;", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;Lvc/a;Lvc/l;)V", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;)V", "", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayCaptureStrategyProvider", "Lio/sentry/android/replay/util/MainLooperHandler;", "mainLooperHandler", "Lio/sentry/android/replay/gestures/GestureRecorder;", "gestureRecorderProvider", "(Landroid/content/Context;Lio/sentry/transport/ICurrentDateProvider;Lvc/a;Lvc/l;Lvc/l;Lio/sentry/android/replay/util/MainLooperHandler;Lvc/a;)V", "Lfc/H;", "resumeInternal", "()V", "pauseInternal", "checkCanRecord", "registerRootViewListeners", "unregisterRootViewListeners", "", "unfinishedReplayId", "cleanupReplays", "(Ljava/lang/String;)V", "finalizePreviousReplay", "Lio/sentry/IScopes;", "scopes", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "register", "(Lio/sentry/IScopes;Lio/sentry/SentryOptions;)V", "isRecording", "()Z", "start", "resume", "isTerminating", "captureReplay", "(Ljava/lang/Boolean;)V", "getReplayId", "()Lio/sentry/protocol/SentryId;", "Lio/sentry/ReplayBreadcrumbConverter;", "converter", "setBreadcrumbConverter", "(Lio/sentry/ReplayBreadcrumbConverter;)V", "getBreadcrumbConverter", "()Lio/sentry/ReplayBreadcrumbConverter;", "pause", "enableDebugMaskingOverlay", "disableDebugMaskingOverlay", "isDebugMaskingOverlayEnabled", "stop", "Landroid/graphics/Bitmap;", "bitmap", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;)V", "Ljava/io/File;", "screenshot", "", "frameTimestamp", "(Ljava/io/File;J)V", "close", "Lio/sentry/IConnectionStatusProvider$ConnectionStatus;", "status", "onConnectionStatusChanged", "(Lio/sentry/IConnectionStatusProvider$ConnectionStatus;)V", "Lio/sentry/transport/RateLimiter;", "rateLimiter", "onRateLimitChanged", "(Lio/sentry/transport/RateLimiter;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "width", "height", "onWindowSizeChanged", "(II)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "config", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/content/Context;", "Lio/sentry/transport/ICurrentDateProvider;", "Lvc/a;", "Lvc/l;", "lastKnownConnectionStatus", "Lio/sentry/IConnectionStatusProvider$ConnectionStatus;", "debugMaskingEnabled", "Z", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "recorder", "Lio/sentry/android/replay/Recorder;", "gestureRecorder", "Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/util/Random;", "random$delegate", "Lfc/k;", "getRandom", "()Lio/sentry/util/Random;", "random", "Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy$delegate", "getRootViewsSpy$sentry_android_replay_release", "()Lio/sentry/android/replay/RootViewsSpy;", "rootViewsSpy", "Lio/sentry/android/replay/util/ReplayExecutorService;", "replayExecutor$delegate", "getReplayExecutor", "()Lio/sentry/android/replay/util/ReplayExecutorService;", "replayExecutor", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEnabled$sentry_android_replay_release", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isManualPause", "isManualPause$sentry_android_replay_release", "captureStrategy", "Lio/sentry/android/replay/capture/CaptureStrategy;", "replayBreadcrumbConverter", "Lio/sentry/ReplayBreadcrumbConverter;", "Lio/sentry/android/replay/util/MainLooperHandler;", "Lio/sentry/util/AutoClosableReentrantLock;", "lifecycleLock", "Lio/sentry/util/AutoClosableReentrantLock;", "Lio/sentry/android/replay/ReplayLifecycle;", "lifecycle", "Lio/sentry/android/replay/ReplayLifecycle;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "Companion", "PreviousReplayHint", "ReplayExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayIntegration implements Integration, Closeable, ScreenshotRecorderCallback, TouchRecorderCallback, ReplayController, IConnectionStatusProvider.IConnectionStatusObserver, RateLimiter.IRateLimitObserver, WindowCallback {
    private CaptureStrategy captureStrategy;
    private final Context context;
    private final ICurrentDateProvider dateProvider;
    private boolean debugMaskingEnabled;
    private GestureRecorder gestureRecorder;
    private InterfaceC6082a gestureRecorderProvider;
    private final AtomicBoolean isEnabled;
    private final AtomicBoolean isManualPause;
    private volatile IConnectionStatusProvider.ConnectionStatus lastKnownConnectionStatus;
    private final ReplayLifecycle lifecycle;
    private final AutoClosableReentrantLock lifecycleLock;
    private MainLooperHandler mainLooperHandler;
    private SentryOptions options;

    /* JADX INFO: renamed from: random$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k random;
    private Recorder recorder;
    private final InterfaceC6082a recorderProvider;
    private ReplayBreadcrumbConverter replayBreadcrumbConverter;
    private final l replayCacheProvider;
    private l replayCaptureStrategyProvider;

    /* JADX INFO: renamed from: replayExecutor$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k replayExecutor;

    /* JADX INFO: renamed from: rootViewsSpy$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k rootViewsSpy;
    private IScopes scopes;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$Companion;", "", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016¨\u0006\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$PreviousReplayHint;", "Lio/sentry/hints/Backfillable;", "()V", "shouldEnrich", "", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PreviousReplayHint implements Backfillable {
        @Override // io.sentry.hints.Backfillable
        public boolean shouldEnrich() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/ReplayIntegration$ReplayExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplayExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            AbstractC4862t.e(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayIntegration-");
            int i10 = this.cnt;
            this.cnt = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$captureReplay$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/util/Date;", "newTimestamp", "Lfc/H;", "invoke", "(Ljava/util/Date;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends v implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Date) obj);
            return C4015H.f34254a;
        }

        public final void invoke(Date newTimestamp) {
            AbstractC4862t.e(newTimestamp, "newTimestamp");
            CaptureStrategy captureStrategy = ReplayIntegration.this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy captureStrategy2 = ReplayIntegration.this.captureStrategy;
                Integer numValueOf = captureStrategy2 != null ? Integer.valueOf(captureStrategy2.getCurrentSegment()) : null;
                AbstractC4862t.b(numValueOf);
                captureStrategy.setCurrentSegment(numValueOf.intValue() + 1);
            }
            CaptureStrategy captureStrategy3 = ReplayIntegration.this.captureStrategy;
            if (captureStrategy3 == null) {
                return;
            }
            captureStrategy3.setSegmentTimestamp(newTimestamp);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "", "frameTimeStamp", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/ReplayCache;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends v implements p {
        final /* synthetic */ Bitmap $bitmap;
        final /* synthetic */ L $screen;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Bitmap bitmap, L l10) {
            super(2);
            this.$bitmap = bitmap;
            this.$screen = l10;
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws IOException {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return C4015H.f34254a;
        }

        public final void invoke(ReplayCache onScreenshotRecorded, long j10) throws IOException {
            AbstractC4862t.e(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.addFrame$sentry_android_replay_release(this.$bitmap, j10, (String) this.$screen.f39776a);
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.ReplayIntegration$onScreenshotRecorded$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "", "<anonymous parameter 0>", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/ReplayCache;J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass3 extends v implements p {
        final /* synthetic */ long $frameTimestamp;
        final /* synthetic */ File $screenshot;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(File file, long j10) {
            super(2);
            this.$screenshot = file;
            this.$frameTimestamp = j10;
        }

        @Override // vc.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            invoke((ReplayCache) obj, ((Number) obj2).longValue());
            return C4015H.f34254a;
        }

        public final void invoke(ReplayCache onScreenshotRecorded, long j10) throws Exception {
            AbstractC4862t.e(onScreenshotRecorded, "$this$onScreenshotRecorded");
            ReplayCache.addFrame$default(onScreenshotRecorded, this.$screenshot, this.$frameTimestamp, null, 4, null);
        }
    }

    static {
        SentryIntegrationPackageStorage.getInstance().addPackage("maven:io.sentry:sentry-android-replay", "8.32.0");
    }

    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider, InterfaceC6082a interfaceC6082a, l lVar) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(dateProvider, "dateProvider");
        this.context = context;
        this.dateProvider = dateProvider;
        this.recorderProvider = interfaceC6082a;
        this.replayCacheProvider = lVar;
        this.lastKnownConnectionStatus = IConnectionStatusProvider.ConnectionStatus.UNKNOWN;
        this.random = C4029l.b(ReplayIntegration$random$2.INSTANCE);
        this.rootViewsSpy = C4029l.b(ReplayIntegration$rootViewsSpy$2.INSTANCE);
        this.replayExecutor = C4029l.b(new ReplayIntegration$replayExecutor$2(this));
        this.isEnabled = new AtomicBoolean(false);
        this.isManualPause = new AtomicBoolean(false);
        NoOpReplayBreadcrumbConverter noOpReplayBreadcrumbConverter = NoOpReplayBreadcrumbConverter.getInstance();
        AbstractC4862t.d(noOpReplayBreadcrumbConverter, "getInstance(...)");
        this.replayBreadcrumbConverter = noOpReplayBreadcrumbConverter;
        this.mainLooperHandler = new MainLooperHandler(null, 1, null);
        this.lifecycleLock = new AutoClosableReentrantLock();
        this.lifecycle = new ReplayLifecycle();
    }

    private final void checkCanRecord() throws Exception {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (this.lastKnownConnectionStatus == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED || !(((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                pauseInternal();
            }
        }
    }

    private final void cleanupReplays(String unfinishedReplayId) {
        File[] fileArrListFiles;
        SentryOptions sentryOptions = this.options;
        if (sentryOptions == null) {
            AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions = null;
        }
        String cacheDirPath = sentryOptions.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        AbstractC4862t.b(fileArrListFiles);
        for (File file : fileArrListFiles) {
            String name = file.getName();
            AbstractC4862t.b(name);
            if (C.P(name, "replay_", false, 2, null)) {
                String string = getReplayId().toString();
                AbstractC4862t.d(string, "toString(...)");
                if (!F.V(name, string, false, 2, null) && (F.k0(unfinishedReplayId) || !F.V(name, unfinishedReplayId, false, 2, null))) {
                    FileUtils.deleteRecursively(file);
                }
            }
        }
    }

    public static /* synthetic */ void cleanupReplays$default(ReplayIntegration replayIntegration, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "";
        }
        replayIntegration.cleanupReplays(str);
    }

    private final void finalizePreviousReplay() {
        SentryOptions sentryOptions = this.options;
        SentryOptions sentryOptions2 = null;
        if (sentryOptions == null) {
            AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions = null;
        }
        ISentryExecutorService executorService = sentryOptions.getExecutorService();
        AbstractC4862t.d(executorService, "getExecutorService(...)");
        SentryOptions sentryOptions3 = this.options;
        if (sentryOptions3 == null) {
            AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
        } else {
            sentryOptions2 = sentryOptions3;
        }
        ExecutorsKt.submitSafely(executorService, sentryOptions2, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.b
            @Override // java.lang.Runnable
            public final void run() throws IOException {
                ReplayIntegration.finalizePreviousReplay$lambda$10(this.f38644a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void finalizePreviousReplay$lambda$10(ReplayIntegration replayIntegration) throws IOException {
        SentryOptions sentryOptions;
        SentryOptions sentryOptions2 = replayIntegration.options;
        if (sentryOptions2 == null) {
            AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
            sentryOptions2 = null;
        }
        PersistingScopeObserver persistingScopeObserverFindPersistingScopeObserver = sentryOptions2.findPersistingScopeObserver();
        if (persistingScopeObserverFindPersistingScopeObserver != null) {
            SentryOptions sentryOptions3 = replayIntegration.options;
            if (sentryOptions3 == null) {
                AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                sentryOptions3 = null;
            }
            String str = (String) persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions3, PersistingScopeObserver.REPLAY_FILENAME, String.class);
            if (str != null) {
                SentryId sentryId = new SentryId(str);
                if (AbstractC4862t.a(sentryId, SentryId.EMPTY_ID)) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                ReplayCache.Companion companion = ReplayCache.INSTANCE;
                SentryOptions sentryOptions4 = replayIntegration.options;
                if (sentryOptions4 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions4 = null;
                }
                LastSegmentData lastSegmentDataFromDisk$sentry_android_replay_release = companion.fromDisk$sentry_android_replay_release(sentryOptions4, sentryId, replayIntegration.replayCacheProvider);
                if (lastSegmentDataFromDisk$sentry_android_replay_release == null) {
                    cleanupReplays$default(replayIntegration, null, 1, null);
                    return;
                }
                SentryOptions sentryOptions5 = replayIntegration.options;
                if (sentryOptions5 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions5 = null;
                }
                Object obj = persistingScopeObserverFindPersistingScopeObserver.read(sentryOptions5, PersistingScopeObserver.BREADCRUMBS_FILENAME, List.class);
                List<Breadcrumb> list = obj instanceof List ? (List) obj : null;
                CaptureStrategy.Companion companion2 = CaptureStrategy.INSTANCE;
                IScopes iScopes = replayIntegration.scopes;
                SentryOptions sentryOptions6 = replayIntegration.options;
                if (sentryOptions6 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions = null;
                } else {
                    sentryOptions = sentryOptions6;
                }
                CaptureStrategy.ReplaySegment replaySegmentCreateSegment = companion2.createSegment(iScopes, sentryOptions, lastSegmentDataFromDisk$sentry_android_replay_release.getDuration(), lastSegmentDataFromDisk$sentry_android_replay_release.getTimestamp(), sentryId, lastSegmentDataFromDisk$sentry_android_replay_release.getId(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingHeight(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getRecordingWidth(), lastSegmentDataFromDisk$sentry_android_replay_release.getReplayType(), lastSegmentDataFromDisk$sentry_android_replay_release.getCache(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getFrameRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getRecorderConfig().getBitRate(), lastSegmentDataFromDisk$sentry_android_replay_release.getScreenAtStart(), list, new LinkedList(lastSegmentDataFromDisk$sentry_android_replay_release.getEvents()));
                if (replaySegmentCreateSegment instanceof CaptureStrategy.ReplaySegment.Created) {
                    Hint hintCreateWithTypeCheckHint = HintUtils.createWithTypeCheckHint(new PreviousReplayHint());
                    IScopes iScopes2 = replayIntegration.scopes;
                    AbstractC4862t.b(hintCreateWithTypeCheckHint);
                    ((CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegment).capture(iScopes2, hintCreateWithTypeCheckHint);
                }
                replayIntegration.cleanupReplays(str);
                return;
            }
        }
        cleanupReplays$default(replayIntegration, null, 1, null);
    }

    private final Random getRandom() {
        return (Random) this.random.getValue();
    }

    private final ReplayExecutorService getReplayExecutor() {
        return (ReplayExecutorService) this.replayExecutor.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$4(L l10, IScope it) {
        AbstractC4862t.e(it, "it");
        String screen = it.getScreen();
        l10.f39776a = screen != null ? F.U0(screen, '.', null, 2, null) : null;
    }

    private final void pauseInternal() throws Exception {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.PAUSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.pause();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.pause();
                    }
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    C4015H c4015h = C4015H.f34254a;
                    AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    private final void registerRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            AbstractC4862t.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.add((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().add(this.gestureRecorder);
    }

    private final void resumeInternal() throws Exception {
        IScopes iScopes;
        IScopes iScopes2;
        RateLimiter rateLimiter;
        RateLimiter rateLimiter2;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.RESUMED;
                if (replayLifecycle.isAllowed(replayState)) {
                    if (!this.isManualPause.get() && this.lastKnownConnectionStatus != IConnectionStatusProvider.ConnectionStatus.DISCONNECTED && (((iScopes = this.scopes) == null || (rateLimiter2 = iScopes.getRateLimiter()) == null || !rateLimiter2.isActiveForCategory(DataCategory.All)) && ((iScopes2 = this.scopes) == null || (rateLimiter = iScopes2.getRateLimiter()) == null || !rateLimiter.isActiveForCategory(DataCategory.Replay)))) {
                        this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                        CaptureStrategy captureStrategy = this.captureStrategy;
                        if (captureStrategy != null) {
                            captureStrategy.resume();
                        }
                        Recorder recorder = this.recorder;
                        if (recorder != null) {
                            recorder.resume();
                            C4015H c4015h = C4015H.f34254a;
                        }
                        AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                        return;
                    }
                    AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    private final void unregisterRootViewListeners() {
        if (this.recorder instanceof OnRootViewsChangedListener) {
            CopyOnWriteArrayList<OnRootViewsChangedListener> listeners = getRootViewsSpy$sentry_android_replay_release().getListeners();
            Recorder recorder = this.recorder;
            AbstractC4862t.c(recorder, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            listeners.remove((OnRootViewsChangedListener) recorder);
        }
        getRootViewsSpy$sentry_android_replay_release().getListeners().remove(this.gestureRecorder);
    }

    @Override // io.sentry.ReplayController
    public void captureReplay(Boolean isTerminating) {
        if (this.isEnabled.get() && isRecording()) {
            SentryId sentryId = SentryId.EMPTY_ID;
            CaptureStrategy captureStrategy = this.captureStrategy;
            SentryOptions sentryOptions = null;
            if (sentryId.equals(captureStrategy != null ? captureStrategy.getCurrentReplayId() : null)) {
                SentryOptions sentryOptions2 = this.options;
                if (sentryOptions2 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                } else {
                    sentryOptions = sentryOptions2;
                }
                sentryOptions.getLogger().log(SentryLevel.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            CaptureStrategy captureStrategy2 = this.captureStrategy;
            if (captureStrategy2 != null) {
                captureStrategy2.captureReplay(AbstractC4862t.a(isTerminating, Boolean.TRUE), new AnonymousClass1());
            }
            CaptureStrategy captureStrategy3 = this.captureStrategy;
            this.captureStrategy = captureStrategy3 != null ? captureStrategy3.convert() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        RateLimiter rateLimiter;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.CLOSED;
                if (replayLifecycle.isAllowed(replayState)) {
                    SentryOptions sentryOptions = this.options;
                    if (sentryOptions == null) {
                        AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                        sentryOptions = null;
                    }
                    sentryOptions.getConnectionStatusProvider().removeConnectionStatusObserver(this);
                    IScopes iScopes = this.scopes;
                    if (iScopes != null && (rateLimiter = iScopes.getRateLimiter()) != null) {
                        rateLimiter.removeRateLimitObserver(this);
                    }
                    stop();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.close();
                    }
                    this.recorder = null;
                    getRootViewsSpy$sentry_android_replay_release().close();
                    getReplayExecutor().shutdown();
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    C4015H c4015h = C4015H.f34254a;
                    AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    @Override // io.sentry.IReplayApi
    public void disableDebugMaskingOverlay() {
        this.debugMaskingEnabled = false;
    }

    @Override // io.sentry.IReplayApi
    public void enableDebugMaskingOverlay() {
        this.debugMaskingEnabled = true;
    }

    @Override // io.sentry.ReplayController
    /* JADX INFO: renamed from: getBreadcrumbConverter, reason: from getter */
    public ReplayBreadcrumbConverter getReplayBreadcrumbConverter() {
        return this.replayBreadcrumbConverter;
    }

    public final File getReplayCacheDir() {
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            return captureStrategy.getReplayCacheDir();
        }
        return null;
    }

    @Override // io.sentry.ReplayController
    public SentryId getReplayId() {
        SentryId currentReplayId;
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null && (currentReplayId = captureStrategy.getCurrentReplayId()) != null) {
            return currentReplayId;
        }
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        AbstractC4862t.d(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final RootViewsSpy getRootViewsSpy$sentry_android_replay_release() {
        return (RootViewsSpy) this.rootViewsSpy.getValue();
    }

    @Override // io.sentry.ReplayController
    /* JADX INFO: renamed from: isDebugMaskingOverlayEnabled, reason: from getter */
    public boolean getDebugMaskingEnabled() {
        return this.debugMaskingEnabled;
    }

    /* JADX INFO: renamed from: isEnabled$sentry_android_replay_release, reason: from getter */
    public final AtomicBoolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: isManualPause$sentry_android_replay_release, reason: from getter */
    public final AtomicBoolean getIsManualPause() {
        return this.isManualPause;
    }

    @Override // io.sentry.ReplayController
    public boolean isRecording() {
        return this.lifecycle.getCurrentState().compareTo(ReplayState.STARTED) >= 0 && this.lifecycle.getCurrentState().compareTo(ReplayState.STOPPED) < 0;
    }

    public final void onConfigurationChanged(ScreenshotRecorderConfig config) {
        Recorder recorder;
        AbstractC4862t.e(config, "config");
        if (this.isEnabled.get() && isRecording()) {
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                captureStrategy.onConfigurationChanged(config);
            }
            Recorder recorder2 = this.recorder;
            if (recorder2 != null) {
                recorder2.onConfigurationChanged(config);
            }
            if (this.lifecycle.getCurrentState() != ReplayState.PAUSED || (recorder = this.recorder) == null) {
                return;
            }
            recorder.pause();
        }
    }

    @Override // io.sentry.IConnectionStatusProvider.IConnectionStatusObserver
    public void onConnectionStatusChanged(IConnectionStatusProvider.ConnectionStatus status) throws Exception {
        AbstractC4862t.e(status, "status");
        this.lastKnownConnectionStatus = status;
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (status == IConnectionStatusProvider.ConnectionStatus.DISCONNECTED) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.transport.RateLimiter.IRateLimitObserver
    public void onRateLimitChanged(RateLimiter rateLimiter) throws Exception {
        AbstractC4862t.e(rateLimiter, "rateLimiter");
        if (this.captureStrategy instanceof SessionCaptureStrategy) {
            if (rateLimiter.isActiveForCategory(DataCategory.All) || rateLimiter.isActiveForCategory(DataCategory.Replay)) {
                pauseInternal();
            } else {
                resumeInternal();
            }
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(Bitmap bitmap) throws Exception {
        AbstractC4862t.e(bitmap, "bitmap");
        final L l10 = new L();
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.c
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    ReplayIntegration.onScreenshotRecorded$lambda$4(l10, iScope);
                }
            });
        }
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            captureStrategy.onScreenshotRecorded(bitmap, new AnonymousClass2(bitmap, l10));
        }
        checkCanRecord();
    }

    @Override // io.sentry.android.replay.gestures.TouchRecorderCallback
    public void onTouchEvent(MotionEvent event) {
        CaptureStrategy captureStrategy;
        AbstractC4862t.e(event, "event");
        if (this.isEnabled.get() && this.lifecycle.isTouchRecordingAllowed() && (captureStrategy = this.captureStrategy) != null) {
            captureStrategy.onTouchEvent(event);
        }
    }

    @Override // io.sentry.android.replay.WindowCallback
    public void onWindowSizeChanged(int width, int height) {
        if (this.isEnabled.get() && isRecording()) {
            SentryOptions sentryOptions = this.options;
            SentryOptions sentryOptions2 = null;
            if (sentryOptions == null) {
                AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                sentryOptions = null;
            }
            if (sentryOptions.getSessionReplay().isTrackConfiguration()) {
                ScreenshotRecorderConfig.Companion companion = ScreenshotRecorderConfig.INSTANCE;
                Context context = this.context;
                SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                } else {
                    sentryOptions2 = sentryOptions3;
                }
                SentryReplayOptions sessionReplay = sentryOptions2.getSessionReplay();
                AbstractC4862t.d(sessionReplay, "getSessionReplay(...)");
                onConfigurationChanged(companion.fromSize(context, sessionReplay, width, height));
            }
        }
    }

    @Override // io.sentry.ReplayController
    public void pause() throws Exception {
        this.isManualPause.set(true);
        pauseInternal();
    }

    @Override // io.sentry.Integration
    public void register(IScopes scopes, SentryOptions options) {
        ReplayIntegration replayIntegration;
        SentryOptions sentryOptions;
        Recorder windowRecorder;
        GestureRecorder gestureRecorder;
        AbstractC4862t.e(scopes, "scopes");
        AbstractC4862t.e(options, "options");
        this.options = options;
        if (!options.getSessionReplay().isSessionReplayEnabled() && !options.getSessionReplay().isSessionReplayForErrorsEnabled()) {
            options.getLogger().log(SentryLevel.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.scopes = scopes;
        InterfaceC6082a interfaceC6082a = this.recorderProvider;
        if (interfaceC6082a == null || (windowRecorder = (Recorder) interfaceC6082a.invoke()) == null) {
            replayIntegration = this;
            sentryOptions = options;
            windowRecorder = new WindowRecorder(sentryOptions, replayIntegration, this, this.mainLooperHandler, getReplayExecutor());
        } else {
            replayIntegration = this;
            sentryOptions = options;
        }
        replayIntegration.recorder = windowRecorder;
        InterfaceC6082a interfaceC6082a2 = replayIntegration.gestureRecorderProvider;
        if (interfaceC6082a2 == null || (gestureRecorder = (GestureRecorder) interfaceC6082a2.invoke()) == null) {
            gestureRecorder = new GestureRecorder(sentryOptions, replayIntegration);
        }
        replayIntegration.gestureRecorder = gestureRecorder;
        replayIntegration.isEnabled.set(true);
        sentryOptions.getConnectionStatusProvider().addConnectionStatusObserver(replayIntegration);
        RateLimiter rateLimiter = scopes.getRateLimiter();
        if (rateLimiter != null) {
            rateLimiter.addRateLimitObserver(replayIntegration);
        }
        IntegrationUtils.addIntegrationToSdkVersion("Replay");
        replayIntegration.finalizePreviousReplay();
    }

    @Override // io.sentry.ReplayController
    public void resume() throws Exception {
        this.isManualPause.set(false);
        resumeInternal();
    }

    @Override // io.sentry.ReplayController
    public void setBreadcrumbConverter(ReplayBreadcrumbConverter converter) {
        AbstractC4862t.e(converter, "converter");
        this.replayBreadcrumbConverter = converter;
    }

    @Override // io.sentry.ReplayController
    public void start() throws Exception {
        CaptureStrategy bufferCaptureStrategy;
        SentryOptions sentryOptions;
        SentryOptions sentryOptions2;
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (!this.isEnabled.get()) {
                AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                return;
            }
            ReplayLifecycle replayLifecycle = this.lifecycle;
            ReplayState replayState = ReplayState.STARTED;
            if (!replayLifecycle.isAllowed(replayState)) {
                SentryOptions sentryOptions3 = this.options;
                if (sentryOptions3 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions3 = null;
                }
                sentryOptions3.getLogger().log(SentryLevel.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                return;
            }
            Random random = getRandom();
            SentryOptions sentryOptions4 = this.options;
            if (sentryOptions4 == null) {
                AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                sentryOptions4 = null;
            }
            boolean zSample = SamplingKt.sample(random, sentryOptions4.getSessionReplay().getSessionSampleRate());
            if (!zSample) {
                SentryOptions sentryOptions5 = this.options;
                if (sentryOptions5 == null) {
                    AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                    sentryOptions5 = null;
                }
                if (!sentryOptions5.getSessionReplay().isSessionReplayForErrorsEnabled()) {
                    SentryOptions sentryOptions6 = this.options;
                    if (sentryOptions6 == null) {
                        AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                        sentryOptions6 = null;
                    }
                    sentryOptions6.getLogger().log(SentryLevel.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
            l lVar = this.replayCaptureStrategyProvider;
            if (lVar == null || (bufferCaptureStrategy = (CaptureStrategy) lVar.invoke(Boolean.valueOf(zSample))) == null) {
                if (zSample) {
                    SentryOptions sentryOptions7 = this.options;
                    if (sentryOptions7 == null) {
                        AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                        sentryOptions2 = null;
                    } else {
                        sentryOptions2 = sentryOptions7;
                    }
                    bufferCaptureStrategy = new SessionCaptureStrategy(sentryOptions2, this.scopes, this.dateProvider, getReplayExecutor(), this.replayCacheProvider);
                } else {
                    SentryOptions sentryOptions8 = this.options;
                    if (sentryOptions8 == null) {
                        AbstractC4862t.p(RRWebOptionsEvent.EVENT_TAG);
                        sentryOptions = null;
                    } else {
                        sentryOptions = sentryOptions8;
                    }
                    bufferCaptureStrategy = new BufferCaptureStrategy(sentryOptions, this.scopes, this.dateProvider, getRandom(), getReplayExecutor(), this.replayCacheProvider);
                }
            }
            this.captureStrategy = bufferCaptureStrategy;
            Recorder recorder = this.recorder;
            if (recorder != null) {
                recorder.start();
            }
            CaptureStrategy captureStrategy = this.captureStrategy;
            if (captureStrategy != null) {
                CaptureStrategy.DefaultImpls.start$default(captureStrategy, 0, null, null, 7, null);
            }
            registerRootViewListeners();
            C4015H c4015h = C4015H.f34254a;
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC5877a.a(iSentryLifecycleTokenAcquire, th);
                throw th2;
            }
        }
    }

    @Override // io.sentry.ReplayController
    public void stop() throws Exception {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lifecycleLock.acquire();
        try {
            if (this.isEnabled.get()) {
                ReplayLifecycle replayLifecycle = this.lifecycle;
                ReplayState replayState = ReplayState.STOPPED;
                if (replayLifecycle.isAllowed(replayState)) {
                    unregisterRootViewListeners();
                    Recorder recorder = this.recorder;
                    if (recorder != null) {
                        recorder.reset();
                    }
                    Recorder recorder2 = this.recorder;
                    if (recorder2 != null) {
                        recorder2.stop();
                    }
                    GestureRecorder gestureRecorder = this.gestureRecorder;
                    if (gestureRecorder != null) {
                        gestureRecorder.stop();
                    }
                    CaptureStrategy captureStrategy = this.captureStrategy;
                    if (captureStrategy != null) {
                        captureStrategy.stop();
                    }
                    this.captureStrategy = null;
                    this.lifecycle.setCurrentState$sentry_android_replay_release(replayState);
                    C4015H c4015h = C4015H.f34254a;
                    AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    return;
                }
            }
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    @Override // io.sentry.android.replay.ScreenshotRecorderCallback
    public void onScreenshotRecorded(File screenshot, long frameTimestamp) throws Exception {
        AbstractC4862t.e(screenshot, "screenshot");
        CaptureStrategy captureStrategy = this.captureStrategy;
        if (captureStrategy != null) {
            CaptureStrategy.DefaultImpls.onScreenshotRecorded$default(captureStrategy, null, new AnonymousClass3(screenshot, frameTimestamp), 1, null);
        }
        checkCanRecord();
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, InterfaceC6082a interfaceC6082a, l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(context, iCurrentDateProvider, (i10 & 4) != 0 ? null : interfaceC6082a, (i10 & 8) != 0 ? null : lVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider) {
        this(ContextKt.appContext(context), dateProvider, null, null);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, ICurrentDateProvider iCurrentDateProvider, InterfaceC6082a interfaceC6082a, l lVar, l lVar2, MainLooperHandler mainLooperHandler, InterfaceC6082a interfaceC6082a2, int i10, AbstractC4854k abstractC4854k) {
        this(context, iCurrentDateProvider, interfaceC6082a, lVar, (i10 & 16) != 0 ? null : lVar2, (i10 & 32) != 0 ? null : mainLooperHandler, (i10 & 64) != 0 ? null : interfaceC6082a2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, ICurrentDateProvider dateProvider, InterfaceC6082a interfaceC6082a, l lVar, l lVar2, MainLooperHandler mainLooperHandler, InterfaceC6082a interfaceC6082a2) {
        this(ContextKt.appContext(context), dateProvider, interfaceC6082a, lVar);
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(dateProvider, "dateProvider");
        this.replayCaptureStrategyProvider = lVar2;
        this.mainLooperHandler = mainLooperHandler == null ? new MainLooperHandler(null, 1, null) : mainLooperHandler;
        this.gestureRecorderProvider = interfaceC6082a2;
    }
}
