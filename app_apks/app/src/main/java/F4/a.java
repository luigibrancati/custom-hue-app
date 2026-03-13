package F4;

import F4.f;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public D4.a f3716c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f.a f3714a = f.a.Destination;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f3715b = new h();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f3717d = true;

    @Override // F4.f
    public void a(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f3716c = aVar;
    }

    @Override // F4.f
    public void e(D4.a amplitude) {
        AbstractC4862t.e(amplitude, "amplitude");
        super.e(amplitude);
        this.f3715b.g(amplitude);
    }

    @Override // F4.f
    public final E4.a g(E4.a event) {
        AbstractC4862t.e(event, "event");
        return null;
    }

    @Override // F4.f
    public f.a getType() {
        return this.f3714a;
    }

    public final void h(f plugin) {
        AbstractC4862t.e(plugin, "plugin");
        plugin.a(i());
        this.f3715b.a(plugin);
    }

    public D4.a i() {
        D4.a aVar = this.f3716c;
        if (aVar != null) {
            return aVar;
        }
        AbstractC4862t.p("amplitude");
        return null;
    }

    public final E4.a j(E4.a aVar) {
        if (!this.f3717d) {
            return null;
        }
        E4.a aVarD = this.f3715b.d(f.a.Enrichment, this.f3715b.d(f.a.Before, aVar));
        if (aVarD != null) {
            return aVarD instanceof E4.d ? c((E4.d) aVarD) : aVarD instanceof E4.c ? f((E4.c) aVarD) : aVarD instanceof E4.h ? d((E4.h) aVarD) : b(aVarD);
        }
        return null;
    }
}
