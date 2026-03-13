package q2;

import i2.I;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.L;
import i2.r;

/* JADX INFO: renamed from: q2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C5479a implements InterfaceC4336p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4336p f43081a;

    public C5479a() {
        this(0);
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f43081a.a(j10, j11);
    }

    @Override // i2.InterfaceC4336p
    public void c(r rVar) {
        this.f43081a.c(rVar);
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, I i10) {
        return this.f43081a.i(interfaceC4337q, i10);
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        return this.f43081a.j(interfaceC4337q);
    }

    @Override // i2.InterfaceC4336p
    public void release() {
        this.f43081a.release();
    }

    public C5479a(int i10) {
        if ((i10 & 1) != 0) {
            this.f43081a = new L(65496, 2, "image/jpeg");
        } else {
            this.f43081a = new C5480b();
        }
    }
}
