package androidx.media;

import android.util.SparseIntArray;
import androidx.media.AudioAttributesImpl;
import androidx.media.AudioAttributesImplApi26;
import androidx.media.AudioAttributesImplBase;
import v3.c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class AudioAttributesCompat implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseIntArray f23495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f23496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f23497d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AudioAttributesImpl f23498a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AudioAttributesImpl.a f23499a;

        public a() {
            if (AudioAttributesCompat.f23496c) {
                this.f23499a = new AudioAttributesImplBase.a();
            } else {
                this.f23499a = new AudioAttributesImplApi26.a();
            }
        }

        public AudioAttributesCompat a() {
            return new AudioAttributesCompat(this.f23499a.build());
        }

        public a b(int i10) {
            this.f23499a.b(i10);
            return this;
        }

        public a c(int i10) {
            this.f23499a.c(i10);
            return this;
        }

        public a d(int i10) {
            this.f23499a.a(i10);
            return this;
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f23495b = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
        f23497d = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16};
    }

    public AudioAttributesCompat() {
    }

    public static int b(boolean z10, int i10, int i11) {
        if ((i10 & 1) == 1) {
            return z10 ? 1 : 7;
        }
        if ((i10 & 4) == 4) {
            return z10 ? 0 : 6;
        }
        switch (i11) {
            case 0:
            case 1:
            case 12:
            case 14:
            case 16:
                return 3;
            case 2:
                return 0;
            case 3:
                return z10 ? 0 : 8;
            case 4:
                return 4;
            case 5:
            case 7:
            case 8:
            case 9:
            case 10:
                return 5;
            case 6:
                return 2;
            case 11:
                return 10;
            case 13:
                return 1;
            case 15:
            default:
                if (!z10) {
                    return 3;
                }
                throw new IllegalArgumentException("Unknown usage value " + i11 + " in audio attributes");
        }
    }

    public static String d(int i10) {
        switch (i10) {
            case 0:
                return "USAGE_UNKNOWN";
            case 1:
                return "USAGE_MEDIA";
            case 2:
                return "USAGE_VOICE_COMMUNICATION";
            case 3:
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            case 4:
                return "USAGE_ALARM";
            case 5:
                return "USAGE_NOTIFICATION";
            case 6:
                return "USAGE_NOTIFICATION_RINGTONE";
            case 7:
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            case 8:
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            case 9:
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            case 10:
                return "USAGE_NOTIFICATION_EVENT";
            case 11:
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            case 12:
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            case 13:
                return "USAGE_ASSISTANCE_SONIFICATION";
            case 14:
                return "USAGE_GAME";
            case 15:
            default:
                return "unknown usage " + i10;
            case 16:
                return "USAGE_ASSISTANT";
        }
    }

    public Object c() {
        return this.f23498a.a();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat) obj;
        AudioAttributesImpl audioAttributesImpl = this.f23498a;
        return audioAttributesImpl == null ? audioAttributesCompat.f23498a == null : audioAttributesImpl.equals(audioAttributesCompat.f23498a);
    }

    public int hashCode() {
        return this.f23498a.hashCode();
    }

    public String toString() {
        return this.f23498a.toString();
    }

    public AudioAttributesCompat(AudioAttributesImpl audioAttributesImpl) {
        this.f23498a = audioAttributesImpl;
    }
}
