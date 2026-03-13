package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.a f27708a;

    public c(com.braze.requests.a request) {
        AbstractC4862t.e(request, "request");
        this.f27708a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && AbstractC4862t.a(this.f27708a, ((c) obj).f27708a);
    }

    public final int hashCode() {
        return this.f27708a.hashCode();
    }

    public final String toString() {
        return "BannersRequestSuccessEvent(request=" + this.f27708a + ")";
    }
}
