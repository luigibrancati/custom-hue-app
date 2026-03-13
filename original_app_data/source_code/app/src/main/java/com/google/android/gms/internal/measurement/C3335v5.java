package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3335v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3327u5 f29637a;

    public C3335v5(EnumC3230j6 enumC3230j6, Object obj, EnumC3230j6 enumC3230j62, Object obj2) {
        this.f29637a = new C3327u5(enumC3230j6, "", enumC3230j62, "");
    }

    public static C3335v5 a(EnumC3230j6 enumC3230j6, Object obj, EnumC3230j6 enumC3230j62, Object obj2) {
        return new C3335v5(enumC3230j6, "", enumC3230j62, "");
    }

    public static void b(J4 j42, C3327u5 c3327u5, Object obj, Object obj2) {
        S4.f(j42, c3327u5.f29631a, 1, obj);
        S4.f(j42, c3327u5.f29633c, 2, obj2);
    }

    public static int c(C3327u5 c3327u5, Object obj, Object obj2) {
        return S4.h(c3327u5.f29631a, 1, obj) + S4.h(c3327u5.f29633c, 2, obj2);
    }

    public final int d(int i10, Object obj, Object obj2) {
        C3327u5 c3327u5 = this.f29637a;
        int iG = J4.G(i10 << 3);
        int iC = c(c3327u5, obj, obj2);
        return iG + J4.G(iC) + iC;
    }

    public final C3327u5 e() {
        return this.f29637a;
    }
}
