package K1;

import D1.C0744b;
import E1.a;
import G1.AbstractC0853a;
import android.content.Context;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;

/* JADX INFO: renamed from: K1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0999h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J7.t f7060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f7061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public a f7062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C0744b f7063d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7065f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public E1.a f7067h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f7068i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f7066g = 1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7064e = 0;

    /* JADX INFO: renamed from: K1.h$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void g(float f10);

        void h(int i10);
    }

    public C0999h(final Context context, Looper looper, a aVar) {
        this.f7060a = J7.u.a(new J7.t() { // from class: K1.g
            @Override // J7.t
            public final Object get() {
                return E1.c.c(context);
            }
        });
        this.f7062c = aVar;
        this.f7061b = new Handler(looper);
    }

    public static int d(C0744b c0744b) {
        if (c0744b == null) {
            return 0;
        }
        switch (c0744b.f1669c) {
            case 0:
                G1.t.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 11:
                if (c0744b.f1667a == 1) {
                    return 2;
                }
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                return 3;
            case 15:
            default:
                G1.t.h("AudioFocusManager", "Unidentified audio usage: " + c0744b.f1669c);
                return 0;
            case 16:
                return 4;
        }
    }

    public final void c() {
        int i10 = this.f7064e;
        if (i10 == 1 || i10 == 0 || this.f7067h == null) {
            return;
        }
        E1.c.b((AudioManager) this.f7060a.get(), this.f7067h);
    }

    public final void e(int i10) {
        a aVar = this.f7062c;
        if (aVar != null) {
            aVar.h(i10);
        }
    }

    public float f() {
        return this.f7066g;
    }

    public final void g(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 != -2 && !o()) {
                l(4);
                return;
            } else {
                e(0);
                l(3);
                return;
            }
        }
        if (i10 == -1) {
            e(-1);
            c();
            l(1);
        } else if (i10 == 1) {
            l(2);
            e(1);
        } else {
            G1.t.h("AudioFocusManager", "Unknown focus change type: " + i10);
        }
    }

    public void h() {
        this.f7062c = null;
        c();
        l(0);
    }

    public final int i() {
        if (this.f7064e == 2) {
            return 1;
        }
        if (j() == 1) {
            l(2);
            return 1;
        }
        l(1);
        return -1;
    }

    public final int j() {
        E1.a aVar = this.f7067h;
        if (aVar == null || this.f7068i) {
            this.f7067h = (aVar == null ? new a.b(this.f7065f) : aVar.a()).b((C0744b) AbstractC0853a.e(this.f7063d)).d(o()).c(new AudioManager.OnAudioFocusChangeListener() { // from class: K1.f
                @Override // android.media.AudioManager.OnAudioFocusChangeListener
                public final void onAudioFocusChange(int i10) {
                    this.f7052a.g(i10);
                }
            }, this.f7061b).a();
            this.f7068i = false;
        }
        return E1.c.h((AudioManager) this.f7060a.get(), this.f7067h);
    }

    public void k(C0744b c0744b) {
        if (Objects.equals(this.f7063d, c0744b)) {
            return;
        }
        this.f7063d = c0744b;
        int iD = d(c0744b);
        this.f7065f = iD;
        boolean z10 = true;
        if (iD != 1 && iD != 0) {
            z10 = false;
        }
        AbstractC0853a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
    }

    public final void l(int i10) {
        if (this.f7064e == i10) {
            return;
        }
        this.f7064e = i10;
        float f10 = i10 == 4 ? 0.2f : 1.0f;
        if (this.f7066g == f10) {
            return;
        }
        this.f7066g = f10;
        a aVar = this.f7062c;
        if (aVar != null) {
            aVar.g(f10);
        }
    }

    public final boolean m(int i10) {
        return i10 != 1 && this.f7065f == 1;
    }

    public int n(boolean z10, int i10) {
        if (!m(i10)) {
            c();
            l(0);
            return 1;
        }
        if (z10) {
            return i();
        }
        int i11 = this.f7064e;
        if (i11 != 1) {
            return i11 != 3 ? 1 : 0;
        }
        return -1;
    }

    public final boolean o() {
        C0744b c0744b = this.f7063d;
        return c0744b != null && c0744b.f1667a == 1;
    }
}
