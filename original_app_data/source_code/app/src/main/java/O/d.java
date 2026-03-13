package O;

import B0.c;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import s.InterfaceC5702a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public class d implements O7.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O7.e f10700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c.a f10701b;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public class a implements c.InterfaceC0018c {
        public a() {
        }

        @Override // B0.c.InterfaceC0018c
        public Object a(c.a aVar) {
            X0.h.j(d.this.f10701b == null, "The result can only set once!");
            d.this.f10701b = aVar;
            return "FutureChain[" + d.this + "]";
        }
    }

    public d(O7.e eVar) {
        this.f10700a = (O7.e) X0.h.g(eVar);
    }

    public static d c(O7.e eVar) {
        return eVar instanceof d ? (d) eVar : new d(eVar);
    }

    @Override // O7.e
    public void b(Runnable runnable, Executor executor) {
        this.f10700a.b(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f10700a.cancel(z10);
    }

    public boolean d(Object obj) {
        c.a aVar = this.f10701b;
        if (aVar != null) {
            return aVar.c(obj);
        }
        return false;
    }

    public boolean e(Throwable th) {
        c.a aVar = this.f10701b;
        if (aVar != null) {
            return aVar.f(th);
        }
        return false;
    }

    public final d f(InterfaceC5702a interfaceC5702a, Executor executor) {
        return (d) n.x(this, interfaceC5702a, executor);
    }

    public final d g(O.a aVar, Executor executor) {
        return (d) n.y(this, aVar, executor);
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f10700a.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f10700a.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.f10700a.isDone();
    }

    @Override // java.util.concurrent.Future
    public Object get(long j10, TimeUnit timeUnit) {
        return this.f10700a.get(j10, timeUnit);
    }

    public d() {
        this.f10700a = B0.c.a(new a());
    }
}
