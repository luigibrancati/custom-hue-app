package P2;

import P2.L;
import i2.AbstractC4322b;
import i2.InterfaceC4336p;
import i2.InterfaceC4337q;
import i2.J;

/* JADX INFO: renamed from: P2.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1842b implements InterfaceC4336p {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final i2.u f12777d = new i2.u() { // from class: P2.a
        @Override // i2.u
        public final InterfaceC4336p[] f() {
            return C1842b.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1843c f12778a = new C1843c("audio/ac3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G1.C f12779b = new G1.C(2786);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12780c;

    public static /* synthetic */ InterfaceC4336p[] b() {
        return new InterfaceC4336p[]{new C1842b()};
    }

    @Override // i2.InterfaceC4336p
    public void a(long j10, long j11) {
        this.f12780c = false;
        this.f12778a.b();
    }

    @Override // i2.InterfaceC4336p
    public void c(i2.r rVar) {
        this.f12778a.d(rVar, new L.d(0, 1));
        rVar.n();
        rVar.v(new J.b(-9223372036854775807L));
    }

    @Override // i2.InterfaceC4336p
    public int i(InterfaceC4337q interfaceC4337q, i2.I i10) {
        int i11 = interfaceC4337q.read(this.f12779b.f(), 0, 2786);
        if (i11 == -1) {
            return -1;
        }
        this.f12779b.a0(0);
        this.f12779b.Z(i11);
        if (!this.f12780c) {
            this.f12778a.e(0L, 4);
            this.f12780c = true;
        }
        this.f12778a.a(this.f12779b);
        return 0;
    }

    @Override // i2.InterfaceC4336p
    public boolean j(InterfaceC4337q interfaceC4337q) {
        G1.C c10 = new G1.C(10);
        int i10 = 0;
        while (true) {
            interfaceC4337q.s(c10.f(), 0, 10);
            c10.a0(0);
            if (c10.O() != 4801587) {
                break;
            }
            c10.b0(3);
            int iK = c10.K();
            i10 += iK + 10;
            interfaceC4337q.o(iK);
        }
        interfaceC4337q.i();
        interfaceC4337q.o(i10);
        int i11 = 0;
        int i12 = i10;
        while (true) {
            interfaceC4337q.s(c10.f(), 0, 6);
            c10.a0(0);
            if (c10.T() != 2935) {
                interfaceC4337q.i();
                i12++;
                if (i12 - i10 >= 8192) {
                    return false;
                }
                interfaceC4337q.o(i12);
                i11 = 0;
            } else {
                i11++;
                if (i11 >= 4) {
                    return true;
                }
                int iG = AbstractC4322b.g(c10.f());
                if (iG == -1) {
                    return false;
                }
                interfaceC4337q.o(iG - 6);
            }
        }
    }

    @Override // i2.InterfaceC4336p
    public void release() {
    }
}
