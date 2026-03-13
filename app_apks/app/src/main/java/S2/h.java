package S2;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15285b;

    public final void a() {
        c cVar = this.f15284a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f15285b) {
            cVar.i(this, -1, null);
        }
        cVar.f(this, -1);
        this.f15285b = false;
    }

    public final void b() {
        c cVar = this.f15284a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f15285b) {
            cVar.i(this, -1, null);
        }
        cVar.g(this, -1);
        this.f15285b = false;
    }

    public final void c(b event) {
        AbstractC4862t.e(event, "event");
        c cVar = this.f15284a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.f15285b) {
            cVar.h(this, -1, event);
        }
    }

    public final void d(b event) {
        AbstractC4862t.e(event, "event");
        c cVar = this.f15284a;
        if (cVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (this.f15285b) {
            return;
        }
        cVar.i(this, -1, event);
        this.f15285b = true;
    }

    public final void e(c dispatcher) {
        AbstractC4862t.e(dispatcher, "dispatcher");
        i(dispatcher);
    }

    public final void f(boolean z10) {
        j(z10);
    }

    public final void g(f history) {
        AbstractC4862t.e(history, "history");
        k(history);
    }

    public final c h() {
        return this.f15284a;
    }

    public void i(c dispatcher) {
        AbstractC4862t.e(dispatcher, "dispatcher");
    }

    public void k(f history) {
        AbstractC4862t.e(history, "history");
    }

    public final void l(c cVar) {
        this.f15284a = cVar;
    }

    public void j(boolean z10) {
    }
}
