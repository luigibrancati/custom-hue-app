package ka;

import ka.InterfaceC4817a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39512b;

    public u(X3.a aVar, X3.a aVar2) {
        this.f39511a = aVar;
        this.f39512b = aVar2;
    }

    public static u a(X3.a aVar, X3.a aVar2) {
        return new u(aVar, aVar2);
    }

    public static String[][] c(int i10, int i11) {
        return (String[][]) W3.e.d(InterfaceC4817a.c.t(i10, i11));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String[][] get() {
        return c(((Integer) this.f39511a.get()).intValue(), ((Integer) this.f39512b.get()).intValue());
    }
}
