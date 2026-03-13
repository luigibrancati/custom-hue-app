package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class A2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f29993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29994b;

    public A2(Object obj, int i10) {
        this.f29993a = obj;
        this.f29994b = i10;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof A2)) {
            return false;
        }
        A2 a22 = (A2) obj;
        return this.f29993a == a22.f29993a && this.f29994b == a22.f29994b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f29993a) * 65535) + this.f29994b;
    }
}
