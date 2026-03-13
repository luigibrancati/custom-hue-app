package E;

import E.J0;

/* JADX INFO: renamed from: E.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C0794j extends J0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f2997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J0 f2998b;

    public C0794j(int i10, J0 j02) {
        this.f2997a = i10;
        if (j02 == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f2998b = j02;
    }

    @Override // E.J0.b
    public int a() {
        return this.f2997a;
    }

    @Override // E.J0.b
    public J0 b() {
        return this.f2998b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof J0.b) {
            J0.b bVar = (J0.b) obj;
            if (this.f2997a == bVar.a() && this.f2998b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f2998b.hashCode() ^ ((this.f2997a ^ 1000003) * 1000003);
    }

    public String toString() {
        return "Event{eventCode=" + this.f2997a + ", surfaceOutput=" + this.f2998b + "}";
    }
}
