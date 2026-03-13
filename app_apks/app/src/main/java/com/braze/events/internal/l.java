package com.braze.events.internal;

import java.util.List;
import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f27736a;

    public l(List geofencesList) {
        AbstractC4862t.e(geofencesList, "geofencesList");
        this.f27736a = geofencesList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && AbstractC4862t.a(this.f27736a, ((l) obj).f27736a);
    }

    public final int hashCode() {
        return this.f27736a.hashCode();
    }

    public final String toString() {
        return "GeofencesReceivedEvent(geofencesList=" + this.f27736a + ")";
    }
}
