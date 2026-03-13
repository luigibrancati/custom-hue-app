package Oa;

import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e {
    public final AudioFocusRequest a(AudioManager.OnAudioFocusChangeListener audioFocusChangeListener, int i10, int i11, int i12) {
        AbstractC4862t.e(audioFocusChangeListener, "audioFocusChangeListener");
        AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(i10).setAudioAttributes(new AudioAttributes.Builder().setUsage(i11).setContentType(i12).build()).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener(audioFocusChangeListener).build();
        AbstractC4862t.d(audioFocusRequestBuild, "AudioFocusRequest.Builde…ner)\n            .build()");
        return audioFocusRequestBuild;
    }
}
