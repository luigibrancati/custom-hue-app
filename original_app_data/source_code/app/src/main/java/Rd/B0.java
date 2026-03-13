package Rd;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class B0 extends F0 implements InterfaceC2163y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f15108c;

    public B0(InterfaceC2166z0 interfaceC2166z0) {
        super(true);
        m0(interfaceC2166z0);
        this.f15108c = P0();
    }

    public final boolean P0() {
        F0 f0U;
        InterfaceC2151s interfaceC2151sF0 = f0();
        C2153t c2153t = interfaceC2151sF0 instanceof C2153t ? (C2153t) interfaceC2151sF0 : null;
        if (c2153t != null && (f0U = c2153t.u()) != null) {
            while (!f0U.b0()) {
                InterfaceC2151s interfaceC2151sF02 = f0U.f0();
                C2153t c2153t2 = interfaceC2151sF02 instanceof C2153t ? (C2153t) interfaceC2151sF02 : null;
                if (c2153t2 == null || (f0U = c2153t2.u()) == null) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // Rd.F0
    public boolean b0() {
        return this.f15108c;
    }

    @Override // Rd.F0
    public boolean c0() {
        return true;
    }
}
