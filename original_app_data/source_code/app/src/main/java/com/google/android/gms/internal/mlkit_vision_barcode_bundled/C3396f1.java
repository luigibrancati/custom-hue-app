package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.f1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3396f1 implements W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final D2 f29851b;

    public C3396f1(InterfaceC3421k1 interfaceC3421k1, int i10, D2 d22, boolean z10, boolean z11) {
        this.f29850a = i10;
        this.f29851b = d22;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final D2 c() {
        return this.f29851b;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return this.f29850a - ((C3396f1) obj).f29850a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final E2 d() {
        return this.f29851b.a();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final boolean e() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final boolean i() {
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final I1 r(I1 i12, J1 j12) {
        AbstractC3381c1 abstractC3381c1 = (AbstractC3381c1) i12;
        abstractC3381c1.m((AbstractC3406h1) j12);
        return abstractC3381c1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final O1 t(O1 o12, O1 o13) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.W0
    public final int zza() {
        return this.f29850a;
    }
}
