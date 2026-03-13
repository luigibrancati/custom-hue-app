package F4;

import F4.f;
import fc.AbstractC4040w;
import gc.Q;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC4862t;
import vc.l;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public D4.a f3754b;

    public h() {
        int i10 = 1;
        this.f3753a = Q.l(AbstractC4040w.a(f.a.Before, new d(null, i10, 0 == true ? 1 : 0)), AbstractC4040w.a(f.a.Enrichment, new d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), AbstractC4040w.a(f.a.Destination, new d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)), AbstractC4040w.a(f.a.Utility, new d(0 == true ? 1 : 0, i10, 0 == true ? 1 : 0)));
    }

    public final void a(f plugin) {
        AbstractC4862t.e(plugin, "plugin");
        plugin.e(e());
        d dVar = (d) this.f3753a.get(plugin.getType());
        if (dVar != null) {
            dVar.a(plugin);
        }
    }

    public final void b(l closure) {
        AbstractC4862t.e(closure, "closure");
        Iterator it = this.f3753a.entrySet().iterator();
        while (it.hasNext()) {
            ((d) ((Map.Entry) it.next()).getValue()).b(closure);
        }
    }

    public final E4.a c(d dVar, E4.a aVar) {
        if (aVar == null) {
            return aVar;
        }
        if (dVar != null) {
            return dVar.c(aVar);
        }
        return null;
    }

    public final E4.a d(f.a type, E4.a aVar) {
        AbstractC4862t.e(type, "type");
        return c((d) this.f3753a.get(type), aVar);
    }

    public final D4.a e() {
        D4.a aVar = this.f3754b;
        if (aVar != null) {
            return aVar;
        }
        AbstractC4862t.p("amplitude");
        return null;
    }

    public void f(E4.a incomingEvent) {
        AbstractC4862t.e(incomingEvent, "incomingEvent");
        if (e().l().p()) {
            return;
        }
        d(f.a.Destination, d(f.a.Enrichment, d(f.a.Before, incomingEvent)));
    }

    public final void g(D4.a aVar) {
        AbstractC4862t.e(aVar, "<set-?>");
        this.f3754b = aVar;
    }
}
