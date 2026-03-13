package androidx.media;

import v3.AbstractC6037a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(AbstractC6037a abstractC6037a) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.f23503a = abstractC6037a.p(audioAttributesImplBase.f23503a, 1);
        audioAttributesImplBase.f23504b = abstractC6037a.p(audioAttributesImplBase.f23504b, 2);
        audioAttributesImplBase.f23505c = abstractC6037a.p(audioAttributesImplBase.f23505c, 3);
        audioAttributesImplBase.f23506d = abstractC6037a.p(audioAttributesImplBase.f23506d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, AbstractC6037a abstractC6037a) {
        abstractC6037a.x(false, false);
        abstractC6037a.F(audioAttributesImplBase.f23503a, 1);
        abstractC6037a.F(audioAttributesImplBase.f23504b, 2);
        abstractC6037a.F(audioAttributesImplBase.f23505c, 3);
        abstractC6037a.F(audioAttributesImplBase.f23506d, 4);
    }
}
