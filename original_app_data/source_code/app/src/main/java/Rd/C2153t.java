package Rd;

/* JADX INFO: renamed from: Rd.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2153t extends E0 implements InterfaceC2151s {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2155u f15206e;

    public C2153t(InterfaceC2155u interfaceC2155u) {
        this.f15206e = interfaceC2155u;
    }

    @Override // Rd.InterfaceC2151s
    public boolean b(Throwable th) {
        return u().R(th);
    }

    @Override // Rd.InterfaceC2151s
    public InterfaceC2166z0 getParent() {
        return u();
    }

    @Override // Rd.E0
    public boolean v() {
        return true;
    }

    @Override // Rd.E0
    public void w(Throwable th) {
        this.f15206e.k(u());
    }
}
