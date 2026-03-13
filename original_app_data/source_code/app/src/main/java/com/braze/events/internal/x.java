package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.d f27750a;

    public x(com.braze.models.response.d responseError) {
        AbstractC4862t.e(responseError, "responseError");
        this.f27750a = responseError;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && AbstractC4862t.a(this.f27750a, ((x) obj).f27750a);
    }

    public final int hashCode() {
        return this.f27750a.hashCode();
    }

    public final String toString() {
        return "ServerResponseErrorEvent(responseError=" + this.f27750a + ")";
    }
}
