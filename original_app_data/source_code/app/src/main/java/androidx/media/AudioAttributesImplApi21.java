package androidx.media;

import android.media.AudioAttributes;
import androidx.media.AudioAttributesImpl;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesImplApi21 implements AudioAttributesImpl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributes f23500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f23501b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a implements AudioAttributesImpl.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributes.Builder f23502a = new AudioAttributes.Builder();

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(int i10) {
            this.f23502a.setContentType(i10);
            return this;
        }

        @Override // androidx.media.AudioAttributesImpl.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            this.f23502a.setFlags(i10);
            return this;
        }
    }

    public AudioAttributesImplApi21() {
        this.f23501b = -1;
    }

    @Override // androidx.media.AudioAttributesImpl
    public Object a() {
        return this.f23500a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AudioAttributesImplApi21) {
            return this.f23500a.equals(((AudioAttributesImplApi21) obj).f23500a);
        }
        return false;
    }

    public int hashCode() {
        return this.f23500a.hashCode();
    }

    public String toString() {
        return "AudioAttributesCompat: audioattributes=" + this.f23500a;
    }

    public AudioAttributesImplApi21(AudioAttributes audioAttributes, int i10) {
        this.f23500a = audioAttributes;
        this.f23501b = i10;
    }
}
