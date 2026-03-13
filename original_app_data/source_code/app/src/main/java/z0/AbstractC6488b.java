package z0;

/* JADX INFO: renamed from: z0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6488b {
    public static final long a(int i10, int i11, int i12, int i13) {
        if (!((i12 >= 0) & (i11 >= i10) & (i13 >= i12) & (i10 >= 0))) {
            AbstractC6492f.a("maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0");
        }
        return d(i10, i11, i12, i13);
    }

    public static /* synthetic */ long b(int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = 0;
        }
        if ((i14 & 2) != 0) {
            i11 = Integer.MAX_VALUE;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = Integer.MAX_VALUE;
        }
        return a(i10, i11, i12, i13);
    }

    public static final int c(int i10) {
        if (i10 < 8191) {
            return 13;
        }
        if (i10 < 32767) {
            return 15;
        }
        if (i10 < 65535) {
            return 16;
        }
        return i10 < 262143 ? 18 : 255;
    }

    public static final long d(int i10, int i11, int i12, int i13) {
        int i14 = i13 == Integer.MAX_VALUE ? i12 : i13;
        int iC = c(i14);
        int i15 = i11 == Integer.MAX_VALUE ? i10 : i11;
        int iC2 = c(i15);
        if (iC + iC2 > 31) {
            e(i15, i14);
        }
        int i16 = i11 + 1;
        int i17 = i13 + 1;
        int i18 = iC2 - 13;
        return C6487a.b((((long) (i16 & (~(i16 >> 31)))) << 33) | ((long) ((i18 >> 1) + (i18 & 1))) | (((long) i10) << 2) | (((long) i12) << (iC2 + 2)) | (((long) (i17 & (~(i17 >> 31)))) << (iC2 + 33)));
    }

    public static final void e(int i10, int i11) {
        throw new IllegalArgumentException("Can't represent a width of " + i10 + " and height of " + i11 + " in Constraints");
    }
}
