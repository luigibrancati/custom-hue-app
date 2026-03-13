package com.braze.events;

import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IEventSubscriber f27693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f27694b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(IEventSubscriber iEventSubscriber, Object obj, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27693a = iEventSubscriber;
        this.f27694b = obj;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new c(this.f27693a, this.f27694b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f27693a, this.f27694b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        this.f27693a.trigger(this.f27694b);
        return C4015H.f34254a;
    }
}
