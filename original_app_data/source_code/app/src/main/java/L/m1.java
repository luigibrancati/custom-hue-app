package L;

import E.InterfaceC0823y;
import H.b;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f8144a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC0823y f8145b;

    public static final InterfaceC0823y a() {
        InterfaceC0823y interfaceC0823y = f8145b;
        if (interfaceC0823y != null) {
            return interfaceC0823y;
        }
        AbstractC4862t.p("cameraUseCaseAdapterProvider");
        return null;
    }

    public static final void b(InterfaceC0823y interfaceC0823y) {
        AbstractC4862t.e(interfaceC0823y, "<set-?>");
        f8145b = interfaceC0823y;
    }

    public static final P.b c(I cameraInfoInternal, E.F0 sessionConfig, boolean z10, H.b bVar) {
        AbstractC4862t.e(cameraInfoInternal, "cameraInfoInternal");
        AbstractC4862t.e(sessionConfig, "sessionConfig");
        if (f8145b == null) {
            throw new IllegalStateException("mCameraUseCaseAdapterProvider must be initialized first!");
        }
        InterfaceC0823y interfaceC0823yA = a();
        String strD = cameraInfoInternal.d();
        AbstractC4862t.d(strD, "getCameraId(...)");
        P.f fVarA = interfaceC0823yA.a(strD);
        sessionConfig.l();
        fVarA.k0(null);
        fVarA.g0(sessionConfig.c());
        fVarA.j0(sessionConfig.i());
        fVarA.i0(sessionConfig.f());
        List listK = sessionConfig.k();
        if (bVar == null) {
            bVar = b.a.c(H.b.f4786b, sessionConfig, cameraInfoInternal, null, 2, null);
        }
        P.b bVarM0 = fVarA.m0(listK, bVar, z10);
        AbstractC4862t.d(bVarM0, "simulateAddUseCases(...)");
        return bVarM0;
    }
}
