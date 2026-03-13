package B1;

import android.media.AudioFocusRequest;
import android.media.AudioManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: B1.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0019a {
        public static int a(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.abandonAudioFocusRequest(audioFocusRequest);
        }

        public static int b(AudioManager audioManager, AudioFocusRequest audioFocusRequest) {
            return audioManager.requestAudioFocus(audioFocusRequest);
        }
    }

    public static int a(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar != null) {
            return C0019a.a(audioManager, aVar.b());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }

    public static int b(AudioManager audioManager, androidx.media.a aVar) {
        if (audioManager == null) {
            throw new IllegalArgumentException("AudioManager must not be null");
        }
        if (aVar != null) {
            return C0019a.b(audioManager, aVar.b());
        }
        throw new IllegalArgumentException("AudioFocusRequestCompat must not be null");
    }
}
