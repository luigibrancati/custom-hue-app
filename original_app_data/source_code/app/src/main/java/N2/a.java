package N2;

import F1.a;
import F2.e;
import F2.s;
import G1.B;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import G1.t;
import K7.AbstractC1081v;
import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f9575a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f9576b = new C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f9577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Inflater f9578d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f9580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f9581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int[] f9582d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9583e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9584f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Rect f9585g;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f9579a = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9586h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9587i = -1;

        /* JADX INFO: renamed from: N2.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class C0151a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f9588a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f9589b;

            public C0151a() {
            }
        }

        public static int b(int[] iArr, int i10) {
            return (i10 < 0 || i10 >= iArr.length) ? iArr[0] : iArr[i10];
        }

        public static int c(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        public static void k(B b10, int i10, C0151a c0151a) {
            int iH = 0;
            for (int i11 = 1; iH < i11 && i11 <= 64; i11 <<= 2) {
                if (b10.b() < 4) {
                    c0151a.f9588a = -1;
                    c0151a.f9589b = 0;
                    return;
                }
                iH = (iH << 4) | b10.h(4);
            }
            c0151a.f9588a = iH & 3;
            if (iH >= 4) {
                i10 = iH >> 2;
            }
            c0151a.f9589b = i10;
        }

        public static int n(int i10, int i11) {
            return (i10 & 16777215) | ((i11 * 17) << 24);
        }

        public F1.a a(C c10) {
            Rect rect;
            if (this.f9582d == null || !this.f9580b || !this.f9581c || (rect = this.f9585g) == null || this.f9586h == -1 || this.f9587i == -1 || rect.width() < 2 || this.f9585g.height() < 2) {
                return null;
            }
            Rect rect2 = this.f9585g;
            int[] iArr = new int[rect2.width() * rect2.height()];
            B b10 = new B();
            c10.a0(this.f9586h);
            b10.m(c10);
            j(b10, true, rect2, iArr);
            c10.a0(this.f9587i);
            b10.m(c10);
            j(b10, false, rect2, iArr);
            return new a.b().f(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).k(rect2.left / this.f9583e).l(0).h(rect2.top / this.f9584f, 0).i(0).n(rect2.width() / this.f9583e).g(rect2.height() / this.f9584f).a();
        }

        public final void d(int[] iArr, C c10, int i10) {
            while (c10.g() < i10 && c10.a() > 0) {
                switch (c10.L()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (!g(iArr, c10)) {
                            return;
                        }
                        break;
                    case 4:
                        if (!e(c10)) {
                            return;
                        }
                        break;
                    case 5:
                        if (!f(c10)) {
                            return;
                        }
                        break;
                    case 6:
                        if (!h(c10)) {
                            return;
                        }
                        break;
                    default:
                        return;
                }
            }
        }

        public final boolean e(C c10) {
            if (c10.a() < 2 || !this.f9581c) {
                return false;
            }
            int iL = c10.L();
            int iL2 = c10.L();
            int[] iArr = this.f9579a;
            iArr[3] = n(iArr[3], iL >> 4);
            int[] iArr2 = this.f9579a;
            iArr2[2] = n(iArr2[2], iL & 15);
            int[] iArr3 = this.f9579a;
            iArr3[1] = n(iArr3[1], iL2 >> 4);
            int[] iArr4 = this.f9579a;
            iArr4[0] = n(iArr4[0], iL2 & 15);
            return true;
        }

        public final boolean f(C c10) {
            if (c10.a() < 6) {
                return false;
            }
            int iL = c10.L();
            int iL2 = c10.L();
            int i10 = (iL << 4) | (iL2 >> 4);
            int iL3 = ((iL2 & 15) << 8) | c10.L();
            int iL4 = c10.L();
            int iL5 = c10.L();
            this.f9585g = new Rect(i10, (iL4 << 4) | (iL5 >> 4), iL3 + 1, (c10.L() | ((iL5 & 15) << 8)) + 1);
            return true;
        }

        public final boolean g(int[] iArr, C c10) {
            if (c10.a() < 2) {
                return false;
            }
            int iL = c10.L();
            int iL2 = c10.L();
            this.f9579a[3] = b(iArr, iL >> 4);
            this.f9579a[2] = b(iArr, iL & 15);
            this.f9579a[1] = b(iArr, iL2 >> 4);
            this.f9579a[0] = b(iArr, iL2 & 15);
            this.f9581c = true;
            return true;
        }

        public final boolean h(C c10) {
            if (c10.a() < 4) {
                return false;
            }
            this.f9586h = c10.T();
            this.f9587i = c10.T();
            return true;
        }

        public void i(String str) {
            for (String str2 : M.h1(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] strArrH1 = M.h1(str2.substring(9), ",");
                    this.f9582d = new int[strArrH1.length];
                    for (int i10 = 0; i10 < strArrH1.length; i10++) {
                        this.f9582d[i10] = c(strArrH1[i10].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] strArrH12 = M.h1(str2.substring(6).trim(), "x");
                    if (strArrH12.length == 2) {
                        try {
                            this.f9583e = Integer.parseInt(strArrH12[0]);
                            this.f9584f = Integer.parseInt(strArrH12[1]);
                            this.f9580b = true;
                        } catch (RuntimeException e10) {
                            t.i("VobsubParser", "Parsing IDX failed", e10);
                        }
                    }
                }
            }
        }

        public final void j(B b10, boolean z10, Rect rect, int[] iArr) {
            int iWidth = rect.width();
            int iHeight = rect.height();
            int i10 = !z10 ? 1 : 0;
            int i11 = i10 * iWidth;
            C0151a c0151a = new C0151a();
            while (true) {
                int i12 = 0;
                do {
                    k(b10, iWidth, c0151a);
                    int iMin = Math.min(c0151a.f9589b, iWidth - i12);
                    if (iMin > 0) {
                        int i13 = i11 + iMin;
                        Arrays.fill(iArr, i11, i13, this.f9579a[c0151a.f9588a]);
                        i12 += iMin;
                        i11 = i13;
                    }
                } while (i12 < iWidth);
                i10 += 2;
                if (i10 >= iHeight) {
                    return;
                }
                i11 = i10 * iWidth;
                b10.c();
            }
        }

        public void l(C c10) {
            int[] iArr = this.f9582d;
            if (iArr == null || !this.f9580b) {
                return;
            }
            c10.b0(c10.T() - 2);
            d(iArr, c10, c10.T());
        }

        public void m() {
            this.f9581c = false;
            this.f9585g = null;
            this.f9586h = -1;
            this.f9587i = -1;
        }
    }

    public a(List list) {
        b bVar = new b();
        this.f9577c = bVar;
        bVar.i(new String((byte[]) list.get(0), StandardCharsets.UTF_8));
    }

    @Override // F2.s
    public int b() {
        return 2;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        this.f9575a.Y(bArr, i11 + i10);
        this.f9575a.a0(i10);
        F1.a aVarD = d();
        interfaceC0864l.accept(new e(aVarD != null ? AbstractC1081v.A(aVarD) : AbstractC1081v.z(), -9223372036854775807L, 5000000L));
    }

    public final F1.a d() {
        if (this.f9578d == null) {
            this.f9578d = new Inflater();
        }
        if (M.K0(this.f9575a, this.f9576b, this.f9578d)) {
            this.f9575a.Y(this.f9576b.f(), this.f9576b.j());
        }
        this.f9577c.m();
        int iA = this.f9575a.a();
        if (iA < 2 || this.f9575a.T() != iA) {
            return null;
        }
        this.f9577c.l(this.f9575a);
        return this.f9577c.a(this.f9575a);
    }
}
