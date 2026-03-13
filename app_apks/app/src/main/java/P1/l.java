package P1;

import D1.r;
import G1.AbstractC0853a;
import I1.f;
import I1.l;
import K7.Y;
import P1.C1837h;
import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12649a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public r.f f12650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public u f12651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public f.a f12652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e2.k f12654f;

    @Override // P1.w
    public u a(D1.r rVar) {
        u uVar;
        AbstractC0853a.e(rVar.f1873b);
        r.f fVar = rVar.f1873b.f1970c;
        if (fVar == null) {
            return u.f12675a;
        }
        synchronized (this.f12649a) {
            try {
                if (!fVar.equals(this.f12650b)) {
                    this.f12650b = fVar;
                    this.f12651c = b(fVar);
                }
                uVar = (u) AbstractC0853a.e(this.f12651c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return uVar;
    }

    public final u b(r.f fVar) {
        f.a aVarE = this.f12652d;
        if (aVarE == null) {
            aVarE = new l.b().e(this.f12653e);
        }
        Uri uri = fVar.f1927c;
        F f10 = new F(uri == null ? null : uri.toString(), fVar.f1932h, aVarE);
        Y it = fVar.f1929e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            f10.c((String) entry.getKey(), (String) entry.getValue());
        }
        C1837h.b bVarE = new C1837h.b().f(fVar.f1925a, E.f12555d).c(fVar.f1930f).d(fVar.f1931g).e(N7.g.o(fVar.f1934j));
        e2.k kVar = this.f12654f;
        if (kVar != null) {
            bVarE.b(kVar);
        }
        C1837h c1837hA = bVarE.a(f10);
        c1837hA.F(0, fVar.c());
        return c1837hA;
    }
}
