package com.braze.coroutine;

import Rd.J;
import com.braze.support.BrazeLogger;
import lc.AbstractC4984a;
import lc.InterfaceC4992i;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AbstractC4984a implements J {
    public c(J.a aVar) {
        super(aVar);
    }

    @Override // Rd.J
    public final void handleException(InterfaceC4992i interfaceC4992i, Throwable th) throws Throwable {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) brazeCoroutineScope, BrazeLogger.Priority.f28625E, th, false, (InterfaceC6082a) new a(th), 4, (Object) null);
        if (brazeCoroutineScope.getShouldReRaiseExceptions$android_sdk_base_release()) {
            throw th;
        }
    }
}
