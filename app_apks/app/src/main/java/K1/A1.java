package K1;

import G1.InterfaceC0860h;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class A1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f6825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.p f6826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6828d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f6829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WifiManager.WifiLock f6830b;

        public a(Context context) {
            this.f6829a = context;
        }

        public void a(boolean z10, boolean z11) {
            if (z10 && this.f6830b == null) {
                WifiManager wifiManager = (WifiManager) this.f6829a.getApplicationContext().getSystemService("wifi");
                if (wifiManager == null) {
                    G1.t.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                    return;
                } else {
                    WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                    this.f6830b = wifiLockCreateWifiLock;
                    wifiLockCreateWifiLock.setReferenceCounted(false);
                }
            }
            WifiManager.WifiLock wifiLock = this.f6830b;
            if (wifiLock == null) {
                return;
            }
            if (z10 && z11) {
                wifiLock.acquire();
            } else {
                wifiLock.release();
            }
        }
    }

    public A1(Context context, Looper looper, InterfaceC0860h interfaceC0860h) {
        this.f6825a = new a(context.getApplicationContext());
        this.f6826b = interfaceC0860h.e(looper, null);
    }

    public void c(final boolean z10) {
        if (this.f6827c == z10) {
            return;
        }
        this.f6827c = z10;
        final boolean z11 = this.f6828d;
        this.f6826b.i(new Runnable() { // from class: K1.y1
            @Override // java.lang.Runnable
            public final void run() {
                this.f7400a.f6825a.a(z10, z11);
            }
        });
    }

    public void d(final boolean z10) {
        if (this.f6828d == z10) {
            return;
        }
        this.f6828d = z10;
        if (this.f6827c) {
            this.f6826b.i(new Runnable() { // from class: K1.z1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7406a.f6825a.a(true, z10);
                }
            });
        }
    }
}
