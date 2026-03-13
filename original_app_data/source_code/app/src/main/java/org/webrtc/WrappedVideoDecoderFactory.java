package org.webrtc;

import java.util.Arrays;
import java.util.LinkedHashSet;
import org.webrtc.EglBase;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class WrappedVideoDecoderFactory implements VideoDecoderFactory {
    private final VideoDecoderFactory hardwareVideoDecoderFactory;
    private final VideoDecoderFactory platformSoftwareVideoDecoderFactory;
    private final VideoDecoderFactory hardwareVideoDecoderFactoryWithoutEglContext = new HardwareVideoDecoderFactory(null);
    private final VideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();

    public WrappedVideoDecoderFactory(EglBase.Context context) {
        this.hardwareVideoDecoderFactory = new HardwareVideoDecoderFactory(context);
        this.platformSoftwareVideoDecoderFactory = new PlatformSoftwareVideoDecoderFactory(context);
    }

    private boolean disableSurfaceTextureFrame(String str) {
        return str.startsWith("OMX.qcom.") || str.startsWith("OMX.hisi.");
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoderFactory videoDecoderFactory;
        VideoDecoder videoDecoderCreateDecoder = this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        VideoDecoder videoDecoderCreateDecoder2 = this.hardwareVideoDecoderFactory.createDecoder(videoCodecInfo);
        if (videoDecoderCreateDecoder == null && (videoDecoderFactory = this.platformSoftwareVideoDecoderFactory) != null) {
            videoDecoderCreateDecoder = videoDecoderFactory.createDecoder(videoCodecInfo);
        }
        if (videoDecoderCreateDecoder2 != null && disableSurfaceTextureFrame(videoDecoderCreateDecoder2.getImplementationName())) {
            videoDecoderCreateDecoder2.release();
            videoDecoderCreateDecoder2 = this.hardwareVideoDecoderFactoryWithoutEglContext.createDecoder(videoCodecInfo);
        }
        return (videoDecoderCreateDecoder2 == null || videoDecoderCreateDecoder == null) ? videoDecoderCreateDecoder2 != null ? videoDecoderCreateDecoder2 : videoDecoderCreateDecoder : new VideoDecoderFallback(videoDecoderCreateDecoder, videoDecoderCreateDecoder2);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(Arrays.asList(this.softwareVideoDecoderFactory.getSupportedCodecs()));
        linkedHashSet.addAll(Arrays.asList(this.hardwareVideoDecoderFactory.getSupportedCodecs()));
        VideoDecoderFactory videoDecoderFactory = this.platformSoftwareVideoDecoderFactory;
        if (videoDecoderFactory != null) {
            linkedHashSet.addAll(Arrays.asList(videoDecoderFactory.getSupportedCodecs()));
        }
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
