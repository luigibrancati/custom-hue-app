package com.cloudwebrtc.webrtc.video;

import com.cloudwebrtc.webrtc.LocalTrack;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.VideoFrame;
import org.webrtc.VideoProcessor;
import org.webrtc.VideoSink;
import org.webrtc.VideoTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class LocalVideoTrack extends LocalTrack implements VideoProcessor {
    List<ExternalVideoFrameProcessing> processors;
    private VideoSink sink;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ExternalVideoFrameProcessing {
        VideoFrame onFrame(VideoFrame videoFrame);
    }

    public LocalVideoTrack(VideoTrack videoTrack) {
        super(videoTrack);
        this.processors = new ArrayList();
        this.sink = null;
    }

    public void addProcessor(ExternalVideoFrameProcessing externalVideoFrameProcessing) {
        synchronized (this.processors) {
            this.processors.add(externalVideoFrameProcessing);
        }
    }

    @Override // org.webrtc.CapturerObserver
    public void onFrameCaptured(VideoFrame videoFrame) {
        if (this.sink != null) {
            synchronized (this.processors) {
                try {
                    Iterator<ExternalVideoFrameProcessing> it = this.processors.iterator();
                    while (it.hasNext()) {
                        videoFrame = it.next().onFrame(videoFrame);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.sink.onFrame(videoFrame);
        }
    }

    public void removeProcessor(ExternalVideoFrameProcessing externalVideoFrameProcessing) {
        synchronized (this.processors) {
            this.processors.remove(externalVideoFrameProcessing);
        }
    }

    @Override // org.webrtc.VideoProcessor
    public void setSink(VideoSink videoSink) {
        this.sink = videoSink;
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStopped() {
    }

    @Override // org.webrtc.CapturerObserver
    public void onCapturerStarted(boolean z10) {
    }
}
