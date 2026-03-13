package k1;

import Ud.InterfaceC2313e;
import fc.AbstractC4036s;
import fc.C4015H;
import g1.InterfaceC4099i;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: renamed from: k1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class C4782e implements InterfaceC4099i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4099i f39192a;

    /* JADX INFO: renamed from: k1.e$a */
    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f39193j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f39194k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ p f39195l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f39195l = pVar;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC4785h abstractC4785h, InterfaceC4988e interfaceC4988e) {
            return ((a) create(abstractC4785h, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f39195l, interfaceC4988e);
            aVar.f39194k = obj;
            return aVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f39193j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                AbstractC4785h abstractC4785h = (AbstractC4785h) this.f39194k;
                p pVar = this.f39195l;
                this.f39193j = 1;
                obj = pVar.invoke(abstractC4785h, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4036s.b(obj);
            }
            AbstractC4785h abstractC4785h2 = (AbstractC4785h) obj;
            AbstractC4862t.c(abstractC4785h2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
            ((C4781d) abstractC4785h2).i();
            return abstractC4785h2;
        }
    }

    public C4782e(InterfaceC4099i delegate) {
        AbstractC4862t.e(delegate, "delegate");
        this.f39192a = delegate;
    }

    @Override // g1.InterfaceC4099i
    public Object a(p pVar, InterfaceC4988e interfaceC4988e) {
        return this.f39192a.a(new a(pVar, null), interfaceC4988e);
    }

    @Override // g1.InterfaceC4099i
    public InterfaceC2313e getData() {
        return this.f39192a.getData();
    }
}
