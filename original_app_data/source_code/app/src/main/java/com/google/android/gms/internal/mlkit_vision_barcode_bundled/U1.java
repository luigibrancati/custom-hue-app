package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U1 extends AbstractC3494z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Z1 f29813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0 f29814b = a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3377b2 f29815c;

    public U1(C3377b2 c3377b2) {
        this.f29815c = c3377b2;
        this.f29813a = new Z1(c3377b2, null);
    }

    public final C0 a() {
        Z1 z12 = this.f29813a;
        if (z12.hasNext()) {
            return z12.next().iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29814b != null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.C0
    public final byte zza() {
        C0 c02 = this.f29814b;
        if (c02 == null) {
            throw new NoSuchElementException();
        }
        byte bZza = c02.zza();
        if (!this.f29814b.hasNext()) {
            this.f29814b = a();
        }
        return bZza;
    }
}
