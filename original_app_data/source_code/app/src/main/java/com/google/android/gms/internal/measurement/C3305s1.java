package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3305s1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3345x f29599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T1 f29600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T1 f29601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3341w3 f29602d;

    public C3305s1() {
        C3345x c3345x = new C3345x();
        this.f29599a = c3345x;
        T1 t12 = new T1(null, c3345x);
        this.f29601c = t12;
        this.f29600b = t12.c();
        C3341w3 c3341w3 = new C3341w3();
        this.f29602d = c3341w3;
        t12.e("require", new Q7(c3341w3));
        c3341w3.a("internal.platform", new Callable() { // from class: com.google.android.gms.internal.measurement.X0
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return new S7();
            }
        });
        t12.e("runtime.counter", new C3214i(Double.valueOf(0.0d)));
    }

    public final InterfaceC3277p a(T1 t12, B3... b3Arr) {
        InterfaceC3277p interfaceC3277pB = InterfaceC3277p.f29567U;
        for (B3 b32 : b3Arr) {
            interfaceC3277pB = V2.b(b32);
            AbstractC3324u2.l(this.f29601c);
            if ((interfaceC3277pB instanceof C3286q) || (interfaceC3277pB instanceof C3268o)) {
                interfaceC3277pB = this.f29599a.b(t12, interfaceC3277pB);
            }
        }
        return interfaceC3277pB;
    }
}
