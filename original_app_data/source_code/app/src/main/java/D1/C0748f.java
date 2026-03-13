package D1;

import G1.M;
import java.util.Arrays;

/* JADX INFO: renamed from: D1.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0748f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C0748f f1689h = new b().d(1).c(2).e(3).a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0748f f1690i = new b().d(1).c(1).e(2).a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1691j = M.z0(0);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1692k = M.z0(1);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1693l = M.z0(2);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1694m = M.z0(3);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f1695n = M.z0(4);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f1696o = M.z0(5);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1697a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1698b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1699c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f1700d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f1701e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1702f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f1703g;

    /* JADX INFO: renamed from: D1.f$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public byte[] f1707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1709f;

        public C0748f a() {
            return new C0748f(this.f1704a, this.f1705b, this.f1706c, this.f1707d, this.f1708e, this.f1709f);
        }

        public b b(int i10) {
            this.f1709f = i10;
            return this;
        }

        public b c(int i10) {
            this.f1705b = i10;
            return this;
        }

        public b d(int i10) {
            this.f1704a = i10;
            return this;
        }

        public b e(int i10) {
            this.f1706c = i10;
            return this;
        }

        public b f(byte[] bArr) {
            this.f1707d = bArr;
            return this;
        }

        public b g(int i10) {
            this.f1708e = i10;
            return this;
        }

        public b() {
            this.f1704a = -1;
            this.f1705b = -1;
            this.f1706c = -1;
            this.f1708e = -1;
            this.f1709f = -1;
        }

        public b(C0748f c0748f) {
            this.f1704a = c0748f.f1697a;
            this.f1705b = c0748f.f1698b;
            this.f1706c = c0748f.f1699c;
            this.f1707d = c0748f.f1700d;
            this.f1708e = c0748f.f1701e;
            this.f1709f = c0748f.f1702f;
        }
    }

    public static String b(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Chroma";
    }

    public static String c(int i10) {
        if (i10 == -1) {
            return "Unset color range";
        }
        if (i10 == 1) {
            return "Full range";
        }
        if (i10 == 2) {
            return "Limited range";
        }
        return "Undefined color range " + i10;
    }

    public static String d(int i10) {
        if (i10 == -1) {
            return "Unset color space";
        }
        if (i10 == 6) {
            return "BT2020";
        }
        if (i10 == 1) {
            return "BT709";
        }
        if (i10 == 2) {
            return "BT601";
        }
        return "Undefined color space " + i10;
    }

    public static String e(int i10) {
        if (i10 == -1) {
            return "Unset color transfer";
        }
        if (i10 == 10) {
            return "Gamma 2.2";
        }
        if (i10 == 1) {
            return "Linear";
        }
        if (i10 == 2) {
            return "sRGB";
        }
        if (i10 == 3) {
            return "SDR SMPTE 170M";
        }
        if (i10 == 6) {
            return "ST2084 PQ";
        }
        if (i10 == 7) {
            return "HLG";
        }
        return "Undefined color transfer " + i10;
    }

    public static boolean h(C0748f c0748f) {
        if (c0748f == null) {
            return true;
        }
        int i10 = c0748f.f1697a;
        if (i10 != -1 && i10 != 1 && i10 != 2) {
            return false;
        }
        int i11 = c0748f.f1698b;
        if (i11 != -1 && i11 != 2) {
            return false;
        }
        int i12 = c0748f.f1699c;
        if ((i12 != -1 && i12 != 3) || c0748f.f1700d != null) {
            return false;
        }
        int i13 = c0748f.f1702f;
        if (i13 != -1 && i13 != 8) {
            return false;
        }
        int i14 = c0748f.f1701e;
        return i14 == -1 || i14 == 8;
    }

    public static int j(int i10) {
        if (i10 == 1) {
            return 1;
        }
        if (i10 != 9) {
            return (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int k(int i10) {
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 4) {
            return 10;
        }
        if (i10 == 13) {
            return 2;
        }
        if (i10 == 16) {
            return 6;
        }
        if (i10 != 18) {
            return (i10 == 6 || i10 == 7) ? 3 : -1;
        }
        return 7;
    }

    public static String l(int i10) {
        if (i10 == -1) {
            return "NA";
        }
        return i10 + "bit Luma";
    }

    public b a() {
        return new b();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C0748f.class == obj.getClass()) {
            C0748f c0748f = (C0748f) obj;
            if (this.f1697a == c0748f.f1697a && this.f1698b == c0748f.f1698b && this.f1699c == c0748f.f1699c && Arrays.equals(this.f1700d, c0748f.f1700d) && this.f1701e == c0748f.f1701e && this.f1702f == c0748f.f1702f) {
                return true;
            }
        }
        return false;
    }

    public boolean f() {
        return (this.f1701e == -1 || this.f1702f == -1) ? false : true;
    }

    public boolean g() {
        return (this.f1697a == -1 || this.f1698b == -1 || this.f1699c == -1) ? false : true;
    }

    public int hashCode() {
        if (this.f1703g == 0) {
            this.f1703g = ((((((((((527 + this.f1697a) * 31) + this.f1698b) * 31) + this.f1699c) * 31) + Arrays.hashCode(this.f1700d)) * 31) + this.f1701e) * 31) + this.f1702f;
        }
        return this.f1703g;
    }

    public boolean i() {
        return f() || g();
    }

    public String m() {
        String str;
        String strG = g() ? M.G("%s/%s/%s", d(this.f1697a), c(this.f1698b), e(this.f1699c)) : "NA/NA/NA";
        if (f()) {
            str = this.f1701e + "/" + this.f1702f;
        } else {
            str = "NA/NA";
        }
        return strG + "/" + str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("ColorInfo(");
        sb2.append(d(this.f1697a));
        sb2.append(", ");
        sb2.append(c(this.f1698b));
        sb2.append(", ");
        sb2.append(e(this.f1699c));
        sb2.append(", ");
        sb2.append(this.f1700d != null);
        sb2.append(", ");
        sb2.append(l(this.f1701e));
        sb2.append(", ");
        sb2.append(b(this.f1702f));
        sb2.append(")");
        return sb2.toString();
    }

    public C0748f(int i10, int i11, int i12, byte[] bArr, int i13, int i14) {
        this.f1697a = i10;
        this.f1698b = i11;
        this.f1699c = i12;
        this.f1700d = bArr;
        this.f1701e = i13;
        this.f1702f = i14;
    }
}
