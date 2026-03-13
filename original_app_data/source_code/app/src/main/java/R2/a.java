package R2;

import G1.C;
import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.L;
import i2.r;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f14502a = new C(4);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final L f14503b = new L(-1, -1, "image/webp");

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f14503b.a(j10, j11);
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f14503b.c(rVar);
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        return this.f14503b.i(interfaceC4337q, i10);
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        this.f14502a.W(4);
        interfaceC4337q.s(this.f14502a.f(), 0, 4);
        if (this.f14502a.N() != 1380533830) {
            return false;
        }
        interfaceC4337q.o(4);
        this.f14502a.W(4);
        interfaceC4337q.s(this.f14502a.f(), 0, 4);
        return this.f14502a.N() == 1464156752;
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
