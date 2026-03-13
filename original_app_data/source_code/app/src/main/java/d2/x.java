package d2;

import D1.C0744b;
import D1.D;
import G1.AbstractC0853a;
import K1.e1;
import K1.f1;
import a2.InterfaceC2611D;
import a2.n0;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f32977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e2.d f32978b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public interface a {
        void a(e1 e1Var);

        void b();
    }

    public final e2.d b() {
        return (e2.d) AbstractC0853a.i(this.f32978b);
    }

    public f1.a c() {
        return null;
    }

    public void d(a aVar, e2.d dVar) {
        AbstractC0853a.g(this.f32977a == null);
        this.f32977a = aVar;
        this.f32978b = dVar;
    }

    public final void e() {
        a aVar = this.f32977a;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final void f(e1 e1Var) {
        a aVar = this.f32977a;
        if (aVar != null) {
            aVar.a(e1Var);
        }
    }

    public boolean g() {
        return false;
    }

    public abstract void h(Object obj);

    public void i() {
        this.f32977a = null;
        this.f32978b = null;
    }

    public abstract y j(f1[] f1VarArr, n0 n0Var, InterfaceC2611D.b bVar, D d10);

    public void k(C0744b c0744b) {
    }
}
