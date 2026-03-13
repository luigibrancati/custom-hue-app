package com.cloudwebrtc.webrtc;

import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class LocalTrack {
    public MediaStreamTrack track;

    public LocalTrack(MediaStreamTrack mediaStreamTrack) {
        this.track = mediaStreamTrack;
    }

    public void dispose() {
        this.track.dispose();
    }

    public boolean enabled() {
        return this.track.enabled();
    }

    public String id() {
        return this.track.id();
    }

    public String kind() {
        return this.track.kind();
    }

    public void setEnabled(boolean z10) {
        this.track.setEnabled(z10);
    }
}
