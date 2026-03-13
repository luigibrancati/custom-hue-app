package ma;

import ea.C3974b;
import oa.InterfaceC5260l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f40236a;

    public e(X3.a aVar) {
        this.f40236a = aVar;
    }

    public static e a(X3.a aVar) {
        return new e(aVar);
    }

    public static InterfaceC5260l c(C3974b c3974b) {
        return (InterfaceC5260l) W3.e.d(c.b(c3974b));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5260l get() {
        return c((C3974b) this.f40236a.get());
    }
}
