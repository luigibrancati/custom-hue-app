package Vd;

import Rd.C0;
import Ud.InterfaceC2314f;
import fc.C4015H;
import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;
import nc.AbstractC5160d;
import nc.InterfaceC5161e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class v extends AbstractC5160d implements InterfaceC2314f, InterfaceC5161e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC2314f f17586j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC4992i f17587k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f17588l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC4992i f17589m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC4988e f17590n;

    public v(InterfaceC2314f interfaceC2314f, InterfaceC4992i interfaceC4992i) {
        super(r.f17580a, C4993j.f40088a);
        this.f17586j = interfaceC2314f;
        this.f17587k = interfaceC4992i;
        this.f17588l = ((Number) interfaceC4992i.fold(0, new vc.p() { // from class: Vd.u
            @Override // vc.p
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(v.i(((Integer) obj).intValue(), (InterfaceC4992i.b) obj2));
            }
        })).intValue();
    }

    public static final int i(int i10, InterfaceC4992i.b bVar) {
        return i10 + 1;
    }

    @Override // Ud.InterfaceC2314f
    public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
        try {
            Object objJ = j(interfaceC4988e, obj);
            if (objJ == C5046c.f()) {
                nc.h.c(interfaceC4988e);
            }
            return objJ == C5046c.f() ? objJ : C4015H.f34254a;
        } catch (Throwable th) {
            this.f17589m = new m(th, interfaceC4988e.getContext());
            throw th;
        }
    }

    public final void f(InterfaceC4992i interfaceC4992i, InterfaceC4992i interfaceC4992i2, Object obj) {
        if (interfaceC4992i2 instanceof m) {
            k((m) interfaceC4992i2, obj);
        }
        y.b(this, interfaceC4992i);
    }

    @Override // nc.AbstractC5157a, nc.InterfaceC5161e
    public InterfaceC5161e getCallerFrame() {
        InterfaceC4988e interfaceC4988e = this.f17590n;
        if (interfaceC4988e instanceof InterfaceC5161e) {
            return (InterfaceC5161e) interfaceC4988e;
        }
        return null;
    }

    @Override // nc.AbstractC5160d, lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        InterfaceC4992i interfaceC4992i = this.f17589m;
        return interfaceC4992i == null ? C4993j.f40088a : interfaceC4992i;
    }

    @Override // nc.AbstractC5157a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // nc.AbstractC5157a
    public Object invokeSuspend(Object obj) {
        Throwable thE = C4035r.e(obj);
        if (thE != null) {
            this.f17589m = new m(thE, getContext());
        }
        InterfaceC4988e interfaceC4988e = this.f17590n;
        if (interfaceC4988e != null) {
            interfaceC4988e.resumeWith(obj);
        }
        return C5046c.f();
    }

    public final Object j(InterfaceC4988e interfaceC4988e, Object obj) {
        InterfaceC4992i context = interfaceC4988e.getContext();
        C0.k(context);
        InterfaceC4992i interfaceC4992i = this.f17589m;
        if (interfaceC4992i != context) {
            f(context, interfaceC4992i, obj);
            this.f17589m = context;
        }
        this.f17590n = interfaceC4988e;
        vc.q qVar = w.f17591a;
        InterfaceC2314f interfaceC2314f = this.f17586j;
        AbstractC4862t.c(interfaceC2314f, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        AbstractC4862t.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = qVar.invoke(interfaceC2314f, obj, this);
        if (!AbstractC4862t.a(objInvoke, C5046c.f())) {
            this.f17590n = null;
        }
        return objInvoke;
    }

    public final void k(m mVar, Object obj) {
        throw new IllegalStateException(Od.v.n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f17579b + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // nc.AbstractC5160d, nc.AbstractC5157a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
