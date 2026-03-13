package Sb;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Sb.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2208i extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f15737a;

    public C2208i(Callable callable) {
        this.f15737a = callable;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        try {
            ((Eb.n) Lb.b.e(this.f15737a.call(), "null ObservableSource supplied")).f(pVar);
        } catch (Throwable th) {
            Ib.b.b(th);
            Kb.d.p(th, pVar);
        }
    }
}
