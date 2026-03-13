package oa;

import sa.InterfaceC5813a;

/* JADX INFO: renamed from: oa.x, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5271x implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41495b;

    public C5271x(X3.a aVar, X3.a aVar2) {
        this.f41494a = aVar;
        this.f41495b = aVar2;
    }

    public static C5271x a(X3.a aVar, X3.a aVar2) {
        return new C5271x(aVar, aVar2);
    }

    public static C5270w c(InterfaceC5813a interfaceC5813a, qa.g gVar) {
        return new C5270w(interfaceC5813a, gVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5270w get() {
        return c((InterfaceC5813a) this.f41494a.get(), (qa.g) this.f41495b.get());
    }
}
