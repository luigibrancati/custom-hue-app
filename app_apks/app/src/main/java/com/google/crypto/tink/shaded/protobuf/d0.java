package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 implements O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f31438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f31439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f31440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f31441d;

    public d0(Q q10, String str, Object[] objArr) {
        this.f31438a = q10;
        this.f31439b = str;
        this.f31440c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f31441d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f31441d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public boolean a() {
        return (this.f31441d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public Q b() {
        return this.f31438a;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.O
    public a0 c() {
        int i10 = this.f31441d;
        return (i10 & 1) != 0 ? a0.PROTO2 : (i10 & 4) == 4 ? a0.EDITIONS : a0.PROTO3;
    }

    public Object[] d() {
        return this.f31440c;
    }

    public String e() {
        return this.f31439b;
    }
}
