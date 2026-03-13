package org.webrtc;

import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
class NativeCapturerObserver implements CapturerObserver {
    private final NativeAndroidVideoTrackSource nativeAndroidVideoTrackSource;

    @CalledByNative
    public NativeCapturerObserver(long j10) {
        this.nativeAndroidVideoTrackSource = new NativeAndroidVideoTrackSource(j10);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z10) {
        this.nativeAndroidVideoTrackSource.setState(z10);
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
        this.nativeAndroidVideoTrackSource.setState(false);
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        VideoProcessor.FrameAdaptationParameters frameAdaptationParametersAdaptFrame = this.nativeAndroidVideoTrackSource.adaptFrame(videoFrame);
        if (frameAdaptationParametersAdaptFrame == null) {
            return;
        }
        VideoFrame.Buffer bufferCropAndScale = videoFrame.getBuffer().cropAndScale(frameAdaptationParametersAdaptFrame.cropX, frameAdaptationParametersAdaptFrame.cropY, frameAdaptationParametersAdaptFrame.cropWidth, frameAdaptationParametersAdaptFrame.cropHeight, frameAdaptationParametersAdaptFrame.scaleWidth, frameAdaptationParametersAdaptFrame.scaleHeight);
        this.nativeAndroidVideoTrackSource.onFrameCaptured(new VideoFrame(bufferCropAndScale, videoFrame.getRotation(), frameAdaptationParametersAdaptFrame.timestampNs));
        bufferCropAndScale.release();
    }
}
