package A;

import E.AbstractC0807p0;
import L.T0;
import L.U0;
import L.V0;
import L.X0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile X0 f2a;

    static {
        V0.b().c(N.a.a(), new X0.a() { // from class: A.c
            @Override // X0.a
            public final void accept(Object obj) {
                d.a((U0) obj);
            }
        });
    }

    public static /* synthetic */ void a(U0 u02) {
        f2a = new X0(e.a(u02));
        AbstractC0807p0.a("DeviceQuirks", "camera2 DeviceQuirks = " + X0.d(f2a));
    }

    public static T0 b(Class cls) {
        return f2a.b(cls);
    }

    public static X0 c() {
        return f2a;
    }
}
