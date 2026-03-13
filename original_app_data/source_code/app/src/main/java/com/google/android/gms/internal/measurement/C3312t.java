package com.google.android.gms.internal.measurement;

import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C3312t implements Iterable, InterfaceC3277p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f29607a;

    public C3312t(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.f29607a = str;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final String b() {
        return this.f29607a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Double c() {
        String str = this.f29607a;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Boolean d() {
        return Boolean.valueOf(!this.f29607a.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final Iterator e() {
        return new r(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3312t) {
            return this.f29607a.equals(((C3312t) obj).f29607a);
        }
        return false;
    }

    public final /* synthetic */ String f() {
        return this.f29607a;
    }

    public final int hashCode() {
        return this.f29607a.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3303s(this);
    }

    public final String toString() {
        String str = this.f29607a;
        StringBuilder sb2 = new StringBuilder(str.length() + 2);
        sb2.append("\"");
        sb2.append(str);
        sb2.append("\"");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    public final InterfaceC3277p y() {
        return new C3312t(this.f29607a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d6 A[PHI: r10
      0x02d6: PHI (r10v6 boolean) = (r10v12 boolean), (r10v13 boolean), (r10v16 boolean) binds: [B:100:0x02c2, B:101:0x02c4, B:103:0x02d4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02e0 A[LOOP:0: B:108:0x02de->B:109:0x02e0, LOOP_END] */
    @Override // com.google.android.gms.internal.measurement.InterfaceC3277p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.internal.measurement.InterfaceC3277p z(java.lang.String r26, com.google.android.gms.internal.measurement.T1 r27, java.util.List r28) {
        /*
            Method dump skipped, instruction units count: 1606
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.C3312t.z(java.lang.String, com.google.android.gms.internal.measurement.T1, java.util.List):com.google.android.gms.internal.measurement.p");
    }
}
