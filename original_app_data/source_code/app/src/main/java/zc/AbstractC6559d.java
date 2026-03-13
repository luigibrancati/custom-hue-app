package zc;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: zc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6559d {
    public static final AbstractC6558c a(long j10) {
        return new C6560e((int) j10, (int) (j10 >> 32));
    }

    public static final String b(Object from, Object until) {
        AbstractC4862t.e(from, "from");
        AbstractC4862t.e(until, "until");
        return "Random range is empty: [" + from + ", " + until + ").";
    }

    public static final void c(int i10, int i11) {
        if (i11 <= i10) {
            throw new IllegalArgumentException(b(Integer.valueOf(i10), Integer.valueOf(i11)).toString());
        }
    }

    public static final void d(long j10, long j11) {
        if (j11 <= j10) {
            throw new IllegalArgumentException(b(Long.valueOf(j10), Long.valueOf(j11)).toString());
        }
    }

    public static final int e(int i10) {
        return 31 - Integer.numberOfLeadingZeros(i10);
    }

    public static final int f(int i10, int i11) {
        return (i10 >>> (32 - i11)) & ((-i11) >> 31);
    }
}
