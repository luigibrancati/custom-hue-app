package io.sentry.android.replay.capture;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import com.google.android.libraries.barhopper.RecognitionOptions;
import fc.C4015H;
import fc.C4029l;
import fc.InterfaceC4028k;
import io.sentry.Breadcrumb;
import io.sentry.DateUtils;
import io.sentry.IScopes;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.android.replay.gestures.ReplayGestureConverter;
import io.sentry.android.replay.util.ReplayRunnable;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebIncrementalSnapshotEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.transport.ICurrentDateProvider;
import java.io.File;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.M;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import vc.InterfaceC6082a;
import vc.l;
import vc.q;
import yc.InterfaceC6462d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u0000 \u0088\u00012\u00020\u0001:\u0004\u0088\u0001\u0089\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJb\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0017\"\u0004\b\u0000\u0010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00122&\b\u0006\u0010\u0016\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0013\u001a\u00020\u00122&\b\u0006\u0010\u0016\u001a \u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\u00150\u0014H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001aJ)\u0010!\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010$J\u000f\u0010&\u001a\u00020\u0015H\u0016¢\u0006\u0004\b&\u0010$J\u0093\u0001\u00108\u001a\u0002072\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)2\u0006\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001c2\u0006\u0010-\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00122\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u000202\u0018\u0001012\u000e\b\u0002\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0004¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00152\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=J\u0017\u0010@\u001a\u00020\u00152\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010BR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010CR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010DR\u001a\u0010\t\u001a\u00020\b8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bF\u0010GR\"\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010HR\u001b\u0010L\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010GR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010Q\u001a\u00020P8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bQ\u0010SR$\u0010/\u001a\u0004\u0018\u00010\f8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b/\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR/\u0010;\u001a\u0004\u0018\u00010:2\b\u0010Y\u001a\u0004\u0018\u00010:8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010=R/\u0010d\u001a\u0004\u0018\u00010)2\b\u0010Y\u001a\u0004\u0018\u00010)8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b_\u0010[\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010f\u001a\u00020e8\u0004X\u0084\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR/\u00100\u001a\u0004\u0018\u00010\u00122\b\u0010Y\u001a\u0004\u0018\u00010\u00128D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\bj\u0010[\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR+\u0010t\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000b8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bo\u0010[\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR+\u0010z\u001a\u00020\u001c2\u0006\u0010Y\u001a\u00020\u001c8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\bu\u0010[\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR+\u0010 \u001a\u00020\u001f2\u0006\u0010Y\u001a\u00020\u001f8V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b{\u0010[\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR%\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u000205048\u0004X\u0084\u0004¢\u0006\u0010\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001a\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0084\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008a\u0001"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy;", "Lio/sentry/android/replay/capture/CaptureStrategy;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/IScopes;", "scopes", "Lio/sentry/transport/ICurrentDateProvider;", "dateProvider", "Ljava/util/concurrent/ScheduledExecutorService;", "replayExecutor", "Lkotlin/Function1;", "Lio/sentry/protocol/SentryId;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/IScopes;Lio/sentry/transport/ICurrentDateProvider;Ljava/util/concurrent/ScheduledExecutorService;Lvc/l;)V", "T", "initialValue", "", "propertyName", "Lkotlin/Function3;", "Lfc/H;", "onChange", "Lyc/d;", "", "persistableAtomicNullable", "(Ljava/lang/Object;Ljava/lang/String;Lvc/q;)Lyc/d;", "persistableAtomic", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "start", "(ILio/sentry/protocol/SentryId;Lio/sentry/SentryReplayEvent$ReplayType;)V", "resume", "()V", "pause", "stop", "", "duration", "Ljava/util/Date;", "currentSegmentTimestamp", "height", "width", RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "cache", "screenAtStart", "", "Lio/sentry/Breadcrumb;", SentryBaseEvent.JsonKeys.BREADCRUMBS, "Ljava/util/Deque;", "Lio/sentry/rrweb/RRWebEvent;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "createSegmentInternal", "(JLjava/util/Date;Lio/sentry/protocol/SentryId;IIIIILio/sentry/SentryReplayEvent$ReplayType;Lio/sentry/android/replay/ReplayCache;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Lio/sentry/SentryOptions;", "Lio/sentry/IScopes;", "Lio/sentry/transport/ICurrentDateProvider;", "Ljava/util/concurrent/ScheduledExecutorService;", "getReplayExecutor", "()Ljava/util/concurrent/ScheduledExecutorService;", "Lvc/l;", "persistingExecutor$delegate", "Lfc/k;", "getPersistingExecutor", "persistingExecutor", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "gestureConverter", "Lio/sentry/android/replay/gestures/ReplayGestureConverter;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isTerminating", "Ljava/util/concurrent/atomic/AtomicBoolean;", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/android/replay/ReplayCache;", "getCache", "()Lio/sentry/android/replay/ReplayCache;", "setCache", "(Lio/sentry/android/replay/ReplayCache;)V", "<set-?>", "recorderConfig$delegate", "Lyc/d;", "getRecorderConfig$sentry_android_replay_release", "()Lio/sentry/android/replay/ScreenshotRecorderConfig;", "setRecorderConfig$sentry_android_replay_release", "segmentTimestamp$delegate", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "replayStartTimestamp", "Ljava/util/concurrent/atomic/AtomicLong;", "getReplayStartTimestamp", "()Ljava/util/concurrent/atomic/AtomicLong;", "screenAtStart$delegate", "getScreenAtStart", "()Ljava/lang/String;", "setScreenAtStart", "(Ljava/lang/String;)V", "currentReplayId$delegate", "getCurrentReplayId", "()Lio/sentry/protocol/SentryId;", "setCurrentReplayId", "(Lio/sentry/protocol/SentryId;)V", "currentReplayId", "currentSegment$delegate", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "replayType$delegate", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "setReplayType", "(Lio/sentry/SentryReplayEvent$ReplayType;)V", "currentEvents", "Ljava/util/Deque;", "getCurrentEvents", "()Ljava/util/Deque;", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "Companion", "ReplayPersistingExecutorServiceThreadFactory", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public abstract class BaseCaptureStrategy implements CaptureStrategy {
    private static final String TAG = "CaptureStrategy";
    private ReplayCache cache;
    private final Deque<RRWebEvent> currentEvents;

    /* JADX INFO: renamed from: currentReplayId$delegate, reason: from kotlin metadata */
    private final InterfaceC6462d currentReplayId;

    /* JADX INFO: renamed from: currentSegment$delegate, reason: from kotlin metadata */
    private final InterfaceC6462d currentSegment;
    private final ICurrentDateProvider dateProvider;
    private final ReplayGestureConverter gestureConverter;
    private final AtomicBoolean isTerminating;
    private final SentryOptions options;

    /* JADX INFO: renamed from: persistingExecutor$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k persistingExecutor;

    /* JADX INFO: renamed from: recorderConfig$delegate, reason: from kotlin metadata */
    private final InterfaceC6462d recorderConfig;
    private final l replayCacheProvider;
    private final ScheduledExecutorService replayExecutor;
    private final AtomicLong replayStartTimestamp;

    /* JADX INFO: renamed from: replayType$delegate, reason: from kotlin metadata */
    private final InterfaceC6462d replayType;
    private final IScopes scopes;

    /* JADX INFO: renamed from: screenAtStart$delegate, reason: from kotlin metadata */
    private final InterfaceC6462d screenAtStart;

    /* JADX INFO: renamed from: segmentTimestamp$delegate, reason: from kotlin metadata */
    private final InterfaceC6462d segmentTimestamp;
    static final /* synthetic */ Cc.l[] $$delegatedProperties = {M.e(new y(BaseCaptureStrategy.class, "recorderConfig", "getRecorderConfig$sentry_android_replay_release()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), M.e(new y(BaseCaptureStrategy.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), M.e(new y(BaseCaptureStrategy.class, "screenAtStart", "getScreenAtStart()Ljava/lang/String;", 0)), M.e(new y(BaseCaptureStrategy.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), M.e(new y(BaseCaptureStrategy.class, "currentSegment", "getCurrentSegment()I", 0)), M.e(new y(BaseCaptureStrategy.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lio/sentry/android/replay/capture/BaseCaptureStrategy$ReplayPersistingExecutorServiceThreadFactory;", "Ljava/util/concurrent/ThreadFactory;", "()V", "cnt", "", "newThread", "Ljava/lang/Thread;", "r", "Ljava/lang/Runnable;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ReplayPersistingExecutorServiceThreadFactory implements ThreadFactory {
        private int cnt;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r10) {
            AbstractC4862t.e(r10, "r");
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryReplayPersister-");
            int i10 = this.cnt;
            this.cnt = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(r10, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomic$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "newValue", "Lfc/H;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class AnonymousClass1 extends v implements q {
        final /* synthetic */ String $propertyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override // vc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Exception {
            invoke((String) obj, obj2, obj3);
            return C4015H.f34254a;
        }

        public final void invoke(String str, Object obj, Object obj2) throws Exception {
            ReplayCache cache = BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00018\u00002\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"T", "", "<anonymous parameter 0>", "<anonymous parameter 1>", "newValue", "Lfc/H;", "invoke", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class C46201 extends v implements q {
        final /* synthetic */ String $propertyName;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C46201(String str) {
            super(3);
            this.$propertyName = str;
        }

        @Override // vc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) throws Exception {
            invoke((String) obj, obj2, obj3);
            return C4015H.f34254a;
        }

        public final void invoke(String str, Object obj, Object obj2) throws Exception {
            ReplayCache cache = BaseCaptureStrategy.this.getCache();
            if (cache != null) {
                cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName, String.valueOf(obj2));
            }
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001J\u001d\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\u000b\u001a\u0004\u0018\u00018\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ0\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00022\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0012"}, d2 = {"io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2", "Lyc/d;", "", "Lkotlin/Function0;", "Lfc/H;", "task", "runInBackground", "(Lvc/a;)V", "thisRef", "LCc/l;", "property", "getValue", "(Ljava/lang/Object;LCc/l;)Ljava/lang/Object;", "value", "setValue", "(Ljava/lang/Object;LCc/l;Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AnonymousClass2 implements InterfaceC6462d {
        final /* synthetic */ q $onChange;
        final /* synthetic */ String $propertyName;
        final /* synthetic */ BaseCaptureStrategy this$0;
        private final AtomicReference<T> value;

        public AnonymousClass2(T t10, BaseCaptureStrategy baseCaptureStrategy, q qVar, String str) {
            this.this$0 = baseCaptureStrategy;
            this.$onChange = qVar;
            this.$propertyName = str;
            this.value = new AtomicReference<>(t10);
        }

        private final void runInBackground(final InterfaceC6082a task) {
            if (this.this$0.options.getThreadChecker().isMainThread()) {
                this.this$0.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$persistableAtomicNullable$2$runInBackground$1
                    @Override // java.lang.Runnable
                    public final void run() {
                        task.invoke();
                    }
                }));
                return;
            }
            try {
                task.invoke();
            } catch (Throwable th) {
                this.this$0.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
        public T getValue(Object thisRef, Cc.l property) {
            AbstractC4862t.e(property, "property");
            return this.value.get();
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // yc.InterfaceC6462d
        public void setValue(Object thisRef, Cc.l property, T value) {
            AbstractC4862t.e(property, "property");
            Object andSet = this.value.getAndSet(value);
            if (AbstractC4862t.a(andSet, value)) {
                return;
            }
            runInBackground(new BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1(this.$onChange, this.$propertyName, andSet, value));
        }
    }

    public BaseCaptureStrategy(SentryOptions options, IScopes iScopes, ICurrentDateProvider dateProvider, ScheduledExecutorService replayExecutor, l lVar) {
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(dateProvider, "dateProvider");
        AbstractC4862t.e(replayExecutor, "replayExecutor");
        this.options = options;
        this.scopes = iScopes;
        this.dateProvider = dateProvider;
        this.replayExecutor = replayExecutor;
        this.replayCacheProvider = lVar;
        this.persistingExecutor = C4029l.b(new BaseCaptureStrategy$persistingExecutor$2(this));
        this.gestureConverter = new ReplayGestureConverter(dateProvider);
        this.isTerminating = new AtomicBoolean(false);
        final Object obj = null;
        final String str = "";
        this.recorderConfig = new InterfaceC6462d(obj, this, str, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<ScreenshotRecorderConfig> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2 extends v implements InterfaceC6082a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                    m259invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m259invoke() throws Exception {
                    Object obj = this.$oldValue;
                    ScreenshotRecorderConfig screenshotRecorderConfig = (ScreenshotRecorderConfig) this.$value;
                    if (screenshotRecorderConfig == null) {
                        return;
                    }
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_HEIGHT, String.valueOf(screenshotRecorderConfig.getRecordingHeight()));
                    }
                    ReplayCache cache2 = this.this$0.getCache();
                    if (cache2 != null) {
                        cache2.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_WIDTH, String.valueOf(screenshotRecorderConfig.getRecordingWidth()));
                    }
                    ReplayCache cache3 = this.this$0.getCache();
                    if (cache3 != null) {
                        cache3.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_FRAME_RATE, String.valueOf(screenshotRecorderConfig.getFrameRate()));
                    }
                    ReplayCache cache4 = this.this$0.getCache();
                    if (cache4 != null) {
                        cache4.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_BIT_RATE, String.valueOf(screenshotRecorderConfig.getBitRate()));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final InterfaceC6082a task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
            public ScreenshotRecorderConfig getValue(Object thisRef, Cc.l property) {
                AbstractC4862t.e(property, "property");
                return this.value.get();
            }

            @Override // yc.InterfaceC6462d
            public void setValue(Object thisRef, Cc.l property, ScreenshotRecorderConfig value) {
                AbstractC4862t.e(property, "property");
                ScreenshotRecorderConfig andSet = this.value.getAndSet(value);
                if (AbstractC4862t.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0));
            }
        };
        final String str2 = ReplayCache.SEGMENT_KEY_TIMESTAMP;
        this.segmentTimestamp = new InterfaceC6462d(obj, this, str2, this) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Date> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2 extends v implements InterfaceC6082a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                    m260invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m260invoke() throws Exception {
                    Object obj = this.$oldValue;
                    Date date = (Date) this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(ReplayCache.SEGMENT_KEY_TIMESTAMP, date == null ? null : DateUtils.getTimestamp(date));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str2;
                this.this$0 = this;
                this.value = new AtomicReference<>(obj);
            }

            private final void runInBackground(final InterfaceC6082a task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
            public Date getValue(Object thisRef, Cc.l property) {
                AbstractC4862t.e(property, "property");
                return this.value.get();
            }

            @Override // yc.InterfaceC6462d
            public void setValue(Object thisRef, Cc.l property, Date value) {
                AbstractC4862t.e(property, "property");
                Date andSet = this.value.getAndSet(value);
                if (AbstractC4862t.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0));
            }
        };
        this.replayStartTimestamp = new AtomicLong();
        final Object obj2 = null;
        final String str3 = ReplayCache.SEGMENT_KEY_REPLAY_SCREEN_AT_START;
        this.screenAtStart = new InterfaceC6462d(obj2, this, str3, this, str3) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<String> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2 extends v implements InterfaceC6082a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                    m261invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m261invoke() throws Exception {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str3;
                this.this$0 = this;
                this.$propertyName$inlined = str3;
                this.value = new AtomicReference<>(obj2);
            }

            private final void runInBackground(final InterfaceC6082a task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomicNullable$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
            public String getValue(Object thisRef, Cc.l property) {
                AbstractC4862t.e(property, "property");
                return this.value.get();
            }

            @Override // yc.InterfaceC6462d
            public void setValue(Object thisRef, Cc.l property, String value) {
                AbstractC4862t.e(property, "property");
                String andSet = this.value.getAndSet(value);
                if (AbstractC4862t.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final SentryId sentryId = SentryId.EMPTY_ID;
        final String str4 = ReplayCache.SEGMENT_KEY_REPLAY_ID;
        this.currentReplayId = new InterfaceC6462d(sentryId, this, str4, this, str4) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryId> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2 extends v implements InterfaceC6082a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                    m256invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m256invoke() throws Exception {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str4;
                this.this$0 = this;
                this.$propertyName$inlined = str4;
                this.value = new AtomicReference<>(sentryId);
            }

            private final void runInBackground(final InterfaceC6082a task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
            public SentryId getValue(Object thisRef, Cc.l property) {
                AbstractC4862t.e(property, "property");
                return this.value.get();
            }

            @Override // yc.InterfaceC6462d
            public void setValue(Object thisRef, Cc.l property, SentryId value) {
                AbstractC4862t.e(property, "property");
                SentryId andSet = this.value.getAndSet(value);
                if (AbstractC4862t.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final int i10 = -1;
        final String str5 = ReplayCache.SEGMENT_KEY_ID;
        this.currentSegment = new InterfaceC6462d(i10, this, str5, this, str5) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<Integer> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2 extends v implements InterfaceC6082a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                    m257invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m257invoke() throws Exception {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str5;
                this.this$0 = this;
                this.$propertyName$inlined = str5;
                this.value = new AtomicReference<>(i10);
            }

            private final void runInBackground(final InterfaceC6082a task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$2.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
            public Integer getValue(Object thisRef, Cc.l property) {
                AbstractC4862t.e(property, "property");
                return this.value.get();
            }

            @Override // yc.InterfaceC6462d
            public void setValue(Object thisRef, Cc.l property, Integer value) {
                AbstractC4862t.e(property, "property");
                Integer andSet = this.value.getAndSet(value);
                if (AbstractC4862t.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        final Object obj3 = null;
        final String str6 = ReplayCache.SEGMENT_KEY_REPLAY_TYPE;
        this.replayType = new InterfaceC6462d(obj3, this, str6, this, str6) { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3
            final /* synthetic */ String $propertyName;
            final /* synthetic */ String $propertyName$inlined;
            final /* synthetic */ BaseCaptureStrategy this$0;
            final /* synthetic */ BaseCaptureStrategy this$0$inline_fun;
            private final AtomicReference<SentryReplayEvent.ReplayType> value;

            /* JADX INFO: renamed from: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"T", "Lfc/H;", "invoke", "()V", "io/sentry/android/replay/capture/BaseCaptureStrategy$persistableAtomicNullable$2$setValue$1", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class AnonymousClass2 extends v implements InterfaceC6082a {
                final /* synthetic */ Object $oldValue;
                final /* synthetic */ String $propertyName;
                final /* synthetic */ String $propertyName$inlined;
                final /* synthetic */ Object $value;
                final /* synthetic */ BaseCaptureStrategy this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(String str, Object obj, Object obj2, BaseCaptureStrategy baseCaptureStrategy, String str2) {
                    super(0);
                    this.$propertyName = str;
                    this.$oldValue = obj;
                    this.$value = obj2;
                    this.this$0 = baseCaptureStrategy;
                    this.$propertyName$inlined = str2;
                }

                @Override // vc.InterfaceC6082a
                public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                    m258invoke();
                    return C4015H.f34254a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m258invoke() throws Exception {
                    Object obj = this.$value;
                    ReplayCache cache = this.this$0.getCache();
                    if (cache != null) {
                        cache.persistSegmentValues$sentry_android_replay_release(this.$propertyName$inlined, String.valueOf(obj));
                    }
                }
            }

            {
                this.this$0$inline_fun = this;
                this.$propertyName = str6;
                this.this$0 = this;
                this.$propertyName$inlined = str6;
                this.value = new AtomicReference<>(obj3);
            }

            private final void runInBackground(final InterfaceC6082a task) {
                if (this.this$0$inline_fun.options.getThreadChecker().isMainThread()) {
                    this.this$0$inline_fun.getPersistingExecutor().submit(new ReplayRunnable("CaptureStrategy.runInBackground", new Runnable() { // from class: io.sentry.android.replay.capture.BaseCaptureStrategy$special$$inlined$persistableAtomic$default$3.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            task.invoke();
                        }
                    }));
                    return;
                }
                try {
                    task.invoke();
                } catch (Throwable th) {
                    this.this$0$inline_fun.options.getLogger().log(SentryLevel.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                }
            }

            @Override // yc.InterfaceC6462d, yc.InterfaceC6461c
            public SentryReplayEvent.ReplayType getValue(Object thisRef, Cc.l property) {
                AbstractC4862t.e(property, "property");
                return this.value.get();
            }

            @Override // yc.InterfaceC6462d
            public void setValue(Object thisRef, Cc.l property, SentryReplayEvent.ReplayType value) {
                AbstractC4862t.e(property, "property");
                SentryReplayEvent.ReplayType andSet = this.value.getAndSet(value);
                if (AbstractC4862t.a(andSet, value)) {
                    return;
                }
                runInBackground(new AnonymousClass2(this.$propertyName, andSet, value, this.this$0, this.$propertyName$inlined));
            }
        };
        this.currentEvents = new ConcurrentLinkedDeque();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CaptureStrategy.ReplaySegment createSegmentInternal$default(BaseCaptureStrategy baseCaptureStrategy, long j10, Date date, SentryId sentryId, int i10, int i11, int i12, int i13, int i14, SentryReplayEvent.ReplayType replayType, ReplayCache replayCache, String str, List list, Deque deque, int i15, Object obj) {
        Deque deque2;
        BaseCaptureStrategy baseCaptureStrategy2;
        long j11;
        Date date2;
        SentryId sentryId2;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
        }
        SentryReplayEvent.ReplayType replayType2 = (i15 & 256) != 0 ? baseCaptureStrategy.getReplayType() : replayType;
        ReplayCache replayCache2 = (i15 & 512) != 0 ? baseCaptureStrategy.cache : replayCache;
        String screenAtStart = (i15 & RecognitionOptions.UPC_E) != 0 ? baseCaptureStrategy.getScreenAtStart() : str;
        List list2 = (i15 & RecognitionOptions.PDF417) != 0 ? null : list;
        if ((i15 & RecognitionOptions.AZTEC) != 0) {
            deque2 = baseCaptureStrategy.currentEvents;
            baseCaptureStrategy2 = baseCaptureStrategy;
            date2 = date;
            sentryId2 = sentryId;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
            j11 = j10;
        } else {
            deque2 = deque;
            baseCaptureStrategy2 = baseCaptureStrategy;
            j11 = j10;
            date2 = date;
            sentryId2 = sentryId;
            i16 = i10;
            i17 = i11;
            i18 = i12;
            i19 = i13;
            i20 = i14;
        }
        return baseCaptureStrategy2.createSegmentInternal(j11, date2, sentryId2, i16, i17, i18, i19, i20, replayType2, replayCache2, screenAtStart, list2, deque2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ScheduledExecutorService getPersistingExecutor() {
        return (ScheduledExecutorService) this.persistingExecutor.getValue();
    }

    private final <T> InterfaceC6462d persistableAtomic(T initialValue, String propertyName, q onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ InterfaceC6462d persistableAtomic$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, q qVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomic");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            qVar = baseCaptureStrategy.new AnonymousClass1(str);
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, qVar, str);
    }

    private final <T> InterfaceC6462d persistableAtomicNullable(T initialValue, String propertyName, q onChange) {
        return new AnonymousClass2(initialValue, this, onChange, propertyName);
    }

    public static /* synthetic */ InterfaceC6462d persistableAtomicNullable$default(BaseCaptureStrategy baseCaptureStrategy, Object obj, String str, q qVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: persistableAtomicNullable");
        }
        if ((i10 & 1) != 0) {
            obj = null;
        }
        if ((i10 & 4) != 0) {
            qVar = baseCaptureStrategy.new C46201(str);
        }
        return new AnonymousClass2(obj, baseCaptureStrategy, qVar, str);
    }

    public final CaptureStrategy.ReplaySegment createSegmentInternal(long duration, Date currentSegmentTimestamp, SentryId replayId, int segmentId, int height, int width, int frameRate, int bitRate, SentryReplayEvent.ReplayType replayType, ReplayCache cache, String screenAtStart, List<Breadcrumb> breadcrumbs, Deque<RRWebEvent> events) {
        AbstractC4862t.e(currentSegmentTimestamp, "currentSegmentTimestamp");
        AbstractC4862t.e(replayId, "replayId");
        AbstractC4862t.e(replayType, "replayType");
        AbstractC4862t.e(events, "events");
        return CaptureStrategy.INSTANCE.createSegment(this.scopes, this.options, duration, currentSegmentTimestamp, replayId, segmentId, height, width, replayType, cache, frameRate, bitRate, screenAtStart, breadcrumbs, events);
    }

    public final ReplayCache getCache() {
        return this.cache;
    }

    public final Deque<RRWebEvent> getCurrentEvents() {
        return this.currentEvents;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public SentryId getCurrentReplayId() {
        return (SentryId) this.currentReplayId.getValue(this, $$delegatedProperties[3]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public int getCurrentSegment() {
        return ((Number) this.currentSegment.getValue(this, $$delegatedProperties[4])).intValue();
    }

    public final ScreenshotRecorderConfig getRecorderConfig$sentry_android_replay_release() {
        return (ScreenshotRecorderConfig) this.recorderConfig.getValue(this, $$delegatedProperties[0]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public File getReplayCacheDir() {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            return replayCache.getReplayCacheDir$sentry_android_replay_release();
        }
        return null;
    }

    public final ScheduledExecutorService getReplayExecutor() {
        return this.replayExecutor;
    }

    public final AtomicLong getReplayStartTimestamp() {
        return this.replayStartTimestamp;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public SentryReplayEvent.ReplayType getReplayType() {
        return (SentryReplayEvent.ReplayType) this.replayType.getValue(this, $$delegatedProperties[5]);
    }

    public final String getScreenAtStart() {
        return (String) this.screenAtStart.getValue(this, $$delegatedProperties[2]);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public Date getSegmentTimestamp() {
        return (Date) this.segmentTimestamp.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: renamed from: isTerminating, reason: from getter */
    public final AtomicBoolean getIsTerminating() {
        return this.isTerminating;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig) {
        AbstractC4862t.e(recorderConfig, "recorderConfig");
        setRecorderConfig$sentry_android_replay_release(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onScreenChanged(String str) {
        CaptureStrategy.DefaultImpls.onScreenChanged(this, str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void onTouchEvent(MotionEvent event) {
        List<RRWebIncrementalSnapshotEvent> listConvert;
        AbstractC4862t.e(event, "event");
        ScreenshotRecorderConfig recorderConfig$sentry_android_replay_release = getRecorderConfig$sentry_android_replay_release();
        if (recorderConfig$sentry_android_replay_release == null || (listConvert = this.gestureConverter.convert(event, recorderConfig$sentry_android_replay_release)) == null) {
            return;
        }
        gc.y.C(this.currentEvents, listConvert);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void resume() {
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
    }

    public final void setCache(ReplayCache replayCache) {
        this.cache = replayCache;
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentReplayId(SentryId sentryId) {
        AbstractC4862t.e(sentryId, "<set-?>");
        this.currentReplayId.setValue(this, $$delegatedProperties[3], sentryId);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setCurrentSegment(int i10) {
        this.currentSegment.setValue(this, $$delegatedProperties[4], Integer.valueOf(i10));
    }

    public final void setRecorderConfig$sentry_android_replay_release(ScreenshotRecorderConfig screenshotRecorderConfig) {
        this.recorderConfig.setValue(this, $$delegatedProperties[0], screenshotRecorderConfig);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setReplayType(SentryReplayEvent.ReplayType replayType) {
        AbstractC4862t.e(replayType, "<set-?>");
        this.replayType.setValue(this, $$delegatedProperties[5], replayType);
    }

    public final void setScreenAtStart(String str) {
        this.screenAtStart.setValue(this, $$delegatedProperties[2], str);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void setSegmentTimestamp(Date date) {
        this.segmentTimestamp.setValue(this, $$delegatedProperties[1], date);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void start(int segmentId, SentryId replayId, SentryReplayEvent.ReplayType replayType) {
        ReplayCache replayCache;
        AbstractC4862t.e(replayId, "replayId");
        l lVar = this.replayCacheProvider;
        if (lVar == null || (replayCache = (ReplayCache) lVar.invoke(replayId)) == null) {
            replayCache = new ReplayCache(this.options, replayId);
        }
        this.cache = replayCache;
        setCurrentReplayId(replayId);
        setCurrentSegment(segmentId);
        if (replayType == null) {
            replayType = this instanceof SessionCaptureStrategy ? SentryReplayEvent.ReplayType.SESSION : SentryReplayEvent.ReplayType.BUFFER;
        }
        setReplayType(replayType);
        setSegmentTimestamp(DateUtils.getCurrentDateTime());
        this.replayStartTimestamp.set(this.dateProvider.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void stop() throws Exception {
        ReplayCache replayCache = this.cache;
        if (replayCache != null) {
            replayCache.close();
        }
        this.replayStartTimestamp.set(0L);
        setSegmentTimestamp(null);
        SentryId EMPTY_ID = SentryId.EMPTY_ID;
        AbstractC4862t.d(EMPTY_ID, "EMPTY_ID");
        setCurrentReplayId(EMPTY_ID);
    }

    @Override // io.sentry.android.replay.capture.CaptureStrategy
    public void pause() {
    }

    public /* synthetic */ BaseCaptureStrategy(SentryOptions sentryOptions, IScopes iScopes, ICurrentDateProvider iCurrentDateProvider, ScheduledExecutorService scheduledExecutorService, l lVar, int i10, AbstractC4854k abstractC4854k) {
        this(sentryOptions, iScopes, iCurrentDateProvider, scheduledExecutorService, (i10 & 16) != 0 ? null : lVar);
    }
}
