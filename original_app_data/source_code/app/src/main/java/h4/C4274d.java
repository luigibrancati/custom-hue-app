package h4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import h4.InterfaceC4273c;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: h4.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4274d implements InterfaceC4273c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConnectivityManager f36250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4273c.b f36251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f36252d;

    /* JADX INFO: renamed from: h4.d$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC4862t.e(network, "network");
            C4274d.this.d(network, true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC4862t.e(network, "network");
            C4274d.this.d(network, false);
        }
    }

    public C4274d(ConnectivityManager connectivityManager, InterfaceC4273c.b listener) {
        AbstractC4862t.e(connectivityManager, "connectivityManager");
        AbstractC4862t.e(listener, "listener");
        this.f36250b = connectivityManager;
        this.f36251c = listener;
        a aVar = new a();
        this.f36252d = aVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), aVar);
    }

    @Override // h4.InterfaceC4273c
    public boolean a() {
        Network[] allNetworks = this.f36250b.getAllNetworks();
        AbstractC4862t.d(allNetworks, "connectivityManager.allNetworks");
        for (Network it : allNetworks) {
            AbstractC4862t.d(it, "it");
            if (c(it)) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(Network network) {
        NetworkCapabilities networkCapabilities = this.f36250b.getNetworkCapabilities(network);
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }

    public final void d(Network network, boolean z10) {
        boolean zC;
        Network[] allNetworks = this.f36250b.getAllNetworks();
        AbstractC4862t.d(allNetworks, "connectivityManager.allNetworks");
        int length = allNetworks.length;
        boolean z11 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            Network it = allNetworks[i10];
            if (AbstractC4862t.a(it, network)) {
                zC = z10;
            } else {
                AbstractC4862t.d(it, "it");
                zC = c(it);
            }
            if (zC) {
                z11 = true;
                break;
            }
            i10++;
        }
        this.f36251c.a(z11);
    }

    @Override // h4.InterfaceC4273c
    public void shutdown() {
        this.f36250b.unregisterNetworkCallback(this.f36252d);
    }
}
