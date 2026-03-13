package ka;

import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4832p implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f39502c;

    public C4832p(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f39500a = aVar;
        this.f39501b = aVar2;
        this.f39502c = aVar3;
    }

    public static C4832p a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new C4832p(aVar, aVar2, aVar3);
    }

    public static ra.j c(int i10, X3.a aVar, X3.a aVar2) {
        return (ra.j) W3.e.d(InterfaceC4817a.c.o(i10, aVar, aVar2));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public ra.j get() {
        return c(((Integer) this.f39500a.get()).intValue(), this.f39501b, this.f39502c);
    }
}
