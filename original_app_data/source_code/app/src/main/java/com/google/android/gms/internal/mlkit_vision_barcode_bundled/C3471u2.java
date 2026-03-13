package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.u2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3471u2 extends AbstractC3476v2 {
    public C3471u2(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f29952a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f29952a.getInt(obj, j10));
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2.o(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2.n(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z' boolean)' in method call: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w2.o(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC3481w2.f29965h) {
            AbstractC3481w2.n(obj, j10, z10);
        } else {
            AbstractC3481w2.o(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final void d(Object obj, long j10, byte b10) {
        if (AbstractC3481w2.f29965h) {
            AbstractC3481w2.d(obj, j10, b10);
        } else {
            AbstractC3481w2.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final void e(Object obj, long j10, double d10) {
        this.f29952a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final void f(Object obj, long j10, float f10) {
        this.f29952a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC3476v2
    public final boolean g(Object obj, long j10) {
        return AbstractC3481w2.f29965h ? AbstractC3481w2.y(obj, j10) : AbstractC3481w2.z(obj, j10);
    }
}
