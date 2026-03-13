package com.cloudwebrtc.webrtc.record;

import org.webrtc.audio.JavaAudioDeviceModule;
import org.webrtc.audio.WebRtcAudioTrackUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class OutputAudioSamplesInterceptor extends AudioSamplesInterceptor {
    private final JavaAudioDeviceModule audioDeviceModule;

    public OutputAudioSamplesInterceptor(JavaAudioDeviceModule javaAudioDeviceModule) {
        this.audioDeviceModule = javaAudioDeviceModule;
    }

    @Override // com.cloudwebrtc.webrtc.record.AudioSamplesInterceptor
    public void attachCallback(Integer num, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) throws IllegalAccessException, NoSuchFieldException {
        if (this.callbacks.isEmpty()) {
            WebRtcAudioTrackUtils.attachOutputCallback(this, this.audioDeviceModule);
        }
        super.attachCallback(num, samplesReadyCallback);
    }

    @Override // com.cloudwebrtc.webrtc.record.AudioSamplesInterceptor
    public void detachCallback(Integer num) {
        super.detachCallback(num);
        if (this.callbacks.isEmpty()) {
            WebRtcAudioTrackUtils.detachOutputCallback(this.audioDeviceModule);
        }
    }
}
