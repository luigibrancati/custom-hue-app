package com.braze.requests;

import Rd.AbstractC2132i;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.storage.b3;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class v implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.communication.e f28356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.events.e f28357b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.braze.events.e f28358c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b3 f28359d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.braze.storage.p f28360e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.braze.managers.r f28361f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.braze.requests.util.a f28362g;

    public v(com.braze.communication.e httpConnector, com.braze.events.e internalEventPublisher, com.braze.events.e externalEventPublisher, b3 serverConfigStorageProvider, com.braze.storage.p contentCardsStorageProvider, com.braze.managers.r brazeManager, com.braze.requests.util.a endpointMetadataProvider) {
        AbstractC4862t.e(httpConnector, "httpConnector");
        AbstractC4862t.e(internalEventPublisher, "internalEventPublisher");
        AbstractC4862t.e(externalEventPublisher, "externalEventPublisher");
        AbstractC4862t.e(serverConfigStorageProvider, "serverConfigStorageProvider");
        AbstractC4862t.e(contentCardsStorageProvider, "contentCardsStorageProvider");
        AbstractC4862t.e(brazeManager, "brazeManager");
        AbstractC4862t.e(endpointMetadataProvider, "endpointMetadataProvider");
        this.f28356a = httpConnector;
        this.f28357b = internalEventPublisher;
        this.f28358c = externalEventPublisher;
        this.f28359d = serverConfigStorageProvider;
        this.f28360e = contentCardsStorageProvider;
        this.f28361f = brazeManager;
        this.f28362g = endpointMetadataProvider;
    }

    @Override // com.braze.requests.q
    public final void a(com.braze.requests.framework.h requestInfo, com.braze.requests.framework.c requestDispatchCallback, boolean z10) {
        AbstractC4862t.e(requestInfo, "requestInfo");
        AbstractC4862t.e(requestDispatchCallback, "requestDispatchCallback");
        if (z10) {
            new e(requestInfo, this.f28356a, this.f28357b, this.f28358c, this.f28361f, this.f28359d, this.f28360e, this.f28362g, requestDispatchCallback).c();
        } else {
            AbstractC2132i.d(BrazeCoroutineScope.INSTANCE, null, null, new u(this, requestInfo, requestDispatchCallback, null), 3, null);
        }
    }
}
