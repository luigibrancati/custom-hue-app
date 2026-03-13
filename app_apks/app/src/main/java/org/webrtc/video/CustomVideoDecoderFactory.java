package org.webrtc.video;

import java.util.ArrayList;
import java.util.List;
import org.webrtc.EglBase;
import org.webrtc.SoftwareVideoDecoderFactory;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.WrappedVideoDecoderFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public class CustomVideoDecoderFactory implements VideoDecoderFactory {
    private WrappedVideoDecoderFactory wrappedVideoDecoderFactory;
    private SoftwareVideoDecoderFactory softwareVideoDecoderFactory = new SoftwareVideoDecoderFactory();
    private boolean forceSWCodec = false;
    private List<String> forceSWCodecs = new ArrayList();

    public CustomVideoDecoderFactory(EglBase.Context context) {
        this.wrappedVideoDecoderFactory = new WrappedVideoDecoderFactory(context);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        return this.forceSWCodec ? this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo) : (this.forceSWCodecs.isEmpty() || !this.forceSWCodecs.contains(videoCodecInfo.name)) ? this.wrappedVideoDecoderFactory.createDecoder(videoCodecInfo) : this.softwareVideoDecoderFactory.createDecoder(videoCodecInfo);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public VideoCodecInfo[] getSupportedCodecs() {
        return (this.forceSWCodec && this.forceSWCodecs.isEmpty()) ? this.softwareVideoDecoderFactory.getSupportedCodecs() : this.wrappedVideoDecoderFactory.getSupportedCodecs();
    }

    public void setForceSWCodec(boolean z10) {
        this.forceSWCodec = z10;
    }

    public void setForceSWCodecList(List<String> list) {
        this.forceSWCodecs = list;
    }
}
