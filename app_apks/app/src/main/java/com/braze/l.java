package com.braze;

import com.braze.managers.j1;
import com.braze.models.FeatureFlag;
import fc.AbstractC4036s;
import fc.C4015H;
import gc.C4179C;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Braze f27791a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27792b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Braze braze, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27791a = braze;
        this.f27792b = str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new l(this.f27791a, this.f27792b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new l(this.f27791a, this.f27792b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        if (((j1) this.f27791a.getUdm$android_sdk_base_release()).f27926o.H()) {
            return (FeatureFlag) C4179C.j0(((j1) this.f27791a.getUdm$android_sdk_base_release()).f27906B.c(this.f27792b));
        }
        return null;
    }
}
