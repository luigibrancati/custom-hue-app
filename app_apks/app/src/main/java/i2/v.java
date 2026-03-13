package i2;

import org.apache.tika.fork.ForkServer;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f37048a;
    }

    public static boolean a(G1.C c10, y yVar, int i10) {
        int iJ = j(c10, i10);
        return iJ != -1 && iJ <= yVar.f37053b;
    }

    public static boolean b(G1.C c10, int i10) {
        return c10.L() == G1.M.x(c10.f(), i10, c10.g() - 1, 0);
    }

    public static boolean c(G1.C c10, y yVar, boolean z10, a aVar) {
        try {
            long jU = c10.U();
            if (!z10) {
                jU *= (long) yVar.f37053b;
            }
            aVar.f37048a = jU;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean d(G1.C c10, y yVar, int i10, a aVar) {
        int iG = c10.g();
        long jN = c10.N();
        long j10 = jN >>> 16;
        if (j10 != i10) {
            return false;
        }
        return g((int) ((jN >> 4) & 15), yVar) && f((int) ((jN >> 1) & 7), yVar) && !(((jN & 1) > 1L ? 1 : ((jN & 1) == 1L ? 0 : -1)) == 0) && c(c10, yVar, ((j10 & 1) > 1L ? 1 : ((j10 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(c10, yVar, (int) ((jN >> 12) & 15)) && e(c10, yVar, (int) ((jN >> 8) & 15)) && b(c10, iG);
    }

    public static boolean e(G1.C c10, y yVar, int i10) {
        int i11 = yVar.f37056e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == yVar.f37057f;
        }
        if (i10 == 12) {
            return c10.L() * 1000 == i11;
        }
        if (i10 <= 14) {
            int iT = c10.T();
            if (i10 == 14) {
                iT *= 10;
            }
            if (iT == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean f(int i10, y yVar) {
        return i10 == 0 || i10 == yVar.f37060i;
    }

    public static boolean g(int i10, y yVar) {
        return i10 <= 7 ? i10 == yVar.f37058g - 1 : i10 <= 10 && yVar.f37058g == 2;
    }

    public static boolean h(InterfaceC4337q interfaceC4337q, y yVar, int i10, a aVar) {
        long jM = interfaceC4337q.m();
        byte[] bArr = new byte[2];
        interfaceC4337q.s(bArr, 0, 2);
        if ((((bArr[0] & ForkServer.ERROR) << 8) | (bArr[1] & ForkServer.ERROR)) != i10) {
            interfaceC4337q.i();
            interfaceC4337q.o((int) (jM - interfaceC4337q.getPosition()));
            return false;
        }
        G1.C c10 = new G1.C(16);
        System.arraycopy(bArr, 0, c10.f(), 0, 2);
        c10.Z(AbstractC4338s.d(interfaceC4337q, c10.f(), 2, 14));
        interfaceC4337q.i();
        interfaceC4337q.o((int) (jM - interfaceC4337q.getPosition()));
        return d(c10, yVar, i10, aVar);
    }

    public static long i(InterfaceC4337q interfaceC4337q, y yVar) throws D1.w {
        interfaceC4337q.i();
        interfaceC4337q.o(1);
        byte[] bArr = new byte[1];
        interfaceC4337q.s(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        interfaceC4337q.o(2);
        int i10 = z10 ? 7 : 6;
        G1.C c10 = new G1.C(i10);
        c10.Z(AbstractC4338s.d(interfaceC4337q, c10.f(), 0, i10));
        interfaceC4337q.i();
        a aVar = new a();
        if (c(c10, yVar, z10, aVar)) {
            return aVar.f37048a;
        }
        throw D1.w.a(null, null);
    }

    public static int j(G1.C c10, int i10) {
        switch (i10) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c10.L() + 1;
            case 7:
                return c10.T() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }
}
