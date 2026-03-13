package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27733a;

    public h0(List triggeredActions) {
        AbstractC4862t.e(triggeredActions, "triggeredActions");
        this.f27733a = triggeredActions;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h0) && AbstractC4862t.a(this.f27733a, ((h0) obj).f27733a);
    }

    public final int hashCode() {
        return this.f27733a.hashCode();
    }

    public final String toString() {
        return "TriggeredActionsReceivedEvent(triggeredActions=" + this.f27733a + ")";
    }
}
