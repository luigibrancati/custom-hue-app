package Vd;

import Ud.InterfaceC2314f;
import Wd.L;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public final class B implements InterfaceC2314f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4992i f17510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f17511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vc.p f17512c;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public static final class a extends nc.m implements vc.p {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17513j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public /* synthetic */ Object f17514k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2314f f17515l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2314f interfaceC2314f, InterfaceC4988e interfaceC4988e) {
            super(2, interfaceC4988e);
            this.f17515l = interfaceC2314f;
        }

        @Override // vc.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, InterfaceC4988e interfaceC4988e) {
            return ((a) create(obj, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
        }

        @Override // nc.AbstractC5157a
        public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
            a aVar = new a(this.f17515l, interfaceC4988e);
            aVar.f17514k = obj;
            return aVar;
        }

        @Override // nc.AbstractC5157a
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objF = C5046c.f();
            int i10 = this.f17513j;
            if (i10 == 0) {
                AbstractC4036s.b(obj);
                Object obj2 = this.f17514k;
                InterfaceC2314f interfaceC2314f = this.f17515l;
                this.f17513j = 1;
                if (interfaceC2314f.emit(obj2, this) == objF) {
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

    public B(InterfaceC2314f interfaceC2314f, InterfaceC4992i interfaceC4992i) {
        this.f17510a = interfaceC4992i;
        this.f17511b = L.g(interfaceC4992i);
        this.f17512c = new a(interfaceC2314f, null);
    }

    @Override // Ud.InterfaceC2314f
    public Object emit(Object obj, InterfaceC4988e interfaceC4988e) {
        Object objB = f.b(this.f17510a, obj, this.f17511b, this.f17512c, interfaceC4988e);
        return objB == C5046c.f() ? objB : C4015H.f34254a;
    }
}
