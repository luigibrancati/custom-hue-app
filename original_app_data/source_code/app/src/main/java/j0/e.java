package j0;

import kotlin.jvm.internal.AbstractC4854k;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f38868e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38869f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f38870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f38872c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f38873d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public final e a() {
            return (e) m.f38898c.a();
        }

        public final e b(e eVar) {
            if (eVar instanceof p) {
                p pVar = (p) eVar;
                if (pVar.l() == i0.h.a()) {
                    pVar.m(null);
                    return eVar;
                }
            }
            if (eVar instanceof q) {
                q qVar = (q) eVar;
                if (qVar.k() == i0.h.a()) {
                    qVar.l(null);
                    return eVar;
                }
            }
            e eVarI = m.i(eVar, null, false, 6, null);
            eVarI.e();
            return eVarI;
        }

        public final void c(e eVar, e eVar2, vc.l lVar) {
            if (eVar != eVar2) {
                eVar2.g(eVar);
                eVar2.a();
            } else if (eVar instanceof p) {
                ((p) eVar).m(lVar);
            } else {
                if (eVar instanceof q) {
                    ((q) eVar).l(lVar);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + eVar).toString());
            }
        }

        public a() {
        }
    }

    public /* synthetic */ e(long j10, h hVar, AbstractC4854k abstractC4854k) {
        this(j10, hVar);
    }

    public abstract void a();

    public h b() {
        return this.f38870a;
    }

    public abstract vc.l c();

    public long d() {
        return this.f38871b;
    }

    public e e() {
        e eVar = (e) m.f38898c.a();
        m.f38898c.b(this);
        return eVar;
    }

    public final void f() {
        int i10 = this.f38873d;
        if (i10 >= 0) {
            m.p(i10);
            this.f38873d = -1;
        }
    }

    public void g(e eVar) {
        m.f38898c.b(eVar);
    }

    public final void h(boolean z10) {
        this.f38872c = z10;
    }

    public e(long j10, h hVar) {
        this.f38870a = hVar;
        this.f38871b = j10;
        this.f38873d = j10 != m.f38897b ? m.q(j10, b()) : -1;
    }
}
