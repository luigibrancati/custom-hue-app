package com.google.android.gms.internal.measurement;

import sun.misc.Unsafe;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c6, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3167c6 extends AbstractC3185e6 {
    public C3167c6(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final void a(Object obj, long j10, byte b10) {
        if (AbstractC3194f6.f29469h) {
            AbstractC3194f6.d(obj, j10, b10);
        } else {
            AbstractC3194f6.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final boolean b(Object obj, long j10) {
        return AbstractC3194f6.f29469h ? AbstractC3194f6.z(obj, j10) : AbstractC3194f6.A(obj, j10);
    }

    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.f6.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Failed to inline method: com.google.android.gms.internal.measurement.f6.C(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z10' boolean)' in method call: com.google.android.gms.internal.measurement.f6.B(java.lang.Object, long, boolean):void */
    /* JADX WARN: Unknown register number '(r4v0 'z10' boolean)' in method call: com.google.android.gms.internal.measurement.f6.C(java.lang.Object, long, boolean):void */
    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final void c(Object obj, long j10, boolean z10) {
        if (AbstractC3194f6.f29469h) {
            AbstractC3194f6.B(obj, j10, z10);
        } else {
            AbstractC3194f6.C(obj, j10, z10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final float d(Object obj, long j10) {
        return Float.intBitsToFloat(this.f29452a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final void e(Object obj, long j10, float f10) {
        this.f29452a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final double f(Object obj, long j10) {
        return Double.longBitsToDouble(this.f29452a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3185e6
    public final void g(Object obj, long j10, double d10) {
        this.f29452a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }
}
