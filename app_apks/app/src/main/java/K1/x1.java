package K1;

import G1.InterfaceC0860h;
import android.content.Context;
import android.os.Looper;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.p f7355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f7356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7357d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f7358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PowerManager.WakeLock f7359b;

        public a(Context context) {
            this.f7358a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f7359b == null) {
                PowerManager powerManager = (PowerManager) this.f7358a.getSystemService("power");
                if (powerManager == null) {
                    G1.t.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                    return;
                } else {
                    PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                    this.f7359b = wakeLockNewWakeLock;
                    wakeLockNewWakeLock.setReferenceCounted(false);
                }
            }
            PowerManager.WakeLock wakeLock = this.f7359b;
            if (wakeLock == null) {
                return;
            }
            if (z10 && z11) {
                wakeLock.acquire();
            } else {
                wakeLock.release();
            }
        }
    }

    public x1(Context context, Looper looper, InterfaceC0860h interfaceC0860h) {
        this.f7354a = new a(context.getApplicationContext());
        this.f7355b = interfaceC0860h.e(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f7356c == z10) {
            return;
        }
        this.f7356c = z10;
        final boolean z11 = this.f7357d;
        this.f7355b.i(new Runnable() { // from class: K1.w1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7342a.f7354a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f7357d == z10) {
            return;
        }
        this.f7357d = z10;
        if (this.f7356c) {
            this.f7355b.i(new Runnable() { // from class: K1.v1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7336a.f7354a.a(true, z10);
                }
            });
        }
    }
}
