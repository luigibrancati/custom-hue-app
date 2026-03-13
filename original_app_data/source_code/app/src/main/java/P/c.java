package P;

import E.InterfaceC0787f0;
import L.InterfaceC1133y;
import L.k1;
import M.h;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0787f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1133y f12492a;

    public c(InterfaceC1133y interfaceC1133y) {
        this.f12492a = interfaceC1133y;
    }

    @Override // E.InterfaceC0787f0
    public void a(h.b bVar) {
        this.f12492a.a(bVar);
    }

    @Override // E.InterfaceC0787f0
    public int b() {
        return this.f12492a.b().b();
    }

    @Override // E.InterfaceC0787f0
    public k1 c() {
        return this.f12492a.c();
    }

    @Override // E.InterfaceC0787f0
    public int d() {
        return 0;
    }

    public InterfaceC1133y e() {
        return this.f12492a;
    }

    @Override // E.InterfaceC0787f0
    public long getTimestamp() {
        return this.f12492a.getTimestamp();
    }
}
