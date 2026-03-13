package x;

import L.C1095e0;
import L.InterfaceC1099g0;
import L.InterfaceC1132x0;
import L.a1;
import L.t1;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class P0 implements L.t1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C6236k1 f46694b;

    public P0(Context context) {
        this.f46694b = C6236k1.c(context);
    }

    @Override // L.t1
    public InterfaceC1099g0 a(t1.b bVar, int i10) {
        L.M0 m0G0 = L.M0.g0();
        a1.b bVar2 = new a1.b();
        bVar2.y(g2.b(bVar, i10));
        m0G0.H(L.s1.f8186w, bVar2.p());
        m0G0.H(L.s1.f8188y, O0.f46689a);
        C1095e0.a aVar = new C1095e0.a();
        aVar.t(g2.a(bVar, i10));
        m0G0.H(L.s1.f8187x, aVar.h());
        m0G0.H(L.s1.f8189z, bVar == t1.b.IMAGE_CAPTURE ? H1.f46629c : C6205a0.f46865a);
        if (bVar == t1.b.PREVIEW) {
            m0G0.H(InterfaceC1132x0.f8222s, this.f46694b.f());
        }
        m0G0.H(InterfaceC1132x0.f8217n, Integer.valueOf(this.f46694b.d(true).getRotation()));
        if (bVar == t1.b.VIDEO_CAPTURE || bVar == t1.b.STREAM_SHARING) {
            m0G0.H(L.s1.f8179E, Boolean.TRUE);
        }
        return L.R0.f0(m0G0);
    }
}
