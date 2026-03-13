package P2;

import D1.o;
import G1.AbstractC0853a;
import H1.j;
import P2.L;
import i2.AbstractC4326f;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f12773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f12774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i2.O[] f12775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H1.j f12776d;

    public O(List list, String str) {
        this.f12773a = list;
        this.f12774b = str;
        this.f12775c = new i2.O[list.size()];
        H1.j jVar = new H1.j(new j.b() { // from class: P2.N
            @Override // H1.j.b
            public final void a(long j10, G1.C c10) {
                AbstractC4326f.b(j10, c10, this.f12772a.f12775c);
            }
        });
        this.f12776d = jVar;
        jVar.g(3);
    }

    public void b(long j10, G1.C c10) {
        if (c10.a() < 9) {
            return;
        }
        int iU = c10.u();
        int iU2 = c10.u();
        int iL = c10.L();
        if (iU == 434 && iU2 == 1195456820 && iL == 3) {
            this.f12776d.a(j10, c10);
        }
    }

    public void c(i2.r rVar, L.d dVar) {
        for (int i10 = 0; i10 < this.f12775c.length; i10++) {
            dVar.a();
            i2.O oF = rVar.f(dVar.c(), 3);
            D1.o oVar = (D1.o) this.f12773a.get(i10);
            String str = oVar.f1805o;
            AbstractC0853a.b("application/cea-608".equals(str) || "application/cea-708".equals(str), "Invalid closed caption MIME type provided: " + str);
            oF.e(new o.b().j0(dVar.b()).W(this.f12774b).y0(str).A0(oVar.f1795e).n0(oVar.f1794d).Q(oVar.f1785L).k0(oVar.f1808r).P());
            this.f12775c[i10] = oF;
        }
    }
}
