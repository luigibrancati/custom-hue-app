package com.braze.models.inappmessage;

import Rd.M;
import com.braze.managers.m0;
import com.braze.managers.r;
import fc.AbstractC4036s;
import fc.C4015H;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f28062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f28063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m0 f28064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(String str, InAppMessageBase inAppMessageBase, m0 m0Var, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28062a = str;
        this.f28063b = inAppMessageBase;
        this.f28064c = m0Var;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new c(this.f28062a, this.f28063b, this.f28064c, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((M) obj, (InterfaceC4988e) obj2)).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C5046c.f();
        AbstractC4036s.b(obj);
        com.braze.models.k kVarM = com.braze.models.outgoing.event.b.f28071g.m(this.f28062a, this.f28063b.getMessageExtras());
        if (kVarM != null) {
            ((r) this.f28064c).a(kVarM);
        }
        return C4015H.f34254a;
    }
}
