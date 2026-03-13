package com.braze.models.response;

import com.braze.requests.o;
import com.braze.support.q;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.communication.d f28113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f28114b;

    public a(o request, com.braze.communication.d connectionResult) {
        AbstractC4862t.e(request, "request");
        AbstractC4862t.e(connectionResult, "connectionResult");
        this.f28113a = connectionResult;
        String str = (String) connectionResult.f27522b.get("retry-after");
        this.f28114b = str != null ? q.a(str) : null;
    }
}
