package com.braze.storage;

import fc.AbstractC4036s;
import fc.C4015H;
import k1.AbstractC4785h;
import k1.C4781d;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4785h.a f28489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f28490c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(AbstractC4785h.a aVar, Object obj, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28489b = aVar;
        this.f28490c = obj;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        m0 m0Var = new m0(this.f28489b, this.f28490c, interfaceC4988e);
        m0Var.f28488a = obj;
        return m0Var;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((C4781d) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        ((C4781d) this.f28488a).l(this.f28489b, this.f28490c);
        return C4015H.f34254a;
    }
}
