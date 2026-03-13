package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3178e implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29444a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3187f f29445b;

    public C3178e(C3187f c3187f) {
        Objects.requireNonNull(c3187f);
        this.f29445b = c3187f;
        this.f29444a = 0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29444a < this.f29445b.s();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        C3187f c3187f = this.f29445b;
        if (this.f29444a < c3187f.s()) {
            int i10 = this.f29444a;
            this.f29444a = i10 + 1;
            return c3187f.v(i10);
        }
        int i11 = this.f29444a;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 21);
        sb2.append("Out of bounds index: ");
        sb2.append(i11);
        throw new NoSuchElementException(sb2.toString());
    }
}
