package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class U0 extends T0 {
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.T0
    public final void a(Object obj) {
        ((AbstractC3391e1) obj).zzb.g();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.T0
    public final void b(F2 f22, Map.Entry entry) {
        C3396f1 c3396f1 = (C3396f1) entry.getKey();
        D2 d22 = D2.zza;
        switch (c3396f1.f29851b.ordinal()) {
            case 0:
                f22.b(c3396f1.f29850a, ((Double) entry.getValue()).doubleValue());
                break;
            case 1:
                f22.B(c3396f1.f29850a, ((Float) entry.getValue()).floatValue());
                break;
            case 2:
                f22.m(c3396f1.f29850a, ((Long) entry.getValue()).longValue());
                break;
            case 3:
                f22.H(c3396f1.f29850a, ((Long) entry.getValue()).longValue());
                break;
            case 4:
                f22.p(c3396f1.f29850a, ((Integer) entry.getValue()).intValue());
                break;
            case 5:
                f22.F(c3396f1.f29850a, ((Long) entry.getValue()).longValue());
                break;
            case 6:
                f22.e(c3396f1.f29850a, ((Integer) entry.getValue()).intValue());
                break;
            case 7:
                f22.l(c3396f1.f29850a, ((Boolean) entry.getValue()).booleanValue());
                break;
            case 8:
                f22.k(c3396f1.f29850a, (String) entry.getValue());
                break;
            case 9:
                f22.K(c3396f1.f29850a, entry.getValue(), R1.a().b(entry.getValue().getClass()));
                break;
            case 10:
                f22.I(c3396f1.f29850a, entry.getValue(), R1.a().b(entry.getValue().getClass()));
                break;
            case 11:
                f22.J(c3396f1.f29850a, (G0) entry.getValue());
                break;
            case 12:
                f22.x(c3396f1.f29850a, ((Integer) entry.getValue()).intValue());
                break;
            case 13:
                f22.p(c3396f1.f29850a, ((Integer) entry.getValue()).intValue());
                break;
            case 14:
                f22.s(c3396f1.f29850a, ((Integer) entry.getValue()).intValue());
                break;
            case 15:
                f22.z(c3396f1.f29850a, ((Long) entry.getValue()).longValue());
                break;
            case 16:
                f22.u(c3396f1.f29850a, ((Integer) entry.getValue()).intValue());
                break;
            case 17:
                f22.q(c3396f1.f29850a, ((Long) entry.getValue()).longValue());
                break;
        }
    }
}
