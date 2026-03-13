package Sb;

import bc.AbstractC2904a;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Sb.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class CallableC2223y extends Eb.k implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f15860a;

    public CallableC2223y(Callable callable) {
        this.f15860a = callable;
    }

    @Override // java.util.concurrent.Callable
    public Object call() {
        return Lb.b.e(this.f15860a.call(), "The callable returned a null value");
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        Nb.f fVar = new Nb.f(pVar);
        pVar.b(fVar);
        if (fVar.j()) {
            return;
        }
        try {
            fVar.e(Lb.b.e(this.f15860a.call(), "Callable returned null"));
        } catch (Throwable th) {
            Ib.b.b(th);
            if (fVar.j()) {
                AbstractC2904a.q(th);
            } else {
                pVar.onError(th);
            }
        }
    }
}
