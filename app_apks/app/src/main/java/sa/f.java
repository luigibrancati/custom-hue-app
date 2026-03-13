package sa;

import Eb.q;
import java.util.concurrent.ExecutorService;
import oa.InterfaceC5273z;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f44421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f44422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f44423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f44424d;

    public f(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f44421a = aVar;
        this.f44422b = aVar2;
        this.f44423c = aVar3;
        this.f44424d = aVar4;
    }

    public static f a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new f(aVar, aVar2, aVar3, aVar4);
    }

    public static e c(String str, InterfaceC5273z interfaceC5273z, ExecutorService executorService, q qVar) {
        return new e(str, interfaceC5273z, executorService, qVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public e get() {
        return c((String) this.f44421a.get(), (InterfaceC5273z) this.f44422b.get(), (ExecutorService) this.f44423c.get(), (q) this.f44424d.get());
    }
}
