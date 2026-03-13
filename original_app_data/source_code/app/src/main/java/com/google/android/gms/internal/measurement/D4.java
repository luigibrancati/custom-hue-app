package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class D4 extends C4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f29159c;

    public D4(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f29159c = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public byte c(int i10) {
        return this.f29159c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public byte d(int i10) {
        return this.f29159c[i10];
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public int e() {
        return this.f29159c.length;
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof E4) || e() != ((E4) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof D4)) {
            return obj.equals(this);
        }
        D4 d42 = (D4) obj;
        int iN = n();
        int iN2 = d42.n();
        if (iN != 0 && iN2 != 0 && iN != iN2) {
            return false;
        }
        int iE = e();
        if (iE > d42.e()) {
            int iE2 = e();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iE).length() + 18 + String.valueOf(iE2).length());
            sb2.append("Length too large: ");
            sb2.append(iE);
            sb2.append(iE2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iE > d42.e()) {
            int iE3 = d42.e();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iE).length() + 27 + String.valueOf(iE3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iE);
            sb3.append(", ");
            sb3.append(iE3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.f29159c;
        byte[] bArr2 = d42.f29159c;
        d42.r();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iE) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final E4 f(int i10, int i11) {
        int iP = E4.p(0, i11, e());
        return iP == 0 ? E4.f29169b : new C3366z4(this.f29159c, 0, iP);
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final void h(C3334v4 c3334v4) {
        ((H4) c3334v4).H(this.f29159c, 0, e());
    }

    @Override // com.google.android.gms.internal.measurement.E4
    public final int k(int i10, int i11, int i12) {
        return AbstractC3211h5.c(i10, this.f29159c, 0, i12);
    }

    public int r() {
        return 0;
    }
}
