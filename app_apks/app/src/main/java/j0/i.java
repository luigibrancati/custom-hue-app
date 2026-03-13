package j0;

import gc.C4202o;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final int a(long[] jArr, long j10) {
        int length = jArr.length - 1;
        int i10 = 0;
        while (i10 <= length) {
            int i11 = (i10 + length) >>> 1;
            long j11 = jArr[i11];
            if (j10 > j11) {
                i10 = i11 + 1;
            } else {
                if (j10 >= j11) {
                    return i11;
                }
                length = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final long[] b(int i10) {
        return new long[i10];
    }

    public static final long c(int i10) {
        return i10;
    }

    public static final long[] d(long[] jArr, int i10, long j10) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        C4202o.l(jArr, jArr2, 0, 0, i10);
        C4202o.l(jArr, jArr2, i10 + 1, i10, length);
        jArr2[i10] = j10;
        return jArr2;
    }
}
