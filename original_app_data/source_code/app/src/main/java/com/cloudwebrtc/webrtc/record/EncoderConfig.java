package com.cloudwebrtc.webrtc.record;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
class EncoderConfig {
    final int bitrate;
    final int height;
    final int profile;
    final int width;

    public EncoderConfig(int i10, int i11, int i12, int i13) {
        this.width = i10;
        this.height = i11;
        this.bitrate = i12;
        this.profile = i13;
    }

    public String toString() {
        return this.width + "x" + this.height + ", bitrate: " + this.bitrate + ", profile: " + this.profile;
    }
}
