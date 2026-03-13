package Rd;

/* JADX INFO: renamed from: Rd.g0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2129g0 implements InterfaceC2136k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2127f0 f15176a;

    public C2129g0(InterfaceC2127f0 interfaceC2127f0) {
        this.f15176a = interfaceC2127f0;
    }

    @Override // Rd.InterfaceC2136k
    public void a(Throwable th) {
        this.f15176a.dispose();
    }

    public String toString() {
        return "DisposeOnCancel[" + this.f15176a + ']';
    }
}
