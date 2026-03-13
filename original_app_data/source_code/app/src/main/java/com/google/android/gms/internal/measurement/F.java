package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class F implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T1 f29174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29175b;

    public F(T1 t12, String str) {
        this.f29174a = t12;
        this.f29175b = str;
    }

    @Override // com.google.android.gms.internal.measurement.G
    public final T1 a(InterfaceC3277p interfaceC3277p) {
        T1 t1C = this.f29174a.c();
        t1C.f(this.f29175b, interfaceC3277p);
        return t1C;
    }
}
