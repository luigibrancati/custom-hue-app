package com.google.android.gms.internal.play_billing;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.p3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3592p3 implements InterfaceC3633w3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3568l3 f30222a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I3 f30223b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f30224c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2 f30225d;

    public C3592p3(I3 i32, C2 c22, InterfaceC3568l3 interfaceC3568l3) {
        this.f30223b = i32;
        this.f30224c = interfaceC3568l3 instanceof M2;
        this.f30225d = c22;
        this.f30222a = interfaceC3568l3;
    }

    public static C3592p3 j(I3 i32, C2 c22, InterfaceC3568l3 interfaceC3568l3) {
        return new C3592p3(i32, c22, interfaceC3568l3);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final int a(Object obj) {
        int iHashCode = ((O2) obj).zzc.hashCode();
        return this.f30224c ? (iHashCode * 53) + ((M2) obj).zzb.f30036a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final boolean b(Object obj) {
        return ((M2) obj).zzb.h();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final void c(Object obj) {
        this.f30223b.a(obj);
        this.f30225d.a(obj);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final Object d() {
        InterfaceC3568l3 interfaceC3568l3 = this.f30222a;
        return interfaceC3568l3 instanceof O2 ? ((O2) interfaceC3568l3).r() : interfaceC3568l3.o().f();
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final int e(Object obj) {
        int iB = ((O2) obj).zzc.b();
        return this.f30224c ? iB + ((M2) obj).zzb.c() : iB;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final void f(Object obj, Object obj2) {
        AbstractC3645y3.u(this.f30223b, obj, obj2);
        if (this.f30224c) {
            AbstractC3645y3.t(this.f30225d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final boolean g(Object obj, Object obj2) {
        if (!((O2) obj).zzc.equals(((O2) obj2).zzc)) {
            return false;
        }
        if (this.f30224c) {
            return ((M2) obj).zzb.equals(((M2) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final void h(Object obj, V3 v32) {
        Iterator itE = ((M2) obj).zzb.e();
        if (itE.hasNext()) {
            android.support.v4.media.session.a.a(((Map.Entry) itE.next()).getKey());
            throw null;
        }
        ((O2) obj).zzc.k(v32);
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC3633w3
    public final void i(Object obj, byte[] bArr, int i10, int i11, C3531f2 c3531f2) {
        O2 o22 = (O2) obj;
        if (o22.zzc == J3.c()) {
            o22.zzc = J3.f();
        }
        throw null;
    }
}
