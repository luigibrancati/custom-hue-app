package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.o2, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public class C3585o2 extends AbstractC3579n2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f30204c;

    public C3585o2(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.f30204c = bArr;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public byte c(int i10) {
        return this.f30204c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public byte d(int i10) {
        return this.f30204c[i10];
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public int e() {
        return this.f30204c.length;
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC3597q2) || e() != ((AbstractC3597q2) obj).e()) {
            return false;
        }
        if (e() == 0) {
            return true;
        }
        if (!(obj instanceof C3585o2)) {
            return obj.equals(this);
        }
        C3585o2 c3585o2 = (C3585o2) obj;
        int iN = n();
        int iN2 = c3585o2.n();
        if (iN != 0 && iN2 != 0 && iN != iN2) {
            return false;
        }
        int iE = e();
        if (iE > c3585o2.e()) {
            throw new IllegalArgumentException("Length too large: " + iE + e());
        }
        if (iE > c3585o2.e()) {
            throw new IllegalArgumentException("Ran off end of other: 0, " + iE + ", " + c3585o2.e());
        }
        byte[] bArr = this.f30204c;
        byte[] bArr2 = c3585o2.f30204c;
        c3585o2.r();
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

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final int f(int i10, int i11, int i12) {
        return T2.b(i10, this.f30204c, 0, i12);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final AbstractC3597q2 h(int i10, int i11) {
        int iL = AbstractC3597q2.l(0, i11, e());
        return iL == 0 ? AbstractC3597q2.f30229b : new C3567l2(this.f30204c, 0, iL);
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC3597q2
    public final void k(C3549i2 c3549i2) {
        ((C3620u2) c3549i2).C(this.f30204c, 0, e());
    }

    public int r() {
        return 0;
    }
}
