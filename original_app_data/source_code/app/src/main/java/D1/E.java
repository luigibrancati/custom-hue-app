package D1;

import G1.AbstractC0853a;
import G1.M;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1489f = M.z0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1490g = M.z0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f1492b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1493c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o[] f1494d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1495e;

    public E(o... oVarArr) {
        this("", oVarArr);
    }

    public static void c(String str, String str2, String str3, int i10) {
        G1.t.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i10 + ")"));
    }

    public static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    public static int e(int i10) {
        return i10 | 16384;
    }

    public o a(int i10) {
        return this.f1494d[i10];
    }

    public int b(o oVar) {
        int i10 = 0;
        while (true) {
            o[] oVarArr = this.f1494d;
            if (i10 >= oVarArr.length) {
                return -1;
            }
            if (oVar == oVarArr[i10]) {
                return i10;
            }
            i10++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && E.class == obj.getClass()) {
            E e10 = (E) obj;
            if (this.f1492b.equals(e10.f1492b) && Arrays.equals(this.f1494d, e10.f1494d)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        String strD = d(this.f1494d[0].f1794d);
        int iE = e(this.f1494d[0].f1796f);
        int i10 = 1;
        while (true) {
            o[] oVarArr = this.f1494d;
            if (i10 >= oVarArr.length) {
                return;
            }
            if (!strD.equals(d(oVarArr[i10].f1794d))) {
                o[] oVarArr2 = this.f1494d;
                c("languages", oVarArr2[0].f1794d, oVarArr2[i10].f1794d, i10);
                return;
            } else {
                if (iE != e(this.f1494d[i10].f1796f)) {
                    c("role flags", Integer.toBinaryString(this.f1494d[0].f1796f), Integer.toBinaryString(this.f1494d[i10].f1796f), i10);
                    return;
                }
                i10++;
            }
        }
    }

    public int hashCode() {
        if (this.f1495e == 0) {
            this.f1495e = ((527 + this.f1492b.hashCode()) * 31) + Arrays.hashCode(this.f1494d);
        }
        return this.f1495e;
    }

    public String toString() {
        return this.f1492b + ": " + Arrays.toString(this.f1494d);
    }

    public E(String str, o... oVarArr) {
        AbstractC0853a.a(oVarArr.length > 0);
        this.f1492b = str;
        this.f1494d = oVarArr;
        this.f1491a = oVarArr.length;
        int iK = v.k(oVarArr[0].f1805o);
        this.f1493c = iK == -1 ? v.k(oVarArr[0].f1804n) : iK;
        f();
    }
}
