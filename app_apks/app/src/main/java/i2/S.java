package i2;

import K7.AbstractC1081v;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import u2.C5909a;
import z2.C6500a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class S {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f36903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f36904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36905c;

        public a(String str, String[] strArr, int i10) {
            this.f36903a = str;
            this.f36904b = strArr;
            this.f36905c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f36906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36907b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36908c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36909d;

        public b(boolean z10, int i10, int i11, int i12) {
            this.f36906a = z10;
            this.f36907b = i10;
            this.f36908c = i11;
            this.f36909d = i12;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36910a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36911b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f36912c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f36913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f36914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f36915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f36916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f36917h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f36918i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final byte[] f36919j;

        public c(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10, byte[] bArr) {
            this.f36910a = i10;
            this.f36911b = i11;
            this.f36912c = i12;
            this.f36913d = i13;
            this.f36914e = i14;
            this.f36915f = i15;
            this.f36916g = i16;
            this.f36917h = i17;
            this.f36918i = z10;
            this.f36919j = bArr;
        }
    }

    public static int[] a(int i10) {
        if (i10 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i10 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i10 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i10 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i10 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int b(int i10) {
        int i11 = 0;
        while (i10 > 0) {
            i11++;
            i10 >>>= 1;
        }
        return i11;
    }

    public static long c(long j10, long j11) {
        return (long) Math.floor(Math.pow(j10, 1.0d / j11));
    }

    public static D1.u d(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str = (String) list.get(i10);
            String[] strArrI1 = G1.M.i1(str, "=");
            if (strArrI1.length != 2) {
                G1.t.h("VorbisUtil", "Failed to parse Vorbis comment: " + str);
            } else if (strArrI1[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(C5909a.d(new G1.C(Base64.decode(strArrI1[1], 0))));
                } catch (RuntimeException e10) {
                    G1.t.i("VorbisUtil", "Failed to parse vorbis picture", e10);
                }
            } else {
                arrayList.add(new C6500a(strArrI1[0], strArrI1[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new D1.u(arrayList);
    }

    public static AbstractC1081v e(byte[] bArr) {
        G1.C c10 = new G1.C(bArr);
        c10.b0(1);
        int i10 = 0;
        while (c10.a() > 0 && c10.n() == 255) {
            i10 += 255;
            c10.b0(1);
        }
        int iL = i10 + c10.L();
        int i11 = 0;
        while (c10.a() > 0 && c10.n() == 255) {
            i11 += 255;
            c10.b0(1);
        }
        int iL2 = i11 + c10.L();
        byte[] bArr2 = new byte[iL];
        int iG = c10.g();
        System.arraycopy(bArr, iG, bArr2, 0, iL);
        int i12 = iG + iL + iL2;
        int length = bArr.length - i12;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i12, bArr3, 0, length);
        return AbstractC1081v.B(bArr2, bArr3);
    }

    public static void f(Q q10) throws D1.w {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            int iD2 = q10.d(16);
            if (iD2 == 0) {
                q10.e(8);
                q10.e(16);
                q10.e(16);
                q10.e(6);
                q10.e(8);
                int iD3 = q10.d(4) + 1;
                for (int i11 = 0; i11 < iD3; i11++) {
                    q10.e(8);
                }
            } else {
                if (iD2 != 1) {
                    throw D1.w.a("floor type greater than 1 not decodable: " + iD2, null);
                }
                int iD4 = q10.d(5);
                int[] iArr = new int[iD4];
                int i12 = -1;
                for (int i13 = 0; i13 < iD4; i13++) {
                    int iD5 = q10.d(4);
                    iArr[i13] = iD5;
                    if (iD5 > i12) {
                        i12 = iD5;
                    }
                }
                int i14 = i12 + 1;
                int[] iArr2 = new int[i14];
                for (int i15 = 0; i15 < i14; i15++) {
                    iArr2[i15] = q10.d(3) + 1;
                    int iD6 = q10.d(2);
                    if (iD6 > 0) {
                        q10.e(8);
                    }
                    for (int i16 = 0; i16 < (1 << iD6); i16++) {
                        q10.e(8);
                    }
                }
                q10.e(2);
                int iD7 = q10.d(4);
                int i17 = 0;
                int i18 = 0;
                for (int i19 = 0; i19 < iD4; i19++) {
                    i17 += iArr2[iArr[i19]];
                    while (i18 < i17) {
                        q10.e(iD7);
                        i18++;
                    }
                }
            }
        }
    }

    public static void g(int i10, Q q10) throws D1.w {
        int iD = q10.d(6) + 1;
        for (int i11 = 0; i11 < iD; i11++) {
            int iD2 = q10.d(16);
            if (iD2 != 0) {
                G1.t.c("VorbisUtil", "mapping type other than 0 not supported: " + iD2);
            } else {
                int iD3 = q10.c() ? q10.d(4) + 1 : 1;
                if (q10.c()) {
                    int iD4 = q10.d(8) + 1;
                    for (int i12 = 0; i12 < iD4; i12++) {
                        int i13 = i10 - 1;
                        q10.e(b(i13));
                        q10.e(b(i13));
                    }
                }
                if (q10.d(2) != 0) {
                    throw D1.w.a("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iD3 > 1) {
                    for (int i14 = 0; i14 < i10; i14++) {
                        q10.e(4);
                    }
                }
                for (int i15 = 0; i15 < iD3; i15++) {
                    q10.e(8);
                    q10.e(8);
                    q10.e(8);
                }
            }
        }
    }

    public static b[] h(Q q10) {
        int iD = q10.d(6) + 1;
        b[] bVarArr = new b[iD];
        for (int i10 = 0; i10 < iD; i10++) {
            bVarArr[i10] = new b(q10.c(), q10.d(16), q10.d(16), q10.d(8));
        }
        return bVarArr;
    }

    public static void i(Q q10) throws D1.w {
        int iD = q10.d(6) + 1;
        for (int i10 = 0; i10 < iD; i10++) {
            if (q10.d(16) > 2) {
                throw D1.w.a("residueType greater than 2 is not decodable", null);
            }
            q10.e(24);
            q10.e(24);
            q10.e(24);
            int iD2 = q10.d(6) + 1;
            q10.e(8);
            int[] iArr = new int[iD2];
            for (int i11 = 0; i11 < iD2; i11++) {
                iArr[i11] = ((q10.c() ? q10.d(5) : 0) * 8) + q10.d(3);
            }
            for (int i12 = 0; i12 < iD2; i12++) {
                for (int i13 = 0; i13 < 8; i13++) {
                    if ((iArr[i12] & (1 << i13)) != 0) {
                        q10.e(8);
                    }
                }
            }
        }
    }

    public static a j(G1.C c10) {
        return k(c10, true, true);
    }

    public static a k(G1.C c10, boolean z10, boolean z11) throws D1.w {
        if (z10) {
            o(3, c10, false);
        }
        String strI = c10.I((int) c10.B());
        int length = strI.length();
        long jB = c10.B();
        String[] strArr = new String[(int) jB];
        int length2 = length + 15;
        for (int i10 = 0; i10 < jB; i10++) {
            String strI2 = c10.I((int) c10.B());
            strArr[i10] = strI2;
            length2 = length2 + 4 + strI2.length();
        }
        if (z11 && (c10.L() & 1) == 0) {
            throw D1.w.a("framing bit expected to be set", null);
        }
        return new a(strI, strArr, length2 + 1);
    }

    public static c l(G1.C c10) throws D1.w {
        o(1, c10, false);
        int iC = c10.C();
        int iL = c10.L();
        int iC2 = c10.C();
        int iY = c10.y();
        if (iY <= 0) {
            iY = -1;
        }
        int iY2 = c10.y();
        if (iY2 <= 0) {
            iY2 = -1;
        }
        int iY3 = c10.y();
        if (iY3 <= 0) {
            iY3 = -1;
        }
        int iL2 = c10.L();
        return new c(iC, iL, iC2, iY, iY2, iY3, (int) Math.pow(2.0d, iL2 & 15), (int) Math.pow(2.0d, (iL2 & 240) >> 4), (c10.L() & 1) > 0, Arrays.copyOf(c10.f(), c10.j()));
    }

    public static b[] m(G1.C c10, int i10) throws D1.w {
        o(5, c10, false);
        int iL = c10.L() + 1;
        Q q10 = new Q(c10.f());
        q10.e(c10.g() * 8);
        for (int i11 = 0; i11 < iL; i11++) {
            n(q10);
        }
        int iD = q10.d(6) + 1;
        for (int i12 = 0; i12 < iD; i12++) {
            if (q10.d(16) != 0) {
                throw D1.w.a("placeholder of time domain transforms not zeroed out", null);
            }
        }
        f(q10);
        i(q10);
        g(i10, q10);
        b[] bVarArrH = h(q10);
        if (q10.c()) {
            return bVarArrH;
        }
        throw D1.w.a("framing bit after modes not set as expected", null);
    }

    public static void n(Q q10) throws D1.w {
        if (q10.d(24) != 5653314) {
            throw D1.w.a("expected code book to start with [0x56, 0x43, 0x42] at " + q10.b(), null);
        }
        int iD = q10.d(16);
        int iD2 = q10.d(24);
        int iD3 = 0;
        if (q10.c()) {
            q10.e(5);
            while (iD3 < iD2) {
                iD3 += q10.d(b(iD2 - iD3));
            }
        } else {
            boolean zC = q10.c();
            while (iD3 < iD2) {
                if (!zC) {
                    q10.e(5);
                } else if (q10.c()) {
                    q10.e(5);
                }
                iD3++;
            }
        }
        int iD4 = q10.d(4);
        if (iD4 > 2) {
            throw D1.w.a("lookup type greater than 2 not decodable: " + iD4, null);
        }
        if (iD4 == 1 || iD4 == 2) {
            q10.e(32);
            q10.e(32);
            int iD5 = q10.d(4) + 1;
            q10.e(1);
            q10.e((int) ((iD4 == 1 ? iD != 0 ? c(iD2, iD) : 0L : ((long) iD) * ((long) iD2)) * ((long) iD5)));
        }
    }

    public static boolean o(int i10, G1.C c10, boolean z10) throws D1.w {
        if (c10.a() < 7) {
            if (z10) {
                return false;
            }
            throw D1.w.a("too short header: " + c10.a(), null);
        }
        if (c10.L() != i10) {
            if (z10) {
                return false;
            }
            throw D1.w.a("expected header type " + Integer.toHexString(i10), null);
        }
        if (c10.L() == 118 && c10.L() == 111 && c10.L() == 114 && c10.L() == 98 && c10.L() == 105 && c10.L() == 115) {
            return true;
        }
        if (z10) {
            return false;
        }
        throw D1.w.a("expected characters 'vorbis'", null);
    }
}
