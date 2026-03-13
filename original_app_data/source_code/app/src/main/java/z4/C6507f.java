package z4;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import fc.C4022e;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: z4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6507f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f48749c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final A4.a f48751b;

    /* JADX INFO: renamed from: z4.f$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final boolean a(Context context) {
            AbstractC4862t.e(context, "context");
            return context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0;
        }

        public a() {
        }
    }

    public C6507f(Context context, A4.a logger) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(logger, "logger");
        this.f48750a = context;
        this.f48751b = logger;
        if (f48749c.a(context)) {
            return;
        }
        logger.c("No ACCESS_NETWORK_STATE permission, offline mode is not supported. To enable, add <uses-permission android:name=\"android.permission.ACCESS_NETWORK_STATE\" /> to your AndroidManifest.xml. Learn more at https://www.docs.developers.amplitude.com/data/sdks/android-kotlin/#offline-mode");
    }

    public final boolean a(NetworkCapabilities networkCapabilities) {
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0);
    }

    public final boolean b() {
        NetworkCapabilities networkCapabilities;
        if (!f48749c.a(this.f48750a)) {
            return true;
        }
        try {
            Object systemService = this.f48750a.getSystemService("connectivity");
            if (!(systemService instanceof ConnectivityManager)) {
                this.f48751b.a("Service is not an instance of ConnectivityManager. Offline mode is not supported");
                return true;
            }
            Network activeNetwork = ((ConnectivityManager) systemService).getActiveNetwork();
            if (activeNetwork == null || (networkCapabilities = ((ConnectivityManager) systemService).getNetworkCapabilities(activeNetwork)) == null) {
                return false;
            }
            return a(networkCapabilities);
        } catch (Throwable th) {
            this.f48751b.c("Error checking network connectivity: " + th.getMessage());
            this.f48751b.c(C4022e.b(th));
            return true;
        }
    }
}
