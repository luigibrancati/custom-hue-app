package l2;

import G1.C;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.L;
import i2.r;

/* JADX INFO: renamed from: l2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4874a implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f39836a = new C(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f39837b = new L(-1, -1, "image/avif");

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f39837b.a(j10, j11);
    }

    public final boolean b(InterfaceC4337q interfaceC4337q, int i10) {
        this.f39836a.W(4);
        interfaceC4337q.s(this.f39836a.f(), 0, 4);
        return this.f39836a.N() == ((long) i10);
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f39837b.c(rVar);
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        return this.f39837b.i(interfaceC4337q, i10);
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        interfaceC4337q.o(4);
        return b(interfaceC4337q, 1718909296) && b(interfaceC4337q, 1635150182);
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
