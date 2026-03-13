package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements InterfaceC3713e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3717g0 f32338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f32339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f32340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f32341d;

    public y0(InterfaceC3717g0 interfaceC3717g0, String str, Object[] objArr) {
        this.f32338a = interfaceC3717g0;
        this.f32339b = str;
        this.f32340c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f32341d = cCharAt;
            return;
        }
        int i10 = cCharAt & 8191;
        int i11 = 13;
        int i12 = 1;
        while (true) {
            int i13 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f32341d = i10 | (cCharAt2 << i11);
                return;
            } else {
                i10 |= (cCharAt2 & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
        }
    }

    @Override // com.google.protobuf.InterfaceC3713e0
    public boolean a() {
        return (this.f32341d & 2) == 2;
    }

    @Override // com.google.protobuf.InterfaceC3713e0
    public InterfaceC3717g0 b() {
        return this.f32338a;
    }

    @Override // com.google.protobuf.InterfaceC3713e0
    public v0 c() {
        int i10 = this.f32341d;
        return (i10 & 1) != 0 ? v0.PROTO2 : (i10 & 4) == 4 ? v0.EDITIONS : v0.PROTO3;
    }

    public Object[] d() {
        return this.f32340c;
    }

    public String e() {
        return this.f32339b;
    }
}
