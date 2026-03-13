package X9;

import N6.A9;
import N6.C1426o3;
import N6.C1453q4;
import N6.C1479s5;
import N6.C1506u6;
import N6.C1533w7;
import N6.C1560y8;
import N6.P3;
import N6.R4;
import N6.T5;
import N6.V6;
import N6.X7;
import N6.Z8;
import V9.a;
import android.graphics.Point;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class p implements W9.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A9 f19423a;

    public p(A9 a92) {
        this.f19423a = a92;
    }

    public static a.b o(P3 p32) {
        if (p32 == null) {
            return null;
        }
        return new a.b(p32.f9989a, p32.f9990b, p32.f9991c, p32.f9992d, p32.f9993e, p32.f9994f, p32.f9995g, p32.f9996h);
    }

    @Override // W9.a
    public final a.c a() {
        C1453q4 c1453q4 = this.f19423a.f9659l;
        if (c1453q4 == null) {
            return null;
        }
        return new a.c(c1453q4.f10424a, c1453q4.f10425b, c1453q4.f10426c, c1453q4.f10427d, c1453q4.f10428e, o(c1453q4.f10429f), o(c1453q4.f10430g));
    }

    @Override // W9.a
    public final String b() {
        return this.f19423a.f9650c;
    }

    @Override // W9.a
    public final a.i c() {
        C1533w7 c1533w7 = this.f19423a.f9654g;
        if (c1533w7 != null) {
            return new a.i(c1533w7.f10521b, c1533w7.f10520a);
        }
        return null;
    }

    @Override // W9.a
    public final a.e d() {
        C1479s5 c1479s5 = this.f19423a.f9661n;
        if (c1479s5 == null) {
            return null;
        }
        return new a.e(c1479s5.f10451a, c1479s5.f10452b, c1479s5.f10453c, c1479s5.f10454d, c1479s5.f10455e, c1479s5.f10456f, c1479s5.f10457g, c1479s5.f10458h, c1479s5.f10459i, c1479s5.f10460j, c1479s5.f10461k, c1479s5.f10462l, c1479s5.f10463m, c1479s5.f10464n);
    }

    @Override // W9.a
    public final Rect e() {
        A9 a92 = this.f19423a;
        if (a92.f9652e == null) {
            return null;
        }
        int i10 = 0;
        int iMax = Integer.MIN_VALUE;
        int iMin = Integer.MAX_VALUE;
        int iMin2 = Integer.MAX_VALUE;
        int iMax2 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = a92.f9652e;
            if (i10 >= pointArr.length) {
                return new Rect(iMin, iMin2, iMax, iMax2);
            }
            Point point = pointArr[i10];
            iMin = Math.min(iMin, point.x);
            iMax = Math.max(iMax, point.x);
            iMin2 = Math.min(iMin2, point.y);
            iMax2 = Math.max(iMax2, point.y);
            i10++;
        }
    }

    @Override // W9.a
    public final String f() {
        return this.f19423a.f9649b;
    }

    @Override // W9.a
    public final int g() {
        return this.f19423a.f9651d;
    }

    @Override // W9.a
    public final int getFormat() {
        return this.f19423a.f9648a;
    }

    @Override // W9.a
    public final a.k getUrl() {
        C1560y8 c1560y8 = this.f19423a.f9657j;
        if (c1560y8 != null) {
            return new a.k(c1560y8.f10560a, c1560y8.f10561b);
        }
        return null;
    }

    @Override // W9.a
    public final a.j h() {
        X7 x72 = this.f19423a.f9655h;
        if (x72 != null) {
            return new a.j(x72.f10128a, x72.f10129b);
        }
        return null;
    }

    @Override // W9.a
    public final a.d i() {
        R4 r42 = this.f19423a.f9660m;
        if (r42 == null) {
            return null;
        }
        V6 v62 = r42.f10023a;
        a.h hVar = v62 == null ? null : new a.h(v62.f10101a, v62.f10102b, v62.f10103c, v62.f10104d, v62.f10105e, v62.f10106f, v62.f10107g);
        String str = r42.f10024b;
        String str2 = r42.f10025c;
        C1533w7[] c1533w7Arr = r42.f10026d;
        ArrayList arrayList = new ArrayList();
        if (c1533w7Arr != null) {
            for (C1533w7 c1533w7 : c1533w7Arr) {
                if (c1533w7 != null) {
                    arrayList.add(new a.i(c1533w7.f10521b, c1533w7.f10520a));
                }
            }
        }
        T5[] t5Arr = r42.f10027e;
        ArrayList arrayList2 = new ArrayList();
        if (t5Arr != null) {
            for (T5 t52 : t5Arr) {
                if (t52 != null) {
                    arrayList2.add(new a.f(t52.f10068a, t52.f10069b, t52.f10070c, t52.f10071d));
                }
            }
        }
        String[] strArr = r42.f10028f;
        List listAsList = strArr != null ? Arrays.asList(strArr) : new ArrayList();
        C1426o3[] c1426o3Arr = r42.f10029g;
        ArrayList arrayList3 = new ArrayList();
        if (c1426o3Arr != null) {
            for (C1426o3 c1426o3 : c1426o3Arr) {
                if (c1426o3 != null) {
                    arrayList3.add(new a.C0222a(c1426o3.f10406a, c1426o3.f10407b));
                }
            }
        }
        return new a.d(hVar, str, str2, arrayList, arrayList2, listAsList, arrayList3);
    }

    @Override // W9.a
    public final byte[] j() {
        return this.f19423a.f9662o;
    }

    @Override // W9.a
    public final Point[] k() {
        return this.f19423a.f9652e;
    }

    @Override // W9.a
    public final a.f l() {
        T5 t52 = this.f19423a.f9653f;
        if (t52 != null) {
            return new a.f(t52.f10068a, t52.f10069b, t52.f10070c, t52.f10071d);
        }
        return null;
    }

    @Override // W9.a
    public final a.g m() {
        C1506u6 c1506u6 = this.f19423a.f9658k;
        if (c1506u6 != null) {
            return new a.g(c1506u6.f10489a, c1506u6.f10490b);
        }
        return null;
    }

    @Override // W9.a
    public final a.l n() {
        Z8 z82 = this.f19423a.f9656i;
        if (z82 != null) {
            return new a.l(z82.f10161a, z82.f10162b, z82.f10163c);
        }
        return null;
    }
}
