package com.braze.events.internal;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27744a;

    public p(long j10) {
        this.f27744a = j10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f27744a == ((p) obj).f27744a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f27744a);
    }

    public final String toString() {
        return "PushMaxRequestSuccessEvent(lastUpdateTime=" + this.f27744a + ")";
    }
}
