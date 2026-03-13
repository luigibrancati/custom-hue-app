package Y8;

import android.content.Context;
import b9.C2898a;
import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2898a f19826d = C2898a.e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f19827e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteConfigManager f19828a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public com.google.firebase.perf.util.f f19829b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x f19830c;

    public a(RemoteConfigManager remoteConfigManager, com.google.firebase.perf.util.f fVar, x xVar) {
        this.f19828a = remoteConfigManager == null ? RemoteConfigManager.getInstance() : remoteConfigManager;
        this.f19829b = fVar == null ? new com.google.firebase.perf.util.f() : fVar;
        this.f19830c = xVar == null ? x.e() : xVar;
    }

    public static synchronized a g() {
        try {
            if (f19827e == null) {
                f19827e = new a(null, null, null);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f19827e;
    }

    public long A() {
        o oVarE = o.e();
        com.google.firebase.perf.util.g gVarP = p(oVarE);
        if (gVarP.d() && M(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarW = w(oVarE);
        if (gVarW.d() && M(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(oVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(oVarE);
        return (gVarD.d() && M(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : oVarE.d().longValue();
    }

    public long B() {
        p pVarE = p.e();
        com.google.firebase.perf.util.g gVarP = p(pVarE);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarW = w(pVarE);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(pVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(pVarE);
        return (gVarD.d() && J(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : pVarE.d().longValue();
    }

    public long C() {
        q qVarF = q.f();
        com.google.firebase.perf.util.g gVarP = p(qVarF);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarW = w(qVarF);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(qVarF.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(qVarF);
        return (gVarD.d() && J(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : this.f19828a.isLastFetchFailed() ? qVarF.e().longValue() : qVarF.d().longValue();
    }

    public double D() {
        r rVarF = r.f();
        com.google.firebase.perf.util.g gVarO = o(rVarF);
        if (gVarO.d()) {
            double dDoubleValue = ((Double) gVarO.c()).doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.util.g gVarV = v(rVarF);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f19830c.i(rVarF.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        com.google.firebase.perf.util.g gVarC = c(rVarF);
        return (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) ? ((Double) gVarC.c()).doubleValue() : this.f19828a.isLastFetchFailed() ? rVarF.e().doubleValue() : rVarF.d().doubleValue();
    }

    public long E() {
        s sVarE = s.e();
        com.google.firebase.perf.util.g gVarW = w(sVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(sVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(sVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : sVarE.d().longValue();
    }

    public long F() {
        t tVarE = t.e();
        com.google.firebase.perf.util.g gVarW = w(tVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(tVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(tVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : tVarE.d().longValue();
    }

    public double G() {
        u uVarF = u.f();
        com.google.firebase.perf.util.g gVarV = v(uVarF);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f19830c.i(uVarF.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        com.google.firebase.perf.util.g gVarC = c(uVarF);
        return (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) ? ((Double) gVarC.c()).doubleValue() : this.f19828a.isLastFetchFailed() ? uVarF.e().doubleValue() : uVarF.d().doubleValue();
    }

    public final boolean H(long j10) {
        return j10 >= 0;
    }

    public final boolean I(String str) {
        if (str.trim().isEmpty()) {
            return false;
        }
        for (String str2 : str.split(";")) {
            if (str2.trim().equals(W8.a.f17851b)) {
                return true;
            }
        }
        return false;
    }

    public final boolean J(long j10) {
        return j10 >= 0;
    }

    public boolean K() {
        Boolean boolJ = j();
        return (boolJ == null || boolJ.booleanValue()) && m();
    }

    public final boolean L(double d10) {
        return 0.0d <= d10 && d10 <= 1.0d;
    }

    public final boolean M(long j10) {
        return j10 > 0;
    }

    public final boolean N(long j10) {
        return j10 > 0;
    }

    public void O(Context context) {
        f19826d.i(com.google.firebase.perf.util.o.b(context));
        this.f19830c.h(context);
    }

    public void P(com.google.firebase.perf.util.f fVar) {
        this.f19829b = fVar;
    }

    public String a() {
        String strF;
        f fVarE = f.e();
        if (W8.a.f17850a.booleanValue()) {
            return fVarE.d();
        }
        String strC = fVarE.c();
        long jLongValue = strC != null ? ((Long) this.f19828a.getRemoteConfigValueOrDefault(strC, -1L)).longValue() : -1L;
        String strA = fVarE.a();
        if (!f.g(jLongValue) || (strF = f.f(jLongValue)) == null) {
            com.google.firebase.perf.util.g gVarE = e(fVarE);
            return gVarE.d() ? (String) gVarE.c() : fVarE.d();
        }
        this.f19830c.k(strA, strF);
        return strF;
    }

    public final com.google.firebase.perf.util.g b(v vVar) {
        return this.f19830c.b(vVar.a());
    }

    public final com.google.firebase.perf.util.g c(v vVar) {
        return this.f19830c.c(vVar.a());
    }

    public final com.google.firebase.perf.util.g d(v vVar) {
        return this.f19830c.f(vVar.a());
    }

    public final com.google.firebase.perf.util.g e(v vVar) {
        return this.f19830c.g(vVar.a());
    }

    public double f() {
        e eVarE = e.e();
        com.google.firebase.perf.util.g gVarO = o(eVarE);
        if (gVarO.d()) {
            double dDoubleValue = ((Double) gVarO.c()).doubleValue() / 100.0d;
            if (L(dDoubleValue)) {
                return dDoubleValue;
            }
        }
        com.google.firebase.perf.util.g gVarV = v(eVarE);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f19830c.i(eVarE.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        com.google.firebase.perf.util.g gVarC = c(eVarE);
        return (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) ? ((Double) gVarC.c()).doubleValue() : eVarE.d().doubleValue();
    }

    public boolean h() {
        d dVarE = d.e();
        com.google.firebase.perf.util.g gVarN = n(dVarE);
        return gVarN.d() ? ((Boolean) gVarN.c()).booleanValue() : dVarE.d().booleanValue();
    }

    public Boolean i() {
        b bVarE = b.e();
        com.google.firebase.perf.util.g gVarN = n(bVarE);
        return gVarN.d() ? (Boolean) gVarN.c() : bVarE.d();
    }

    public Boolean j() {
        if (i().booleanValue()) {
            return Boolean.FALSE;
        }
        c cVarD = c.d();
        com.google.firebase.perf.util.g gVarB = b(cVarD);
        if (gVarB.d()) {
            return (Boolean) gVarB.c();
        }
        com.google.firebase.perf.util.g gVarN = n(cVarD);
        if (gVarN.d()) {
            return (Boolean) gVarN.c();
        }
        return null;
    }

    public final boolean k() {
        l lVarE = l.e();
        com.google.firebase.perf.util.g gVarB = b(lVarE);
        com.google.firebase.perf.util.g gVarU = u(lVarE);
        if (!gVarU.d()) {
            return gVarB.d() ? ((Boolean) gVarB.c()).booleanValue() : lVarE.d().booleanValue();
        }
        if (this.f19828a.isLastFetchFailed()) {
            return false;
        }
        Boolean bool = (Boolean) gVarU.c();
        if (gVarB == null || !gVarB.d() || gVarB.c() != bool) {
            this.f19830c.l(lVarE.a(), bool.booleanValue());
        }
        return bool.booleanValue();
    }

    public final boolean l() {
        k kVarE = k.e();
        com.google.firebase.perf.util.g gVarE = e(kVarE);
        com.google.firebase.perf.util.g gVarX = x(kVarE);
        if (!gVarX.d()) {
            return gVarE.d() ? I((String) gVarE.c()) : I(kVarE.d());
        }
        String str = (String) gVarX.c();
        if (gVarE == null || !gVarE.d() || !((String) gVarE.c()).equals(str)) {
            this.f19830c.k(kVarE.a(), str);
        }
        return I(str);
    }

    public boolean m() {
        return k() && !l();
    }

    public final com.google.firebase.perf.util.g n(v vVar) {
        return this.f19829b.b(vVar.b());
    }

    public final com.google.firebase.perf.util.g o(v vVar) {
        return this.f19829b.c(vVar.b());
    }

    public final com.google.firebase.perf.util.g p(v vVar) {
        return this.f19829b.e(vVar.b());
    }

    public long q() {
        g gVarE = g.e();
        com.google.firebase.perf.util.g gVarW = w(gVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(gVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(gVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : gVarE.d().longValue();
    }

    public long r() {
        h hVarE = h.e();
        com.google.firebase.perf.util.g gVarW = w(hVarE);
        if (gVarW.d() && H(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(hVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(hVarE);
        return (gVarD.d() && H(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : hVarE.d().longValue();
    }

    public double s() {
        i iVarF = i.f();
        com.google.firebase.perf.util.g gVarV = v(iVarF);
        if (gVarV.d() && L(((Double) gVarV.c()).doubleValue())) {
            this.f19830c.i(iVarF.a(), ((Double) gVarV.c()).doubleValue());
            return ((Double) gVarV.c()).doubleValue();
        }
        com.google.firebase.perf.util.g gVarC = c(iVarF);
        return (gVarC.d() && L(((Double) gVarC.c()).doubleValue())) ? ((Double) gVarC.c()).doubleValue() : this.f19828a.isLastFetchFailed() ? iVarF.e().doubleValue() : iVarF.d().doubleValue();
    }

    public long t() {
        j jVarE = j.e();
        com.google.firebase.perf.util.g gVarW = w(jVarE);
        if (gVarW.d() && N(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(jVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(jVarE);
        return (gVarD.d() && N(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : jVarE.d().longValue();
    }

    public final com.google.firebase.perf.util.g u(v vVar) {
        return this.f19828a.getBoolean(vVar.c());
    }

    public final com.google.firebase.perf.util.g v(v vVar) {
        return this.f19828a.getDouble(vVar.c());
    }

    public final com.google.firebase.perf.util.g w(v vVar) {
        return this.f19828a.getLong(vVar.c());
    }

    public final com.google.firebase.perf.util.g x(v vVar) {
        return this.f19828a.getString(vVar.c());
    }

    public long y() {
        m mVarE = m.e();
        com.google.firebase.perf.util.g gVarP = p(mVarE);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarW = w(mVarE);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(mVarE.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(mVarE);
        return (gVarD.d() && J(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : mVarE.d().longValue();
    }

    public long z() {
        n nVarF = n.f();
        com.google.firebase.perf.util.g gVarP = p(nVarF);
        if (gVarP.d() && J(((Long) gVarP.c()).longValue())) {
            return ((Long) gVarP.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarW = w(nVarF);
        if (gVarW.d() && J(((Long) gVarW.c()).longValue())) {
            this.f19830c.j(nVarF.a(), ((Long) gVarW.c()).longValue());
            return ((Long) gVarW.c()).longValue();
        }
        com.google.firebase.perf.util.g gVarD = d(nVarF);
        return (gVarD.d() && J(((Long) gVarD.c()).longValue())) ? ((Long) gVarD.c()).longValue() : this.f19828a.isLastFetchFailed() ? nVarF.e().longValue() : nVarF.d().longValue();
    }
}
