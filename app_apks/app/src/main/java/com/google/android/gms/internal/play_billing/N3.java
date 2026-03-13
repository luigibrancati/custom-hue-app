package com.google.android.gms.internal.play_billing;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N3 extends O3 {
    public N3(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final double a(Object obj, long j10) {
        return Double.longBitsToDouble(this.f30069a.getLong(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final float b(Object obj, long j10) {
        return Float.intBitsToFloat(this.f30069a.getInt(obj, j10));
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final void c(Object obj, long j10, boolean z10) {
        if (P3.f30081h) {
            P3.d(obj, j10, z10 ? (byte) 1 : (byte) 0);
        } else {
            P3.e(obj, j10, z10 ? (byte) 1 : (byte) 0);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final void d(Object obj, long j10, byte b10) {
        if (P3.f30081h) {
            P3.d(obj, j10, b10);
        } else {
            P3.e(obj, j10, b10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final void e(Object obj, long j10, double d10) {
        this.f30069a.putLong(obj, j10, Double.doubleToLongBits(d10));
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final void f(Object obj, long j10, float f10) {
        this.f30069a.putInt(obj, j10, Float.floatToIntBits(f10));
    }

    @Override // com.google.android.gms.internal.play_billing.O3
    public final boolean g(Object obj, long j10) {
        return P3.f30081h ? P3.y(obj, j10) : P3.z(obj, j10);
    }
}
