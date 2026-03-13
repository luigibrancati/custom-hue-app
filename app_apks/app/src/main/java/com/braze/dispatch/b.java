package com.braze.dispatch;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f27593a;

    public b(f fVar) {
        this.f27593a = fVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        AbstractC4862t.e(network, "network");
        AbstractC4862t.e(networkCapabilities, "networkCapabilities");
        super.onCapabilitiesChanged(network, networkCapabilities);
        this.f27593a.a(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        AbstractC4862t.e(network, "network");
        super.onLost(network);
        Network activeNetwork = this.f27593a.f27607i.getActiveNetwork();
        f fVar = this.f27593a;
        fVar.a(fVar.f27607i.getNetworkCapabilities(activeNetwork));
    }
}
