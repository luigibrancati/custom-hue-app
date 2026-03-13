package i2;

import G1.AbstractC0853a;

/* JADX INFO: renamed from: i2.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4326f {
    public static void a(long j10, G1.C c10, O[] oArr) {
        while (true) {
            if (c10.a() <= 1) {
                return;
            }
            int iC = c(c10);
            int iC2 = c(c10);
            int iG = c10.g() + iC2;
            if (iC2 == -1 || iC2 > c10.a()) {
                G1.t.h("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                iG = c10.j();
            } else if (iC == 4 && iC2 >= 8) {
                int iL = c10.L();
                int iT = c10.T();
                int iU = iT == 49 ? c10.u() : 0;
                int iL2 = c10.L();
                if (iT == 47) {
                    c10.b0(1);
                }
                boolean z10 = iL == 181 && (iT == 49 || iT == 47) && iL2 == 3;
                if (iT == 49) {
                    z10 &= iU == 1195456820;
                }
                if (z10) {
                    b(j10, c10, oArr);
                }
            }
            c10.a0(iG);
        }
    }

    public static void b(long j10, G1.C c10, O[] oArr) {
        int iL = c10.L();
        if ((iL & 64) != 0) {
            c10.b0(1);
            int i10 = (iL & 31) * 3;
            int iG = c10.g();
            for (O o10 : oArr) {
                c10.a0(iG);
                o10.b(c10, i10);
                AbstractC0853a.g(j10 != -9223372036854775807L);
                o10.d(j10, 1, i10, 0, null);
            }
        }
    }

    public static int c(G1.C c10) {
        int i10 = 0;
        while (c10.a() != 0) {
            int iL = c10.L();
            i10 += iL;
            if (iL != 255) {
                return i10;
            }
        }
        return -1;
    }
}
