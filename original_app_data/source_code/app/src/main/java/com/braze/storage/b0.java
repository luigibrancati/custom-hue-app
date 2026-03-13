package com.braze.storage;

import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.braze.events.e f28395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f28396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f28397c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(com.braze.events.e eVar, String str, Throwable th, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28395a = eVar;
        this.f28396b = str;
        this.f28397c = th;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new b0(this.f28395a, this.f28396b, this.f28397c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        ((com.braze.events.d) this.f28395a).b(new com.braze.exceptions.b(this.f28396b, this.f28397c), com.braze.exceptions.b.class);
        return C4015H.f34254a;
    }
}
