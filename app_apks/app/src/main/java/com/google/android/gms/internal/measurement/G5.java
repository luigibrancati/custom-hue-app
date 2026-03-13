package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class G5 implements N5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5 f29204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Y5 f29205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f29206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O4 f29207d;

    public G5(Y5 y52, O4 o42, C5 c52) {
        this.f29205b = y52;
        this.f29206c = c52 instanceof Y4;
        this.f29207d = o42;
        this.f29204a = c52;
    }

    public static G5 i(Y5 y52, O4 o42, C5 c52) {
        return new G5(y52, o42, c52);
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final int a(Object obj) {
        int iH = ((AbstractC3148a5) obj).zzc.h();
        return this.f29206c ? iH + ((Y4) obj).zzb.g() : iH;
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final boolean b(Object obj) {
        return ((Y4) obj).zzb.e();
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final int c(Object obj) {
        int iHashCode = ((AbstractC3148a5) obj).zzc.hashCode();
        return this.f29206c ? (iHashCode * 53) + ((Y4) obj).zzb.f29327a.hashCode() : iHashCode;
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final void d(Object obj, Object obj2) {
        P5.d(this.f29205b, obj, obj2);
        if (this.f29206c) {
            P5.c(this.f29207d, obj, obj2);
        }
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final void e(Object obj) {
        this.f29205b.b(obj);
        this.f29207d.a(obj);
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final void f(Object obj, byte[] bArr, int i10, int i11, C3317t4 c3317t4) {
        AbstractC3148a5 abstractC3148a5 = (AbstractC3148a5) obj;
        if (abstractC3148a5.zzc == Z5.a()) {
            abstractC3148a5.zzc = Z5.b();
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final void g(Object obj, InterfaceC3248l6 interfaceC3248l6) {
        Iterator itC = ((Y4) obj).zzb.c();
        if (itC.hasNext()) {
            android.support.v4.media.session.a.a(((Map.Entry) itC.next()).getKey());
            throw null;
        }
        ((AbstractC3148a5) obj).zzc.f(interfaceC3248l6);
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final boolean h(Object obj, Object obj2) {
        if (!((AbstractC3148a5) obj).zzc.equals(((AbstractC3148a5) obj2).zzc)) {
            return false;
        }
        if (this.f29206c) {
            return ((Y4) obj).zzb.equals(((Y4) obj2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.N5
    public final Object zza() {
        C5 c52 = this.f29204a;
        return c52 instanceof AbstractC3148a5 ? ((AbstractC3148a5) c52).m() : c52.i().M0();
    }
}
