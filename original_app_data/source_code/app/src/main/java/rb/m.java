package rb;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f43966a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p f43967b = p.e();

    public m() {
    }

    public p a() {
        return new p(this.f43967b);
    }

    public p b() {
        return new p(this.f43966a);
    }

    public p c(float f10) {
        return p.a(this.f43966a, this.f43967b.n(f10));
    }

    public void d(p pVar) {
        k.d(pVar, "Parameter \"direction\" was null.");
        this.f43967b.p(pVar.k());
    }

    public void e(p pVar) {
        k.d(pVar, "Parameter \"origin\" was null.");
        this.f43966a.p(pVar);
    }

    public String toString() {
        return "[Origin:" + this.f43966a + ", Direction:" + this.f43967b + "]";
    }

    public m(p pVar, p pVar2) {
        k.d(pVar, "Parameter \"origin\" was null.");
        k.d(pVar2, "Parameter \"direction\" was null.");
        e(pVar);
        d(pVar2);
    }
}
