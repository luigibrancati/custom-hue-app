package rb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f43962a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f43963b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f43964c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f43965d = 1.0f;

    public static float a(l lVar, l lVar2) {
        k.d(lVar, "Parameter \"lhs\" was null.");
        k.d(lVar2, "Parameter \"rhs\" was null.");
        return (lVar.f43962a * lVar2.f43962a) + (lVar.f43963b * lVar2.f43963b) + (lVar.f43964c * lVar2.f43964c) + (lVar.f43965d * lVar2.f43965d);
    }

    public static boolean b(l lVar, l lVar2) {
        k.d(lVar, "Parameter \"lhs\" was null.");
        k.d(lVar2, "Parameter \"rhs\" was null.");
        return i.a(a(lVar, lVar2), 1.0f);
    }

    public boolean c() {
        float fA = a(this, this);
        if (i.a(fA, 0.0f)) {
            d();
            return false;
        }
        if (fA == 1.0f) {
            return true;
        }
        float fSqrt = (float) (1.0d / Math.sqrt(fA));
        this.f43962a *= fSqrt;
        this.f43963b *= fSqrt;
        this.f43964c *= fSqrt;
        this.f43965d *= fSqrt;
        return true;
    }

    public void d() {
        this.f43962a = 0.0f;
        this.f43963b = 0.0f;
        this.f43964c = 0.0f;
        this.f43965d = 1.0f;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return b(this, (l) obj);
    }

    public int hashCode() {
        return ((((((Float.floatToIntBits(this.f43965d) + 31) * 31) + Float.floatToIntBits(this.f43962a)) * 31) + Float.floatToIntBits(this.f43963b)) * 31) + Float.floatToIntBits(this.f43964c);
    }

    public String toString() {
        return "[x=" + this.f43962a + ", y=" + this.f43963b + ", z=" + this.f43964c + ", w=" + this.f43965d + "]";
    }
}
