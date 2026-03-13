package R3;

import android.net.NetworkRequest;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f14537a = new o();

    public final int[] a(NetworkRequest request) {
        AbstractC4862t.e(request, "request");
        int[] capabilities = request.getCapabilities();
        AbstractC4862t.d(capabilities, "getCapabilities(...)");
        return capabilities;
    }

    public final int[] b(NetworkRequest request) {
        AbstractC4862t.e(request, "request");
        int[] transportTypes = request.getTransportTypes();
        AbstractC4862t.d(transportTypes, "getTransportTypes(...)");
        return transportTypes;
    }
}
