package com.braze.storage;

import fc.AbstractC4036s;
import fc.C4015H;
import k1.C4781d;
import lc.InterfaceC4988e;
import mc.C5046c;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v extends nc.m implements vc.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f28586a;

    public v(InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        v vVar = new v(interfaceC4988e);
        vVar.f28586a = obj;
        return vVar;
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        v vVar = new v((InterfaceC4988e) obj2);
        vVar.f28586a = (C4781d) obj;
        return vVar.invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        ((C4781d) this.f28586a).h();
        return C4015H.f34254a;
    }
}
