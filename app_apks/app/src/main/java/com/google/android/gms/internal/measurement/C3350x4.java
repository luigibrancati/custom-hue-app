package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.x4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3350x4 extends AbstractC3358y4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E4 f29725c;

    public C3350x4(E4 e42) {
        Objects.requireNonNull(e42);
        this.f29725c = e42;
        this.f29723a = 0;
        this.f29724b = e42.e();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29723a < this.f29724b;
    }

    @Override // com.google.android.gms.internal.measurement.A4
    public final byte zza() {
        int i10 = this.f29723a;
        if (i10 >= this.f29724b) {
            throw new NoSuchElementException();
        }
        this.f29723a = i10 + 1;
        return this.f29725c.d(i10);
    }
}
