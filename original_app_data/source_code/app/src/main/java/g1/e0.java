package g1;

import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class e0 {

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.q {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f34913j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f34914k;

        public a(InterfaceC4988e interfaceC4988e) {
            super(3, interfaceC4988e);
        }

        public final Object a(InterfaceC4085U interfaceC4085U, boolean z10, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(interfaceC4988e);
            aVar.f34914k = interfaceC4085U;
            return aVar.invokeSuspend(C4015H.f34254a);
        }

        @Override // vc.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC4085U) obj, ((Boolean) obj2).booleanValue(), (InterfaceC4988e) obj3);
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f34913j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
                return obj;
            }
            AbstractC4036s.b(obj);
            InterfaceC4085U interfaceC4085U = (InterfaceC4085U) this.f34914k;
            this.f34913j = 1;
            Object objE = interfaceC4085U.e(this);
            return objE == objF ? objF : objE;
        }
    }

    public static final Object a(d0 d0Var, InterfaceC4988e interfaceC4988e) {
        return d0Var.b(new a(null), interfaceC4988e);
    }
}
