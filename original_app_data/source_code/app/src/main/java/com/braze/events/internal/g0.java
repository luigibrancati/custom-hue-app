package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.b f27728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.triggers.actions.a f27729b;

    public g0(com.braze.triggers.events.b originalTriggerEvent, com.braze.triggers.actions.a failedTriggeredAction) {
        AbstractC4862t.e(originalTriggerEvent, "originalTriggerEvent");
        AbstractC4862t.e(failedTriggeredAction, "failedTriggeredAction");
        this.f27728a = originalTriggerEvent;
        this.f27729b = failedTriggeredAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return AbstractC4862t.a(this.f27728a, g0Var.f27728a) && AbstractC4862t.a(this.f27729b, g0Var.f27729b);
    }

    public final int hashCode() {
        return this.f27729b.hashCode() + (this.f27728a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggeredActionRetryEvent(originalTriggerEvent=" + this.f27728a + ", failedTriggeredAction=" + this.f27729b + ")";
    }
}
