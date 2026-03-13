package S2;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC4854k;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f15266i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f15267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f15268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i f15271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f15272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f15273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f15274h;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a {
        public /* synthetic */ a(AbstractC4854k abstractC4854k) {
            this();
        }

        public a() {
        }
    }

    public c(c cVar, l lVar) {
        i iVar;
        this.f15267a = cVar;
        this.f15268b = lVar;
        this.f15270d = true;
        this.f15271e = (cVar == null || (iVar = cVar.f15271e) == null) ? new i() : iVar;
        this.f15272f = new LinkedHashSet();
        this.f15273g = new LinkedHashSet();
        this.f15274h = new LinkedHashSet();
        c cVar2 = this.f15267a;
        if (cVar2 != null) {
            cVar2.f15272f.add(this);
        }
    }

    public static /* synthetic */ void b(c cVar, e eVar, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 1;
        }
        cVar.a(eVar, i10);
    }

    public final void a(e handler, int i10) {
        AbstractC4862t.e(handler, "handler");
        e();
        if (this.f15273g.add(handler)) {
            this.f15271e.a(this, handler, i10);
        }
    }

    public final void c(h input) {
        AbstractC4862t.e(input, "input");
        e();
        if (this.f15274h.add(input)) {
            this.f15271e.b(this, input, -1);
        }
    }

    public final void d(h input, int i10) {
        AbstractC4862t.e(input, "input");
        e();
        if (i10 == 1 || i10 == 0) {
            if (this.f15274h.add(input)) {
                this.f15271e.b(this, input, i10);
            }
        } else {
            throw new IllegalArgumentException(("Unsupported priority value: " + i10).toString());
        }
    }

    public final void e() {
        if (k()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    public final void f(h input, int i10) {
        AbstractC4862t.e(input, "input");
        e();
        if (l()) {
            this.f15271e.c(input, i10);
        }
    }

    public final void g(h input, int i10) {
        AbstractC4862t.e(input, "input");
        e();
        if (l()) {
            this.f15271e.d(input, i10, this.f15268b);
        }
    }

    public final void h(h input, int i10, b event) {
        AbstractC4862t.e(input, "input");
        AbstractC4862t.e(event, "event");
        e();
        if (l()) {
            this.f15271e.e(input, i10, event);
        }
    }

    public final void i(h input, int i10, b bVar) {
        AbstractC4862t.e(input, "input");
        e();
        if (l()) {
            this.f15271e.f(input, i10, bVar);
        }
    }

    public final i j() {
        return this.f15271e;
    }

    public final boolean k() {
        c cVar = this.f15267a;
        if (cVar == null || !cVar.k()) {
            return this.f15269c;
        }
        return true;
    }

    public final boolean l() {
        c cVar = this.f15267a;
        if (cVar == null || cVar.l()) {
            return this.f15270d;
        }
        return false;
    }

    public final void m(e handler) {
        AbstractC4862t.e(handler, "handler");
        if (this.f15273g.remove(handler)) {
            this.f15271e.h(handler);
        }
    }

    public c() {
        this(null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(l onBackCompletedFallback) {
        this(null, onBackCompletedFallback);
        AbstractC4862t.e(onBackCompletedFallback, "onBackCompletedFallback");
    }
}
