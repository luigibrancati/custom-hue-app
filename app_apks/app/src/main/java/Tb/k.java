package Tb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class k extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f16321a;

    public k(Callable callable) {
        this.f16321a = callable;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        Hb.c cVarB = Hb.d.b();
        tVar.b(cVarB);
        if (cVarB.j()) {
            return;
        }
        try {
            Object objE = Lb.b.e(this.f16321a.call(), "The callable returned a null value");
            if (cVarB.j()) {
                return;
            }
            tVar.onSuccess(objE);
        } catch (Throwable th) {
            Ib.b.b(th);
            if (cVarB.j()) {
                AbstractC2904a.q(th);
            } else {
                tVar.onError(th);
            }
        }
    }
}
