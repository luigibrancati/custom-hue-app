package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C1 implements InterfaceC3387d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final H1 f29742b = new A1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H1 f29743a;

    public C1() {
        C3376b1 c3376b1C = C3376b1.c();
        R1 r12 = R1.f29797c;
        B1 b12 = new B1(c3376b1C, f29742b);
        Charset charset = AbstractC3446p1.f29896a;
        this.f29743a = b12;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3387d2
    public final InterfaceC3382c2 a(Class cls) {
        AbstractC3447p2 abstractC3447p2 = AbstractC3392e2.f29848a;
        if (!AbstractC3406h1.class.isAssignableFrom(cls)) {
            R1 r12 = R1.f29797c;
        }
        G1 g1A = this.f29743a.a(cls);
        if (g1A.zzb()) {
            R1 r13 = R1.f29797c;
            return N1.j(AbstractC3392e2.r(), V0.a(), g1A.zza());
        }
        R1 r14 = R1.f29797c;
        return M1.A(cls, g1A, Q1.a(), AbstractC3495z1.a(), AbstractC3392e2.r(), g1A.b() + (-1) != 1 ? V0.a() : null, F1.a());
    }
}
