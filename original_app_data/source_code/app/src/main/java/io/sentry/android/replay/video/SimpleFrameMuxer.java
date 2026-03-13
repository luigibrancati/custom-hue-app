package io.sentry.android.replay.video;

import android.media.MediaCodec;
import android.media.MediaFormat;
import java.nio.ByteBuffer;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0007H&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/sentry/android/replay/video/SimpleFrameMuxer;", "", "", "isStarted", "()Z", "Landroid/media/MediaFormat;", "videoFormat", "Lfc/H;", "start", "(Landroid/media/MediaFormat;)V", "Ljava/nio/ByteBuffer;", "encodedData", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "muxVideoFrame", "(Ljava/nio/ByteBuffer;Landroid/media/MediaCodec$BufferInfo;)V", "release", "()V", "", "getVideoTime", "()J", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public interface SimpleFrameMuxer {
    long getVideoTime();

    boolean isStarted();

    void muxVideoFrame(ByteBuffer encodedData, MediaCodec.BufferInfo bufferInfo);

    void release();

    void start(MediaFormat videoFormat);
}
