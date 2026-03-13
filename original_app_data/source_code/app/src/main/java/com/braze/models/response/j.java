package com.braze.models.response;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28148b;

    public j(int i10, int i11) {
        this.f28147a = i10;
        this.f28148b = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f28147a == jVar.f28147a && this.f28148b == jVar.f28148b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f28148b) + (Integer.hashCode(this.f28147a) * 31);
    }

    public final String toString() {
        return "RateLimitEndpointConfig(capacity=" + this.f28147a + ", refillRate=" + this.f28148b + ")";
    }
}
