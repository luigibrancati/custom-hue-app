package Z7;

import Z7.AbstractC2598h;
import Z7.L;
import Z7.M;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x f20393b = (x) M.a(new M.a() { // from class: Z7.v
        @Override // Z7.M.a
        public final Object get() {
            return x.b();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f20394a = new AtomicReference(new L.b().e());

    public static x b() {
        x xVar = new x();
        xVar.k(AbstractC2598h.a(new AbstractC2598h.b() { // from class: Z7.w
            @Override // Z7.AbstractC2598h.b
            public final K a(P7.g gVar, P7.x xVar2) {
                return ((C2601k) gVar).e(xVar2);
            }
        }, C2601k.class, G.class));
        return xVar;
    }

    public static x c() {
        return f20393b;
    }

    public boolean d(K k10) {
        return ((L) this.f20394a.get()).e(k10);
    }

    public boolean e(K k10) {
        return ((L) this.f20394a.get()).f(k10);
    }

    public P7.g f(K k10, P7.x xVar) {
        return ((L) this.f20394a.get()).g(k10, xVar);
    }

    public P7.g g(G g10, P7.x xVar) {
        return !d(g10) ? new C2601k(g10, xVar) : f(g10, xVar);
    }

    public P7.v h(K k10) {
        return ((L) this.f20394a.get()).h(k10);
    }

    public P7.v i(H h10) {
        return !e(h10) ? new C2602l(h10) : h(h10);
    }

    public synchronized void j(AbstractC2597g abstractC2597g) {
        this.f20394a.set(new L.b((L) this.f20394a.get()).f(abstractC2597g).e());
    }

    public synchronized void k(AbstractC2598h abstractC2598h) {
        this.f20394a.set(new L.b((L) this.f20394a.get()).g(abstractC2598h).e());
    }

    public synchronized void l(z zVar) {
        this.f20394a.set(new L.b((L) this.f20394a.get()).h(zVar).e());
    }

    public synchronized void m(A a10) {
        this.f20394a.set(new L.b((L) this.f20394a.get()).i(a10).e());
    }

    public K n(P7.g gVar, Class cls, P7.x xVar) {
        return ((L) this.f20394a.get()).i(gVar, cls, xVar);
    }

    public K o(P7.v vVar, Class cls) {
        return ((L) this.f20394a.get()).j(vVar, cls);
    }
}
