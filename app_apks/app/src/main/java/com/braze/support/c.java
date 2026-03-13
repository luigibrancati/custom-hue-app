package com.braze.support;

import android.net.NetworkCapabilities;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f28632a = new c();

    public static final com.braze.enums.e a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return com.braze.enums.e.f27654a;
        }
        int iMin = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        return iMin > 14000 ? com.braze.enums.e.f27657d : iMin > 4000 ? com.braze.enums.e.f27656c : com.braze.enums.e.f27655b;
    }
}
