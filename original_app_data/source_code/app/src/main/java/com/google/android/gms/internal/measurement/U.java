package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U extends AbstractC3143a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f29349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public byte f29350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29351c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29352d;

    @Override // com.google.android.gms.internal.measurement.AbstractC3143a0
    public final AbstractC3143a0 a(boolean z10) {
        this.f29350b = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3143a0
    public final AbstractC3161c0 b() {
        if (this.f29350b == 1 && this.f29349a != null && this.f29351c != 0 && this.f29352d != 0) {
            return new V(this.f29349a, false, this.f29351c, null, null, this.f29352d, null);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f29349a == null) {
            sb2.append(" fileOwner");
        }
        if (this.f29350b == 0) {
            sb2.append(" hasDifferentDmaOwner");
        }
        if (this.f29351c == 0) {
            sb2.append(" fileChecks");
        }
        if (this.f29352d == 0) {
            sb2.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3143a0
    public final AbstractC3143a0 c(int i10) {
        this.f29351c = i10;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3143a0
    public final AbstractC3143a0 d(int i10) {
        this.f29352d = 1;
        return this;
    }

    public final AbstractC3143a0 e(String str) {
        this.f29349a = "";
        return this;
    }
}
