package D2;

import D2.i;
import G1.AbstractC0853a;
import G1.C;
import G1.M;
import i2.InterfaceC4337q;
import i2.J;
import i2.v;
import i2.w;
import i2.x;
import i2.y;
import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public y f2158n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public a f2159o;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f2160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y.a f2161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f2162c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f2163d = -1;

        public a(y yVar, y.a aVar) {
            this.f2160a = yVar;
            this.f2161b = aVar;
        }

        @Override // D2.g
        public long a(InterfaceC4337q interfaceC4337q) {
            long j10 = this.f2163d;
            if (j10 < 0) {
                return -1L;
            }
            long j11 = -(j10 + 2);
            this.f2163d = -1L;
            return j11;
        }

        @Override // D2.g
        public J b() {
            AbstractC0853a.g(this.f2162c != -1);
            return new x(this.f2160a, this.f2162c);
        }

        @Override // D2.g
        public void c(long j10) {
            long[] jArr = this.f2161b.f37064a;
            this.f2163d = jArr[M.h(jArr, j10, true, true)];
        }

        public void d(long j10) {
            this.f2162c = j10;
        }
    }

    public static boolean o(byte[] bArr) {
        return bArr[0] == -1;
    }

    public static boolean p(C c10) {
        return c10.a() >= 5 && c10.L() == 127 && c10.N() == 1179402563;
    }

    @Override // D2.i
    public long f(C c10) {
        if (o(c10.f())) {
            return n(c10);
        }
        return -1L;
    }

    @Override // D2.i
    public boolean h(C c10, long j10, i.b bVar) {
        byte[] bArrF = c10.f();
        y yVar = this.f2158n;
        if (yVar == null) {
            y yVar2 = new y(bArrF, 17);
            this.f2158n = yVar2;
            bVar.f2200a = yVar2.g(Arrays.copyOfRange(bArrF, 9, c10.j()), null).b().W("audio/ogg").P();
            return true;
        }
        if ((bArrF[0] & 127) == 3) {
            y.a aVarF = w.f(c10);
            y yVarB = yVar.b(aVarF);
            this.f2158n = yVarB;
            this.f2159o = new a(yVarB, aVarF);
            return true;
        }
        if (!o(bArrF)) {
            return true;
        }
        a aVar = this.f2159o;
        if (aVar != null) {
            aVar.d(j10);
            bVar.f2201b = this.f2159o;
        }
        AbstractC0853a.e(bVar.f2200a);
        return false;
    }

    @Override // D2.i
    public void l(boolean z10) {
        super.l(z10);
        if (z10) {
            this.f2158n = null;
            this.f2159o = null;
        }
    }

    public final int n(C c10) {
        int i10 = (c10.f()[2] & ForkServer.ERROR) >> 4;
        if (i10 == 6 || i10 == 7) {
            c10.b0(4);
            c10.U();
        }
        int iJ = v.j(c10, i10);
        c10.a0(0);
        return iJ;
    }
}
