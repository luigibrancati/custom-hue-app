package P2;

import G1.AbstractC0853a;
import com.google.android.libraries.barhopper.RecognitionOptions;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f13072a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f13073b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13074c;
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f13075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f13076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final byte[] f13078d;

        public c(int i10, int i11, int i12, byte[] bArr) {
            this.f13075a = i10;
            this.f13076b = i11;
            this.f13077c = i12;
            this.f13078d = bArr;
        }
    }

    public static int a(int i10) throws D1.w {
        if (i10 == 0) {
            return 768;
        }
        if (i10 == 1) {
            return RecognitionOptions.UPC_E;
        }
        if (i10 == 2 || i10 == 3) {
            return RecognitionOptions.PDF417;
        }
        if (i10 == 4) {
            return RecognitionOptions.AZTEC;
        }
        throw D1.w.e("Unsupported coreSbrFrameLengthIndex " + i10);
    }

    public static double b(int i10) throws D1.w {
        switch (i10) {
            case 14700:
            case 16000:
                return 3.0d;
            case 22050:
            case 24000:
                return 2.0d;
            case 29400:
            case 32000:
            case 58800:
            case 64000:
                return 1.5d;
            case 44100:
            case 48000:
            case 88200:
            case 96000:
                return 1.0d;
            default:
                throw D1.w.e("Unsupported sampling rate " + i10);
        }
    }

    public static int c(int i10) throws D1.w {
        switch (i10) {
            case 0:
                return 96000;
            case 1:
                return 88200;
            case 2:
                return 64000;
            case 3:
                return 48000;
            case 4:
                return 44100;
            case 5:
                return 32000;
            case 6:
                return 24000;
            case 7:
                return 22050;
            case 8:
                return 16000;
            case 9:
                return 12000;
            case 10:
                return 11025;
            case 11:
                return 8000;
            case 12:
                return 7350;
            case 13:
            case 14:
            default:
                throw D1.w.e("Unsupported sampling rate index " + i10);
            case 15:
                return 57600;
            case 16:
                return 51200;
            case 17:
                return 40000;
            case 18:
                return 38400;
            case 19:
                return 34150;
            case 20:
                return 28800;
            case 21:
                return 25600;
            case 22:
                return 20000;
            case 23:
                return 19200;
            case 24:
                return 17075;
            case 25:
                return 14400;
            case 26:
                return 12800;
            case 27:
                return 9600;
        }
    }

    public static int d(int i10) throws D1.w {
        if (i10 == 0 || i10 == 1) {
            return 0;
        }
        int i11 = 2;
        if (i10 != 2) {
            i11 = 3;
            if (i10 != 3) {
                if (i10 == 4) {
                    return 1;
                }
                throw D1.w.e("Unsupported coreSbrFrameLengthIndex " + i10);
            }
        }
        return i11;
    }

    public static boolean e(int i10) {
        return (i10 & 16777215) == 12583333;
    }

    public static int f(G1.B b10) {
        if (!b10.g()) {
            return 0;
        }
        b10.r(2);
        return b10.h(13);
    }

    public static boolean g(G1.B b10, b bVar) throws D1.w {
        b10.d();
        int iK = k(b10, 3, 8, 8);
        bVar.f13072a = iK;
        if (iK == -1) {
            return false;
        }
        long jL = l(b10, 2, 8, 32);
        bVar.f13073b = jL;
        if (jL == -1) {
            return false;
        }
        if (jL > 16) {
            throw D1.w.e("Contains sub-stream with an invalid packet label " + bVar.f13073b);
        }
        if (jL == 0) {
            int i10 = bVar.f13072a;
            if (i10 == 1) {
                throw D1.w.a("Mpegh3daConfig packet with invalid packet label 0", null);
            }
            if (i10 == 2) {
                throw D1.w.a("Mpegh3daFrame packet with invalid packet label 0", null);
            }
            if (i10 == 17) {
                throw D1.w.a("AudioTruncation packet with invalid packet label 0", null);
            }
        }
        int iK2 = k(b10, 11, 24, 24);
        bVar.f13074c = iK2;
        return iK2 != -1;
    }

    public static c h(G1.B b10) throws D1.w {
        int iH = b10.h(8);
        int iH2 = b10.h(5);
        int iH3 = iH2 == 31 ? b10.h(24) : c(iH2);
        int iH4 = b10.h(3);
        int iA = a(iH4);
        int iD = d(iH4);
        b10.r(2);
        p(b10);
        m(b10, j(b10), iD);
        byte[] bArr = null;
        if (b10.g()) {
            int iK = k(b10, 2, 4, 8) + 1;
            for (int i10 = 0; i10 < iK; i10++) {
                int iK2 = k(b10, 4, 8, 16);
                int iK3 = k(b10, 4, 8, 16);
                if (iK2 == 7) {
                    int iH5 = b10.h(4) + 1;
                    b10.r(4);
                    byte[] bArr2 = new byte[iH5];
                    for (int i11 = 0; i11 < iH5; i11++) {
                        bArr2[i11] = (byte) b10.h(8);
                    }
                    bArr = bArr2;
                } else {
                    b10.r(iK3 * 8);
                }
            }
        }
        byte[] bArr3 = bArr;
        double dB = b(iH3);
        return new c(iH, (int) (((double) iH3) * dB), (int) (((double) iA) * dB), bArr3);
    }

    public static boolean i(G1.B b10) {
        b10.r(3);
        boolean zG = b10.g();
        if (zG) {
            b10.r(13);
        }
        return zG;
    }

    public static int j(G1.B b10) {
        int iH = b10.h(5);
        int iK = 0;
        for (int i10 = 0; i10 < iH + 1; i10++) {
            int iH2 = b10.h(3);
            iK += k(b10, 5, 8, 16) + 1;
            if ((iH2 == 0 || iH2 == 2) && b10.g()) {
                p(b10);
            }
        }
        return iK;
    }

    public static int k(G1.B b10, int i10, int i11, int i12) {
        AbstractC0853a.a(Math.max(Math.max(i10, i11), i12) <= 31);
        int i13 = (1 << i10) - 1;
        int i14 = (1 << i11) - 1;
        M7.d.a(M7.d.a(i13, i14), 1 << i12);
        if (b10.b() < i10) {
            return -1;
        }
        int iH = b10.h(i10);
        if (iH != i13) {
            return iH;
        }
        if (b10.b() < i11) {
            return -1;
        }
        int iH2 = b10.h(i11);
        int i15 = iH + iH2;
        if (iH2 != i14) {
            return i15;
        }
        if (b10.b() < i12) {
            return -1;
        }
        return i15 + b10.h(i12);
    }

    public static long l(G1.B b10, int i10, int i11, int i12) {
        AbstractC0853a.a(Math.max(Math.max(i10, i11), i12) <= 63);
        long j10 = (1 << i10) - 1;
        long j11 = (1 << i11) - 1;
        M7.e.a(M7.e.a(j10, j11), 1 << i12);
        if (b10.b() < i10) {
            return -1L;
        }
        long j12 = b10.j(i10);
        if (j12 != j10) {
            return j12;
        }
        if (b10.b() < i11) {
            return -1L;
        }
        long j13 = b10.j(i11);
        long j14 = j12 + j13;
        if (j13 != j11) {
            return j14;
        }
        if (b10.b() < i12) {
            return -1L;
        }
        return j14 + b10.j(i12);
    }

    public static void m(G1.B b10, int i10, int i11) {
        int iH;
        int iK = k(b10, 4, 8, 16) + 1;
        b10.q();
        for (int i12 = 0; i12 < iK; i12++) {
            int iH2 = b10.h(2);
            if (iH2 == 0) {
                i(b10);
                if (i11 > 0) {
                    o(b10);
                }
            } else if (iH2 == 1) {
                if (i(b10)) {
                    b10.q();
                }
                if (i11 > 0) {
                    o(b10);
                    iH = b10.h(2);
                } else {
                    iH = 0;
                }
                if (iH > 0) {
                    b10.r(6);
                    int iH3 = b10.h(2);
                    b10.r(4);
                    if (b10.g()) {
                        b10.r(5);
                    }
                    if (iH == 2 || iH == 3) {
                        b10.r(6);
                    }
                    if (iH3 == 2) {
                        b10.q();
                    }
                }
                int iFloor = ((int) Math.floor(Math.log(i10 - 1) / Math.log(2.0d))) + 1;
                int iH4 = b10.h(2);
                if (iH4 > 0 && b10.g()) {
                    b10.r(iFloor);
                }
                if (b10.g()) {
                    b10.r(iFloor);
                }
                if (i11 == 0 && iH4 == 0) {
                    b10.q();
                }
            } else if (iH2 == 3) {
                k(b10, 4, 8, 16);
                int iK2 = k(b10, 4, 8, 16);
                if (b10.g()) {
                    k(b10, 8, 16, 0);
                }
                b10.q();
                if (iK2 > 0) {
                    b10.r(iK2 * 8);
                }
            }
        }
    }

    public static void n(G1.B b10, int i10) {
        int iH;
        boolean zG = b10.g();
        int i11 = zG ? 1 : 5;
        int i12 = zG ? 7 : 5;
        int i13 = zG ? 8 : 6;
        int i14 = 0;
        while (i14 < i10) {
            if (b10.g()) {
                b10.r(7);
                iH = 0;
            } else {
                if (b10.h(2) == 3 && b10.h(i12) * i11 != 0) {
                    b10.q();
                }
                iH = b10.h(i13) * i11;
                if (iH != 0 && iH != 180) {
                    b10.q();
                }
                b10.q();
            }
            if (iH != 0 && iH != 180 && b10.g()) {
                i14++;
            }
            i14++;
        }
    }

    public static void o(G1.B b10) {
        b10.r(3);
        b10.r(8);
        boolean zG = b10.g();
        boolean zG2 = b10.g();
        if (zG) {
            b10.r(5);
        }
        if (zG2) {
            b10.r(6);
        }
    }

    public static void p(G1.B b10) {
        int iH = b10.h(2);
        if (iH == 0) {
            b10.r(6);
            return;
        }
        int iK = k(b10, 5, 8, 16) + 1;
        if (iH == 1) {
            b10.r(iK * 7);
        } else if (iH == 2) {
            n(b10, iK);
        }
    }
}
