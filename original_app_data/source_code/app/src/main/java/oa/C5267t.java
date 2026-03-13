package oa;

import oa.InterfaceC5251c;
import sa.InterfaceC5813a;

/* JADX INFO: renamed from: oa.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C5267t implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f41485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f41486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f41487c;

    public C5267t(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f41485a = aVar;
        this.f41486b = aVar2;
        this.f41487c = aVar3;
    }

    public static C5267t a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new C5267t(aVar, aVar2, aVar3);
    }

    public static C5266s c(InterfaceC5813a interfaceC5813a, InterfaceC5251c.a aVar, Eb.q qVar) {
        return new C5266s(interfaceC5813a, aVar, qVar);
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C5266s get() {
        return c((InterfaceC5813a) this.f41485a.get(), (InterfaceC5251c.a) this.f41486b.get(), (Eb.q) this.f41487c.get());
    }
}
