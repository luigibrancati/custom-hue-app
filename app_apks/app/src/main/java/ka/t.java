package ka;

import ka.InterfaceC4817a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f39509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f39510d;

    public t(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f39507a = aVar;
        this.f39508b = aVar2;
        this.f39509c = aVar3;
        this.f39510d = aVar4;
    }

    public static t a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new t(aVar, aVar2, aVar3, aVar4);
    }

    public static ta.w c(int i10, X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return (ta.w) W3.e.d(InterfaceC4817a.c.s(i10, aVar, aVar2, aVar3));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ta.w get() {
        return c(((Integer) this.f39507a.get()).intValue(), this.f39508b, this.f39509c, this.f39510d);
    }
}
