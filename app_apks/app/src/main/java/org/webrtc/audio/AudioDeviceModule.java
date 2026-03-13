package org.webrtc.audio;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes5.dex */
public interface AudioDeviceModule {
    long getNativeAudioDeviceModulePointer();

    void release();

    void setMicrophoneMute(boolean z10);

    default boolean setNoiseSuppressorEnabled(boolean z10) {
        return false;
    }

    default boolean setPreferredMicrophoneFieldDimension(float f10) {
        return false;
    }

    void setSpeakerMute(boolean z10);
}
