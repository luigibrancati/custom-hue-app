package com.braze.requests.framework.queue;

import com.braze.requests.n;
import com.braze.requests.o;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.braze.requests.framework.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.braze.dispatch.h dispatchDataProvider) {
        super(n.f28314d, dispatchDataProvider);
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j10) {
        c(j10);
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j10, com.braze.requests.framework.h requestInfo, com.braze.models.response.g apiResponse) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(apiResponse, "apiResponse");
        super.a(j10, requestInfo, apiResponse);
        Long l10 = apiResponse.f28114b;
        if (l10 != null) {
            requestInfo.f28281b = l10.longValue() + j10;
            requestInfo.a(j10, com.braze.requests.framework.i.f28289b);
            o oVar = requestInfo.f28280a;
            com.braze.requests.f fVar = oVar instanceof com.braze.requests.f ? (com.braze.requests.f) oVar : null;
            if (fVar != null) {
                fVar.f28246m = requestInfo.f28287h;
            }
        }
    }
}
