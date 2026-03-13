package L;

/* JADX INFO: renamed from: L.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class C1090c extends AbstractC1120r0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final F f8013c;

    public C1090c(F f10, c1 c1Var) {
        super(f10);
        this.f8013c = f10;
    }

    @Override // L.AbstractC1120r0, E.InterfaceC0802n
    public O7.e c(float f10) {
        return !M.v.b(null, 0) ? O.n.n(new IllegalStateException("Zoom is not supported")) : this.f8013c.c(f10);
    }

    @Override // L.AbstractC1120r0, E.InterfaceC0802n
    public O7.e e(float f10) {
        return !M.v.b(null, 0) ? O.n.n(new IllegalStateException("Zoom is not supported")) : this.f8013c.e(f10);
    }

    @Override // L.AbstractC1120r0, E.InterfaceC0802n
    public O7.e h(boolean z10) {
        return !M.v.b(null, 6) ? O.n.n(new IllegalStateException("Torch is not supported")) : this.f8013c.h(z10);
    }

    @Override // L.AbstractC1120r0, E.InterfaceC0802n
    public O7.e k(E.L l10) {
        E.L lA = M.v.a(null, l10);
        return lA == null ? O.n.n(new IllegalStateException("FocusMetering is not supported")) : this.f8013c.k(lA);
    }
}
