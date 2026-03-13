package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e {
    public e() {
        com.braze.requests.c requestInitiatedBy = com.braze.requests.c.f28228c;
        AbstractC4862t.e(requestInitiatedBy, "requestInitiatedBy");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        com.braze.requests.c cVar = com.braze.requests.c.f28227b;
        return true;
    }

    public final int hashCode() {
        return com.braze.requests.c.f28228c.hashCode();
    }

    public final String toString() {
        return "ContentCardRefreshRequestedEvent(requestInitiatedBy=" + com.braze.requests.c.f28228c + ")";
    }
}
