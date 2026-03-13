package com.braze;

import Rd.AbstractC2128g;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IValueCallback;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import lc.InterfaceC4992i;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f27765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ IValueCallback f27766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Braze f27767c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(IValueCallback iValueCallback, Braze braze, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27766b = iValueCallback;
        this.f27767c = braze;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new i(this.f27766b, this.f27767c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new i(this.f27766b, this.f27767c, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objF = C5046c.f();
        int i10 = this.f27765a;
        if (i10 == 0) {
            AbstractC4036s.b(obj);
            InterfaceC4992i coroutineContext = BrazeCoroutineScope.INSTANCE.getCoroutineContext();
            h hVar = new h(this.f27766b, this.f27767c, null);
            this.f27765a = 1;
            if (AbstractC2128g.g(coroutineContext, hVar, this) == objF) {
                return objF;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4036s.b(obj);
        }
        return C4015H.f34254a;
    }
}
