package Sb;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: Sb.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2218t extends Eb.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Callable f15812a;

    public C2218t(Callable callable) {
        this.f15812a = callable;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        try {
            th = (Throwable) Lb.b.e(this.f15812a.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            Ib.b.b(th);
        }
        Kb.d.p(th, pVar);
    }
}
