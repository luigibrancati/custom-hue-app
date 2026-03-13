package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.models.k f27724b;

    public e0(String campaignId, com.braze.models.k pushClickEvent) {
        AbstractC4862t.e(campaignId, "campaignId");
        AbstractC4862t.e(pushClickEvent, "pushClickEvent");
        this.f27723a = campaignId;
        this.f27724b = pushClickEvent;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return AbstractC4862t.a(this.f27723a, e0Var.f27723a) && AbstractC4862t.a(this.f27724b, e0Var.f27724b);
    }

    public final int hashCode() {
        return this.f27724b.hashCode() + (this.f27723a.hashCode() * 31);
    }

    public final String toString() {
        return "TriggerEligiblePushClickEvent(campaignId=" + this.f27723a + ", pushClickEvent=" + this.f27724b + ")";
    }
}
