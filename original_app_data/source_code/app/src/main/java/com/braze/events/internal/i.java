package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONArray f27734a;

    public i(JSONArray featureFlagsData) {
        AbstractC4862t.e(featureFlagsData, "featureFlagsData");
        this.f27734a = featureFlagsData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && AbstractC4862t.a(this.f27734a, ((i) obj).f27734a);
    }

    public final int hashCode() {
        return this.f27734a.hashCode();
    }

    public final String toString() {
        return "FeatureFlagsReceivedEvent(featureFlagsData=" + this.f27734a + ")";
    }
}
