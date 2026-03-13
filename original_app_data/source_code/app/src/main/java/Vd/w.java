package Vd;

import Ud.InterfaceC2314f;
import kotlin.jvm.internal.AbstractC4860q;
import kotlin.jvm.internal.AbstractC4862t;
import kotlin.jvm.internal.T;
import lc.InterfaceC4988e;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes4.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vc.q f17591a;

    /* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
    public /* synthetic */ class a extends AbstractC4860q implements vc.q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f17592a = new a();

        public a() {
            super(3, InterfaceC2314f.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // vc.q
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2314f interfaceC2314f, Object obj, InterfaceC4988e interfaceC4988e) {
            return interfaceC2314f.emit(obj, interfaceC4988e);
        }
    }

    static {
        a aVar = a.f17592a;
        AbstractC4862t.c(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f17591a = (vc.q) T.f(aVar, 3);
    }
}
