package com.cloudwebrtc.webrtc.record;

import android.annotation.SuppressLint;
import java.util.HashMap;
import java.util.Iterator;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioSamplesInterceptor implements JavaAudioDeviceModule.SamplesReadyCallback {

    @SuppressLint({"UseSparseArrays"})
    protected final HashMap<Integer, JavaAudioDeviceModule.SamplesReadyCallback> callbacks = new HashMap<>();

    public void attachCallback(Integer num, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        this.callbacks.put(num, samplesReadyCallback);
    }

    public void detachCallback(Integer num) {
        this.callbacks.remove(num);
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        Iterator<JavaAudioDeviceModule.SamplesReadyCallback> it = this.callbacks.values().iterator();
        while (it.hasNext()) {
            it.next().onWebRtcAudioRecordSamplesReady(audioSamples);
        }
    }
}
