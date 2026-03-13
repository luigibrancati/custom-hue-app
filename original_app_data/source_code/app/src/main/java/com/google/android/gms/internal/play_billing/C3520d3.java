package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3520d3 implements InterfaceC3556j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3556j3[] f30149a;

    public C3520d3(InterfaceC3556j3... interfaceC3556j3Arr) {
        this.f30149a = interfaceC3556j3Arr;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3556j3
    public final InterfaceC3550i3 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            InterfaceC3556j3 interfaceC3556j3 = this.f30149a[i10];
            if (interfaceC3556j3.b(cls)) {
                return interfaceC3556j3.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3556j3
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f30149a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
