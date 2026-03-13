package com.google.android.gms.internal.measurement;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3214i implements InterfaceC3277p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Double f29490a;

    public C3214i(Double d10) {
        if (d10 == null) {
            this.f29490a = Double.valueOf(Double.NaN);
        } else {
            this.f29490a = d10;
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        Double d10 = this.f29490a;
        if (Double.isNaN(d10.doubleValue())) {
            return "NaN";
        }
        if (Double.isInfinite(d10.doubleValue())) {
            return d10.doubleValue() > 0.0d ? "Infinity" : "-Infinity";
        }
        BigDecimal bigDecimalStripTrailingZeros = BigDecimal.valueOf(d10.doubleValue()).stripTrailingZeros();
        DecimalFormat decimalFormat = new DecimalFormat("0E0");
        decimalFormat.setRoundingMode(RoundingMode.HALF_UP);
        decimalFormat.setMinimumFractionDigits((bigDecimalStripTrailingZeros.scale() > 0 ? bigDecimalStripTrailingZeros.precision() : bigDecimalStripTrailingZeros.scale()) - 1);
        String str = decimalFormat.format(bigDecimalStripTrailingZeros);
        int iIndexOf = str.indexOf("E");
        if (iIndexOf <= 0) {
            return str;
        }
        int i10 = Integer.parseInt(str.substring(iIndexOf + 1));
        return ((i10 >= 0 || i10 <= -7) && (i10 < 0 || i10 >= 21)) ? str.replace("E-", "e-").replace("E", "e+") : bigDecimalStripTrailingZeros.toPlainString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        return this.f29490a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        Double d10 = this.f29490a;
        boolean z10 = false;
        if (!Double.isNaN(d10.doubleValue()) && d10.doubleValue() != 0.0d) {
            z10 = true;
        }
        return Boolean.valueOf(z10);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3214i) {
            return this.f29490a.equals(((C3214i) obj).f29490a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f29490a.hashCode();
    }

    public final String toString() {
        return b();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return new C3214i(this.f29490a);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p z(String str, T1 t12, List list) {
        if ("toString".equals(str)) {
            return new C3312t(b());
        }
        throw new IllegalArgumentException(String.format("%s.%s is not a function.", b(), str));
    }
}
