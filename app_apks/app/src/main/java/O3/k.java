package O3;

import I3.AbstractC0890u;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f10929a;

    static {
        String strI = AbstractC0890u.i("NetworkStateTracker");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f10929a = strI;
    }

    public static final h a(Context context, S3.b taskExecutor) {
        AbstractC4862t.e(context, "context");
        AbstractC4862t.e(taskExecutor, "taskExecutor");
        return new j(context, taskExecutor);
    }

    public static final M3.f c(ConnectivityManager connectivityManager) {
        AbstractC4862t.e(connectivityManager, "<this>");
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return new M3.f(activeNetworkInfo != null && activeNetworkInfo.isConnected(), e(connectivityManager), T0.a.a(connectivityManager), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
        } catch (SecurityException e10) {
            AbstractC0890u.e().d(f10929a, "Unable to get active network state", e10);
            return new M3.f(false, false, false, true);
        }
    }

    public static final M3.f d(NetworkCapabilities networkCapabilities) {
        AbstractC4862t.e(networkCapabilities, "<this>");
        return new M3.f(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18));
    }

    public static final boolean e(ConnectivityManager connectivityManager) {
        AbstractC4862t.e(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasCapability(16);
            }
            return false;
        } catch (SecurityException e10) {
            AbstractC0890u.e().d(f10929a, "Unable to validate active network", e10);
            return false;
        }
    }
}
