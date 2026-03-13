package com.braze.dispatch;

import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.requests.o;
import com.braze.storage.s2;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g {
    public final void a(BrazeConfigurationProvider configurationProvider, final s2 sdkAuthenticationCache, o brazeRequest, String deviceId) {
        AbstractC4862t.e(configurationProvider, "configurationProvider");
        AbstractC4862t.e(sdkAuthenticationCache, "sdkAuthenticationCache");
        AbstractC4862t.e(brazeRequest, "brazeRequest");
        AbstractC4862t.e(deviceId, "deviceId");
        com.braze.requests.b bVar = (com.braze.requests.b) brazeRequest;
        bVar.f28222f = deviceId;
        bVar.f28223g = configurationProvider.getBrazeApiKey().f28070a;
        bVar.f28224h = "41.0.0";
        bVar.f28221e = Long.valueOf(DateTimeUtils.nowInSeconds());
        if (!configurationProvider.isSdkAuthenticationEnabled()) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.q
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.g.a();
                }
            }, 6, (Object) null);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f28627V, (Throwable) null, false, new InterfaceC6082a() { // from class: X4.p
                @Override // vc.InterfaceC6082a
                public final Object invoke() {
                    return com.braze.dispatch.g.a(sdkAuthenticationCache);
                }
            }, 6, (Object) null);
            bVar.f28226j = sdkAuthenticationCache.a();
        }
    }

    public static final String a(s2 s2Var) {
        return "Adding SDK Auth token to request '" + s2Var.a() + "'";
    }

    public static final String a() {
        return "SDK Auth is disabled, not adding signature to request";
    }
}
