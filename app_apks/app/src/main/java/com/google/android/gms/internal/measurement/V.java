package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractC3161c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f29363d;

    public /* synthetic */ V(String str, boolean z10, int i10, S s10, T t10, int i11, byte[] bArr) {
        this.f29361b = str;
        this.f29362c = i10;
        this.f29363d = i11;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3161c0
    public final String a() {
        return this.f29361b;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3161c0
    public final boolean b() {
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3161c0
    public final S c() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3161c0
    public final T d() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3161c0
    public final int e() {
        return this.f29362c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC3161c0) {
            AbstractC3161c0 abstractC3161c0 = (AbstractC3161c0) obj;
            if (this.f29361b.equals(abstractC3161c0.a())) {
                abstractC3161c0.b();
                int i10 = this.f29362c;
                int iE = abstractC3161c0.e();
                if (i10 == 0) {
                    throw null;
                }
                if (i10 == iE) {
                    abstractC3161c0.c();
                    abstractC3161c0.d();
                    int i11 = this.f29363d;
                    int iF = abstractC3161c0.f();
                    if (i11 == 0) {
                        throw null;
                    }
                    if (iF == 1) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC3161c0
    public final int f() {
        return this.f29363d;
    }

    public final int hashCode() {
        int iHashCode = this.f29361b.hashCode() ^ 1000003;
        int i10 = this.f29362c;
        if (i10 == 0) {
            throw null;
        }
        int i11 = (((iHashCode * 1000003) ^ 1237) * 1000003) ^ i10;
        if (this.f29363d != 0) {
            return (i11 * 583896283) ^ 1;
        }
        throw null;
    }

    public final String toString() {
        int i10 = this.f29362c;
        String str = i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? "null" : "NO_CHECKS" : "SKIP_SECURITY_CHECK" : "SKIP_COMPLIANCE_CHECK" : "ALL_CHECKS";
        String str2 = this.f29363d == 1 ? "READ_AND_WRITE" : "null";
        String str3 = this.f29361b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 73 + str.length() + 91 + str2.length() + 1);
        sb2.append("FileComplianceOptions{fileOwner=");
        sb2.append(str3);
        sb2.append(", hasDifferentDmaOwner=false, fileChecks=");
        sb2.append(str);
        sb2.append(", dataForwardingNotAllowedResolver=null, multipleProductIdGroupsResolver=null, filePurpose=");
        sb2.append(str2);
        sb2.append("}");
        return sb2.toString();
    }
}
