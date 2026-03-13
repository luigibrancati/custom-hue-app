package com.cloudwebrtc.webrtc.audio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class RecordSamplesReadyCallbackAdapter implements JavaAudioDeviceModule.SamplesReadyCallback {
    List<JavaAudioDeviceModule.SamplesReadyCallback> callbacks = new ArrayList();

    public void addCallback(JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.add(samplesReadyCallback);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        synchronized (this.callbacks) {
            try {
                Iterator<JavaAudioDeviceModule.SamplesReadyCallback> it = this.callbacks.iterator();
                while (it.hasNext()) {
                    it.next().onWebRtcAudioRecordSamplesReady(audioSamples);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeCallback(JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.remove(samplesReadyCallback);
        }
    }
}
