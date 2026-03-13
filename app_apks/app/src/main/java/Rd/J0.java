package Rd;

import Wd.AbstractC2333m;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class J0 extends I {
    @Override // Rd.I
    public I C0(int i10, String str) {
        AbstractC2333m.a(i10);
        return AbstractC2333m.b(this, str);
    }

    public abstract J0 J0();

    public final String M0() {
        J0 J02;
        J0 j0C = C2123d0.c();
        if (this == j0C) {
            return "Dispatchers.Main";
        }
        try {
            J02 = j0C.J0();
        } catch (UnsupportedOperationException unused) {
            J02 = null;
        }
        if (this == J02) {
            return "Dispatchers.Main.immediate";
        }
        return null;
    }

    @Override // Rd.I
    public String toString() {
        String strM0 = M0();
        if (strM0 != null) {
            return strM0;
        }
        return Q.a(this) + '@' + Q.b(this);
    }
}
