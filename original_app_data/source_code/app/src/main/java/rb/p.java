package rb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f43970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f43971b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f43972c;

    public p() {
        this.f43970a = 0.0f;
        this.f43971b = 0.0f;
        this.f43972c = 0.0f;
    }

    public static p a(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        return new p(pVar.f43970a + pVar2.f43970a, pVar.f43971b + pVar2.f43971b, pVar.f43972c + pVar2.f43972c);
    }

    public static p b(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        float f10 = pVar.f43970a;
        float f11 = pVar.f43971b;
        float f12 = pVar.f43972c;
        float f13 = pVar2.f43970a;
        float f14 = pVar2.f43971b;
        float f15 = pVar2.f43972c;
        return new p((f11 * f15) - (f12 * f14), (f12 * f13) - (f15 * f10), (f10 * f14) - (f11 * f13));
    }

    public static float c(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        return (pVar.f43970a * pVar2.f43970a) + (pVar.f43971b * pVar2.f43971b) + (pVar.f43972c * pVar2.f43972c);
    }

    public static boolean d(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        return i.a(pVar.f43972c, pVar2.f43972c) & i.a(pVar.f43970a, pVar2.f43970a) & i.a(pVar.f43971b, pVar2.f43971b);
    }

    public static p e() {
        p pVar = new p();
        pVar.q();
        return pVar;
    }

    public static p h(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        return new p(Math.max(pVar.f43970a, pVar2.f43970a), Math.max(pVar.f43971b, pVar2.f43971b), Math.max(pVar.f43972c, pVar2.f43972c));
    }

    public static p i(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        return new p(Math.min(pVar.f43970a, pVar2.f43970a), Math.min(pVar.f43971b, pVar2.f43971b), Math.min(pVar.f43972c, pVar2.f43972c));
    }

    public static p l() {
        p pVar = new p();
        pVar.r();
        return pVar;
    }

    public static p m() {
        p pVar = new p();
        pVar.s();
        return pVar;
    }

    public static p v(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"lhs\" was null.");
        k.d(pVar2, "Parameter \"rhs\" was null.");
        return new p(pVar.f43970a - pVar2.f43970a, pVar.f43971b - pVar2.f43971b, pVar.f43972c - pVar2.f43972c);
    }

    public static p w() {
        p pVar = new p();
        pVar.t();
        return pVar;
    }

    public static p x() {
        return new p();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return d(this, (p) obj);
    }

    public float f() {
        return (float) Math.sqrt(g());
    }

    public float g() {
        float f10 = this.f43970a;
        float f11 = this.f43971b;
        float f12 = this.f43972c;
        return (f10 * f10) + (f11 * f11) + (f12 * f12);
    }

    public int hashCode() {
        return ((((Float.floatToIntBits(this.f43970a) + 31) * 31) + Float.floatToIntBits(this.f43971b)) * 31) + Float.floatToIntBits(this.f43972c);
    }

    public p j() {
        return new p(-this.f43970a, -this.f43971b, -this.f43972c);
    }

    public p k() {
        p pVar = new p(this);
        float fC = c(this, this);
        if (i.a(fC, 0.0f)) {
            pVar.u();
            return pVar;
        }
        if (fC != 1.0f) {
            pVar.p(n((float) (1.0d / Math.sqrt(fC))));
        }
        return pVar;
    }

    public p n(float f10) {
        return new p(this.f43970a * f10, this.f43971b * f10, this.f43972c * f10);
    }

    public void o(float f10, float f11, float f12) {
        this.f43970a = f10;
        this.f43971b = f11;
        this.f43972c = f12;
    }

    public void p(p pVar) {
        k.d(pVar, "Parameter \"v\" was null.");
        this.f43970a = pVar.f43970a;
        this.f43971b = pVar.f43971b;
        this.f43972c = pVar.f43972c;
    }

    public void q() {
        o(0.0f, 0.0f, -1.0f);
    }

    public void r() {
        o(1.0f, 1.0f, 1.0f);
    }

    public void s() {
        o(1.0f, 0.0f, 0.0f);
    }

    public void t() {
        o(0.0f, 1.0f, 0.0f);
    }

    public String toString() {
        return "[x=" + this.f43970a + ", y=" + this.f43971b + ", z=" + this.f43972c + "]";
    }

    public void u() {
        o(0.0f, 0.0f, 0.0f);
    }

    public p(float f10, float f11, float f12) {
        this.f43970a = f10;
        this.f43971b = f11;
        this.f43972c = f12;
    }

    public p(p pVar) {
        k.d(pVar, "Parameter \"v\" was null.");
        p(pVar);
    }
}
