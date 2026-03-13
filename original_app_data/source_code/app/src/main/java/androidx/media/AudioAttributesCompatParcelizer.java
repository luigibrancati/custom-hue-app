package androidx.media;

import v3.AbstractC6037a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompatParcelizer {
    public static AudioAttributesCompat read(AbstractC6037a abstractC6037a) {
        AudioAttributesCompat audioAttributesCompat = new AudioAttributesCompat();
        audioAttributesCompat.f23498a = (AudioAttributesImpl) abstractC6037a.v(audioAttributesCompat.f23498a, 1);
        return audioAttributesCompat;
    }

    public static void write(AudioAttributesCompat audioAttributesCompat, AbstractC6037a abstractC6037a) {
        abstractC6037a.x(false, false);
        abstractC6037a.M(audioAttributesCompat.f23498a, 1);
    }
}
