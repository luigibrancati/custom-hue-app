package w7;

import android.os.Bundle;
import android.os.RemoteException;
import b7.C2878l;
import io.sentry.protocol.SentryStackFrame;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class j extends x7.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2878l f46314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f46315c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(m mVar, C2878l c2878l, C2878l c2878l2) {
        super(c2878l);
        this.f46314b = c2878l2;
        this.f46315c = mVar;
    }

    @Override // x7.g
    public final void a() {
        try {
            x7.d dVar = (x7.d) this.f46315c.f46320a.e();
            String str = this.f46315c.f46321b;
            Bundle bundle = new Bundle();
            Map mapA = n.a();
            bundle.putInt("playcore_version_code", ((Integer) mapA.get("java")).intValue());
            if (mapA.containsKey(SentryStackFrame.JsonKeys.NATIVE)) {
                bundle.putInt("playcore_native_version", ((Integer) mapA.get(SentryStackFrame.JsonKeys.NATIVE)).intValue());
            }
            if (mapA.containsKey("unity")) {
                bundle.putInt("playcore_unity_version", ((Integer) mapA.get("unity")).intValue());
            }
            m mVar = this.f46315c;
            dVar.n5(str, bundle, new l(mVar, this.f46314b, mVar.f46321b));
        } catch (RemoteException e10) {
            m.f46319c.b(e10, "error requesting in-app review for %s", this.f46315c.f46321b);
            this.f46314b.d(new RuntimeException(e10));
        }
    }
}
