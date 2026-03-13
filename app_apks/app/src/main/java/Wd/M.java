package Wd;

import Rd.V0;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4993j;
import lc.InterfaceC4992i;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class M implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f17907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ThreadLocal f17908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC4992i.c f17909c;

    public M(Object obj, ThreadLocal threadLocal) {
        this.f17907a = obj;
        this.f17908b = threadLocal;
        this.f17909c = new N(threadLocal);
    }

    @Override // Rd.V0
    public void Y(InterfaceC4992i interfaceC4992i, Object obj) {
        this.f17908b.set(obj);
    }

    @Override // lc.InterfaceC4992i
    public Object fold(Object obj, vc.p pVar) {
        return V0.a.a(this, obj, pVar);
    }

    @Override // lc.InterfaceC4992i.b, lc.InterfaceC4992i
    public InterfaceC4992i.b get(InterfaceC4992i.c cVar) {
        if (!AbstractC4862t.a(getKey(), cVar)) {
            return null;
        }
        AbstractC4862t.c(this, "null cannot be cast to non-null type E of kotlinx.coroutines.internal.ThreadLocalElement.get");
        return this;
    }

    @Override // lc.InterfaceC4992i.b
    public InterfaceC4992i.c getKey() {
        return this.f17909c;
    }

    @Override // Rd.V0
    public Object m(InterfaceC4992i interfaceC4992i) {
        Object obj = this.f17908b.get();
        this.f17908b.set(this.f17907a);
        return obj;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i minusKey(InterfaceC4992i.c cVar) {
        return AbstractC4862t.a(getKey(), cVar) ? C4993j.f40088a : this;
    }

    @Override // lc.InterfaceC4992i
    public InterfaceC4992i plus(InterfaceC4992i interfaceC4992i) {
        return V0.a.b(this, interfaceC4992i);
    }

    public String toString() {
        return "ThreadLocal(value=" + this.f17907a + ", threadLocal = " + this.f17908b + ')';
    }
}
