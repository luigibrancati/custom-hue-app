package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3547i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f30181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f30182c;

    public C3547i0(Object obj, Object obj2, Object obj3) {
        this.f30180a = obj;
        this.f30181b = obj2;
        this.f30182c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f30182c;
        Object obj2 = this.f30181b;
        Object obj3 = this.f30180a;
        return new IllegalArgumentException("Multiple entries with same key: " + String.valueOf(obj3) + "=" + String.valueOf(obj2) + " and " + String.valueOf(obj3) + "=" + String.valueOf(obj));
    }
}
