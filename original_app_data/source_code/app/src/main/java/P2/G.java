package P2;

import D1.o;
import G1.AbstractC0853a;
import H1.j;
import P2.L;
import i2.AbstractC4326f;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12713a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12714b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.O[] f12715c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H1.j f12716d = new H1.j(new j.b() { // from class: P2.F
        @Override // H1.j.b
        public final void a(long j10, G1.C c10) {
            AbstractC4326f.a(j10, c10, this.f12712a.f12715c);
        }
    });

    public G(List list, String str) {
        this.f12713a = list;
        this.f12714b = str;
        this.f12715c = new i2.O[list.size()];
    }

    public void b() {
        this.f12716d.d();
    }

    public void c(long j10, G1.C c10) {
        this.f12716d.a(j10, c10);
    }

    public void d(i2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f12715c.length; i10++) {
            dVar.a();
            i2.O oF = rVar.f(dVar.c(), 3);
            D1.o oVar = (D1.o) this.f12713a.get(i10);
            String str = oVar.f1805o;
            AbstractC0853a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            String strB = oVar.f1791a;
            if (strB == null) {
                strB = dVar.b();
            }
            oF.e(new o.b().j0(strB).W(this.f12714b).y0(str).A0(oVar.f1795e).n0(oVar.f1794d).Q(oVar.f1785L).k0(oVar.f1808r).P());
            this.f12715c[i10] = oF;
        }
    }

    public void e() {
        this.f12716d.d();
    }

    public void f(int i10) {
        this.f12716d.g(i10);
    }
}
