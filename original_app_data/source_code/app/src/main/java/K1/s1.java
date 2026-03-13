package K1;

import G1.AbstractC0853a;
import G1.C0858f;
import G1.InterfaceC0860h;
import K1.s1;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Looper;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f7317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f7318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0858f f7319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AudioManager f7320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f7321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f7322f;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface b {
        void u(int i10);

        void x(int i10, boolean z10);
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f7323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f7324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f7325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f7326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f7327e;

        public c(int i10, int i11, boolean z10, int i12, int i13) {
            this.f7323a = i10;
            this.f7324b = i11;
            this.f7325c = z10;
            this.f7326d = i12;
            this.f7327e = i13;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public final class d extends BroadcastReceiver {
        public d() {
        }

        public static /* synthetic */ void a(d dVar) {
            if (s1.this.f7321e == null) {
                return;
            }
            s1.this.f7319c.g(s1.this.j(((c) s1.this.f7319c.d()).f7323a));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            s1.this.f7319c.e(new Runnable() { // from class: K1.t1
                @Override // java.lang.Runnable
                public final void run() {
                    s1.d.a(this.f7330a);
                }
            });
        }
    }

    public s1(Context context, b bVar, final int i10, Looper looper, Looper looper2, InterfaceC0860h interfaceC0860h) {
        this.f7317a = context.getApplicationContext();
        this.f7318b = bVar;
        C0858f c0858f = new C0858f(new c(i10, 0, false, 0, 0), looper, looper2, interfaceC0860h, new C0858f.a() { // from class: K1.m1
            @Override // G1.C0858f.a
            public final void a(Object obj, Object obj2) {
                this.f7269a.m((s1.c) obj, (s1.c) obj2);
            }
        });
        this.f7319c = c0858f;
        c0858f.e(new Runnable() { // from class: K1.n1
            @Override // java.lang.Runnable
            public final void run() {
                s1.f(this.f7277a, i10);
            }
        });
    }

    public static /* synthetic */ c a(int i10, c cVar) {
        return new c(i10, cVar.f7324b, cVar.f7325c, cVar.f7326d, cVar.f7327e);
    }

    public static /* synthetic */ c c(s1 s1Var, int i10, c cVar) {
        s1Var.getClass();
        return cVar.f7323a == i10 ? cVar : s1Var.j(i10);
    }

    public static /* synthetic */ c d(s1 s1Var, c cVar) {
        d dVar = s1Var.f7321e;
        if (dVar != null) {
            try {
                s1Var.f7317a.unregisterReceiver(dVar);
            } catch (RuntimeException e10) {
                G1.t.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            s1Var.f7321e = null;
        }
        return cVar;
    }

    public static /* synthetic */ void f(s1 s1Var, int i10) {
        s1Var.f7320d = (AudioManager) AbstractC0853a.i((AudioManager) s1Var.f7317a.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND));
        d dVar = new d();
        try {
            s1Var.f7317a.registerReceiver(dVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            s1Var.f7321e = dVar;
        } catch (RuntimeException e10) {
            G1.t.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
        s1Var.f7319c.g(s1Var.j(i10));
    }

    public final c j(int i10) {
        AbstractC0853a.e(this.f7320d);
        return new c(i10, E1.c.f(this.f7320d, i10), E1.c.g(this.f7320d, i10), E1.c.e(this.f7320d, i10), E1.c.d(this.f7320d, i10));
    }

    public int k() {
        return ((c) this.f7319c.d()).f7327e;
    }

    public int l() {
        return ((c) this.f7319c.d()).f7326d;
    }

    public final void m(c cVar, c cVar2) {
        boolean z10 = cVar.f7325c;
        if (!z10 && cVar2.f7325c) {
            this.f7322f = cVar.f7324b;
        }
        int i10 = cVar.f7324b;
        int i11 = cVar2.f7324b;
        if (i10 != i11 || z10 != cVar2.f7325c) {
            this.f7318b.x(i11, cVar2.f7325c);
        }
        int i12 = cVar.f7323a;
        int i13 = cVar2.f7323a;
        if (i12 == i13 && cVar.f7326d == cVar2.f7326d && cVar.f7327e == cVar2.f7327e) {
            return;
        }
        this.f7318b.u(i13);
    }

    public void n() {
        this.f7319c.h(new J7.f() { // from class: K1.q1
            @Override // J7.f
            public final Object apply(Object obj) {
                return s1.b((s1.c) obj);
            }
        }, new J7.f() { // from class: K1.r1
            @Override // J7.f
            public final Object apply(Object obj) {
                return s1.d(this.f7312a, (s1.c) obj);
            }
        });
    }

    public void o(final int i10) {
        this.f7319c.h(new J7.f() { // from class: K1.o1
            @Override // J7.f
            public final Object apply(Object obj) {
                return s1.a(i10, (s1.c) obj);
            }
        }, new J7.f() { // from class: K1.p1
            @Override // J7.f
            public final Object apply(Object obj) {
                return s1.c(this.f7306a, i10, (s1.c) obj);
            }
        });
    }

    public static /* synthetic */ c b(c cVar) {
        return cVar;
    }
}
