package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.p f27752a;

    public z(com.braze.models.p sealedSession) {
        AbstractC4862t.e(sealedSession, "sealedSession");
        this.f27752a = sealedSession;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && AbstractC4862t.a(this.f27752a, ((z) obj).f27752a);
    }

    public final int hashCode() {
        return this.f27752a.hashCode();
    }

    public final String toString() {
        return "SessionSealedEvent(sealedSession=" + this.f27752a + ")";
    }
}
