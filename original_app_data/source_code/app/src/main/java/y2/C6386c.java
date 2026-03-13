package y2;

import D1.u;
import G1.B;
import G1.C;
import G1.H;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: y2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C6386c extends r2.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f48344a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f48345b = new B();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public H f48346c;

    @Override // r2.c
    public u b(r2.b bVar, ByteBuffer byteBuffer) {
        H h10 = this.f48346c;
        if (h10 == null || bVar.f43514j != h10.f()) {
            H h11 = new H(bVar.f5880f);
            this.f48346c = h11;
            h11.a(bVar.f5880f - bVar.f43514j);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        this.f48344a.Y(bArrArray, iLimit);
        this.f48345b.o(bArrArray, iLimit);
        this.f48345b.r(39);
        long jH = (((long) this.f48345b.h(1)) << 32) | ((long) this.f48345b.h(32));
        this.f48345b.r(20);
        int iH = this.f48345b.h(12);
        int iH2 = this.f48345b.h(8);
        this.f48344a.b0(14);
        u.a aVarD = iH2 != 0 ? iH2 != 255 ? iH2 != 4 ? iH2 != 5 ? iH2 != 6 ? null : C6390g.d(this.f48344a, jH, this.f48346c) : C6387d.d(this.f48344a, jH, this.f48346c) : C6389f.d(this.f48344a) : C6384a.d(this.f48344a, iH, jH) : new C6388e();
        return aVarD == null ? new u(new u.a[0]) : new u(aVarD);
    }
}
