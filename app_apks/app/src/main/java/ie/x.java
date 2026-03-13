package ie;

import ee.l;
import gc.C4202o;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f37548a = new Object[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f37549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f37550c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37551a = new a();
    }

    public x() {
        int[] iArr = new int[8];
        for (int i10 = 0; i10 < 8; i10++) {
            iArr[i10] = -1;
        }
        this.f37549b = iArr;
        this.f37550c = -1;
    }

    public final String a() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("$");
        int i10 = this.f37550c + 1;
        for (int i11 = 0; i11 < i10; i11++) {
            Object obj = this.f37548a[i11];
            if (obj instanceof ee.e) {
                ee.e eVar = (ee.e) obj;
                if (!AbstractC4862t.a(eVar.f(), l.b.f33972a)) {
                    int i12 = this.f37549b[i11];
                    if (i12 >= 0) {
                        sb2.append(".");
                        sb2.append(eVar.e(i12));
                    }
                } else if (this.f37549b[i11] != -1) {
                    sb2.append("[");
                    sb2.append(this.f37549b[i11]);
                    sb2.append("]");
                }
            } else if (obj != a.f37551a) {
                sb2.append("[");
                sb2.append("'");
                sb2.append(obj);
                sb2.append("'");
                sb2.append("]");
            }
        }
        return sb2.toString();
    }

    public final void b() {
        int i10 = this.f37550c;
        int[] iArr = this.f37549b;
        if (iArr[i10] == -2) {
            iArr[i10] = -1;
            this.f37550c = i10 - 1;
        }
        int i11 = this.f37550c;
        if (i11 != -1) {
            this.f37550c = i11 - 1;
        }
    }

    public final void c(ee.e sd2) {
        AbstractC4862t.e(sd2, "sd");
        int i10 = this.f37550c + 1;
        this.f37550c = i10;
        if (i10 == this.f37548a.length) {
            e();
        }
        this.f37548a[i10] = sd2;
    }

    public final void d() {
        int[] iArr = this.f37549b;
        int i10 = this.f37550c;
        if (iArr[i10] == -2) {
            this.f37548a[i10] = a.f37551a;
        }
    }

    public final void e() {
        int i10 = this.f37550c * 2;
        Object[] objArrCopyOf = Arrays.copyOf(this.f37548a, i10);
        AbstractC4862t.d(objArrCopyOf, "copyOf(...)");
        this.f37548a = objArrCopyOf;
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = -1;
        }
        C4202o.p(this.f37549b, iArr, 0, 0, 0, 14, null);
        this.f37549b = iArr;
    }

    public final void f(Object obj) {
        int[] iArr = this.f37549b;
        int i10 = this.f37550c;
        if (iArr[i10] != -2) {
            int i11 = i10 + 1;
            this.f37550c = i11;
            if (i11 == this.f37548a.length) {
                e();
            }
        }
        Object[] objArr = this.f37548a;
        int i12 = this.f37550c;
        objArr[i12] = obj;
        this.f37549b[i12] = -2;
    }

    public final void g(int i10) {
        this.f37549b[this.f37550c] = i10;
    }

    public String toString() {
        return a();
    }
}
