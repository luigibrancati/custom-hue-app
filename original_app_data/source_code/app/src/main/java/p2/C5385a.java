package p2;

import G1.C;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.L;
import i2.r;

/* JADX INFO: renamed from: p2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5385a implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f42175a = new C(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f42176b = new L(-1, -1, "image/heif");

    private boolean b(InterfaceC4337q interfaceC4337q, int i10) {
        this.f42175a.W(4);
        interfaceC4337q.s(this.f42175a.f(), 0, 4);
        return this.f42175a.N() == ((long) i10);
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f42176b.a(j10, j11);
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f42176b.c(rVar);
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        return this.f42176b.i(interfaceC4337q, i10);
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.o(4);
        return b(interfaceC4337q, 1718909296) && b(interfaceC4337q, 1751476579);
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
