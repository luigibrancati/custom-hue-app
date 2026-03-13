package K1;

import G1.AbstractC0853a;

/* JADX INFO: renamed from: K1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C1005k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D1.o f7208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final D1.o f7209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7210d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7211e;

    public C1005k(String str, D1.o oVar, D1.o oVar2, int i10, int i11) {
        AbstractC0853a.a(i10 == 0 || i11 == 0);
        this.f7207a = AbstractC0853a.d(str);
        this.f7208b = (D1.o) AbstractC0853a.e(oVar);
        this.f7209c = (D1.o) AbstractC0853a.e(oVar2);
        this.f7210d = i10;
        this.f7211e = i11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1005k.class == obj.getClass()) {
            C1005k c1005k = (C1005k) obj;
            if (this.f7210d == c1005k.f7210d && this.f7211e == c1005k.f7211e && this.f7207a.equals(c1005k.f7207a) && this.f7208b.equals(c1005k.f7208b) && this.f7209c.equals(c1005k.f7209c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((527 + this.f7210d) * 31) + this.f7211e) * 31) + this.f7207a.hashCode()) * 31) + this.f7208b.hashCode()) * 31) + this.f7209c.hashCode();
    }
}
