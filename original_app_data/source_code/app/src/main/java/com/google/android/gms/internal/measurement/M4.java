package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29271b;

    public M4(Object obj, int i10) {
        this.f29270a = obj;
        this.f29271b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof M4)) {
            return false;
        }
        M4 m42 = (M4) obj;
        return this.f29270a == m42.f29270a && this.f29271b == m42.f29271b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f29270a) * 65535) + this.f29271b;
    }
}
