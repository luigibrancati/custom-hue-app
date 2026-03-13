package K;

import E.AbstractC0801m0;
import E.G0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C implements U.y {
    @Override // U.y
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public androidx.camera.core.d apply(U.z zVar) {
        androidx.camera.core.d dVar = (androidx.camera.core.d) zVar.c();
        G0 g02 = new G0(dVar, zVar.h(), AbstractC0801m0.e(dVar.L0().c(), dVar.L0().getTimestamp(), zVar.f(), zVar.g(), dVar.L0().b()));
        g02.setCropRect(zVar.b());
        return g02;
    }
}
