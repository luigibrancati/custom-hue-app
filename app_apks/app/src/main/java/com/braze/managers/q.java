package com.braze.managers;

import Rd.X;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class q extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f27964b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27964b = rVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new q(this.f27964b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new q(this.f27964b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f27963a;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            this.f27963a = 1;
            if (X.a(1000L, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
        }
        r rVar = this.f27964b;
        rVar.getClass();
        rVar.a(new com.braze.models.outgoing.j());
        return C4015H.f34254a;
    }
}
