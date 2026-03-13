package com.braze;

import com.braze.managers.j1;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.AbstractC5158b;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class m extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f27833a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27834b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Braze braze, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27833a = braze;
        this.f27834b = str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new m(this.f27833a, this.f27834b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new m(this.f27833a, this.f27834b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        return AbstractC5158b.a(((j1) this.f27833a.getUdm$android_sdk_base_release()).f27907C.f(this.f27834b));
    }
}
