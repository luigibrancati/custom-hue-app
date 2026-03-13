package com.google.android.gms.internal.measurement;

import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3318t5 implements O5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final A5 f29615b = new C3300r5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A5 f29616a;

    public C3318t5() {
        W4 w4C = W4.c();
        K5 k52 = K5.f29253c;
        C3309s5 c3309s5 = new C3309s5(w4C, f29615b);
        Charset charset = AbstractC3211h5.f29486a;
        this.f29616a = c3309s5;
    }

    @Override // com.google.android.gms.internal.measurement.O5
    public final N5 a(Class cls) {
        Y5 y52 = P5.f29313a;
        if (!AbstractC3148a5.class.isAssignableFrom(cls)) {
            K5 k52 = K5.f29253c;
        }
        InterfaceC3367z5 interfaceC3367z5B = this.f29616a.b(cls);
        if (interfaceC3367z5B.zza()) {
            K5 k53 = K5.f29253c;
            return G5.i(P5.a(), Q4.a(), interfaceC3367z5B.zzb());
        }
        K5 k54 = K5.f29253c;
        return F5.A(cls, interfaceC3367z5B, I5.a(), AbstractC3274o5.a(), P5.a(), interfaceC3367z5B.b() + (-1) != 1 ? Q4.a() : null, AbstractC3359y5.a());
    }
}
