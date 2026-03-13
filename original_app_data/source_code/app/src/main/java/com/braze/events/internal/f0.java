package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.triggers.events.d f27726a;

    public f0(com.braze.triggers.events.d triggerEvent) {
        AbstractC4862t.e(triggerEvent, "triggerEvent");
        this.f27726a = triggerEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0) && AbstractC4862t.a(this.f27726a, ((f0) obj).f27726a);
    }

    public final int hashCode() {
        return this.f27726a.hashCode();
    }

    public final String toString() {
        return "TriggerEventEvent(triggerEvent=" + this.f27726a + ")";
    }
}
