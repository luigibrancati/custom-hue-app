package com.braze.requests;

import Rd.M;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class u extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f28336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.h f28337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.braze.requests.framework.c f28338c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v vVar, com.braze.requests.framework.h hVar, com.braze.requests.framework.c cVar, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28336a = vVar;
        this.f28337b = hVar;
        this.f28338c = cVar;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new u(this.f28336a, this.f28337b, this.f28338c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        v vVar = this.f28336a;
        new e(this.f28337b, vVar.f28356a, vVar.f28357b, vVar.f28358c, vVar.f28361f, vVar.f28359d, vVar.f28360e, vVar.f28362g, this.f28338c).c();
        return C4015H.f34254a;
    }
}
