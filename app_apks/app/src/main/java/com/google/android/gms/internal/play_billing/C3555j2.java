package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.j2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3555j2 extends AbstractC3561k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30186a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC3597q2 f30188c;

    public C3555j2(AbstractC3597q2 abstractC3597q2) {
        this.f30188c = abstractC3597q2;
        this.f30187b = abstractC3597q2.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30186a < this.f30187b;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3573m2
    public final byte zza() {
        int i10 = this.f30186a;
        if (i10 >= this.f30187b) {
            throw new NoSuchElementException();
        }
        this.f30186a = i10 + 1;
        return this.f30188c.d(i10);
    }
}
