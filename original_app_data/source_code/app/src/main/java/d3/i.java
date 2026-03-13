package d3;

import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.L;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends nc.m implements vc.p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Object f33005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f33006k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ L f33007l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ n f33008m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(L l10, n nVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f33007l = l10;
        this.f33008m = nVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new i(this.f33007l, this.f33008m, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
        return ((i) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        L l10;
        Object objF = C5046c.f();
        int i10 = this.f33006k;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            L l11 = this.f33007l;
            n nVar = this.f33008m;
            this.f33005j = l11;
            this.f33006k = 1;
            Object objA = nVar.a(this);
            if (objA == objF) {
                return objF;
            }
            obj = objA;
            l10 = l11;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            l10 = (L) this.f33005j;
            AbstractC4036s.b(obj);
        }
        l10.f39776a = obj;
        return C4015H.f34254a;
    }
}
