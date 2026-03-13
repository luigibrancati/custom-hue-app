package K7;

import java.util.Arrays;
import org.apache.tika.fork.ForkServer;

/* JADX INFO: renamed from: K7.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1072l {
    public static Object a(int i10) {
        if (i10 >= 2 && i10 <= 1073741824 && Integer.highestOneBit(i10) == i10) {
            return i10 <= 256 ? new byte[i10] : i10 <= 65536 ? new short[i10] : new int[i10];
        }
        throw new IllegalArgumentException("must be power of 2 between 2^1 and 2^30: " + i10);
    }

    public static int b(int i10, int i11) {
        return i10 & (~i11);
    }

    public static int c(int i10, int i11) {
        return i10 & i11;
    }

    public static int d(int i10, int i11, int i12) {
        return (i10 & (~i12)) | (i11 & i12);
    }

    public static int e(int i10) {
        return (i10 < 32 ? 4 : 2) * (i10 + 1);
    }

    public static int f(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i11;
        int i12;
        int iC = AbstractC1078s.c(obj);
        int i13 = iC & i10;
        int iH = h(obj3, i13);
        if (iH == 0) {
            return -1;
        }
        int iB = b(iC, i10);
        int i14 = -1;
        while (true) {
            i11 = iH - 1;
            i12 = iArr[i11];
            if (b(i12, i10) == iB && J7.j.a(obj, objArr[i11]) && (objArr2 == null || J7.j.a(obj2, objArr2[i11]))) {
                break;
            }
            int iC2 = c(i12, i10);
            if (iC2 == 0) {
                return -1;
            }
            i14 = i11;
            iH = iC2;
        }
        int iC3 = c(i12, i10);
        if (i14 == -1) {
            i(obj3, i13, iC3);
            return i11;
        }
        iArr[i14] = d(iArr[i14], iC3, i10);
        return i11;
    }

    public static void g(Object obj) {
        if (obj instanceof byte[]) {
            Arrays.fill((byte[]) obj, (byte) 0);
        } else if (obj instanceof short[]) {
            Arrays.fill((short[]) obj, (short) 0);
        } else {
            Arrays.fill((int[]) obj, 0);
        }
    }

    public static int h(Object obj, int i10) {
        return obj instanceof byte[] ? ((byte[]) obj)[i10] & ForkServer.ERROR : obj instanceof short[] ? ((short[]) obj)[i10] & 65535 : ((int[]) obj)[i10];
    }

    public static void i(Object obj, int i10, int i11) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }

    public static int j(int i10) {
        return Math.max(4, AbstractC1078s.a(i10 + 1, 1.0d));
    }
}
