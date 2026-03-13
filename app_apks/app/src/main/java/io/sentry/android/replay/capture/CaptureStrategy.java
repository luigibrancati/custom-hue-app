package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import fc.C4015H;
import gc.C4206t;
import io.sentry.Breadcrumb;
import io.sentry.Hint;
import io.sentry.IScope;
import io.sentry.IScopes;
import io.sentry.ReplayRecording;
import io.sentry.ScopeCallback;
import io.sentry.SentryBaseEvent;
import io.sentry.SentryOptions;
import io.sentry.SentryReplayEvent;
import io.sentry.android.replay.GeneratedVideo;
import io.sentry.android.replay.ReplayCache;
import io.sentry.android.replay.ScreenshotRecorderConfig;
import io.sentry.android.replay.capture.CaptureStrategy;
import io.sentry.protocol.Request;
import io.sentry.protocol.SentryId;
import io.sentry.rrweb.RRWebEvent;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import vc.l;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\b`\u0018\u0000 C2\u00020\u0001:\u0002CDJ/\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000e\u0010\fJ+\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001c\u001a\u00020\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0018\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u0018H&¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH&¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"H&¢\u0006\u0004\b$\u0010%J\u0019\u0010(\u001a\u00020\b2\b\u0010'\u001a\u0004\u0018\u00010&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u0000H&¢\u0006\u0004\b*\u0010+R\u001c\u00100\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00105\u001a\u00020\u00048&@&X¦\u000e¢\u0006\f\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u0016\u00109\u001a\u0004\u0018\u0001068&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u001c\u0010\u0007\u001a\u00020\u00068&@&X¦\u000e¢\u0006\f\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001e\u0010B\u001a\u0004\u0018\u00010\u00128&@&X¦\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b@\u0010A¨\u0006E"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy;", "", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "Lio/sentry/protocol/SentryId;", "replayId", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "Lfc/H;", "start", "(ILio/sentry/protocol/SentryId;Lio/sentry/SentryReplayEvent$ReplayType;)V", "stop", "()V", "pause", "resume", "", "isTerminating", "Lkotlin/Function1;", "Ljava/util/Date;", "onSegmentSent", "captureReplay", "(ZLvc/l;)V", "Landroid/graphics/Bitmap;", "bitmap", "Lkotlin/Function2;", "Lio/sentry/android/replay/ReplayCache;", "", "store", "onScreenshotRecorded", "(Landroid/graphics/Bitmap;Lvc/p;)V", "Lio/sentry/android/replay/ScreenshotRecorderConfig;", "recorderConfig", "onConfigurationChanged", "(Lio/sentry/android/replay/ScreenshotRecorderConfig;)V", "Landroid/view/MotionEvent;", "event", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "", "screen", "onScreenChanged", "(Ljava/lang/String;)V", "convert", "()Lio/sentry/android/replay/capture/CaptureStrategy;", "getCurrentSegment", "()I", "setCurrentSegment", "(I)V", "currentSegment", "getCurrentReplayId", "()Lio/sentry/protocol/SentryId;", "setCurrentReplayId", "(Lio/sentry/protocol/SentryId;)V", "currentReplayId", "Ljava/io/File;", "getReplayCacheDir", "()Ljava/io/File;", "replayCacheDir", "getReplayType", "()Lio/sentry/SentryReplayEvent$ReplayType;", "setReplayType", "(Lio/sentry/SentryReplayEvent$ReplayType;)V", "getSegmentTimestamp", "()Ljava/util/Date;", "setSegmentTimestamp", "(Ljava/util/Date;)V", "segmentTimestamp", "Companion", "ReplaySegment", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface CaptureStrategy {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\b\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\u0007J\u008d\u0001\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001fH\u0002¢\u0006\u0004\b#\u0010$J\u0099\u0001\u0010-\u001a\u00020\"2\b\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010\u0016\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00112\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f¢\u0006\u0004\b-\u0010.J=\u00105\u001a\u0002012\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u001f2\u0006\u0010/\u001a\u00020\u00172\u0016\b\u0002\u00102\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u000201\u0018\u000100H\u0000¢\u0006\u0004\b3\u00104R\u0014\u00106\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\u00178\u0002X\u0082T¢\u0006\u0006\n\u0004\b8\u00107¨\u00069"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$Companion;", "", "<init>", "()V", "Lio/sentry/Breadcrumb;", "", "isNetworkAvailable", "(Lio/sentry/Breadcrumb;)Z", "isNetworkConnectivity", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Ljava/io/File;", "video", "Lio/sentry/protocol/SentryId;", "currentReplayId", "Ljava/util/Date;", "segmentTimestamp", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "height", "width", RRWebVideoEvent.JsonKeys.FRAME_COUNT, RRWebVideoEvent.JsonKeys.FRAME_RATE, "", "videoDuration", "Lio/sentry/SentryReplayEvent$ReplayType;", "replayType", "", "screenAtStart", "", SentryBaseEvent.JsonKeys.BREADCRUMBS, "Ljava/util/Deque;", "Lio/sentry/rrweb/RRWebEvent;", "events", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "buildReplay", "(Lio/sentry/SentryOptions;Ljava/io/File;Lio/sentry/protocol/SentryId;Ljava/util/Date;IIIIIJLio/sentry/SentryReplayEvent$ReplayType;Ljava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lio/sentry/IScopes;", "scopes", "duration", "currentSegmentTimestamp", "replayId", "Lio/sentry/android/replay/ReplayCache;", "cache", "bitRate", "createSegment", "(Lio/sentry/IScopes;Lio/sentry/SentryOptions;JLjava/util/Date;Lio/sentry/protocol/SentryId;IIILio/sentry/SentryReplayEvent$ReplayType;Lio/sentry/android/replay/ReplayCache;IILjava/lang/String;Ljava/util/List;Ljava/util/Deque;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "until", "Lkotlin/Function1;", "Lfc/H;", "callback", "rotateEvents$sentry_android_replay_release", "(Ljava/util/Deque;JLvc/l;)V", "rotateEvents", "NETWORK_BREADCRUMB_START_OFFSET", "J", "MAX_SEGMENT_DURATION", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final long MAX_SEGMENT_DURATION = 300000;
        private static final long NETWORK_BREADCRUMB_START_OFFSET = 5000;

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x0124  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private final io.sentry.android.replay.capture.CaptureStrategy.ReplaySegment buildReplay(io.sentry.SentryOptions r19, java.io.File r20, io.sentry.protocol.SentryId r21, java.util.Date r22, int r23, int r24, int r25, int r26, int r27, long r28, io.sentry.SentryReplayEvent.ReplayType r30, java.lang.String r31, java.util.List<io.sentry.Breadcrumb> r32, java.util.Deque<io.sentry.rrweb.RRWebEvent> r33) {
            /*
                Method dump skipped, instruction units count: 397
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.capture.CaptureStrategy.Companion.buildReplay(io.sentry.SentryOptions, java.io.File, io.sentry.protocol.SentryId, java.util.Date, int, int, int, int, int, long, io.sentry.SentryReplayEvent$ReplayType, java.lang.String, java.util.List, java.util.Deque):io.sentry.android.replay.capture.CaptureStrategy$ReplaySegment");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void createSegment$lambda$1(L l10, IScope scope) {
            AbstractC4862t.e(scope, "scope");
            l10.f39776a = new ArrayList(scope.getBreadcrumbs());
        }

        private final boolean isNetworkAvailable(Breadcrumb breadcrumb) {
            if (breadcrumb == null || !AbstractC4862t.a(breadcrumb.getCategory(), "network.event")) {
                return false;
            }
            Map<String, Object> data = breadcrumb.getData();
            AbstractC4862t.d(data, "getData(...)");
            Object obj = data.get("action");
            if (obj == null) {
                obj = null;
            }
            return AbstractC4862t.a(obj, "NETWORK_AVAILABLE");
        }

        private final boolean isNetworkConnectivity(Breadcrumb breadcrumb) {
            return AbstractC4862t.a(breadcrumb.getCategory(), "network.event") && breadcrumb.getData().containsKey("network_type");
        }

        public static /* synthetic */ void rotateEvents$sentry_android_replay_release$default(Companion companion, Deque deque, long j10, l lVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                lVar = null;
            }
            companion.rotateEvents$sentry_android_replay_release(deque, j10, lVar);
        }

        public final ReplaySegment createSegment(IScopes scopes, SentryOptions options, long duration, Date currentSegmentTimestamp, SentryId replayId, int segmentId, int height, int width, SentryReplayEvent.ReplayType replayType, ReplayCache cache, int frameRate, int bitRate, String screenAtStart, List<Breadcrumb> breadcrumbs, Deque<RRWebEvent> events) {
            GeneratedVideo generatedVideoCreateVideoOf$default;
            List<Breadcrumb> list;
            AbstractC4862t.e(options, "options");
            AbstractC4862t.e(currentSegmentTimestamp, "currentSegmentTimestamp");
            AbstractC4862t.e(replayId, "replayId");
            AbstractC4862t.e(replayType, "replayType");
            AbstractC4862t.e(events, "events");
            if (cache == null || (generatedVideoCreateVideoOf$default = ReplayCache.createVideoOf$default(cache, Math.min(duration, 300000L), currentSegmentTimestamp.getTime(), segmentId, height, width, frameRate, bitRate, null, 128, null)) == null) {
                return ReplaySegment.Failed.INSTANCE;
            }
            File video = generatedVideoCreateVideoOf$default.getVideo();
            int frameCount = generatedVideoCreateVideoOf$default.getFrameCount();
            long duration2 = generatedVideoCreateVideoOf$default.getDuration();
            if (breadcrumbs == null) {
                final L l10 = new L();
                l10.f39776a = C4206t.k();
                if (scopes != null) {
                    scopes.configureScope(new ScopeCallback() { // from class: io.sentry.android.replay.capture.e
                        @Override // io.sentry.ScopeCallback
                        public final void run(IScope iScope) {
                            CaptureStrategy.Companion.createSegment$lambda$1(l10, iScope);
                        }
                    });
                }
                list = (List) l10.f39776a;
            } else {
                list = breadcrumbs;
            }
            return buildReplay(options, video, replayId, currentSegmentTimestamp, segmentId, height, width, frameCount, frameRate, duration2, replayType, screenAtStart, list, events);
        }

        public final void rotateEvents$sentry_android_replay_release(Deque<RRWebEvent> events, long until, l callback) {
            AbstractC4862t.e(events, "events");
            Iterator<RRWebEvent> it = events.iterator();
            AbstractC4862t.d(it, "iterator(...)");
            while (it.hasNext()) {
                RRWebEvent next = it.next();
                if (next.getTimestamp() < until) {
                    if (callback != null) {
                        AbstractC4862t.b(next);
                        callback.invoke(next);
                    }
                    it.remove();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "", "()V", "Created", "Failed", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Failed;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class ReplaySegment {
        public static final int $stable = 0;

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0016¨\u0006'"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "Lio/sentry/SentryReplayEvent;", "replay", "Lio/sentry/ReplayRecording;", "recording", "<init>", "(Lio/sentry/SentryReplayEvent;Lio/sentry/ReplayRecording;)V", "Lio/sentry/IScopes;", "scopes", "Lio/sentry/Hint;", "hint", "Lfc/H;", "capture", "(Lio/sentry/IScopes;Lio/sentry/Hint;)V", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "setSegmentId", "(I)V", "component1", "()Lio/sentry/SentryReplayEvent;", "component2", "()Lio/sentry/ReplayRecording;", "copy", "(Lio/sentry/SentryReplayEvent;Lio/sentry/ReplayRecording;)Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Created;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", Request.JsonKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lio/sentry/SentryReplayEvent;", "getReplay", "Lio/sentry/ReplayRecording;", "getRecording", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Created extends ReplaySegment {
            public static final int $stable = 8;
            private final ReplayRecording recording;
            private final SentryReplayEvent replay;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Created(SentryReplayEvent replay, ReplayRecording recording) {
                super(null);
                AbstractC4862t.e(replay, "replay");
                AbstractC4862t.e(recording, "recording");
                this.replay = replay;
                this.recording = recording;
            }

            public static /* synthetic */ void capture$default(Created created, IScopes iScopes, Hint hint, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    hint = new Hint();
                }
                created.capture(iScopes, hint);
            }

            public static /* synthetic */ Created copy$default(Created created, SentryReplayEvent sentryReplayEvent, ReplayRecording replayRecording, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    sentryReplayEvent = created.replay;
                }
                if ((i10 & 2) != 0) {
                    replayRecording = created.recording;
                }
                return created.copy(sentryReplayEvent, replayRecording);
            }

            public final void capture(IScopes scopes, Hint hint) {
                AbstractC4862t.e(hint, "hint");
                if (scopes != null) {
                    SentryReplayEvent sentryReplayEvent = this.replay;
                    hint.setReplayRecording(this.recording);
                    C4015H c4015h = C4015H.f34254a;
                    scopes.captureReplay(sentryReplayEvent, hint);
                }
            }

            /* JADX INFO: renamed from: component1, reason: from getter */
            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            /* JADX INFO: renamed from: component2, reason: from getter */
            public final ReplayRecording getRecording() {
                return this.recording;
            }

            public final Created copy(SentryReplayEvent replay, ReplayRecording recording) {
                AbstractC4862t.e(replay, "replay");
                AbstractC4862t.e(recording, "recording");
                return new Created(replay, recording);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Created)) {
                    return false;
                }
                Created created = (Created) other;
                return AbstractC4862t.a(this.replay, created.replay) && AbstractC4862t.a(this.recording, created.recording);
            }

            public final ReplayRecording getRecording() {
                return this.recording;
            }

            public final SentryReplayEvent getReplay() {
                return this.replay;
            }

            public int hashCode() {
                return (this.replay.hashCode() * 31) + this.recording.hashCode();
            }

            public final void setSegmentId(int segmentId) {
                this.replay.setSegmentId(segmentId);
                List<? extends RRWebEvent> payload = this.recording.getPayload();
                if (payload != null) {
                    for (RRWebEvent rRWebEvent : payload) {
                        if (rRWebEvent instanceof RRWebVideoEvent) {
                            ((RRWebVideoEvent) rRWebEvent).setSegmentId(segmentId);
                        }
                    }
                }
            }

            public String toString() {
                return "Created(replay=" + this.replay + ", recording=" + this.recording + ')';
            }
        }

        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment$Failed;", "Lio/sentry/android/replay/capture/CaptureStrategy$ReplaySegment;", "()V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Failed extends ReplaySegment {
            public static final int $stable = 0;
            public static final Failed INSTANCE = new Failed();

            private Failed() {
                super(null);
            }
        }

        public /* synthetic */ ReplaySegment(AbstractC4854k abstractC4854k) {
            this();
        }

        private ReplaySegment() {
        }
    }

    void captureReplay(boolean isTerminating, l onSegmentSent);

    CaptureStrategy convert();

    SentryId getCurrentReplayId();

    int getCurrentSegment();

    File getReplayCacheDir();

    SentryReplayEvent.ReplayType getReplayType();

    Date getSegmentTimestamp();

    void onConfigurationChanged(ScreenshotRecorderConfig recorderConfig);

    void onScreenChanged(String screen);

    void onScreenshotRecorded(Bitmap bitmap, p store);

    void onTouchEvent(MotionEvent event);

    void pause();

    void resume();

    void setCurrentReplayId(SentryId sentryId);

    void setCurrentSegment(int i10);

    void setReplayType(SentryReplayEvent.ReplayType replayType);

    void setSegmentTimestamp(Date date);

    void start(int segmentId, SentryId replayId, SentryReplayEvent.ReplayType replayType);

    void stop();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onScreenshotRecorded$default(CaptureStrategy captureStrategy, Bitmap bitmap, p pVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onScreenshotRecorded");
            }
            if ((i10 & 1) != 0) {
                bitmap = null;
            }
            captureStrategy.onScreenshotRecorded(bitmap, pVar);
        }

        public static /* synthetic */ void start$default(CaptureStrategy captureStrategy, int i10, SentryId sentryId, SentryReplayEvent.ReplayType replayType, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                sentryId = new SentryId();
            }
            if ((i11 & 4) != 0) {
                replayType = null;
            }
            captureStrategy.start(i10, sentryId, replayType);
        }

        public static void onScreenChanged(CaptureStrategy captureStrategy, String str) {
        }
    }
}
