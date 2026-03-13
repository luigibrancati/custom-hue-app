package io.sentry.android.replay.video;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
import fc.C4029l;
import fc.EnumC4031n;
import fc.InterfaceC4028k;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.rrweb.RRWebOptionsEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\u0007¢\u0006\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00105\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0011\u0010:\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006;"}, d2 = {"Lio/sentry/android/replay/video/SimpleVideoEncoder;", "", "Lio/sentry/SentryOptions;", RRWebOptionsEvent.EVENT_TAG, "Lio/sentry/android/replay/video/MuxerConfig;", "muxerConfig", "Lkotlin/Function0;", "Lfc/H;", "onClose", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/video/MuxerConfig;Lvc/a;)V", "", "endOfStream", "drainCodec", "(Z)V", "start", "()V", "Landroid/graphics/Bitmap;", "image", "encode", "(Landroid/graphics/Bitmap;)V", "release", "Lio/sentry/SentryOptions;", "getOptions", "()Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/video/MuxerConfig;", "getMuxerConfig", "()Lio/sentry/android/replay/video/MuxerConfig;", "Lvc/a;", "getOnClose", "()Lvc/a;", "hasExynosCodec$delegate", "Lfc/k;", "getHasExynosCodec", "()Z", "hasExynosCodec", "Landroid/media/MediaCodec;", "mediaCodec", "Landroid/media/MediaCodec;", "getMediaCodec$sentry_android_replay_release", "()Landroid/media/MediaCodec;", "Landroid/media/MediaFormat;", "mediaFormat$delegate", "getMediaFormat", "()Landroid/media/MediaFormat;", "mediaFormat", "Landroid/media/MediaCodec$BufferInfo;", "bufferInfo", "Landroid/media/MediaCodec$BufferInfo;", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "frameMuxer", "Lio/sentry/android/replay/video/SimpleMp4FrameMuxer;", "Landroid/view/Surface;", "surface", "Landroid/view/Surface;", "", "getDuration", "()J", "duration", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"UseRequiresApi"})
@TargetApi(26)
public final class SimpleVideoEncoder {
    public static final int $stable = 8;
    private final MediaCodec.BufferInfo bufferInfo;
    private final SimpleMp4FrameMuxer frameMuxer;

    /* JADX INFO: renamed from: hasExynosCodec$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k hasExynosCodec;
    private final MediaCodec mediaCodec;

    /* JADX INFO: renamed from: mediaFormat$delegate, reason: from kotlin metadata */
    private final InterfaceC4028k mediaFormat;
    private final MuxerConfig muxerConfig;
    private final InterfaceC6082a onClose;
    private final SentryOptions options;
    private Surface surface;

    public SimpleVideoEncoder(SentryOptions options, MuxerConfig muxerConfig, InterfaceC6082a interfaceC6082a) {
        AbstractC4862t.e(options, "options");
        AbstractC4862t.e(muxerConfig, "muxerConfig");
        this.options = options;
        this.muxerConfig = muxerConfig;
        this.onClose = interfaceC6082a;
        EnumC4031n enumC4031n = EnumC4031n.NONE;
        this.hasExynosCodec = C4029l.a(enumC4031n, SimpleVideoEncoder$hasExynosCodec$2.INSTANCE);
        MediaCodec mediaCodecCreateByCodecName = getHasExynosCodec() ? MediaCodec.createByCodecName("c2.android.avc.encoder") : MediaCodec.createEncoderByType(muxerConfig.getMimeType());
        AbstractC4862t.b(mediaCodecCreateByCodecName);
        this.mediaCodec = mediaCodecCreateByCodecName;
        this.mediaFormat = C4029l.a(enumC4031n, new SimpleVideoEncoder$mediaFormat$2(this));
        this.bufferInfo = new MediaCodec.BufferInfo();
        String absolutePath = muxerConfig.getFile().getAbsolutePath();
        AbstractC4862t.d(absolutePath, "getAbsolutePath(...)");
        this.frameMuxer = new SimpleMp4FrameMuxer(absolutePath, muxerConfig.getFrameRate());
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01e0, code lost:
    
        throw new java.lang.RuntimeException("encoderOutputBuffer " + r2 + " was null");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void drainCodec(boolean r9) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.SimpleVideoEncoder.drainCodec(boolean):void");
    }

    private final boolean getHasExynosCodec() {
        return ((Boolean) this.hasExynosCodec.getValue()).booleanValue();
    }

    private final MediaFormat getMediaFormat() {
        return (MediaFormat) this.mediaFormat.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void encode(android.graphics.Bitmap r8) {
        /*
            r7 = this;
            java.lang.String r0 = "image"
            kotlin.jvm.internal.AbstractC4862t.e(r8, r0)
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MANUFACTURER"
            kotlin.jvm.internal.AbstractC4862t.d(r0, r1)
            java.lang.String r2 = "xiaomi"
            r3 = 1
            boolean r2 = Od.F.T(r0, r2, r3)
            r4 = 0
            if (r2 != 0) goto L4a
            kotlin.jvm.internal.AbstractC4862t.d(r0, r1)
            java.lang.String r1 = "motorola"
            boolean r0 = Od.F.T(r0, r1, r3)
            if (r0 != 0) goto L4a
            io.sentry.android.replay.util.SystemProperties r0 = io.sentry.android.replay.util.SystemProperties.INSTANCE
            io.sentry.android.replay.util.SystemProperties$Property r1 = io.sentry.android.replay.util.SystemProperties.Property.SOC_MANUFACTURER
            r2 = 2
            java.lang.String r5 = io.sentry.android.replay.util.SystemProperties.get$default(r0, r1, r4, r2, r4)
            java.lang.String r6 = "spreadtrum"
            boolean r5 = Od.C.E(r5, r6, r3)
            if (r5 != 0) goto L4a
            java.lang.String r0 = io.sentry.android.replay.util.SystemProperties.get$default(r0, r1, r4, r2, r4)
            java.lang.String r1 = "unisoc"
            boolean r0 = Od.C.E(r0, r1, r3)
            if (r0 == 0) goto L3f
            goto L4a
        L3f:
            android.view.Surface r0 = r7.surface
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockHardwareCanvas()
            goto L52
        L48:
            r0 = r4
            goto L52
        L4a:
            android.view.Surface r0 = r7.surface
            if (r0 == 0) goto L48
            android.graphics.Canvas r0 = r0.lockCanvas(r4)
        L52:
            if (r0 == 0) goto L58
            r1 = 0
            r0.drawBitmap(r8, r1, r1, r4)
        L58:
            android.view.Surface r8 = r7.surface
            if (r8 == 0) goto L5f
            r8.unlockCanvasAndPost(r0)
        L5f:
            r8 = 0
            r7.drainCodec(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.video.SimpleVideoEncoder.encode(android.graphics.Bitmap):void");
    }

    public final long getDuration() {
        return this.frameMuxer.getVideoTime();
    }

    /* JADX INFO: renamed from: getMediaCodec$sentry_android_replay_release, reason: from getter */
    public final MediaCodec getMediaCodec() {
        return this.mediaCodec;
    }

    public final MuxerConfig getMuxerConfig() {
        return this.muxerConfig;
    }

    public final InterfaceC6082a getOnClose() {
        return this.onClose;
    }

    public final SentryOptions getOptions() {
        return this.options;
    }

    public final void release() {
        try {
            InterfaceC6082a interfaceC6082a = this.onClose;
            if (interfaceC6082a != null) {
                interfaceC6082a.invoke();
            }
            drainCodec(true);
            this.mediaCodec.stop();
            this.mediaCodec.release();
            Surface surface = this.surface;
            if (surface != null) {
                surface.release();
            }
            this.frameMuxer.release();
        } catch (Throwable th) {
            this.options.getLogger().log(SentryLevel.DEBUG, "Failed to properly release video encoder", th);
        }
    }

    public final void start() {
        this.mediaCodec.configure(getMediaFormat(), (Surface) null, (MediaCrypto) null, 1);
        this.surface = this.mediaCodec.createInputSurface();
        this.mediaCodec.start();
        drainCodec(false);
    }

    public /* synthetic */ SimpleVideoEncoder(SentryOptions sentryOptions, MuxerConfig muxerConfig, InterfaceC6082a interfaceC6082a, int i10, AbstractC4854k abstractC4854k) {
        this(sentryOptions, muxerConfig, (i10 & 4) != 0 ? null : interfaceC6082a);
    }
}
