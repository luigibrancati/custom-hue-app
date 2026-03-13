package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(final n destination, com.braze.dispatch.h dispatchDataProvider) {
        super(destination, dispatchDataProvider);
        AbstractC4862t.e(destination, "destination");
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: p5.c
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.queue.d.a(destination);
            }
        }, 7, (Object) null);
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j10) {
    }

    public static final String a(n nVar) {
        return "Default queue created for dest " + nVar;
    }
}
