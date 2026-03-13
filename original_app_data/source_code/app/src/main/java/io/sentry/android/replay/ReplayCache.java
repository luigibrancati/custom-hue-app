package io.sentry.android.replay;

import Bc.g;
import Bc.k;
import Nd.h;
import Od.B;
import Od.C;
import Od.C1823c;
import Od.F;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import fc.AbstractC4040w;
import fc.C4015H;
import fc.C4029l;
import fc.C4034q;
import fc.InterfaceC4028k;
import gc.C4179C;
import gc.y;
import io.flutter.plugins.firebase.crashlytics.Constants;
import io.sentry.ISentryLifecycleToken;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.video.MuxerConfig;
import io.sentry.android.replay.video.SimpleVideoEncoder;
import io.sentry.protocol.SentryId;
import io.sentry.protocol.SentryStackFrame;
import io.sentry.rrweb.RRWebOptionsEvent;
import io.sentry.rrweb.RRWebVideoEvent;
import io.sentry.util.AutoClosableReentrantLock;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.T;
import sc.j;
import sc.l;
import sc.o;
import tc.AbstractC5877a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 U2\u00020\u0001:\u0001UB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0018\u0010\u0019J)\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u001a\u0010\u001cJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u0014H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJQ\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010 \u001a\u00020\u00142\u0006\u0010!\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\"2\u0006\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\"2\u0006\u0010'\u001a\u00020\"2\b\b\u0002\u0010(\u001a\u00020\r¢\u0006\u0004\b*\u0010+J\u0019\u0010/\u001a\u0004\u0018\u00010\u00162\u0006\u0010,\u001a\u00020\u0014H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020\u000fH\u0016¢\u0006\u0004\b0\u00101J!\u00106\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010@\u001a\u00020<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u001d\u0010H\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR \u0010J\u001a\b\u0012\u0004\u0012\u00020\b0I8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR0\u0010P\u001a\u001e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00160Nj\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0016`O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001d\u0010T\u001a\u0004\u0018\u00010\r8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bR\u0010E\u001a\u0004\bS\u0010G¨\u0006V"}, d2 = {"Lio/sentry/android/replay/ReplayCache;", "Ljava/io/Closeable;", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/protocol/SentryId;", "replayId", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;)V", "Lio/sentry/android/replay/ReplayFrame;", "frame", "", "encode", "(Lio/sentry/android/replay/ReplayFrame;)Z", "Ljava/io/File;", Constants.FILE, "Lfc/H;", "deleteFile", "(Ljava/io/File;)V", "Landroid/graphics/Bitmap;", "bitmap", "", "frameTimestamp", "", "screen", "addFrame$sentry_android_replay_release", "(Landroid/graphics/Bitmap;JLjava/lang/String;)V", "addFrame", "screenshot", "(Ljava/io/File;JLjava/lang/String;)V", "firstFrameTimestamp$sentry_android_replay_release", "()Ljava/lang/Long;", "firstFrameTimestamp", "duration", "from", "", RRWebVideoEvent.JsonKeys.SEGMENT_ID, "height", "width", RRWebVideoEvent.JsonKeys.FRAME_RATE, "bitRate", "videoFile", "Lio/sentry/android/replay/GeneratedVideo;", "createVideoOf", "(JJIIIIILjava/io/File;)Lio/sentry/android/replay/GeneratedVideo;", "until", "rotate$sentry_android_replay_release", "(J)Ljava/lang/String;", "rotate", "close", "()V", "key", "value", "persistSegmentValues$sentry_android_replay_release", "(Ljava/lang/String;Ljava/lang/String;)V", "persistSegmentValues", "Lio/sentry/SentryOptions;", "Lio/sentry/protocol/SentryId;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lio/sentry/util/AutoClosableReentrantLock;", "encoderLock", "Lio/sentry/util/AutoClosableReentrantLock;", SentryStackFrame.JsonKeys.LOCK, "framesLock", "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "encoder", "Lio/sentry/android/replay/video/SimpleVideoEncoder;", "replayCacheDir$delegate", "Lfc/k;", "getReplayCacheDir$sentry_android_replay_release", "()Ljava/io/File;", "replayCacheDir", "", "frames", "Ljava/util/List;", "getFrames$sentry_android_replay_release", "()Ljava/util/List;", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "ongoingSegment", "Ljava/util/LinkedHashMap;", "ongoingSegmentFile$delegate", "getOngoingSegmentFile$sentry_android_replay_release", "ongoingSegmentFile", "Companion", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ReplayCache implements Closeable {
    public static final String ONGOING_SEGMENT = ".ongoing_segment";
    public static final String SEGMENT_KEY_BIT_RATE = "config.bit-rate";
    public static final String SEGMENT_KEY_FRAME_RATE = "config.frame-rate";
    public static final String SEGMENT_KEY_HEIGHT = "config.height";
    public static final String SEGMENT_KEY_ID = "segment.id";
    public static final String SEGMENT_KEY_REPLAY_ID = "replay.id";
    public static final String SEGMENT_KEY_REPLAY_RECORDING = "replay.recording";
    public static final String SEGMENT_KEY_REPLAY_SCREEN_AT_START = "replay.screen-at-start";
    public static final String SEGMENT_KEY_REPLAY_TYPE = "replay.type";
    public static final String SEGMENT_KEY_TIMESTAMP = "segment.timestamp";
    public static final String SEGMENT_KEY_WIDTH = "config.width";
    private SimpleVideoEncoder encoder;
    private final AutoClosableReentrantLock encoderLock;
    private final List<ReplayFrame> frames;
    private final AutoClosableReentrantLock framesLock;
    private final AtomicBoolean isClosed;
    private final AutoClosableReentrantLock lock;
    private final LinkedHashMap<String, String> ongoingSegment;

    /* JADX INFO: renamed from: ongoingSegmentFile$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k ongoingSegmentFile;
    private final SentryOptions options;

    /* JADX INFO: renamed from: replayCacheDir$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k replayCacheDir;
    private final SentryId replayId;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014R\u0014\u0010\u001d\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014R\u0014\u0010\u001e\u001a\u00020\u00128\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014¨\u0006\u001f"}, d2 = {"Lio/sentry/android/replay/ReplayCache$Companion;", "", "<init>", "()V", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/protocol/SentryId;", "replayId", "Ljava/io/File;", "makeReplayCacheDir", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;)Ljava/io/File;", "Lkotlin/Function1;", "Lio/sentry/android/replay/ReplayCache;", "replayCacheProvider", "Lio/sentry/android/replay/LastSegmentData;", "fromDisk$sentry_android_replay_release", "(Lio/sentry/SentryOptions;Lio/sentry/protocol/SentryId;Lvc/l;)Lio/sentry/android/replay/LastSegmentData;", "fromDisk", "", "ONGOING_SEGMENT", "Ljava/lang/String;", "SEGMENT_KEY_BIT_RATE", "SEGMENT_KEY_FRAME_RATE", "SEGMENT_KEY_HEIGHT", "SEGMENT_KEY_ID", "SEGMENT_KEY_REPLAY_ID", "SEGMENT_KEY_REPLAY_RECORDING", "SEGMENT_KEY_REPLAY_SCREEN_AT_START", "SEGMENT_KEY_REPLAY_TYPE", "SEGMENT_KEY_TIMESTAMP", "SEGMENT_KEY_WIDTH", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(AbstractC4854k abstractC4854k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean fromDisk$lambda$3(ReplayCache replayCache, File file, String str) throws Exception {
            AbstractC4862t.b(str);
            if (C.D(str, ".jpg", false, 2, null)) {
                File file2 = new File(file, str);
                Long lW = B.w(l.p(file2));
                if (lW != null) {
                    ReplayCache.addFrame$default(replayCache, file2, lW.longValue(), null, 4, null);
                }
            }
            return false;
        }

        public static /* synthetic */ LastSegmentData fromDisk$sentry_android_replay_release$default(Companion companion, SentryOptions sentryOptions, SentryId sentryId, vc.l lVar, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                lVar = null;
            }
            return companion.fromDisk$sentry_android_replay_release(sentryOptions, sentryId, lVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final io.sentry.android.replay.LastSegmentData fromDisk$sentry_android_replay_release(io.sentry.SentryOptions r26, io.sentry.protocol.SentryId r27, vc.l r28) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 576
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.ReplayCache.Companion.fromDisk$sentry_android_replay_release(io.sentry.SentryOptions, io.sentry.protocol.SentryId, vc.l):io.sentry.android.replay.LastSegmentData");
        }

        public final File makeReplayCacheDir(SentryOptions options, SentryId replayId) {
            AbstractC4862t.e(options, "options");
            AbstractC4862t.e(replayId, "replayId");
            String cacheDirPath = options.getCacheDirPath();
            if (cacheDirPath == null || cacheDirPath.length() == 0) {
                options.getLogger().log(SentryLevel.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
                return null;
            }
            String cacheDirPath2 = options.getCacheDirPath();
            AbstractC4862t.b(cacheDirPath2);
            File file = new File(cacheDirPath2, "replay_" + replayId);
            file.mkdirs();
            return file;
        }

        private Companion() {
        }
    }

    public ReplayCache(SentryOptions options, SentryId replayId) {
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(replayId, "replayId");
        this.options = options;
        this.replayId = replayId;
        this.isClosed = new AtomicBoolean(false);
        this.encoderLock = new AutoClosableReentrantLock();
        this.lock = new AutoClosableReentrantLock();
        this.framesLock = new AutoClosableReentrantLock();
        this.replayCacheDir = C4029l.b(new ReplayCache$replayCacheDir$2(this));
        this.frames = new ArrayList();
        this.ongoingSegment = new LinkedHashMap<>();
        this.ongoingSegmentFile = C4029l.b(new ReplayCache$ongoingSegmentFile$2(this));
    }

    public static /* synthetic */ void addFrame$default(ReplayCache replayCache, File file, long j10, String str, int i10, Object obj) throws Exception {
        if ((i10 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame(file, j10, str);
    }

    public static /* synthetic */ void addFrame$sentry_android_replay_release$default(ReplayCache replayCache, Bitmap bitmap, long j10, String str, int i10, Object obj) throws IOException {
        if ((i10 & 4) != 0) {
            str = null;
        }
        replayCache.addFrame$sentry_android_replay_release(bitmap, j10, str);
    }

    public static /* synthetic */ GeneratedVideo createVideoOf$default(ReplayCache replayCache, long j10, long j11, int i10, int i11, int i12, int i13, int i14, File file, int i15, Object obj) {
        int i16;
        File file2;
        if ((i15 & 128) != 0) {
            File replayCacheDir$sentry_android_replay_release = replayCache.getReplayCacheDir$sentry_android_replay_release();
            StringBuilder sb2 = new StringBuilder();
            i16 = i10;
            sb2.append(i16);
            sb2.append(".mp4");
            file2 = new File(replayCacheDir$sentry_android_replay_release, sb2.toString());
        } else {
            i16 = i10;
            file2 = file;
        }
        return replayCache.createVideoOf(j10, j11, i16, i11, i12, i13, i14, file2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteFile(File file) {
        try {
            if (file.delete()) {
                return;
            }
            this.options.getLogger().log(SentryLevel.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    private final boolean encode(ReplayFrame frame) {
        if (frame == null) {
            return false;
        }
        try {
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(frame.getScreenshot().getAbsolutePath());
            ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
            try {
                SimpleVideoEncoder simpleVideoEncoder = this.encoder;
                if (simpleVideoEncoder != null) {
                    AbstractC4862t.b(bitmapDecodeFile);
                    simpleVideoEncoder.encode(bitmapDecodeFile);
                    C4015H c4015h = C4015H.f34254a;
                }
                AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                bitmapDecodeFile.recycle();
                return true;
            } finally {
            }
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.WARNING, "Unable to decode bitmap and encode it into a video, skipping frame", th);
            return false;
        }
    }

    public final void addFrame(File screenshot, long frameTimestamp, String screen) throws Exception {
        AbstractC4862t.e(screenshot, "screenshot");
        ReplayFrame replayFrame = new ReplayFrame(screenshot, frameTimestamp, screen);
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            this.frames.add(replayFrame);
            C4015H c4015h = C4015H.f34254a;
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    public final void addFrame$sentry_android_replay_release(Bitmap bitmap, long frameTimestamp, String screen) throws IOException {
        AbstractC4862t.e(bitmap, "bitmap");
        if (getReplayCacheDir$sentry_android_replay_release() == null || bitmap.isRecycled()) {
            return;
        }
        File replayCacheDir$sentry_android_replay_release = getReplayCacheDir$sentry_android_replay_release();
        if (replayCacheDir$sentry_android_replay_release != null) {
            replayCacheDir$sentry_android_replay_release.mkdirs();
        }
        File file = new File(getReplayCacheDir$sentry_android_replay_release(), frameTimestamp + ".jpg");
        file.createNewFile();
        synchronized (bitmap) {
            if (bitmap.isRecycled()) {
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                bitmap.compress(Bitmap.CompressFormat.JPEG, this.options.getSessionReplay().getQuality().screenshotQuality, fileOutputStream);
                fileOutputStream.flush();
                C4015H c4015h = C4015H.f34254a;
                sc.c.a(fileOutputStream, null);
                addFrame(file, frameTimestamp, screen);
            } finally {
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
        try {
            SimpleVideoEncoder simpleVideoEncoder = this.encoder;
            if (simpleVideoEncoder != null) {
                simpleVideoEncoder.release();
            }
            this.encoder = null;
            C4015H c4015h = C4015H.f34254a;
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
            this.isClosed.set(true);
        } finally {
        }
    }

    public final GeneratedVideo createVideoOf(long duration, long from, int segmentId, int height, int width, int frameRate, int bitRate, File videoFile) throws Exception {
        ISentryLifecycleToken iSentryLifecycleToken;
        int i10;
        AbstractC4862t.e(videoFile, "videoFile");
        if (videoFile.exists() && videoFile.length() > 0) {
            videoFile.delete();
        }
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            List arrayList = this.frames.isEmpty() ? new ArrayList() : C4179C.X0(this.frames);
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
            if (arrayList.isEmpty()) {
                this.options.getLogger().log(SentryLevel.DEBUG, "No captured frames, skipping generating a video segment", new Object[0]);
                return null;
            }
            ISentryLifecycleToken iSentryLifecycleTokenAcquire2 = this.encoderLock.acquire();
            try {
                iSentryLifecycleToken = iSentryLifecycleTokenAcquire2;
            } catch (Throwable th) {
                th = th;
                iSentryLifecycleToken = iSentryLifecycleTokenAcquire2;
            }
            try {
                SimpleVideoEncoder simpleVideoEncoder = new SimpleVideoEncoder(this.options, new MuxerConfig(videoFile, width, height, frameRate, bitRate, null, 32, null), null, 4, null);
                simpleVideoEncoder.start();
                AbstractC5877a.a(iSentryLifecycleToken, null);
                this.encoder = simpleVideoEncoder;
                long j10 = ((long) 1000) / ((long) frameRate);
                Object objJ0 = C4179C.j0(arrayList);
                long j11 = from + duration;
                g gVarO = k.o(k.q(from, j11), j10);
                long jC = gVarO.c();
                long jD = gVarO.d();
                long jE = gVarO.e();
                if ((jE <= 0 || jC > jD) && (jE >= 0 || jD > jC)) {
                    i10 = 0;
                } else {
                    long j12 = jC;
                    int i11 = 0;
                    while (true) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            ReplayFrame replayFrame = (ReplayFrame) it.next();
                            long j13 = j12 + j10;
                            long timestamp = replayFrame.getTimestamp();
                            if (j12 <= timestamp && timestamp <= j13) {
                                objJ0 = replayFrame;
                                break;
                            }
                            if (replayFrame.getTimestamp() > j13) {
                                break;
                            }
                        }
                        if (encode((ReplayFrame) objJ0)) {
                            i11++;
                        } else if (objJ0 != null) {
                            deleteFile(((ReplayFrame) objJ0).getScreenshot());
                            iSentryLifecycleTokenAcquire = this.framesLock.acquire();
                            try {
                                T.a(this.frames).remove(objJ0);
                                AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                                arrayList.remove(objJ0);
                                objJ0 = null;
                            } finally {
                            }
                        }
                        if (j12 == jD) {
                            break;
                        }
                        j12 += jE;
                    }
                    i10 = i11;
                }
                if (i10 == 0) {
                    this.options.getLogger().log(SentryLevel.DEBUG, "Generated a video with no frames, not capturing a replay segment", new Object[0]);
                    deleteFile(videoFile);
                    return null;
                }
                iSentryLifecycleTokenAcquire = this.encoderLock.acquire();
                try {
                    SimpleVideoEncoder simpleVideoEncoder2 = this.encoder;
                    if (simpleVideoEncoder2 != null) {
                        simpleVideoEncoder2.release();
                    }
                    SimpleVideoEncoder simpleVideoEncoder3 = this.encoder;
                    long duration2 = simpleVideoEncoder3 != null ? simpleVideoEncoder3.getDuration() : 0L;
                    this.encoder = null;
                    C4015H c4015h = C4015H.f34254a;
                    AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                    rotate$sentry_android_replay_release(j11);
                    return new GeneratedVideo(videoFile, i10, duration2);
                } finally {
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                try {
                    throw th3;
                } catch (Throwable th4) {
                    AbstractC5877a.a(iSentryLifecycleToken, th3);
                    throw th4;
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final Long firstFrameTimestamp$sentry_android_replay_release() throws Exception {
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            ReplayFrame replayFrame = (ReplayFrame) C4179C.j0(this.frames);
            Long lValueOf = replayFrame != null ? Long.valueOf(replayFrame.getTimestamp()) : null;
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
            return lValueOf;
        } finally {
        }
    }

    public final List<ReplayFrame> getFrames$sentry_android_replay_release() {
        return this.frames;
    }

    public final File getOngoingSegmentFile$sentry_android_replay_release() {
        return (File) this.ongoingSegmentFile.getValue();
    }

    public final File getReplayCacheDir$sentry_android_replay_release() {
        return (File) this.replayCacheDir.getValue();
    }

    public final void persistSegmentValues$sentry_android_replay_release(String key, String value) throws Exception {
        File ongoingSegmentFile$sentry_android_replay_release;
        File ongoingSegmentFile$sentry_android_replay_release2;
        AbstractC4862t.e(key, "key");
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.lock.acquire();
        try {
            if (this.isClosed.get()) {
                AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
                return;
            }
            File ongoingSegmentFile$sentry_android_replay_release3 = getOngoingSegmentFile$sentry_android_replay_release();
            if ((ongoingSegmentFile$sentry_android_replay_release3 == null || !ongoingSegmentFile$sentry_android_replay_release3.exists()) && (ongoingSegmentFile$sentry_android_replay_release = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                ongoingSegmentFile$sentry_android_replay_release.createNewFile();
            }
            if (this.ongoingSegment.isEmpty() && (ongoingSegmentFile$sentry_android_replay_release2 = getOngoingSegmentFile$sentry_android_replay_release()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(ongoingSegmentFile$sentry_android_replay_release2), C1823c.f12394b), 8192);
                try {
                    h hVarC = o.c(bufferedReader);
                    LinkedHashMap<String, String> linkedHashMap = this.ongoingSegment;
                    Iterator it = hVarC.iterator();
                    while (it.hasNext()) {
                        List listI0 = F.I0((String) it.next(), new String[]{"="}, false, 2, 2, null);
                        C4034q c4034qA = AbstractC4040w.a((String) listI0.get(0), (String) listI0.get(1));
                        linkedHashMap.put((String) c4034qA.e(), (String) c4034qA.f());
                    }
                    sc.c.a(bufferedReader, null);
                } finally {
                }
            }
            if (value == null) {
                this.ongoingSegment.remove(key);
            } else {
                this.ongoingSegment.put(key, value);
            }
            File ongoingSegmentFile$sentry_android_replay_release4 = getOngoingSegmentFile$sentry_android_replay_release();
            if (ongoingSegmentFile$sentry_android_replay_release4 != null) {
                Set<Map.Entry<String, String>> setEntrySet = this.ongoingSegment.entrySet();
                AbstractC4862t.d(setEntrySet, "<get-entries>(...)");
                j.h(ongoingSegmentFile$sentry_android_replay_release4, C4179C.q0(setEntrySet, "\n", null, null, 0, null, ReplayCache$persistSegmentValues$1$2.INSTANCE, 30, null), null, 2, null);
                C4015H c4015h = C4015H.f34254a;
            }
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
        } finally {
        }
    }

    public final String rotate$sentry_android_replay_release(long until) throws Exception {
        L l10 = new L();
        ISentryLifecycleToken iSentryLifecycleTokenAcquire = this.framesLock.acquire();
        try {
            y.I(this.frames, new ReplayCache$rotate$1$1(until, this, l10));
            AbstractC5877a.a(iSentryLifecycleTokenAcquire, null);
            return (String) l10.f39776a;
        } finally {
        }
    }
}
