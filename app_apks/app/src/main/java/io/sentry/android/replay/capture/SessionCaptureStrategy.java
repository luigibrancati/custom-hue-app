package io.sentry.android.replay.capture;

import Od.F;
import android.graphics.Bitmap;
import fc.C4015H;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ScopeCallback;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 82\u00020\u0001:\u00018BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010\u001fJ+\u0010%\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00130\nH\u0016¢\u0006\u0004\b%\u0010&J3\u0010,\u001a\u00020\u00132\b\u0010(\u001a\u0004\u0018\u00010'2\u0018\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00130)H\u0016¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00103\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00105R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00106R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00107¨\u00069"}, d2 = {"Lio/sentry/android/replay/capture/SessionCaptureStrategy;", "Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/IScopes;", "scopes", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/IScopes;Lio/sentry/transport/ICurrentDateProvider;Ljava/util/concurrent/ScheduledExecutorService;Lvc/l;)V", "", "taskName", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lfc/H;", "onSegmentCreated", "createCurrentSegment", "(Ljava/lang/String;Lvc/l;)V", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "start", "(ILio/sentry/protocol/SentryId;Lio/sentry/SentryReplayEvent$ReplayType;)V", "pause", "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLvc/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lvc/p;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "Lio/sentry/transport/ICurrentDateProvider;", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SessionCaptureStrategy extends BaseCaptureStrategy {
    private static final String TAG = "SessionCaptureStrategy";
    private final ICurrentDateProvider dateProvider;
    private final SentryOptions options;
    private final IScopes scopes;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.SessionCaptureStrategy$onConfigurationChanged$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "segment", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends v implements l {
        public AnonymousClass1() {
            super(1);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return C4015H.f34254a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) {
            AbstractC4862t.e(segment, "segment");
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, SessionCaptureStrategy.this.scopes, null, 2, null);
                SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                SessionCaptureStrategy.this.setSegmentTimestamp(created.getReplay().getTimestamp());
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.SessionCaptureStrategy$pause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "segment", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46231 extends v implements l {
        public C46231() {
            super(1);
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return C4015H.f34254a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) {
            AbstractC4862t.e(segment, "segment");
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.scopes, null, 2, null);
                SessionCaptureStrategy sessionCaptureStrategy = SessionCaptureStrategy.this;
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.SessionCaptureStrategy$stop$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "segment", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46241 extends v implements l {
        final /* synthetic */ File $replayCacheDir;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46241(File file) {
            super(1);
            this.$replayCacheDir = file;
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return C4015H.f34254a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) {
            AbstractC4862t.e(segment, "segment");
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created.capture$default((CaptureStrategy.ReplaySegment.Created) segment, SessionCaptureStrategy.this.scopes, null, 2, null);
            }
            SessionCaptureStrategy.this.setCurrentSegment(-1);
            FileUtils.deleteRecursively(this.$replayCacheDir);
        }
    }

    public /* synthetic */ SessionCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i10 & 16) != 0 ? null : lVar);
    }

    private final void createCurrentSegment(String taskName, final l onSegmentCreated) {
        final ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Recorder config is not set, not creating segment for task: " + taskName, new Object[0]);
            return;
        }
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        final Date segmentTimestamp = getSegmentTimestamp();
        if (segmentTimestamp == null) {
            return;
        }
        final long time = currentTimeMillis - segmentTimestamp.getTime();
        final SentryId currentReplayId = getCurrentReplayId();
        getReplayExecutor().submit(new ReplayRunnable("SessionCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.f
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.createCurrentSegment$lambda$4(this.f38659a, time, segmentTimestamp, currentReplayId, recorderConfig$sentry_android_replay_release, onSegmentCreated);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$4(SessionCaptureStrategy sessionCaptureStrategy, long j10, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, l lVar) {
        lVar.invoke(BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, j10, date, sentryId, sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$3(SessionCaptureStrategy sessionCaptureStrategy, p pVar, long j10, ScreenshotRecorderConfig screenshotRecorderConfig) {
        ReplayCache cache = sessionCaptureStrategy.getCache();
        if (cache != null) {
            pVar.invoke(cache, Long.valueOf(j10));
        }
        Date segmentTimestamp = sessionCaptureStrategy.getSegmentTimestamp();
        if (segmentTimestamp == null) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (sessionCaptureStrategy.getIsTerminating().get()) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (screenshotRecorderConfig == null) {
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long currentTimeMillis = sessionCaptureStrategy.dateProvider.getCurrentTimeMillis();
        if (currentTimeMillis - segmentTimestamp.getTime() >= sessionCaptureStrategy.options.getSessionReplay().getSessionSegmentDuration()) {
            CaptureStrategy.ReplaySegment replaySegmentCreateSegmentInternal$default = BaseCaptureStrategy.createSegmentInternal$default(sessionCaptureStrategy, sessionCaptureStrategy.options.getSessionReplay().getSessionSegmentDuration(), segmentTimestamp, sessionCaptureStrategy.getCurrentReplayId(), sessionCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null);
            if (replaySegmentCreateSegmentInternal$default instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) replaySegmentCreateSegmentInternal$default;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, sessionCaptureStrategy.scopes, null, 2, null);
                sessionCaptureStrategy.setCurrentSegment(sessionCaptureStrategy.getCurrentSegment() + 1);
                sessionCaptureStrategy.setSegmentTimestamp(created.getReplay().getTimestamp());
            }
        }
        if (currentTimeMillis - sessionCaptureStrategy.getReplayStartTimestamp().get() >= sessionCaptureStrategy.options.getSessionReplay().getSessionDuration()) {
            sessionCaptureStrategy.options.getReplayController().stop();
            sessionCaptureStrategy.options.getLogger().log(SentryLevel.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void start$lambda$0(SessionCaptureStrategy sessionCaptureStrategy, IScope it) {
        AbstractC4862t.e(it, "it");
        it.setReplayId(sessionCaptureStrategy.getCurrentReplayId());
        String screen = it.getScreen();
        sessionCaptureStrategy.setScreenAtStart(screen != null ? F.U0(screen, '.', null, 2, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$1(IScope it) {
        AbstractC4862t.e(it, "it");
        it.setReplayId(SentryId.EMPTY_ID);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean isTerminating, l onSegmentSent) {
        AbstractC4862t.e(onSegmentSent, "onSegmentSent");
        if (this.options.getSessionReplay().isDebug()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        getIsTerminating().set(isTerminating);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        AbstractC4862t.e(recorderConfig, "recorderConfig");
        createCurrentSegment("onConfigurationChanged", new AnonymousClass1());
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, final p store) {
        AbstractC4862t.e(store, "store");
        final ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        final long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        getReplayExecutor().submit(new ReplayRunnable("SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.g
            @Override // java.lang.Runnable
            public final void run() {
                SessionCaptureStrategy.onScreenshotRecorded$lambda$3(this.f38665a, store, currentTimeMillis, recorderConfig$sentry_android_replay_release);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new C46231());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void start(int segmentId, SentryId replayId, SentryReplayEvent.ReplayType replayType) {
        AbstractC4862t.e(replayId, "replayId");
        super.start(segmentId, replayId, replayType);
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.h
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    SessionCaptureStrategy.start$lambda$0(this.f38669a, iScope);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() throws Exception {
        ReplayCache cache = getCache();
        createCurrentSegment("stop", new C46241(cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null));
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.i
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    SessionCaptureStrategy.stop$lambda$1(iScope);
                }
            });
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SessionCaptureStrategy(SentryOptions options, IScopes iScopes, ICurrentDateProvider dateProvider, ScheduledExecutorService executor, l lVar) {
        super(options, iScopes, dateProvider, executor, lVar);
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(dateProvider, "dateProvider");
        AbstractC4862t.e(executor, "executor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public CaptureStrategy convert() {
        return this;
    }
}
