package C2;

import D1.o;
import D1.u;
import G1.C;
import K7.AbstractC1081v;
import i2.B;
import w2.C6118a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {
    public static H1.b a(D1.u uVar, String str) {
        for (int i10 = 0; i10 < uVar.e(); i10++) {
            u.a aVarD = uVar.d(i10);
            if (aVarD instanceof H1.b) {
                H1.b bVar = (H1.b) aVarD;
                if (bVar.f5117a.equals(str)) {
                    return bVar;
                }
            }
        }
        return null;
    }

    public static w2.e b(int i10, C c10) {
        int iU = c10.u();
        if (c10.u() == 1684108385) {
            c10.b0(8);
            String strG = c10.G(iU - 16);
            return new w2.e("und", strG, strG);
        }
        G1.t.h("MetadataUtil", "Failed to parse comment attribute: " + H1.d.a(i10));
        return null;
    }

    public static C6118a c(C c10) {
        int iU = c10.u();
        if (c10.u() != 1684108385) {
            G1.t.h("MetadataUtil", "Failed to parse cover art attribute");
            return null;
        }
        int iP = b.p(c10.u());
        String str = iP == 13 ? "image/jpeg" : iP == 14 ? "image/png" : null;
        if (str == null) {
            G1.t.h("MetadataUtil", "Unrecognized cover art flags: " + iP);
            return null;
        }
        c10.b0(4);
        int i10 = iU - 16;
        byte[] bArr = new byte[i10];
        c10.q(bArr, 0, i10);
        return new C6118a(str, null, 3, bArr);
    }

    public static u.a d(C c10) {
        int iG = c10.g() + c10.u();
        int iU = c10.u();
        int i10 = (iU >> 24) & 255;
        try {
            if (i10 == 169 || i10 == 253) {
                int i11 = 16777215 & iU;
                if (i11 == 6516084) {
                    return b(iU, c10);
                }
                if (i11 == 7233901 || i11 == 7631467) {
                    return k(iU, "TIT2", c10);
                }
                if (i11 == 6516589 || i11 == 7828084) {
                    return k(iU, "TCOM", c10);
                }
                if (i11 == 6578553) {
                    return k(iU, "TDRC", c10);
                }
                if (i11 == 4280916) {
                    return k(iU, "TPE1", c10);
                }
                if (i11 == 7630703) {
                    return k(iU, "TSSE", c10);
                }
                if (i11 == 6384738) {
                    return k(iU, "TALB", c10);
                }
                if (i11 == 7108978) {
                    return k(iU, "USLT", c10);
                }
                if (i11 == 6776174) {
                    return k(iU, "TCON", c10);
                }
                if (i11 == 6779504) {
                    return k(iU, "TIT1", c10);
                }
            } else {
                if (iU == 1735291493) {
                    return j(c10);
                }
                if (iU == 1684632427) {
                    return e(iU, "TPOS", c10);
                }
                if (iU == 1953655662) {
                    return e(iU, "TRCK", c10);
                }
                if (iU == 1953329263) {
                    return g(iU, "TBPM", c10, true, false);
                }
                if (iU == 1668311404) {
                    return g(iU, "TCMP", c10, true, true);
                }
                if (iU == 1668249202) {
                    return c(c10);
                }
                if (iU == 1631670868) {
                    return k(iU, "TPE2", c10);
                }
                if (iU == 1936682605) {
                    return k(iU, "TSOT", c10);
                }
                if (iU == 1936679276) {
                    return k(iU, "TSOA", c10);
                }
                if (iU == 1936679282) {
                    return k(iU, "TSOP", c10);
                }
                if (iU == 1936679265) {
                    return k(iU, "TSO2", c10);
                }
                if (iU == 1936679791) {
                    return k(iU, "TSOC", c10);
                }
                if (iU == 1920233063) {
                    return g(iU, "ITUNESADVISORY", c10, false, false);
                }
                if (iU == 1885823344) {
                    return g(iU, "ITUNESGAPLESS", c10, false, true);
                }
                if (iU == 1936683886) {
                    return k(iU, "TVSHOWSORT", c10);
                }
                if (iU == 1953919848) {
                    return k(iU, "TVSHOW", c10);
                }
                if (iU == 757935405) {
                    return h(c10, iG);
                }
            }
            G1.t.b("MetadataUtil", "Skipped unknown metadata entry: " + H1.d.a(iU));
            c10.a0(iG);
            return null;
        } finally {
            c10.a0(iG);
        }
    }

    public static w2.n e(int i10, String str, C c10) {
        int iU = c10.u();
        if (c10.u() == 1684108385 && iU >= 22) {
            c10.b0(10);
            int iT = c10.T();
            if (iT > 0) {
                String str2 = "" + iT;
                int iT2 = c10.T();
                if (iT2 > 0) {
                    str2 = str2 + "/" + iT2;
                }
                return new w2.n(str, null, AbstractC1081v.A(str2));
            }
        }
        G1.t.h("MetadataUtil", "Failed to parse index/count attribute: " + H1.d.a(i10));
        return null;
    }

    public static int f(C c10) {
        int iU = c10.u();
        if (c10.u() == 1684108385) {
            c10.b0(8);
            int i10 = iU - 16;
            if (i10 == 1) {
                return c10.L();
            }
            if (i10 == 2) {
                return c10.T();
            }
            if (i10 == 3) {
                return c10.O();
            }
            if (i10 == 4 && (c10.n() & 128) == 0) {
                return c10.P();
            }
        }
        G1.t.h("MetadataUtil", "Failed to parse data atom to int");
        return -1;
    }

    public static w2.i g(int i10, String str, C c10, boolean z10, boolean z11) {
        int iF = f(c10);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new w2.n(str, null, AbstractC1081v.A(Integer.toString(iF))) : new w2.e("und", str, Integer.toString(iF));
        }
        G1.t.h("MetadataUtil", "Failed to parse uint8 attribute: " + H1.d.a(i10));
        return null;
    }

    public static w2.i h(C c10, int i10) {
        String strG = null;
        String strG2 = null;
        int i11 = -1;
        int i12 = -1;
        while (c10.g() < i10) {
            int iG = c10.g();
            int iU = c10.u();
            int iU2 = c10.u();
            c10.b0(4);
            if (iU2 == 1835360622) {
                strG = c10.G(iU - 12);
            } else if (iU2 == 1851878757) {
                strG2 = c10.G(iU - 12);
            } else {
                if (iU2 == 1684108385) {
                    i11 = iG;
                    i12 = iU;
                }
                c10.b0(iU - 12);
            }
        }
        if (strG == null || strG2 == null || i11 == -1) {
            return null;
        }
        c10.a0(i11);
        c10.b0(16);
        return new w2.k(strG, strG2, c10.G(i12 - 16));
    }

    public static H1.b i(C c10, int i10, String str) {
        while (true) {
            int iG = c10.g();
            if (iG >= i10) {
                return null;
            }
            int iU = c10.u();
            if (c10.u() == 1684108385) {
                int iU2 = c10.u();
                int iU3 = c10.u();
                int i11 = iU - 16;
                byte[] bArr = new byte[i11];
                c10.q(bArr, 0, i11);
                return new H1.b(str, bArr, iU3, iU2);
            }
            c10.a0(iG + iU);
        }
    }

    public static w2.n j(C c10) {
        String strA = w2.j.a(f(c10) - 1);
        if (strA != null) {
            return new w2.n("TCON", null, AbstractC1081v.A(strA));
        }
        G1.t.h("MetadataUtil", "Failed to parse standard genre code");
        return null;
    }

    public static w2.n k(int i10, String str, C c10) {
        int iU = c10.u();
        if (c10.u() == 1684108385) {
            c10.b0(8);
            return new w2.n(str, null, AbstractC1081v.A(c10.G(iU - 16)));
        }
        G1.t.h("MetadataUtil", "Failed to parse text attribute: " + H1.d.a(i10));
        return null;
    }

    public static void l(int i10, B b10, o.b bVar) {
        if (i10 == 1 && b10.a()) {
            bVar.d0(b10.f36834a).e0(b10.f36835b);
        }
    }

    public static void m(int i10, D1.u uVar, o.b bVar, D1.u uVar2, D1.u... uVarArr) {
        if (uVar2 == null) {
            uVar2 = new D1.u(new u.a[0]);
        }
        if (uVar != null) {
            for (int i11 = 0; i11 < uVar.e(); i11++) {
                u.a aVarD = uVar.d(i11);
                if (aVarD instanceof H1.b) {
                    H1.b bVar2 = (H1.b) aVarD;
                    if (!bVar2.f5117a.equals("com.android.capture.fps")) {
                        uVar2 = uVar2.a(bVar2);
                    } else if (i10 == 2) {
                        uVar2 = uVar2.a(bVar2);
                    }
                }
            }
        }
        for (D1.u uVar3 : uVarArr) {
            uVar2 = uVar2.b(uVar3);
        }
        if (uVar2.e() > 0) {
            bVar.r0(uVar2);
        }
    }
}
