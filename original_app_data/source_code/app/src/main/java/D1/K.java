package D1;

import G1.M;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class K {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final K f1618e = new K(0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f1619f = M.z0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f1620g = M.z0(1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f1621h = M.z0(3);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f1623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f1625d;

    public K(int i10, int i11) {
        this(i10, i11, 1.0f);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof K) {
            K k10 = (K) obj;
            if (this.f1622a == k10.f1622a && this.f1623b == k10.f1623b && this.f1625d == k10.f1625d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((217 + this.f1622a) * 31) + this.f1623b) * 31) + Float.floatToRawIntBits(this.f1625d);
    }

    public K(int i10, int i11, float f10) {
        this.f1622a = i10;
        this.f1623b = i11;
        this.f1624c = 0;
        this.f1625d = f10;
    }
}
