package Cd;

import org.apache.tika.utils.StringUtils;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j0 implements i0 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return a() == i0Var.a() && b() == i0Var.b() && getType().equals(i0Var.getType());
    }

    public int hashCode() {
        int iHashCode = b().hashCode();
        if (q0.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (a() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (a()) {
            return "*";
        }
        if (b() == u0.INVARIANT) {
            return getType().toString();
        }
        return b() + StringUtils.SPACE + getType();
    }
}
