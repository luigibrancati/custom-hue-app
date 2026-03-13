package Rd;

/* JADX INFO: renamed from: Rd.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C2133i0 implements InterfaceC2158v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15178a;

    public C2133i0(boolean z10) {
        this.f15178a = z10;
    }

    @Override // Rd.InterfaceC2158v0
    public K0 a() {
        return null;
    }

    @Override // Rd.InterfaceC2158v0
    public boolean c() {
        return this.f15178a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
