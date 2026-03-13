package com.cloudwebrtc.webrtc.audio;

import Oa.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public enum AudioDeviceKind {
    BLUETOOTH("bluetooth", c.a.class),
    WIRED_HEADSET("wired-headset", c.d.class),
    SPEAKER("speaker", c.C0158c.class),
    EARPIECE("earpiece", c.b.class);

    public final Class<? extends Oa.c> audioDeviceClass;
    public final String typeName;

    AudioDeviceKind(String str, Class cls) {
        this.typeName = str;
        this.audioDeviceClass = cls;
    }

    public static AudioDeviceKind fromAudioDevice(Oa.c cVar) {
        for (AudioDeviceKind audioDeviceKind : values()) {
            if (audioDeviceKind.audioDeviceClass.equals(cVar.getClass())) {
                return audioDeviceKind;
            }
        }
        return null;
    }

    public static AudioDeviceKind fromTypeName(String str) {
        for (AudioDeviceKind audioDeviceKind : values()) {
            if (audioDeviceKind.typeName.equals(str)) {
                return audioDeviceKind;
            }
        }
        return null;
    }
}
