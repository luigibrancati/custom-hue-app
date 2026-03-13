package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class M5 implements InterfaceC3367z5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5 f29272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f29274c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29275d;

    public M5(C5 c52, String str, Object[] objArr) {
        this.f29272a = c52;
        this.f29273b = str;
        this.f29274c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f29275d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f29275d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final String a() {
        return this.f29273b;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3367z5
    public final int b() {
        int i10 = this.f29275d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final Object[] c() {
        return this.f29274c;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3367z5
    public final boolean zza() {
        return (this.f29275d & 2) == 2;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3367z5
    public final C5 zzb() {
        return this.f29272a;
    }
}
