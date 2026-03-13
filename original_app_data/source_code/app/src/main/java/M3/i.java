package M3;

import I3.AbstractC0890u;
import M3.b;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import fc.C4015H;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f9249a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f9250b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Map f9251c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static NetworkCapabilities f9252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static boolean f9253e;

    public static final C4015H c(l lVar, ConnectivityManager connectivityManager) {
        synchronized (f9250b) {
            Map map = f9251c;
            map.remove(lVar);
            if (map.isEmpty()) {
                AbstractC0890u.e().a(k.f9260a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(f9249a);
                f9252d = null;
                f9253e = false;
            }
        }
        return C4015H.f34254a;
    }

    public final InterfaceC6082a b(final ConnectivityManager connManager, NetworkRequest networkRequest, final l onConstraintState) {
        AbstractC4862t.e(connManager, "connManager");
        AbstractC4862t.e(networkRequest, "networkRequest");
        AbstractC4862t.e(onConstraintState, "onConstraintState");
        synchronized (f9250b) {
            try {
                Map map = f9251c;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    AbstractC0890u.e().a(k.f9260a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(f9249a);
                }
                AbstractC0890u.e().a(k.f9260a, "NetworkRequestConstraintController send initial capabilities");
                onConstraintState.invoke(networkRequest.canBeSatisfiedBy(f9249a.d(connManager)) ? b.a.f9229a : new b.C0138b(7));
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return new InterfaceC6082a() { // from class: M3.h
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return i.c(onConstraintState, connManager);
            }
        };
    }

    public final NetworkCapabilities d(ConnectivityManager connectivityManager) {
        AbstractC4862t.e(connectivityManager, "<this>");
        if (f9253e) {
            return f9252d;
        }
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        f9252d = networkCapabilities;
        f9253e = true;
        return networkCapabilities;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC4862t.e(network, "network");
        AbstractC4862t.e(networkCapabilities, "networkCapabilities");
        AbstractC0890u.e().a(k.f9260a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (f9250b) {
            try {
                f9252d = networkCapabilities;
                for (Map.Entry entry : f9251c.entrySet()) {
                    ((l) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? b.a.f9229a : new b.C0138b(7));
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        AbstractC4862t.e(network, "network");
        AbstractC0890u.e().a(k.f9260a, "NetworkRequestConstraintController onLost callback");
        synchronized (f9250b) {
            try {
                f9252d = null;
                Iterator it = f9251c.keySet().iterator();
                while (it.hasNext()) {
                    ((l) it.next()).invoke(new b.C0138b(7));
                }
                C4015H c4015h = C4015H.f34254a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
