package E1;

import G1.AbstractC0853a;
import G1.AbstractC0854b;
import G1.C0863k;
import G1.t;
import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AudioManager f3184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Context f3185b;

    public static /* synthetic */ void a(Context context, C0863k c0863k) {
        f3184a = (AudioManager) context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        c0863k.f();
    }

    public static int b(AudioManager audioManager, a aVar) {
        return audioManager.abandonAudioFocusRequest(aVar.c());
    }

    public static synchronized AudioManager c(Context context) {
        try {
            final Context applicationContext = context.getApplicationContext();
            if (f3185b != applicationContext) {
                f3184a = null;
            }
            AudioManager audioManager = f3184a;
            if (audioManager != null) {
                return audioManager;
            }
            Looper looperMyLooper = Looper.myLooper();
            if (looperMyLooper != null && looperMyLooper != Looper.getMainLooper()) {
                final C0863k c0863k = new C0863k();
                AbstractC0854b.a().execute(new Runnable() { // from class: E1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        c.a(applicationContext, c0863k);
                    }
                });
                c0863k.b();
                return (AudioManager) AbstractC0853a.e(f3184a);
            }
            AudioManager audioManager2 = (AudioManager) applicationContext.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            f3184a = audioManager2;
            return (AudioManager) AbstractC0853a.e(audioManager2);
        } catch (Throwable th) {
            throw th;
        }
    }

    public static int d(AudioManager audioManager, int i10) {
        return audioManager.getStreamMaxVolume(i10);
    }

    public static int e(AudioManager audioManager, int i10) {
        return audioManager.getStreamMinVolume(i10);
    }

    public static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            t.i("AudioManagerCompat", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    public static boolean g(AudioManager audioManager, int i10) {
        return audioManager.isStreamMute(i10);
    }

    public static int h(AudioManager audioManager, a aVar) {
        return audioManager.requestAudioFocus(aVar.c());
    }
}
