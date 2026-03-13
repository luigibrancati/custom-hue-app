package R3;

import I3.AbstractC0890u;
import android.net.NetworkRequest;
import gc.C4204q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n f14536a = new n();

    public static final NetworkRequest a(int[] capabilities, int[] transports) {
        AbstractC4862t.e(capabilities, "capabilities");
        AbstractC4862t.e(transports, "transports");
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i10 : capabilities) {
            try {
                builder.addCapability(i10);
            } catch (IllegalArgumentException e10) {
                AbstractC0890u.e().l(p.f14538b.a(), "Ignoring adding capability '" + i10 + '\'', e10);
            }
        }
        for (int i11 : q.f14541a) {
            if (!C4204q.N(capabilities, i11)) {
                try {
                    builder.removeCapability(i11);
                } catch (IllegalArgumentException e11) {
                    AbstractC0890u.e().l(p.f14538b.a(), "Ignoring removing default capability '" + i11 + '\'', e11);
                }
            }
        }
        for (int i12 : transports) {
            builder.addTransportType(i12);
        }
        NetworkRequest networkRequestBuild = builder.build();
        AbstractC4862t.d(networkRequestBuild, "build(...)");
        return networkRequestBuild;
    }

    public final p b(int[] capabilities, int[] transports) {
        AbstractC4862t.e(capabilities, "capabilities");
        AbstractC4862t.e(transports, "transports");
        return new p(a(capabilities, transports));
    }
}
