package M1;

import G1.AbstractC0853a;
import G1.M;
import M1.B;
import i2.AbstractC4338s;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class E implements B.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9025d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f9026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f9027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9028g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f9029h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9030a = 250000;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f9031b = 750000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f9032c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f9033d = 250000;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f9034e = 50000000;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f9035f = 2;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f9036g = 4;

        public E h() {
            return new E(this);
        }
    }

    public E(a aVar) {
        this.f9023b = aVar.f9030a;
        this.f9024c = aVar.f9031b;
        this.f9025d = aVar.f9032c;
        this.f9026e = aVar.f9033d;
        this.f9027f = aVar.f9034e;
        this.f9028g = aVar.f9035f;
        this.f9029h = aVar.f9036g;
    }

    public static int b(int i10, int i11, int i12) {
        return N7.g.e(((((long) i10) * ((long) i11)) * ((long) i12)) / 1000000);
    }

    public static int d(int i10) {
        int iB = AbstractC4338s.b(i10);
        AbstractC0853a.g(iB != -2147483647);
        return iB;
    }

    @Override // M1.B.e
    public int a(int i10, int i11, int i12, int i13, int i14, int i15, double d10) {
        return (((Math.max(i10, (int) (((double) c(i10, i11, i12, i13, i14, i15)) * d10)) + i13) - 1) / i13) * i13;
    }

    public int c(int i10, int i11, int i12, int i13, int i14, int i15) {
        if (i12 == 0) {
            return g(i10, i14, i13);
        }
        if (i12 == 1) {
            return e(i11);
        }
        if (i12 == 2) {
            return f(i11, i15);
        }
        throw new IllegalArgumentException();
    }

    public int e(int i10) {
        return N7.g.e((((long) this.f9027f) * ((long) d(i10))) / 1000000);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int f(int r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.f9026e
            r1 = 5
            r2 = 8
            if (r4 != r1) goto Lb
            int r3 = r3.f9028g
        L9:
            int r0 = r0 * r3
            goto L10
        Lb:
            if (r4 != r2) goto L10
            int r3 = r3.f9029h
            goto L9
        L10:
            r3 = -1
            if (r5 == r3) goto L1a
            java.math.RoundingMode r3 = java.math.RoundingMode.CEILING
            int r3 = M7.d.b(r5, r2, r3)
            goto L1e
        L1a:
            int r3 = d(r4)
        L1e:
            long r4 = (long) r0
            long r0 = (long) r3
            long r4 = r4 * r0
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r0
            int r3 = N7.g.e(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.E.f(int, int):int");
    }

    public int g(int i10, int i11, int i12) {
        return M.o(i10 * this.f9025d, b(this.f9023b, i11, i12), b(this.f9024c, i11, i12));
    }
}
