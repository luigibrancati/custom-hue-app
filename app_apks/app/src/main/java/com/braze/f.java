package com.braze;

import com.braze.managers.j1;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4206t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f27753a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Braze braze, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27753a = braze;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new f(this.f27753a, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new f(this.f27753a, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        return ((j1) this.f27753a.getUdm$android_sdk_base_release()).f27926o.H() ? ((j1) this.f27753a.getUdm$android_sdk_base_release()).f27906B.c(null) : C4206t.k();
    }
}
