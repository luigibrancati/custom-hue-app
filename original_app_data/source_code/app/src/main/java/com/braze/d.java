package com.braze;

import com.braze.managers.j1;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f27589a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f27590b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(String str, Braze braze, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27589a = str;
        this.f27590b = braze;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new d(this.f27589a, this.f27590b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f27589a, this.f27590b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        String str = this.f27589a;
        if (str == null) {
            return null;
        }
        return com.braze.support.s.a(str, ((j1) this.f27590b.getUdm$android_sdk_base_release()).f27936y);
    }
}
