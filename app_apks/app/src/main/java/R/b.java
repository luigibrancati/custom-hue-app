package R;

import E.AbstractC0807p0;
import L.T0;
import L.U0;
import L.V0;
import L.X0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile X0 f14284a;

    static {
        V0.b().c(N.a.a(), new X0.a() { // from class: R.a
            @Override // X0.a
            public final void accept(Object obj) {
                b.a((U0) obj);
            }
        });
    }

    public static /* synthetic */ void a(U0 u02) {
        f14284a = new X0(c.a(u02));
        AbstractC0807p0.a("DeviceQuirks", "core DeviceQuirks = " + X0.d(f14284a));
    }

    public static T0 b(Class cls) {
        return f14284a.b(cls);
    }

    public static X0 c() {
        return f14284a;
    }
}
