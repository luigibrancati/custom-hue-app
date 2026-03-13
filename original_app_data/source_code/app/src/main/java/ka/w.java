package ka;

import ka.InterfaceC4817a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class w implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f39518c;

    public w(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f39516a = aVar;
        this.f39517b = aVar2;
        this.f39518c = aVar3;
    }

    public static w a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new w(aVar, aVar2, aVar3);
    }

    public static ra.q c(int i10, X3.a aVar, X3.a aVar2) {
        return (ra.q) W3.e.d(InterfaceC4817a.c.v(i10, aVar, aVar2));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ra.q get() {
        return c(((Integer) this.f39516a.get()).intValue(), this.f39517b, this.f39518c);
    }
}
