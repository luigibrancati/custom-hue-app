package ka;

import ka.InterfaceC4817a;

/* JADX INFO: renamed from: ka.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4834s implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39505a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39506b;

    public C4834s(X3.a aVar, X3.a aVar2) {
        this.f39505a = aVar;
        this.f39506b = aVar2;
    }

    public static C4834s a(X3.a aVar, X3.a aVar2) {
        return new C4834s(aVar, aVar2);
    }

    public static Eb.k c(int i10, ta.u uVar) {
        return (Eb.k) W3.e.d(InterfaceC4817a.c.r(i10, uVar));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Eb.k get() {
        return c(((Integer) this.f39505a.get()).intValue(), (ta.u) this.f39506b.get());
    }
}
