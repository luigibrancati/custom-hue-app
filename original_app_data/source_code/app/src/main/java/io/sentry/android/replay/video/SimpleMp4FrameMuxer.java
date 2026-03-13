package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMuxer;
import io.sentry.Session;
import java.nio.ByteBuffer;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010#\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010$R\u0016\u0010&\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010\u001c¨\u0006'"}, d2 = {"Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "Lio/sentry/android/replay/video/SimpleFrameMuxer;", "", "path", "", "fps", "<init>", "(Ljava/lang/String;F)V", "", "isStarted", "()Z", "Landroid/media/MediaFormat;", "videoFormat", "Lfc/H;", "start", "(Landroid/media/MediaFormat;)V", "Ljava/nio/ByteBuffer;", "encodedData", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "muxVideoFrame", "(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "release", "()V", "", "getVideoTime", "()J", "frameDurationUsec", "J", "Landroid/media/MediaMuxer;", "muxer", "Landroid/media/MediaMuxer;", Session.JsonKeys.STARTED, "Z", "", "videoTrackIndex", "I", "videoFrames", "finalVideoTime", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SimpleMp4FrameMuxer implements SimpleFrameMuxer {
    public static final int $stable = 8;
    private long finalVideoTime;
    private final long frameDurationUsec;
    private final MediaMuxer muxer;
    private boolean started;
    private int videoFrames;
    private int videoTrackIndex;

    public SimpleMp4FrameMuxer(String path, float f10) {
        AbstractC4862t.e(path, "path");
        this.frameDurationUsec = (long) (TimeUnit.SECONDS.toMicros(1L) / f10);
        this.muxer = new MediaMuxer(path, 0);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public long getVideoTime() {
        if (this.videoFrames == 0) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(this.finalVideoTime + this.frameDurationUsec, TimeUnit.MICROSECONDS);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    /* JADX INFO: renamed from: isStarted, reason: from getter */
    public boolean getStarted() {
        return this.started;
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void muxVideoFrame(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo) {
        AbstractC4862t.e(encodedData, "encodedData");
        AbstractC4862t.e(bufferInfo, "bufferInfo");
        long j10 = this.frameDurationUsec;
        int i10 = this.videoFrames;
        this.videoFrames = i10 + 1;
        long j11 = j10 * ((long) i10);
        this.finalVideoTime = j11;
        bufferInfo.presentationTimeUs = j11;
        this.muxer.writeSampleData(this.videoTrackIndex, encodedData, bufferInfo);
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void release() {
        this.muxer.stop();
        this.muxer.release();
    }

    @Override // io.sentry.android.replay.video.SimpleFrameMuxer
    public void start(MediaFormat videoFormat) {
        AbstractC4862t.e(videoFormat, "videoFormat");
        this.videoTrackIndex = this.muxer.addTrack(videoFormat);
        this.muxer.start();
        this.started = true;
    }
}
