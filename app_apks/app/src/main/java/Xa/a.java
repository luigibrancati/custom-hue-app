package Xa;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import io.sentry.MeasurementUnit;
import io.sentry.protocol.Request;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f19429a;

    public a(ConnectivityManager connectivityManager) {
        this.f19429a = connectivityManager;
    }

    public List a(Network network) {
        return b(this.f19429a.getNetworkCapabilities(network));
    }

    public List b(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add(MeasurementUnit.NONE);
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add("ethernet");
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add("vpn");
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add("bluetooth");
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add(Request.JsonKeys.OTHER);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(MeasurementUnit.NONE);
        }
        return arrayList;
    }

    public ConnectivityManager c() {
        return this.f19429a;
    }

    public List d() {
        return a(this.f19429a.getActiveNetwork());
    }
}
