package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F4 extends G4 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f29179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f29180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f29181d;

    public /* synthetic */ F4(byte[] bArr, int i10, int i11, boolean z10, byte[] bArr2) {
        super(null);
        this.f29181d = Integer.MAX_VALUE;
        this.f29179b = 0;
    }

    public final int c(int i10) {
        int i11 = this.f29181d;
        this.f29181d = 0;
        int i12 = this.f29179b + this.f29180c;
        this.f29179b = i12;
        if (i12 <= 0) {
            this.f29180c = 0;
            return i11;
        }
        this.f29180c = i12;
        this.f29179b = 0;
        return i11;
    }
}
