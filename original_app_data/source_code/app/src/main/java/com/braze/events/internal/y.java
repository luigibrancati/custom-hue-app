package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.n f27751a;

    public y(com.braze.models.n session) {
        AbstractC4862t.e(session, "session");
        this.f27751a = session;
        if (session.f28110d) {
            throw new IllegalArgumentException("Session created events cannot be created with already sealed sessions.");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && AbstractC4862t.a(this.f27751a, ((y) obj).f27751a);
    }

    public final int hashCode() {
        return this.f27751a.hashCode();
    }

    public final String toString() {
        return "SessionCreatedEvent(session=" + this.f27751a + ")";
    }
}
