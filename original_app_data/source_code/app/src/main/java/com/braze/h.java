package com.braze;

import com.braze.events.IValueCallback;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f27761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Braze f27762b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(IValueCallback iValueCallback, Braze braze, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27761a = iValueCallback;
        this.f27762b = braze;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new h(this.f27761a, this.f27762b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new h(this.f27761a, this.f27762b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        if (Braze.INSTANCE.isSdkDisabledOrDelayed()) {
            this.f27761a.onError();
            return C4015H.f34254a;
        }
        IValueCallback iValueCallback = this.f27761a;
        BrazeUser brazeUser = this.f27762b.brazeUser;
        if (brazeUser == null) {
            AbstractC4862t.p("brazeUser");
            brazeUser = null;
        }
        iValueCallback.onSuccess(brazeUser);
        return C4015H.f34254a;
    }
}
