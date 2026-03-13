package Tb;

import Eb.v;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class c extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f16290a;

    public c(Callable callable) {
        this.f16290a = callable;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        try {
            ((v) Lb.b.e(this.f16290a.call(), "The singleSupplier returned a null SingleSource")).c(tVar);
        } catch (Throwable th) {
            Ib.b.b(th);
            Kb.d.s(th, tVar);
        }
    }
}
