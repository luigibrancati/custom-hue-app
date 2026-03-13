package i2;

import K7.AbstractC1081v;
import i2.y;
import java.util.Arrays;
import java.util.List;
import u2.C5909a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f37049a;

        public a(y yVar) {
            this.f37049a = yVar;
        }
    }

    public static boolean a(InterfaceC4337q interfaceC4337q) {
        G1.C c10 = new G1.C(4);
        interfaceC4337q.s(c10.f(), 0, 4);
        return c10.N() == 1716281667;
    }

    public static int b(InterfaceC4337q interfaceC4337q) throws D1.w {
        interfaceC4337q.i();
        G1.C c10 = new G1.C(2);
        interfaceC4337q.s(c10.f(), 0, 2);
        int iT = c10.T();
        if ((iT >> 2) == 16382) {
            interfaceC4337q.i();
            return iT;
        }
        interfaceC4337q.i();
        throw D1.w.a("First frame does not start with sync code.", null);
    }

    public static D1.u c(InterfaceC4337q interfaceC4337q, boolean z10) throws Throwable {
        D1.u uVarA = new D().a(interfaceC4337q, z10 ? null : w2.h.f46116b);
        if (uVarA == null || uVarA.e() == 0) {
            return null;
        }
        return uVarA;
    }

    public static D1.u d(InterfaceC4337q interfaceC4337q, boolean z10) throws Throwable {
        interfaceC4337q.i();
        long jM = interfaceC4337q.m();
        D1.u uVarC = c(interfaceC4337q, z10);
        interfaceC4337q.q((int) (interfaceC4337q.m() - jM));
        return uVarC;
    }

    public static boolean e(InterfaceC4337q interfaceC4337q, a aVar) {
        interfaceC4337q.i();
        G1.B b10 = new G1.B(new byte[4]);
        interfaceC4337q.s(b10.f4234a, 0, 4);
        boolean zG = b10.g();
        int iH = b10.h(7);
        int iH2 = b10.h(24) + 4;
        if (iH == 0) {
            aVar.f37049a = h(interfaceC4337q);
            return zG;
        }
        y yVar = aVar.f37049a;
        if (yVar == null) {
            throw new IllegalArgumentException();
        }
        if (iH == 3) {
            aVar.f37049a = yVar.b(g(interfaceC4337q, iH2));
            return zG;
        }
        if (iH == 4) {
            aVar.f37049a = yVar.c(j(interfaceC4337q, iH2));
            return zG;
        }
        if (iH != 6) {
            interfaceC4337q.q(iH2);
            return zG;
        }
        G1.C c10 = new G1.C(iH2);
        interfaceC4337q.readFully(c10.f(), 0, iH2);
        c10.b0(4);
        aVar.f37049a = yVar.a(AbstractC1081v.A(C5909a.d(c10)));
        return zG;
    }

    public static y.a f(G1.C c10) {
        c10.b0(1);
        int iO = c10.O();
        long jG = ((long) c10.g()) + ((long) iO);
        int i10 = iO / 18;
        long[] jArrCopyOf = new long[i10];
        long[] jArrCopyOf2 = new long[i10];
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            long jE = c10.E();
            if (jE == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i11);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i11);
                break;
            }
            jArrCopyOf[i11] = jE;
            jArrCopyOf2[i11] = c10.E();
            c10.b0(2);
            i11++;
        }
        c10.b0((int) (jG - ((long) c10.g())));
        return new y.a(jArrCopyOf, jArrCopyOf2);
    }

    public static y.a g(InterfaceC4337q interfaceC4337q, int i10) {
        G1.C c10 = new G1.C(i10);
        interfaceC4337q.readFully(c10.f(), 0, i10);
        return f(c10);
    }

    public static y h(InterfaceC4337q interfaceC4337q) {
        byte[] bArr = new byte[38];
        interfaceC4337q.readFully(bArr, 0, 38);
        return new y(bArr, 4);
    }

    public static void i(InterfaceC4337q interfaceC4337q) throws D1.w {
        G1.C c10 = new G1.C(4);
        interfaceC4337q.readFully(c10.f(), 0, 4);
        if (c10.N() != 1716281667) {
            throw D1.w.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static List j(InterfaceC4337q interfaceC4337q, int i10) {
        G1.C c10 = new G1.C(i10);
        interfaceC4337q.readFully(c10.f(), 0, i10);
        c10.b0(4);
        return Arrays.asList(S.k(c10, false, false).f36904b);
    }
}
