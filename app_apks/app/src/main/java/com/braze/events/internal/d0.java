package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.g f27712a;

    public d0(com.braze.requests.g request) {
        AbstractC4862t.e(request, "request");
        this.f27712a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && AbstractC4862t.a(this.f27712a, ((d0) obj).f27712a);
    }

    public final int hashCode() {
        return this.f27712a.hashCode();
    }

    public final String toString() {
        return "TriggerDispatchStartedEvent(request=" + this.f27712a + ")";
    }
}
