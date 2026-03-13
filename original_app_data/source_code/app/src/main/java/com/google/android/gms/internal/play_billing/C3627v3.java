package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.v3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3627v3 implements InterfaceC3550i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3568l3 f30258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f30259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f30260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f30261d;

    public C3627v3(InterfaceC3568l3 interfaceC3568l3, String str, Object[] objArr) {
        this.f30258a = interfaceC3568l3;
        this.f30259b = str;
        this.f30260c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f30261d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 1;
        int i12 = 13;
        while (true) {
            int i13 = i11 + 1;
            char cCharAt2 = str.charAt(i11);
            if (cCharAt2 < 55296) {
                this.f30261d = i10 | (cCharAt2 << i12);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i12;
                i12 += 13;
                i11 = i13;
            }
        }
    }

    public final String a() {
        return this.f30259b;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3550i3
    public final int b() {
        int i10 = this.f30261d;
        if ((i10 & 1) != 0) {
            return 1;
        }
        return (i10 & 4) == 4 ? 3 : 2;
    }

    public final Object[] c() {
        return this.f30260c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3550i3
    public final InterfaceC3568l3 zza() {
        return this.f30258a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3550i3
    public final boolean zzb() {
        return (this.f30261d & 2) == 2;
    }
}
