package fc;

import fc.C4035r;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import lc.C4993j;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5045b;
import mc.C5046c;
import nc.AbstractC5157a;

/* JADX INFO: renamed from: fc.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class C4021d extends AbstractC4020c implements InterfaceC4988e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public vc.q f34259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f34260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC4988e f34261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f34262d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4021d(vc.q block, Object obj) {
        super(null);
        AbstractC4862t.e(block, "block");
        this.f34259a = block;
        this.f34260b = obj;
        AbstractC4862t.c(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f34261c = this;
        this.f34262d = AbstractC4019b.f34258a;
    }

    @Override // fc.AbstractC4020c
    public Object a(Object obj, InterfaceC4988e interfaceC4988e) {
        AbstractC4862t.c(interfaceC4988e, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f34261c = interfaceC4988e;
        this.f34260b = obj;
        Object objF = C5046c.f();
        if (objF == C5046c.f()) {
            nc.h.c(interfaceC4988e);
        }
        return objF;
    }

    public final Object c() throws Throwable {
        while (true) {
            Object obj = this.f34262d;
            InterfaceC4988e interfaceC4988e = this.f34261c;
            if (interfaceC4988e == null) {
                AbstractC4036s.b(obj);
                return obj;
            }
            if (C4035r.d(AbstractC4019b.f34258a, obj)) {
                try {
                    vc.q qVar = this.f34259a;
                    Object obj2 = this.f34260b;
                    Object objE = !(qVar instanceof AbstractC5157a) ? C5045b.e(qVar, this, obj2, interfaceC4988e) : ((vc.q) T.f(qVar, 3)).invoke(this, obj2, interfaceC4988e);
                    if (objE != C5046c.f()) {
                        interfaceC4988e.resumeWith(C4035r.b(objE));
                    }
                } catch (Throwable th) {
                    C4035r.a aVar = C4035r.f34274b;
                    interfaceC4988e.resumeWith(C4035r.b(AbstractC4036s.a(th)));
                }
            } else {
                this.f34262d = AbstractC4019b.f34258a;
                interfaceC4988e.resumeWith(obj);
            }
        }
    }

    @Override // lc.InterfaceC4988e
    public InterfaceC4992i getContext() {
        return C4993j.f40088a;
    }

    @Override // lc.InterfaceC4988e
    public void resumeWith(Object obj) {
        this.f34261c = null;
        this.f34262d = obj;
    }
}
