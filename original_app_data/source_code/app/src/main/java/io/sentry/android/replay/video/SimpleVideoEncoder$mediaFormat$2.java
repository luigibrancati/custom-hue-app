package io.sentry.android.replay.video;

import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import io.sentry.SentryLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.v;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/media/MediaFormat;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
public final class SimpleVideoEncoder$mediaFormat$2 extends v implements InterfaceC6082a {
    final /* synthetic */ SimpleVideoEncoder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleVideoEncoder$mediaFormat$2(SimpleVideoEncoder simpleVideoEncoder) {
        super(0);
        this.this$0 = simpleVideoEncoder;
    }

    @Override // vc.InterfaceC6082a
    public final MediaFormat invoke() {
        int bitRate = this.this$0.getMuxerConfig().getBitRate();
        try {
            MediaCodecInfo.VideoCapabilities videoCapabilities = this.this$0.getMediaCodec().getCodecInfo().getCapabilitiesForType(this.this$0.getMuxerConfig().getMimeType()).getVideoCapabilities();
            if (!videoCapabilities.getBitrateRange().contains(Integer.valueOf(bitRate))) {
                this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Encoder doesn't support the provided bitRate: " + bitRate + ", the value will be clamped to the closest one", new Object[0]);
                Object objClamp = videoCapabilities.getBitrateRange().clamp(Integer.valueOf(bitRate));
                AbstractC4862t.d(objClamp, "clamp(...)");
                bitRate = ((Number) objClamp).intValue();
            }
        } catch (Throwable th) {
            this.this$0.getOptions().getLogger().log(SentryLevel.DEBUG, "Could not retrieve MediaCodec info", th);
        }
        MediaFormat mediaFormatCreateVideoFormat = MediaFormat.createVideoFormat(this.this$0.getMuxerConfig().getMimeType(), this.this$0.getMuxerConfig().getRecordingWidth(), this.this$0.getMuxerConfig().getRecordingHeight());
        AbstractC4862t.d(mediaFormatCreateVideoFormat, "createVideoFormat(...)");
        mediaFormatCreateVideoFormat.setInteger("color-format", 2130708361);
        mediaFormatCreateVideoFormat.setInteger("bitrate", bitRate);
        mediaFormatCreateVideoFormat.setFloat("frame-rate", this.this$0.getMuxerConfig().getFrameRate());
        mediaFormatCreateVideoFormat.setInteger("i-frame-interval", 6);
        return mediaFormatCreateVideoFormat;
    }
}
