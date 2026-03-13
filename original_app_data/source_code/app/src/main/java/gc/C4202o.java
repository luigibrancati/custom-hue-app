package gc;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: gc.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class C4202o extends C4201n {

    /* JADX INFO: renamed from: gc.o$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends AbstractC4191d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ byte[] f35610b;

        public a(byte[] bArr) {
            this.f35610b = bArr;
        }

        @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Byte) {
                return f(((Number) obj).byteValue());
            }
            return false;
        }

        @Override // gc.AbstractC4189b
        public int d() {
            return this.f35610b.length;
        }

        public boolean f(byte b10) {
            return C4204q.L(this.f35610b, b10);
        }

        @Override // gc.AbstractC4191d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Byte get(int i10) {
            return Byte.valueOf(this.f35610b[i10]);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Byte) {
                return k(((Number) obj).byteValue());
            }
            return -1;
        }

        @Override // gc.AbstractC4189b, java.util.Collection
        public boolean isEmpty() {
            return this.f35610b.length == 0;
        }

        public int k(byte b10) {
            return C4204q.e0(this.f35610b, b10);
        }

        public int l(byte b10) {
            return C4204q.u0(this.f35610b, b10);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Byte) {
                return l(((Number) obj).byteValue());
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: gc.o$b */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class b extends AbstractC4191d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int[] f35611b;

        public b(int[] iArr) {
            this.f35611b = iArr;
        }

        @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Integer) {
                return f(((Number) obj).intValue());
            }
            return false;
        }

        @Override // gc.AbstractC4189b
        public int d() {
            return this.f35611b.length;
        }

        public boolean f(int i10) {
            return C4204q.N(this.f35611b, i10);
        }

        @Override // gc.AbstractC4191d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer get(int i10) {
            return Integer.valueOf(this.f35611b[i10]);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Integer) {
                return k(((Number) obj).intValue());
            }
            return -1;
        }

        @Override // gc.AbstractC4189b, java.util.Collection
        public boolean isEmpty() {
            return this.f35611b.length == 0;
        }

        public int k(int i10) {
            return C4204q.g0(this.f35611b, i10);
        }

        public int l(int i10) {
            return C4204q.v0(this.f35611b, i10);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Integer) {
                return l(((Number) obj).intValue());
            }
            return -1;
        }
    }

    /* JADX INFO: renamed from: gc.o$c */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class c extends AbstractC4191d implements RandomAccess {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float[] f35612b;

        public c(float[] fArr) {
            this.f35612b = fArr;
        }

        @Override // gc.AbstractC4189b, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof Float) {
                return f(((Number) obj).floatValue());
            }
            return false;
        }

        @Override // gc.AbstractC4189b
        public int d() {
            return this.f35612b.length;
        }

        public boolean f(float f10) {
            for (float f11 : this.f35612b) {
                if (Float.floatToIntBits(f11) == Float.floatToIntBits(f10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // gc.AbstractC4191d, java.util.List
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Float get(int i10) {
            return Float.valueOf(this.f35612b[i10]);
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof Float) {
                return k(((Number) obj).floatValue());
            }
            return -1;
        }

        @Override // gc.AbstractC4189b, java.util.Collection
        public boolean isEmpty() {
            return this.f35612b.length == 0;
        }

        public int k(float f10) {
            float[] fArr = this.f35612b;
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (Float.floatToIntBits(fArr[i10]) == Float.floatToIntBits(f10)) {
                    return i10;
                }
            }
            return -1;
        }

        public int l(float f10) {
            float[] fArr = this.f35612b;
            int length = fArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i10 = length - 1;
                    if (Float.floatToIntBits(fArr[length]) == Float.floatToIntBits(f10)) {
                        return length;
                    }
                    if (i10 < 0) {
                        break;
                    }
                    length = i10;
                }
            }
            return -1;
        }

        @Override // gc.AbstractC4191d, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof Float) {
                return l(((Number) obj).floatValue());
            }
            return -1;
        }
    }

    public static /* synthetic */ void A(Object[] objArr, Object obj, int i10, int i11, int i12, Object obj2) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = objArr.length;
        }
        x(objArr, obj, i10, i11);
    }

    public static /* synthetic */ void B(boolean[] zArr, boolean z10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = zArr.length;
        }
        y(zArr, z10, i10, i11);
    }

    public static byte[] C(byte[] bArr, byte[] elements) {
        AbstractC4862t.e(bArr, "<this>");
        AbstractC4862t.e(elements, "elements");
        int length = bArr.length;
        int length2 = elements.length;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, length + length2);
        System.arraycopy(elements, 0, bArrCopyOf, length, length2);
        AbstractC4862t.b(bArrCopyOf);
        return bArrCopyOf;
    }

    public static Object[] D(Object[] objArr, Object obj) {
        AbstractC4862t.e(objArr, "<this>");
        int length = objArr.length;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, length + 1);
        objArrCopyOf[length] = obj;
        AbstractC4862t.b(objArrCopyOf);
        return objArrCopyOf;
    }

    public static final void E(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        if (objArr.length > 1) {
            Arrays.sort(objArr);
        }
    }

    public static final void F(Object[] objArr, Comparator comparator) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        if (objArr.length > 1) {
            Arrays.sort(objArr, comparator);
        }
    }

    public static void G(Object[] objArr, Comparator comparator, int i10, int i11) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(comparator, "comparator");
        Arrays.sort(objArr, i10, i11, comparator);
    }

    public static List e(byte[] bArr) {
        AbstractC4862t.e(bArr, "<this>");
        return new a(bArr);
    }

    public static final List f(float[] fArr) {
        AbstractC4862t.e(fArr, "<this>");
        return new c(fArr);
    }

    public static List g(int[] iArr) {
        AbstractC4862t.e(iArr, "<this>");
        return new b(iArr);
    }

    public static List h(Object[] objArr) {
        AbstractC4862t.e(objArr, "<this>");
        List listA = r.a(objArr);
        AbstractC4862t.d(listA, "asList(...)");
        return listA;
    }

    public static byte[] i(byte[] bArr, byte[] destination, int i10, int i11, int i12) {
        AbstractC4862t.e(bArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        System.arraycopy(bArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static final float[] j(float[] fArr, float[] destination, int i10, int i11, int i12) {
        AbstractC4862t.e(fArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        System.arraycopy(fArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static int[] k(int[] iArr, int[] destination, int i10, int i11, int i12) {
        AbstractC4862t.e(iArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        System.arraycopy(iArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static long[] l(long[] jArr, long[] destination, int i10, int i11, int i12) {
        AbstractC4862t.e(jArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        System.arraycopy(jArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static Object[] m(Object[] objArr, Object[] destination, int i10, int i11, int i12) {
        AbstractC4862t.e(objArr, "<this>");
        AbstractC4862t.e(destination, "destination");
        System.arraycopy(objArr, i11, destination, i10, i12 - i11);
        return destination;
    }

    public static /* synthetic */ byte[] n(byte[] bArr, byte[] bArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = bArr.length;
        }
        return i(bArr, bArr2, i10, i11, i12);
    }

    public static /* synthetic */ float[] o(float[] fArr, float[] fArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = fArr.length;
        }
        return j(fArr, fArr2, i10, i11, i12);
    }

    public static /* synthetic */ int[] p(int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = iArr.length;
        }
        return k(iArr, iArr2, i10, i11, i12);
    }

    public static /* synthetic */ long[] q(long[] jArr, long[] jArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = jArr.length;
        }
        return l(jArr, jArr2, i10, i11, i12);
    }

    public static /* synthetic */ Object[] r(Object[] objArr, Object[] objArr2, int i10, int i11, int i12, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            i10 = 0;
        }
        if ((i13 & 4) != 0) {
            i11 = 0;
        }
        if ((i13 & 8) != 0) {
            i12 = objArr.length;
        }
        return m(objArr, objArr2, i10, i11, i12);
    }

    public static byte[] s(byte[] bArr, int i10, int i11) {
        AbstractC4862t.e(bArr, "<this>");
        C4200m.c(i11, bArr.length);
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11);
        AbstractC4862t.d(bArrCopyOfRange, "copyOfRange(...)");
        return bArrCopyOfRange;
    }

    public static final float[] t(float[] fArr, int i10, int i11) {
        AbstractC4862t.e(fArr, "<this>");
        C4200m.c(i11, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, i10, i11);
        AbstractC4862t.d(fArrCopyOfRange, "copyOfRange(...)");
        return fArrCopyOfRange;
    }

    public static Object[] u(Object[] objArr, int i10, int i11) {
        AbstractC4862t.e(objArr, "<this>");
        C4200m.c(i11, objArr.length);
        Object[] objArrCopyOfRange = Arrays.copyOfRange(objArr, i10, i11);
        AbstractC4862t.d(objArrCopyOfRange, "copyOfRange(...)");
        return objArrCopyOfRange;
    }

    public static void v(byte[] bArr, byte b10, int i10, int i11) {
        AbstractC4862t.e(bArr, "<this>");
        Arrays.fill(bArr, i10, i11, b10);
    }

    public static final void w(long[] jArr, long j10, int i10, int i11) {
        AbstractC4862t.e(jArr, "<this>");
        Arrays.fill(jArr, i10, i11, j10);
    }

    public static void x(Object[] objArr, Object obj, int i10, int i11) {
        AbstractC4862t.e(objArr, "<this>");
        Arrays.fill(objArr, i10, i11, obj);
    }

    public static final void y(boolean[] zArr, boolean z10, int i10, int i11) {
        AbstractC4862t.e(zArr, "<this>");
        Arrays.fill(zArr, i10, i11, z10);
    }

    public static /* synthetic */ void z(long[] jArr, long j10, int i10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            i11 = jArr.length;
        }
        w(jArr, j10, i10, i11);
    }
}
