package com.braze.coroutine;

import Rd.J;
import com.braze.support.BrazeLogger;
import lc.AbstractC4984a;
import lc.InterfaceC4992i;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e extends AbstractC4984a implements J {
    public e(J.a aVar) {
        super(aVar);
    }

    @Override // Rd.J
    public final void handleException(InterfaceC4992i interfaceC4992i, Throwable th) {
        try {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) f.f27586a, BrazeLogger.Priority.f28625E, th, false, (InterfaceC6082a) new d(th), 4, (Object) null);
            com.braze.events.d dVar = f.f27587b;
            if (dVar != null) {
                dVar.b(th, Throwable.class);
            }
        } catch (Exception unused) {
        }
    }
}
