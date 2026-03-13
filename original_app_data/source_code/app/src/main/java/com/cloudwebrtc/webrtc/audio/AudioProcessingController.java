package com.cloudwebrtc.webrtc.audio;

import org.webrtc.ExternalAudioProcessingFactory;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioProcessingController {
    public final AudioProcessingAdapter capturePostProcessing;
    public ExternalAudioProcessingFactory externalAudioProcessingFactory;
    public final AudioProcessingAdapter renderPreProcessing;

    public AudioProcessingController() {
        AudioProcessingAdapter audioProcessingAdapter = new AudioProcessingAdapter();
        this.capturePostProcessing = audioProcessingAdapter;
        AudioProcessingAdapter audioProcessingAdapter2 = new AudioProcessingAdapter();
        this.renderPreProcessing = audioProcessingAdapter2;
        ExternalAudioProcessingFactory externalAudioProcessingFactory = new ExternalAudioProcessingFactory();
        this.externalAudioProcessingFactory = externalAudioProcessingFactory;
        externalAudioProcessingFactory.setCapturePostProcessing(audioProcessingAdapter);
        this.externalAudioProcessingFactory.setRenderPreProcessing(audioProcessingAdapter2);
    }
}
