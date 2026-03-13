package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class N1 implements InterfaceC3382c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J1 f29779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC3447p2 f29780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final T0 f29782d;

    public N1(AbstractC3447p2 abstractC3447p2, T0 t02, J1 j12) {
        this.f29780b = abstractC3447p2;
        this.f29781c = j12 instanceof AbstractC3391e1;
        this.f29782d = t02;
        this.f29779a = j12;
    }

    public static N1 j(AbstractC3447p2 abstractC3447p2, T0 t02, J1 j12) {
        return new N1(abstractC3447p2, t02, j12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final int a(Object obj) {
        int iHashCode = ((AbstractC3406h1) obj).zzc.hashCode();
        return this.f29781c ? (iHashCode * 53) + ((AbstractC3391e1) obj).zzb.f29821a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final boolean b(Object obj) {
        return ((AbstractC3391e1) obj).zzb.k();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final void c(Object obj) {
        this.f29780b.a(obj);
        this.f29782d.a(obj);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final Object d() {
        J1 j12 = this.f29779a;
        return j12 instanceof AbstractC3406h1 ? ((AbstractC3406h1) j12).m() : j12.s().h();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final int e(Object obj) {
        int iB = ((AbstractC3406h1) obj).zzc.b();
        return this.f29781c ? iB + ((AbstractC3391e1) obj).zzb.b() : iB;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final void f(Object obj, Object obj2) {
        AbstractC3392e2.u(this.f29780b, obj, obj2);
        if (this.f29781c) {
            AbstractC3392e2.t(this.f29782d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final boolean g(Object obj, Object obj2) {
        if (!((AbstractC3406h1) obj).zzc.equals(((AbstractC3406h1) obj2).zzc)) {
            return false;
        }
        if (this.f29781c) {
            return ((AbstractC3391e1) obj).zzb.equals(((AbstractC3391e1) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    public final void h(Object obj, F2 f22) {
        Iterator itF = ((AbstractC3391e1) obj).zzb.f();
        while (itF.hasNext()) {
            Map.Entry entry = (Map.Entry) itF.next();
            W0 w02 = (W0) entry.getKey();
            if (w02.d() != E2.MESSAGE) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            w02.i();
            w02.e();
            if (entry instanceof AbstractC3465t1) {
                w02.zza();
                ((AbstractC3465t1) entry).a();
                throw null;
            }
            f22.D(w02.zza(), entry.getValue());
        }
        ((AbstractC3406h1) obj).zzc.k(f22);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8 A[EDGE_INSN: B:61:0x00b8->B:33:0x00b8 BREAK  A[LOOP:1: B:17:0x0064->B:64:0x0064], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.InterfaceC3382c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(java.lang.Object r11, byte[] r12, int r13, int r14, com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3474v0 r15) throws com.google.android.gms.internal.mlkit_vision_barcode_bundled.C3455r1 {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_barcode_bundled.N1.i(java.lang.Object, byte[], int, int, com.google.android.gms.internal.mlkit_vision_barcode_bundled.v0):void");
    }
}
