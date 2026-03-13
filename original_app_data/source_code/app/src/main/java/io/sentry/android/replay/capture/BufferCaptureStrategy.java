package io.sentry.android.replay.capture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import fc.C4015H;
import gc.C4206t;
import gc.y;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.DateUtils;
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
import io.sentry.android.replay.util.SamplingKt;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.transport.ICurrentDateProvider;
import io.sentry.util.FileUtils;
import io.sentry.util.Random;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.v;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000 E2\u00020\u0001:\u0001EBI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010#\u001a\u00020\u00142\u0006\u0010 \u001a\u00020\u001f2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u00140\fH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0014H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0014H\u0016¢\u0006\u0004\b'\u0010&J+\u0010,\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\u00140\fH\u0016¢\u0006\u0004\b,\u0010-J3\u00102\u001a\u00020\u00142\b\u0010/\u001a\u0004\u0018\u00010.2\u0018\u00101\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001400H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00142\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00109\u001a\u000208H\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00142\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010BR\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010D¨\u0006F"}, d2 = {"Lio/sentry/android/replay/capture/BufferCaptureStrategy;", "Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/IScopes;", "scopes", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Lio/sentry/util/Random;", "random", "Ljava/util/concurrent/ScheduledExecutorService;", "executor", "Lkotlin/Function1;", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/IScopes;Lio/sentry/transport/ICurrentDateProvider;Lio/sentry/util/Random;Ljava/util/concurrent/ScheduledExecutorService;Lvc/l;)V", "Ljava/io/File;", Constants.FILE, "Lfc/H;", "deleteFile", "(Ljava/io/File;)V", "", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "capture", "(Ljava/util/List;)V", "", "bufferLimit", "rotate", "(Ljava/util/List;J)V", "", "taskName", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "onSegmentCreated", "createCurrentSegment", "(Ljava/lang/String;Lvc/l;)V", "pause", "()V", "stop", "", "isTerminating", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLvc/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lvc/p;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Lio/sentry/android/replay/capture/CaptureStrategy;", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "Lio/sentry/transport/ICurrentDateProvider;", "Lio/sentry/util/Random;", "bufferedSegments", "Ljava/util/List;", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class BufferCaptureStrategy extends BaseCaptureStrategy {
    private static final long ENVELOPE_PROCESSING_DELAY = 100;
    private static final String TAG = "BufferCaptureStrategy";
    private final List<CaptureStrategy.ReplaySegment.Created> bufferedSegments;
    private final ICurrentDateProvider dateProvider;
    private final SentryOptions options;
    private final Random random;
    private final IScopes scopes;
    public static final int $stable = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$captureReplay$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "segment", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass2 extends v implements l {
        final /* synthetic */ l $onSegmentSent;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(l lVar) {
            super(1);
            this.$onSegmentSent = lVar;
        }

        @Override // vc.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
            invoke((CaptureStrategy.ReplaySegment) obj);
            return C4015H.f34254a;
        }

        public final void invoke(CaptureStrategy.ReplaySegment segment) throws InterruptedException {
            AbstractC4862t.e(segment, "segment");
            BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
            bufferCaptureStrategy.capture(bufferCaptureStrategy.bufferedSegments);
            if (segment instanceof CaptureStrategy.ReplaySegment.Created) {
                CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) segment;
                CaptureStrategy.ReplaySegment.Created.capture$default(created, BufferCaptureStrategy.this.scopes, null, 2, null);
                l lVar = this.$onSegmentSent;
                Date timestamp = created.getReplay().getTimestamp();
                AbstractC4862t.d(timestamp, "getTimestamp(...)");
                lVar.invoke(timestamp);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$onConfigurationChanged$1, reason: invalid class name */
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
                BufferCaptureStrategy.this.bufferedSegments.add(segment);
                BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$pause$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "segment", "Lfc/H;", "invoke", "(Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46211 extends v implements l {
        public C46211() {
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
                BufferCaptureStrategy.this.bufferedSegments.add(segment);
                BufferCaptureStrategy bufferCaptureStrategy = BufferCaptureStrategy.this;
                bufferCaptureStrategy.setCurrentSegment(bufferCaptureStrategy.getCurrentSegment() + 1);
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BufferCaptureStrategy$rotate$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "invoke", "(Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class C46221 extends v implements l {
        final /* synthetic */ long $bufferLimit;
        final /* synthetic */ I $removed;
        final /* synthetic */ BufferCaptureStrategy this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46221(long j10, BufferCaptureStrategy bufferCaptureStrategy, I i10) {
            super(1);
            this.$bufferLimit = j10;
            this.this$0 = bufferCaptureStrategy;
            this.$removed = i10;
        }

        @Override // vc.l
        public final Boolean invoke(CaptureStrategy.ReplaySegment.Created it) {
            AbstractC4862t.e(it, "it");
            if (it.getReplay().getTimestamp().getTime() >= this.$bufferLimit) {
                return Boolean.FALSE;
            }
            this.this$0.setCurrentSegment(r0.getCurrentSegment() - 1);
            this.this$0.deleteFile(it.getReplay().getVideoFile());
            this.$removed.f39773a = true;
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ BufferCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, Random random, ScheduledExecutorService scheduledExecutorService, l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(sentryOptions, iScopes, iCurrentDateProvider, random, scheduledExecutorService, (i10 & 32) != 0 ? null : lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void capture(List<CaptureStrategy.ReplaySegment.Created> list) throws InterruptedException {
        CaptureStrategy.ReplaySegment.Created created = (CaptureStrategy.ReplaySegment.Created) y.J(list);
        while (created != null) {
            CaptureStrategy.ReplaySegment.Created.capture$default(created, this.scopes, null, 2, null);
            created = (CaptureStrategy.ReplaySegment.Created) y.J(list);
            Thread.sleep(ENVELOPE_PROCESSING_DELAY);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void captureReplay$lambda$1(BufferCaptureStrategy bufferCaptureStrategy, IScope it) {
        AbstractC4862t.e(it, "it");
        it.setReplayId(bufferCaptureStrategy.getCurrentReplayId());
    }

    private final void createCurrentSegment(String taskName, final l onSegmentCreated) {
        final Date dateTime;
        Long lFirstFrameTimestamp$sentry_android_replay_release;
        final ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Recorder config is not set, not creating segment for task: " + taskName, new Object[0]);
            return;
        }
        long errorReplayDuration = this.options.getSessionReplay().getErrorReplayDuration();
        long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        ReplayCache cache = getCache();
        if (cache == null || (lFirstFrameTimestamp$sentry_android_replay_release = cache.firstFrameTimestamp$sentry_android_replay_release()) == null || (dateTime = DateUtils.getDateTime(lFirstFrameTimestamp$sentry_android_replay_release.longValue())) == null) {
            dateTime = DateUtils.getDateTime(currentTimeMillis - errorReplayDuration);
        }
        AbstractC4862t.b(dateTime);
        final long time = currentTimeMillis - dateTime.getTime();
        final SentryId currentReplayId = getCurrentReplayId();
        getReplayExecutor().submit(new ReplayRunnable("BufferCaptureStrategy." + taskName, new Runnable() { // from class: io.sentry.android.replay.capture.a
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.createCurrentSegment$lambda$5(this.f38646a, time, dateTime, currentReplayId, recorderConfig$sentry_android_replay_release, onSegmentCreated);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createCurrentSegment$lambda$5(BufferCaptureStrategy bufferCaptureStrategy, long j10, Date date, SentryId sentryId, ScreenshotRecorderConfig screenshotRecorderConfig, l lVar) {
        lVar.invoke(BaseCaptureStrategy.createSegmentInternal$default(bufferCaptureStrategy, j10, date, sentryId, bufferCaptureStrategy.getCurrentSegment(), screenshotRecorderConfig.getRecordingHeight(), screenshotRecorderConfig.getRecordingWidth(), screenshotRecorderConfig.getFrameRate(), screenshotRecorderConfig.getBitRate(), null, null, null, null, null, 7936, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onScreenshotRecorded$lambda$2(BufferCaptureStrategy bufferCaptureStrategy, p pVar, long j10) {
        ReplayCache cache = bufferCaptureStrategy.getCache();
        if (cache != null) {
            pVar.invoke(cache, Long.valueOf(j10));
        }
        long currentTimeMillis = bufferCaptureStrategy.dateProvider.getCurrentTimeMillis() - bufferCaptureStrategy.options.getSessionReplay().getErrorReplayDuration();
        ReplayCache cache2 = bufferCaptureStrategy.getCache();
        bufferCaptureStrategy.setScreenAtStart(cache2 != null ? cache2.rotate$sentry_android_replay_release(currentTimeMillis) : null);
        bufferCaptureStrategy.rotate(bufferCaptureStrategy.bufferedSegments, currentTimeMillis);
    }

    private final void rotate(List<CaptureStrategy.ReplaySegment.Created> list, long j10) {
        I i10 = new I();
        y.I(list, new C46221(j10, this, i10));
        if (i10.f39773a) {
            int i11 = 0;
            for (Object obj : list) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C4206t.u();
                }
                ((CaptureStrategy.ReplaySegment.Created) obj).setSegmentId(i11);
                i11 = i12;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void stop$lambda$0(File file, BufferCaptureStrategy bufferCaptureStrategy) {
        FileUtils.deleteRecursively(file);
        bufferCaptureStrategy.setCurrentSegment(-1);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void captureReplay(boolean isTerminating, l onSegmentSent) {
        AbstractC4862t.e(onSegmentSent, "onSegmentSent");
        if (!SamplingKt.sample(this.random, this.options.getSessionReplay().getOnErrorSampleRate())) {
            this.options.getLogger().log(SentryLevel.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        IScopes iScopes = this.scopes;
        if (iScopes != null) {
            iScopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.c
                @Override // io.sentry.ScopeCallback
                public final void run(IScope iScope) {
                    BufferCaptureStrategy.captureReplay$lambda$1(this.f38655a, iScope);
                }
            });
        }
        if (!isTerminating) {
            createCurrentSegment("capture_replay", new AnonymousClass2(onSegmentSent));
        } else {
            getIsTerminating().set(true);
            this.options.getLogger().log(SentryLevel.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public CaptureStrategy convert() {
        if (getIsTerminating().get()) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        SessionCaptureStrategy sessionCaptureStrategy = new SessionCaptureStrategy(this.options, this.scopes, this.dateProvider, getReplayExecutor(), null, 16, null);
        sessionCaptureStrategy.setRecorderConfig$sentry_android_replay_release(getRecorderConfig$sentry_android_replay_release());
        sessionCaptureStrategy.start(getCurrentSegment(), getCurrentReplayId(), SentryReplayEvent.ReplayType.BUFFER);
        return sessionCaptureStrategy;
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        AbstractC4862t.e(recorderConfig, "recorderConfig");
        createCurrentSegment("configuration_changed", new AnonymousClass1());
        super.onConfigurationChanged(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenshotRecorded(Bitmap bitmap, final p store) {
        AbstractC4862t.e(store, "store");
        final long currentTimeMillis = this.dateProvider.getCurrentTimeMillis();
        getReplayExecutor().submit(new ReplayRunnable("BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.onScreenshotRecorded$lambda$2(this.f38652a, store, currentTimeMillis);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(MotionEvent event) {
        AbstractC4862t.e(event, "event");
        super.onTouchEvent(event);
        CaptureStrategy.Companion.rotateEvents$sentry_android_replay_release$default(CaptureStrategy.INSTANCE, getCurrentEvents(), this.dateProvider.getCurrentTimeMillis() - this.options.getSessionReplay().getErrorReplayDuration(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
        createCurrentSegment("pause", new C46211());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.BaseCaptureStrategy, io.sentry.android.replay.capture.CaptureStrategy
    public void stop() throws Exception {
        ReplayCache cache = getCache();
        final File replayCacheDir$sentry_android_replay_release = cache != null ? cache.getReplayCacheDir$sentry_android_replay_release() : null;
        getReplayExecutor().submit(new ReplayRunnable("BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                BufferCaptureStrategy.stop$lambda$0(replayCacheDir$sentry_android_replay_release, this);
            }
        }));
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BufferCaptureStrategy(SentryOptions options, IScopes iScopes, ICurrentDateProvider dateProvider, Random random, ScheduledExecutorService executor, l lVar) {
        super(options, iScopes, dateProvider, executor, lVar);
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(dateProvider, "dateProvider");
        AbstractC4862t.e(random, "random");
        AbstractC4862t.e(executor, "executor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
        this.random = random;
        this.bufferedSegments = new ArrayList();
    }
}
