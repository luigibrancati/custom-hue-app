package com.cloudwebrtc.webrtc.audio;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.webrtc.audio.JavaAudioDeviceModule;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class PlaybackSamplesReadyCallbackAdapter implements JavaAudioDeviceModule.PlaybackSamplesReadyCallback {
    List<JavaAudioDeviceModule.PlaybackSamplesReadyCallback> callbacks = new ArrayList();

    public void addCallback(JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.add(playbackSamplesReadyCallback);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.PlaybackSamplesReadyCallback
    public void onWebRtcAudioTrackSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        Iterator<JavaAudioDeviceModule.PlaybackSamplesReadyCallback> it = this.callbacks.iterator();
        while (it.hasNext()) {
            it.next().onWebRtcAudioTrackSamplesReady(audioSamples);
        }
    }

    public void removeCallback(JavaAudioDeviceModule.PlaybackSamplesReadyCallback playbackSamplesReadyCallback) {
        synchronized (this.callbacks) {
            this.callbacks.remove(playbackSamplesReadyCallback);
        }
    }
}
