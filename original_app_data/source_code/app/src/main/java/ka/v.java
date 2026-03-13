package ka;

import ka.InterfaceC4817a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f39515c;

    public v(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        this.f39513a = aVar;
        this.f39514b = aVar2;
        this.f39515c = aVar3;
    }

    public static v a(X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return new v(aVar, aVar2, aVar3);
    }

    public static String[][] c(int i10, int i11, boolean z10) {
        return (String[][]) W3.e.d(InterfaceC4817a.c.u(i10, i11, z10));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public String[][] get() {
        return c(((Integer) this.f39513a.get()).intValue(), ((Integer) this.f39514b.get()).intValue(), ((Boolean) this.f39515c.get()).booleanValue());
    }
}
