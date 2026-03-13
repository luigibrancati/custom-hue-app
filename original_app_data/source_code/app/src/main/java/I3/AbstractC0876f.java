package I3;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: I3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0876f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5616a;

    static {
        String strI = AbstractC0890u.i("Data");
        AbstractC4862t.d(strI, "tagWithPrefix(...)");
        f5616a = strI;
    }

    public static final Boolean[] h(boolean[] zArr) {
        int length = zArr.length;
        Boolean[] boolArr = new Boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            boolArr[i10] = Boolean.valueOf(zArr[i10]);
        }
        return boolArr;
    }

    public static final Byte[] i(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = Byte.valueOf(bArr[i10]);
        }
        return bArr2;
    }

    public static final Double[] j(double[] dArr) {
        int length = dArr.length;
        Double[] dArr2 = new Double[length];
        for (int i10 = 0; i10 < length; i10++) {
            dArr2[i10] = Double.valueOf(dArr[i10]);
        }
        return dArr2;
    }

    public static final Float[] k(float[] fArr) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(fArr[i10]);
        }
        return fArr2;
    }

    public static final Integer[] l(int[] iArr) {
        int length = iArr.length;
        Integer[] numArr = new Integer[length];
        for (int i10 = 0; i10 < length; i10++) {
            numArr[i10] = Integer.valueOf(iArr[i10]);
        }
        return numArr;
    }

    public static final Long[] m(long[] jArr) {
        int length = jArr.length;
        Long[] lArr = new Long[length];
        for (int i10 = 0; i10 < length; i10++) {
            lArr[i10] = Long.valueOf(jArr[i10]);
        }
        return lArr;
    }
}
