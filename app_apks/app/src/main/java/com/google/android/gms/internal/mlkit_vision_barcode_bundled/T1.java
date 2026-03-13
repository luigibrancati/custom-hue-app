package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class T1 implements G1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1 f29808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f29810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29811d;

    public T1(J1 j12, String str, Object[] objArr) {
        this.f29808a = j12;
        this.f29809b = str;
        this.f29810c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f29811d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f29811d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final String a() {
        return this.f29809b;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G1
    public final int b() {
        int i10 = this.f29811d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final Object[] c() {
        return this.f29810c;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G1
    public final J1 zza() {
        return this.f29808a;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.G1
    public final boolean zzb() {
        return (this.f29811d & 2) == 2;
    }
}
