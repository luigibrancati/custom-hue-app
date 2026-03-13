package u8;

import kotlin.jvm.internal.AbstractC4862t;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes3.dex */
public final class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f45286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f45287b;

    public L(String str, String str2) {
        this.f45286a = str;
        this.f45287b = str2;
    }

    public final String a() {
        return this.f45287b;
    }

    public final String b() {
        return this.f45286a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof L)) {
            return false;
        }
        L l10 = (L) obj;
        return AbstractC4862t.a(this.f45286a, l10.f45286a) && AbstractC4862t.a(this.f45287b, l10.f45287b);
    }

    public int hashCode() {
        String str = this.f45286a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f45287b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f45286a + ", authToken=" + this.f45287b + ')';
    }
}
