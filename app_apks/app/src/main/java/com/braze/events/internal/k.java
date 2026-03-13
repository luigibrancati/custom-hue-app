package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.j f27735a;

    public k(com.braze.requests.j request) {
        AbstractC4862t.e(request, "request");
        this.f27735a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && AbstractC4862t.a(this.f27735a, ((k) obj).f27735a);
    }

    public final int hashCode() {
        return this.f27735a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsRequestSuccessEvent(request=" + this.f27735a + ")";
    }
}
