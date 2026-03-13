package ka;

import java.util.concurrent.ExecutorService;
import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4821e implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39486a;

    public C4821e(X3.a aVar) {
        this.f39486a = aVar;
    }

    public static C4821e a(X3.a aVar) {
        return new C4821e(aVar);
    }

    public static Eb.q c(ExecutorService executorService) {
        return (Eb.q) W3.e.d(InterfaceC4817a.c.d(executorService));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Eb.q get() {
        return c((ExecutorService) this.f39486a.get());
    }
}
