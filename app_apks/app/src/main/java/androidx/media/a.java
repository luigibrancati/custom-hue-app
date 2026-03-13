package androidx.media;

import X0.c;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import androidx.media.AudioAttributesCompat;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AudioAttributesCompat f23511g = new AudioAttributesCompat.a().d(1).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f23512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f23513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f23514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioAttributesCompat f23515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f23516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f23517f;

    /* JADX INFO: renamed from: androidx.media.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class C0298a {
        public static AudioFocusRequest a(int i10, AudioAttributes audioAttributes, boolean z10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            return new AudioFocusRequest.Builder(i10).setAudioAttributes(audioAttributes).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23518a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AudioManager.OnAudioFocusChangeListener f23519b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f23520c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AudioAttributesCompat f23521d = a.f23511g;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f23522e;

        public b(int i10) {
            d(i10);
        }

        public static boolean b(int i10) {
            return i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4;
        }

        public a a() {
            if (this.f23519b != null) {
                return new a(this.f23518a, this.f23519b, this.f23520c, this.f23521d, this.f23522e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b c(AudioAttributesCompat audioAttributesCompat) {
            if (audioAttributesCompat == null) {
                throw new NullPointerException("Illegal null AudioAttributes");
            }
            this.f23521d = audioAttributesCompat;
            return this;
        }

        public b d(int i10) {
            if (b(i10)) {
                this.f23518a = i10;
                return this;
            }
            throw new IllegalArgumentException("Illegal audio focus gain type " + i10);
        }

        public b e(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
            return f(onAudioFocusChangeListener, new Handler(Looper.getMainLooper()));
        }

        public b f(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            if (onAudioFocusChangeListener == null) {
                throw new IllegalArgumentException("OnAudioFocusChangeListener must not be null");
            }
            if (handler == null) {
                throw new IllegalArgumentException("Handler must not be null");
            }
            this.f23519b = onAudioFocusChangeListener;
            this.f23520c = handler;
            return this;
        }

        public b g(boolean z10) {
            this.f23522e = z10;
            return this;
        }
    }

    public a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, AudioAttributesCompat audioAttributesCompat, boolean z10) {
        this.f23512a = i10;
        this.f23514c = handler;
        this.f23515d = audioAttributesCompat;
        this.f23516e = z10;
        this.f23513b = onAudioFocusChangeListener;
        this.f23517f = C0298a.a(i10, a(), z10, onAudioFocusChangeListener, handler);
    }

    public AudioAttributes a() {
        AudioAttributesCompat audioAttributesCompat = this.f23515d;
        if (audioAttributesCompat != null) {
            return (AudioAttributes) audioAttributesCompat.c();
        }
        return null;
    }

    public AudioFocusRequest b() {
        return (AudioFocusRequest) this.f23517f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f23512a == aVar.f23512a && this.f23516e == aVar.f23516e && c.a(this.f23513b, aVar.f23513b) && c.a(this.f23514c, aVar.f23514c) && c.a(this.f23515d, aVar.f23515d);
    }

    public int hashCode() {
        return c.b(Integer.valueOf(this.f23512a), this.f23513b, this.f23514c, this.f23515d, Boolean.valueOf(this.f23516e));
    }
}
