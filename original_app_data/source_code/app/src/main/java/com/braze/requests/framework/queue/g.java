package com.braze.requests.framework.queue;

import com.braze.requests.n;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g extends com.braze.requests.framework.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f28295k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.braze.dispatch.h dispatchDataProvider) {
        super(n.f28323m, dispatchDataProvider);
        AbstractC4862t.e(dispatchDataProvider, "dispatchDataProvider");
        this.f28295k = true;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j10) {
        c(j10);
    }

    @Override // com.braze.requests.framework.b
    public final boolean c() {
        return this.f28295k;
    }

    @Override // com.braze.requests.framework.b
    public final void a(long j10, com.braze.requests.framework.h requestInfo, com.braze.models.response.a apiResponse) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(apiResponse, "apiResponse");
        super.a(j10, requestInfo, apiResponse);
        requestInfo.a(j10, com.braze.requests.framework.i.f28292e);
    }
}
