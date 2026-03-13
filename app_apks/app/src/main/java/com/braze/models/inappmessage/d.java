package com.braze.models.inappmessage;

import com.braze.events.internal.f0;
import com.braze.managers.m0;
import com.braze.managers.r;
import fc.AbstractC4036s;
import fc.C4015H;
import kotlin.jvm.internal.AbstractC4862t;
import lc.InterfaceC4988e;
import mc.C5046c;
import nc.m;
import vc.p;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends m implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InAppMessageBase f28065a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(InAppMessageBase inAppMessageBase, InterfaceC4988e interfaceC4988e) {
        super(2, interfaceC4988e);
        this.f28065a = inAppMessageBase;
    }

    @Override // nc.AbstractC5157a
    public final InterfaceC4988e create(Object obj, InterfaceC4988e interfaceC4988e) {
        return new d(this.f28065a, interfaceC4988e);
    }

    @Override // vc.p
    public final Object invoke(Object obj, Object obj2) {
        return new d(this.f28065a, (InterfaceC4988e) obj2).invokeSuspend(C4015H.f34254a);
    }

    @Override // nc.AbstractC5157a
    public final Object invokeSuspend(Object obj) throws Throwable {
        m0 brazeManager;
        C5046c.f();
        AbstractC4036s.b(obj);
        if (this.f28065a.clickLogged.get() && (brazeManager = this.f28065a.getBrazeManager()) != null) {
            com.braze.triggers.events.d triggerEvent = new com.braze.triggers.events.d(this.f28065a.getTriggerId());
            AbstractC4862t.e(triggerEvent, "triggerEvent");
            ((com.braze.events.d) ((r) brazeManager).f27969d).b(new f0(triggerEvent), f0.class);
        }
        return C4015H.f34254a;
    }
}
