package C2;

import G1.C;
import x2.C6294d;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class r {
    public static int a(int i10, C c10, int i11) {
        if (i10 == 12) {
            return 240;
        }
        if (i10 == 13) {
            return 120;
        }
        if (i10 == 21 && c10.a() >= 8 && c10.g() + 8 <= i11) {
            int iU = c10.u();
            int iU2 = c10.u();
            if (iU >= 12 && iU2 == 1936877170) {
                return c10.M();
            }
        }
        return -2147483647;
    }

    public static D1.u b(C c10, int i10) {
        c10.b0(12);
        while (c10.g() < i10) {
            int iG = c10.g();
            int iU = c10.u();
            if (c10.u() == 1935766900) {
                if (iU < 16) {
                    return null;
                }
                c10.b0(4);
                int i11 = -1;
                int i12 = 0;
                for (int i13 = 0; i13 < 2; i13++) {
                    int iL = c10.L();
                    int iL2 = c10.L();
                    if (iL == 0) {
                        i11 = iL2;
                    } else if (iL == 1) {
                        i12 = iL2;
                    }
                }
                int iA = a(i11, c10, i10);
                if (iA == -2147483647) {
                    return null;
                }
                return new D1.u(new C6294d(iA, i12));
            }
            c10.a0(iG + iU);
        }
        return null;
    }
}
