package Ge;

import Fe.G;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class e {
    public static final int a(int[] iArr, int i10, int i11, int i12) {
        AbstractC4862t.e(iArr, "<this>");
        int i13 = i12 - 1;
        while (i11 <= i13) {
            int i14 = (i11 + i13) >>> 1;
            int i15 = iArr[i14];
            if (i15 < i10) {
                i11 = i14 + 1;
            } else {
                if (i15 <= i10) {
                    return i14;
                }
                i13 = i14 - 1;
            }
        }
        return (-i11) - 1;
    }

    public static final int b(G g10, int i10) {
        AbstractC4862t.e(g10, "<this>");
        int iA = a(g10.T(), i10 + 1, 0, g10.U().length);
        return iA >= 0 ? iA : ~iA;
    }
}
