package u8;

import u8.N;

/* JADX INFO: renamed from: u8.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class C5986c extends N.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f45326c;

    public C5986c(String str, String str2, String str3) {
        if (str == null) {
            throw new NullPointerException("Null crashlyticsInstallId");
        }
        this.f45324a = str;
        this.f45325b = str2;
        this.f45326c = str3;
    }

    @Override // u8.N.a
    public String c() {
        return this.f45324a;
    }

    @Override // u8.N.a
    public String d() {
        return this.f45326c;
    }

    @Override // u8.N.a
    public String e() {
        return this.f45325b;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof N.a) {
            N.a aVar = (N.a) obj;
            if (this.f45324a.equals(aVar.c()) && ((str = this.f45325b) != null ? str.equals(aVar.e()) : aVar.e() == null) && ((str2 = this.f45326c) != null ? str2.equals(aVar.d()) : aVar.d() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f45324a.hashCode() ^ 1000003) * 1000003;
        String str = this.f45325b;
        int iHashCode2 = (iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f45326c;
        return iHashCode2 ^ (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "InstallIds{crashlyticsInstallId=" + this.f45324a + ", firebaseInstallationId=" + this.f45325b + ", firebaseAuthenticationToken=" + this.f45326c + "}";
    }
}
