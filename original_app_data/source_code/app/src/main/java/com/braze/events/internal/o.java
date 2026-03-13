package com.braze.events.internal;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.braze.enums.e f27742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.braze.enums.e f27743b;

    public o(com.braze.enums.e oldNetworkLevel, com.braze.enums.e newNetworkLevel) {
        AbstractC4862t.e(oldNetworkLevel, "oldNetworkLevel");
        AbstractC4862t.e(newNetworkLevel, "newNetworkLevel");
        this.f27742a = oldNetworkLevel;
        this.f27743b = newNetworkLevel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f27742a == oVar.f27742a && this.f27743b == oVar.f27743b;
    }

    public final int hashCode() {
        return this.f27743b.hashCode() + (this.f27742a.hashCode() * 31);
    }

    public final String toString() {
        return "NetworkLevelChangeEvent(oldNetworkLevel=" + this.f27742a + ", newNetworkLevel=" + this.f27743b + ")";
    }
}
