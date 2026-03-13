package H1;

import D1.u;
import G1.AbstractC0853a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e implements u.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f5127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f5128b;

    public e(float f10, float f11) {
        AbstractC0853a.b(f10 >= -90.0f && f10 <= 90.0f && f11 >= -180.0f && f11 <= 180.0f, "Invalid latitude or longitude");
        this.f5127a = f10;
        this.f5128b = f11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e.class == obj.getClass()) {
            e eVar = (e) obj;
            if (this.f5127a == eVar.f5127a && this.f5128b == eVar.f5128b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + N7.d.a(this.f5127a)) * 31) + N7.d.a(this.f5128b);
    }

    public String toString() {
        return "xyz: latitude=" + this.f5127a + ", longitude=" + this.f5128b;
    }
}
