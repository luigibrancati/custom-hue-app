package Tb;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class i extends Eb.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f16314a;

    public i(Callable callable) {
        this.f16314a = callable;
    }

    @Override // Eb.r
    public void C(Eb.t tVar) {
        try {
            th = (Throwable) Lb.b.e(this.f16314a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            Ib.b.b(th);
        }
        Kb.d.s(th, tVar);
    }
}
