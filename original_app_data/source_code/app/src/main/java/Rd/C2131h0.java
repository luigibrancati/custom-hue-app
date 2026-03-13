package Rd;

/* JADX INFO: renamed from: Rd.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2131h0 extends E0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2127f0 f15177e;

    public C2131h0(InterfaceC2127f0 interfaceC2127f0) {
        this.f15177e = interfaceC2127f0;
    }

    @Override // Rd.E0
    public boolean v() {
        return false;
    }

    @Override // Rd.E0
    public void w(Throwable th) {
        this.f15177e.dispose();
    }
}
