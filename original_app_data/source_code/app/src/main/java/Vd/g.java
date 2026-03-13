package Vd;

import Rd.G;
import Ud.InterfaceC2313e;
import Ud.InterfaceC2314f;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import lc.InterfaceC4989f;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2313e f17531d;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17532j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17533k;

        public a(InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            return ((a) create(interfaceC2314f, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = g.this.new a(interfaceC4988e);
            aVar.f17533k = obj;
            return aVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17532j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2314f interfaceC2314f = (InterfaceC2314f) this.f17533k;
                g gVar = g.this;
                this.f17532j = 1;
                if (gVar.m(interfaceC2314f, this) == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            return C4015H.f34254a;
        }
    }

    public g(InterfaceC2313e interfaceC2313e, InterfaceC4992i interfaceC4992i, int i10, Td.a aVar) {
        super(interfaceC4992i, i10, aVar);
        this.f17531d = interfaceC2313e;
    }

    public static /* synthetic */ Object j(g gVar, InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        if (gVar.f17522b == -3) {
            InterfaceC4992i context = interfaceC4988e.getContext();
            InterfaceC4992i interfaceC4992iK = G.k(context, gVar.f17521a);
            if (AbstractC4862t.a(interfaceC4992iK, context)) {
                Object objM = gVar.m(interfaceC2314f, interfaceC4988e);
                return objM == C5046c.f() ? objM : C4015H.f34254a;
            }
            InterfaceC4989f.b bVar = InterfaceC4989f.f40086j0;
            if (AbstractC4862t.a(interfaceC4992iK.get(bVar), context.get(bVar))) {
                Object objL = gVar.l(interfaceC2314f, interfaceC4992iK, interfaceC4988e);
                return objL == C5046c.f() ? objL : C4015H.f34254a;
            }
        }
        Object objCollect = super.collect(interfaceC2314f, interfaceC4988e);
        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
    }

    public static /* synthetic */ Object k(g gVar, Td.v vVar, InterfaceC4988e interfaceC4988e) {
        Object objM = gVar.m(new z(vVar), interfaceC4988e);
        return objM == C5046c.f() ? objM : C4015H.f34254a;
    }

    @Override // Vd.e, Ud.InterfaceC2313e
    public Object collect(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
        return j(this, interfaceC2314f, interfaceC4988e);
    }

    @Override // Vd.e
    public Object e(Td.v vVar, InterfaceC4988e interfaceC4988e) {
        return k(this, vVar, interfaceC4988e);
    }

    public final Object l(InterfaceC2314f interfaceC2314f, InterfaceC4992i interfaceC4992i, InterfaceC4988e interfaceC4988e) {
        return f.c(interfaceC4992i, f.d(interfaceC2314f, interfaceC4988e.getContext()), null, new a(null), interfaceC4988e, 4, null);
    }

    public abstract Object m(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e);

    @Override // Vd.e
    public String toString() {
        return this.f17531d + " -> " + super.toString();
    }
}
