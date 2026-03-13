package b0;

import c0.AbstractC2926a;
import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: renamed from: b0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2780d {
    public static final void a(C2778b c2778b, int i10) {
        AbstractC4862t.e(c2778b, "<this>");
        c2778b.n(new int[i10]);
        c2778b.l(new Object[i10]);
    }

    public static final int b(C2778b c2778b, int i10) {
        AbstractC4862t.e(c2778b, "<this>");
        try {
            return AbstractC2926a.a(c2778b.e(), c2778b.h(), i10);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C2778b c2778b, Object obj, int i10) {
        AbstractC4862t.e(c2778b, "<this>");
        int iH = c2778b.h();
        if (iH == 0) {
            return -1;
        }
        int iB = b(c2778b, i10);
        if (iB < 0 || AbstractC4862t.a(obj, c2778b.d()[iB])) {
            return iB;
        }
        int i11 = iB + 1;
        while (i11 < iH && c2778b.e()[i11] == i10) {
            if (AbstractC4862t.a(obj, c2778b.d()[i11])) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iB - 1; i12 >= 0 && c2778b.e()[i12] == i10; i12--) {
            if (AbstractC4862t.a(obj, c2778b.d()[i12])) {
                return i12;
            }
        }
        return ~i11;
    }

    public static final int d(C2778b c2778b) {
        AbstractC4862t.e(c2778b, "<this>");
        return c(c2778b, null, 0);
    }
}
