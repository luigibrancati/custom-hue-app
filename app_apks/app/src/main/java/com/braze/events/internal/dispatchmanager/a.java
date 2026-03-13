package com.braze.events.internal.dispatchmanager;

import com.braze.models.q;
import com.braze.support.BrazeLogger;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final c a(q qVar) {
        if (qVar == null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: a5.a
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.events.internal.dispatchmanager.a.a();
                }
            }, 7, (Object) null);
        }
        return new c(b.f27715c, null, qVar, null, 10);
    }

    public static final String a() {
        return "There should be a session ID here";
    }
}
