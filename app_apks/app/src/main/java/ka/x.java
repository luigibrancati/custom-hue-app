package ka;

import ka.InterfaceC4817a;
import ra.InterfaceC5683A;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x implements W3.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X3.a f39519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final X3.a f39520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X3.a f39521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final X3.a f39522d;

    public x(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        this.f39519a = aVar;
        this.f39520b = aVar2;
        this.f39521c = aVar3;
        this.f39522d = aVar4;
    }

    public static x a(X3.a aVar, X3.a aVar2, X3.a aVar3, X3.a aVar4) {
        return new x(aVar, aVar2, aVar3, aVar4);
    }

    public static InterfaceC5683A c(int i10, X3.a aVar, X3.a aVar2, X3.a aVar3) {
        return (InterfaceC5683A) W3.e.d(InterfaceC4817a.c.w(i10, aVar, aVar2, aVar3));
    }

    @Override // X3.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterfaceC5683A get() {
        return c(((Integer) this.f39519a.get()).intValue(), this.f39520b, this.f39521c, this.f39522d);
    }
}
