package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.y0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3489y0 extends AbstractC3494z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29971a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29972b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ G0 f29973c;

    public C3489y0(G0 g02) {
        this.f29973c = g02;
        this.f29972b = g02.f();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29971a < this.f29972b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0
    public final byte zza() {
        int i10 = this.f29971a;
        if (i10 >= this.f29972b) {
            throw new NoSuchElementException();
        }
        this.f29971a = i10 + 1;
        return this.f29973c.d(i10);
    }
}
