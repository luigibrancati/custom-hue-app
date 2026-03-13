package com.braze.requests.framework;

import com.braze.support.BrazeLogger;
import kotlin.jvm.internal.AbstractC4862t;
import vc.InterfaceC6082a;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f implements c {
    public static final String b(com.braze.models.response.g gVar) {
        return "Shutdown sync got success response: " + gVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(final com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.q
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.f.b(apiResponse);
            }
        }, 7, (Object) null);
    }

    public static final String b(com.braze.models.response.a aVar) {
        return "Shutdown sync got error response: " + aVar;
    }

    @Override // com.braze.requests.framework.c
    public final void a(final com.braze.models.response.a apiResponse) {
        AbstractC4862t.e(apiResponse, "apiResponse");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new InterfaceC6082a() { // from class: o5.r
            @Override // vc.InterfaceC6082a
            public final Object invoke() {
                return com.braze.requests.framework.f.b(apiResponse);
            }
        }, 7, (Object) null);
    }
}
