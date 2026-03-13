package com.braze.storage;

import fc.AbstractC4036s;
import fc.C4015H;
import k1.AbstractC4785h;
import k1.C4781d;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class t extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC4785h.a f28570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AbstractC4785h.a aVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28570b = aVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        t tVar = new t(this.f28570b, interfaceC4988e);
        tVar.f28569a = obj;
        return tVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        t tVar = new t(this.f28570b, (InterfaceC4988e) obj2);
        tVar.f28569a = (C4781d) obj;
        return tVar.invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        ((C4781d) this.f28569a).k(this.f28570b);
        return C4015H.f34254a;
    }
}
