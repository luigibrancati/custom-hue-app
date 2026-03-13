package com.braze.communication.dust;

import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f27545b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27545b = iVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new f(this.f27545b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f27545b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f27544a;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            i iVar = this.f27545b;
            this.f27544a = 1;
            String str = i.f27556d;
            if (iVar.a(this) == objF) {
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
