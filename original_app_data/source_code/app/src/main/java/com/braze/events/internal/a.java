package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f27705a;

    public a(JSONObject bannersData) {
        AbstractC4862t.e(bannersData, "bannersData");
        this.f27705a = bannersData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && AbstractC4862t.a(this.f27705a, ((a) obj).f27705a);
    }

    public final int hashCode() {
        return this.f27705a.hashCode();
    }

    public final String toString() {
        return "BannersReceivedEvent(bannersData=" + this.f27705a + ")";
    }
}
