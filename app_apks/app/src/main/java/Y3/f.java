package Y3;

import Rd.M;
import e4.C3934c;
import fc.AbstractC4036s;
import fc.C4015H;
import i4.i;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f19771j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ C3934c f19772k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ i f19773l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(C3934c c3934c, i iVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f19772k = c3934c;
        this.f19773l = iVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new f(this.f19772k, this.f19773l, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(M m10, InterfaceC4988e interfaceC4988e) {
        return ((f) create(m10, interfaceC4988e)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f19771j;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
            return obj;
        }
        AbstractC4036s.b(obj);
        C3934c c3934c = this.f19772k;
        i iVar = this.f19773l;
        this.f19771j = 1;
        Object objI = c3934c.i(iVar, this);
        return objI == objF ? objF : objI;
    }
}
