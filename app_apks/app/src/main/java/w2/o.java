package w2;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-866bacc38531af0a81fcd8a9574e1e22709cd7ce6d67b69fe3714c2addafcb5c */
/* JADX INFO: loaded from: classes.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f46136b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f46137c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f46136b = str2;
        this.f46137c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f46121a.equals(oVar.f46121a) && Objects.equals(this.f46136b, oVar.f46136b) && Objects.equals(this.f46137c, oVar.f46137c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f46121a.hashCode()) * 31;
        String str = this.f46136b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f46137c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // w2.i
    public String toString() {
        return this.f46121a + ": url=" + this.f46137c;
    }
}
