package k1;

import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: renamed from: k1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4789l {

    /* JADX INFO: renamed from: k1.l$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f39201j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f39202k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f39203l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f39203l = pVar;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4785h abstractC4785h, InterfaceC4988e interfaceC4988e) {
            return ((a) create(abstractC4785h, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f39203l, interfaceC4988e);
            aVar.f39202k = obj;
            return aVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f39201j;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4781d c4781d = (C4781d) this.f39202k;
                AbstractC4036s.b(obj);
                return c4781d;
            }
            AbstractC4036s.b(obj);
            C4781d c4781dD = ((AbstractC4785h) this.f39202k).d();
            p pVar = this.f39203l;
            this.f39202k = c4781dD;
            this.f39201j = 1;
            return pVar.invoke(c4781dD, this) == objF ? objF : c4781dD;
        }
    }

    public static final Object a(InterfaceC4099i interfaceC4099i, p pVar, InterfaceC4988e interfaceC4988e) {
        return interfaceC4099i.a(new a(pVar, null), interfaceC4988e);
    }
}
