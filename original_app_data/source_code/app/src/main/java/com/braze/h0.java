package com.braze;

import com.braze.storage.n3;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BrazeUser f27763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f27764b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(BrazeUser brazeUser, String str, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f27763a = brazeUser;
        this.f27764b = str;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new h0(this.f27763a, this.f27764b, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new h0(this.f27763a, this.f27764b, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        n3 n3Var = this.f27763a.userCache;
        String str = this.f27764b;
        synchronized (n3Var) {
            n3Var.c("language", str);
        }
        return C4015H.f34254a;
    }
}
