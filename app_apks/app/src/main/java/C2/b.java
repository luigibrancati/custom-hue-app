package C2;

import D1.C0748f;
import D1.C0753k;
import D1.o;
import D1.u;
import G1.AbstractC0853a;
import G1.AbstractC0861i;
import G1.C;
import G1.M;
import H1.d;
import H1.g;
import K7.AbstractC1081v;
import android.util.Pair;
import i2.AbstractC4338s;
import i2.B;
import i2.C4324d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f885a = M.u0("OpusHead");

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f886a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f887b;

        public a(long j10, long j11) {
            this.f886a = j10;
            this.f887b = j11;
        }
    }

    /* JADX INFO: renamed from: C2.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0026b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f888a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f889b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f890c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f891d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f892e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final C f893f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C f894g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f895h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f896i;

        public C0026b(C c10, C c11, boolean z10) throws D1.w {
            this.f894g = c10;
            this.f893f = c11;
            this.f892e = z10;
            c11.a0(12);
            this.f888a = c11.P();
            c10.a0(12);
            this.f896i = c10.P();
            AbstractC4338s.a(c10.u() == 1, "first_chunk must be 1");
            this.f889b = -1;
        }

        public boolean a() {
            int i10 = this.f889b + 1;
            this.f889b = i10;
            if (i10 == this.f888a) {
                return false;
            }
            this.f891d = this.f892e ? this.f893f.S() : this.f893f.N();
            if (this.f889b == this.f895h) {
                this.f890c = this.f894g.P();
                this.f894g.b0(4);
                int i11 = this.f896i - 1;
                this.f896i = i11;
                this.f895h = i11 > 0 ? this.f894g.P() - 1 : -1;
            }
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f897a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final byte[] f898b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f899c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f900d;

        public c(String str, byte[] bArr, long j10, long j11) {
            this.f897a = str;
            this.f898b = bArr;
            this.f899c = j10;
            this.f900d = j11;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f901a;

        public d(g gVar) {
            this.f901a = gVar;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f902a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f903b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f904c;

        public e(long j10, long j11, String str) {
            this.f902a = j10;
            this.f903b = j11;
            this.f904c = str;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface f {
        int a();

        int b();

        int c();
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f905a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f906b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f907c;

        public g(boolean z10, boolean z11, boolean z12) {
            this.f905a = z10;
            this.f906b = z11;
            this.f907c = z12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final u[] f908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public D1.o f909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f911d = 0;

        public h(int i10) {
            this.f908a = new u[i10];
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class i implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f913b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C f914c;

        public i(d.c cVar, D1.o oVar) {
            C c10 = cVar.f5126b;
            this.f914c = c10;
            c10.a0(12);
            int iP = c10.P();
            if ("audio/raw".equals(oVar.f1805o)) {
                int iL0 = M.l0(oVar.f1782I, oVar.f1780G);
                if (iP == 0 || iP % iL0 != 0) {
                    G1.t.h("BoxParsers", "Audio sample size mismatch. stsd sample size: " + iL0 + ", stsz sample size: " + iP);
                    iP = iL0;
                }
            }
            this.f912a = iP == 0 ? -1 : iP;
            this.f913b = c10.P();
        }

        @Override // C2.b.f
        public int a() {
            int i10 = this.f912a;
            return i10 == -1 ? this.f914c.P() : i10;
        }

        @Override // C2.b.f
        public int b() {
            return this.f912a;
        }

        @Override // C2.b.f
        public int c() {
            return this.f913b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class j implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C f915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f916b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f917c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f918d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f919e;

        public j(d.c cVar) {
            C c10 = cVar.f5126b;
            this.f915a = c10;
            c10.a0(12);
            this.f917c = c10.P() & 255;
            this.f916b = c10.P();
        }

        @Override // C2.b.f
        public int a() {
            int i10 = this.f917c;
            if (i10 == 8) {
                return this.f915a.L();
            }
            if (i10 == 16) {
                return this.f915a.T();
            }
            int i11 = this.f918d;
            this.f918d = i11 + 1;
            if (i11 % 2 != 0) {
                return this.f919e & 15;
            }
            int iL = this.f915a.L();
            this.f919e = iL;
            return (iL & 240) >> 4;
        }

        @Override // C2.b.f
        public int b() {
            return -1;
        }

        @Override // C2.b.f
        public int c() {
            return this.f916b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f925f;

        public k(int i10, long j10, int i11, int i12, int i13, int i14) {
            this.f920a = i10;
            this.f921b = j10;
            this.f922c = i11;
            this.f923d = i12;
            this.f924e = i13;
            this.f925f = i14;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f926a;

        public l(d dVar) {
            this.f926a = dVar;
        }

        public boolean b() {
            d dVar = this.f926a;
            return dVar != null && dVar.f901a.f905a && this.f926a.f901a.f906b;
        }
    }

    public static u A(C c10, int i10, int i11, String str) {
        int i12;
        int i13;
        int i14 = i10 + 8;
        while (true) {
            byte[] bArr = null;
            if (i14 - i10 >= i11) {
                return null;
            }
            c10.a0(i14);
            int iU = c10.u();
            if (c10.u() == 1952804451) {
                int iQ = q(c10.u());
                c10.b0(1);
                if (iQ == 0) {
                    c10.b0(1);
                    i13 = 0;
                    i12 = 0;
                } else {
                    int iL = c10.L();
                    i12 = iL & 15;
                    i13 = (iL & 240) >> 4;
                }
                boolean z10 = c10.L() == 1;
                int iL2 = c10.L();
                byte[] bArr2 = new byte[16];
                c10.q(bArr2, 0, 16);
                if (z10 && iL2 == 0) {
                    int iL3 = c10.L();
                    bArr = new byte[iL3];
                    c10.q(bArr, 0, iL3);
                }
                return new u(z10, str, iL2, bArr2, i13, i12, bArr);
            }
            i14 += iU;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r22v9, types: [int[]] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static C2.w B(C2.t r36, H1.d.b r37, i2.B r38) throws D1.w {
        /*
            Method dump skipped, instruction units count: 1415
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.b.B(C2.t, H1.d$b, i2.B):C2.w");
    }

    public static d C(C c10, int i10, int i11) throws D1.w {
        c10.a0(i10 + 8);
        int iG = c10.g();
        while (iG - i10 < i11) {
            c10.a0(iG);
            int iU = c10.u();
            AbstractC4338s.a(iU > 0, "childAtomSize must be positive");
            if (c10.u() == 1937011305) {
                c10.b0(4);
                int iL = c10.L();
                return new d(new g((iL & 1) == 1, (iL & 2) == 2, (iL & 8) == 8));
            }
            iG += iU;
        }
        return null;
    }

    public static h D(C c10, k kVar, String str, C0753k c0753k, boolean z10) throws D1.w {
        c10.a0(12);
        int iU = c10.u();
        h hVar = new h(iU);
        for (int i10 = 0; i10 < iU; i10++) {
            int iG = c10.g();
            int iU2 = c10.u();
            AbstractC4338s.a(iU2 > 0, "childAtomSize must be positive");
            int iU3 = c10.u();
            if (iU3 == 1635148593 || iU3 == 1635148595 || iU3 == 1701733238 || iU3 == 1831958048 || iU3 == 1836070006 || iU3 == 1752589105 || iU3 == 1751479857 || iU3 == 1932670515 || iU3 == 1211250227 || iU3 == 1748121139 || iU3 == 1987063864 || iU3 == 1987063865 || iU3 == 1635135537 || iU3 == 1685479798 || iU3 == 1685479729 || iU3 == 1685481573 || iU3 == 1685481521 || iU3 == 1634760241) {
                L(c10, iU3, iG, iU2, kVar.f920a, str, kVar.f923d, c0753k, hVar, i10);
            } else if (iU3 == 1836069985 || iU3 == 1701733217 || iU3 == 1633889587 || iU3 == 1700998451 || iU3 == 1633889588 || iU3 == 1835823201 || iU3 == 1685353315 || iU3 == 1685353317 || iU3 == 1685353320 || iU3 == 1685353324 || iU3 == 1685353336 || iU3 == 1935764850 || iU3 == 1935767394 || iU3 == 1819304813 || iU3 == 1936684916 || iU3 == 1953984371 || iU3 == 778924082 || iU3 == 778924083 || iU3 == 1835557169 || iU3 == 1835560241 || iU3 == 1634492771 || iU3 == 1634492791 || iU3 == 1970037111 || iU3 == 1332770163 || iU3 == 1716281667 || iU3 == 1767992678 || iU3 == 1768973165 || iU3 == 1718641517) {
                i(c10, iU3, iG, iU2, kVar.f920a, str, z10, c0753k, hVar, i10);
            } else if (iU3 == 1414810956 || iU3 == 1954034535 || iU3 == 2004251764 || iU3 == 1937010800 || iU3 == 1664495672 || iU3 == 1836070003) {
                h hVar2 = hVar;
                E(c10, iU3, iG, iU2, kVar, str, hVar2);
                hVar = hVar2;
            } else if (iU3 == 1835365492) {
                v(c10, iU3, iG, kVar.f920a, hVar);
            } else if (iU3 == 1667329389) {
                hVar.f909b = new o.b().i0(kVar.f920a).y0("application/x-camera-motion").P();
            }
            c10.a0(iG + iU2);
        }
        return hVar;
    }

    public static void E(C c10, int i10, int i11, int i12, k kVar, String str, h hVar) {
        c10.a0(i11 + 16);
        String str2 = "application/ttml+xml";
        AbstractC1081v abstractC1081vA = null;
        long j10 = Long.MAX_VALUE;
        if (i10 != 1414810956) {
            if (i10 == 1954034535) {
                int i13 = i12 - 16;
                byte[] bArr = new byte[i13];
                c10.q(bArr, 0, i13);
                abstractC1081vA = AbstractC1081v.A(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i10 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i10 == 1937010800) {
                j10 = 0;
            } else if (i10 == 1664495672) {
                hVar.f911d = 1;
                str2 = "application/x-mp4-cea-608";
            } else {
                if (i10 != 1836070003) {
                    throw new IllegalStateException();
                }
                int iG = c10.g();
                c10.b0(4);
                if (c10.u() == 1702061171) {
                    c cVarN = n(c10, iG);
                    if (cVarN.f898b == null || cVarN.f898b.length != 64) {
                        return;
                    }
                    abstractC1081vA = AbstractC1081v.A(M.u0(d(cVarN.f898b, kVar.f924e, kVar.f925f)));
                    str2 = "application/vobsub";
                } else {
                    str2 = null;
                }
            }
        }
        if (str2 != null) {
            hVar.f909b = new o.b().i0(kVar.f920a).y0(str2).n0(str).C0(j10).k0(abstractC1081vA).P();
        }
    }

    public static k F(C c10) {
        long j10;
        c10.a0(8);
        int iQ = q(c10.u());
        c10.b0(iQ == 0 ? 8 : 16);
        int iU = c10.u();
        c10.b0(4);
        int iG = c10.g();
        int i10 = iQ == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                c10.b0(i10);
                break;
            }
            if (c10.f()[iG + i11] != -1) {
                long jN = iQ == 0 ? c10.N() : c10.S();
                if (jN != 0) {
                    j10 = jN;
                }
            } else {
                i11++;
            }
        }
        c10.b0(10);
        int i12 = 0;
        long j11 = j10;
        int iT = c10.T();
        c10.b0(4);
        int iU2 = c10.u();
        int iU3 = c10.u();
        c10.b0(4);
        int iU4 = c10.u();
        int iU5 = c10.u();
        if (iU2 == 0 && iU3 == 65536 && ((iU4 == -65536 || iU4 == 65536) && iU5 == 0)) {
            i12 = 90;
        } else if (iU2 == 0 && iU3 == -65536 && ((iU4 == 65536 || iU4 == -65536) && iU5 == 0)) {
            i12 = 270;
        } else if ((iU2 == -65536 || iU2 == 65536) && iU3 == 0 && iU4 == 0 && iU5 == -65536) {
            i12 = 180;
        }
        int i13 = i12;
        c10.b0(16);
        short sH = c10.H();
        c10.b0(2);
        return new k(iU, j11, iT, i13, sH, c10.H());
    }

    public static t G(d.b bVar, d.c cVar, long j10, C0753k c0753k, boolean z10, boolean z11) throws D1.w {
        long[] jArr;
        long[] jArr2;
        D1.o oVarP;
        d.b bVarD;
        Pair pairM;
        d.b bVar2 = (d.b) AbstractC0853a.e(bVar.d(1835297121));
        int iF = f(r(((d.c) AbstractC0853a.e(bVar2.e(1751411826))).f5126b));
        if (iF == -1) {
            return null;
        }
        k kVarF = F(((d.c) AbstractC0853a.e(bVar.e(1953196132))).f5126b);
        long j11 = j10 == -9223372036854775807L ? kVarF.f921b : j10;
        long j12 = w(cVar.f5126b).f5131c;
        long jA1 = j11 != -9223372036854775807L ? M.a1(j11, 1000000L, j12) : -9223372036854775807L;
        d.b bVar3 = (d.b) AbstractC0853a.e(((d.b) AbstractC0853a.e(bVar2.d(1835626086))).d(1937007212));
        e eVarT = t(((d.c) AbstractC0853a.e(bVar2.e(1835296868))).f5126b);
        d.c cVarE = bVar3.e(1937011556);
        if (cVarE == null) {
            throw D1.w.a("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        h hVarD = D(cVarE.f5126b, kVarF, eVarT.f904c, c0753k, z11);
        if (z10 || (bVarD = bVar.d(1701082227)) == null || (pairM = m(bVarD)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) pairM.first;
            jArr2 = (long[]) pairM.second;
            jArr = jArr3;
        }
        if (hVarD.f909b == null) {
            return null;
        }
        if (kVarF.f922c != 0) {
            H1.c cVar2 = new H1.c(kVarF.f922c);
            o.b bVarB = hVarD.f909b.b();
            D1.u uVar = hVarD.f909b.f1802l;
            oVarP = bVarB.r0(uVar != null ? uVar.a(cVar2) : new D1.u(cVar2)).P();
        } else {
            oVarP = hVarD.f909b;
        }
        return new t(kVarF.f920a, iF, eVarT.f902a, j12, jA1, eVarT.f903b, oVarP, hVarD.f911d, hVarD.f908a, hVarD.f910c, jArr, jArr2);
    }

    public static List H(d.b bVar, B b10, long j10, C0753k c0753k, boolean z10, boolean z11, J7.f fVar) {
        t tVar;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < bVar.f5125d.size(); i10++) {
            d.b bVar2 = (d.b) bVar.f5125d.get(i10);
            if (bVar2.f5122a == 1953653099 && (tVar = (t) fVar.apply(G(bVar2, (d.c) AbstractC0853a.e(bVar.e(1836476516)), j10, c0753k, z10, z11))) != null) {
                arrayList.add(B(tVar, (d.b) AbstractC0853a.e(((d.b) AbstractC0853a.e(((d.b) AbstractC0853a.e(bVar2.d(1835297121))).d(1835626086))).d(1937007212)), b10));
            }
        }
        return arrayList;
    }

    public static D1.u I(d.c cVar) {
        C c10 = cVar.f5126b;
        c10.a0(8);
        D1.u uVar = new D1.u(new u.a[0]);
        while (c10.a() >= 8) {
            int iG = c10.g();
            int iU = c10.u();
            int iU2 = c10.u();
            if (iU2 == 1835365473) {
                c10.a0(iG);
                uVar = uVar.b(J(c10, iG + iU));
            } else if (iU2 == 1936553057) {
                c10.a0(iG);
                uVar = uVar.b(r.b(c10, iG + iU));
            } else if (iU2 == -1451722374) {
                uVar = uVar.b(M(c10));
            }
            c10.a0(iG + iU);
        }
        return uVar;
    }

    public static D1.u J(C c10, int i10) {
        c10.b0(8);
        g(c10);
        while (c10.g() < i10) {
            int iG = c10.g();
            int iU = c10.u();
            if (c10.u() == 1768715124) {
                c10.a0(iG);
                return s(c10, iG + iU);
            }
            c10.a0(iG + iU);
        }
        return null;
    }

    public static l K(C c10, int i10, int i11) throws D1.w {
        c10.a0(i10 + 8);
        int iG = c10.g();
        d dVarC = null;
        while (iG - i10 < i11) {
            c10.a0(iG);
            int iU = c10.u();
            AbstractC4338s.a(iU > 0, "childAtomSize must be positive");
            if (c10.u() == 1702454643) {
                dVarC = C(c10, iG, iU);
            }
            iG += iU;
        }
        if (dVarC == null) {
            return null;
        }
        return new l(dVarC);
    }

    public static void L(C c10, int i10, int i11, int i12, int i13, String str, int i14, C0753k c0753k, h hVar, int i15) throws D1.w {
        int i16;
        String str2;
        int iJ;
        int i17;
        C0753k c0753k2;
        int i18;
        int i19;
        int i20;
        int i21;
        g.k kVar;
        int i22;
        int i23;
        int i24;
        int i25 = i11;
        int i26 = i12;
        C0753k c0753kC = c0753k;
        h hVar2 = hVar;
        c10.a0(i25 + 16);
        c10.b0(16);
        int iT = c10.T();
        int iT2 = c10.T();
        c10.b0(50);
        int iG = c10.g();
        int iIntValue = i10;
        if (iIntValue == 1701733238) {
            Pair pairZ = z(c10, i25, i26);
            if (pairZ != null) {
                iIntValue = ((Integer) pairZ.first).intValue();
                c0753kC = c0753kC == null ? null : c0753kC.c(((u) pairZ.second).f1068b);
                hVar2.f908a[i15] = (u) pairZ.second;
            }
            c10.a0(iG);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float fX = 1.0f;
        int i27 = 8;
        int i28 = 8;
        ByteBuffer byteBufferA = null;
        List listK = null;
        String str5 = null;
        byte[] bArrY = null;
        int i29 = -1;
        int i30 = -1;
        int i31 = -1;
        int i32 = -1;
        int i33 = -1;
        int i34 = -1;
        int i35 = -1;
        int iK = -1;
        a aVarK = null;
        c cVarN = null;
        g.k kVar2 = null;
        boolean z10 = false;
        while (iG - i25 < i26) {
            c10.a0(iG);
            int iG2 = c10.g();
            int iU = c10.u();
            if (iU == 0 && c10.g() - i11 == i26) {
                break;
            }
            AbstractC4338s.a(iU > 0, "childAtomSize must be positive");
            int iU2 = c10.u();
            if (iU2 == 1635148611) {
                AbstractC4338s.a(str4 == null, null);
                c10.a0(iG2 + 8);
                C4324d c4324dB = C4324d.b(c10);
                List list = c4324dB.f36951a;
                hVar2.f910c = c4324dB.f36952b;
                if (!z10) {
                    fX = c4324dB.f36961k;
                }
                String str6 = c4324dB.f36962l;
                int i36 = c4324dB.f36960j;
                int i37 = c4324dB.f36957g;
                int i38 = c4324dB.f36958h;
                listK = list;
                int i39 = c4324dB.f36959i;
                int i40 = c4324dB.f36955e;
                g.k kVar3 = kVar2;
                c0753k2 = c0753kC;
                kVar = kVar3;
                i20 = c4324dB.f36956f;
                i16 = iG;
                i18 = iIntValue;
                str2 = str3;
                iJ = i37;
                i17 = i38;
                iK = i39;
                i27 = i40;
                str5 = str6;
                str4 = "video/avc";
                i30 = i36;
            } else {
                i16 = iG;
                if (iU2 == 1752589123) {
                    AbstractC4338s.a(str4 == null, null);
                    c10.a0(iG2 + 8);
                    i2.C cA = i2.C.a(c10);
                    List list2 = cA.f36836a;
                    hVar2.f910c = cA.f36837b;
                    if (!z10) {
                        fX = cA.f36849n;
                    }
                    int i41 = cA.f36850o;
                    int i42 = cA.f36838c;
                    String str7 = cA.f36851p;
                    int i43 = cA.f36848m;
                    listK = list2;
                    if (i43 != -1) {
                        i29 = i43;
                    }
                    int i44 = cA.f36841f;
                    int i45 = cA.f36842g;
                    int i46 = cA.f36845j;
                    int i47 = cA.f36846k;
                    int i48 = cA.f36847l;
                    i33 = i45;
                    i27 = cA.f36843h;
                    i20 = cA.f36844i;
                    c0753k2 = c0753kC;
                    i18 = iIntValue;
                    str2 = str3;
                    iJ = i46;
                    i17 = i47;
                    iK = i48;
                    kVar = cA.f36852q;
                    i30 = i41;
                    i31 = i42;
                    i32 = i44;
                    str4 = "video/hevc";
                    str5 = str7;
                } else {
                    str2 = str3;
                    if (iU2 == 1818785347) {
                        AbstractC4338s.a("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        g.k kVar4 = kVar2;
                        AbstractC4338s.a(kVar4 != null && kVar4.f5187b.size() >= 2, "must have at least two layers");
                        c10.a0(iG2 + 8);
                        i2.C c11 = i2.C.c(c10, (g.k) AbstractC0853a.e(kVar4));
                        AbstractC4338s.a(hVar2.f910c == c11.f36837b, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i49 = c11.f36845j;
                        int i50 = i34;
                        if (i49 != -1) {
                            AbstractC4338s.a(i50 == i49, "colorSpace must be the same for both views");
                        }
                        int i51 = c11.f36846k;
                        int i52 = i35;
                        if (i51 != -1) {
                            AbstractC4338s.a(i52 == i51, "colorRange must be the same for both views");
                        }
                        int i53 = c11.f36847l;
                        if (i53 != -1) {
                            int i54 = iK;
                            i23 = i54;
                            AbstractC4338s.a(i54 == i53, "colorTransfer must be the same for both views");
                        } else {
                            i23 = iK;
                        }
                        AbstractC4338s.a(i27 == c11.f36843h, "bitdepthLuma must be the same for both views");
                        AbstractC4338s.a(i28 == c11.f36844i, "bitdepthChroma must be the same for both views");
                        List listK2 = listK;
                        if (listK2 != null) {
                            listK2 = AbstractC1081v.r().j(listK2).j(c11.f36836a).k();
                            i24 = i50;
                        } else {
                            i24 = i50;
                            AbstractC4338s.a(false, "initializationData must be already set from hvcC atom");
                        }
                        str4 = "video/mv-hevc";
                        c0753k2 = c0753kC;
                        i18 = iIntValue;
                        i17 = i52;
                        i20 = i28;
                        iJ = i24;
                        iK = i23;
                        str5 = c11.f36851p;
                        kVar = kVar4;
                        listK = listK2;
                    } else {
                        List listK3 = listK;
                        iJ = i34;
                        i17 = i35;
                        int i55 = iK;
                        g.k kVar5 = kVar2;
                        if (iU2 == 1986361461) {
                            l lVarK = K(c10, iG2, iU);
                            if (lVarK == null || lVarK.f926a == null) {
                                i22 = i29;
                                i29 = i22;
                                c0753k2 = c0753kC;
                                listK = listK3;
                                i18 = iIntValue;
                                i20 = i28;
                                iK = i55;
                                kVar = kVar5;
                            } else if (kVar5 == null || kVar5.f5187b.size() < 2) {
                                i22 = i29;
                                if (i22 == -1) {
                                    i29 = lVarK.f926a.f901a.f907c ? 5 : 4;
                                } else {
                                    i29 = i22;
                                }
                                c0753k2 = c0753kC;
                                listK = listK3;
                                i18 = iIntValue;
                                i20 = i28;
                                iK = i55;
                                kVar = kVar5;
                            } else {
                                AbstractC4338s.a(lVarK.b(), "both eye views must be marked as available");
                                AbstractC4338s.a(!lVarK.f926a.f901a.f907c, "for MV-HEVC, eye_views_reversed must be set to false");
                                i22 = i29;
                                i29 = i22;
                                c0753k2 = c0753kC;
                                listK = listK3;
                                i18 = iIntValue;
                                i20 = i28;
                                iK = i55;
                                kVar = kVar5;
                            }
                        } else {
                            int i56 = i29;
                            if (iU2 == 1685480259 || iU2 == 1685485123 || iU2 == 1685485379) {
                                c0753k2 = c0753kC;
                                i18 = iIntValue;
                                i19 = i56;
                                i20 = i28;
                                float f10 = fX;
                                int i57 = i27;
                                i21 = i55;
                                int i58 = iU - 8;
                                byte[] bArr = new byte[i58];
                                c10.q(bArr, 0, i58);
                                if (listK3 != null) {
                                    listK = AbstractC1081v.r().j(listK3).a(bArr).k();
                                } else {
                                    AbstractC4338s.a(false, "initializationData must already be set from hvcC or avcC atom");
                                    listK = listK3;
                                }
                                c10.a0(iG2 + 8);
                                H1.a aVarA = H1.a.a(c10);
                                if (aVarA != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = aVarA.f5116c;
                                }
                                iJ = iJ;
                                i27 = i57;
                                fX = f10;
                            } else if (iU2 == 1987076931) {
                                AbstractC4338s.a(str4 == null, null);
                                String str8 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                c10.a0(iG2 + 12);
                                byte bL = (byte) c10.L();
                                byte bL2 = (byte) c10.L();
                                int iL = c10.L();
                                i27 = iL >> 4;
                                i18 = iIntValue;
                                byte b10 = (byte) ((iL >> 1) & 7);
                                if (str8.equals("video/x-vnd.on2.vp9")) {
                                    listK3 = AbstractC0861i.k(bL, bL2, (byte) i27, b10);
                                }
                                boolean z11 = (iL & 1) != 0;
                                int iL2 = c10.L();
                                int iL3 = c10.L();
                                int iJ2 = C0748f.j(iL2);
                                int i59 = z11 ? 1 : 2;
                                iK = C0748f.k(iL3);
                                str4 = str8;
                                c0753k2 = c0753kC;
                                i17 = i59;
                                kVar = kVar5;
                                iJ = iJ2;
                                listK = listK3;
                                i29 = i56;
                                i20 = i27;
                            } else {
                                i18 = iIntValue;
                                if (iU2 == 1635135811) {
                                    int i60 = iU - 8;
                                    byte[] bArr2 = new byte[i60];
                                    c10.q(bArr2, 0, i60);
                                    listK = AbstractC1081v.A(bArr2);
                                    c10.a0(iG2 + 8);
                                    C0748f c0748fJ = j(c10);
                                    int i61 = c0748fJ.f1701e;
                                    int i62 = c0748fJ.f1702f;
                                    int i63 = c0748fJ.f1697a;
                                    int i64 = c0748fJ.f1698b;
                                    iK = c0748fJ.f1699c;
                                    i27 = i61;
                                    c0753k2 = c0753kC;
                                    i20 = i62;
                                    iJ = i63;
                                    i17 = i64;
                                    str4 = "video/av01";
                                    kVar = kVar5;
                                } else if (iU2 == 1668050025) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer = byteBufferA;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(c10.H());
                                    byteBuffer.putShort(c10.H());
                                    byteBufferA = byteBuffer;
                                    c0753k2 = c0753kC;
                                    listK = listK3;
                                    i20 = i28;
                                    kVar = kVar5;
                                    iK = i55;
                                } else if (iU2 == 1835295606) {
                                    if (byteBufferA == null) {
                                        byteBufferA = a();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferA;
                                    short sH = c10.H();
                                    short sH2 = c10.H();
                                    short sH3 = c10.H();
                                    short sH4 = c10.H();
                                    i20 = i28;
                                    short sH5 = c10.H();
                                    int i65 = i27;
                                    short sH6 = c10.H();
                                    c0753k2 = c0753kC;
                                    short sH7 = c10.H();
                                    short sH8 = c10.H();
                                    long jN = c10.N();
                                    long jN2 = c10.N();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(sH5);
                                    byteBuffer2.putShort(sH6);
                                    byteBuffer2.putShort(sH);
                                    byteBuffer2.putShort(sH2);
                                    byteBuffer2.putShort(sH3);
                                    byteBuffer2.putShort(sH4);
                                    byteBuffer2.putShort(sH7);
                                    byteBuffer2.putShort(sH8);
                                    byteBuffer2.putShort((short) (jN / 10000));
                                    byteBuffer2.putShort((short) (jN2 / 10000));
                                    byteBufferA = byteBuffer2;
                                    listK = listK3;
                                    kVar = kVar5;
                                    i27 = i65;
                                    iK = i55;
                                    i29 = i56;
                                    fX = fX;
                                } else {
                                    c0753k2 = c0753kC;
                                    i19 = i56;
                                    i20 = i28;
                                    float f11 = fX;
                                    int i66 = i27;
                                    if (iU2 == 1681012275) {
                                        AbstractC4338s.a(str4 == null, null);
                                        listK = listK3;
                                        kVar = kVar5;
                                        i27 = i66;
                                        str4 = str2;
                                    } else {
                                        if (iU2 == 1702061171) {
                                            AbstractC4338s.a(str4 == null, null);
                                            cVarN = n(c10, iG2);
                                            String str9 = cVarN.f897a;
                                            byte[] bArr3 = cVarN.f898b;
                                            listK = bArr3 != null ? AbstractC1081v.A(bArr3) : listK3;
                                            str4 = str9;
                                        } else {
                                            if (iU2 == 1651798644) {
                                                aVarK = k(c10, iG2);
                                            } else if (iU2 == 1885434736) {
                                                fX = x(c10, iG2);
                                                listK = listK3;
                                                kVar = kVar5;
                                                i27 = i66;
                                                iK = i55;
                                                i29 = i19;
                                                z10 = true;
                                            } else if (iU2 == 1937126244) {
                                                bArrY = y(c10, iG2, iU);
                                            } else if (iU2 == 1936995172) {
                                                int iL4 = c10.L();
                                                c10.b0(3);
                                                if (iL4 == 0) {
                                                    int iL5 = c10.L();
                                                    if (iL5 == 0) {
                                                        i19 = 0;
                                                    } else if (iL5 == 1) {
                                                        i19 = 1;
                                                    } else if (iL5 == 2) {
                                                        i19 = 2;
                                                    } else if (iL5 == 3) {
                                                        i19 = 3;
                                                    }
                                                }
                                            } else if (iU2 == 1634760259) {
                                                int i67 = iU - 12;
                                                byte[] bArr4 = new byte[i67];
                                                c10.a0(iG2 + 12);
                                                c10.q(bArr4, 0, i67);
                                                listK = AbstractC1081v.A(bArr4);
                                                C0748f c0748fH = h(new C(bArr4));
                                                int i68 = c0748fH.f1701e;
                                                int i69 = c0748fH.f1702f;
                                                int i70 = c0748fH.f1697a;
                                                int i71 = c0748fH.f1698b;
                                                iK = c0748fH.f1699c;
                                                i27 = i68;
                                                i20 = i69;
                                                iJ = i70;
                                                i17 = i71;
                                                str4 = "video/apv";
                                                kVar = kVar5;
                                                i29 = i19;
                                                fX = f11;
                                            } else {
                                                if (iU2 == 1668246642) {
                                                    i21 = i55;
                                                    if (iJ == -1 && i21 == -1) {
                                                        int iU3 = c10.u();
                                                        if (iU3 == 1852009592 || iU3 == 1852009571) {
                                                            int iT3 = c10.T();
                                                            int iT4 = c10.T();
                                                            c10.b0(2);
                                                            boolean z12 = iU == 19 && (c10.L() & 128) != 0;
                                                            iJ = C0748f.j(iT3);
                                                            listK = listK3;
                                                            i17 = z12 ? 1 : 2;
                                                            kVar = kVar5;
                                                            i27 = i66;
                                                            i29 = i19;
                                                            fX = f11;
                                                            iK = C0748f.k(iT4);
                                                        } else {
                                                            G1.t.h("BoxParsers", "Unsupported color type: " + H1.d.a(iU3));
                                                        }
                                                    }
                                                } else {
                                                    i21 = i55;
                                                }
                                                listK = listK3;
                                                iJ = iJ;
                                                i27 = i66;
                                                fX = f11;
                                            }
                                            listK = listK3;
                                        }
                                        kVar = kVar5;
                                        i27 = i66;
                                    }
                                    iK = i55;
                                    i29 = i19;
                                    fX = f11;
                                }
                                i29 = i56;
                            }
                            iK = i21;
                            kVar = kVar5;
                            i29 = i19;
                        }
                    }
                }
            }
            iG = i16 + iU;
            C0753k c0753k3 = c0753k2;
            kVar2 = kVar;
            c0753kC = c0753k3;
            i25 = i11;
            i26 = i12;
            hVar2 = hVar;
            i28 = i20;
            iIntValue = i18;
            str3 = str2;
            i34 = iJ;
            i35 = i17;
        }
        C0753k c0753k4 = c0753kC;
        float f12 = fX;
        List list3 = listK;
        int i72 = i29;
        int i73 = i34;
        int i74 = i35;
        int i75 = iK;
        int i76 = i28;
        int i77 = i27;
        if (str4 == null) {
            return;
        }
        o.b bVarV = new o.b().i0(i13).y0(str4).U(str5).F0(iT).h0(iT2).b0(i32).a0(i33).u0(f12).x0(i14).v0(bArrY).B0(i72).k0(list3).p0(i30).q0(i31).c0(c0753k4).n0(str).V(new C0748f.b().d(i73).c(i74).e(i75).f(byteBufferA != null ? byteBufferA.array() : null).g(i77).b(i76).a());
        if (aVarK != null) {
            bVarV.S(N7.g.n(aVarK.f886a)).t0(N7.g.n(aVarK.f887b));
        } else if (cVarN != null) {
            bVarV.S(N7.g.n(cVarN.f899c)).t0(N7.g.n(cVarN.f900d));
        }
        hVar.f909b = bVarV.P();
    }

    public static D1.u M(C c10) {
        short sH = c10.H();
        c10.b0(2);
        String strI = c10.I(sH);
        int iMax = Math.max(strI.lastIndexOf(43), strI.lastIndexOf(45));
        try {
            return new D1.u(new H1.e(Float.parseFloat(strI.substring(0, iMax)), Float.parseFloat(strI.substring(iMax, strI.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    public static int N(int i10) {
        int i11 = (i10 >> 16) & 255;
        int i12 = ((i10 >> 8) & 255) - 128;
        int i13 = (i10 & 255) - 128;
        return M.o(i11 + ((i13 * 17790) / 10000), 0, 255) | (M.o(((i12 * 14075) / 10000) + i11, 0, 255) << 16) | (M.o((i11 - ((i13 * 3455) / 10000)) - ((i12 * 7169) / 10000), 0, 255) << 8);
    }

    public static ByteBuffer a() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    public static boolean b(long[] jArr, long j10, long j11, long j12) {
        int length = jArr.length - 1;
        return jArr[0] <= j11 && j11 < jArr[M.o(4, 0, length)] && jArr[M.o(jArr.length - 4, 0, length)] < j12 && j12 <= j10;
    }

    public static int c(C c10, int i10, int i11, int i12) throws D1.w {
        int iG = c10.g();
        AbstractC4338s.a(iG >= i11, null);
        while (iG - i11 < i12) {
            c10.a0(iG);
            int iU = c10.u();
            AbstractC4338s.a(iU > 0, "childAtomSize must be positive");
            if (c10.u() == i10) {
                return iG;
            }
            iG += iU;
        }
        return -1;
    }

    public static String d(byte[] bArr, int i10, int i11) {
        AbstractC0853a.g(bArr.length == 64);
        ArrayList arrayList = new ArrayList(16);
        for (int i12 = 0; i12 < bArr.length - 3; i12 += 4) {
            arrayList.add(String.format("%06x", Integer.valueOf(N(N7.g.i(bArr[i12], bArr[i12 + 1], bArr[i12 + 2], bArr[i12 + 3])))));
        }
        return "size: " + i10 + "x" + i11 + "\npalette: " + J7.g.g(", ").d(arrayList) + "\n";
    }

    public static String e(int i10) {
        char[] cArr = {(char) (((i10 >> 10) & 31) + 96), (char) (((i10 >> 5) & 31) + 96), (char) ((i10 & 31) + 96)};
        for (int i11 = 0; i11 < 3; i11++) {
            char c10 = cArr[i11];
            if (c10 < 'a' || c10 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    public static int f(int i10) {
        if (i10 == 1936684398) {
            return 1;
        }
        if (i10 == 1986618469) {
            return 2;
        }
        if (i10 == 1952807028 || i10 == 1935832172 || i10 == 1937072756 || i10 == 1668047728 || i10 == 1937072752) {
            return 3;
        }
        return i10 == 1835365473 ? 5 : -1;
    }

    public static void g(C c10) {
        int iG = c10.g();
        c10.b0(4);
        if (c10.u() != 1751411826) {
            iG += 4;
        }
        c10.a0(iG);
    }

    public static C0748f h(C c10) {
        C0748f.b bVar = new C0748f.b();
        G1.B b10 = new G1.B(c10.f());
        b10.p(c10.g() * 8);
        b10.s(1);
        int iH = b10.h(8);
        for (int i10 = 0; i10 < iH; i10++) {
            b10.s(1);
            int iH2 = b10.h(8);
            for (int i11 = 0; i11 < iH2; i11++) {
                b10.r(6);
                boolean zG = b10.g();
                b10.q();
                b10.s(11);
                b10.r(4);
                int iH3 = b10.h(4) + 8;
                bVar.g(iH3);
                bVar.b(iH3);
                b10.s(1);
                if (zG) {
                    int iH4 = b10.h(8);
                    int iH5 = b10.h(8);
                    b10.s(1);
                    bVar.d(C0748f.j(iH4)).c(b10.g() ? 1 : 2).e(C0748f.k(iH5));
                }
            }
        }
        return bVar.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:141:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x03ab A[PHI: r2 r8 r9 r11 r16 r23
      0x03ab: PHI (r2v17 java.util.List) = (r2v2 java.util.List), (r2v2 java.util.List), (r2v16 java.util.List), (r2v2 java.util.List), (r2v27 java.util.List) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r8v11 int) = (r8v8 int), (r8v8 int), (r8v8 int), (r8v8 int), (r8v16 int) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r9v8 int) = (r9v5 int), (r9v5 int), (r9v5 int), (r9v5 int), (r9v9 int) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r11v11 java.lang.String) = 
      (r11v9 java.lang.String)
      (r11v10 java.lang.String)
      (r11v10 java.lang.String)
      (r11v12 java.lang.String)
      (r11v9 java.lang.String)
     binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r16v3 C2.b$c) = (r16v1 C2.b$c), (r16v2 C2.b$c), (r16v2 C2.b$c), (r16v1 C2.b$c), (r16v1 C2.b$c) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]
      0x03ab: PHI (r23v2 int) = (r23v1 int), (r23v1 int), (r23v1 int), (r23v3 int), (r23v1 int) binds: [B:240:0x045d, B:242:0x046b, B:245:0x0475, B:233:0x0421, B:206:0x037b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void i(G1.C r26, int r27, int r28, int r29, int r30, java.lang.String r31, boolean r32, D1.C0753k r33, C2.b.h r34, int r35) throws D1.w {
        /*
            Method dump skipped, instruction units count: 1296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: C2.b.i(G1.C, int, int, int, int, java.lang.String, boolean, D1.k, C2.b$h, int):void");
    }

    public static C0748f j(C c10) {
        C0748f.b bVar = new C0748f.b();
        G1.B b10 = new G1.B(c10.f());
        b10.p(c10.g() * 8);
        b10.s(1);
        int iH = b10.h(3);
        b10.r(6);
        boolean zG = b10.g();
        boolean zG2 = b10.g();
        if (iH == 2 && zG) {
            bVar.g(zG2 ? 12 : 10);
            bVar.b(zG2 ? 12 : 10);
        } else if (iH <= 2) {
            bVar.g(zG ? 10 : 8);
            bVar.b(zG ? 10 : 8);
        }
        b10.r(13);
        b10.q();
        int iH2 = b10.h(4);
        if (iH2 != 1) {
            G1.t.f("BoxParsers", "Unsupported obu_type: " + iH2);
            return bVar.a();
        }
        if (b10.g()) {
            G1.t.f("BoxParsers", "Unsupported obu_extension_flag");
            return bVar.a();
        }
        boolean zG3 = b10.g();
        b10.q();
        if (zG3 && b10.h(8) > 127) {
            G1.t.f("BoxParsers", "Excessive obu_size");
            return bVar.a();
        }
        int iH3 = b10.h(3);
        b10.q();
        if (b10.g()) {
            G1.t.f("BoxParsers", "Unsupported reduced_still_picture_header");
            return bVar.a();
        }
        if (b10.g()) {
            G1.t.f("BoxParsers", "Unsupported timing_info_present_flag");
            return bVar.a();
        }
        if (b10.g()) {
            G1.t.f("BoxParsers", "Unsupported initial_display_delay_present_flag");
            return bVar.a();
        }
        int iH4 = b10.h(5);
        boolean z10 = false;
        for (int i10 = 0; i10 <= iH4; i10++) {
            b10.r(12);
            if (b10.h(5) > 7) {
                b10.q();
            }
        }
        int iH5 = b10.h(4);
        int iH6 = b10.h(4);
        b10.r(iH5 + 1);
        b10.r(iH6 + 1);
        if (b10.g()) {
            b10.r(7);
        }
        b10.r(7);
        boolean zG4 = b10.g();
        if (zG4) {
            b10.r(2);
        }
        if ((b10.g() ? 2 : b10.h(1)) > 0 && !b10.g()) {
            b10.r(1);
        }
        if (zG4) {
            b10.r(3);
        }
        b10.r(3);
        boolean zG5 = b10.g();
        if (iH3 == 2 && zG5) {
            b10.q();
        }
        if (iH3 != 1 && b10.g()) {
            z10 = true;
        }
        if (b10.g()) {
            int iH7 = b10.h(8);
            int iH8 = b10.h(8);
            bVar.d(C0748f.j(iH7)).c(((z10 || iH7 != 1 || iH8 != 13 || b10.h(8) != 0) ? b10.h(1) : 1) != 1 ? 2 : 1).e(C0748f.k(iH8));
        }
        return bVar.a();
    }

    public static a k(C c10, int i10) {
        c10.a0(i10 + 8);
        c10.b0(4);
        return new a(c10.N(), c10.N());
    }

    public static Pair l(C c10, int i10, int i11) throws D1.w {
        int i12 = i10 + 8;
        int i13 = -1;
        int i14 = 0;
        String strI = null;
        Integer numValueOf = null;
        while (i12 - i10 < i11) {
            c10.a0(i12);
            int iU = c10.u();
            int iU2 = c10.u();
            if (iU2 == 1718775137) {
                numValueOf = Integer.valueOf(c10.u());
            } else if (iU2 == 1935894637) {
                c10.b0(4);
                strI = c10.I(4);
            } else if (iU2 == 1935894633) {
                i13 = i12;
                i14 = iU;
            }
            i12 += iU;
        }
        if (!"cenc".equals(strI) && !"cbc1".equals(strI) && !"cens".equals(strI) && !"cbcs".equals(strI)) {
            return null;
        }
        AbstractC4338s.a(numValueOf != null, "frma atom is mandatory");
        AbstractC4338s.a(i13 != -1, "schi atom is mandatory");
        u uVarA = A(c10, i13, i14, strI);
        AbstractC4338s.a(uVarA != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (u) M.i(uVarA));
    }

    public static Pair m(d.b bVar) {
        d.c cVarE = bVar.e(1701606260);
        if (cVarE == null) {
            return null;
        }
        C c10 = cVarE.f5126b;
        c10.a0(8);
        int iQ = q(c10.u());
        int iP = c10.P();
        long[] jArr = new long[iP];
        long[] jArr2 = new long[iP];
        for (int i10 = 0; i10 < iP; i10++) {
            jArr[i10] = iQ == 1 ? c10.S() : c10.N();
            jArr2[i10] = iQ == 1 ? c10.E() : c10.u();
            if (c10.H() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            c10.b0(2);
        }
        return Pair.create(jArr, jArr2);
    }

    public static c n(C c10, int i10) {
        c10.a0(i10 + 12);
        c10.b0(1);
        o(c10);
        c10.b0(2);
        int iL = c10.L();
        if ((iL & 128) != 0) {
            c10.b0(2);
        }
        if ((iL & 64) != 0) {
            c10.b0(c10.L());
        }
        if ((iL & 32) != 0) {
            c10.b0(2);
        }
        c10.b0(1);
        o(c10);
        String strH = D1.v.h(c10.L());
        if ("audio/mpeg".equals(strH) || "audio/vnd.dts".equals(strH) || "audio/vnd.dts.hd".equals(strH)) {
            return new c(strH, null, -1L, -1L);
        }
        c10.b0(4);
        long jN = c10.N();
        long jN2 = c10.N();
        c10.b0(1);
        int iO = o(c10);
        long j10 = jN2;
        byte[] bArr = new byte[iO];
        c10.q(bArr, 0, iO);
        if (j10 <= 0) {
            j10 = -1;
        }
        return new c(strH, bArr, j10, jN > 0 ? jN : -1L);
    }

    public static int o(C c10) {
        int iL = c10.L();
        int i10 = iL & 127;
        while ((iL & 128) == 128) {
            iL = c10.L();
            i10 = (i10 << 7) | (iL & 127);
        }
        return i10;
    }

    public static int p(int i10) {
        return i10 & 16777215;
    }

    public static int q(int i10) {
        return (i10 >> 24) & 255;
    }

    public static int r(C c10) {
        c10.a0(16);
        return c10.u();
    }

    public static D1.u s(C c10, int i10) {
        c10.b0(8);
        ArrayList arrayList = new ArrayList();
        while (c10.g() < i10) {
            u.a aVarD = C2.j.d(c10);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D1.u(arrayList);
    }

    public static e t(C c10) {
        long j10;
        c10.a0(8);
        int iQ = q(c10.u());
        c10.b0(iQ == 0 ? 8 : 16);
        long jN = c10.N();
        int iG = c10.g();
        int i10 = iQ == 0 ? 4 : 8;
        int i11 = 0;
        while (true) {
            j10 = -9223372036854775807L;
            if (i11 >= i10) {
                c10.b0(i10);
                break;
            }
            if (c10.f()[iG + i11] != -1) {
                long jN2 = iQ == 0 ? c10.N() : c10.S();
                if (jN2 != 0) {
                    long jA1 = M.a1(jN2, 1000000L, jN);
                    jN = jN;
                    j10 = jA1;
                }
            } else {
                i11++;
            }
        }
        return new e(jN, j10, e(c10.T()));
    }

    public static D1.u u(d.b bVar) {
        d.c cVarE = bVar.e(1751411826);
        d.c cVarE2 = bVar.e(1801812339);
        d.c cVarE3 = bVar.e(1768715124);
        if (cVarE == null || cVarE2 == null || cVarE3 == null || r(cVarE.f5126b) != 1835299937) {
            return null;
        }
        C c10 = cVarE2.f5126b;
        c10.a0(12);
        int iU = c10.u();
        String[] strArr = new String[iU];
        for (int i10 = 0; i10 < iU; i10++) {
            int iU2 = c10.u();
            c10.b0(4);
            strArr[i10] = c10.I(iU2 - 8);
        }
        C c11 = cVarE3.f5126b;
        c11.a0(8);
        ArrayList arrayList = new ArrayList();
        while (c11.a() > 8) {
            int iG = c11.g();
            int iU3 = c11.u();
            int iU4 = c11.u() - 1;
            if (iU4 < 0 || iU4 >= iU) {
                G1.t.h("BoxParsers", "Skipped metadata with unknown key index: " + iU4);
            } else {
                H1.b bVarI = C2.j.i(c11, iG + iU3, strArr[iU4]);
                if (bVarI != null) {
                    arrayList.add(bVarI);
                }
            }
            c11.a0(iG + iU3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D1.u(arrayList);
    }

    public static void v(C c10, int i10, int i11, int i12, h hVar) {
        c10.a0(i11 + 16);
        if (i10 == 1835365492) {
            c10.F();
            String strF = c10.F();
            if (strF != null) {
                hVar.f909b = new o.b().i0(i12).y0(strF).P();
            }
        }
    }

    public static H1.f w(C c10) {
        long jE;
        long jE2;
        c10.a0(8);
        if (q(c10.u()) == 0) {
            jE = c10.N();
            jE2 = c10.N();
        } else {
            jE = c10.E();
            jE2 = c10.E();
        }
        return new H1.f(jE, jE2, c10.N());
    }

    public static float x(C c10, int i10) {
        c10.a0(i10 + 8);
        return c10.P() / c10.P();
    }

    public static byte[] y(C c10, int i10, int i11) {
        int i12 = i10 + 8;
        while (i12 - i10 < i11) {
            c10.a0(i12);
            int iU = c10.u();
            if (c10.u() == 1886547818) {
                return Arrays.copyOfRange(c10.f(), i12, iU + i12);
            }
            i12 += iU;
        }
        return null;
    }

    public static Pair z(C c10, int i10, int i11) throws D1.w {
        Pair pairL;
        int iG = c10.g();
        while (iG - i10 < i11) {
            c10.a0(iG);
            int iU = c10.u();
            AbstractC4338s.a(iU > 0, "childAtomSize must be positive");
            if (c10.u() == 1936289382 && (pairL = l(c10, iG, iU)) != null) {
                return pairL;
            }
            iG += iU;
        }
        return null;
    }
}
