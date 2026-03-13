package com.braze.requests;

import com.braze.support.BrazeLogger;
import gc.Q;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.events.e f28307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.managers.r f28308b;

    public i(com.braze.events.e internalEventPublisher, com.braze.managers.r brazeManager) {
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(brazeManager, "brazeManager");
        this.f28307a = internalEventPublisher;
        this.f28308b = brazeManager;
        new ArrayList();
    }

    @Override // com.braze.requests.q
    public final void a(com.braze.requests.framework.h requestInfo, com.braze.requests.framework.c requestDispatchCallback, boolean z10) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(requestDispatchCallback, "requestDispatchCallback");
        final o oVar = requestInfo.f28280a;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: n5.G
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.i.a(oVar);
            }
        }, 7, (Object) null);
        com.braze.models.response.g gVar = new com.braze.models.response.g(oVar, new com.braze.communication.d(201, Q.i(), 4), this.f28308b);
        com.braze.events.e eVar = this.f28307a;
        oVar.a(eVar, eVar, gVar);
        oVar.a(this.f28307a);
        requestDispatchCallback.a(gVar);
        ((com.braze.events.d) this.f28307a).b(new com.braze.events.internal.g(oVar), com.braze.events.internal.g.class);
    }

    public static final String a(o oVar) {
        return "Short circuiting execution of network request (" + oVar.hashCode() + ") and immediately marking it as succeeded.";
    }
}
