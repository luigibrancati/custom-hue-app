package x;

import E.C0821x;
import y.C6369e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class W0 {
    public static C0821x a(C6369e c6369e) {
        int iC = c6369e.c();
        int i10 = 1;
        if (iC != 1) {
            i10 = 2;
            if (iC != 2) {
                i10 = 3;
                if (iC != 3) {
                    i10 = 4;
                    if (iC != 4) {
                        i10 = 5;
                        if (iC != 5) {
                            i10 = iC != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C0821x(i10, c6369e);
    }
}
