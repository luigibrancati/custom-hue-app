package com.cloudwebrtc.webrtc.audio;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.ExternalAudioProcessingFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioProcessingAdapter implements ExternalAudioProcessingFactory.AudioProcessing {
    List<ExternalAudioFrameProcessing> audioProcessors = new ArrayList();

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface ExternalAudioFrameProcessing {
        void initialize(int i10, int i11);

        void process(int i10, int i11, ByteBuffer byteBuffer);

        void reset(int i10);
    }

    public void addProcessor(ExternalAudioFrameProcessing externalAudioFrameProcessing) {
        synchronized (this.audioProcessors) {
            this.audioProcessors.add(externalAudioFrameProcessing);
        }
    }

    @Override // org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public void initialize(int i10, int i11) {
        synchronized (this.audioProcessors) {
            try {
                Iterator<ExternalAudioFrameProcessing> it = this.audioProcessors.iterator();
                while (it.hasNext()) {
                    it.next().initialize(i10, i11);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public void process(int i10, int i11, ByteBuffer byteBuffer) {
        synchronized (this.audioProcessors) {
            try {
                Iterator<ExternalAudioFrameProcessing> it = this.audioProcessors.iterator();
                while (it.hasNext()) {
                    it.next().process(i10, i11, byteBuffer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeProcessor(ExternalAudioFrameProcessing externalAudioFrameProcessing) {
        synchronized (this.audioProcessors) {
            this.audioProcessors.remove(externalAudioFrameProcessing);
        }
    }

    @Override // org.webrtc.ExternalAudioProcessingFactory.AudioProcessing
    public void reset(int i10) {
        synchronized (this.audioProcessors) {
            try {
                Iterator<ExternalAudioFrameProcessing> it = this.audioProcessors.iterator();
                while (it.hasNext()) {
                    it.next().reset(i10);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
