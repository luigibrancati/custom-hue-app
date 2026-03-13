package z4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6508g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.a f48753b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f48754c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ConnectivityManager.NetworkCallback f48755d;

    /* JADX INFO: renamed from: z4.g$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: z4.g$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Network f48756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f48757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f48758c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f48759d;

        public b(Network network, a networkCallback, boolean z10, boolean z11) {
            AbstractC4862t.e(network, "network");
            AbstractC4862t.e(networkCallback, "networkCallback");
            this.f48756a = network;
            this.f48757b = networkCallback;
            this.f48758c = z10;
            this.f48759d = z11;
            a();
        }

        public static /* synthetic */ void c(b bVar, Network network, boolean z10, boolean z11, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = bVar.f48758c;
            }
            if ((i10 & 4) != 0) {
                z11 = bVar.f48759d;
            }
            bVar.b(network, z10, z11);
        }

        public final void a() {
            if (!this.f48758c || this.f48759d) {
                this.f48757b.a();
            } else {
                this.f48757b.b();
            }
        }

        public final void b(Network network, boolean z10, boolean z11) {
            AbstractC4862t.e(network, "network");
            if (AbstractC4862t.a(this.f48756a, network)) {
                boolean z12 = (this.f48758c == z10 && this.f48759d == z11) ? false : true;
                this.f48758c = z10;
                this.f48759d = z11;
                if (z12) {
                    a();
                }
            }
        }
    }

    /* JADX INFO: renamed from: z4.g$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public b f48760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ConnectivityManager f48761b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ C6508g f48762c;

        public c(ConnectivityManager connectivityManager, C6508g c6508g) {
            this.f48761b = connectivityManager;
            this.f48762c = c6508g;
        }

        public final boolean a(NetworkCapabilities networkCapabilities) {
            return networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            AbstractC4862t.e(network, "network");
            NetworkCapabilities networkCapabilities = this.f48761b.getNetworkCapabilities(network);
            this.f48760a = new b(network, this.f48762c.f48754c, networkCapabilities != null ? a(networkCapabilities) : true, false);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            AbstractC4862t.e(network, "network");
            b bVar = this.f48760a;
            if (bVar != null) {
                b.c(bVar, network, false, z10, 2, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC4862t.e(network, "network");
            AbstractC4862t.e(networkCapabilities, "networkCapabilities");
            b bVar = this.f48760a;
            if (bVar != null) {
                b.c(bVar, network, a(networkCapabilities), false, 4, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC4862t.e(network, "network");
            b bVar = this.f48760a;
            if (bVar != null) {
                b.c(bVar, network, false, false, 4, null);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            this.f48762c.f48754c.a();
        }
    }

    public C6508g(Context context, A4.a logger, a networkCallback) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(logger, "logger");
        AbstractC4862t.e(networkCallback, "networkCallback");
        this.f48752a = context;
        this.f48753b = logger;
        this.f48754c = networkCallback;
    }

    public final void b() {
        Object systemService = this.f48752a.getSystemService("connectivity");
        AbstractC4862t.c(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addCapability(12).build();
        c cVar = new c(connectivityManager, this);
        connectivityManager.registerNetworkCallback(networkRequestBuild, cVar);
        this.f48755d = cVar;
    }

    public final void c() {
        if (!C6507f.f48749c.a(this.f48752a)) {
            this.f48753b.a("ACCESS_NETWORK_STATE permission not granted, skipping network listener setup");
            return;
        }
        try {
            b();
        } catch (Throwable th) {
            this.f48753b.c("Error starting network listener: " + th.getMessage());
        }
    }
}
