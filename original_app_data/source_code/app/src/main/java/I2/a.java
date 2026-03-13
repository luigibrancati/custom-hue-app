package I2;

import F1.a;
import F2.e;
import F2.s;
import G1.C;
import G1.InterfaceC0864l;
import G1.M;
import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f5532a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C f5533b = new C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0092a f5534c = new C0092a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Inflater f5535d;

    /* JADX INFO: renamed from: I2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0092a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C f5536a = new C();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f5537b = new int[256];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5538c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5539d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5544i;

        public F1.a d() {
            int iL;
            if (this.f5539d == 0 || this.f5540e == 0 || this.f5543h == 0 || this.f5544i == 0 || this.f5536a.j() == 0 || this.f5536a.g() != this.f5536a.j() || !this.f5538c) {
                return null;
            }
            this.f5536a.a0(0);
            int i10 = this.f5543h * this.f5544i;
            int[] iArr = new int[i10];
            int i11 = 0;
            while (i11 < i10) {
                int iL2 = this.f5536a.L();
                if (iL2 != 0) {
                    iL = i11 + 1;
                    iArr[i11] = this.f5537b[iL2];
                } else {
                    int iL3 = this.f5536a.L();
                    if (iL3 != 0) {
                        iL = ((iL3 & 64) == 0 ? iL3 & 63 : ((iL3 & 63) << 8) | this.f5536a.L()) + i11;
                        Arrays.fill(iArr, i11, iL, (iL3 & 128) == 0 ? this.f5537b[0] : this.f5537b[this.f5536a.L()]);
                    }
                }
                i11 = iL;
            }
            return new a.b().f(Bitmap.createBitmap(iArr, this.f5543h, this.f5544i, Bitmap.Config.ARGB_8888)).k(this.f5541f / this.f5539d).l(0).h(this.f5542g / this.f5540e, 0).i(0).n(this.f5543h / this.f5539d).g(this.f5544i / this.f5540e).a();
        }

        public final void e(C c10, int i10) {
            int iO;
            if (i10 < 4) {
                return;
            }
            c10.b0(3);
            int i11 = i10 - 4;
            if ((c10.L() & 128) != 0) {
                if (i11 < 7 || (iO = c10.O()) < 4) {
                    return;
                }
                this.f5543h = c10.T();
                this.f5544i = c10.T();
                this.f5536a.W(iO - 4);
                i11 = i10 - 11;
            }
            int iG = this.f5536a.g();
            int iJ = this.f5536a.j();
            if (iG >= iJ || i11 <= 0) {
                return;
            }
            int iMin = Math.min(i11, iJ - iG);
            c10.q(this.f5536a.f(), iG, iMin);
            this.f5536a.a0(iG + iMin);
        }

        public final void f(C c10, int i10) {
            if (i10 < 19) {
                return;
            }
            this.f5539d = c10.T();
            this.f5540e = c10.T();
            c10.b0(11);
            this.f5541f = c10.T();
            this.f5542g = c10.T();
        }

        public final void g(C c10, int i10) {
            if (i10 % 5 != 2) {
                return;
            }
            c10.b0(2);
            Arrays.fill(this.f5537b, 0);
            int i11 = i10 / 5;
            for (int i12 = 0; i12 < i11; i12++) {
                int iL = c10.L();
                int iL2 = c10.L();
                int iL3 = c10.L();
                int iL4 = c10.L();
                double d10 = iL2;
                double d11 = iL3 - 128;
                double d12 = iL4 - 128;
                this.f5537b[iL] = (M.o((int) ((d10 - (0.34414d * d12)) - (d11 * 0.71414d)), 0, 255) << 8) | (c10.L() << 24) | (M.o((int) ((1.402d * d11) + d10), 0, 255) << 16) | M.o((int) (d10 + (d12 * 1.772d)), 0, 255);
            }
            this.f5538c = true;
        }

        public void h() {
            this.f5539d = 0;
            this.f5540e = 0;
            this.f5541f = 0;
            this.f5542g = 0;
            this.f5543h = 0;
            this.f5544i = 0;
            this.f5536a.W(0);
            this.f5538c = false;
        }
    }

    public static F1.a d(C c10, C0092a c0092a) {
        int iJ = c10.j();
        int iL = c10.L();
        int iT = c10.T();
        int iG = c10.g() + iT;
        F1.a aVarD = null;
        if (iG > iJ) {
            c10.a0(iJ);
            return null;
        }
        if (iL != 128) {
            switch (iL) {
                case 20:
                    c0092a.g(c10, iT);
                    break;
                case 21:
                    c0092a.e(c10, iT);
                    break;
                case 22:
                    c0092a.f(c10, iT);
                    break;
            }
        } else {
            aVarD = c0092a.d();
            c0092a.h();
        }
        c10.a0(iG);
        return aVarD;
    }

    @Override // F2.s
    public int b() {
        return 2;
    }

    @Override // F2.s
    public void c(byte[] bArr, int i10, int i11, s.b bVar, InterfaceC0864l interfaceC0864l) {
        this.f5532a.Y(bArr, i11 + i10);
        this.f5532a.a0(i10);
        if (this.f5535d == null) {
            this.f5535d = new Inflater();
        }
        if (M.K0(this.f5532a, this.f5533b, this.f5535d)) {
            this.f5532a.Y(this.f5533b.f(), this.f5533b.j());
        }
        this.f5534c.h();
        ArrayList arrayList = new ArrayList();
        while (this.f5532a.a() >= 3) {
            F1.a aVarD = d(this.f5532a, this.f5534c);
            if (aVarD != null) {
                arrayList.add(aVarD);
            }
        }
        interfaceC0864l.accept(new e(arrayList, -9223372036854775807L, -9223372036854775807L));
    }
}
