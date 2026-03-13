package Ud;

import Rd.AbstractC2132i;
import Rd.InterfaceC2166z0;
import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class j {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17031j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2313e f17032k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2313e interfaceC2313e, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f17032k = interfaceC2313e;
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            return new a(this.f17032k, interfaceC4988e);
        }

        @Override // vc.p
        public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
            return ((a) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17031j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                InterfaceC2313e interfaceC2313e = this.f17032k;
                this.f17031j = 1;
                if (AbstractC2315g.i(interfaceC2313e, this) == objF) {
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

    public static final Object a(InterfaceC2313e interfaceC2313e, InterfaceC4988e interfaceC4988e) {
        Object objCollect = interfaceC2313e.collect(Vd.s.f17582a, interfaceC4988e);
        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
    }

    public static final Object b(InterfaceC2313e interfaceC2313e, vc.p pVar, InterfaceC4988e interfaceC4988e) {
        Object objI = AbstractC2315g.i(k.b(AbstractC2315g.v(interfaceC2313e, pVar), 0, null, 2, null), interfaceC4988e);
        return objI == C5046c.f() ? objI : C4015H.f34254a;
    }

    public static final Object c(InterfaceC2314f interfaceC2314f, InterfaceC2313e interfaceC2313e, InterfaceC4988e interfaceC4988e) {
        AbstractC2315g.p(interfaceC2314f);
        Object objCollect = interfaceC2313e.collect(interfaceC2314f, interfaceC4988e);
        return objCollect == C5046c.f() ? objCollect : C4015H.f34254a;
    }

    public static final InterfaceC2166z0 d(InterfaceC2313e interfaceC2313e, M m10) {
        return AbstractC2132i.d(m10, null, null, new a(interfaceC2313e, null), 3, null);
    }
}
