package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3309s5 implements A5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5[] f29605a;

    public C3309s5(A5... a5Arr) {
        this.f29605a = a5Arr;
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f29605a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.A5
    public final InterfaceC3367z5 b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            A5 a52 = this.f29605a[i10];
            if (a52.a(cls)) {
                return a52.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
