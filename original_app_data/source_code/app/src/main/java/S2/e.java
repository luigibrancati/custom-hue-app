package S2;

import S2.j;
import gc.C4206t;
import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f15275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f15276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f15277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f15278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f15281g;

    public e(g initialInfo, boolean z10, boolean z11) {
        AbstractC4862t.e(initialInfo, "initialInfo");
        this.f15275a = initialInfo;
        this.f15276b = C4206t.k();
        this.f15277c = C4206t.k();
        this.f15278d = j.b.f15302b;
        this.f15279e = z10;
        this.f15280f = z11;
    }

    public final void a() {
        this.f15278d = j.b.f15302b;
        o();
    }

    public final void b() {
        this.f15278d = j.b.f15302b;
        p();
    }

    public final void c(b event) {
        AbstractC4862t.e(event, "event");
        this.f15278d = new j.c(event, -1);
        q(event);
    }

    public final void d(b event) {
        AbstractC4862t.e(event, "event");
        this.f15278d = new j.c(event, -1);
        r(event);
    }

    public final void e() {
        this.f15278d = j.b.f15302b;
        s();
    }

    public final void f() {
        this.f15278d = j.b.f15302b;
        t();
    }

    public final void g(b event) {
        AbstractC4862t.e(event, "event");
        this.f15278d = new j.c(event, 1);
        u(event);
    }

    public final void h(b event) {
        AbstractC4862t.e(event, "event");
        this.f15278d = new j.c(event, 1);
        v(event);
    }

    public final List i() {
        return this.f15276b;
    }

    public final g j() {
        return this.f15275a;
    }

    public final c k() {
        return this.f15281g;
    }

    public final List l() {
        return this.f15277c;
    }

    public final boolean m() {
        c cVar = this.f15281g;
        if (cVar == null || cVar.l()) {
            return this.f15279e;
        }
        return false;
    }

    public final boolean n() {
        c cVar = this.f15281g;
        if (cVar == null || cVar.l()) {
            return this.f15280f;
        }
        return false;
    }

    public abstract void o();

    public abstract void p();

    public abstract void q(b bVar);

    public abstract void r(b bVar);

    public void t() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    public void u(b event) {
        AbstractC4862t.e(event, "event");
    }

    public void v(b event) {
        AbstractC4862t.e(event, "event");
    }

    public final void w() {
        c cVar = this.f15281g;
        if (cVar != null) {
            cVar.m(this);
        }
    }

    public final void x(boolean z10) {
        i iVarJ;
        if (this.f15279e == z10) {
            return;
        }
        this.f15279e = z10;
        c cVar = this.f15281g;
        if (cVar == null || (iVarJ = cVar.j()) == null) {
            return;
        }
        iVarJ.g();
    }

    public final void y(c cVar) {
        this.f15281g = cVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public e(g initialInfo, boolean z10) {
        this(initialInfo, z10, false);
        AbstractC4862t.e(initialInfo, "initialInfo");
    }

    public void s() {
    }
}
