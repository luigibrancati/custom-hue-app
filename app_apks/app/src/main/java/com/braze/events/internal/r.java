package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.requests.b f27746a;

    public r(com.braze.requests.b request) {
        AbstractC4862t.e(request, "request");
        this.f27746a = request;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && AbstractC4862t.a(this.f27746a, ((r) obj).f27746a);
    }

    public final int hashCode() {
        return this.f27746a.hashCode();
    }

    public final String toString() {
        return "RequestDispatchStartedEvent(request=" + this.f27746a + ")";
    }
}
