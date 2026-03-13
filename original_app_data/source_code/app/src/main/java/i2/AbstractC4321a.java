package i2;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4321a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f36920a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f36921b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* JADX INFO: renamed from: i2.a$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f36922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f36923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f36924c;

        public b(int i10, int i11, String str) {
            this.f36922a = i10;
            this.f36923b = i11;
            this.f36924c = str;
        }
    }

    public static byte[] a(int i10, int i11) {
        int i12 = 0;
        int i13 = -1;
        int i14 = 0;
        while (true) {
            int[] iArr = f36920a;
            if (i14 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i14]) {
                i13 = i14;
            }
            i14++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f36921b;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return b(2, i13, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static byte[] b(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static int c(G1.B b10) {
        int iH = b10.h(5);
        return iH == 31 ? b10.h(6) + 32 : iH;
    }

    public static int d(G1.B b10) throws D1.w {
        int iH = b10.h(4);
        if (iH == 15) {
            if (b10.b() >= 24) {
                return b10.h(24);
            }
            throw D1.w.a("AAC header insufficient data", null);
        }
        if (iH < 13) {
            return f36920a[iH];
        }
        throw D1.w.a("AAC header wrong Sampling Frequency Index", null);
    }

    public static b e(G1.B b10, boolean z10) throws D1.w {
        int iC = c(b10);
        int iD = d(b10);
        int iH = b10.h(4);
        String str = "mp4a.40." + iC;
        if (iC == 5 || iC == 29) {
            iD = d(b10);
            iC = c(b10);
            if (iC == 22) {
                iH = b10.h(4);
            }
        }
        if (z10) {
            if (iC != 1 && iC != 2 && iC != 3 && iC != 4 && iC != 6 && iC != 7 && iC != 17) {
                switch (iC) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw D1.w.e("Unsupported audio object type: " + iC);
                }
            }
            g(b10, iC, iH);
            switch (iC) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = b10.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw D1.w.e("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f36921b[iH];
        if (i10 != -1) {
            return new b(iD, i10, str);
        }
        throw D1.w.a(null, null);
    }

    public static b f(byte[] bArr) {
        return e(new G1.B(bArr), false);
    }

    public static void g(G1.B b10, int i10, int i11) {
        if (b10.g()) {
            G1.t.h("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (b10.g()) {
            b10.r(14);
        }
        boolean zG = b10.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            b10.r(3);
        }
        if (zG) {
            if (i10 == 22) {
                b10.r(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                b10.r(3);
            }
            b10.r(1);
        }
    }
}
