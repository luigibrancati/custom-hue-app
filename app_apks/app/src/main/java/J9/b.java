package J9;

import Bc.k;
import U6.I;
import U6.L;
import android.graphics.Bitmap;
import android.graphics.Color;
import gc.C4179C;
import gc.C4204q;
import gc.C4206t;
import io.flutter.plugin.platform.PlatformPlugin;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements L {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C0107b f6343l = new C0107b(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int[] f6344m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final float[] f6345n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final J9.a f6346o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Collection f6347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public J9.a f6349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f6350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f6351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public L9.a f6352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public I9.a f6353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f6354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public double[] f6355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public double[] f6356k;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Collection f6357a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6358b = 20;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public J9.a f6359c = b.f6346o;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public double f6360d = 0.7d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public double f6361e;

        public final b a() {
            if (this.f6357a == null || !(!r0.isEmpty())) {
                throw new IllegalArgumentException("No input data: you must use either .data or .weightedData before building.");
            }
            return new b(this, null);
        }

        public final J9.a b() {
            return this.f6359c;
        }

        public final double c() {
            return this.f6361e;
        }

        public final double d() {
            return this.f6360d;
        }

        public final int e() {
            return this.f6358b;
        }

        public final Collection f() {
            return this.f6357a;
        }

        public final a g(J9.a gradient) {
            AbstractC4862t.e(gradient, "gradient");
            this.f6359c = gradient;
            return this;
        }

        public final a h(double d10) {
            this.f6361e = d10;
            return this;
        }

        public final a i(double d10) {
            this.f6360d = d10;
            if (0.0d > d10 || d10 > 1.0d) {
                throw new IllegalArgumentException("Opacity must be in range [0, 1]");
            }
            return this;
        }

        public final a j(int i10) {
            this.f6358b = i10;
            if (10 > i10 || i10 >= 51) {
                throw new IllegalArgumentException("Radius not within bounds.");
            }
            return this;
        }

        public final a k(Collection weightedData) {
            AbstractC4862t.e(weightedData, "weightedData");
            this.f6357a = weightedData;
            if (weightedData == null || !(!weightedData.isEmpty())) {
                throw new IllegalArgumentException("No input points.");
            }
            return this;
        }
    }

    /* JADX INFO: renamed from: J9.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0107b {

        /* JADX INFO: renamed from: J9.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f6362a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f6363b;

            public a(int i10, int i11) {
                this.f6362a = i10;
                this.f6363b = i11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f6362a == aVar.f6362a && this.f6363b == aVar.f6363b;
            }

            public int hashCode() {
                return (Integer.hashCode(this.f6362a) * 31) + Integer.hashCode(this.f6363b);
            }

            public String toString() {
                return "Vector(x=" + this.f6362a + ", y=" + this.f6363b + ")";
            }
        }

        public /* synthetic */ C0107b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final Bitmap b(double[][] grid, int[] colorMap, double d10) {
            AbstractC4862t.e(grid, "grid");
            AbstractC4862t.e(colorMap, "colorMap");
            int iS0 = C4204q.s0(colorMap);
            double length = ((double) (colorMap.length - 1)) / d10;
            int length2 = grid.length;
            int[] iArr = new int[length2 * length2];
            for (int i10 = 0; i10 < length2; i10++) {
                for (int i11 = 0; i11 < length2; i11++) {
                    double d11 = grid[i11][i10];
                    int i12 = (int) (d11 * length);
                    iArr[(i10 * length2) + i11] = d11 == 0.0d ? 0 : i12 < colorMap.length ? colorMap[i12] : iS0;
                }
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(length2, length2, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.setPixels(iArr, 0, length2, 0, 0, length2, length2);
            return bitmapCreateBitmap;
        }

        public final I c(Bitmap bitmap) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return new I(512, 512, byteArrayOutputStream.toByteArray());
        }

        public final double[][] d(double[][] grid, double[] kernel) {
            int iH;
            int i10;
            int iE;
            int iH2;
            int i11;
            int iE2;
            AbstractC4862t.e(grid, "grid");
            AbstractC4862t.e(kernel, "kernel");
            int iFloor = (int) Math.floor(((double) kernel.length) / 2.0d);
            int length = grid.length;
            int i12 = length - (iFloor * 2);
            int i13 = (iFloor + i12) - 1;
            double[][] dArr = new double[length][];
            for (int i14 = 0; i14 < length; i14++) {
                dArr[i14] = new double[length];
            }
            for (int i15 = 0; i15 < length; i15++) {
                for (int i16 = 0; i16 < length; i16++) {
                    double d10 = grid[i15][i16];
                    if (d10 != 0.0d && (iE2 = k.e((i11 = i15 - iFloor), iFloor)) <= (iH2 = k.h(i15 + iFloor, i13))) {
                        while (true) {
                            double[] dArr2 = dArr[iE2];
                            dArr2[i16] = dArr2[i16] + (kernel[iE2 - i11] * d10);
                            if (iE2 != iH2) {
                                iE2++;
                            }
                        }
                    }
                }
            }
            double[][] dArr3 = new double[i12][];
            for (int i17 = 0; i17 < i12; i17++) {
                dArr3[i17] = new double[i12];
            }
            if (iFloor <= i13) {
                int i18 = iFloor;
                while (true) {
                    for (int i19 = 0; i19 < length; i19++) {
                        double d11 = dArr[i18][i19];
                        if (d11 != 0.0d && (iE = k.e((i10 = i19 - iFloor), iFloor)) <= (iH = k.h(i19 + iFloor, i13))) {
                            while (true) {
                                double[] dArr4 = dArr3[i18 - iFloor];
                                int i20 = iE - iFloor;
                                dArr4[i20] = dArr4[i20] + (kernel[iE - i10] * d11);
                                if (iE != iH) {
                                    iE++;
                                }
                            }
                        }
                    }
                    if (i18 == i13) {
                        break;
                    }
                    i18++;
                }
            }
            return dArr3;
        }

        public final double[] e(int i10, double d10) {
            double[] dArr = new double[(i10 * 2) + 1];
            int i11 = -i10;
            if (i11 <= i10) {
                while (true) {
                    dArr[i11 + i10] = Math.exp(((double) ((-i11) * i11)) / ((((double) 2) * d10) * d10));
                    if (i11 == i10) {
                        break;
                    }
                    i11++;
                }
            }
            return dArr;
        }

        public final I9.a f(Collection points) {
            AbstractC4862t.e(points, "points");
            I9.b bVarA = ((c) C4179C.g0(points)).a();
            double d10 = bVarA.f5671a;
            double d11 = bVarA.f5672b;
            double d12 = d10;
            double d13 = d12;
            double d14 = d11;
            double d15 = d14;
            for (c cVar : C4179C.b0(points, 1)) {
                double d16 = cVar.a().f5671a;
                double d17 = cVar.a().f5672b;
                if (d16 < d12) {
                    d12 = d16;
                }
                if (d16 > d13) {
                    d13 = d16;
                }
                if (d17 < d14) {
                    d14 = d17;
                }
                if (d17 > d15) {
                    d15 = d17;
                }
            }
            return new I9.a(d12, d13, d14, d15);
        }

        public final double g(Collection points, I9.a bounds, int i10, int i11) {
            AbstractC4862t.e(points, "points");
            AbstractC4862t.e(bounds, "bounds");
            double d10 = bounds.f5665a;
            double d11 = bounds.f5666b;
            double d12 = bounds.f5667c;
            double d13 = ((double) ((int) (((double) (i11 / (i10 * 2))) + 0.5d))) / k.d(d11 - d10, bounds.f5668d - d12);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = points.iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                a aVar = new a((int) ((cVar.a().f5671a - d10) * d13), (int) ((cVar.a().f5672b - d12) * d13));
                Object objValueOf = linkedHashMap.get(aVar);
                if (objValueOf == null) {
                    objValueOf = Double.valueOf(0.0d);
                    linkedHashMap.put(aVar, objValueOf);
                }
                linkedHashMap.put(aVar, Double.valueOf(((Number) objValueOf).doubleValue() + cVar.b()));
            }
            Double dW0 = C4179C.w0(linkedHashMap.values());
            if (dW0 != null) {
                return dW0.doubleValue();
            }
            return 0.0d;
        }

        public C0107b() {
        }
    }

    static {
        int[] iArr = {Color.rgb(102, 225, 0), Color.rgb(255, 0, 0)};
        f6344m = iArr;
        float[] fArr = {0.2f, 1.0f};
        f6345n = fArr;
        f6346o = new J9.a(iArr, fArr, 0, 4, null);
    }

    public /* synthetic */ b(a aVar, AbstractC4854k abstractC4854k) {
        this(aVar);
    }

    public final double[] a(int i10) {
        int i11;
        double[] dArr = new double[22];
        if (this.f6351f == 0.0d) {
            int i12 = 5;
            while (true) {
                if (i12 >= 11) {
                    break;
                }
                C0107b c0107b = f6343l;
                Collection collection = this.f6347b;
                I9.a aVar = this.f6353h;
                if (aVar == null) {
                    AbstractC4862t.p("bounds");
                    aVar = null;
                }
                dArr[i12] = c0107b.g(collection, aVar, i10, (int) (((double) PlatformPlugin.DEFAULT_SYSTEM_UI) * Math.pow(2.0d, i12 - 3)));
                if (i12 == 5) {
                    for (int i13 = 0; i13 < i12; i13++) {
                        dArr[i13] = dArr[i12];
                    }
                }
                i12++;
            }
            for (i11 = 11; i11 < 22; i11++) {
                dArr[i11] = dArr[10];
            }
        } else {
            for (int i14 = 0; i14 < 22; i14++) {
                dArr[i14] = this.f6351f;
            }
        }
        return dArr;
    }

    public final void b(J9.a gradient) {
        AbstractC4862t.e(gradient, "gradient");
        this.f6349d = gradient;
        this.f6354i = gradient.b(this.f6350e);
    }

    public final void c(double d10) {
        this.f6351f = d10;
        f(this.f6347b);
    }

    public final void d(double d10) {
        this.f6350e = d10;
        b(this.f6349d);
    }

    public final void e(int i10) {
        this.f6348c = i10;
        this.f6355j = f6343l.e(i10, ((double) i10) / 3.0d);
        this.f6356k = a(this.f6348c);
    }

    public final void f(Collection data) {
        AbstractC4862t.e(data, "data");
        this.f6347b = data;
        if (data.isEmpty()) {
            throw new IllegalArgumentException("No input points.");
        }
        this.f6353h = f6343l.f(this.f6347b);
        I9.a aVar = this.f6353h;
        if (aVar == null) {
            AbstractC4862t.p("bounds");
            aVar = null;
        }
        this.f6352g = new L9.a(aVar, 0, 2, (AbstractC4854k) null);
        for (c cVar : this.f6347b) {
            L9.a aVar2 = this.f6352g;
            if (aVar2 == null) {
                AbstractC4862t.p("tree");
                aVar2 = null;
            }
            aVar2.a(cVar);
        }
        this.f6356k = a(this.f6348c);
    }

    @Override // U6.L
    public I getTile(int i10, int i11, int i12) {
        double[] dArr;
        double dPow = 1.0d / Math.pow(2.0d, i12);
        int i13 = this.f6348c;
        double d10 = (((double) i13) * dPow) / ((double) 512);
        double d11 = ((((double) 2) * d10) + dPow) / ((double) ((i13 * 2) + 512));
        double d12 = (((double) i10) * dPow) - d10;
        double d13 = (((double) (i10 + 1)) * dPow) + d10;
        double d14 = (((double) i11) * dPow) - d10;
        double d15 = (((double) (i11 + 1)) * dPow) + d10;
        Collection<c> collectionK = C4206t.k();
        double d16 = 0.0d;
        if (d12 < 0.0d) {
            I9.a aVar = new I9.a(d12 + 1.0d, 1.0d, d14, d15);
            L9.a aVar2 = this.f6352g;
            if (aVar2 == null) {
                AbstractC4862t.p("tree");
                aVar2 = null;
            }
            collectionK = aVar2.f(aVar);
            d16 = -1.0d;
        } else if (d13 > 1.0d) {
            I9.a aVar3 = new I9.a(0.0d, d13 - 1.0d, d14, d15);
            L9.a aVar4 = this.f6352g;
            if (aVar4 == null) {
                AbstractC4862t.p("tree");
                aVar4 = null;
            }
            collectionK = aVar4.f(aVar3);
            d16 = 1.0d;
        }
        I9.a aVar5 = new I9.a(d12, d13, d14, d15);
        I9.a aVar6 = this.f6353h;
        if (aVar6 == null) {
            AbstractC4862t.p("bounds");
            aVar6 = null;
        }
        double d17 = aVar6.f5665a - d10;
        I9.a aVar7 = this.f6353h;
        if (aVar7 == null) {
            AbstractC4862t.p("bounds");
            aVar7 = null;
        }
        double d18 = aVar7.f5666b + d10;
        I9.a aVar8 = this.f6353h;
        if (aVar8 == null) {
            AbstractC4862t.p("bounds");
            aVar8 = null;
        }
        double d19 = aVar8.f5667c - d10;
        I9.a aVar9 = this.f6353h;
        if (aVar9 == null) {
            AbstractC4862t.p("bounds");
            aVar9 = null;
        }
        if (!aVar5.e(new I9.a(d17, d18, d19, aVar9.f5668d + d10))) {
            I NO_TILE = L.f16658a;
            AbstractC4862t.d(NO_TILE, "NO_TILE");
            return NO_TILE;
        }
        L9.a aVar10 = this.f6352g;
        if (aVar10 == null) {
            AbstractC4862t.p("tree");
            aVar10 = null;
        }
        Collection<c> collectionF = aVar10.f(aVar5);
        if (collectionF.isEmpty()) {
            I NO_TILE2 = L.f16658a;
            AbstractC4862t.d(NO_TILE2, "NO_TILE");
            return NO_TILE2;
        }
        int i14 = (this.f6348c * 2) + 512;
        double[][] dArr2 = new double[i14][];
        for (int i15 = 0; i15 < i14; i15++) {
            dArr2[i15] = new double[(this.f6348c * 2) + 512];
        }
        for (c cVar : collectionF) {
            I9.b bVarA = cVar.a();
            int i16 = (int) ((bVarA.f5671a - d12) / d11);
            int i17 = (int) ((bVarA.f5672b - d14) / d11);
            double[] dArr3 = dArr2[i16];
            dArr3[i17] = dArr3[i17] + cVar.b();
        }
        for (c cVar2 : collectionK) {
            I9.b bVarA2 = cVar2.a();
            int i18 = (int) (((bVarA2.f5671a + d16) - d12) / d11);
            int i19 = (int) ((bVarA2.f5672b - d14) / d11);
            double[] dArr4 = dArr2[i18];
            dArr4[i19] = dArr4[i19] + cVar2.b();
        }
        C0107b c0107b = f6343l;
        double[][] dArrD = c0107b.d(dArr2, this.f6355j);
        int[] iArr = this.f6354i;
        if (iArr == null) {
            AbstractC4862t.p("colorMap");
            iArr = null;
        }
        double[] dArr5 = this.f6356k;
        if (dArr5 == null) {
            AbstractC4862t.p("maxIntensity");
            dArr = null;
        } else {
            dArr = dArr5;
        }
        return c0107b.c(c0107b.b(dArrD, iArr, dArr[i12]));
    }

    public b(a aVar) {
        Collection collectionF = aVar.f();
        AbstractC4862t.b(collectionF);
        this.f6347b = collectionF;
        this.f6348c = aVar.e();
        this.f6349d = aVar.b();
        this.f6350e = aVar.d();
        this.f6351f = aVar.c();
        C0107b c0107b = f6343l;
        int i10 = this.f6348c;
        this.f6355j = c0107b.e(i10, ((double) i10) / 3.0d);
        b(this.f6349d);
        f(this.f6347b);
    }
}
