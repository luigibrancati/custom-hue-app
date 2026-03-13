package J9;

import android.graphics.Color;
import gc.C4204q;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f6336d = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f6337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f6338b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f6339c;

    /* JADX INFO: renamed from: J9.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class C0106a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f6340a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f6341b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f6342c;

        public C0106a(int i10, int i11, float f10) {
            this.f6340a = i10;
            this.f6341b = i11;
            this.f6342c = f10;
        }

        public final int a() {
            return this.f6340a;
        }

        public final int b() {
            return this.f6341b;
        }

        public final float c() {
            return this.f6342c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0106a)) {
                return false;
            }
            C0106a c0106a = (C0106a) obj;
            return this.f6340a == c0106a.f6340a && this.f6341b == c0106a.f6341b && Float.compare(this.f6342c, c0106a.f6342c) == 0;
        }

        public int hashCode() {
            return (((Integer.hashCode(this.f6340a) * 31) + Integer.hashCode(this.f6341b)) * 31) + Float.hashCode(this.f6342c);
        }

        public String toString() {
            return "ColorInterval(color1=" + this.f6340a + ", color2=" + this.f6341b + ", duration=" + this.f6342c + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b {
        public /* synthetic */ b(AbstractC4854k abstractC4854k) {
            this();
        }

        public final int a(int i10, int i11, float f10) {
            int iAlpha = (int) (((Color.alpha(i11) - Color.alpha(i10)) * f10) + Color.alpha(i10));
            float[] fArr = new float[3];
            Color.RGBToHSV(Color.red(i10), Color.green(i10), Color.blue(i10), fArr);
            float[] fArr2 = new float[3];
            Color.RGBToHSV(Color.red(i11), Color.green(i11), Color.blue(i11), fArr2);
            float f11 = fArr[0];
            float f12 = fArr2[0];
            if (f11 - f12 > 180.0f) {
                fArr2[0] = f12 + 360.0f;
            } else if (f12 - f11 > 180.0f) {
                fArr[0] = f11 + 360.0f;
            }
            float[] fArr3 = new float[3];
            for (int i12 = 0; i12 < 3; i12++) {
                float f13 = fArr2[i12];
                float f14 = fArr[i12];
                fArr3[i12] = ((f13 - f14) * f10) + f14;
            }
            return Color.HSVToColor(iAlpha, fArr3);
        }

        public b() {
        }
    }

    public a(int[] colors, float[] startPoints, int i10) {
        AbstractC4862t.e(colors, "colors");
        AbstractC4862t.e(startPoints, "startPoints");
        this.f6337a = colors;
        this.f6338b = startPoints;
        this.f6339c = i10;
        if (colors.length != startPoints.length) {
            throw new IllegalArgumentException("colors and startPoints should be same length");
        }
        if (colors.length == 0) {
            throw new IllegalArgumentException("No colors have been defined");
        }
        int length = startPoints.length;
        for (int i11 = 1; i11 < length; i11++) {
            float[] fArr = this.f6338b;
            if (fArr[i11] <= fArr[i11 - 1]) {
                throw new IllegalArgumentException("startPoints should be in increasing order");
            }
        }
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        if (this.f6338b[0] != 0.0f) {
            map.put(0, new C0106a(Color.argb(0, Color.red(this.f6337a[0]), Color.green(this.f6337a[0]), Color.blue(this.f6337a[0])), this.f6337a[0], this.f6339c * this.f6338b[0]));
        }
        int length = this.f6337a.length;
        for (int i10 = 1; i10 < length; i10++) {
            int i11 = this.f6339c;
            float[] fArr = this.f6338b;
            int i12 = i10 - 1;
            float f10 = fArr[i12];
            int i13 = (int) (i11 * f10);
            float f11 = i11 * (fArr[i10] - f10);
            Integer numValueOf = Integer.valueOf(i13);
            int[] iArr = this.f6337a;
            map.put(numValueOf, new C0106a(iArr[i12], iArr[i10], f11));
        }
        if (C4204q.r0(this.f6338b) == 1.0f) {
            return map;
        }
        float[] fArr2 = this.f6338b;
        int length2 = fArr2.length - 1;
        Integer numValueOf2 = Integer.valueOf((int) (this.f6339c * fArr2[length2]));
        int i14 = this.f6337a[length2];
        map.put(numValueOf2, new C0106a(i14, i14, this.f6339c * (1 - this.f6338b[length2])));
        return map;
    }

    public final int[] b(double d10) {
        HashMap mapA = a();
        int[] iArr = new int[this.f6339c];
        C0106a c0106a = (C0106a) mapA.get(0);
        int i10 = this.f6339c;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            if (mapA.containsKey(Integer.valueOf(i12))) {
                c0106a = (C0106a) mapA.get(Integer.valueOf(i12));
                i11 = i12;
            }
            AbstractC4862t.b(c0106a);
            iArr[i12] = f6336d.a(c0106a.a(), c0106a.b(), (i12 - i11) / c0106a.c());
        }
        if (d10 == 1.0d) {
            return iArr;
        }
        int i13 = this.f6339c;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = iArr[i14];
            iArr[i14] = Color.argb((int) (((double) Color.alpha(i15)) * d10), Color.red(i15), Color.green(i15), Color.blue(i15));
        }
        return iArr;
    }

    public /* synthetic */ a(int[] iArr, float[] fArr, int i10, int i11, AbstractC4854k abstractC4854k) {
        this(iArr, fArr, (i11 & 4) != 0 ? 1000 : i10);
    }
}
