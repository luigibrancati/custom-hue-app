package J4;

import D4.f;
import Rd.I;
import Rd.M;
import fc.C4015H;
import gc.C4179C;
import gc.C4205s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l implements D4.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6226a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f6227b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f6228c = new ConcurrentHashMap();

    @Override // D4.f
    public List a() {
        List listV0;
        synchronized (this.f6227b) {
            listV0 = C4179C.V0(this.f6226a);
            this.f6226a.clear();
            C4015H c4015h = C4015H.f34254a;
        }
        return C4205s.d(listV0);
    }

    @Override // D4.f
    public Object b(Object obj, InterfaceC4988e interfaceC4988e) {
        o oVar = o.f6229a;
        AbstractC4862t.c(obj, "null cannot be cast to non-null type kotlin.collections.List<com.amplitude.core.events.BaseEvent>");
        return oVar.c((List) obj);
    }

    @Override // D4.f
    public Object c(InterfaceC4988e interfaceC4988e) {
        return C4015H.f34254a;
    }

    @Override // D4.f
    public K4.i d(F4.b eventPipeline, D4.b configuration, M scope, I storageDispatcher) {
        AbstractC4862t.e(eventPipeline, "eventPipeline");
        AbstractC4862t.e(configuration, "configuration");
        AbstractC4862t.e(scope, "scope");
        AbstractC4862t.e(storageDispatcher, "storageDispatcher");
        return new k(eventPipeline, configuration, scope, storageDispatcher);
    }

    public final void e() {
        synchronized (this.f6227b) {
            this.f6226a.clear();
            C4015H c4015h = C4015H.f34254a;
        }
    }

    @Override // D4.f
    public String i(f.a key) {
        AbstractC4862t.e(key, "key");
        return (String) this.f6228c.get(key.b());
    }

    @Override // D4.f
    public Object k(f.a aVar, String str, InterfaceC4988e interfaceC4988e) {
        this.f6228c.put(aVar.b(), str);
        return C4015H.f34254a;
    }

    @Override // D4.f
    public Object l(E4.a aVar, InterfaceC4988e interfaceC4988e) {
        synchronized (this.f6227b) {
            this.f6226a.add(aVar);
        }
        return C4015H.f34254a;
    }
}
