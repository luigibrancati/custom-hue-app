package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3606s0 extends P0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f30241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30242b;

    public C3606s0(Object obj) {
        this.f30241a = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f30242b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f30242b) {
            throw new NoSuchElementException();
        }
        this.f30242b = true;
        return this.f30241a;
    }
}
