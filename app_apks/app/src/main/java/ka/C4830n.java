package ka;

import java.util.concurrent.ExecutorService;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4830n implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f39497c;

    public C4830n(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f39495a = aVar;
        this.f39496b = aVar2;
        this.f39497c = aVar3;
    }

    public static C4830n a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new C4830n(aVar, aVar2, aVar3);
    }

    public static InterfaceC4817a.b c(ExecutorService executorService, Eb.q qVar, ExecutorService executorService2) {
        return (InterfaceC4817a.b) W3.e.d(InterfaceC4817a.c.m(executorService, qVar, executorService2));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC4817a.b get() {
        return c((ExecutorService) this.f39495a.get(), (Eb.q) this.f39496b.get(), (ExecutorService) this.f39497c.get());
    }
}
