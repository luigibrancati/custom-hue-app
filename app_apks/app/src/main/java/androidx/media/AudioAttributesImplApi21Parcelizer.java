package androidx.media;

import android.media.AudioAttributes;
import v3.AbstractC6037a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21Parcelizer {
    public static AudioAttributesImplApi21 read(AbstractC6037a abstractC6037a) {
        AudioAttributesImplApi21 audioAttributesImplApi21 = new AudioAttributesImplApi21();
        audioAttributesImplApi21.f23500a = (AudioAttributes) abstractC6037a.r(audioAttributesImplApi21.f23500a, 1);
        audioAttributesImplApi21.f23501b = abstractC6037a.p(audioAttributesImplApi21.f23501b, 2);
        return audioAttributesImplApi21;
    }

    public static void write(AudioAttributesImplApi21 audioAttributesImplApi21, AbstractC6037a abstractC6037a) {
        abstractC6037a.x(false, false);
        abstractC6037a.H(audioAttributesImplApi21.f23500a, 1);
        abstractC6037a.F(audioAttributesImplApi21.f23501b, 2);
    }
}
