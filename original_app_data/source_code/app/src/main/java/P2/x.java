package P2;

import D1.o;
import G1.AbstractC0853a;
import P2.L;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x implements D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public D1.o f13084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public G1.H f13085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i2.O f13086c;

    public x(String str, String str2) {
        this.f13084a = new o.b().W(str2).y0(str).P();
    }

    @Override // P2.D
    public void a(G1.C c10) {
        b();
        long jE = this.f13085b.e();
        long jF = this.f13085b.f();
        if (jE == -9223372036854775807L || jF == -9223372036854775807L) {
            return;
        }
        D1.o oVar = this.f13084a;
        if (jF != oVar.f1810t) {
            D1.o oVarP = oVar.b().C0(jF).P();
            this.f13084a = oVarP;
            this.f13086c.e(oVarP);
        }
        int iA = c10.a();
        this.f13086c.b(c10, iA);
        this.f13086c.d(jE, 1, iA, 0, null);
    }

    public final void b() {
        AbstractC0853a.i(this.f13085b);
        G1.M.i(this.f13086c);
    }

    @Override // P2.D
    public void c(G1.H h10, i2.r rVar, L.d dVar) {
        this.f13085b = h10;
        dVar.a();
        i2.O oF = rVar.f(dVar.c(), 5);
        this.f13086c = oF;
        oF.e(this.f13084a);
    }
}
