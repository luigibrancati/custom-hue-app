package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.models.response.m f27710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.models.response.m f27711b;

    public d(com.braze.models.response.m oldConfig, com.braze.models.response.m newConfig) {
        AbstractC4862t.e(oldConfig, "oldConfig");
        AbstractC4862t.e(newConfig, "newConfig");
        this.f27710a = oldConfig;
        this.f27711b = newConfig;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return AbstractC4862t.a(this.f27710a, dVar.f27710a) && AbstractC4862t.a(this.f27711b, dVar.f27711b);
    }

    public final int hashCode() {
        return this.f27711b.hashCode() + (this.f27710a.hashCode() * 31);
    }

    public final String toString() {
        return "ConfigChangeEvent(oldConfig=" + this.f27710a + ", newConfig=" + this.f27711b + ")";
    }
}
