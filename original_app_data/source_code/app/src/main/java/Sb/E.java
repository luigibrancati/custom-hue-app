package Sb;

import Sb.T;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class E extends Eb.k implements Mb.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f15466a;

    public E(Object obj) {
        this.f15466a = obj;
    }

    @Override // Mb.f, java.util.concurrent.Callable
    public Object call() {
        return this.f15466a;
    }

    @Override // Eb.k
    public void v0(Eb.p pVar) {
        T.a aVar = new T.a(pVar, this.f15466a);
        pVar.b(aVar);
        aVar.run();
    }
}
