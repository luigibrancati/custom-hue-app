package E1;

import D1.C0744b;
import G1.AbstractC0853a;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3171a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f3172b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f3173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0744b f3174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f3175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f3176f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3177a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AudioManager.OnAudioFocusChangeListener f3178b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f3179c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public C0744b f3180d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3181e;

        public a a() {
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.f3178b;
            if (onAudioFocusChangeListener != null) {
                return new a(this.f3177a, onAudioFocusChangeListener, (Handler) AbstractC0853a.e(this.f3179c), this.f3180d, this.f3181e);
            }
            throw new IllegalStateException("Can't build an AudioFocusRequestCompat instance without a listener");
        }

        public b b(C0744b c0744b) {
            AbstractC0853a.e(c0744b);
            this.f3180d = c0744b;
            return this;
        }

        public b c(AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler) {
            AbstractC0853a.e(onAudioFocusChangeListener);
            AbstractC0853a.e(handler);
            this.f3178b = onAudioFocusChangeListener;
            this.f3179c = handler;
            return this;
        }

        public b d(boolean z10) {
            this.f3181e = z10;
            return this;
        }

        public b(int i10) {
            this.f3180d = C0744b.f1660h;
            this.f3177a = i10;
        }

        public b(a aVar) {
            this.f3177a = aVar.e();
            this.f3178b = aVar.f();
            this.f3179c = aVar.d();
            this.f3180d = aVar.b();
            this.f3181e = aVar.g();
        }
    }

    public a(int i10, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, C0744b c0744b, boolean z10) {
        this.f3171a = i10;
        this.f3173c = handler;
        this.f3174d = c0744b;
        this.f3175e = z10;
        this.f3172b = onAudioFocusChangeListener;
        this.f3176f = new AudioFocusRequest.Builder(i10).setAudioAttributes(c0744b.a().f1674a).setWillPauseWhenDucked(z10).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build();
    }

    public b a() {
        return new b();
    }

    public C0744b b() {
        return this.f3174d;
    }

    public AudioFocusRequest c() {
        return (AudioFocusRequest) AbstractC0853a.e(this.f3176f);
    }

    public Handler d() {
        return this.f3173c;
    }

    public int e() {
        return this.f3171a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f3171a == aVar.f3171a && this.f3175e == aVar.f3175e && Objects.equals(this.f3172b, aVar.f3172b) && Objects.equals(this.f3173c, aVar.f3173c) && Objects.equals(this.f3174d, aVar.f3174d);
    }

    public AudioManager.OnAudioFocusChangeListener f() {
        return this.f3172b;
    }

    public boolean g() {
        return this.f3175e;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3171a), this.f3172b, this.f3173c, this.f3174d, Boolean.valueOf(this.f3175e));
    }
}
